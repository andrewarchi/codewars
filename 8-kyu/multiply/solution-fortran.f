module Solution
  implicit none
contains
  function multiply(a, b)
    integer :: a, b, multiply
    multiply = a * b
    return
  end function multiply
end module Solution