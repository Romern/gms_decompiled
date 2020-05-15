package p000;

/* renamed from: bvdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bvdu {

    /* renamed from: a */
    private final bvdu[] f155680a;

    /* renamed from: e */
    public final String f155681e;

    public bvdu(String str, bvdu... bvduArr) {
        this.f155681e = str;
        this.f155680a = bvduArr;
    }

    /* renamed from: a */
    public bvdu mo73236a() {
        bvdu[] bvduArr = this.f155680a;
        if (bvduArr == null) {
            return null;
        }
        for (bvdu bvdu : bvduArr) {
            if (!bvdu.mo73237b()) {
                return bvdu;
            }
        }
        return null;
    }

    /* renamed from: b */
    public abstract boolean mo73237b();

    /* renamed from: c */
    public abstract boolean mo73238c();

    /* renamed from: d */
    public abstract long mo73239d();
}
