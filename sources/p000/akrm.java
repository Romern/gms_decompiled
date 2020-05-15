package p000;

import android.view.View;
import com.google.android.gms.ocr.cardcapture.CardCaptureChimeraActivity;

/* renamed from: akrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrm implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CardCaptureChimeraActivity f72507a;

    public akrm(CardCaptureChimeraActivity cardCaptureChimeraActivity) {
        this.f72507a = cardCaptureChimeraActivity;
    }

    public void onClick(View view) {
        this.f72507a.setResult(10007);
        this.f72507a.finish();
    }
}
