package sealed_class

sealed class ParentSealClass
open class Sub1 : ParentSealClass()
class Sub2 : ParentSealClass()
class Sub3 : ParentSealClass()
object ThisIsSingletonClass : ParentSealClass()