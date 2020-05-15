package p000;

import android.view.View;
import android.widget.ImageButton;
import com.google.android.gms.ocr.giftcard.GiftCardOcrChimeraActivity;

/* renamed from: akts */
public final /* synthetic */ class akts implements View.OnClickListener {

    /* renamed from: a */
    private final GiftCardOcrChimeraActivity f72780a;

    /* renamed from: b */
    private final ImageButton f72781b;

    public akts(GiftCardOcrChimeraActivity giftCardOcrChimeraActivity, ImageButton imageButton) {
        this.f72780a = giftCardOcrChimeraActivity;
        this.f72781b = imageButton;
    }

    public void onClick(View view) {
        GiftCardOcrChimeraActivity giftCardOcrChimeraActivity = this.f72780a;
        ImageButton imageButton = this.f72781b;
        giftCardOcrChimeraActivity.f81317b++;
        imageButton.setEnabled(false);
        giftCardOcrChimeraActivity.setResult(10007, giftCardOcrChimeraActivity.mo44744e());
        giftCardOcrChimeraActivity.finish();
    }
}
