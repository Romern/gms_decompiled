package p000;

/* renamed from: pbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbx {

    /* renamed from: a */
    private static final bnsn f38800a = odk.m28481a("CAR.SETUP.legal");

    /* renamed from: b */
    private final npd f38801b;

    public pbx(npd npd) {
        this.f38801b = npd;
    }

    /* renamed from: a */
    public final int mo22892a(String str) {
        String a = this.f38801b.mo21379a(str, (String) null);
        if (a == null) {
            return 0;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            bnsi b = f38800a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pbx", "a", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68424a("Unrecognized tos version: %s=%s", str, a);
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo22893a() {
        return mo22892a("car_tos_main") > 0;
    }
}
