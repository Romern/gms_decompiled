package p000;

import java.util.Arrays;

/* renamed from: bhzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzl {

    /* renamed from: a */
    public final double f119959a;

    /* renamed from: b */
    public final double f119960b;

    /* renamed from: c */
    public final float f119961c;

    private bhzl(double d, double d2, float f) {
        this.f119959a = d;
        this.f119960b = d2;
        this.f119961c = f;
    }

    /* renamed from: a */
    public static bhzl m101798a(double d, double d2, float f) {
        return new bhzl(d, d2, f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhzl) {
            bhzl bhzl = (bhzl) obj;
            return this.f119959a == bhzl.f119959a && this.f119960b == bhzl.f119960b && this.f119961c == bhzl.f119961c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f119959a), Double.valueOf(this.f119960b), Float.valueOf(this.f119961c)});
    }
}
