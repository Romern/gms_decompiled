package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: bdlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdlm extends bdli implements bdez, bdkj {

    /* renamed from: a */
    public static final /* synthetic */ int f105898a = 0;

    /* renamed from: b */
    private static final bnrt f105899b = bnrt.m110178a("bdlm");

    /* renamed from: c */
    private final Application f105900c;

    /* renamed from: d */
    private final bdfd f105901d;

    /* renamed from: e */
    private final bdlk f105902e;

    /* renamed from: f */
    private final Map f105903f = new HashMap();

    /* renamed from: g */
    private final boolean f105904g;

    /* renamed from: h */
    private final int f105905h;

    /* renamed from: i */
    private final bdlr f105906i;

    /* renamed from: j */
    private final bdkg f105907j;

    /* renamed from: k */
    private final cijl f105908k;

    public bdlm(bdkh bdkh, Application application, bdlr bdlr, bmxv bmxv, cijl cijl) {
        int i = Build.VERSION.SDK_INT;
        bmxy.m108600b(true);
        this.f105907j = bdkh.mo58105a((Executor) cijl.mo6445a(), new bdpz(((bdls) bmxv.mo66814b()).mo58157d()));
        this.f105900c = application;
        this.f105901d = bdfd.m90662a(application);
        this.f105904g = ((bdls) bmxv.mo66814b()).mo58155b();
        this.f105906i = bdlr;
        this.f105908k = (cijl) ((bdls) bmxv.mo66814b()).mo58158e().mo66815c();
        this.f105905h = bdlh.m91018a(application);
        bdlk bdlk = new bdlk(new bdlj(this), this.f105904g);
        this.f105902e = bdlk;
        this.f105901d.mo57955a(bdlk);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m91029a(int i) {
        synchronized (this.f105903f) {
            for (bdlq bdlq : this.f105903f.values()) {
                bdlq.mo58150a(i, this.f105905h);
            }
        }
    }

    /* renamed from: b */
    public void mo58031b() {
        this.f105901d.mo57956b(this.f105902e);
        this.f105902e.mo58146c();
        synchronized (this.f105903f) {
            this.f105903f.clear();
        }
    }

    /* renamed from: c */
    public void mo58086c() {
    }

    /* renamed from: b */
    public void mo57952b(Activity activity) {
        synchronized (this.f105903f) {
            this.f105903f.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return;
     */
    /* renamed from: a */
    public void mo58148a(String str) {
        synchronized (this.f105903f) {
            if (this.f105903f.containsKey(str)) {
                bnrq bnrq = (bnrq) f105899b.mo68388c();
                bnrq.mo68432a("bdlm", "a", 240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68420a("measurement already started: %s", str);
            } else if (this.f105903f.size() < 25) {
                this.f105903f.put(str, this.f105906i.mo58153a());
                if (this.f105903f.size() == 1 && !this.f105904g) {
                    this.f105902e.mo58144a();
                }
            } else {
                bnrq bnrq2 = (bnrq) f105899b.mo68388c();
                bnrq2.mo68432a("bdlm", "a", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq2.mo68420a("Too many concurrent measurements, ignoring %s", str);
            }
        }
    }

    /* renamed from: a */
    public void mo58149a(String str, boolean z, cimz cimz) {
        bdlq bdlq;
        cijl cijl;
        synchronized (this.f105903f) {
            bdlq = (bdlq) this.f105903f.remove(str);
            if (this.f105903f.isEmpty() && !this.f105904g) {
                this.f105902e.mo58145b();
            }
        }
        if (bdlq == null) {
            bnrq bnrq = (bnrq) f105899b.mo68388c();
            bnrq.mo68432a("bdlm", "a", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("Measurement not found: %s", str);
        } else if (bdlq.mo58151a()) {
            bxvd da = cios.f191113s.mo74144da();
            cioi b = bdlq.mo58152b();
            bxvd bxvd = (bxvd) b.mo74142c(5);
            bxvd.mo73625a((bxvk) b);
            int b2 = bdlh.m91019b(this.f105900c);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cioi cioi = (cioi) bxvd.f164949b;
            cioi cioi2 = cioi.f191066h;
            cioi.f191068a |= 16;
            cioi.f191074g = b2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cios cios = (cios) da.f164949b;
            cioi cioi3 = (cioi) bxvd.mo74062i();
            cioi3.getClass();
            cios.f191125k = cioi3;
            cios.f191115a |= 2048;
            if (cimz == null && (cijl = this.f105908k) != null) {
                try {
                    cimz = (cimz) cijl.mo6445a();
                } catch (Exception e) {
                    bnrq bnrq2 = (bnrq) f105899b.mo68388c();
                    bnrq2.mo68437a(e);
                    bnrq2.mo68432a("bdlm", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq2.mo68405a("Exception while getting jank metric extension!");
                }
            }
            if (cimz.f190878c.equals(cimz)) {
                cimz = null;
            }
            if (cimz != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cios cios2 = (cios) da.f164949b;
                cimz.getClass();
                cios2.f191126l = cimz;
                cios2.f191115a |= 8192;
            }
            this.f105907j.mo58104b(str, z, (cios) da.mo74062i(), null, null);
        }
    }
}
