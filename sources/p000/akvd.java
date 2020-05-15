package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.processors.BlurDetectorImpl;

/* renamed from: akvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvd extends akuu {

    /* renamed from: a */
    public akvb f72941a;

    /* renamed from: b */
    private final cijl f72942b;

    /* renamed from: c */
    private final BlurDetectorImpl f72943c;

    /* renamed from: d */
    private final aksc f72944d;

    /* renamed from: e */
    private final boolean f72945e;

    /* renamed from: f */
    private final cijl f72946f;

    /* renamed from: g */
    private final cijl f72947g;

    /* renamed from: h */
    private final Handler f72948h = new adzt(Looper.getMainLooper());

    /* renamed from: i */
    private final long f72949i;

    /* renamed from: j */
    private long f72950j;

    public akvd(cijl cijl, BlurDetectorImpl blurDetectorImpl, aksc aksc, boolean z, cijl cijl2, cijl cijl3, long j) {
        this.f72942b = cijl;
        this.f72944d = aksc;
        this.f72945e = z;
        this.f72946f = cijl2;
        this.f72943c = blurDetectorImpl;
        this.f72947g = cijl3;
        this.f72949i = j;
        this.f72950j = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
        this.f72944d.mo39763b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        OcrImage ocrImage = (OcrImage) obj;
        if (!((akqc) this.f72946f).mo6445a().mo39669c() || this.f72945e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f72950j;
            long j2 = this.f72949i;
            boolean a = this.f72943c.mo44745a(ocrImage, ((akqm) this.f72942b).mo6445a());
            if (elapsedRealtime - j >= j2 || a) {
                this.f72950j = SystemClock.elapsedRealtime();
                ((akqd) this.f72947g).mo6445a().mo39665a();
                this.f72948h.post(new akvc(this));
                if (a && this.f72945e) {
                    return new Pair(false, null);
                }
            }
        }
        return new Pair(true, ocrImage);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f72944d.mo39757a(j);
    }
}
