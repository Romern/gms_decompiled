package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.BottomNavMenuScrollView;

/* renamed from: exx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class exx extends fbv {

    /* renamed from: a */
    public fcs f15999a;

    /* renamed from: b */
    public bsuw f16000b;

    /* renamed from: c */
    public View f16001c;

    /* renamed from: d */
    public CardView f16002d;

    /* renamed from: e */
    public BottomNavMenuScrollView f16003e;

    /* renamed from: f */
    public View f16004f;

    /* renamed from: g */
    public LinearLayout f16005g;

    /* renamed from: h */
    public bsxn f16006h;

    /* renamed from: i */
    public String f16007i;

    /* renamed from: j */
    public fgt f16008j;

    /* renamed from: a */
    public final void mo10568a(exw exw) {
        fcc.m11454a(getView());
        this.f16003e.smoothScrollTo(0, 0);
        this.f16001c.animate().alpha(0.0f).start();
        new adzt(Looper.getMainLooper()).postDelayed(new exh(this, exw), 250);
    }

    public final void onAttach(Activity activity) {
        bsva bsva;
        bsuw bsuw;
        super.onAttach(activity);
        this.f16008j = ((eyn) activity).mo6339b().mo10587c();
        fcs a = ((ffh) getActivity()).mo6340c().mo10771a(fcr.m11488a(epr.m10921a(getArguments().getByteArray("bottomNavKey"))));
        this.f15999a = a;
        epq d = a.f16285c.mo10686d(((fch) a.f16283a).f16268a);
        if (d.f15491a.f147581b == 7) {
            int i = getArguments().getInt("selectedTabKey");
            bsxk bsxk = d.f15491a;
            if (bsxk.f147581b == 7) {
                bsva = (bsva) bsxk.f147582c;
            } else {
                bsva = bsva.f147219b;
            }
            bxwc bxwc = bsva.f147221a;
            if (i < bxwc.size() && ((bsuv) bxwc.get(i)).f147199b == 3) {
                bsuv bsuv = (bsuv) bxwc.get(i);
                if (bsuv.f147199b == 3) {
                    bsuw = (bsuw) bsuv.f147200c;
                } else {
                    bsuw = bsuw.f147204b;
                }
                this.f16000b = bsuw;
                this.f16007i = ((bsuv) bxwc.get(i)).f147201d;
                this.f16006h = epr.m10921a(getArguments().getByteArray("selectedViewKey"));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_bottom_nav_menu_drawer, viewGroup, false);
        this.f16001c = inflate.findViewById(C0126R.C0129id.menu_background);
        this.f16005g = (LinearLayout) inflate.findViewById(C0126R.C0129id.menu_list);
        this.f16002d = (CardView) inflate.findViewById(C0126R.C0129id.menu_card_background);
        this.f16003e = (BottomNavMenuScrollView) inflate.findViewById(C0126R.C0129id.menu_card_scrollview);
        View findViewById = inflate.findViewById(C0126R.C0129id.menu_card_top_space);
        this.f16004f = findViewById;
        findViewById.setOnClickListener(new exg(this));
        this.f16003e.f7785d = new exk(this);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        inflate.setOnKeyListener(new exl(this));
        fcc.m11455b(inflate);
        return inflate;
    }

    public final void onStart() {
        bsuz bsuz;
        boolean z;
        bsuz bsuz2;
        super.onStart();
        if (this.f16000b == null) {
            mo10568a(null);
            return;
        }
        this.f16002d.setVisibility(4);
        this.f16005g.removeAllViews();
        bxwc bxwc = this.f16000b.f147206a;
        int size = bxwc.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            bsux bsux = (bsux) bxwc.get(i);
            int i2 = bsux.f147209a;
            if (i2 == 2) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(adyg.m51399a(getContext(), (int) C0126R.attr.asDivider, (int) C0126R.C0127drawable.as_divider_light));
                C1280ps.m19885a(imageView, getResources().getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_icon_space), 0, 0, 0);
                this.f16005g.addView(imageView);
            } else if (i2 == 1) {
                exm exm = new exm(this);
                if (bsux.f147209a != 1) {
                    bsuz = bsuz.f147213e;
                } else {
                    bsuz = (bsuz) bsux.f147210b;
                }
                bsxn bsxn = bsuz.f147216b;
                if (bsxn == null) {
                    bsxn = bsxn.f147586d;
                }
                if (bsxn.f147589b == this.f16006h.f147589b) {
                    z = true;
                } else {
                    z = false;
                }
                if (bsux.f147209a == 1) {
                    bsuz2 = (bsuz) bsux.f147210b;
                } else {
                    bsuz2 = bsuz.f147213e;
                }
                this.f16005g.addView(new exy(bsuz2, this.f16005g, z, exm, this.f16008j).mo10570b());
            }
        }
        if (cbri.f178135a.mo6606a().mo75255e()) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(adyg.m51399a(getContext(), (int) C0126R.attr.asDivider, (int) C0126R.C0127drawable.as_divider_light));
            C1280ps.m19885a(imageView2, getResources().getDimensionPixelSize(C0126R.dimen.as_bottom_drawer_icon_space), 0, 0, 0);
            this.f16005g.addView(imageView2);
            mo10569a(new exn(this), "[DEBUG] clear local cache");
            fcs fcs = this.f15999a;
            fcs.getClass();
            mo10569a(new exo(fcs), "[DEBUG] clear dismissed prompt cards");
            int i3 = Build.VERSION.SDK_INT;
            fcs fcs2 = this.f15999a;
            fcs2.getClass();
            mo10569a(new exp(fcs2), "[DEBUG] clear dismissed onboarding flows");
            if (cbro.m128201e()) {
                int i4 = Build.VERSION.SDK_INT;
                mo10569a(new exq(this), "[DEBUG] force toggle dark mode");
                mo10569a(new exr(this), "[DEBUG] clear dark mode override");
            }
        }
        if (getActivity().getResources().getConfiguration().orientation == 2) {
            z2 = true;
        }
        this.f16002d.addOnLayoutChangeListener(new exv(this, z2, (AccessibilityManager) getContext().getSystemService("accessibility")));
        this.f16001c.setAlpha(0.0f);
        this.f16001c.animate().alpha(0.6f).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10569a(exw exw, String str) {
        bxvd da = bsuz.f147213e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsuz bsuz = (bsuz) da.f164949b;
        str.getClass();
        bsuz.f147215a |= 2;
        bsuz.f147217c = str;
        bsxn bsxn = epr.f15494a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsuz bsuz2 = (bsuz) da.f164949b;
        bsxn.getClass();
        bsuz2.f147216b = bsxn;
        bsuz2.f147215a |= 1;
        bsuz bsuz3 = (bsuz) da.mo74062i();
        LinearLayout linearLayout = this.f16005g;
        linearLayout.addView(new exy(bsuz3, linearLayout, false, new exs(this, exw), this.f16008j).mo10570b());
    }
}
