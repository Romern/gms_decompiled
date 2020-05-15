package p000;

import java.util.Comparator;

/* renamed from: edx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edx extends edu {

    /* renamed from: b */
    private long f14758b = 0;

    public edx(int i, Comparator comparator, boolean z) {
        super(i, comparator, z);
    }

    /* renamed from: a */
    public final void mo10008a(edr edr) {
        super.mo10008a(edr);
        this.f14758b = dwq.m9665i().mo20505a();
    }

    /* renamed from: a */
    public final boolean mo10010a(long j) {
        boolean z;
        long a = dwq.m9665i().mo20505a();
        if (a - this.f14758b <= j) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(a), Long.valueOf(this.f14758b), Long.valueOf(j)};
        return z;
    }
}
