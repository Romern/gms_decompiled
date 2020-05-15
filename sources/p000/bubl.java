package p000;

/* renamed from: bubl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubl {

    /* renamed from: a */
    public static final bubl f153246a = new bubl();

    /* renamed from: b */
    public bubh f153247b;

    /* renamed from: c */
    public bsax f153248c;

    /* renamed from: d */
    public long f153249d = -1;

    /* renamed from: e */
    public bubi f153250e;

    /* renamed from: f */
    public String f153251f;

    /* renamed from: g */
    public bubo f153252g;

    /* renamed from: a */
    public final int mo72617a() {
        if (this.f153247b == null) {
            System.out.println("LruCache is NULL");
        }
        bumj a = this.f153247b.entrySet().iterator();
        int i = 0;
        while (a.hasNext()) {
            a.mo72556f();
            i += a.mo72502a().length;
        }
        return i;
    }
}
