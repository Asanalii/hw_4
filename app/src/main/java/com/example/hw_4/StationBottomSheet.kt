package com.example.hw_4

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.hw_4.databinding.DialogStationBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class StationBottomSheet(private var expanded: Boolean = false,
                         private var name:String = "ChargePoint Station 1",
                         private var address:String="street pulo 25",
                         private var city:String="amesterdam, netherlands",
                         private var ports:String = "8"
    ):BottomSheetDialogFragment() {
    private lateinit var binding: DialogStationBinding

    private lateinit var behavior: BottomSheetBehavior<FrameLayout>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogStationBinding.inflate(inflater,container,false)
        binding.stationTitle.text = name
        binding.stationAddress.text = address
        binding.stationCity.text = city
        binding.stationStatus.text = ports
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val bottomSheet = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        behavior = bottomSheet.behavior

        if(expanded) behavior.state = BottomSheetBehavior.STATE_COLLAPSED

        return bottomSheet
    }
}