package p000;

import java.util.Arrays;

/* renamed from: duk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duk implements Comparable {

    /* renamed from: a */
    public long f14046a;

    /* renamed from: b */
    public long f14047b;

    public duk(long j, long j2) {
        sdo.m34974b(j2 >= j);
        this.f14046a = j;
        this.f14047b = j2;
    }

    /* renamed from: a */
    public static duk m9379a(long j, long j2) {
        return new duk(j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9621a(long j) {
        this.f14046a += j;
        this.f14047b += j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo9622b(long j) {
        return j >= this.f14046a && j <= this.f14047b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo9623c(long j) {
        return this.f14046a <= j && this.f14047b >= j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.f14046a;
        long j2 = ((duk) obj).f14046a;
        if (j <= j2) {
            return j < j2 ? -1 : 0;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo9625d(long j) {
        return this.f14047b - this.f14046a >= j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo9626e(long j) {
        long j2 = this.f14046a;
        return j2 >= 0 && j2 <= j && this.f14047b <= j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duk) {
            duk duk = (duk) obj;
            return this.f14046a == duk.f14046a && this.f14047b == duk.f14047b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14046a), Long.valueOf(this.f14047b)});
    }

    public final String toString() {
        long j = this.f14046a;
        long j2 = this.f14047b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Intrvl: [");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
