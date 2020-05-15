package p000;

import java.util.Arrays;

/* renamed from: epq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epq {

    /* renamed from: a */
    public final bsxk f15491a;

    /* renamed from: b */
    public final long f15492b;

    /* renamed from: c */
    public final boolean f15493c;

    public epq(bsxk bsxk, long j) {
        this(bsxk, j, false);
    }

    /* renamed from: a */
    public final boolean mo10394a() {
        return this.f15491a.f147581b == 1000;
    }

    /* renamed from: b */
    public final bsul mo10395b() {
        bsxk bsxk = this.f15491a;
        int i = bsxk.f147581b;
        if (i == 1000) {
            return epr.f15495b;
        }
        if (i == 3) {
            return (bsul) ((bsxr) bsxk.f147582c).f147605a.get(0);
        }
        return epr.f15496c;
    }

    /* renamed from: c */
    public final boolean mo10396c() {
        long j;
        if (mo10394a()) {
            return true;
        }
        if (this.f15491a.f147584e) {
            j = cbri.f178135a.mo6606a().mo75273w();
        } else {
            j = cbri.f178135a.mo6606a().mo75274x();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f15492b;
        if (j + j2 < currentTimeMillis || currentTimeMillis < j2) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof epq) {
            epq epq = (epq) obj;
            return this.f15492b == epq.f15492b && this.f15493c == epq.f15493c && bmxi.m108538a(this.f15491a, epq.f15491a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15491a, Long.valueOf(this.f15492b), Boolean.valueOf(this.f15493c)});
    }

    public epq(bsxk bsxk, long j, boolean z) {
        this.f15491a = bsxk;
        this.f15492b = j;
        this.f15493c = z;
    }

    public epq(bsxn bsxn) {
        this.f15491a = epr.m10919a(bsxn);
        this.f15492b = 0;
        this.f15493c = false;
    }
}
