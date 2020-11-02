import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.trackerlist.HomeFragment
import com.example.trackerlist.ShoppingFragment
import com.example.trackerlist.WorkFragment

@Suppress("DEPRECATION")
internal class Adapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                WorkFragment()
            }
            1 -> {
                HomeFragment()
            }
            2 -> {
                ShoppingFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}