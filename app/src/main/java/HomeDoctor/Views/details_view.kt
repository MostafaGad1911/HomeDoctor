package homedoctor.views

interface details_view {
    fun initViews()
    fun initObjects()
    fun prepareRecycler()
    fun getDetails()
    fun observeDetails()
    fun observeDetailsError()
    fun showLoading()
    fun hideLoading()
}