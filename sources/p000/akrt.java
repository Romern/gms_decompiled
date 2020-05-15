package p000;

import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: akrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akrt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ OcrImage f72516a;

    /* renamed from: b */
    final /* synthetic */ akru f72517b;

    public akrt(akru akru, OcrImage ocrImage) {
        this.f72517b = akru;
        this.f72516a = ocrImage;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void
     arg types: [com.google.android.gms.ocr.base.OcrImage, int]
     candidates:
      akru.a(boolean, boolean):void
      akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void */
    public final void run() {
        if (this.f72517b.isResumed()) {
            akru akru = this.f72517b;
            if (akru.f72534v == null) {
                akru.f72405d.mo39759a(botk.AUTOMATIC);
                this.f72517b.mo39737a(this.f72516a, true);
                this.f72517b.f72528p.vibrate(50);
            }
        }
    }
}
