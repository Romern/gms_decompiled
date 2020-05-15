package p000;

import com.google.android.gms.accountsettings.p007mg.poc.p008ui.card.widget.CardDeckView;
import java.util.List;

/* renamed from: eyc */
final /* synthetic */ class eyc implements C0038ax {

    /* renamed from: a */
    private final eyl f16023a;

    public eyc(eyl eyl) {
        this.f16023a = eyl;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        List list = (List) obj;
        CardDeckView cardDeckView = (CardDeckView) this.f16023a.f16243j;
        if (!bmxi.m108538a(cardDeckView.f7772i, list)) {
            cardDeckView.f7772i = list;
            cardDeckView.mo6330a();
        }
    }
}
