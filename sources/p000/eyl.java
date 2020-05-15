package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.card.widget.CardDeckView;

/* renamed from: eyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eyl extends fbz {

    /* renamed from: a */
    public fda f16032a;

    /* renamed from: b */
    public SwipeRefreshLayout f16033b;

    /* renamed from: c */
    private fgt f16034c;

    /* renamed from: a */
    public static eyl m11293a(fcz fcz) {
        eyl eyl = new eyl();
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenKey", epr.m10927b(((fci) fcz).f16269a));
        eyl.setArguments(bundle);
        return eyl;
    }

    /* renamed from: a */
    public final boolean mo10583a(bsul bsul) {
        return (bsul.f147144a & 32) != 0;
    }

    /* renamed from: aU */
    public final bsxn mo10584aU() {
        return this.f16032a.mo10730a();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9) {
            fda fda = this.f16032a;
            fda.f16297b.mo10680a(((fci) fda.f16296a).f16269a);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f16034c = ((eyn) activity).mo6339b().mo10587c();
        fcz a = fcz.m11498a(epr.m10932d(getArguments().getByteArray("screenKey")));
        ffg c = ((ffh) activity).mo6340c();
        fda fda = new fda(a, c.f16446a, c.f16447b);
        this.f16032a = fda;
        fda.f16299d.mo2445a(this, new eyc(this));
        this.f16032a.f16297b.f16264b.mo2445a(this, new eyd(this));
        this.f16032a.f16302g.mo2445a(this, new eye(this));
        this.f16032a.f16300e.mo2445a(this, new eyf(this));
        this.f16032a.f16301f.mo2445a(this, new eyg(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void
     arg types: [int, int]
     candidates:
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(int, int):android.view.animation.Animation
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_card_screen_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.swipe_refresh_layout);
        this.f16033b = swipeRefreshLayout;
        adyg.m51403a(swipeRefreshLayout, eot.f15436a, 16842801);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f16033b;
        fda fda = this.f16032a;
        fda.getClass();
        swipeRefreshLayout2.f1697a = new eyh(fda);
        SwipeRefreshLayout swipeRefreshLayout3 = this.f16033b;
        swipeRefreshLayout3.mo2091a(true, swipeRefreshLayout3.f1705i);
        this.f16243j = (evj) inflate.findViewById(C0126R.C0129id.cards_list);
        ((CardDeckView) this.f16243j).f7764a = new eyi(this);
        ((CardDeckView) this.f16243j).f7766c = new eyj(this);
        CardDeckView cardDeckView = (CardDeckView) this.f16243j;
        fgt fgt = this.f16034c;
        bdej a = ((evc) getActivity()).mo6337a();
        if (cardDeckView.f7773j == null && cardDeckView.f7769f == null) {
            z = true;
        }
        bmxy.m108601b(z, "initialize() should be called exactly once.");
        cardDeckView.f7773j = fgt;
        cardDeckView.f7769f = a;
        mo10663a(bundle);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10582a() {
        return ((CardDeckView) this.f16243j).getResources().getDimensionPixelSize(C0126R.dimen.as_card_deck_vertical_padding);
    }
}
