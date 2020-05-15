package p000;

import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.gms.autofill.service.common.ClientState;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: lha */
final /* synthetic */ class lha implements bqeh {

    /* renamed from: a */
    private final lhe f26078a;

    /* renamed from: b */
    private final PaymentCard f26079b;

    /* renamed from: c */
    private final PaymentCard f26080c;

    /* renamed from: d */
    private final ClientState f26081d;

    /* renamed from: e */
    private final kel f26082e;

    public lha(lhe lhe, PaymentCard paymentCard, PaymentCard paymentCard2, ClientState clientState, kel kel) {
        this.f26078a = lhe;
        this.f26079b = paymentCard;
        this.f26080c = paymentCard2;
        this.f26081d = clientState;
        this.f26082e = kel;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        byte[] bArr;
        lhe lhe = this.f26078a;
        PaymentCard paymentCard = this.f26079b;
        PaymentCard paymentCard2 = this.f26080c;
        ClientState clientState = this.f26081d;
        kel kel = this.f26082e;
        bmxv bmxv = (bmxv) obj;
        HashSet<lin> hashSet = new HashSet();
        if (bmxv != null && !bmxv.mo66813a() && paymentCard.f11615c == null) {
            hashSet.add(lin.CARD_HOLDER_NAME);
        }
        if (paymentCard2.f11616d == null) {
            hashSet.add(lin.EXPIRATION_DATE);
        }
        if (hashSet.isEmpty() || (bArr = clientState.f11669a) == null) {
            return lhe.m19050a(lhe.f26091c.mo14430a(new kem(kel, paymentCard)));
        }
        ArrayList arrayList = new ArrayList();
        for (lin lin : hashSet) {
            arrayList.add(lin.name());
        }
        lhe.f26090b.startActivity(lio.m19200c(23).putExtra("com.google.android.gms.autofill.extra.PAYMENT_CARD", lqx.m19547a(paymentCard2)).putExtra("android.view.autofill.extra.CLIENT_STATE", bArr).putStringArrayListExtra("com.google.android.gms.autofill.extra.FIX_FLOW_COMPONENT", arrayList).addFlags(268435456));
        return lhe.m19050a(null);
    }
}
