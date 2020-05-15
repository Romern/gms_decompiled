package p000;

import java.util.Arrays;

/* renamed from: egd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egd {

    /* renamed from: a */
    public final Object f14855a;

    /* renamed from: b */
    public final Object f14856b;

    public egd(Object obj, Object obj2) {
        sdo.m34959a(obj);
        this.f14855a = obj;
        sdo.m34959a(obj2);
        this.f14856b = obj2;
    }

    /* renamed from: a */
    public static egd m10350a(Object obj, Object obj2) {
        return new egd(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egd) {
            egd egd = (egd) obj;
            return egd.f14855a.equals(this.f14855a) && egd.f14856b.equals(this.f14856b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14855a, this.f14856b});
    }
}
