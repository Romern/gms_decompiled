package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.ocr.CreditCardOcrResult;
import java.time.YearMonth;

/* renamed from: lmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lmi extends lim {

    /* renamed from: d */
    private final Intent f26379d;

    /* renamed from: e */
    private final FillForm f26380e;

    public lmi(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        Intent intent = (Intent) lqx.m19548a((Bundle) bundle.getParcelable("com.google.android.gms.autofill.extra.INTENT"));
        if (intent != null) {
            FillForm fillForm = (FillForm) lqx.m19548a((Bundle) bundle.getParcelable("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL"));
            if (fillForm != null) {
                this.f26379d = intent;
                this.f26380e = fillForm;
                return;
            }
            throw new lik("FillForm must be present in provided state bundle.");
        }
        throw new lik("OCR intent must be present in provided state bundle.");
    }

    /* renamed from: a */
    public final void mo15164a() {
        int i;
        if (!this.f26160b.getBoolean("started", false)) {
            this.f26160b.putBoolean("started", true);
            this.f26159a.startActivityForResult(this.f26379d, 0);
        }
        lir lir = this.f26159a;
        if (!ccip.m129866f()) {
            i = 2132019641;
        } else {
            i = 2132019637;
        }
        lir.setTheme(i);
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        bmxv bmxv;
        YearMonth yearMonth;
        CreditCardOcrResult a = CreditCardOcrResult.m67675a(intent);
        if (a != null) {
            kdj kdj = new kdj(a.f81228a);
            if (a.mo44703a()) {
                yearMonth = YearMonth.of(a.f81230c, a.f81229b);
            } else {
                yearMonth = null;
            }
            bmxv = bmxv.m108566b(new PaymentCard(kdj, null, a.f81232e, yearMonth, null, 0));
        } else {
            bmxv = bmvz.f131120a;
        }
        if (!bmxv.mo66813a()) {
            mo15165a(0);
            return;
        }
        kre a2 = krc.m18382a(this.f26159a);
        bmxv c = bmxv.m108567c(a2.mo14839n().mo14817a(a2.mo14827b().mo14409a((PaymentCard) bmxv.mo66814b(), this.f26380e)));
        if (!c.mo66813a()) {
            mo15165a(0);
        } else {
            mo15167a(-1, new Intent().putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", ((kbz) c.mo66814b()).f23732a));
        }
    }
}
