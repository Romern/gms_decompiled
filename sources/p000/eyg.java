package p000;

import com.google.android.gms.accountsettings.p007mg.poc.p008ui.card.widget.CardDeckView;

/* renamed from: eyg */
final /* synthetic */ class eyg implements C0038ax {

    /* renamed from: a */
    private final eyl f16027a;

    public eyg(eyl eyl) {
        this.f16027a = eyl;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        eyl eyl = this.f16027a;
        boolean d = eyl.mo10664d();
        CardDeckView cardDeckView = (CardDeckView) eyl.f16243j;
        evk evk = (evk) ((bmxv) obj).mo66815c();
        eyk eyk = new eyk(eyl);
        cardDeckView.f7767d = evk;
        cardDeckView.f7768e = eyk;
        if (cardDeckView.f7765b == null) {
            cardDeckView.mo6331b();
        }
        cardDeckView.f7765b.mo10554a(evk, eyk);
        if (d) {
            ((CardDeckView) eyl.f16243j).getLayoutManager().mo63b(0, 0);
        }
    }
}
