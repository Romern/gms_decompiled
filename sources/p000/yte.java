package p000;

/* renamed from: yte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yte {

    /* renamed from: a */
    public static final bnic f54572a = bnic.m109490a("com.google.heart_rate.bpm", "com.google.heart_rate.summary");

    /* renamed from: b */
    public static final yuw f54573b = yuq.m44881a(ysy.f54566a, ysz.f54567a);

    /* renamed from: c */
    public static final yuw f54574c = yuq.m44881a(yta.f54568a, ytb.f54569a);

    /* renamed from: d */
    public static final yuw f54575d = yuq.m44881a(ytc.f54570a, ytd.f54571a);

    /* renamed from: e */
    private static final srn f54576e = zvt.m46581a();

    /* renamed from: f */
    private static final bmyv f54577f = bmyx.m108640a('|').mo66924c("=");

    /* renamed from: a */
    public static bnhe m44764a(String str, bnhe bnhe) {
        if (str.isEmpty()) {
            return bnoj.f131912b;
        }
        try {
            return bnhe.m109413a(f54577f.mo66915a(str));
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f54576e.mo68387b();
            bnsl.mo68432a("yte", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Invalid Gservices scopes flag %s", str);
            return bnhe == null ? bnoj.f131912b : bnhe;
        }
    }
}
