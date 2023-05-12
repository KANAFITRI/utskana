package com.example.mdimasuts


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SuperheroAdapter
    private lateinit var dataList: ArrayList<Data>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Inisialisasi ArrayList
        dataList = ArrayList()

        // Menambahkan data ke dalam ArrayList
        dataList.add(Data("BMW", R.drawable.bmw, "BMW E30 adalah generasi kedua dari sedan seri 3 BMW"))
        dataList.add(Data("Buggati", R.drawable.bugati,"Buggati Chiron memiliki kecepatan maksimal 490.5km/h"))
        dataList.add(Data("Ferrari", R.drawable.ferrari,"Ferrari F45 dibekali mesin V8 4.5 L berkapasitas 4.497 cc"))
        dataList.add(Data("Lamborghini", R.drawable.lambo, "Lamborghini Aventador adalah salah satu merk mobil supercar"))
        dataList.add(Data("MercedesBenz", R.drawable.mercedes,"Mercedes Benz G63 memiliki Akselerasi dari 0-100 km/jam hanya membutuhkan 4,5 detik"))
        dataList.add(Data("Toyota", R.drawable.supra,"Toyota Supra generasi keempat dibekali dengan mesin non turbo berkode 2JZGTE memiliki kapasitas 3.000cc DOHC 24 Valve 6 silinder segaris"))
        dataList.add(Data("Jeep", R.drawable.rubicon,"Pajak RUBICON sangat mahal, pembelian pertama di tahun 2023 mencapai Rp 228,49 Juta"))
        dataList.add(Data("Porsche", R.drawable.porche,"Porsche 911 GT3 dibandrol dengan harga Rp 3,72 Milyar"))
        dataList.add(Data("Nissan", R.drawable.nissan,"Nissan R34 GTR merupakan mobil yang banyak dicari pecinta JDM"))
        dataList.add(Data("Tesla", R.drawable.tesla,"Kapasitas baterai Tesla Model 3 memiliki 54kwh, yang sanggup menempuh jarak sejauh 422km"))


        // Menambahkan adapter ke RecyclerView
        adapter = SuperheroAdapter(dataList)
        recyclerView.adapter = adapter

        return view
    }
    companion object{
        val INTENT_PARCELABLE = "OBJECK INTENT"
    }
}
