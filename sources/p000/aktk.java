package p000;

import android.os.SystemClock;
import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: aktk */
final /* synthetic */ class aktk implements akri {

    /* renamed from: a */
    private final aktm f72745a;

    public aktk(aktm aktm) {
        this.f72745a = aktm;
    }

    /* renamed from: a */
    public final void mo39680a(OcrImage ocrImage) {
        aktm aktm = this.f72745a;
        if (SystemClock.elapsedRealtime() - aktm.f72762r >= 4000 && aktm.f72759o.mo44745a(ocrImage, aktm.f72407f.mo6445a())) {
            aktm.f72762r = SystemClock.elapsedRealtime();
            ((akqd) aktm.f72403b).mo6445a().mo39665a();
        }
        aktm.f72761q = ocrImage;
        aktm.f72763s.post(new aktl(aktm));
    }
}
