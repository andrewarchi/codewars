global multiply
section .text
multiply:
  imul edi, esi
  mov eax, edi
  ret