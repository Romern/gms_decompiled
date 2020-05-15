package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DevicePairingFragment$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ahym f80523a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevicePairingFragment$1(ahym ahym, String str) {
        super(str);
        this.f80523a = ahym;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (!"com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE".equals(intent.getAction())) {
            return;
        }
        if ("SUCCESS".equals(intent.getStringExtra("FINISHED_STATE"))) {
            ahym ahym = this.f80523a;
            ahym.f68355b.setVisibility(0);
            if (ahvd.m56713a(ahvd.m56710a(ahym.f68357d.f68399h), ahym.getActivity())) {
                ahym.f68355b.setText(ahym.getString(C0126R.string.fast_pair_setup_device));
            } else {
                ahym.f68355b.setText(ahym.getString(C0126R.string.common_download));
            }
        } else if ("FAIL".equals(intent.getStringExtra("FINISHED_STATE"))) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("DevicePairingFragment: halfsheet show fail connect info");
        } else if ("DISMISS".equals(intent.getStringExtra("FINISHED_STATE"))) {
            srn srn = ahsd.f67925a;
            if (this.f80523a.getActivity() != null) {
                this.f80523a.getActivity().finish();
            }
        }
    }
}
