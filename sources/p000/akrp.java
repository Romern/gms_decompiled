package p000;

import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: akrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ OcrImage f72510a;

    /* renamed from: b */
    final /* synthetic */ akrq f72511b;

    public akrp(akrq akrq, OcrImage ocrImage) {
        this.f72511b = akrq;
        this.f72510a = ocrImage;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void
     arg types: [com.google.android.gms.ocr.base.OcrImage, int]
     candidates:
      akru.a(boolean, boolean):void
      akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void */
    public final void run() {
        this.f72511b.f72512a.f72405d.mo39759a(botk.MANUAL);
        this.f72511b.f72512a.mo39737a(this.f72510a, false);
        this.f72511b.f72512a.mo39741b(true);
    }
}
