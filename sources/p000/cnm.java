package p000;

import android.graphics.drawable.Drawable;

/* renamed from: cnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cnm extends cnl {
    private cnm(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static cgj m4594a(Drawable drawable) {
        if (drawable != null) {
            return new cnm(drawable);
        }
        return null;
    }

    /* renamed from: c */
    public final int mo3843c() {
        return Math.max(1, this.f7105a.getIntrinsicWidth() * this.f7105a.getIntrinsicHeight() * 4);
    }

    /* renamed from: d */
    public final void mo3844d() {
    }

    /* renamed from: a */
    public final Class mo3841a() {
        return this.f7105a.getClass();
    }
}
