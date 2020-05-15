package p000;

import android.view.View;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: aual */
final /* synthetic */ class aual implements View.OnClickListener {

    /* renamed from: a */
    private final auao f91324a;

    public aual(auao auao) {
        this.f91324a = auao;
    }

    public void onClick(View view) {
        auao auao = this.f91324a;
        CardInfo cardInfo = (CardInfo) auao.getArguments().getParcelable("KEY_CARD_INFO");
        auaj auaj = auao.f91330d;
        if (auaj != null) {
            auaj.mo49538a(cardInfo).mo50374a(auao.f91329c, new auan(auao));
        }
        auao.dismiss();
    }
}
