package p000;

import java.util.Arrays;

/* renamed from: vku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vku {

    /* renamed from: a */
    private final Class f49409a;

    /* renamed from: b */
    private final boolean f49410b;

    /* renamed from: c */
    private final boolean f49411c;

    public vku(Class cls, boolean z, boolean z2) {
        this.f49409a = cls;
        this.f49410b = z;
        this.f49411c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            vku vku = (vku) obj;
            return sdg.m34949a(this.f49409a, vku.f49409a) && this.f49410b == vku.f49410b && this.f49411c == vku.f49411c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49409a, Boolean.valueOf(this.f49410b), Boolean.valueOf(this.f49411c)});
    }
}
