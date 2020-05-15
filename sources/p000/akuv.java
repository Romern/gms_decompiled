package p000;

import android.graphics.Rect;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.processors.CardDetector;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: akuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akuv implements Callable {

    /* renamed from: a */
    final /* synthetic */ Rect f72918a;

    /* renamed from: b */
    final /* synthetic */ CardDetector f72919b;

    /* renamed from: c */
    final /* synthetic */ OcrImage f72920c;

    /* renamed from: d */
    final /* synthetic */ CardDetector.Options f72921d;

    /* renamed from: e */
    final /* synthetic */ akuy f72922e;

    public akuv(akuy akuy, Rect rect, CardDetector cardDetector, OcrImage ocrImage, CardDetector.Options options) {
        this.f72922e = akuy;
        this.f72918a = rect;
        this.f72919b = cardDetector;
        this.f72920c = ocrImage;
        this.f72921d = options;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Rect rect = new Rect(this.f72918a);
        bmza b = bmza.m108659b(bmvy.f131119a);
        CardDetector cardDetector = this.f72919b;
        OcrImage ocrImage = this.f72920c;
        rect.inset(Math.round(((float) rect.width()) * 0.099999994f), Math.round(((float) rect.height()) * 0.099999994f));
        CardDetector.Options options = this.f72921d;
        cardDetector.f81329a.mo39895a();
        CardDetector.Result nativeDetectCard = cardDetector.nativeDetectCard(ocrImage, rect, options);
        this.f72922e.f72927a.mo39780i(b.mo66928a(TimeUnit.MILLISECONDS));
        float[] fArr = nativeDetectCard.f81332b;
        if (fArr != null) {
            akuy akuy = this.f72922e;
            akuy.f72928b.post(new akux(akuy, fArr));
        }
        CardDetector.CandidateDetection[] candidateDetectionArr = nativeDetectCard.f81331a;
        if (candidateDetectionArr == null || candidateDetectionArr.length <= 0) {
            return null;
        }
        this.f72922e.f72927a.mo39785n();
        return nativeDetectCard.f81331a[0].f81330a;
    }
}
