PSTART
MSTART
DCLRI n
STORE n,4
GOTO fact,n
PRINT "The factorial of "
PRINT n
PRINT " is "
PRINT POP()
MEND
FUNC fact,n
IF
EQ $1,n,1
CHECKT $1,22,18
BSTART
RETURN 1
BEND
ELSE
BSTART
SUB $2,n,1
GOTO fact,$2
MUL $3,n,POP()
RETURN $3
BEND
FEND
PEND