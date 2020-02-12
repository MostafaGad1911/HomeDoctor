package HomeDoctor.Views

interface results_view {
    fun initViews()
    fun initObjects()
    fun observeResults()
    fun observeResultsError()
    fun sendResults()
    fun showLoading()
    fun hideLoading()
}