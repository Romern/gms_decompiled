package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.SearchView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.search.SearchItemsListView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: fbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fbh extends fbz {

    /* renamed from: a */
    public ffb f16193a;

    /* renamed from: b */
    public FadeInImageView f16194b;

    /* renamed from: c */
    public TextView f16195c;

    /* renamed from: d */
    public SearchView f16196d;

    /* renamed from: e */
    public InputMethodManager f16197e;

    /* renamed from: f */
    public SwipeRefreshLayout f16198f;

    /* renamed from: g */
    public bsxu f16199g;

    /* renamed from: h */
    public String f16200h;

    /* renamed from: i */
    public fgt f16201i;

    /* renamed from: a */
    public static fbh m11396a(ffa ffa) {
        fbh fbh = new fbh();
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenKey", epr.m10927b(((fcn) ffa).f16282a));
        fbh.setArguments(bundle);
        return fbh;
    }

    /* renamed from: a */
    public final boolean mo10583a(bsul bsul) {
        return (bsul.f147144a & 64) != 0;
    }

    /* renamed from: aU */
    public final bsxn mo10584aU() {
        return this.f16193a.mo10768a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f16196d.setFocusable(true);
        this.f16196d.requestFocus();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9) {
            ffb ffb = this.f16193a;
            ffb.f16427c.mo10680a(((fcn) ffb.f16425a).f16282a);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f16201i = ((eyn) activity).mo6339b().mo10587c();
        ffa a = ffa.m11580a(epr.m10932d(getArguments().getByteArray("screenKey")));
        ffg c = ((ffh) activity).mo6340c();
        ffb ffb = new ffb(a, c.f16446a, c.f16447b);
        this.f16193a = ffb;
        ffb.f16428d.mo2445a(this, new fau(this));
        this.f16193a.f16430f.mo2445a(this, new faw(this));
        this.f16193a.f16429e.mo2445a(this, new fax(this));
        this.f16193a.f16431g.mo2445a(this, new fay(this));
        this.f16193a.f16432h.mo2445a(this, new faz(this));
        this.f16197e = (InputMethodManager) getContext().getSystemService("input_method");
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
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_search_screen_fragment, viewGroup, false);
        fba fba = new fba(this);
        Toolbar toolbar = (Toolbar) inflate.findViewById(C0126R.C0129id.toolbar);
        toolbar.mo1690d(!evi.m11187a(getContext()) ? C0126R.C0127drawable.quantum_ic_arrow_back_vd_theme_24 : C0126R.C0127drawable.quantum_ic_arrow_forward_vd_theme_24);
        toolbar.mo1684c((int) C0126R.string.abc_action_bar_up_description);
        toolbar.mo1678a(new fbb(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.swipe_refresh_layout);
        this.f16198f = swipeRefreshLayout;
        adyg.m51403a(swipeRefreshLayout, eot.f15436a, 16842801);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f16198f;
        ffb ffb = this.f16193a;
        ffb.getClass();
        swipeRefreshLayout2.f1697a = new fbc(ffb);
        SwipeRefreshLayout swipeRefreshLayout3 = this.f16198f;
        swipeRefreshLayout3.mo2091a(true, swipeRefreshLayout3.f1705i);
        this.f16243j = (evj) inflate.findViewById(C0126R.C0129id.search_items_list);
        SearchItemsListView searchItemsListView = (SearchItemsListView) this.f16243j;
        searchItemsListView.f7779f = this.f16201i;
        searchItemsListView.setOnTouchListener(fba);
        ((SearchItemsListView) this.f16243j).f7774a = new fbd(this);
        ((SearchItemsListView) this.f16243j).f7775b = new fbe(this);
        mo10663a(bundle);
        FadeInImageView fadeInImageView = (FadeInImageView) inflate.findViewById(C0126R.C0129id.illustration);
        this.f16194b = fadeInImageView;
        fadeInImageView.setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.result_number);
        this.f16195c = textView;
        textView.setText(getString(C0126R.string.as_all_results));
        this.f16195c.setOnTouchListener(fba);
        ((SearchItemsListView) this.f16243j).setFocusable(false);
        this.f16195c.setFocusable(false);
        SearchView searchView = (SearchView) inflate.findViewById(C0126R.C0129id.search_bar);
        this.f16196d = searchView;
        View findViewById = searchView.findViewById(C0126R.C0129id.search_edit_frame);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (evi.m11187a(getContext())) {
                    marginLayoutParams.rightMargin = 0;
                } else {
                    marginLayoutParams.leftMargin = 0;
                }
            }
        }
        View findViewById2 = searchView.findViewById(C0126R.C0129id.search_src_text);
        if (findViewById2 != null) {
            if (evi.m11187a(getContext())) {
                findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop(), 0, findViewById2.getPaddingBottom());
            } else {
                findViewById2.setPadding(0, findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams2.height = -1;
            findViewById2.setLayoutParams(layoutParams2);
        }
        this.f16196d.f1261n = new fav(this);
        this.f16196d.f1260m = new fbf(this);
        SearchView searchView2 = this.f16196d;
        searchView2.mo1613a(searchView2.f1251a.getImeOptions() | 301989894);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10582a() {
        return ((SearchItemsListView) this.f16243j).mo6332a();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10646a(bswf bswf, String str) {
        bswd bswd = bswf.f147394e;
        if (bswd == null) {
            bswd = bswd.f147378c;
        }
        if (!stm.m36302d(bswd.f147380a)) {
            try {
                bswd bswd2 = bswf.f147394e;
                if (bswd2 == null) {
                    bswd2 = bswd.f147378c;
                }
                String str2 = bswd2.f147380a;
                bswd bswd3 = bswf.f147394e;
                if (bswd3 == null) {
                    bswd3 = bswd.f147378c;
                }
                startActivity(evo.m11196a(getContext(), evo.m11197a(str2.replace(bswd3.f147381b, URLEncoder.encode(str, "UTF-8")), false, null)));
            } catch (ActivityNotFoundException | UnsupportedEncodingException e) {
            }
        }
    }
}
