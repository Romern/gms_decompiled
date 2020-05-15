package p000;

/* renamed from: abzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzr {

    /* renamed from: a */
    public static final abzr f58828a = new abzr(null, 0, 0);

    /* renamed from: b */
    private Object f58829b;

    /* renamed from: c */
    private int f58830c;

    /* renamed from: d */
    private long f58831d;

    public abzr(Object obj, int i, long j) {
        this.f58829b = obj;
        this.f58830c = i;
        this.f58831d = j;
    }

    /* renamed from: a */
    public static abzr m48711a(int i, Object obj, long j) {
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2)) {
            z = false;
        }
        sdo.m34974b(z);
        return new abzr(obj, i, j);
    }

    /* renamed from: b */
    public static abzr m48713b(Object obj, long j) {
        return new abzr(obj, 2, j);
    }

    /* renamed from: a */
    public final synchronized int mo32553a() {
        return this.f58830c;
    }

    /* renamed from: a */
    public final synchronized void mo32555a(long j) {
        this.f58831d = j;
    }

    /* renamed from: b */
    public final synchronized long mo32559b() {
        return this.f58831d;
    }

    /* renamed from: c */
    public final synchronized Object mo32560c() {
        return this.f58829b;
    }

    /* renamed from: d */
    public final String mo32561d() {
        return m48714b(mo32553a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abzr) {
            abzr abzr = (abzr) obj;
            return abzr.f58830c == this.f58830c && sdg.m34949a(this.f58829b, abzr.f58829b);
        }
    }

    public final int hashCode() {
        Object obj = this.f58829b;
        return (((obj != null ? obj.hashCode() : 0) + 851) * 37) + this.f58830c;
    }

    /* renamed from: a */
    public static abzr m48712a(Object obj, long j) {
        return new abzr(obj, 1, j);
    }

    /* renamed from: b */
    public static String m48714b(int i) {
        if (i == 0) {
            return "unset";
        }
        if (i == 1) {
            return "set from runtime API";
        }
        if (i == 2) {
            return "set from resources";
        }
        StringBuilder sb = new StringBuilder(21);
        sb.append("unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final abzr mo32554a(Object obj) {
        return new abzr(obj, mo32553a(), this.f58831d);
    }

    /* renamed from: a */
    public final synchronized void mo32556a(Object obj, int i, long j) {
        sdo.m34970a(mo32557a(i));
        this.f58830c = i;
        this.f58829b = obj;
        this.f58831d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r5 == 1) goto L_0x0010;
     */
    /* renamed from: a */
    public final synchronized boolean mo32557a(int i) {
        int i2 = this.f58830c;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid source value ");
                sb.append(i);
                sdo.m34975b(false, sb.toString());
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo32558a(abzr abzr) {
        return mo32557a(abzr.mo32553a());
    }
}
