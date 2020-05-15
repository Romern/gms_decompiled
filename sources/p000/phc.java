package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: phc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ phe f39098a;

    public phc(phe phe) {
        this.f39098a = phe;
    }

    public void onClick(View view) {
        qay.m31785b(this.f39098a.getActivity()).edit().putBoolean("castnearby.optIn", false).apply();
        this.f39098a.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.container, phq.m30341a(false), "PinFragment").commit();
    }
}
