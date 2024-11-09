```mermaid
flowchart LR

M[Museo]
S[Sala de arte]
PE[Persona entra]
PS[Persona sale]

M -. x10 .-> PE
PE -. ++ cada uno .-> S

M -. x10 .-> PS
PS -. -- cada uno .-> S
```