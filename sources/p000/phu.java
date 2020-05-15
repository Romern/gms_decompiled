package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: phu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phu implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ phv f39141a;

    public phu(phv phv) {
        this.f39141a = phv;
    }

    public void onClick(View view) {
        this.f39141a.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.container, phq.m30341a(false), "PinFragment").commit();
    }
}
