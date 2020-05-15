package p000;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.pay.PayGlobalActionCard;

/* renamed from: aspt */
final /* synthetic */ class aspt implements bmxj {

    /* renamed from: a */
    private final asqc f89363a;

    public aspt(asqc asqc) {
        this.f89363a = asqc;
    }

    public final Object apply(Object obj) {
        Bitmap bitmap;
        asqc asqc = this.f89363a;
        PayGlobalActionCard payGlobalActionCard = (PayGlobalActionCard) obj;
        Bitmap bitmap2 = payGlobalActionCard.f81549g;
        if (bitmap2 != null) {
            bitmap = aten.m75739a(bitmap2);
        } else {
            bitmap = null;
        }
        String str = payGlobalActionCard.f81546d;
        if (TextUtils.isEmpty(str)) {
            str = asqc.f89376b.getString(C0126R.string.tp_global_actions_cta_message);
        }
        aspq aspq = new aspq();
        aspq.mo49339a(payGlobalActionCard.f81543a);
        aspq.mo49342a(payGlobalActionCard.f81544b);
        aspq.mo49341a(aten.m75739a(payGlobalActionCard.f81545c));
        aspq.mo49344b(str);
        aspq.mo49345c(payGlobalActionCard.f81547e);
        aspq.mo49343b(bitmap);
        aspq.mo49340a(payGlobalActionCard.f81550h);
        return aspq.f89360a;
    }
}
