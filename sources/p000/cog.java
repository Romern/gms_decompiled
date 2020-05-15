package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cog implements coi {

    /* renamed from: a */
    private final cgt f7158a;

    /* renamed from: b */
    private final coi f7159b;

    /* renamed from: c */
    private final coi f7160c;

    public cog(cgt cgt, coi coi, coi coi2) {
        this.f7158a = cgt;
        this.f7159b = coi;
        this.f7160c = coi2;
    }

    /* renamed from: a */
    public final cgj mo4032a(cgj cgj, cdk cdk) {
        Drawable drawable = (Drawable) cgj.mo3842b();
        if (drawable instanceof BitmapDrawable) {
            return this.f7159b.mo4032a(clm.m4457a(((BitmapDrawable) drawable).getBitmap(), this.f7158a), cdk);
        }
        if (drawable instanceof cnu) {
            return this.f7160c.mo4032a(cgj, cdk);
        }
        return null;
    }
}
