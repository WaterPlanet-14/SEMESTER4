;NAME - NISHANT PANIGRAHY
;REGD. NO. - 2141016119
;SECTION - K
;BRANCH - CSE
;OBJECTIVE - LAB 4 (II a) ARRANGE THE ELEMENTS OF A GIVEN 
;            ARRAY OF SIZE N IN ASCENDING ORDER

MOV AX, 0000H
MOV DS, AX
MOV CH, 04H  ;Checks for 04+1 extra number (as we shift it to SI+1)
L1: MOV CL, 04H
MOV SI, 3000H
L2: MOV AL, [SI]
    MOV AH, [SI+1]
    CMP AL, AH
    JC L3
    JZ L3
    MOV [SI], AH
    MOV [SI+1], AL
L3: INC SI
    DEC CL
    JNZ L2
    DEC CH
    JNZ L1
HLT