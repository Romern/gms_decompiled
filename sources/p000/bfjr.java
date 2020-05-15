package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: bfjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjr extends bfit {

    /* renamed from: k */
    final bfit[] f114200k;

    /* renamed from: l */
    public bfit f114201l;

    /* renamed from: m */
    final bfcy f114202m;

    /* renamed from: n */
    final bfmm f114203n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfjr(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bfcy bfcy, bfjf bfjf, bhaz bhaz, bfjy bfjy, bgoj bgoj, bfmm bfmm, bglw bglw) {
        super("NetworkCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, new bfiq(bfcy), bfis.OFF);
        bsax bsax;
        this.f114202m = bfcy;
        bfiq bfiq = this.f114055i;
        File d = bgnp.mo62753h().mo62784d();
        if (d != null) {
            File file = new File(d, "calibration");
            if (file.exists()) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bsax a = bhcr.m100642a(bufferedInputStream, bgox.f117035ab);
                    bufferedInputStream.close();
                    bsax = a;
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() == 0) {
                        new String("exception is ");
                    } else {
                        "exception is ".concat(valueOf);
                    }
                    bsax = null;
                }
                bfja bfja = new bfja(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bsax, bfjy, bfjf);
                this.f114203n = bfmm;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new bfiv(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i));
                arrayList.add(bfja);
                arrayList.add(new bfjk(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i, bfjf, bfjy));
                arrayList.add(new bfiy(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i, bglw));
                arrayList.add(new bfkb(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i, bfjf, bfja, bfjy, bglw, new bfjx(bfjy.f114242j, bgmk, bfjf)));
                arrayList.add(new bfjt(bgnp, bgmk, bgns, bfcu, bgoj, bglw, bhaz, this.f114055i));
                bfit[] bfitArr = (bfit[]) arrayList.toArray(new bfit[0]);
                this.f114200k = bfitArr;
                this.f114201l = bfitArr[0];
            }
        }
        bsax = null;
        bfja bfja2 = new bfja(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bsax, bfjy, bfjf);
        this.f114203n = bfmm;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new bfiv(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i));
        arrayList2.add(bfja2);
        arrayList2.add(new bfjk(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i, bfjf, bfjy));
        arrayList2.add(new bfiy(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i, bglw));
        arrayList2.add(new bfkb(bgnp, bgmk, bgns, bfcu, bgoj, bhaz, this.f114055i, bfjf, bfja2, bfjy, bglw, new bfjx(bfjy.f114242j, bgmk, bfjf)));
        arrayList2.add(new bfjt(bgnp, bgmk, bgns, bfcu, bgoj, bglw, bhaz, this.f114055i));
        bfit[] bfitArr2 = (bfit[]) arrayList2.toArray(new bfit[0]);
        this.f114200k = bfitArr2;
        this.f114201l = bfitArr2[0];
    }

    /* renamed from: a */
    private final void m97027a(bfit bfit) {
        bfit bfit2 = this.f114201l;
        if (bfit2 != bfit) {
            Object[] objArr = {bfit2.getClass().getSimpleName(), bfit.getClass().getSimpleName()};
        }
    }

    /* renamed from: b */
    public final void mo61756b() {
        this.f114201l.mo61756b();
        if (this.f114201l.mo61760c()) {
            bfit[] bfitArr = this.f114200k;
            int length = bfitArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                bfit bfit = bfitArr[i];
                if (bfit != this.f114201l) {
                    bfit.mo61756b();
                    if (!bfit.mo61760c()) {
                        m97027a(bfit);
                        this.f114201l = bfit;
                        break;
                    }
                }
                i++;
            }
            bfit bfit2 = this.f114201l;
            if (bfit2 != this.f114200k[0] && bfit2.mo61760c()) {
                m97027a(this.f114200k[0]);
                this.f114201l = this.f114200k[0];
            }
        }
    }

    /* renamed from: c */
    public final void mo61759c(boolean z) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61759c(z);
        }
        mo61756b();
    }

    /* renamed from: d */
    public final void mo61762d() {
        for (bfit bfit : this.f114200k) {
            bfit.mo61762d();
        }
        mo61756b();
    }

    /* renamed from: e */
    public final void mo61765e() {
        for (bfit bfit : this.f114200k) {
            bfit.mo61765e();
        }
        mo61756b();
    }

    /* renamed from: g */
    public final void mo61770g(long j) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61770g(j);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61743a(int i, int i2, boolean z) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61743a(i, i2, z);
        }
        mo61756b();
    }

    /* renamed from: c */
    public final boolean mo61760c() {
        return this.f114201l.mo61760c();
    }

    /* renamed from: d */
    public final void mo61763d(boolean z) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61763d(z);
        }
        mo61756b();
    }

    /* renamed from: e */
    public final void mo61766e(boolean z) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61766e(z);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61744a(bfct bfct) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61744a(bfct);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61745a(bfmn bfmn) {
        if (this.f114203n.mo61946b()) {
            for (bfit bfit : this.f114200k) {
                bfit.mo61745a(bfmn);
            }
            mo61756b();
        }
    }

    /* renamed from: b */
    public final void mo61757b(boolean z) {
        bfjb.f114147a = z;
        for (bfit bfit : this.f114200k) {
            bfit.mo61757b(z);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61746a(bfnx bfnx) {
        bfcy bfcy = this.f114202m;
        if (!(bfcy == null || bfnx == null)) {
            long c = bfcy.f113450b.mo62776c();
            for (int i = 0; i < bfnx.mo62006b(); i++) {
                bfcy.mo61432a(bfnx.mo62003a(i), c);
            }
        }
        for (bfit bfit : this.f114200k) {
            bfit.mo61746a(bfnx);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61747a(bgjm bgjm) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61747a(bgjm);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61748a(bgnq bgnq) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61748a(bgnq);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61749a(bsax bsax) {
        this.f114201l.mo61749a(bsax);
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61750a(ActivityRecognitionResult activityRecognitionResult) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61750a(activityRecognitionResult);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61751a(PrintWriter printWriter) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61751a(printWriter);
        }
    }

    /* renamed from: a */
    public final void mo61752a(Object obj) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61752a(obj);
        }
        mo61756b();
    }

    /* renamed from: a */
    public final void mo61753a(boolean z) {
        for (bfit bfit : this.f114200k) {
            bfit.mo61753a(z);
        }
        mo61756b();
    }
}
