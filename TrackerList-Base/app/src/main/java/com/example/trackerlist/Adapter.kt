import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.trackerlist.HomeFragment
import com.example.trackerlist.ShoppingFragment
import com.example.trackerlist.WorkFragment
import java.lang.IllegalArgumentException

@Suppress("DEPRECATION")
internal class Adapter(
    fm: FragmentActivity,
    var totalTabs: Int
) :
    FragmentStateAdapter(fm) {
    override fun createFragment(position: Int): Fragment {
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
            else -> throw IllegalArgumentException("How did you find me?")
        }
    }
    override fun getItemCount(): Int {
        return totalTabs
    }
}