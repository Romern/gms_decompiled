package p000;

import java.util.Comparator;

/* renamed from: edw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edw extends edu {

    /* renamed from: b */
    private boolean f14756b = false;

    /* renamed from: c */
    private long f14757c = 0;

    public edw(Comparator comparator) {
        super(1, comparator, false);
    }

    /* renamed from: a */
    public final void mo10008a(edr edr) {
        super.mo10008a(edr);
        this.f14756b = true;
        this.f14757c = edr.f14749a.mo18022j().mo18096c();
    }

    /* renamed from: b */
    public final boolean mo10011b(boolean z) {
        this.f14756b = z;
        return true;
    }

    /* renamed from: a */
    public final boolean mo10010a(long j) {
        if (!cdhf.m133435b()) {
            return super.mo10010a(j);
        }
        if (j == Long.MAX_VALUE) {
            return true;
        }
        Object[] objArr = {Long.valueOf(this.f14757c), Boolean.valueOf(this.f14756b), Long.valueOf(j)};
        if (dwq.m9665i().mo20505a() - this.f14757c > j || !this.f14756b) {
            return false;
        }
        return true;
    }
}
