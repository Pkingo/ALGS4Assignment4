import sys

def FoursumSearch(input):
    hasFoursum = False
    for i in range(0, N): # i goes through {0,...,N-1}
        for j in range(i + 1, N):
            for o in range(j + 1, N):
                for k in range(o + 1, N):
                    if (vals[i] + vals[j] + vals[o] + vals[k] == 0):
                        hasFoursum = True
                        break
    print("True" if hasFoursum else "False")


N = int(sys.stdin.readline())
vals = map(int, sys.stdin.readlines())
FoursumSearch(vals)
