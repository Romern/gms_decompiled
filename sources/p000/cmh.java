package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: cmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmh implements cdo {

    /* renamed from: b */
    private final cdo f7059b;

    /* renamed from: c */
    private final boolean f7060c;

    public cmh(cdo cdo, boolean z) {
        this.f7059b = cdo;
        this.f7060c = z;
    }

    /* renamed from: a */
    public final cgj mo3746a(Context context, cgj cgj, int i, int i2) {
        cgt cgt = cbo.m3902a(context).f6403a;
        Drawable drawable = (Drawable) cgj.mo3842b();
        cgj a = cmg.m4521a(cgt, drawable, i, i2);
        if (a != null) {
            cgj a2 = this.f7059b.mo3746a(context, a, i, i2);
            if (!a2.equals(a)) {
                return cmo.m4542a(context.getResources(), a2);
            }
            a2.mo3844d();
            return cgj;
        } else if (!this.f7060c) {
            return cgj;
        } else {
            String valueOf = String.valueOf(drawable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unable to convert ");
            sb.append(valueOf);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cmh) {
            return this.f7059b.equals(((cmh) obj).f7059b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7059b.hashCode();
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        this.f7059b.mo3732a(messageDigest);
    }
}
