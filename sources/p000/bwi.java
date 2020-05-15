package p000;

/* renamed from: bwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwi {

    /* renamed from: a */
    public cag f5879a = null;

    /* renamed from: b */
    public bzy f5880b = null;

    /* renamed from: c */
    public caj f5881c = null;

    /* renamed from: d */
    public cah f5882d = null;

    /* renamed from: e */
    public cad f5883e = null;

    /* renamed from: f */
    public bzz f5884f = null;

    /* renamed from: g */
    public cai f5885g = null;

    /* renamed from: h */
    public final bvw f5886h;

    public bwi(long j, int i, long j2, String str, int i2, bvw bvw) {
        bwi.class.getSimpleName();
        this.f5879a = new cag(cbm.m3896a(m3691a(Integer.toString(i), 2)));
        this.f5880b = new bzy(cbm.m3896a(m3691a(Long.toString(j2), 6)));
        this.f5881c = new caj(cbm.m3896a(m3691a(Long.toHexString(j), 4)));
        this.f5882d = new cah(cbm.m3896a(m3691a(str, 3)));
        this.f5883e = new cad(cbm.m3896a(m3691a(Long.toString((long) i2), 2)));
        this.f5884f = new bzz(cbm.m3896a(m3691a("", 6)));
        this.f5885g = new cai(cbm.m3896a(m3691a("", 1)));
        this.f5886h = bvw;
    }

    /* renamed from: a */
    protected static final String m3691a(String str, int i) {
        int length = (i + i) - str.length();
        for (int i2 = 0; i2 < length; i2++) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
        }
        return str;
    }
}
