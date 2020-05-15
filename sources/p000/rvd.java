package p000;

/* renamed from: rvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rvd {

    /* renamed from: a */
    public final String f43726a;

    /* renamed from: b */
    public final long f43727b;

    /* renamed from: c */
    public final long f43728c;

    public rvd(String str, long j) {
        this(str, j, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo25188a(rvl rvl);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract rvl mo25189b(rvl rvl);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final rvl mo25190c(rvl rvl) {
        try {
            return mo25189b(rvl);
        } catch (RuntimeException e) {
            rvc.m34511a(e, rvl, this.f43726a);
            rvk d = rvl.mo25205d();
            d.mo25199a(this, 5);
            return d.mo25198a();
        }
    }

    public rvd(String str, long j, long j2) {
        sdo.m34975b(j >= 0, "secondsFixIsValid must be >= 0");
        sdo.m34977c(str);
        this.f43726a = str;
        this.f43727b = j;
        this.f43728c = j2;
    }
}
