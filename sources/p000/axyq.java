package p000;

import java.util.Arrays;

/* renamed from: axyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyq {

    /* renamed from: a */
    public long f96790a;

    /* renamed from: b */
    public long f96791b;

    /* renamed from: c */
    public long f96792c;

    /* renamed from: d */
    public long f96793d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axyq) {
            axyq axyq = (axyq) obj;
            return this.f96790a == axyq.f96790a && this.f96791b == axyq.f96791b && this.f96792c == axyq.f96792c && this.f96793d == axyq.f96793d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f96790a), Long.valueOf(this.f96791b), Long.valueOf(this.f96792c), Long.valueOf(this.f96793d)});
    }
}
