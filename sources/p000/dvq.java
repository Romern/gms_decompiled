package p000;

/* renamed from: dvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvq extends tjn {

    /* renamed from: a */
    public final bxcv f14209a;

    /* renamed from: b */
    private final bdyx f14210b;

    public dvq(bxcv bxcv) {
        this(bxcv, null);
    }

    /* renamed from: a */
    public static dvq m9548a() {
        bxvd da = bxcv.f162989d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcv bxcv = (bxcv) da.f164949b;
        bxcv.f162992b = 1;
        bxcv.f162991a = 1 | bxcv.f162991a;
        return new dvq((bxcv) da.mo74062i());
    }

    /* renamed from: b */
    public final int mo9711b() {
        int a = bxcu.m122585a(this.f14209a.f162992b);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    /* renamed from: c */
    public final long mo9712c() {
        int b = mo9711b();
        if (b != 2) {
            String valueOf = String.valueOf(Integer.toString(b));
            throw new IllegalStateException(valueOf.length() == 0 ? new String("No time period for type ") : "No time period for type ".concat(valueOf));
        }
        bdyx bdyx = this.f14210b;
        return bdyx != null ? ((Long) bdyx.mo58455c()).longValue() : this.f14209a.f162993c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(mo9711b()));
        if (mo9711b() == 2) {
            sb.append(" timePeriod=");
            sb.append(mo9712c());
        }
        return sb.toString();
    }

    public dvq(bxcv bxcv, bdyx bdyx) {
        sdo.m34959a(bxcv);
        this.f14209a = bxcv;
        this.f14210b = bdyx;
    }
}
