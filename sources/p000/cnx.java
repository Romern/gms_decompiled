package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: cnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnx implements cdo {

    /* renamed from: b */
    private final cdo f7126b;

    public cnx(cdo cdo) {
        crb.m7382a(cdo);
        this.f7126b = cdo;
    }

    /* renamed from: a */
    public final cgj mo3746a(Context context, cgj cgj, int i, int i2) {
        cnu cnu = (cnu) cgj.mo3842b();
        clm clm = new clm(cnu.mo4009b(), cbo.m3902a(context).f6403a);
        cgj a = this.f7126b.mo3746a(context, clm, i, i2);
        if (!clm.equals(a)) {
            clm.mo3844d();
        }
        cdo cdo = this.f7126b;
        cnu.f7116a.f7115a.mo4027a(cdo, (Bitmap) a.mo3842b());
        return cgj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cnx) {
            return this.f7126b.equals(((cnx) obj).f7126b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7126b.hashCode();
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        this.f7126b.mo3732a(messageDigest);
    }
}
