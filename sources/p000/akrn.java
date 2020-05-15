package p000;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.ocr.cardcapture.CardCaptureChimeraActivity;

/* renamed from: akrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrn extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ CardCaptureChimeraActivity f72508a;

    public akrn(CardCaptureChimeraActivity cardCaptureChimeraActivity) {
        this.f72508a = cardCaptureChimeraActivity;
    }

    public void onClick(View view) {
        this.f72508a.setResult(10007);
        this.f72508a.finish();
    }
}
