package p000;

import android.content.Context;
import android.content.Intent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: adaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adaa {

    /* renamed from: a */
    private final Intent f61181a;

    /* renamed from: b */
    private final bmxz f61182b;

    public adaa(Intent intent, bmxz bmxz) {
        this.f61181a = intent;
        this.f61182b = bmxz;
    }

    /* renamed from: a */
    public final bmxv mo33281a(Context context) {
        if (this.f61182b.mo6527a(context)) {
            return context.getPackageManager().resolveService(this.f61181a, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null ? bmxv.m108566b(this.f61181a) : bmvz.f131120a;
        }
        return bmvz.f131120a;
    }
}
