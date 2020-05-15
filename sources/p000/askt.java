package p000;

/* renamed from: askt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askt {

    /* renamed from: a */
    public static final srn f89131a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo49217a(askf askf) {
        bnsl bnsl = (bnsl) f89131a.mo68388c();
        bnsl.mo68432a("askt", "a", 27, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Deleting account data due to SERVICE_DELETION");
        mo49219b(askf);
    }

    /* renamed from: b */
    public final void mo49219b(askf askf) {
        asko a = asko.m74292a(askf.f89126d);
        try {
            a.mo49215a(askf.f89123a, askf.f89124b, a.mo49214a());
        } catch (asks e) {
            bnsl bnsl = (bnsl) f89131a.mo68387b();
            bnsl.mo68437a(e.getCause());
            bnsl.mo68432a("askt", "b", 38, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to delete account data");
        }
    }

    /* renamed from: a */
    public final void mo49218a(askf askf, btnf btnf) {
        char c;
        btnb btnb = (btnb) atff.m75762a(btnf, btnb.f149588b, 3);
        if (btnb != null) {
            int i = btnb.f149590a;
            if (i != 0) {
                c = i != 1 ? (char) 0 : 3;
            } else {
                c = 2;
            }
            if (c != 0 && c == 3) {
                bnsl bnsl = (bnsl) f89131a.mo68388c();
                bnsl.mo68432a("askt", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Deleting account data due to UNREGISTERED_INSTANCE error.");
                mo49219b(askf);
            }
        }
    }
}
