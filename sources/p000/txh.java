package p000;

import java.util.Arrays;

/* renamed from: txh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txh implements txg {

    /* renamed from: a */
    public final int f46906a;

    /* renamed from: b */
    public final boolean f46907b;

    /* renamed from: c */
    public final int f46908c;

    public txh(int i, boolean z, int i2) {
        this.f46906a = i;
        this.f46907b = z;
        this.f46908c = i2;
    }

    /* renamed from: a */
    public final int mo18217a() {
        return this.f46906a;
    }

    /* renamed from: b */
    public final boolean mo18218b() {
        return this.f46907b;
    }

    /* renamed from: c */
    public final int mo18219c() {
        return this.f46908c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            txh txh = (txh) obj;
            return txh.f46906a == this.f46906a && txh.f46907b == this.f46907b && txh.f46908c == this.f46908c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46906a), Boolean.valueOf(this.f46907b), Integer.valueOf(this.f46908c)});
    }

    public final String toString() {
        return String.format("NetworkPreference: %s, IsRoamingAllowed %s, BatteryUsagePreference %s", Integer.valueOf(this.f46906a), Boolean.valueOf(this.f46907b), Integer.valueOf(this.f46908c));
    }
}
