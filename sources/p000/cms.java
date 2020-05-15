package p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: cms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cms implements cdm {

    /* renamed from: a */
    private final cnn f7083a;

    /* renamed from: b */
    private final cgt f7084b;

    public cms(cnn cnn, cgt cgt) {
        this.f7083a = cnn;
        this.f7084b = cgt;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cgj mo3743a(Object obj, int i, int i2, cdk cdk) {
        cgj a = this.f7083a.mo4000a((Uri) obj);
        if (a == null) {
            return null;
        }
        return cmg.m4521a(this.f7084b, (Drawable) a.mo3842b(), i, i2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3744a(Object obj, cdk cdk) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
