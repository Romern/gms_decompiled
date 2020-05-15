package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: axau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axau extends bkdx implements bkfe, bkei, bjwp, bkda, bkfv {

    /* renamed from: a */
    SelectorView f95554a;

    /* renamed from: b */
    TextView f95555b;

    /* renamed from: c */
    TextView f95556c;

    /* renamed from: d */
    boolean f95557d = false;

    /* renamed from: e */
    bmpk f95558e;

    /* renamed from: f */
    final ArrayList f95559f = new ArrayList();

    /* renamed from: g */
    final List f95560g = new ArrayList();

    /* renamed from: h */
    bmno f95561h;

    /* renamed from: i */
    public bkcb f95562i;

    /* renamed from: j */
    public bkbz f95563j;

    /* renamed from: k */
    private final Map f95564k = new HashMap();

    /* renamed from: l */
    private final bjes f95565l = new bjes(16);

    /* renamed from: m */
    private final bkip f95566m = new bkip();

    /* renamed from: a */
    public static boolean m81988a(int i) {
        return i == 4 || i == 11;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.ImageWithCaptionView.a(bmno, com.android.volley.toolbox.ImageLoader, boolean):void
     arg types: [bmno, com.android.volley.toolbox.ImageLoader, int]
     candidates:
      com.google.android.wallet.ui.common.FifeNetworkImageView.a(java.lang.String, com.android.volley.toolbox.ImageLoader, boolean):void
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(bmno, com.android.volley.toolbox.ImageLoader, boolean):void */
    /* renamed from: t */
    private final void m81989t() {
        bmpl bmpl;
        this.f95554a.removeAllViews();
        Activity activity = getActivity();
        bmqf bmqf = (bmqf) this.f124069w;
        if (bmqf.f130373b == 7) {
            bmpl = (bmpl) bmqf.f130374c;
        } else {
            bmpl = bmpl.f130314g;
        }
        int a = bmpj.m108255a(bmpl.f130320e);
        if (a == 0) {
            a = 1;
        }
        boolean z = a == 11;
        int size = bmpl.f130317b.size();
        for (int i = 0; i < size; i++) {
            bmpk bmpk = (bmpk) bmpl.f130317b.get(i);
            long j = bmpk.f130308i;
            if (j == 0) {
                j = bjtc.m104549a(mo52837W(), 1, i);
            }
            bjxv aq = mo65818aq();
            axav axav = new axav(activity);
            axav.f124136q = bmpk;
            axav.f95568b.setText(bkft.m105633a(bmpk));
            InfoMessageView infoMessageView = axav.f95569c;
            bmnr bmnr = bmpk.f130304e;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            if ((bmpk.f130300a & 512) != 0) {
                ImageWithCaptionView imageWithCaptionView = axav.f95567a;
                bmno bmno = bmpk.f130310k;
                if (bmno == null) {
                    bmno = bmno.f130138m;
                }
                imageWithCaptionView.mo71992a(bmno, bjvn.m104721b(axav.getContext()), false);
            }
            axav.f95569c.setId(aq.mo65614a());
            axav.mo65945a(j);
            axav.f95570d = z;
            axav.f124133n = this.f124071y;
            this.f95554a.addView(axav);
        }
        SelectorView selectorView = this.f95554a;
        selectorView.f152213i = this.f124196aK;
        if (selectorView.f152213i != null) {
            int childCount = selectorView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = selectorView.getChildAt(i2);
                selectorView.f152213i.mo65589a(((bkfc) childAt).mo65944g(), (bjwm) childAt);
            }
        }
        bmpk bmpk2 = this.f95558e;
        if (bmpk2 != null) {
            this.f95554a.mo72096a(bmpk2.f130308i);
        }
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        int childCount = this.f95554a.getChildCount();
        bkfr.m105567a(this.f95554a, getResources().getQuantityString(C0126R.plurals.wallet_expanding_field_selector, childCount, Integer.valueOf(childCount)));
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
        TextView textView = this.f95555b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: D */
    public final void mo52725D() {
        TextView textView = this.f95555b;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmqf) this.f124069w).f130376e;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        return bkft.m105633a(this.f95558e);
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return this.f95558e != null;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95566m;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.emptyList();
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95559f;
    }

    /* renamed from: cl */
    public final bwdm mo52930cl() {
        bmpk bmpk = this.f95558e;
        if (bmpk == null || (bmpk.f130300a & 4096) == 0) {
            return null;
        }
        bwdm bwdm = bmpk.f130313n;
        return bwdm == null ? bwdm.f158904d : bwdm;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95565l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        SelectorView selectorView = this.f95554a;
        if (selectorView != null) {
            selectorView.setEnabled(this.f124195aJ);
        }
    }

    /* renamed from: l */
    public final void mo52931l() {
        bmpl bmpl;
        bmpl bmpl2;
        bmpl bmpl3;
        bmpl bmpl4;
        bwef A = this.f95562i.mo52029A();
        bmqf bmqf = (bmqf) this.f124069w;
        if (bmqf.f130373b == 7) {
            bmpl = (bmpl) bmqf.f130374c;
        } else {
            bmpl = bmpl.f130314g;
        }
        int a = bmae.m107829a(bmpl.f130321f);
        if (a != 0 && a == 3 && !A.f158973c.isEmpty()) {
            this.f95557d = true;
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = A.f158973c;
            int size = bxwc.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                bwds bwds = (bwds) bxwc.get(i2);
                Long l = (Long) this.f95564k.get(bwds.f158927b);
                if (l == null) {
                    l = Long.valueOf(this.f95563j.mo52841a(bwgx.UI_FIELD));
                    this.f95564k.put(bwds.f158927b, l);
                }
                bxvd da = bmpk.f130298o.mo74144da();
                long longValue = l.longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmpk bmpk = (bmpk) da.f164949b;
                int i3 = bmpk.f130300a | 128;
                bmpk.f130300a = i3;
                bmpk.f130308i = longValue;
                String str = bwds.f158928c;
                str.getClass();
                int i4 = i3 | 1;
                bmpk.f130300a = i4;
                bmpk.f130301b = str;
                String str2 = bwds.f158927b;
                str2.getClass();
                bmpk.f130300a = i4 | 32;
                bmpk.f130306g = str2;
                bwdm bwdm = bwds.f158930e;
                if (bwdm == null) {
                    bwdm = bwdm.f158904d;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmpk bmpk2 = (bmpk) da.f164949b;
                bwdm.getClass();
                bmpk2.f130313n = bwdm;
                bmpk2.f130300a |= 4096;
                if (!bwds.f158929d.isEmpty()) {
                    bxvd da2 = bmnr.f130153o.mo74144da();
                    String str3 = boac.m110962a(bnzz.f132439a.mo68384a(bnzz.m110959a(bwds.f158929d))).f132440a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmnr bmnr = (bmnr) da2.f164949b;
                    str3.getClass();
                    bmnr.f130155a |= 4;
                    bmnr.f130159e = str3;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmpk bmpk3 = (bmpk) da.f164949b;
                    bmnr bmnr2 = (bmnr) da2.mo74062i();
                    bmnr2.getClass();
                    bmpk3.f130304e = bmnr2;
                    bmpk3.f130300a |= 8;
                }
                bmno bmno = this.f95561h;
                if (bmno != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmpk bmpk4 = (bmpk) da.f164949b;
                    bmno.getClass();
                    bmpk4.f130310k = bmno;
                    bmpk4.f130300a |= 512;
                }
                arrayList.add((bmpk) da.mo74062i());
            }
            bmqf bmqf2 = (bmqf) this.f124069w;
            bxvd bxvd = (bxvd) bmqf2.mo74142c(5);
            bxvd.mo73625a((bxvk) bmqf2);
            bmqf bmqf3 = (bmqf) this.f124069w;
            if (bmqf3.f130373b == 7) {
                bmpl2 = (bmpl) bmqf3.f130374c;
            } else {
                bmpl2 = bmpl.f130314g;
            }
            bxvd bxvd2 = (bxvd) bmpl2.mo74142c(5);
            bxvd2.mo73625a((bxvk) bmpl2);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bmpl bmpl5 = bmpl.f130314g;
            ((bmpl) bxvd2.f164949b).f130317b = bxvk.m124030de();
            String str4 = A.f158974d;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bmpl bmpl6 = (bmpl) bxvd2.f164949b;
            str4.getClass();
            bmpl6.f130316a = 1 | bmpl6.f130316a;
            bmpl6.f130318c = str4;
            if (!bmpl6.f130317b.mo73666a()) {
                bmpl6.f130317b = bxvk.m124021a(bmpl6.f130317b);
            }
            bxsy.m123078a(arrayList, bmpl6.f130317b);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmqf bmqf4 = (bmqf) bxvd.f164949b;
            bmpl bmpl7 = (bmpl) bxvd2.mo74062i();
            bmqf bmqf5 = bmqf.f130370r;
            bmpl7.getClass();
            bmqf4.f130374c = bmpl7;
            bmqf4.f130373b = 7;
            bmqf bmqf6 = (bmqf) bxvd.mo74062i();
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            bjvp.m104736a(arguments, "formProtoLite", bmqf6);
            setArguments(arguments);
            this.f124069w = bmqf6;
            bmqf bmqf7 = (bmqf) this.f124069w;
            if (bmqf7.f130373b == 7) {
                bmpl3 = (bmpl) bmqf7.f130374c;
            } else {
                bmpl3 = bmpl.f130314g;
            }
            int a2 = bkft.m105627a(bmpl3);
            bmqf bmqf8 = (bmqf) this.f124069w;
            if (bmqf8.f130373b == 7) {
                bmpl4 = (bmpl) bmqf8.f130374c;
            } else {
                bmpl4 = bmpl.f130314g;
            }
            if (a2 != -1) {
                i = a2;
            }
            this.f95558e = (bmpk) bmpl4.f130317b.get(i);
            m81989t();
        }
    }

    /* renamed from: m */
    public final CharSequence mo52932m() {
        return this.f95556c.getText();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bjvp.m104736a(bundle, "selectedOption", this.f95558e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmqf.f130370r.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* renamed from: z */
    public final void mo52731z() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmpl bmpl;
        bmpl bmpl2;
        bmpl bmpl3;
        bmpl bmpl4;
        bmpl bmpl5;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_field_selector, (ViewGroup) null, false);
        SelectorView selectorView = (SelectorView) inflate.findViewById(C0126R.C0129id.selector_view);
        this.f95554a = selectorView;
        this.f95566m.mo66032a((bkiq) selectorView);
        SelectorView selectorView2 = this.f95554a;
        selectorView2.f152209e = this;
        selectorView2.f152210f = this;
        selectorView2.f152207c = this;
        selectorView2.f152212h = mo65980at();
        this.f95554a.f152211g = mo52837W();
        this.f95556c = (TextView) inflate.findViewById(C0126R.C0129id.error);
        if (!((bmqf) this.f124069w).f130380i.isEmpty()) {
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.field_selector_header);
            this.f95555b = textView;
            textView.setText(((bmqf) this.f124069w).f130380i);
            this.f95555b.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        }
        bmqf bmqf = (bmqf) this.f124069w;
        if (bmqf.f130373b == 7) {
            bmpl = (bmpl) bmqf.f130374c;
        } else {
            bmpl = bmpl.f130314g;
        }
        if (!bmpl.f130317b.isEmpty()) {
            bmqf bmqf2 = (bmqf) this.f124069w;
            if (bmqf2.f130373b == 7) {
                bmpl4 = (bmpl) bmqf2.f130374c;
            } else {
                bmpl4 = bmpl.f130314g;
            }
            if ((((bmpk) bmpl4.f130317b.get(0)).f130300a & 512) != 0) {
                bmqf bmqf3 = (bmqf) this.f124069w;
                if (bmqf3.f130373b == 7) {
                    bmpl5 = (bmpl) bmqf3.f130374c;
                } else {
                    bmpl5 = bmpl.f130314g;
                }
                bmno bmno = ((bmpk) bmpl5.f130317b.get(0)).f130310k;
                if (bmno == null) {
                    bmno = bmno.f130138m;
                }
                this.f95561h = bmno;
            }
        }
        if (bundle != null) {
            this.f95558e = (bmpk) bjvp.m104730a(bundle, "selectedOption", (bxxk) bmpk.f130298o.mo74142c(7));
        } else {
            bmqf bmqf4 = (bmqf) this.f124069w;
            if (bmqf4.f130373b == 7) {
                bmpl2 = (bmpl) bmqf4.f130374c;
            } else {
                bmpl2 = bmpl.f130314g;
            }
            int a = bkft.m105627a(bmpl2);
            if (a == -1) {
                this.f95554a.f152205a.mo66034a(true);
            } else {
                bmqf bmqf5 = (bmqf) this.f124069w;
                if (bmqf5.f130373b == 7) {
                    bmpl3 = (bmpl) bmqf5.f130374c;
                } else {
                    bmpl3 = bmpl.f130314g;
                }
                this.f95558e = (bmpk) bmpl3.f130317b.get(a);
            }
        }
        m81989t();
        bkde bkde = new bkde(((bmqf) this.f124069w).f130376e, this.f95554a, null);
        this.f95559f.add(bkde);
        this.f95566m.mo66027a(bkde);
        return inflate;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ bxxc mo52956q() {
        bxvd da = bmqk.f130403g.mo74144da();
        bmqf bmqf = (bmqf) this.f124069w;
        if ((bmqf.f130372a & 1) != 0 && !bmqf.f130375d.isEmpty()) {
            String str = ((bmqf) this.f124069w).f130375d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk = (bmqk) da.f164949b;
            str.getClass();
            bmqk.f130405a |= 1;
            bmqk.f130408d = str;
        }
        bmqf bmqf2 = (bmqf) this.f124069w;
        if ((bmqf2.f130372a & 512) != 0 && bmqf2.f130385n.mo73744a() > 0) {
            bxtx bxtx = ((bmqf) this.f124069w).f130385n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk2 = (bmqk) da.f164949b;
            bxtx.getClass();
            bmqk2.f130405a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bmqk2.f130410f = bxtx;
        }
        if (!((bmqf) this.f124069w).f130377f) {
            String str2 = this.f95558e.f130306g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk3 = (bmqk) da.f164949b;
            str2.getClass();
            bmqk3.f130406b = 2;
            bmqk3.f130407c = str2;
        } else {
            String str3 = this.f95558e.f130306g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk4 = (bmqk) da.f164949b;
            str3.getClass();
            bmqk4.f130406b = 8;
            bmqk4.f130407c = str3;
        }
        return (bmqk) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmpl bmpl;
        bmpl bmpl2;
        bmmo bmmo;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 12) {
            super.mo51910a(bmmv, list);
            return;
        }
        bmqf bmqf = (bmqf) this.f124069w;
        if (bmqf.f130373b == 7) {
            bmpl = (bmpl) bmqf.f130374c;
        } else {
            bmpl = bmpl.f130314g;
        }
        ArrayList arrayList = new ArrayList(bmpl.f130317b.size());
        bmqf bmqf2 = (bmqf) this.f124069w;
        if (bmqf2.f130373b == 7) {
            bmpl2 = (bmpl) bmqf2.f130374c;
        } else {
            bmpl2 = bmpl.f130314g;
        }
        bxwc bxwc = bmpl2.f130317b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Long.valueOf(((bmpk) bxwc.get(i)).f130308i));
        }
        bjwk bjwk = this.f124196aK;
        if (bmmv.f130056b == 9) {
            bmmo = (bmmo) bmmv.f130057c;
        } else {
            bmmo = bmmo.f130026d;
        }
        bjwk.mo65591a(arrayList, bmmo, list);
    }

    /* renamed from: a */
    public final void mo52929a(CharSequence charSequence) {
        this.f95556c.setText(charSequence);
        this.f95556c.setVisibility(charSequence == null ? 8 : 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52728a(Object obj, Object obj2) {
        bmpk bmpk = (bmpk) obj;
        bmpk bmpk2 = (bmpk) obj2;
        bkip bkip = this.f95554a.f152205a;
        if (bkip.f124297f) {
            bkip.mo66034a(false);
        }
        this.f95558e = bmpk;
        if (this.f95557d) {
            this.f95557d = false;
        } else if (bmpk2 == null || bmpk.f130308i != bmpk2.f130308i) {
            bjwl.m104782a(this.f124196aK, this.f95560g, bmpk.f130308i);
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 != 1) {
                if (i3 == 3) {
                    continue;
                } else if (i3 != 4) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    objArr[0] = Integer.valueOf(i2 - 1);
                    throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
                }
            }
            this.f95560g.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        bmpk bmpk = this.f95558e;
        return bmpk != null && bjwl.m104786a(bmne, bmpk.f130308i);
    }
}
