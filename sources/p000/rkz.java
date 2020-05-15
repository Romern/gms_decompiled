package p000;

import java.util.Arrays;

/* renamed from: rkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rkz {

    /* renamed from: a */
    private final boolean f43200a = false;

    /* renamed from: b */
    private final int f43201b;

    /* renamed from: c */
    private final rjo f43202c;

    /* renamed from: d */
    private final rjk f43203d;

    private rkz(rjo rjo, rjk rjk) {
        this.f43202c = rjo;
        this.f43203d = rjk;
        this.f43201b = Arrays.hashCode(new Object[]{rjo, rjk});
    }

    /* renamed from: a */
    public static rkz m33905a(rjo rjo, rjk rjk) {
        return new rkz(rjo, rjk);
    }

    /* renamed from: a */
    public final String mo24840a() {
        return this.f43202c.f43149a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rkz) {
            rkz rkz = (rkz) obj;
            boolean z = rkz.f43200a;
            return sdg.m34949a(this.f43202c, rkz.f43202c) && sdg.m34949a(this.f43203d, rkz.f43203d);
        }
    }

    public final int hashCode() {
        return this.f43201b;
    }
}
