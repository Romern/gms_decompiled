package p000;

/* renamed from: rdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdb implements Comparable {

    /* renamed from: a */
    public final String f42692a;

    /* renamed from: b */
    public final rct f42693b;

    /* renamed from: c */
    private final boolean f42694c = false;

    public rdb(String str, rct rct) {
        this.f42692a = str;
        this.f42693b = rct;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        rdb rdb = (rdb) obj;
        boolean z = rdb.f42694c;
        bmxy.m108588a(true);
        rct rct = this.f42693b;
        if (rct == null) {
            return -1;
        }
        rct rct2 = rdb.f42693b;
        if (rct2 == null) {
            return 1;
        }
        return rct.compareTo(rct2);
    }
}
