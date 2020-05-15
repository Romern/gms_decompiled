package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Collections;
import java.util.List;

/* renamed from: exf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class exf extends fcb {

    /* renamed from: a */
    public fcs f15969a;

    /* renamed from: b */
    public fem f15970b;

    /* renamed from: c */
    public BottomNavigationView f15971c;

    /* renamed from: d */
    public List f15972d = Collections.emptyList();

    /* renamed from: e */
    public boolean f15973e;

    /* renamed from: f */
    public fgt f15974f;

    /* renamed from: g */
    private bsxn f15975g;

    /* renamed from: a */
    public static final int m11258a(int i) {
        return i + 1;
    }

    /* renamed from: b */
    public static final int m11259b(int i) {
        return i - 1;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f15974f = ((eyn) activity).mo6339b().mo10587c();
        fcs a = ((ffh) activity).mo6340c().mo10771a(fcr.m11488a(epr.m10932d(getArguments().getByteArray("bottomNavKey"))));
        this.f15969a = a;
        a.f16284b.mo2445a(this, new exb(this));
        this.f15969a.f16286d.f16304a.mo2445a(this, new epj(new exc(this)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_bottom_nav_frame_fragment, viewGroup, false);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) inflate.findViewById(C0126R.C0129id.bottom_nav);
        this.f15971c = bottomNavigationView;
        adyg.m51402a(bottomNavigationView, 3, eot.f15436a);
        this.f15971c.f151071d = new exd(this);
        if (bundle == null) {
            fby b = m11260b(this.f15970b);
            if (mo10661e()) {
                b.mo10660b(this.f16242m);
            }
            fbt.m11411a(b, this.f15970b.f16393b);
            fbt.m11410a(this, b, "inner", fbs.INSTANT);
            this.f15975g = epr.m10937i(this.f15970b.f16392a.mo10395b());
        }
        return inflate;
    }

    /* renamed from: b */
    private static final fby m11260b(fem fem) {
        epq epq = fem.f16392a;
        bsxn bsxn = epq.f15491a.f147583d;
        if (bsxn == null) {
            bsxn = bsxn.f147586d;
        }
        bsul b = epq.mo10395b();
        if ((b.f147144a & 64) != 0) {
            return fbh.m11396a(ffa.m11580a(bsxn));
        }
        return ezm.m11332a(fdd.m11504a(epr.m10941m(b), epr.m10929c(b), epr.m10931d(b), epr.m10933e(b), epr.m10934f(b), epr.m10939k(b), epr.m10940l(b)), fem);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final fby mo10556a() {
        return (fby) getChildFragmentManager().findFragmentByTag("inner");
    }

    /* renamed from: a */
    public final void mo10557a(fem fem) {
        epq epq = fem.f16392a;
        if (mo10558a(epq)) {
            this.f15975g = epr.m10937i(epq.mo10395b());
            mo10559b();
            fby a = mo10556a();
            if (a.mo10558a(fem.f16392a)) {
                a.mo10557a(fem);
                return;
            }
            bsxn bsxn = epq.f15491a.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            boolean a2 = sdg.m34949a(bsxn, mo10584aU());
            fby b = m11260b(fem);
            fbs fbs = fbs.INSTANT;
            if (!a2) {
                fbt.m11411a(b, fem.f16393b);
                if (!fem.f16394c) {
                    fbs = fbs.PUSH;
                } else {
                    fbs = fbs.POP;
                }
            }
            fbt.m11410a(this, b, "inner", fbs);
        }
    }

    /* renamed from: b */
    public final void mo10559b() {
        int i;
        int i2;
        bsxn bsxn = this.f15975g;
        if (bsxn != null) {
            i = 0;
            while (true) {
                if (i >= this.f15972d.size()) {
                    i = -1;
                    break;
                }
                bsuv bsuv = (bsuv) this.f15972d.get(i);
                if (bsuv.f147199b == 2 && ((bsxn) bsuv.f147200c).equals(bsxn)) {
                    break;
                }
                i++;
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            int i3 = 0;
            while (true) {
                if (i < this.f15972d.size()) {
                    if (((bsuv) this.f15972d.get(i)).f147199b == 2) {
                        break;
                    }
                    i3 = i + 1;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i == -1) {
            i = 0;
        }
        int a = m11258a(i);
        this.f15973e = true;
        int b = m11259b(this.f15971c.f151069b.f118439e);
        if (i < this.f15972d.size()) {
            BottomNavigationView bottomNavigationView = this.f15971c;
            MenuItem findItem = bottomNavigationView.f151068a.findItem(a);
            if (findItem != null && !bottomNavigationView.f151068a.mo16228a(findItem, bottomNavigationView.f151070c, 0)) {
                findItem.setChecked(true);
            }
            bsuv bsuv2 = (bsuv) this.f15972d.get(i);
            if ((bsuv2.f147198a & 4) != 0) {
                bswh bswh = bsuv2.f147203f;
                if (bswh == null) {
                    bswh = bswh.f147430g;
                }
                i2 = bswh.f147433b;
            } else {
                i2 = 0;
            }
            int a2 = eve.m11166a(getContext(), bswg.m116252a(i2));
            if (cbro.m128200d()) {
                this.f15971c.f151068a.getItem(i).setIcon(eve.m11168b(getContext(), bswg.m116252a(i2)));
            } else {
                this.f15971c.f151068a.getItem(i).setIcon(a2);
            }
            if (b != i) {
                bswh bswh2 = ((bsuv) this.f15972d.get(b)).f147202e;
                if (bswh2 == null) {
                    bswh2 = bswh.f147430g;
                }
                int i4 = bswh2.f147433b;
                int a3 = eve.m11166a(getContext(), bswg.m116252a(i4));
                if (cbro.m128200d()) {
                    this.f15971c.f151068a.getItem(b).setIcon(eve.m11168b(getContext(), bswg.m116252a(i4)));
                } else {
                    this.f15971c.f151068a.getItem(b).setIcon(a3);
                }
            }
            ffp.m11618a(this.f15971c, null, ((bsuv) this.f15972d.get(i)).f147201d);
        }
        this.f15973e = false;
    }

    /* renamed from: a */
    public final boolean mo10558a(epq epq) {
        return sdg.m34949a(epr.m10936h(epq.mo10395b()), this.f15969a.mo10726a());
    }
}
