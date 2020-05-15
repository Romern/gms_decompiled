package p000;

import java.time.YearMonth;
import java.util.Arrays;

/* renamed from: kdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdb {

    /* renamed from: a */
    public final kcu f23846a;

    /* renamed from: b */
    public final String f23847b;

    /* renamed from: c */
    public final int f23848c;

    /* renamed from: d */
    public final YearMonth f23849d;

    /* renamed from: e */
    public final bmxv f23850e;

    public kdb(kcu kcu, String str, int i, YearMonth yearMonth, bmxv bmxv) {
        this.f23846a = kcu;
        this.f23847b = str;
        this.f23848c = i;
        this.f23849d = yearMonth;
        this.f23850e = bmxv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kdb) {
            kdb kdb = (kdb) obj;
            return bmxi.m108538a(this.f23846a, kdb.f23846a) && this.f23847b.equals(kdb.f23847b) && this.f23848c == kdb.f23848c && bmxi.m108538a(this.f23849d, kdb.f23849d) && this.f23850e.equals(kdb.f23850e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23846a, this.f23847b, Integer.valueOf(this.f23848c), this.f23849d});
    }
}
