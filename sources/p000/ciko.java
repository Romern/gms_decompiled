package p000;

/* renamed from: ciko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciko extends cikj {
    public ciko(brep brep) {
        super(brep);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        byte b;
        int i;
        int i2;
        cikn cikn = (cikn) obj;
        srn srn = atgf.f90279a;
        if (cikn.f190532a.length != 0 && ((b = cikn.mo86215a(0)[3]) == 1 || b == 2)) {
            byte[] a = cikn.mo86215a(1);
            byte[] a2 = cikn.mo86215a(2);
            if ((a[8] & 128) == 128 || (a2[8] & 128) == 128) {
                byte b2 = cikn.mo86215a(0)[3];
                if (b2 == 1) {
                    i = 4;
                } else {
                    i = 6;
                }
                if (b2 == 1) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                try {
                    cilm cilm = new cilm();
                    String a3 = cikn.m150523a(cikn.mo86215a(i2), 3, 10);
                    a3.substring(a3.length() - 4);
                    byte[] a4 = cikn.mo86215a(i);
                    cikn.m150524b(a4, 0, 1);
                    cikn.m150524b(a4, 2, 2);
                    cilm.f190645a = cikn.f190533b;
                    ((cikj) this).f190528a.mo49932a(cilm);
                    return;
                } catch (NumberFormatException e) {
                    brep brep = ((cikj) this).f190528a;
                    ciki ciki = ciki.CARDINFO_PARSE_ERROR;
                    ciki.m150513a(ciki);
                    brep.mo49931a(new bres(ciki));
                    return;
                }
            }
        }
        ((cikj) this).f190528a.mo49932a((Object) null);
    }
}
