package homedoctor.views

interface login_view {
    fun initViews()
    fun initObjects()
    fun observeULogin()
    fun observeDLogin()
    fun observerError()
    fun fill_spinner()
    fun showLoading()
    fun hideLoading()
}