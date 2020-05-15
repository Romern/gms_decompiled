package p000;

import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.PaymentCard;
import java.time.YearMonth;

/* renamed from: llp */
final /* synthetic */ class llp implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final llz f26326a;

    public llp(llz llz) {
        this.f26326a = llz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        YearMonth yearMonth;
        llz llz = this.f26326a;
        YearMonth yearMonth2 = null;
        if (llz.f26342i) {
            str = llz.f26349p.getText().toString();
        } else {
            str = null;
        }
        if (llz.f26341h) {
            String replaceAll = llz.f26347n.getText().toString().replaceAll("[^\\d]", "");
            yearMonth2 = YearMonth.of(Integer.parseInt(replaceAll.substring(2, 4)) + 2000, Integer.parseInt(replaceAll.substring(0, 2)));
        }
        PaymentCard paymentCard = llz.f26340g;
        kdj kdj = paymentCard.f11613a;
        kdj kdj2 = paymentCard.f11614b;
        if (str == null) {
            str = paymentCard.f11615c;
        }
        String str2 = str;
        if (yearMonth2 != null) {
            yearMonth = yearMonth2;
        } else {
            yearMonth = paymentCard.f11616d;
        }
        kem kem = new kem(new kel(llz.f26338e, new kck("", ""), bmvz.f131120a, bnon.f131923a, llz.f26343j, bmvz.f131120a), new PaymentCard(kdj, kdj2, str2, yearMonth, paymentCard.f11617e, paymentCard.f11618f));
        bmxv e = llz.f26339f.mo14867e();
        if (e.mo66813a()) {
            ((keo) e.mo66814b()).mo14430a(kem);
        }
        llz.mo15165a(-1);
        llz.f26159a.overridePendingTransition(0, C0126R.anim.fragment_fade_exit);
    }
}
