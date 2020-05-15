package p000;

import java.util.Arrays;

/* renamed from: bfqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfqx {

    /* renamed from: a */
    public final String f114958a;

    /* renamed from: b */
    public final String f114959b;

    /* renamed from: c */
    public final int f114960c;

    /* renamed from: d */
    public final boolean f114961d;

    /* renamed from: e */
    public final long f114962e;

    public bfqx(String str, int i, String str2, long j) {
        this.f114958a = str;
        this.f114959b = str2;
        this.f114960c = i;
        this.f114961d = true;
        this.f114962e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfqx) {
            bfqx bfqx = (bfqx) obj;
            if (!bmxi.m108538a(this.f114958a, bfqx.f114958a) || !bmxi.m108538a(this.f114959b, bfqx.f114959b) || this.f114960c != bfqx.f114960c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f114958a, this.f114959b, Integer.valueOf(this.f114960c)});
    }

    public bfqx(String str, String str2, long j) {
        this.f114958a = str;
        this.f114959b = str2;
        this.f114960c = 0;
        this.f114961d = false;
        this.f114962e = j;
    }
}
