package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: bfit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfit {

    /* renamed from: a */
    protected final String f114047a;

    /* renamed from: b */
    final bgnp f114048b;

    /* renamed from: c */
    final bgmk f114049c;

    /* renamed from: d */
    final bgns f114050d;

    /* renamed from: e */
    final bfcu f114051e;

    /* renamed from: f */
    final bhaz f114052f;

    /* renamed from: g */
    final bgoj f114053g;

    /* renamed from: h */
    public boolean f114054h = false;

    /* renamed from: i */
    public final bfiq f114055i;

    /* renamed from: j */
    public bfis f114056j;

    /* renamed from: k */
    private boolean f114057k = true;

    public bfit(String str, bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bhaz bhaz, bfiq bfiq, bfis bfis) {
        this.f114048b = bgnp;
        this.f114050d = bgns;
        this.f114049c = bgmk;
        this.f114051e = bfcu;
        this.f114053g = bgoj;
        this.f114052f = bhaz;
        this.f114055i = bfiq;
        this.f114056j = bfis;
        this.f114047a = str;
    }

    /* renamed from: a */
    protected static bsax m96873a(long j, bgjm bgjm, bfmn bfmn, bfnx bfnx, ActivityRecognitionResult activityRecognitionResult, boolean z, int i, int i2) {
        bsax bsax;
        long j2 = j;
        bgjm bgjm2 = bgjm;
        bfmn bfmn2 = bfmn;
        bfnx bfnx2 = bfnx;
        ActivityRecognitionResult activityRecognitionResult2 = activityRecognitionResult;
        bsax bsax2 = new bsax(bgox.f117041ah);
        if (bgjm2 != null) {
            boolean z2 = bfmn2 != null ? true : bfnx2 != null;
            bsax bsax3 = new bsax(bgox.f116995O);
            bsax3.mo70134g(1, ayuo.m84849b(bgjm.mo62896b()));
            bsax3.mo70134g(2, ayuo.m84849b(bgjm.mo62897c()));
            bsax bsax4 = new bsax(bgox.f117004X);
            bsax4.mo70118b(1, bsax3);
            bsax4.mo70134g(8, 0);
            bsax4.mo70117b(6, bgjm.mo62899e());
            bsax4.mo70119b(17, z);
            bsax4.mo70134g(3, (int) bgjm.mo62895a());
            if (bgjm2.f116615a.hasSpeed()) {
                bsax4.mo70116b(16, bgjm.mo62898d());
            }
            if (bgjm.mo62903i()) {
                bsax4.mo70134g(13, (int) bgjm.mo62901g());
            }
            if (z2 && bgjm.mo62902h()) {
                bsax4.mo70134g(10, (int) bgjm.mo62900f());
            }
            bsax2.mo70118b(3, bsax4);
            bsax2.mo70117b(14, (bgjm2.f116616b + j2) - bgjm.mo62899e());
        }
        if (bfmn2 != null) {
            bsax2.mo70118b(1, bfmn2.mo61948b(j2));
        }
        if (bfnx2 != null) {
            if (!bfnx2.f114525b.isEmpty()) {
                bsax = bfnx2.f114527d;
                if (bsax == null) {
                    bfnx2.f114527d = new bsax(bgox.f116994N);
                    bfnx2.f114527d.mo70117b(1, bfnx2.f114524a + j2);
                    int min = Math.min(25, bfnx2.f114525b.size());
                    int i3 = 0;
                    while (i3 < min) {
                        bsax bsax5 = bfnx2.f114527d;
                        bfnw bfnw = (bfnw) bfnx2.f114525b.get(i3);
                        long j3 = bfnx2.f114524a;
                        bsax a = bfny.m97385a(Long.valueOf(bfnw.f114519b));
                        a.mo70134g(4, bfnw.f114521d);
                        bfny.m97386a(a, bfnw.f114522e);
                        a.mo70118b(2, bfnw.f114520c);
                        int i4 = i3;
                        long j4 = bfnw.f114523f;
                        if (j4 != 0) {
                            a.mo70134g(12, (int) Math.abs(j3 - j4));
                        }
                        bsax5.mo70107a(2, a);
                        i3 = i4 + 1;
                    }
                    bsax = bfnx2.f114527d;
                }
            } else {
                bsax = null;
            }
            bsax2.mo70118b(2, bsax);
        }
        if (cevn.m138305c() && activityRecognitionResult2 != null) {
            bsax bsax6 = new bsax(bgox.f117141v);
            bsax6.mo70117b(1, activityRecognitionResult2.f79302c + j2);
            bsax6.mo70134g(3, activityRecognitionResult2.f79303d);
            List<DetectedActivity> list = activityRecognitionResult2.f79300a;
            if (list != null) {
                for (DetectedActivity detectedActivity : list) {
                    bsax bsax7 = new bsax(bgox.f117140u);
                    bsax7.mo70134g(1, detectedActivity.mo43513a());
                    bsax7.mo70134g(2, detectedActivity.f79320e);
                    bsax6.mo70107a(2, bsax7);
                }
            }
            bsax2.mo70118b(19, bsax6);
        }
        bsax bsax8 = new bsax(bgox.f117001U);
        bsax8.mo70134g(1, i);
        bsax8.mo70134g(8, i2);
        bsax2.mo70107a(99, bsax8);
        return bsax2;
    }

    /* renamed from: i */
    private final String mo61820i() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        return valueOf.length() == 0 ? new String("fault from instance of ") : "fault from instance of ".concat(valueOf);
    }

    /* renamed from: a */
    public void mo61743a(int i, int i2, boolean z) {
    }

    /* renamed from: a */
    public void mo61744a(bfct bfct) {
    }

    /* renamed from: a */
    public void mo61745a(bfmn bfmn) {
    }

    /* renamed from: a */
    public void mo61746a(bfnx bfnx) {
    }

    /* renamed from: a */
    public void mo61747a(bgjm bgjm) {
    }

    /* renamed from: a */
    public void mo61748a(bgnq bgnq) {
    }

    /* renamed from: a */
    public void mo61749a(bsax bsax) {
    }

    /* renamed from: a */
    public void mo61750a(ActivityRecognitionResult activityRecognitionResult) {
    }

    /* renamed from: a */
    public void mo61751a(PrintWriter printWriter) {
    }

    /* renamed from: a */
    public void mo61752a(Object obj) {
    }

    /* renamed from: a */
    public void mo61753a(boolean z) {
        this.f114054h = z;
    }

    /* renamed from: b */
    public void mo61756b() {
        boolean z = false;
        do {
            bfis bfis = this.f114056j;
            long c = this.f114049c.mo62776c();
            bfis bfis2 = bfis.OFF;
            switch (this.f114056j.ordinal()) {
                case 0:
                    z = mo61755a(c);
                    break;
                case 1:
                    z = mo61758b(c);
                    break;
                case 2:
                    z = mo61761c(c);
                    break;
                case 3:
                    z = mo61764d(c);
                    break;
                case 4:
                    z = mo61767e(c);
                    break;
                case 5:
                    z = mo61769f(c);
                    break;
                case 6:
                    z = mo61768f();
                    break;
                case 7:
                    z = mo61772h();
                    break;
                case 8:
                    z = mo61771g();
                    break;
            }
            bfis bfis3 = this.f114056j;
            if (bfis != bfis3) {
                Object[] objArr = {bfis, bfis3};
                continue;
            }
        } while (z);
    }

    /* renamed from: b */
    public void mo61757b(boolean z) {
    }

    /* renamed from: c */
    public void mo61759c(boolean z) {
    }

    /* renamed from: d */
    public void mo61762d() {
        this.f114057k = false;
    }

    /* renamed from: d */
    public void mo61763d(boolean z) {
    }

    /* renamed from: e */
    public void mo61765e() {
    }

    /* renamed from: e */
    public void mo61766e(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo61768f() {
        throw new RuntimeException(mo61820i());
    }

    /* renamed from: g */
    public void mo61770g(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo61771g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo61772h() {
        return false;
    }

    /* renamed from: c */
    public boolean mo61760c() {
        return this.f114056j == bfis.OFF || this.f114056j == bfis.IDLE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo61769f(long j) {
        throw new RuntimeException(mo61820i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo61761c(long j) {
        throw new RuntimeException(mo61820i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo61764d(long j) {
        throw new RuntimeException(mo61820i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo61767e(long j) {
        throw new RuntimeException(mo61820i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo61758b(long j) {
        throw new RuntimeException(mo61820i());
    }

    /* renamed from: a */
    protected static boolean m96874a(bfnx bfnx, bgjm bgjm) {
        return (bfnx == null || bgjm == null || Math.abs(bfnx.f114524a - bgjm.f116616b) > 720000) ? false : true;
    }

    /* renamed from: a */
    protected static boolean m96875a(bgjm bgjm, bgjm bgjm2, int i) {
        return ayuo.m84846b(bgjm.mo62896b(), bgjm.mo62897c(), bgjm2.mo62896b(), bgjm2.mo62897c()) < ((double) i);
    }

    /* renamed from: a */
    protected static boolean m96876a(ActivityRecognitionResult activityRecognitionResult, bgjm bgjm) {
        if (bgjm != null) {
            return cevn.m138304b() <= 0 || Math.abs(activityRecognitionResult.f79302c - bgjm.f116616b) <= cevn.m138304b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo61754a() {
        return this.f114057k && !this.f114054h && bfjb.m96990a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo61755a(long j) {
        throw new RuntimeException(mo61820i());
    }
}
