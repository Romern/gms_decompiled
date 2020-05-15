package p000;

import android.os.Vibrator;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.processors.BlurDetectorImpl;
import com.google.android.gms.ocr.processors.CardDetector;
import com.google.android.gms.ocr.processors.CardRectifier;
import com.google.android.gms.ocr.processors.StrictCardDetector;

/* renamed from: akrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrz extends akqe {

    /* renamed from: j */
    private final akur f72541j = new akur(new akry());

    /* renamed from: k */
    private final aksa f72542k;

    /* renamed from: l */
    private final Vibrator f72543l;

    /* JADX WARNING: Illegal instructions before constructor call */
    public akrz(Activity activity) {
        super(r1, 4, new akty(), null);
        CardDetector cardDetector;
        Activity activity2 = activity;
        akvk akvk = new akvk(activity2);
        akvd akvd = new akvd(this.f72427f, new BlurDetectorImpl(akvk), this.f72429h, this.f72428g.mo39851a(), this.f72425d, this.f72426e, this.f72428g.mo39861k());
        StrictCardDetector strictCardDetector = new StrictCardDetector(akvk);
        if (this.f72428g.mo39853c()) {
            cardDetector = new CardDetector(akvk);
        } else {
            cardDetector = null;
        }
        this.f72542k = new aksa(new akvh(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, this.f72429h), akvd, new akuz(this.f72541j), new akuy(this.f72428g, strictCardDetector, cardDetector, new CardRectifier(akvk), this.f72427f, this.f72429h, true), new akrw());
        this.f72543l = (Vibrator) activity2.getSystemService("vibrator");
    }

    /* renamed from: a */
    public final void mo39749a(akru akru) {
        super.mo39701a((akpv) akru);
        akru.f72526n = this.f72542k;
        akru.f72527o = this.f72541j;
        akru.f72528p = this.f72543l;
    }
}
