package p000;

/* renamed from: aueg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aueg {

    /* renamed from: a */
    public static final audg f91490a = audg.m76790a("SciFi_Core");

    /* renamed from: b */
    public String f91491b = "";

    /* renamed from: c */
    public boolean f91492c;

    /* renamed from: d */
    public boolean f91493d;

    /* renamed from: e */
    public boolean f91494e;

    /* renamed from: f */
    public boolean f91495f;

    /* renamed from: g */
    public int f91496g;

    /* renamed from: h */
    public int f91497h = 0;

    /* renamed from: i */
    public int f91498i = 0;

    /* renamed from: j */
    public String f91499j;

    /* renamed from: k */
    public String f91500k = "UNKNOWN";

    /* renamed from: l */
    public String f91501l = "UNKNOWN";

    /* renamed from: m */
    public String f91502m = "";

    /* renamed from: n */
    public String f91503n = "";

    /* renamed from: o */
    public auef f91504o;

    /* renamed from: p */
    public auem f91505p;

    /* renamed from: q */
    public bowk f91506q = bowk.f135143l;

    /* renamed from: r */
    public bngx f91507r;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* renamed from: a */
    public static auef m76884a(String str, auem auem) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -334847909) {
            if (hashCode != 2018401) {
                if (hashCode == 624992363 && str.equals("Verizon Wireless")) {
                    c = 0;
                    if (c != 0) {
                        return new auer(auem);
                    }
                    if (c == 1) {
                        return new audu(auem);
                    }
                    if (c != 2) {
                        return null;
                    }
                    return new aueo(auem);
                }
            } else if (str.equals("AT&T")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("T-Mobile")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: a */
    public static String m76885a(auem auem) {
        auef a;
        auek auek = ((audw) auem).f91452f.f91461a;
        return (auek == null || (a = m76884a(auek.f91522a, auem)) == null || !a.mo50451h()) ? "" : a.mo50449f();
    }
}
