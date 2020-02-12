package HomeDoctor.Views

interface register_view {
    fun initViews()
    fun initObjects()
    fun observeURegister()
    fun observeDRegister()
    fun observerError()
    fun fill_spinner()
    fun showLoading()
    fun hideLoading()
}