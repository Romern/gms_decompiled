package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: cmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmo implements cgj, cge {

    /* renamed from: a */
    private final Resources f7074a;

    /* renamed from: b */
    private final cgj f7075b;

    private cmo(Resources resources, cgj cgj) {
        crb.m7382a(resources);
        this.f7074a = resources;
        crb.m7382a(cgj);
        this.f7075b = cgj;
    }

    /* renamed from: a */
    public static cgj m4542a(Resources resources, cgj cgj) {
        if (cgj != null) {
            return new cmo(resources, cgj);
        }
        return null;
    }

    /* renamed from: a */
    public final Class mo3841a() {
        return BitmapDrawable.class;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3842b() {
        return new BitmapDrawable(this.f7074a, (Bitmap) this.f7075b.mo3842b());
    }

    /* renamed from: c */
    public final int mo3843c() {
        return this.f7075b.mo3843c();
    }

    /* renamed from: d */
    public final void mo3844d() {
        this.f7075b.mo3844d();
    }

    /* renamed from: e */
    public final void mo3858e() {
        cgj cgj = this.f7075b;
        if (cgj instanceof cge) {
            ((cge) cgj).mo3858e();
        }
    }
}
