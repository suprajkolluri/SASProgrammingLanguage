PSTART
MSTART
DCLRI x
STORE x,3
DCLRI y
STORE y,2
GOTO add,x,y
DCLRI z
STORE z,POP()
PRINT "The sum is "
PRINTLN z
GOTO sub,x,y
GOTO sub,5,1
GOTO sub,x,1
GOTO returnfunc
PRINTLN POP()
MEND
FUNC add,a,b
BSTART
DCLRI c
ADD c,a,b
RETURN c
BEND
FEND
FUNC sub,a,b
BSTART
DCLRI c
SUB c,a,b
PRINT "The sub is "
PRINTLN c
BEND
FEND
FUNC returnfunc
BSTART
RETURN "RETURNING"
BEND
FEND
PEND