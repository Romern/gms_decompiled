package p000;

import android.view.View;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: atmq */
final /* synthetic */ class atmq implements View.OnClickListener {

    /* renamed from: a */
    private final atmu f90502a;

    /* renamed from: b */
    private final boolean f90503b;

    /* renamed from: c */
    private final CardInfo f90504c;

    public atmq(atmu atmu, boolean z, CardInfo cardInfo) {
        this.f90502a = atmu;
        this.f90503b = z;
        this.f90504c = cardInfo;
    }

    public void onClick(View view) {
        atmu atmu = this.f90502a;
        boolean z = this.f90503b;
        CardInfo cardInfo = this.f90504c;
        if (!z) {
            atam atam = atmu.f90510c;
            bxvd da = bpbx.f135635S.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbx bpbx = (bpbx) da.f164949b;
            bpbx.f135657c = 131;
            bpbx.f135655a = 1 | bpbx.f135655a;
            atam.mo49741a((bpbx) da.mo74062i());
            atmu.f90514g.mo24746g(cardInfo.f108340a).mo50373a(new atms(atmu, cardInfo));
            view.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
            return;
        }
        atmu.f90508a.setChecked(true);
    }
}
