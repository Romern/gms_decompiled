package p000;

import android.os.Bundle;
import android.os.Vibrator;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.processors.BlurDetectorImpl;

/* renamed from: aktr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktr extends akqe {

    /* renamed from: j */
    private final akur f72776j;

    /* renamed from: k */
    private final aktu f72777k;

    /* renamed from: l */
    private final Vibrator f72778l;

    /* renamed from: m */
    private final BlurDetectorImpl f72779m;

    public aktr(Activity activity, Bundle bundle) {
        super(activity, 1, new akty(), null);
        aktj aktj = new aktj(bundle != null ? bundle.getInt("com.google.android.gms.ocr.RESULT_COUNT", -1) : -1);
        this.f72776j = new akur(aktp.f72774a);
        this.f72777k = new aktu(new akuz(this.f72776j), aktj, new akto(), new aktg(new aktq(activity), this.f72427f, this.f72429h, 0.0f));
        this.f72778l = (Vibrator) activity.getSystemService("vibrator");
        this.f72779m = new BlurDetectorImpl(new akvk(activity));
    }

    /* renamed from: a */
    public final void mo39849a(aktm aktm) {
        super.mo39701a((akpv) aktm);
        aktm.f72757m = this.f72776j;
        aktm.f72756l = this.f72777k;
        aktm.f72758n = this.f72778l;
        aktm.f72759o = this.f72779m;
    }
}
