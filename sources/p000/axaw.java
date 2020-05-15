package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.component.generic.SelectableUiFieldOptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.SelectorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: axaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axaw extends bkdx implements bkfe, bjwp, bkeb {

    /* renamed from: a */
    SelectorView f95571a;

    /* renamed from: b */
    bkip f95572b;

    /* renamed from: c */
    FrameLayout f95573c;

    /* renamed from: d */
    TextView f95574d;

    /* renamed from: e */
    View f95575e;

    /* renamed from: f */
    TextView f95576f;

    /* renamed from: g */
    InfoMessageView f95577g;

    /* renamed from: h */
    public boolean f95578h = false;

    /* renamed from: i */
    int f95579i = -1;

    /* renamed from: j */
    private View f95580j;

    /* renamed from: k */
    private String f95581k;

    /* renamed from: l */
    private final bjes f95582l = new bjes(1633);

    /* renamed from: m */
    private final bkip f95583m = new bkip();

    /* renamed from: n */
    private final ArrayList f95584n = new ArrayList();

    /* renamed from: a */
    private final View m82018a(bmqf bmqf) {
        bkfu bkfu = new bkfu(bmqf, this.f123963aH, mo65818aq(), this.f95573c);
        bkfu.f124162a = getActivity();
        bkfu.f124164c = mo65980at();
        bkfu.f124166e = this.f124196aK;
        bkfu.f124167f = this;
        View a = bkfu.mo65971a();
        if (!bkft.m105640a(bmqf)) {
            a = bkem.m105437a(this.f123962aG, a, this.f95573c, mo65818aq().mo65614a());
            bkem.m105439a(a, bmqf.f130380i);
        }
        a.setVisibility(8);
        return a;
    }

    /* renamed from: b */
    private static void m82020b(View view) {
        if (view != null) {
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setPadding(0, paddingTop, 0, paddingBottom);
            int i = Build.VERSION.SDK_INT;
            view.setPaddingRelative(0, paddingTop, 0, paddingBottom);
        }
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        this.f95573c.setVisibility(8);
        int childCount = this.f95571a.getChildCount();
        bkfr.m105567a(this.f95571a, getResources().getQuantityString(C0126R.plurals.wallet_expanding_ui_field_group_selector, childCount, Integer.valueOf(childCount)));
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
    }

    /* renamed from: D */
    public final void mo52725D() {
    }

    /* renamed from: P */
    public final boolean mo52816P() {
        if (mo65880A()) {
            return false;
        }
        View view = this.f95575e;
        if (view != null && view.getVisibility() == 0) {
            this.f95575e.requestFocus();
            return true;
        }
        this.f95571a.requestFocus();
        return true;
    }

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmof) this.f124069w).f130218b;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95583m;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        ArrayList arrayList = new ArrayList();
        int i = this.f95579i;
        if (i >= 0) {
            arrayList.add(new bkde(((bmqf) ((bmof) this.f124069w).f130220d.get(i)).f130376e, this.f95575e, bkft.m105642b((bmqf) ((bmof) this.f124069w).f130220d.get(this.f95579i))));
        }
        return arrayList;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95582l;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        if (((bmof) this.f124069w).f130220d.size() <= 1) {
            super.mo52834e(i);
            this.f95574d.setVisibility(i);
            this.f95577g.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        stq.m36308a(this.f95580j, this.f124195aJ);
    }

    /* renamed from: m */
    public final bmog mo52957m() {
        if (mo65849k()) {
            return null;
        }
        bxvd da = bmog.f130225e.mo74144da();
        String str = ((bmof) this.f124069w).f130217a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmog bmog = (bmog) da.f164949b;
        str.getClass();
        int i = bmog.f130227a | 1;
        bmog.f130227a = i;
        bmog.f130228b = str;
        int i2 = this.f95579i;
        bmog.f130227a = i | 4;
        bmog.f130230d = i2;
        if (i2 >= 0) {
            bmqk a = bkft.m105631a(this.f95575e, (bmqf) ((bmof) this.f124069w).f130220d.get(i2));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmog bmog2 = (bmog) da.f164949b;
            a.getClass();
            bmog2.f130229c = a;
            bmog2.f130227a |= 2;
        }
        return (bmog) da.mo74062i();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selectedIndex", this.f95579i);
        TextView textView = this.f95576f;
        if (textView != null) {
            bundle.putInt("errorViewVisibility", textView.getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmof.f130215h.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* renamed from: z */
    public final void mo52731z() {
        this.f95573c.setVisibility(0);
    }

    /* renamed from: a */
    private static void m82019a(View view) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            C1260oz.m19821a(marginLayoutParams, 0);
            C1260oz.m19823b(marginLayoutParams, 0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.wallet.ui.common.SelectorView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int a;
        bmpl bmpl;
        int a2 = bmoe.m108224a(((bmof) this.f124069w).f130223g);
        if (a2 == 0) {
            a2 = 1;
        }
        this.f95581k = getArguments().getString("analyticsId");
        if (a2 != 2) {
            i = C0126R.C0128layout.wallet_fragment_selectable_ui_field_group;
        } else {
            i = C0126R.C0128layout.wallet_fragment_selectable_ui_field_group_radio;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.f95580j = inflate;
        this.f95574d = (TextView) inflate.findViewById(C0126R.C0129id.title);
        if (!((bmof) this.f124069w).f130219c.isEmpty()) {
            this.f95574d.setText(((bmof) this.f124069w).f130219c);
            this.f95574d.setVisibility(0);
        }
        InfoMessageView infoMessageView = (InfoMessageView) this.f95580j.findViewById(C0126R.C0129id.bottom_info_message);
        this.f95577g = infoMessageView;
        bmnr bmnr = ((bmof) this.f124069w).f130222f;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        infoMessageView.mo72003a(bmnr);
        if (bundle == null || !bundle.containsKey("selectedIndex")) {
            i2 = ((bmof) this.f124069w).f130221e;
            if (a2 != 2 && i2 < 0) {
                i2 = 0;
            }
        } else {
            i2 = bundle.getInt("selectedIndex");
        }
        SelectorView selectorView = (SelectorView) this.f95580j.findViewById(C0126R.C0129id.ui_field_selector);
        this.f95571a = selectorView;
        if (a2 == 2) {
            selectorView.f152205a.mo66034a(true);
        }
        this.f95573c = (FrameLayout) this.f95580j.findViewById(C0126R.C0129id.ui_field_container);
        int i3 = a2 == 2 ? C0126R.C0128layout.wallet_view_selectable_ui_field_option_radio : C0126R.C0128layout.wallet_view_selectable_ui_field_option;
        int size = ((bmof) this.f124069w).f130220d.size();
        if (size <= 1) {
            this.f95579i = 0;
            View a3 = m82018a((bmqf) ((bmof) this.f124069w).f130220d.get(0));
            this.f95575e = a3;
            a3.setVisibility(0);
            this.f95573c.addView(this.f95575e);
        } else {
            this.f95571a.setVisibility(0);
            this.f95583m.mo66032a((bkiq) this.f95571a);
            SelectorView selectorView2 = this.f95571a;
            selectorView2.f152209e = this;
            selectorView2.f152210f = this;
            selectorView2.f152212h = mo65980at();
            this.f95571a.f152211g = mo52837W();
            int i4 = 0;
            while (i4 < size) {
                bmqf bmqf = (bmqf) ((bmof) this.f124069w).f130220d.get(i4);
                if (a2 != 2 || bkft.m105640a(bmqf)) {
                    SelectableUiFieldOptionView selectableUiFieldOptionView = (SelectableUiFieldOptionView) layoutInflater.inflate(i3, (ViewGroup) this.f95571a, false);
                    if (this.f95578h) {
                        m82020b(selectableUiFieldOptionView);
                    }
                    selectableUiFieldOptionView.setId(mo65818aq().mo65614a());
                    selectableUiFieldOptionView.f124136q = bmqf;
                    if (bkft.m105640a(bmqf)) {
                        int i5 = bmqf.f130373b;
                        if (i5 == 6) {
                            selectableUiFieldOptionView.f110529a.setText(((bmqe) bmqf.f130374c).f130362k);
                        } else if (i5 == 7 && (a = bkft.m105627a((bmpl) bmqf.f130374c)) >= 0) {
                            TextView textView = selectableUiFieldOptionView.f110529a;
                            if (bmqf.f130373b == 7) {
                                bmpl = (bmpl) bmqf.f130374c;
                            } else {
                                bmpl = bmpl.f130314g;
                            }
                            textView.setText(bkft.m105633a((bmpk) bmpl.f130317b.get(a)));
                        }
                    } else {
                        selectableUiFieldOptionView.f110529a.setText(bmqf.f130380i);
                    }
                    if (!TextUtils.isEmpty(selectableUiFieldOptionView.f110529a.getText())) {
                        selectableUiFieldOptionView.mo65945a(bmqf.f130376e);
                        this.f95571a.addView(selectableUiFieldOptionView);
                        this.f95573c.addView(m82018a(bmqf));
                        i4++;
                    } else {
                        throw new IllegalArgumentException("UiField must be editable with a label, or a read-only text or select field with an initial value, or a select field with only one option.");
                    }
                } else {
                    throw new IllegalArgumentException("Only read-only options can be used with RADIO_BUTTONS_GROUP style.");
                }
            }
            if (i2 >= 0) {
                this.f95571a.mo72096a(((bmqf) ((bmof) this.f124069w).f130220d.get(i2)).f130376e);
            }
        }
        bkip bkip = new bkip();
        this.f95572b = bkip;
        this.f95583m.mo66030a(bkip);
        int i6 = this.f95579i;
        if (i6 >= 0) {
            this.f95572b.mo66027a(new bkde(((bmqf) ((bmof) this.f124069w).f130220d.get(i6)).f130376e, this.f95575e, bkft.m105642b((bmqf) ((bmof) this.f124069w).f130220d.get(this.f95579i))));
            this.f95572b.mo66038c();
        }
        this.f95576f = (TextView) this.f95580j.findViewById(C0126R.C0129id.error);
        if (bundle != null && bundle.containsKey("errorViewVisibility")) {
            this.f95576f.setVisibility(bundle.getInt("errorViewVisibility"));
        }
        if (this.f95578h) {
            m82019a(this.f95574d);
            m82019a(this.f95577g);
            m82019a(this.f95576f);
            m82020b(this.f95573c);
        }
        return this.f95580j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52944a(Bundle bundle) {
        return mo52957m();
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmq bmmq;
        bmog bmog;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0 || a != 18) {
            super.mo51910a(bmmv, list);
            return;
        }
        if (bmmv.f130056b == 11) {
            bmmq = (bmmq) bmmv.f130057c;
        } else {
            bmmq = bmmq.f130039c;
        }
        if (bmmq.f130041a == 2) {
            bmog = (bmog) bmmq.f130042b;
        } else {
            bmog = bmog.f130225e;
        }
        int i = bmog.f130230d;
        if (((bmof) this.f124069w).f130220d.size() > i) {
            this.f95571a.mo72096a(((bmqf) ((bmof) this.f124069w).f130220d.get(i)).f130376e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52728a(Object obj, Object obj2) {
        int a;
        bmqf bmqf = (bmqf) obj;
        bmqf bmqf2 = (bmqf) obj2;
        if (bmqf2 == null || bmqf.f130376e != bmqf2.f130376e) {
            if (this.f95579i != -1 || ((a = bmoe.m108224a(((bmof) this.f124069w).f130223g)) != 0 && a == 2)) {
                OrchestrationViewEvent.m93827b(getActivity(), this.f95581k, this.f95582l);
            }
            View view = this.f95575e;
            if (view != null) {
                view.setVisibility(8);
            }
            int indexOf = ((bmof) this.f124069w).f130220d.indexOf(bmqf);
            this.f95579i = indexOf;
            this.f95575e = this.f95573c.getChildAt(indexOf);
            if (!bkft.m105640a(bmqf)) {
                this.f95575e.setVisibility(0);
            }
            bkip bkip = this.f95572b;
            if (bkip != null) {
                bkip.mo66035b();
                this.f95572b.mo66027a(new bkde(bmqf.f130376e, this.f95575e, bkft.m105642b(bmqf)));
                this.f95572b.mo66038c();
            }
            TextView textView = this.f95576f;
            if (textView != null && textView.getVisibility() == 0) {
                this.f95576f.setVisibility(4);
            }
            bjwl.m104782a(this.f124196aK, this.f95584n, ((bmqf) ((bmof) this.f124069w).f130220d.get(this.f95579i)).f130376e);
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
            this.f95584n.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        boolean z;
        boolean z2;
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!bmaf.f128438a.equals(((bmof) this.f124069w).f130217a)) {
            return false;
        }
        if (bmaf.f128439b == 1) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = new Object[1];
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        objArr[0] = Integer.valueOf(bmaf2.f128439b);
        sdo.m34975b(z, String.format("Unexpected field id %s for error message", objArr));
        int i = bmaf.f128440c;
        if (i == this.f95579i) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, String.format("Field index %d doesn't match selected index %d", Integer.valueOf(i), Integer.valueOf(this.f95579i)));
        bkft.m105635a(this.f95575e, bmas.f128497b);
        return true;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        int i = this.f95579i;
        return i >= 0 && bjwl.m104786a(bmne, ((bmqf) ((bmof) this.f124069w).f130220d.get(i)).f130376e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52937a(List list, boolean z) {
        TextView textView;
        if (this.f95579i >= 0) {
            return super.mo52937a(list, z);
        }
        if (z && (textView = this.f95576f) != null) {
            textView.setVisibility(0);
        }
        return false;
    }
}
