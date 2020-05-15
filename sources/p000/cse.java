package p000;

import java.util.Iterator;

/* renamed from: cse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cse extends crz {
    public cse() {
        super(crx.class);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ czf mo8202a(crn crn, csn csn) {
        boolean z;
        boolean z2;
        crx crx = (crx) crn;
        css css = css.INCORRECT_PARAMETERS_P1_P2;
        boolean z3 = false;
        if (crx.mo8192b() == 4) {
            z = true;
        } else {
            z = false;
        }
        css.mo8229a(z);
        css css2 = css.WRONG_LENGTH;
        if (crx.mo8194d().byteValue() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        css2.mo8229a(z2);
        if (crx.mo8201g() > 0 && crx.mo8201g() <= 10) {
            return mo8204a(crx, csp.m7470a(csn));
        }
        csp.m7470a(csn);
        css css3 = css.FILE_OR_APP_NOT_FOUND;
        if (crx.mo8191a() == 1) {
            z3 = true;
        }
        css3.mo8229a(z3);
        throw new ctu(css.RECORD_NOT_FOUND);
    }

    /* renamed from: a */
    public czf mo8204a(crx crx, csp csp) {
        boolean z;
        boolean z2 = false;
        if (crx.mo8201g() == 1 && crx.mo8191a() == 1) {
            return czf.m7988a(new czh(csp, true), csr.m7475a(csu.RECORD_TEMPLATE.mo8231a(csx.TRACK_1.mo8238a(csp.f11918b.f12028a.mo8269b("Track_1_Data_for_ZIP/MS_Mode")), csx.TRACK_2_EQV_DATA.mo8238a(csp.f11918b.mo8285f()))));
        }
        css css = css.FILE_OR_APP_NOT_FOUND;
        czs f = csp.mo8221f();
        byte g = crx.mo8201g();
        Iterator it = f.f12457a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((czr) it.next()).f12454a == g) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        css.mo8229a(!z);
        css css2 = css.CONDITIONS_OF_USE_NOT_SATISFIED;
        czs f2 = csp.mo8221f();
        byte g2 = crx.mo8201g();
        byte a = crx.mo8191a();
        Iterator it2 = f2.f12457a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            czr czr = (czr) it2.next();
            if (czr.f12454a == g2 && a >= czr.f12455b && a <= czr.f12456c) {
                z2 = true;
                break;
            }
        }
        css2.mo8229a(!z2);
        throw new ctu(css.RECORD_NOT_FOUND);
    }
}
