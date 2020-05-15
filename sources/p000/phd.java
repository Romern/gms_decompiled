package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: phd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phd implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ phe f39099a;

    public phd(phe phe) {
        this.f39099a = phe;
    }

    public void onClick(View view) {
        qay.m31785b(this.f39099a.getActivity()).edit().putBoolean("castnearby.optIn", true).apply();
        FragmentTransaction beginTransaction = this.f39099a.getActivity().getSupportFragmentManager().beginTransaction();
        phe phe = this.f39099a;
        beginTransaction.replace(C0126R.C0129id.container, phe.f39100a, phe.f39101b).commit();
    }
}
