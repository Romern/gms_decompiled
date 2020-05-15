package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pha implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ phb f39093a;

    public pha(phb phb) {
        this.f39093a = phb;
    }

    public void onClick(View view) {
        this.f39093a.f39096c.mo23108a(bpen.USER_INTERRUPTED_AUDIO_PARING);
        qay.m31785b(this.f39093a.getActivity()).edit().remove("castnearby.optIn").apply();
        phb phb = this.f39093a;
        phb.f39094a.removeCallbacks(phb.f39095b);
        this.f39093a.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.container, phq.m30341a(false), "PinFragment").commit();
    }
}
