package p000;

import android.graphics.Bitmap;

/* renamed from: chg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chg implements che {

    /* renamed from: a */
    int f6854a;

    /* renamed from: b */
    public Bitmap.Config f6855b;

    /* renamed from: c */
    private final chh f6856c;

    public chg(chh chh) {
        this.f6856c = chh;
    }

    /* renamed from: a */
    public final void mo3889a() {
        this.f6856c.mo3876a(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chg) {
            chg chg = (chg) obj;
            return this.f6854a == chg.f6854a && crd.m7395a(this.f6855b, chg.f6855b);
        }
    }

    public final int hashCode() {
        int i = this.f6854a * 31;
        Bitmap.Config config = this.f6855b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return chi.m4271a(this.f6854a, this.f6855b);
    }
}
