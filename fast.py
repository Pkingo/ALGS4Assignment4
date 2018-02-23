import sys

def indexOf(a, key):
    lo = 0
    hi = len(a) - 1
    while (lo <= hi):
        mid = lo + (hi - lo) // 2
        if (key < a[mid]):
            hi = mid - 1
        elif (key > a[mid]):
            lo = mid + 1
        else:
            return mid
    return -1

def FoursumSearchFast(input):
    hasFoursum = False
    input.sort()
    n = len(input)
    count = 0
    for i in range(0, n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if (indexOf(input, -input[i] - input[j] - input[k]) > k):
                    hasFoursum = True
                    break
    print("True" if hasFoursum else "False")


N = int(sys.stdin.readline())
vals = map(int, sys.stdin.readlines())
FoursumSearchFast(vals)
