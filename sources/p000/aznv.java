package p000;

import android.view.View;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aznv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aznv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aznw f99755a;

    public aznv(aznw aznw) {
        this.f99755a = aznw;
    }

    public void onClick(View view) {
        this.f99755a.f99697d.mo55079b(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, false);
    }
}
