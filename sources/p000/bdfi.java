package p000;

import android.app.Application;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bdfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdfi implements bdgt {

    /* renamed from: a */
    private static final bnrt f105459a = bnrt.m110178a("bdfi");

    /* renamed from: b */
    private final bdif f105460b;

    /* renamed from: c */
    private final cijl f105461c;

    /* renamed from: d */
    private final cijl f105462d;

    /* renamed from: e */
    private final cijl f105463e;

    /* renamed from: f */
    private final cijl f105464f;

    /* renamed from: g */
    private final cijl f105465g;

    public bdfi(Application application, bdif bdif, cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        application.getPackageName();
        this.f105460b = bdif;
        this.f105461c = cijl;
        this.f105462d = cijl2;
        this.f105463e = cijl3;
        this.f105464f = cijl4;
        this.f105465g = cijl5;
    }

    /* renamed from: a */
    public final void mo57993a(bdii bdii, cinu cinu, cimz cimz) {
        bmxy.m108581a(bdii);
        if (cinu == null || cinu.f190987d.size() == 0) {
            bnrq bnrq = (bnrq) f105459a.mo68388c();
            bnrq.mo68432a("bdfi", "a", 398, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Invalid traces were logged.");
        } else if (((bmxv) this.f105465g.mo6445a()).mo66813a()) {
            bdps bdps = (bdps) ((bmxv) this.f105465g.mo6445a()).mo66814b();
            if (bdps.f106228c && !bdps.f106227b.mo58288b()) {
                bxvd da = cios.f191113s.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cios cios = (cios) da.f164949b;
                cinu.getClass();
                cios.f191127m = cinu;
                cios.f191115a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                cios cios2 = (cios) da.mo74062i();
                if (cinu.f190987d.size() > 0) {
                    String str = ((cinx) cinu.f190987d.get(0)).f190996b;
                }
                bdps.f106226a.mo58104b(null, true, cios2, cimz, null);
            }
        }
    }

    /* renamed from: b */
    public final void mo57999b() {
        this.f105460b.mo58065a();
    }

    /* renamed from: c */
    public final void mo58002c() {
        bmxv bmxv = (bmxv) this.f105461c.mo6445a();
        if (bmxv.mo66813a()) {
            ((bdml) bmxv.mo66814b()).mo58185a();
        }
    }

    /* renamed from: d */
    public final bdij mo58003d() {
        return mo57998a() ? ((bdpc) ((bmxv) this.f105464f.mo6445a()).mo66814b()).mo58260a() : bdij.f105693c;
    }

    /* renamed from: e */
    public final void mo58004e() {
        bmxv bmxv = (bmxv) this.f105463e.mo6445a();
        if (bmxv.mo66813a()) {
            bdhp.m90826a(((bdok) bmxv.mo66814b()).mo58237d());
        }
    }

    /* renamed from: b */
    public final void mo58000b(bdij bdij, String str, boolean z) {
        if (!bdij.m90860a(bdij) && mo57998a()) {
            bdij.mo58070b();
            bdij.f105697e = 1;
            bdhp.m90826a(((bdpc) ((bmxv) this.f105464f.mo6445a()).mo66814b()).mo58261a(bdij, str, z));
        }
    }

    /* renamed from: b */
    public final void mo58001b(String str) {
        bmxv bmxv = (bmxv) this.f105461c.mo6445a();
        if (bmxv.mo66813a()) {
            bdhp.m90826a(((bdml) bmxv.mo66814b()).mo58184a(str));
        }
    }

    /* renamed from: a */
    public final void mo57994a(bdij bdij, String str, boolean z) {
        mo58000b(bdij, str, z);
    }

    /* renamed from: a */
    public final void mo57995a(bdil bdil, String str, long j, long j2, cimz cimz) {
        bmxy.m108581a(bdil);
        if (mo57998a()) {
            bdhp.m90826a(((bdpc) ((bmxv) this.f105464f.mo6445a()).mo66814b()).mo58262a(str, true, j, j2, cimz));
        }
    }

    /* renamed from: a */
    public final void mo57996a(bdnd bdnd) {
        if (((bmxv) this.f105462d.mo6445a()).mo66813a()) {
            ((bdnh) ((bmxv) this.f105462d.mo6445a()).mo66814b()).mo58208a(bdnd);
        }
    }

    /* renamed from: a */
    public final void mo57997a(String str) {
        mo58001b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo57998a() {
        return ((bmxv) this.f105464f.mo6445a()).mo66813a();
    }
}
