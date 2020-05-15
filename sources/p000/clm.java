package p000;

import android.graphics.Bitmap;

/* renamed from: clm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class clm implements cgj, cge {

    /* renamed from: a */
    private final Bitmap f7027a;

    /* renamed from: b */
    private final cgt f7028b;

    public clm(Bitmap bitmap, cgt cgt) {
        crb.m7383a(bitmap, "Bitmap must not be null");
        this.f7027a = bitmap;
        crb.m7383a(cgt, "BitmapPool must not be null");
        this.f7028b = cgt;
    }

    /* renamed from: a */
    public static clm m4457a(Bitmap bitmap, cgt cgt) {
        if (bitmap != null) {
            return new clm(bitmap, cgt);
        }
        return null;
    }

    /* renamed from: a */
    public final Class mo3841a() {
        return Bitmap.class;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3842b() {
        return this.f7027a;
    }

    /* renamed from: c */
    public final int mo3843c() {
        return crd.m7389a(this.f7027a);
    }

    /* renamed from: d */
    public final void mo3844d() {
        this.f7028b.mo3881a(this.f7027a);
    }

    /* renamed from: e */
    public final void mo3858e() {
        this.f7027a.prepareToDraw();
    }
}
