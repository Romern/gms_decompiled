package p000;

import android.widget.ImageView;
import com.google.android.gms.pay.PayCardArt;
import com.google.android.gms.pay.PayCardArtInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;
import java.util.Map;

/* renamed from: atny */
final /* synthetic */ class atny implements Runnable {

    /* renamed from: a */
    private final TapUiChimeraActivity f90577a;

    /* renamed from: b */
    private final PayCardArt f90578b;

    public atny(TapUiChimeraActivity tapUiChimeraActivity, PayCardArt payCardArt) {
        this.f90577a = tapUiChimeraActivity;
        this.f90578b = payCardArt;
    }

    public final void run() {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90577a;
        PayCardArt payCardArt = this.f90578b;
        PayCardArtInfo payCardArtInfo = payCardArt.f81539a;
        bnhe bnhe = tapUiChimeraActivity.f108697H;
        Map.Entry entry = null;
        if (bnhe != null && !bnhe.isEmpty()) {
            bnrd a = tapUiChimeraActivity.f108697H.entrySet().iterator();
            while (true) {
                if (!a.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) a.next();
                if (((ValuableInfo) entry2.getKey()).f108496p == payCardArtInfo.f81541a && ((ValuableInfo) entry2.getKey()).f108497q.equals(payCardArtInfo.f81542b)) {
                    entry = entry2;
                    break;
                }
            }
        } else {
            ((bnsl) TapUiChimeraActivity.f108685b.mo68388c()).mo68405a("Pay card art view map is empty.");
        }
        if (entry != null) {
            atom atom = new atom((ValuableInfo) entry.getKey(), payCardArt.f81540b);
            ImageView imageView = (ImageView) entry.getValue();
            if (imageView != null) {
                tapUiChimeraActivity.f108723p = payCardArt.f81539a.f81541a;
                if (payCardArt.f81540b != null) {
                    tapUiChimeraActivity.f108722o = true;
                }
                imageView.setImageDrawable(atom);
                TapUiChimeraActivity.m93152a(imageView);
                tapUiChimeraActivity.f108726s.childHasTransientStateChanged(imageView, true);
                return;
            }
            ((bnsl) TapUiChimeraActivity.f108685b.mo68388c()).mo68405a("View not found when updating card art");
            return;
        }
        ((bnsl) TapUiChimeraActivity.f108685b.mo68388c()).mo68405a("No ValuableInfo found for specified card");
    }
}
