package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LinkView;
import com.google.android.wallet.p097ui.common.RegionCodeView;
import com.google.android.wallet.p097ui.date.DatePickerView;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bkjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkjj extends bkdx implements bjwm, bkeb, bkjq, bkca {

    /* renamed from: C */
    public final ArrayList f124382C = new ArrayList();

    /* renamed from: D */
    public FormHeaderView f124383D;

    /* renamed from: E */
    public final ArrayList f124384E = new ArrayList();

    /* renamed from: F */
    public final ArrayList f124385F = new ArrayList();

    /* renamed from: G */
    public final ArrayList f124386G = new ArrayList();

    /* renamed from: H */
    public int f124387H;

    /* renamed from: I */
    public bmlv f124388I;

    /* renamed from: J */
    public bkcb f124389J;

    /* renamed from: K */
    public bkbz f124390K;

    /* renamed from: L */
    protected final C1230nw f124391L = new C1230nw();

    /* renamed from: M */
    private boolean f124392M;

    /* renamed from: N */
    private int f124393N;

    /* renamed from: O */
    private final bjes f124394O = new bjes(1715);

    /* renamed from: P */
    private final ArrayList f124395P = new ArrayList();

    /* renamed from: Q */
    private final ArrayList f124396Q = new ArrayList();

    /* renamed from: R */
    private bkip f124397R = null;

    /* renamed from: S */
    private final ArrayList f124398S = new ArrayList();

    /* renamed from: a */
    private int f124399a;

    /* renamed from: b */
    private int f124400b;

    /* renamed from: c */
    protected boolean f124401c;

    /* renamed from: d */
    public final ArrayList f124402d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f124403e = new ArrayList();

    /* renamed from: f */
    public LinearLayout f124404f;

    /* renamed from: g */
    public final ArrayList f124405g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f124406h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f124407i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f124408j = new ArrayList();

    /* renamed from: k */
    public final ArrayList f124409k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f124410l = new ArrayList();

    /* renamed from: m */
    public final ArrayList f124411m = new ArrayList();

    /* renamed from: n */
    public final ArrayList f124412n = new ArrayList();

    /* renamed from: o */
    public final ArrayList f124413o = new ArrayList();

    /* renamed from: p */
    public final ArrayList f124414p = new ArrayList();

    /* renamed from: q */
    public final ArrayList f124415q = new ArrayList();

    /* renamed from: r */
    public final ArrayList f124416r = new ArrayList();

    /* renamed from: s */
    public final ArrayList f124417s = new ArrayList();

    /* renamed from: t */
    public final ArrayList f124418t = new ArrayList();

    /* renamed from: u */
    final ArrayList f124419u = new ArrayList();

    /* renamed from: v */
    public final ArrayList f124420v = new ArrayList();

    /* renamed from: a */
    static int m105962a(bmot bmot) {
        if (bmot.f130260d.size() <= 0) {
            int a = bmos.m108238a(bmot.f130261e);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                return 8388611;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return 8388613;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmos.m108238a(bmot.f130261e);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            Log.w("SimpleFragment", String.format(locale, "Unknown UiFieldGrouping gravity: %d", objArr));
            return 8388611;
        } else if (bmot.f130260d.mo74151b(0) == bmot.f130257a) {
            return 8388613;
        } else {
            if (bmot.f130260d.mo74151b(0) <= bmot.f130258b) {
                return 8388611;
            }
            return 8388611;
        }
    }

    /* renamed from: m */
    private final void m105971m() {
        bkip bkip = this.f124397R;
        if (bkip != null) {
            bkip.mo66038c();
            this.f124397R = null;
        }
    }

    /* renamed from: G */
    public final bmnu mo65881G() {
        bmeb bmeb = (bmeb) this.f124069w;
        if ((bmeb.f128904a & 4) == 0) {
            return null;
        }
        bmnu bmnu = bmeb.f128909f;
        return bmnu == null ? bmnu.f130170g : bmnu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52916a(bkag bkag) {
    }

    /* renamed from: b */
    public final void mo65831b() {
        ArrayList arrayList = this.f124398S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bkfv) arrayList.get(i)).mo52931l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52918b(bkdx bkdx) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo52919b(bmqf bmqf) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        int size = this.f124408j.size();
        for (int i = 0; i < size; i++) {
            if (!((bkag) this.f124408j.get(i)).mo52775bR()) {
                return false;
            }
        }
        int size2 = this.f124410l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!((bkiv) this.f124410l.get(i2)).mo52775bR()) {
                return false;
            }
        }
        if (this.f124387H >= this.f124385F.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f124395P;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124403e;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        int size = this.f124407i.size();
        for (int i = 0; i < size; i++) {
            bkft.m105645c((View) this.f124407i.get(i));
        }
        int size2 = this.f124408j.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bkag) this.f124408j.get(i2)).mo52947bY();
        }
        int size3 = this.f124410l.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((bkiv) this.f124410l.get(i3)).mo52947bY();
        }
        int size4 = this.f124413o.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((bkev) this.f124413o.get(i4)).mo52947bY();
        }
        int size5 = this.f124415q.size();
        for (int i5 = 0; i5 < size5; i5++) {
            bjwl.m104790b(this.f124415q.get(i5), ((bkbn) this.f124415q.get(i5)).mo65788c().f128770b, this.f124196aK);
        }
        int size6 = this.f124412n.size();
        for (int i6 = 0; i6 < size6; i6++) {
            bjwl.m104790b(this.f124412n.get(i6), ((InfoMessageView) this.f124412n.get(i6)).f152083g.f130156b, this.f124196aK);
        }
        int size7 = this.f124418t.size();
        for (int i7 = 0; i7 < size7; i7++) {
            bkew bkew = (bkew) bkft.m105641b((View) this.f124418t.get(i7));
            bmdn bmdn = bkew.f124116a.f128869b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            bjwl.m104790b(bkew, bmdn.f128835c, this.f124196aK);
        }
    }

    /* renamed from: c */
    public final bmed mo52944a(Bundle bundle) {
        bmdx bmdx;
        bmdx bmdx2;
        bmee bmee;
        bmee bmee2;
        bmee bmee3;
        bmee bmee4;
        bmee bmee5;
        bmee bmee6;
        bmee bmee7;
        bmee bmee8;
        Bundle bundle2 = bundle;
        if (mo65849k()) {
            return bmed.f128915f;
        }
        bxvd da = bmed.f128915f.mo74144da();
        bmdn bmdn = ((bmeb) this.f124069w).f128905b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if ((bmdn.f128833a & 1) != 0) {
            bmdn bmdn2 = ((bmeb) this.f124069w).f128905b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            String str = bmdn2.f128834b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed = (bmed) da.f164949b;
            str.getClass();
            bmed.f128917a |= 1;
            bmed.f128918b = str;
        }
        bmdn bmdn3 = ((bmeb) this.f124069w).f128905b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        if ((bmdn3.f128833a & 4) != 0) {
            bmdn bmdn4 = ((bmeb) this.f124069w).f128905b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            bxtx bxtx = bmdn4.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed2 = (bmed) da.f164949b;
            bxtx.getClass();
            bmed2.f128917a |= 2;
            bmed2.f128919c = bxtx;
        }
        int size = ((bmeb) this.f124069w).f128906c.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            bmea bmea = (bmea) ((bmeb) this.f124069w).f128906c.get(i2);
            bxvd da2 = bmec.f128911c.mo74144da();
            int i3 = bmea.f128899a;
            if (i3 == 1) {
                bmef bmef = (bmef) bmeg.f128929f.mo74144da();
                if (bmea.f128899a == 1) {
                    bmee = (bmee) bmea.f128900b;
                } else {
                    bmee = bmee.f128922e;
                }
                bmdn bmdn5 = bmee.f128925b;
                if (bmdn5 == null) {
                    bmdn5 = bmdn.f128831k;
                }
                if (!bmdn5.f128834b.isEmpty()) {
                    if (bmea.f128899a == 1) {
                        bmee8 = (bmee) bmea.f128900b;
                    } else {
                        bmee8 = bmee.f128922e;
                    }
                    bmdn bmdn6 = bmee8.f128925b;
                    if (bmdn6 == null) {
                        bmdn6 = bmdn.f128831k;
                    }
                    String str2 = bmdn6.f128834b;
                    if (bmef.f164950c) {
                        bmef.mo74035c();
                        bmef.f164950c = false;
                    }
                    bmeg bmeg = (bmeg) bmef.f164949b;
                    str2.getClass();
                    bmeg.f128931a |= 1;
                    bmeg.f128932b = str2;
                }
                if (bmea.f128899a == 1) {
                    bmee2 = (bmee) bmea.f128900b;
                } else {
                    bmee2 = bmee.f128922e;
                }
                bmdn bmdn7 = bmee2.f128925b;
                if (bmdn7 == null) {
                    bmdn7 = bmdn.f128831k;
                }
                if (!bmdn7.f128836d.mo73779j()) {
                    if (bmea.f128899a == 1) {
                        bmee7 = (bmee) bmea.f128900b;
                    } else {
                        bmee7 = bmee.f128922e;
                    }
                    bmdn bmdn8 = bmee7.f128925b;
                    if (bmdn8 == null) {
                        bmdn8 = bmdn.f128831k;
                    }
                    bxtx bxtx2 = bmdn8.f128836d;
                    if (bmef.f164950c) {
                        bmef.mo74035c();
                        bmef.f164950c = false;
                    }
                    bmeg bmeg2 = (bmeg) bmef.f164949b;
                    bxtx2.getClass();
                    bmeg2.f128931a |= 2;
                    bmeg2.f128933c = bxtx2;
                }
                i++;
                if (bmea.f128899a == 1) {
                    bmee3 = (bmee) bmea.f128900b;
                } else {
                    bmee3 = bmee.f128922e;
                }
                int size2 = bmee3.f128926c.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = i + 1;
                    if (bmea.f128899a == 1) {
                        bmee6 = (bmee) bmea.f128900b;
                    } else {
                        bmee6 = bmee.f128922e;
                    }
                    bmef.mo66784a(m105966a((bmdx) bmee6.f128926c.get(i4), i, bundle2));
                    i4++;
                    i = i5;
                }
                if (bmea.f128899a == 1) {
                    bmee4 = (bmee) bmea.f128900b;
                } else {
                    bmee4 = bmee.f128922e;
                }
                if ((bmee4.f128924a & 2) != 0) {
                    if (bmea.f128899a == 1) {
                        bmee5 = (bmee) bmea.f128900b;
                    } else {
                        bmee5 = bmee.f128922e;
                    }
                    bmjf bmjf = bmee5.f128927d;
                    if (bmjf == null) {
                        bmjf = bmjf.f129685i;
                    }
                    String str3 = bmjf.f129693g;
                    if (bmef.f164950c) {
                        bmef.mo74035c();
                        bmef.f164950c = false;
                    }
                    bmeg bmeg3 = (bmeg) bmef.f164949b;
                    str3.getClass();
                    bmeg3.f128931a |= 4;
                    bmeg3.f128935e = str3;
                    i++;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmec bmec = (bmec) da2.f164949b;
                bmeg bmeg4 = (bmeg) bmef.mo74062i();
                bmeg4.getClass();
                bmec.f128914b = bmeg4;
                bmec.f128913a = 1;
            } else if (i3 == 2) {
                bmdy bmdy = bmdy.f128893c;
                if (bmea.f128899a == 2) {
                    bmdx = (bmdx) bmea.f128900b;
                } else {
                    bmdx = bmdx.f128886d;
                }
                if (bmdx.f128888a == 15) {
                    bmnk bmnk = (bmnk) bjvp.m104730a(bundle2, "pageDroidGuardFormValue", (bxxk) bmnk.f130113c.mo74142c(7));
                    if (bmnk != null) {
                        bxvd da3 = bmdy.f128893c.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bmdy bmdy2 = (bmdy) da3.f164949b;
                        bmnk.getClass();
                        bmdy2.f128896b = bmnk;
                        bmdy2.f128895a = 8;
                        bmdy = (bmdy) da3.mo74062i();
                    }
                } else {
                    int i6 = i + 1;
                    if (bmea.f128899a == 2) {
                        bmdx2 = (bmdx) bmea.f128900b;
                    } else {
                        bmdx2 = bmdx.f128886d;
                    }
                    bmdy = m105966a(bmdx2, i, bundle2);
                    i = i6;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmec bmec2 = (bmec) da2.f164949b;
                bmdy.getClass();
                bmec2.f128914b = bmdy;
                bmec2.f128913a = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed3 = (bmed) da.f164949b;
            bmec bmec3 = (bmec) da2.mo74062i();
            bmec3.getClass();
            bmed3.mo66783a();
            bmed3.f128920d.add(bmec3);
        }
        bmeb bmeb = (bmeb) this.f124069w;
        if ((bmeb.f128904a & 2) != 0) {
            bmjf bmjf2 = bmeb.f128908e;
            if (bmjf2 == null) {
                bmjf2 = bmjf.f129685i;
            }
            String str4 = bmjf2.f129693g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed4 = (bmed) da.f164949b;
            str4.getClass();
            bmed4.f128917a |= 4;
            bmed4.f128921e = str4;
        }
        return (bmed) da.mo74062i();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124394O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f124403e.size() + this.f124420v.size() != 0 || this.f124383D != null) {
            boolean z = this.f124195aJ;
            FormHeaderView formHeaderView = this.f124383D;
            if (formHeaderView != null) {
                formHeaderView.setEnabled(z);
            }
            int size = this.f124384E.size();
            for (int i = 0; i < size; i++) {
                ((FormHeaderView) this.f124384E.get(i)).setEnabled(z);
            }
            int size2 = this.f124405g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((SummaryExpanderWrapper) this.f124405g.get(i2)).setEnabled(z);
            }
            int size3 = this.f124407i.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((View) this.f124407i.get(i3)).setEnabled(z);
            }
            int size4 = this.f124406h.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((bkdx) this.f124406h.get(i4)).mo52808n(z);
            }
            int size5 = this.f124408j.size();
            for (int i5 = 0; i5 < size5; i5++) {
                ((bkag) this.f124408j.get(i5)).mo52808n(z);
            }
            int size6 = this.f124409k.size();
            for (int i6 = 0; i6 < size6; i6++) {
                ((bkdx) this.f124409k.get(i6)).mo52808n(z);
            }
            int size7 = this.f124410l.size();
            for (int i7 = 0; i7 < size7; i7++) {
                ((bkiv) this.f124410l.get(i7)).mo52808n(z);
            }
            int size8 = this.f124412n.size();
            for (int i8 = 0; i8 < size8; i8++) {
                ((InfoMessageView) this.f124412n.get(i8)).setEnabled(z);
            }
            int size9 = this.f124413o.size();
            for (int i9 = 0; i9 < size9; i9++) {
                ((bkev) this.f124413o.get(i9)).mo52808n(z);
            }
            int size10 = this.f124414p.size();
            for (int i10 = 0; i10 < size10; i10++) {
                ((RegionCodeView) this.f124414p.get(i10)).setEnabled(z);
            }
            int size11 = this.f124420v.size();
            for (int i11 = 0; i11 < size11; i11++) {
                ((View) this.f124420v.get(i11)).setEnabled(z);
            }
            int size12 = this.f124415q.size();
            for (int i12 = 0; i12 < size12; i12++) {
                ((bkbn) this.f124415q.get(i12)).mo52710b().setEnabled(z);
            }
            int size13 = this.f124417s.size();
            for (int i13 = 0; i13 < size13; i13++) {
                ((ImageWithCaptionView) this.f124417s.get(i13)).setEnabled(z);
            }
            int size14 = this.f124416r.size();
            for (int i14 = 0; i14 < size14; i14++) {
                ((LinkView) this.f124416r.get(i14)).setEnabled(z);
            }
            int size15 = this.f124418t.size();
            for (int i15 = 0; i15 < size15; i15++) {
                ((View) this.f124418t.get(i15)).setEnabled(z);
            }
            int size16 = this.f124382C.size();
            for (int i16 = 0; i16 < size16; i16++) {
                ((View) this.f124382C.get(i16)).setEnabled(z);
            }
            int size17 = this.f124411m.size();
            for (int i17 = 0; i17 < size17; i17++) {
                ((bkjr) this.f124411m.get(i17)).setEnabled(z);
            }
        }
    }

    public void onAttach(Activity activity) {
        bkcb bkcb;
        super.onAttach(activity);
        bkbz bkbz = null;
        if (!(getActivity() instanceof bkcb)) {
            Fragment fragment = this;
            while (true) {
                if (fragment != null) {
                    if (fragment instanceof bkcb) {
                        bkcb = (bkcb) fragment;
                        break;
                    }
                    fragment = fragment.getParentFragment();
                } else {
                    bkcb = null;
                    break;
                }
            }
        } else {
            bkcb = (bkcb) getActivity();
        }
        this.f124389J = bkcb;
        if (!(getActivity() instanceof bkbz)) {
            Fragment fragment2 = this;
            while (true) {
                if (fragment2 != null) {
                    if (fragment2 instanceof bkbz) {
                        bkbz = (bkbz) fragment2;
                        break;
                    }
                    fragment2 = fragment2.getParentFragment();
                } else {
                    break;
                }
            }
        } else {
            bkbz = (bkbz) getActivity();
        }
        this.f124390K = bkbz;
        bkcb bkcb2 = this.f124389J;
        if (bkcb2 != null) {
            bkcb2.mo52048a(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder(23);
                sb.append("regionCodes_");
                sb.append(i);
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(sb.toString());
                if (integerArrayList != null) {
                    this.f124419u.add(integerArrayList);
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final void onDestroyView() {
        this.f124395P.clear();
        this.f124396Q.clear();
        this.f124402d.clear();
        this.f124403e.clear();
        this.f124407i.clear();
        this.f124406h.clear();
        this.f124408j.clear();
        this.f124409k.clear();
        this.f124410l.clear();
        this.f124412n.clear();
        this.f124413o.clear();
        this.f124414p.clear();
        this.f124419u.clear();
        this.f124420v.clear();
        this.f124415q.clear();
        this.f124417s.clear();
        this.f124418t.clear();
        this.f124382C.clear();
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        bkcb bkcb = this.f124389J;
        if (bkcb != null) {
            bkcb.mo52059b(this);
            this.f124389J = null;
        }
        this.f124390K = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("revealBelowTriggeredCount", this.f124387H);
        int size = this.f124419u.size();
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("regionCodes_");
            sb.append(i);
            bundle.putIntegerArrayList(sb.toString(), (ArrayList) this.f124419u.get(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmeb.f128902g.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmeb) this.f124069w).f128905b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final ViewGroup m105963a(ViewGroup viewGroup, bmot bmot, int i, LayoutInflater layoutInflater) {
        LinearLayout linearLayout;
        if (i == bmot.f130257a) {
            LinearLayout linearLayout2 = new LinearLayout(this.f123962aG);
            linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(m105962a(bmot));
            viewGroup.addView(linearLayout2);
            linearLayout = linearLayout2;
        } else {
            linearLayout = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        }
        if (bmot.f130260d.contains(Integer.valueOf(i))) {
            layoutInflater.inflate((int) C0126R.C0128layout.view_splitting_view, linearLayout, true);
        }
        return linearLayout;
    }

    /* renamed from: a */
    private final LinearLayout.LayoutParams m105964a(View view, bmot bmot, int i, boolean z) {
        int i2;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams.width <= 0) {
            if (!z) {
                layoutParams.weight = 1.0f;
                i2 = 0;
            } else {
                i2 = -2;
            }
            layoutParams.width = i2;
        }
        if (i != bmot.f130257a) {
            C1260oz.m19821a(layoutParams, C1260oz.m19820a(layoutParams) + this.f123962aG.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_horizontal_margin_between_fields_with_padding));
        }
        return layoutParams;
    }

    /* renamed from: a */
    public static bkjj m105965a(bmeb bmeb, int i, LogContext logContext) {
        bkjj bkjj = new bkjj();
        bkjj.setArguments(bkdx.m105383a(i, bmeb, logContext));
        return bkjj;
    }

    /* renamed from: a */
    private final bmdy m105966a(bmdx bmdx, int i, Bundle bundle) {
        bmqf bmqf;
        bxvd da = bmdy.f128893c.mo74144da();
        bkji bkji = (bkji) this.f124403e.get(i);
        int i2 = bkji.f124378a;
        if (i2 != 0) {
            if (i2 == 1) {
                View view = (View) this.f124407i.get(bkji.f124379b);
                if (bmdx.f128888a == 1) {
                    bmqf = (bmqf) bmdx.f128889b;
                } else {
                    bmqf = bmqf.f130370r;
                }
                bmqk a = bkft.m105631a(view, bmqf);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmdy bmdy = (bmdy) da.f164949b;
                a.getClass();
                bmdy.f128896b = a;
                bmdy.f128895a = 1;
            } else if (i2 == 2) {
                bmdt a2 = ((bkev) this.f124413o.get(bkji.f124379b)).mo65918a(bundle);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmdy bmdy2 = (bmdy) da.f164949b;
                a2.getClass();
                bmdy2.f128896b = a2;
                bmdy2.f128895a = 3;
            } else if (i2 == 3) {
                RegionCodeView regionCodeView = (RegionCodeView) this.f124414p.get(bkji.f124379b);
                bxvd da2 = bmbu.f128626e.mo74144da();
                String str = regionCodeView.f152185f.f128834b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmbu bmbu = (bmbu) da2.f164949b;
                str.getClass();
                int i3 = 1 | bmbu.f128628a;
                bmbu.f128628a = i3;
                bmbu.f128629b = str;
                bxtx bxtx = regionCodeView.f152185f.f128836d;
                bxtx.getClass();
                bmbu.f128628a = i3 | 2;
                bmbu.f128630c = bxtx;
                String a3 = bjtv.m104615a(regionCodeView.mo72078a());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmbu bmbu2 = (bmbu) da2.f164949b;
                a3.getClass();
                bmbu2.f128628a |= 4;
                bmbu2.f128631d = a3;
                bmbu bmbu3 = (bmbu) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmdy bmdy3 = (bmdy) da.f164949b;
                bmbu3.getClass();
                bmdy3.f128896b = bmbu3;
                bmdy3.f128895a = 6;
            } else if (i2 == 4) {
                bmbs a4 = ((bkag) this.f124408j.get(bkji.f124379b)).mo52928a(bundle);
                if (a4 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmdy bmdy4 = (bmdy) da.f164949b;
                    a4.getClass();
                    bmdy4.f128896b = a4;
                    bmdy4.f128895a = 2;
                }
            } else if (i2 == 5) {
                bkiv bkiv = (bkiv) this.f124410l.get(bkji.f124379b);
                bmjj bmjj = (bmjj) bmjk.f129713f.mo74144da();
                String str2 = ((bmji) bkiv.f124069w).f129709b;
                if (bmjj.f164950c) {
                    bmjj.mo74035c();
                    bmjj.f164950c = false;
                }
                bmjk bmjk = (bmjk) bmjj.f164949b;
                str2.getClass();
                int i4 = 1 | bmjk.f129715a;
                bmjk.f129715a = i4;
                bmjk.f129716b = str2;
                bmji bmji = (bmji) bkiv.f124069w;
                long j = bmji.f129710c;
                int i5 = i4 | 2;
                bmjk.f129715a = i5;
                bmjk.f129717c = j;
                if ((bmji.f129708a & 4) != 0) {
                    bxtx bxtx2 = bmji.f129711d;
                    bxtx2.getClass();
                    bmjk.f129715a = i5 | 4;
                    bmjk.f129718d = bxtx2;
                }
                int length = bkiv.f124332b.length;
                for (int i6 = 0; i6 < length; i6++) {
                    bmjj.mo66796a(bkft.m105631a(bkiv.f124332b[i6], (bmqf) ((bmji) bkiv.f124069w).f129712e.get(i6)));
                }
                bmjk bmjk2 = (bmjk) bmjj.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmdy bmdy5 = (bmdy) da.f164949b;
                bmjk2.getClass();
                bmdy5.f128896b = bmjk2;
                bmdy5.f128895a = 4;
            } else if (i2 != 11) {
                if (i2 == 12) {
                    bmqk bmqk = (bmqk) ((bkei) this.f124406h.get(bkji.f124379b)).mo52956q();
                    if (bmqk != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmdy bmdy6 = (bmdy) da.f164949b;
                        bmqk.getClass();
                        bmdy6.f128896b = bmqk;
                        bmdy6.f128895a = 1;
                    }
                } else if (i2 != 16) {
                    if (i2 == 18) {
                        bmcc a5 = mo52914a(bkji.f124379b);
                        if (a5 != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmdy bmdy7 = (bmdy) da.f164949b;
                            a5.getClass();
                            bmdy7.f128896b = a5;
                            bmdy7.f128895a = 9;
                        }
                    } else if (!(i2 == 29 || i2 == 36 || i2 == 31)) {
                        if (i2 == 32) {
                            bmdw c = ((bkew) bkft.m105641b((View) this.f124418t.get(bkji.f124379b))).mo65923c();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmdy bmdy8 = (bmdy) da.f164949b;
                            c.getClass();
                            bmdy8.f128896b = c;
                            bmdy8.f128895a = 5;
                        } else {
                            throw new IllegalStateException(mo65883d(String.format(Locale.US, "Unknown field type %d in SimpleForm", Integer.valueOf(bkji.f124378a))));
                        }
                    }
                }
            }
        }
        return (bmdy) da.mo74062i();
    }

    /* renamed from: a */
    private static void m105967a(ViewGroup viewGroup, bmot bmot) {
        int i = 0;
        if (bmot.f130260d.size() > 0) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new bkjg(viewGroup, bmot));
        }
        while (i < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ImageWithCaptionView) && childAt.getLayoutParams().height > 0) {
                i++;
            } else {
                return;
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new bkjh(viewGroup));
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (4) to help type inference */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.LinearLayout, java.lang.Object, bkjr], assign insn: 0x0804: CONSTRUCTOR  (r5v1 ? I:bkjr) = (r1v27 android.view.ContextThemeWrapper) call: bkjr.<init>(android.content.Context):void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, bkbn], assign insn: 0x049c: INVOKE  (r1v75 ? I:bkbn) = (r7v0 'this' bkjj A[THIS]), (r8v0 android.view.ViewGroup), (r13v6 int) type: VIRTUAL call: bkjj.a(android.view.ViewGroup, int):bkbn */
    /* JADX WARN: Type inference failed for: r2v76, types: [bkdx], assign insn: 0x027d: CHECK_CAST  (r2v76 ? I:bkdx) = (bkdx) (r2v75 com.google.android.chimera.Fragment) */
    /* JADX WARN: Type inference failed for: r2v77, types: [bkdx, bkge, java.lang.Object, bjer], assign insn: PHI: (r2v77 ?) = (r2v76 ?), (r2v81 ?) binds: [B:116:0x027f, B:121:0x028c] */
    /* JADX WARN: Type inference failed for: r2v81, types: [bkdx, com.google.android.chimera.Fragment], assign insn: 0x028c: INVOKE  (r2v81 ? I:bkdx) = (r7v0 'this' bkjj A[THIS]), (r2v80 bmcb) type: VIRTUAL call: bkjj.a(bmcb):bkdx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkjj.a(bjer, int):void
     arg types: [com.google.android.wallet.ui.common.InfoMessageView, int]
     candidates:
      bkjj.a(android.view.ViewGroup, bmot):void
      bkjj.a(bmot, int):boolean
      bkjj.a(bmbr, boolean):bkag
      bkjj.a(android.view.ViewGroup, int):bkbn
      bkjj.a(bmlv, android.view.ViewGroup):com.google.android.wallet.ui.expander.SummaryExpanderWrapper
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bjwm.a(bmmv, java.util.List):void
      bkjj.a(bjer, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
     arg types: [com.google.android.chimera.Activity, com.google.android.wallet.ui.common.FormEditText]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    private final void m105968a(ViewGroup viewGroup, SummaryExpanderWrapper summaryExpanderWrapper, bmdx bmdx, String str, int i, int i2, boolean z) {
        bmnj bmnj;
        long j;
        int i3;
        String str2;
        bkdx bkdx;
        FrameLayout frameLayout;
        bkip bkip;
        int i4;
        bmel bmel;
        bmoh bmoh;
        bmdu bmdu;
        int i5;
        bkew bkew;
        bmdu bmdu2;
        int i6;
        bmno bmno;
        bmno bmno2;
        bwhm bwhm;
        bmdb bmdb;
        bmdb bmdb2;
        ArrayList arrayList;
        bmbt bmbt;
        bmbt bmbt2;
        bmbt bmbt3;
        bmbt bmbt4;
        bmbt bmbt5;
        bmds bmds;
        bmds bmds2;
        bmnr bmnr;
        bmnr bmnr2;
        bmji bmji;
        bmji bmji2;
        bmcb bmcb;
        bmcb bmcb2;
        bmbr bmbr;
        bmbr bmbr2;
        bmqf bmqf;
        bmqf bmqf2;
        bmqf bmqf3;
        bmqf bmqf4;
        bmqf bmqf5;
        bmqf bmqf6;
        bmpe bmpe;
        bmqf bmqf7;
        bmpe bmpe2;
        bmqf bmqf8;
        bmpe bmpe3;
        bmqf bmqf9;
        bmqf bmqf10;
        bmpe bmpe4;
        bmqf bmqf11;
        bmqf bmqf12;
        ViewGroup viewGroup2 = viewGroup;
        SummaryExpanderWrapper summaryExpanderWrapper2 = summaryExpanderWrapper;
        bmdx bmdx2 = bmdx;
        int i7 = i;
        boolean z2 = z;
        if (bmdx2.f128888a != 15) {
            int a = mo65818aq().mo65614a();
            int i8 = bmdx2.f128888a;
            bkip bkip2 = null;
            int i9 = 0;
            boolean z3 = false;
            if (i8 == 1) {
                if (mo52919b((bmqf) bmdx2.f128889b)) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f123962aG);
                    frameLayout2.setId(a);
                    bkdx bkdx2 = (bkdx) getChildFragmentManager().findFragmentById(a);
                    bkdx bkdx3 = bkdx2;
                    if (bkdx2 == null) {
                        if (bmdx2.f128888a == 1) {
                            bmqf12 = (bmqf) bmdx2.f128889b;
                        } else {
                            bmqf12 = bmqf.f130370r;
                        }
                        bkdx a2 = mo52912a(bmqf12);
                        getChildFragmentManager().beginTransaction().add(a, a2).commit();
                        bkdx3 = a2;
                    }
                    mo52918b(bkdx3);
                    if (bkdx3 instanceof bkfv) {
                        this.f124398S.add((bkfv) bkdx3);
                    }
                    bkdx3.f124071y = this.f124071y;
                    bkdx3.f124196aK = this.f124196aK;
                    int size = this.f124406h.size();
                    if (bmdx2.f128888a == 1) {
                        bmqf11 = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf11 = bmqf.f130370r;
                    }
                    long j2 = bmqf11.f130376e;
                    this.f124406h.add(bkdx3);
                    m105969a(bkdx3, i7);
                    j = j2;
                    i9 = 12;
                    i3 = size;
                    str2 = null;
                    frameLayout = frameLayout2;
                    bkdx = bkdx3;
                } else {
                    if (bmdx2.f128888a == 1) {
                        bmqf = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf = bmqf.f130370r;
                    }
                    bkfu bkfu = new bkfu(bmqf, this.f123963aH, mo65818aq(), viewGroup2);
                    bkfu.f124162a = getActivity();
                    bkfu.f124163b = getFragmentManager();
                    bkfu.f124164c = mo65980at();
                    bkfu.f124165d = this;
                    bkfu.f124167f = this;
                    bmdn bmdn = ((bmeb) this.f124069w).f128905b;
                    if (bmdn == null) {
                        bmdn = bmdn.f128831k;
                    }
                    int a3 = bmqo.m108290a(bmdn.f128839g);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    bkfu.f124169h = a3;
                    bkfu.f124168g = z2;
                    View a4 = bkfu.mo65971a();
                    if (bmdx2.f128888a == 1) {
                        bmqf2 = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf2 = bmqf.f130370r;
                    }
                    View a5 = mo52908a(a4, bmqf2, viewGroup2, z2);
                    int size2 = this.f124407i.size();
                    if (bmdx2.f128888a == 1) {
                        bmqf3 = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf3 = bmqf.f130370r;
                    }
                    long j3 = bmqf3.f130376e;
                    if (bmdx2.f128888a == 1) {
                        bmqf4 = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf4 = bmqf.f130370r;
                    }
                    Object b = bkft.m105642b(bmqf4);
                    this.f124407i.add(a5);
                    if (bmdx2.f128888a == 1) {
                        bmqf5 = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf5 = bmqf.f130370r;
                    }
                    bjwl.m104784a(a5, bmqf5.f130376e, this.f124196aK);
                    if (bmdx2.f128888a == 1) {
                        bmqf6 = (bmqf) bmdx2.f128889b;
                    } else {
                        bmqf6 = bmqf.f130370r;
                    }
                    if (bmqf6.f130373b == 16) {
                        bmpe = (bmpe) bmqf6.f130374c;
                    } else {
                        bmpe = bmpe.f130279k;
                    }
                    if ((bmpe.f130281a & 64) == 0) {
                        j = j3;
                        i9 = 1;
                        i3 = size2;
                        str2 = b;
                        bkdx = a5;
                        frameLayout = a5;
                    } else {
                        if (bmdx2.f128888a == 1) {
                            bmqf7 = (bmqf) bmdx2.f128889b;
                        } else {
                            bmqf7 = bmqf.f130370r;
                        }
                        if (bmqf7.f130373b == 16) {
                            bmpe2 = (bmpe) bmqf7.f130374c;
                        } else {
                            bmpe2 = bmpe.f130279k;
                        }
                        int a6 = bmpb.m108247a(bmpe2.f130288h);
                        if (a6 == 0 || a6 == 1) {
                            j = j3;
                            i9 = 1;
                            i3 = size2;
                            str2 = b;
                            bkdx = a5;
                            frameLayout = a5;
                        } else {
                            C1230nw nwVar = this.f124391L;
                            if (bmdx2.f128888a == 1) {
                                bmqf8 = (bmqf) bmdx2.f128889b;
                            } else {
                                bmqf8 = bmqf.f130370r;
                            }
                            if (bmqf8.f130373b == 16) {
                                bmpe3 = (bmpe) bmqf8.f130374c;
                            } else {
                                bmpe3 = bmpe.f130279k;
                            }
                            DatePickerView datePickerView = (DatePickerView) nwVar.mo15534a(bmpe3.f130287g);
                            if (datePickerView != null) {
                                DatePickerView datePickerView2 = (DatePickerView) a5;
                                datePickerView2.f152283h = datePickerView;
                                datePickerView.f152283h = datePickerView2;
                                C1230nw nwVar2 = this.f124391L;
                                if (bmdx2.f128888a == 1) {
                                    bmqf10 = (bmqf) bmdx2.f128889b;
                                } else {
                                    bmqf10 = bmqf.f130370r;
                                }
                                if (bmqf10.f130373b == 16) {
                                    bmpe4 = (bmpe) bmqf10.f130374c;
                                } else {
                                    bmpe4 = bmpe.f130279k;
                                }
                                nwVar2.mo15539b(bmpe4.f130287g);
                                j = j3;
                                i9 = 1;
                                i3 = size2;
                                str2 = b;
                                bkdx = a5;
                                frameLayout = a5;
                            } else {
                                C1230nw nwVar3 = this.f124391L;
                                if (bmdx2.f128888a == 1) {
                                    bmqf9 = (bmqf) bmdx2.f128889b;
                                } else {
                                    bmqf9 = bmqf.f130370r;
                                }
                                nwVar3.mo15540b(bmqf9.f130376e, (DatePickerView) a5);
                                j = j3;
                                i9 = 1;
                                i3 = size2;
                                str2 = b;
                                bkdx = a5;
                                frameLayout = a5;
                            }
                        }
                    }
                }
            } else if (i8 == 2) {
                FrameLayout frameLayout3 = new FrameLayout(this.f123962aG);
                frameLayout3.setId(a);
                bkag bkag = (bkag) getChildFragmentManager().findFragmentById(a);
                bkag bkag2 = bkag;
                if (bkag == null) {
                    if (bmdx2.f128888a == 2) {
                        bmbr2 = (bmbr) bmdx2.f128889b;
                    } else {
                        bmbr2 = bmbr.f128572L;
                    }
                    if (summaryExpanderWrapper2 != null) {
                        z3 = true;
                    }
                    bkag a7 = mo52909a(bmbr2, z3);
                    getChildFragmentManager().beginTransaction().add(a, a7).commit();
                    bkag2 = a7;
                }
                mo52916a(bkag2);
                if (bkag2 instanceof bkfv) {
                    this.f124398S.add((bkfv) bkag2);
                }
                bkag2.mo65666a(this.f124388I);
                bkag2.f124071y = this.f124071y;
                bkag2.f124196aK = this.f124196aK;
                int size3 = this.f124408j.size();
                if (bmdx2.f128888a == 2) {
                    bmbr = (bmbr) bmdx2.f128889b;
                } else {
                    bmbr = bmbr.f128572L;
                }
                long j4 = bmbr.f128587d;
                this.f124408j.add(bkag2);
                m105969a(bkag2, i7);
                j = j4;
                i9 = 4;
                i3 = size3;
                str2 = null;
                frameLayout = frameLayout3;
                bkdx = bkag2;
            } else if (i8 == 17) {
                FrameLayout frameLayout4 = new FrameLayout(this.f123962aG);
                frameLayout4.setId(a);
                ? r2 = (bkdx) getChildFragmentManager().findFragmentById(a);
                if (r2 == null) {
                    if (bmdx2.f128888a == 17) {
                        bmcb2 = (bmcb) bmdx2.f128889b;
                    } else {
                        bmcb2 = bmcb.f128649e;
                    }
                    r2 = mo52911a(bmcb2);
                    getChildFragmentManager().beginTransaction().add(a, (Fragment) r2).commit();
                }
                r2.f124196aK = this.f124196aK;
                mo52917a((bkdx) r2);
                i3 = this.f124409k.size();
                if (bmdx2.f128888a == 17) {
                    bmcb = (bmcb) bmdx2.f128889b;
                } else {
                    bmcb = bmcb.f128649e;
                }
                bmdn bmdn2 = bmcb.f128652b;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                j = bmdn2.f128835c;
                this.f124409k.add(r2);
                m105969a((bjer) r2, i7);
                frameLayout = frameLayout4;
                bkdx = r2;
                str2 = null;
                i9 = 18;
            } else if (i8 == 5) {
                FrameLayout frameLayout5 = new FrameLayout(this.f123962aG);
                frameLayout5.setId(a);
                bkiv bkiv = (bkiv) getChildFragmentManager().findFragmentById(a);
                bkiv bkiv2 = bkiv;
                if (bkiv == null) {
                    if (bmdx2.f128888a == 5) {
                        bmji2 = (bmji) bmdx2.f128889b;
                    } else {
                        bmji2 = bmji.f129706f;
                    }
                    bkiv a8 = mo52913a(bmji2);
                    getChildFragmentManager().beginTransaction().add(a, a8).commit();
                    bkiv2 = a8;
                }
                bkiv2.f124071y = this.f124071y;
                int size4 = this.f124410l.size();
                if (bmdx2.f128888a == 5) {
                    bmji = (bmji) bmdx2.f128889b;
                } else {
                    bmji = bmji.f129706f;
                }
                long j5 = bmji.f129710c;
                this.f124410l.add(bkiv2);
                m105969a(bkiv2, i7);
                i3 = size4;
                j = j5;
                str2 = null;
                i9 = 5;
                frameLayout = frameLayout5;
                bkdx = bkiv2;
            } else if (i8 == 3) {
                InfoMessageView infoMessageView = (InfoMessageView) this.f123963aH.inflate(this.f124399a, viewGroup2, false);
                infoMessageView.setId(a);
                if (bmdx2.f128888a == 3) {
                    bmnr = (bmnr) bmdx2.f128889b;
                } else {
                    bmnr = bmnr.f130153o;
                }
                infoMessageView.mo72003a(bmnr);
                infoMessageView.f152084h = mo65982av();
                int size5 = this.f124412n.size();
                if (bmdx2.f128888a == 3) {
                    bmnr2 = (bmnr) bmdx2.f128889b;
                } else {
                    bmnr2 = bmnr.f130153o;
                }
                long j6 = bmnr2.f130156b;
                this.f124412n.add(infoMessageView);
                m105969a((bjer) infoMessageView, i7);
                bjwl.m104784a(infoMessageView, j6, this.f124196aK);
                j = j6;
                str2 = null;
                i3 = size5;
                bkdx = infoMessageView;
                frameLayout = infoMessageView;
            } else if (i8 == 4) {
                FrameLayout frameLayout6 = new FrameLayout(this.f123962aG);
                frameLayout6.setId(a);
                bkev bkev = (bkev) getChildFragmentManager().findFragmentById(a);
                bkev bkev2 = bkev;
                if (bkev == null) {
                    if (bmdx2.f128888a == 4) {
                        bmds2 = (bmds) bmdx2.f128889b;
                    } else {
                        bmds2 = bmds.f128852h;
                    }
                    bkev a9 = bkev.m105454a(bmds2, this.f123961aF, mo65980at());
                    getChildFragmentManager().beginTransaction().add(a, a9).commit();
                    bkev2 = a9;
                }
                bkev2.f124196aK = this.f124196aK;
                int size6 = this.f124413o.size();
                if (bmdx2.f128888a == 4) {
                    bmds = (bmds) bmdx2.f128889b;
                } else {
                    bmds = bmds.f128852h;
                }
                bmqf bmqf13 = bmds.f128855b;
                if (bmqf13 == null) {
                    bmqf13 = bmqf.f130370r;
                }
                long j7 = bmqf13.f130376e;
                this.f124413o.add(bkev2);
                m105969a(bkev2, i7);
                j = j7;
                i9 = 2;
                i3 = size6;
                str2 = null;
                frameLayout = frameLayout6;
                bkdx = bkev2;
            } else if (i8 == 8) {
                RegionCodeView regionCodeView = (RegionCodeView) this.f123963aH.inflate(this.f124393N, viewGroup2, false);
                regionCodeView.setId(a);
                regionCodeView.mo72082a(mo65980at());
                i3 = this.f124414p.size();
                if (this.f124419u.size() > i3) {
                    arrayList = (ArrayList) this.f124419u.get(i3);
                } else {
                    if (bmdx2.f128888a == 8) {
                        bmbt5 = (bmbt) bmdx2.f128889b;
                    } else {
                        bmbt5 = bmbt.f128620d;
                    }
                    arrayList = bjtl.m104574b(bjtl.m104568a(bmbt5.f128623b));
                    this.f124419u.add(arrayList);
                }
                if (bmdx2.f128888a == 8) {
                    bmbt = (bmbt) bmdx2.f128889b;
                } else {
                    bmbt = bmbt.f128620d;
                }
                bmdn bmdn3 = bmbt.f128622a;
                if (bmdn3 == null) {
                    bmdn3 = bmdn.f128831k;
                }
                regionCodeView.mo72081a(bmdn3);
                regionCodeView.mo72073a((List) arrayList);
                if (bmdx2.f128888a == 8) {
                    bmbt2 = (bmbt) bmdx2.f128889b;
                } else {
                    bmbt2 = bmbt.f128620d;
                }
                regionCodeView.mo72079a(bjtv.m104614a(bmbt2.f128624c));
                if (bmdx2.f128888a == 8) {
                    bmbt3 = (bmbt) bmdx2.f128889b;
                } else {
                    bmbt3 = bmbt.f128620d;
                }
                bmdn bmdn4 = bmbt3.f128622a;
                if (bmdn4 == null) {
                    bmdn4 = bmdn.f128831k;
                }
                j = bmdn4.f128835c;
                this.f124414p.add(regionCodeView);
                bjwl.m104784a(regionCodeView, j, this.f124196aK);
                if (bmdx2.f128888a == 8) {
                    bmbt4 = (bmbt) bmdx2.f128889b;
                } else {
                    bmbt4 = bmbt.f128620d;
                }
                str2 = bmbt4.f128624c;
                frameLayout = regionCodeView;
                i9 = 3;
                bkdx = regionCodeView;
            } else if (i8 == 10) {
                int a10 = bmda.m107911a(((bmdb) bmdx2.f128889b).f128777i);
                ? a11 = mo52910a(viewGroup2, a10 != 0 ? a10 : 1);
                a11.setId(a);
                int size7 = this.f124415q.size();
                if (bmdx2.f128888a == 10) {
                    bmdb = (bmdb) bmdx2.f128889b;
                } else {
                    bmdb = bmdb.f128767k;
                }
                a11.mo52707a(bmdb);
                a11.mo65787a(mo65980at());
                if (bmdx2.f128888a == 10) {
                    bmdb2 = (bmdb) bmdx2.f128889b;
                } else {
                    bmdb2 = bmdb.f128767k;
                }
                long j8 = bmdb2.f128770b;
                this.f124415q.add(a11);
                View view = (View) a11;
                bjwl.m104784a(view, j8, this.f124196aK);
                j = j8;
                i9 = 31;
                i3 = size7;
                frameLayout = view;
                str2 = null;
                bkdx = a11;
            } else if (i8 == 11) {
                LinkView a12 = LinkView.m118645a((bwhm) bmdx2.f128889b, this.f123962aG, viewGroup, viewGroup, this.f123963aH, mo65818aq(), this);
                int size8 = this.f124416r.size();
                if (bmdx2.f128888a == 11) {
                    bwhm = (bwhm) bmdx2.f128889b;
                } else {
                    bwhm = bwhm.f159522h;
                }
                long j9 = bwhm.f159525b;
                this.f124416r.add(a12);
                bkdx = a12;
                j = j9;
                i9 = 29;
                i3 = size8;
                str2 = null;
                frameLayout = a12;
            } else if (i8 == 12) {
                float dimension = getResources().getDimension(C0126R.dimen.wallet_uic_spacing_material_top_bottom);
                if (bmdx2.f128888a == 12) {
                    bmno = (bmno) bmdx2.f128889b;
                } else {
                    bmno = bmno.f130138m;
                }
                ImageWithCaptionView a13 = ImageWithCaptionView.m118566a(bmno, this.f123962aG, viewGroup, a, (int) dimension, this.f124400b, mo65980at());
                if (this.f124401c) {
                    a13.mo71888a();
                }
                int size9 = this.f124417s.size();
                if (bmdx2.f128888a == 12) {
                    bmno2 = (bmno) bmdx2.f128889b;
                } else {
                    bmno2 = bmno.f130138m;
                }
                long j10 = bmno2.f130141b;
                this.f124417s.add(a13);
                bkdx = a13;
                j = j10;
                i9 = 11;
                i3 = size9;
                str2 = null;
                frameLayout = a13;
            } else if (i8 == 7) {
                Activity activity = getActivity();
                if (bmdx2.f128888a == 7) {
                    bmdu = (bmdu) bmdx2.f128889b;
                } else {
                    bmdu = bmdu.f128866i;
                }
                ContextThemeWrapper contextThemeWrapper = this.f123962aG;
                LogContext at = mo65980at();
                bkew bkew2 = new bkew(contextThemeWrapper);
                bkew2.setId(a);
                bkew2.f124118c.mo71919a(at);
                bkew2.f124116a = bmdu;
                FormEditText formEditText = bkew2.f124118c;
                bmdn bmdn5 = bmdu.f128869b;
                if (bmdn5 == null) {
                    bmdn5 = bmdn.f128831k;
                }
                formEditText.mo71914a(bjtc.m104548a(bmdn5.f128835c, 1));
                bkew2.f124118c.setHint(bkew2.f124116a.f128870c);
                if (bkew2.mo65925h()) {
                    bkew2.f124117b.f152060n = true;
                    int size10 = bkew2.f124116a.f128873f.size();
                    ArrayList arrayList2 = new ArrayList(size10);
                    for (int i10 = 0; i10 < size10; i10++) {
                        arrayList2.add(new bkbx((String) bkew2.f124116a.f128873f.get(i10), (String) bkew2.f124116a.f128872e.get(i10)));
                    }
                    Collections.sort(arrayList2, new bkbw(Collator.getInstance(Locale.getDefault())));
                    bkbv bkbv = new bkbv(bkew2.getContext(), arrayList2);
                    bkbv.setDropDownViewResource(C0126R.C0128layout.view_spinner_dropdown);
                    bkew2.f124117b.setAdapter((SpinnerAdapter) bkbv);
                    String str3 = bkew2.f124116a.f128874g;
                    int count = bkew2.f124117b.getCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < count) {
                            if (str3.equals(((bkbx) bkew2.f124117b.getItemAtPosition(i11)).f123968b)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    bkew2.f124119d = i11;
                    if (i11 != -1) {
                        bkew2.f124117b.setSelection(i11);
                        bkew2.f124120e = bkew2.f124119d;
                        bkew2.f124117b.setOnItemSelectedListener(bkew2);
                        bkew2.f124118c.addTextChangedListener(bkew2);
                    } else {
                        throw new IllegalStateException("Default region code must be in region codes.");
                    }
                }
                if ((bkew2.f124116a.f128868a & 4) != 0) {
                    if (bkew2.mo65925h()) {
                        bmdw bmdw = bkew2.f124116a.f128871d;
                        if (bmdw == null) {
                            bmdw = bmdw.f128877h;
                        }
                        if (!bmdw.f128883e.isEmpty()) {
                            bmdw bmdw2 = bkew2.f124116a.f128871d;
                            if (bmdw2 == null) {
                                bmdw2 = bmdw.f128877h;
                            }
                            String str4 = bmdw2.f128883e;
                            int count2 = bkew2.f124117b.getCount();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i12 = 0; i12 < count2; i12++) {
                                if (str4.equals(bkew2.f124117b.mo71968a(i12))) {
                                    arrayList3.add(Integer.valueOf(i12));
                                }
                            }
                            int a14 = bkew2.mo65920a(arrayList3);
                            bkew2.f124120e = a14;
                            bkew2.f124117b.mo71972b(a14);
                            FormEditText formEditText2 = bkew2.f124118c;
                            bmdw bmdw3 = bkew2.f124116a.f128871d;
                            if (bmdw3 == null) {
                                bmdw3 = bmdw.f128877h;
                            }
                            String str5 = bmdw3.f128883e;
                            bmdw bmdw4 = bkew2.f124116a.f128871d;
                            if (bmdw4 == null) {
                                bmdw4 = bmdw.f128877h;
                            }
                            formEditText2.mo71832a((CharSequence) bkew.m105478a(str5, bmdw4.f128884f), 6);
                        }
                    }
                    FormEditText formEditText3 = bkew2.f124118c;
                    bmdw bmdw5 = bkew2.f124116a.f128871d;
                    if (bmdw5 == null) {
                        bmdw5 = bmdw.f128877h;
                    }
                    formEditText3.mo71832a((CharSequence) bmdw5.f128884f, 6);
                }
                if (TextUtils.isEmpty(bkew2.f124118c.getText()) && bkfr.m105583a(activity, (TextView) bkew2.f124118c)) {
                    bkew2.f124122g = bkew2.f124118c.mo71937m();
                    if (bkew2.mo65925h() && !TextUtils.isEmpty(bkew2.f124122g) && bkew2.f124122g.charAt(0) != '+' && (i6 = bkew2.f124119d) != -1) {
                        if (bkew2.f124122g.startsWith(bkew2.f124117b.mo71968a(i6))) {
                            bkew2.f124122g = String.format(Locale.US, "+%s", bkew2.f124122g);
                            bkew2.f124118c.mo71832a((CharSequence) bkew2.f124122g, 1);
                        }
                    }
                }
                FormSpinner formSpinner = bkew2.f124117b;
                if (!bkew2.mo65924g()) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                formSpinner.setVisibility(i5);
                bkew2.setEnabled(true);
                if (this.f124392M) {
                    bkew = bkem.m105437a(this.f123962aG, bkew2, viewGroup2, mo65818aq().mo65614a());
                } else {
                    bkew = bkew2;
                }
                int size11 = this.f124418t.size();
                if (bmdx2.f128888a == 7) {
                    bmdu2 = (bmdu) bmdx2.f128889b;
                } else {
                    bmdu2 = bmdu.f128866i;
                }
                bmdn bmdn6 = bmdu2.f128869b;
                if (bmdn6 == null) {
                    bmdn6 = bmdn.f128831k;
                }
                long j11 = bmdn6.f128835c;
                this.f124418t.add(bkew);
                if (bmdx2.f128888a == 7) {
                    str2 = (bmdu) bmdx2.f128889b;
                } else {
                    str2 = bmdu.f128866i;
                }
                bjwl.m104784a(bkew, j11, this.f124196aK);
                j = j11;
                i9 = 32;
                i3 = size11;
                bkdx = bkew;
                frameLayout = bkew;
            } else if (i8 == 14) {
                TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicCardSeparatorLayout});
                int resourceId = obtainStyledAttributes.getResourceId(0, C0126R.C0128layout.view_material_2_light_card_separator);
                obtainStyledAttributes.recycle();
                View inflate = this.f123963aH.inflate(resourceId, viewGroup2, false);
                int size12 = this.f124382C.size();
                if (bmdx2.f128888a == 14) {
                    bmoh = (bmoh) bmdx2.f128889b;
                } else {
                    bmoh = bmoh.f130231b;
                }
                long j12 = bmoh.f130233a;
                this.f124382C.add(inflate);
                bjwl.m104784a(new bjwn(inflate), j12, this.f124196aK);
                frameLayout = inflate;
                j = j12;
                i9 = 16;
                i3 = size12;
                str2 = null;
                bkdx = inflate;
            } else if (i8 == 16) {
                bkcb bkcb = this.f124389J;
                if (bkcb != null) {
                    ContextThemeWrapper contextThemeWrapper2 = this.f123962aG;
                    bmel bmel2 = (bmel) bmdx2.f128889b;
                    int i13 = this.f124400b;
                    if (bmel2 != null) {
                        ? bkjr = new bkjr(contextThemeWrapper2);
                        bkjr.setId(a);
                        bkjr.mo66094a(bkjr.m106045a(bkcb, bmel2));
                        bkjr.f124446f = bkcb;
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        C1260oz.m19821a(marginLayoutParams, i13);
                        bkjr.setLayoutParams(marginLayoutParams);
                        this.f124398S.add(bkjr);
                        int size13 = this.f124411m.size();
                        if (bmdx2.f128888a == 16) {
                            bmel = (bmel) bmdx2.f128889b;
                        } else {
                            bmel = bmel.f128957f;
                        }
                        long j13 = bmel.f128960b;
                        this.f124411m.add(bkjr);
                        bkjr.f124441a = this;
                        bjwl.m104784a((Object) bkjr, j13, this.f124196aK);
                        bkag bkag3 = bkjr;
                        bkdx = bkag3;
                        i9 = 36;
                        j = j13;
                        i3 = size13;
                        str2 = null;
                        frameLayout = bkag3;
                    } else {
                        throw new IllegalStateException("UpdatableCart proto must be provided for the UpdatableCartSummaryView Creation!");
                    }
                } else {
                    throw new IllegalStateException("ClientUpdatableParametersProvider should be set for the updatable UI component.");
                }
            } else {
                throw new IllegalArgumentException(mo65883d("Empty or unknown field in SimpleForm."));
            }
            if (bmdx2.f128890c) {
                bmdn bmdn7 = ((bmeb) this.f124069w).f128905b;
                if (bmdn7 == null) {
                    bmdn7 = bmdn.f128831k;
                }
                if (bmdn7.f128840h.size() <= 0) {
                    int size14 = this.f124385F.size();
                    this.f124385F.add(Integer.valueOf(this.f124404f.getChildCount()));
                    ArrayList arrayList4 = this.f124386G;
                    if (i7 != -1) {
                        i4 = viewGroup.getChildCount();
                    } else {
                        i4 = -1;
                    }
                    arrayList4.add(Integer.valueOf(i4));
                    if (size14 >= this.f124387H) {
                        bkjf bkjf = new bkjf(this, size14);
                        View b2 = bkft.m105641b(frameLayout);
                        if (b2 instanceof FormEditText) {
                            ((FormEditText) b2).mo65785a((bker) bkjf);
                        } else if (i9 == 2) {
                            ((bkev) this.f124413o.get(i3)).mo65785a((bker) bkjf);
                        } else {
                            throw new IllegalStateException(mo65883d("Invalid field type for hideFieldsBelow"));
                        }
                    }
                } else {
                    throw new IllegalArgumentException(mo65883d("Hiding fields below is not supported together with field groups."));
                }
            }
            frameLayout.setTag(C0126R.C0129id.field_type, Integer.valueOf(i9));
            viewGroup2.addView(frameLayout);
            bkji bkji = new bkji(j, bkdx, str2);
            bkji.f124378a = i9;
            bkji.f124379b = i3;
            bkji.f124380c = str;
            bkji.f124381g = i2;
            this.f124403e.add(bkji);
            if (!((Boolean) bjwe.f123470E.mo54082a()).booleanValue()) {
                if (summaryExpanderWrapper2 != null) {
                    summaryExpanderWrapper2.mo72160a(bkji);
                } else if (mo52776bU() != null) {
                    if (bkdx instanceof bkiq) {
                        bkip2 = bkdx.mo52776bU();
                    }
                    if (bkip2 == null) {
                        bkip = new bkip();
                        bkip.mo66027a(bkji);
                        bkip.mo66038c();
                    } else {
                        bkip = bkip2;
                    }
                    mo52776bU().mo66030a(bkip);
                }
            } else if (summaryExpanderWrapper2 != null) {
                m105971m();
                summaryExpanderWrapper2.mo72160a(bkji);
            } else if (mo52776bU() != null) {
                if (bkdx instanceof bkiq) {
                    bkiq bkiq = bkdx;
                    if (bkiq.mo52776bU() != null) {
                        m105971m();
                        mo52776bU().mo66030a(bkiq.mo52776bU());
                        return;
                    }
                }
                if (this.f124397R == null) {
                    this.f124397R = new bkip();
                    mo52776bU().mo66030a(this.f124397R);
                }
                this.f124397R.mo66027a(bkji);
            }
        } else {
            Bundle bundle = new Bundle();
            if (bmdx2.f128888a == 15) {
                bmnj = (bmnj) bmdx2.f128889b;
            } else {
                bmnj = bmnj.f130108c;
            }
            bjvp.m104736a(bundle, "EventListener.EXTRA_DROID_GUARD_FORM", bmnj);
            mo51905a(25, bundle);
        }
    }

    /* renamed from: a */
    private final void m105969a(bjer bjer, int i) {
        if (i >= 0) {
            bjer bjer2 = (bjer) this.f124396Q.get(i);
            bjer.mo52779bZ();
            ((ArrayList) this.f124402d.get(i)).add(bjer);
            return;
        }
        this.f124395P.add(bjer);
    }

    /* renamed from: a */
    static boolean m105970a(bmot bmot, int i) {
        int a;
        if (bmot.f130260d.size() > 0 || bmot.f130259c.contains(Integer.valueOf(i)) || ((a = bmos.m108238a(bmot.f130261e)) != 0 && a != 1)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x069e, code lost:
        if (r6.f128888a != 3) goto L_0x06a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x037f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x073f  */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        int i2;
        int i3;
        bmot[] bmotArr;
        int i4;
        int i5;
        bxwc bxwc;
        int i6;
        int i7;
        bxwc bxwc2;
        int i8;
        ViewGroup viewGroup2;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        bxwc bxwc3;
        boolean z3;
        int i13;
        ViewGroup viewGroup3;
        bmdx bmdx;
        bmdx bmdx2;
        bmdx bmdx3;
        bkfl bkfl;
        bmdx bmdx4;
        bmdx bmdx5;
        boolean z4;
        ViewGroup viewGroup4;
        int i14;
        int i15;
        int i16;
        boolean z5;
        bmee bmee;
        bmee bmee2;
        bmee bmee3;
        bmee bmee4;
        bmee bmee5;
        bmee bmee6;
        bmjf bmjf;
        bmee bmee7;
        bmee bmee8;
        bmee bmee9;
        boolean z6;
        bmdx bmdx6;
        bmdx bmdx7;
        bmbr bmbr;
        int i17;
        bmdx bmdx8;
        bmee bmee10;
        bmee bmee11;
        LayoutInflater layoutInflater2 = layoutInflater;
        int[] iArr = {C0126R.attr.internalUicInfoMessageLayout, C0126R.attr.internalUicLegalMessageLayout, C0126R.attr.internalUicFormNonEditableTextStartMargin, C0126R.attr.uicLegalMessageTopMargin, C0126R.attr.internalUicMaterialFieldLayoutEnabled, C0126R.attr.internalUicRegionCodeViewLayout};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(iArr);
        this.f124399a = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicInfoMessageLayout), C0126R.C0128layout.view_info_message_text);
        int resourceId = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicLegalMessageLayout), C0126R.C0128layout.view_legal_message_text);
        this.f124400b = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicFormNonEditableTextStartMargin), 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.uicLegalMessageTopMargin), 0);
        this.f124392M = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicMaterialFieldLayoutEnabled), false);
        this.f124393N = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicRegionCodeViewLayout), C0126R.C0128layout.view_region_code);
        obtainStyledAttributes.recycle();
        LinearLayout linearLayout = (LinearLayout) layoutInflater2.inflate((int) C0126R.C0128layout.fragment_simple, viewGroup, false);
        this.f124404f = linearLayout;
        linearLayout.setId(mo65818aq().mo65614a());
        FormHeaderView formHeaderView = (FormHeaderView) this.f124404f.findViewById(C0126R.C0129id.header);
        this.f124383D = formHeaderView;
        bmdn bmdn = ((bmeb) this.f124069w).f128905b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater2, mo65982av(), this.f124395P);
        this.f124403e.add(new bkji(0, this.f124383D, null));
        bmdn bmdn2 = ((bmeb) this.f124069w).f128905b;
        if (bmdn2 == null) {
            bmdn2 = bmdn.f128831k;
        }
        bxwc bxwc4 = bmdn2.f128840h;
        int size = bxwc4.size();
        bmot[] bmotArr2 = (bmot[]) ((bmeb) this.f124069w).f128907d.toArray(new bmot[0]);
        int length = bmotArr2.length;
        new bjes(1716);
        int size2 = ((bmeb) this.f124069w).f128906c.size();
        SummaryExpanderWrapper summaryExpanderWrapper = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            bmea bmea = (bmea) ((bmeb) this.f124069w).f128906c.get(i19);
            LinearLayout linearLayout2 = this.f124404f;
            if (i18 < size) {
                i = size2;
                if (i19 >= ((bmlv) bxwc4.get(i18)).f129974j) {
                    z = i19 <= ((bmlv) bxwc4.get(i18)).f129975k;
                    if (!z) {
                        if (i19 == ((bmlv) bxwc4.get(i18)).f129974j) {
                            bmlv bmlv = (bmlv) bxwc4.get(i18);
                            int a = bmlu.m108157a(bmlv.f129968d);
                            if (a != 0) {
                                int i21 = i19;
                                if (a == 4) {
                                    int i22 = bmlv.f129974j;
                                    boolean z7 = false;
                                    boolean z8 = false;
                                    boolean z9 = false;
                                    while (i22 <= bmlv.f129975k) {
                                        bmea bmea2 = (bmea) ((bmeb) this.f124069w).f128906c.get(i22);
                                        int i23 = length;
                                        int i24 = bmea2.f128899a;
                                        bmot[] bmotArr3 = bmotArr2;
                                        if (i24 == 1) {
                                            int size3 = ((bmee) bmea2.f128900b).f128926c.size();
                                            int i25 = 0;
                                            while (i25 < size3) {
                                                int i26 = size3;
                                                int i27 = size;
                                                if (bmea2.f128899a == 1) {
                                                    bmee10 = (bmee) bmea2.f128900b;
                                                } else {
                                                    bmee10 = bmee.f128922e;
                                                }
                                                if (((bmdx) bmee10.f128926c.get(i25)).f128888a == 2) {
                                                    z8 = true;
                                                }
                                                if (bmea2.f128899a == 1) {
                                                    bmee11 = (bmee) bmea2.f128900b;
                                                } else {
                                                    bmee11 = bmee.f128922e;
                                                }
                                                if (((bmdx) bmee11.f128926c.get(i25)).f128888a == 4) {
                                                    z7 = true;
                                                }
                                                i25++;
                                                size3 = i26;
                                                size = i27;
                                            }
                                            i17 = size;
                                            z9 = true;
                                        } else {
                                            i17 = size;
                                            if (i24 == 2) {
                                                bmdx8 = (bmdx) bmea2.f128900b;
                                            } else {
                                                bmdx8 = bmdx.f128886d;
                                            }
                                            z8 = (bmdx8.f128888a == 2) | z8;
                                            if ((bmea2.f128899a == 2 ? (bmdx) bmea2.f128900b : bmdx.f128886d).f128888a == 4) {
                                                z7 = true;
                                            }
                                        }
                                        i22++;
                                        length = i23;
                                        bmotArr2 = bmotArr3;
                                        size = i17;
                                    }
                                    int i28 = length;
                                    bmot[] bmotArr4 = bmotArr2;
                                    int i29 = size;
                                    if (!((Boolean) bjwe.f123472G.mo54082a()).booleanValue() && z7) {
                                        throw new IllegalArgumentException(mo65883d("OTP fields are not supported in field groups."));
                                    } else if (!z8) {
                                        summaryExpanderWrapper = mo52915a((bmlv) bxwc4.get(i18), this.f124404f);
                                        summaryExpanderWrapper.setId(mo65818aq().mo65614a());
                                        this.f124404f.addView(summaryExpanderWrapper);
                                        this.f124405g.add(summaryExpanderWrapper);
                                        mo52776bU().mo66032a((bkiq) summaryExpanderWrapper);
                                        bxwc2 = bxwc4;
                                        i7 = i21;
                                        i6 = i28;
                                        bmotArr = bmotArr4;
                                        i3 = i29;
                                        i8 = i18;
                                    } else {
                                        int i30 = bmlv.f129974j;
                                        if (i30 < bmlv.f129975k) {
                                            throw new IllegalArgumentException(mo65883d("Field groups containing address forms may not contain multiple fields."));
                                        } else if (!z9) {
                                            bmea bmea3 = (bmea) ((bmeb) this.f124069w).f128906c.get(i30);
                                            if (bmea3.f128899a != 2) {
                                                bmdx6 = bmdx.f128886d;
                                            } else {
                                                bmdx6 = (bmdx) bmea3.f128900b;
                                            }
                                            bxvd bxvd = (bxvd) bmdx6.mo74142c(5);
                                            bxvd.mo73625a((bxvk) bmdx6);
                                            bmea bmea4 = (bmea) ((bmeb) this.f124069w).f128906c.get(bmlv.f129974j);
                                            if (bmea4.f128899a != 2) {
                                                bmdx7 = bmdx.f128886d;
                                            } else {
                                                bmdx7 = (bmdx) bmea4.f128900b;
                                            }
                                            if (bmdx7.f128888a == 2) {
                                                bmbr = (bmbr) bmdx7.f128889b;
                                            } else {
                                                bmbr = bmbr.f128572L;
                                            }
                                            bxvd bxvd2 = (bxvd) bmbr.mo74142c(5);
                                            bxvd2.mo73625a((bxvk) bmbr);
                                            bmbn bmbn = (bmbn) bxvd2;
                                            String str = bmlv.f129970f;
                                            if (bmbn.f164950c) {
                                                bmbn.mo74035c();
                                                bmbn.f164950c = false;
                                            }
                                            bmbr bmbr2 = (bmbr) bmbn.f164949b;
                                            bxvu bxvu = bmbr.f128574y;
                                            str.getClass();
                                            bmbr2.f128584a |= 1048576;
                                            bmbr2.f128578E = str;
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            bmdx bmdx9 = (bmdx) bxvd.f164949b;
                                            bmbr bmbr3 = (bmbr) bmbn.mo74062i();
                                            bmdx bmdx10 = bmdx.f128886d;
                                            bmbr3.getClass();
                                            bmdx9.f128889b = bmbr3;
                                            bmdx9.f128888a = 2;
                                            bmdx bmdx11 = (bmdx) bxvd.mo74062i();
                                            LinearLayout linearLayout3 = this.f124404f;
                                            bmdn bmdn3 = ((bmeb) this.f124069w).f128905b;
                                            if (bmdn3 == null) {
                                                bmdn3 = bmdn.f128831k;
                                            }
                                            bmotArr = bmotArr4;
                                            i3 = i29;
                                            m105968a(linearLayout3, null, bmdx11, bmdn3.f128834b, -1, bmlv.f129974j, false);
                                            i5 = i21;
                                            i2 = i28;
                                            i4 = i18 + 1;
                                            bxwc = bxwc4;
                                            i19 = i5 + 1;
                                            bxwc4 = bxwc;
                                            i18 = i4;
                                            size2 = i;
                                            bmotArr2 = bmotArr;
                                            size = i3;
                                            length = i2;
                                        } else {
                                            throw new IllegalArgumentException(mo65883d("Field groups containing address forms may not contain subforms."));
                                        }
                                    }
                                }
                            }
                            throw new IllegalArgumentException(mo65883d("Component group types other than field groups are not supported."));
                        }
                        i7 = i19;
                        i6 = length;
                        bmotArr = bmotArr2;
                        i3 = size;
                        bxwc2 = bxwc4;
                        i8 = i18;
                        viewGroup2 = summaryExpanderWrapper.f152309e;
                    } else {
                        i7 = i19;
                        i6 = length;
                        bmotArr = bmotArr2;
                        i3 = size;
                        i8 = i18;
                        viewGroup2 = linearLayout2;
                        bxwc2 = bxwc4;
                    }
                    i9 = i6;
                    if (i20 >= i9) {
                        bmot bmot = bmotArr[i20];
                        i10 = i7;
                        if (i10 >= bmot.f130257a && i10 <= bmot.f130258b) {
                            z2 = true;
                            if (z && z2 && (bmotArr[i20].f130257a < ((bmlv) bxwc2.get(i8)).f129974j || bmotArr[i20].f130258b > ((bmlv) bxwc2.get(i8)).f129975k)) {
                                throw new IllegalArgumentException(mo65883d("Field groupings cannot partially intersect component groups."));
                            }
                            i11 = bmea.f128899a;
                            if (i11 == 1) {
                                if (!z2) {
                                    viewGroup4 = viewGroup2;
                                } else {
                                    viewGroup4 = m105963a(viewGroup2, bmotArr[i20], i10, layoutInflater2);
                                }
                                int size4 = this.f124402d.size();
                                this.f124402d.add(new ArrayList());
                                bkje bkje = new bkje(this, size4);
                                this.f124395P.add(bkje);
                                this.f124396Q.add(bkje);
                                LinearLayout linearLayout4 = (LinearLayout) layoutInflater2.inflate((int) C0126R.C0128layout.view_subform, viewGroup4, false);
                                if (z2) {
                                    bmot bmot2 = bmotArr[i20];
                                    i15 = i9;
                                    LinearLayout.LayoutParams a2 = m105964a(linearLayout4, bmot2, i10, m105970a(bmot2, i10));
                                    i12 = i8;
                                    int i31 = bmot2.f130258b;
                                    if (i10 == i31) {
                                        i14 = i10;
                                        z6 = bmot2.f130260d.contains(Integer.valueOf(i31 + 1));
                                        i20++;
                                        m105967a(viewGroup4, bmot2);
                                    } else {
                                        i14 = i10;
                                        z6 = false;
                                    }
                                    linearLayout4.setLayoutParams(a2);
                                    i16 = i20;
                                    z5 = z6;
                                } else {
                                    i15 = i9;
                                    i14 = i10;
                                    i12 = i8;
                                    i16 = i20;
                                    z5 = false;
                                }
                                FormHeaderView formHeaderView2 = (FormHeaderView) linearLayout4.findViewById(C0126R.C0129id.subform_header);
                                if (bmea.f128899a != 1) {
                                    bmee = bmee.f128922e;
                                } else {
                                    bmee = (bmee) bmea.f128900b;
                                }
                                bmdn bmdn4 = bmee.f128925b;
                                if (bmdn4 == null) {
                                    bmdn4 = bmdn.f128831k;
                                }
                                formHeaderView2.mo71963a(bmdn4, layoutInflater2, mo65982av(), (List) this.f124402d.get(size4));
                                bkji bkji = new bkji(0, formHeaderView2, null);
                                this.f124384E.add(formHeaderView2);
                                if (summaryExpanderWrapper != null) {
                                    summaryExpanderWrapper.mo72160a(bkji);
                                } else {
                                    this.f124403e.add(bkji);
                                }
                                if (bmea.f128899a == 1) {
                                    bmee2 = (bmee) bmea.f128900b;
                                } else {
                                    bmee2 = bmee.f128922e;
                                }
                                int size5 = bmee2.f128926c.size();
                                int i32 = 0;
                                while (i32 < size5) {
                                    if (bmea.f128899a == 1) {
                                        bmee8 = (bmee) bmea.f128900b;
                                    } else {
                                        bmee8 = bmee.f128922e;
                                    }
                                    bmdx bmdx12 = (bmdx) bmee8.f128926c.get(i32);
                                    if (bmea.f128899a == 1) {
                                        bmee9 = (bmee) bmea.f128900b;
                                    } else {
                                        bmee9 = bmee.f128922e;
                                    }
                                    bmdn bmdn5 = bmee9.f128925b;
                                    if (bmdn5 == null) {
                                        bmdn5 = bmdn.f128831k;
                                    }
                                    m105968a(linearLayout4, summaryExpanderWrapper, bmdx12, bmdn5.f128834b, size4, i32, false);
                                    i32++;
                                    z5 = z5;
                                    linearLayout4 = linearLayout4;
                                    bmea = bmea;
                                    i15 = i15;
                                    size4 = size4;
                                    bxwc2 = bxwc2;
                                    size5 = size5;
                                    viewGroup4 = viewGroup4;
                                }
                                int i33 = size4;
                                ViewGroup viewGroup5 = viewGroup4;
                                LinearLayout linearLayout5 = linearLayout4;
                                bxwc3 = bxwc2;
                                boolean z10 = z5;
                                i2 = i15;
                                int i34 = i14;
                                bmea bmea5 = bmea;
                                if (bmea5.f128899a == 1) {
                                    bmee3 = (bmee) bmea5.f128900b;
                                } else {
                                    bmee3 = bmee.f128922e;
                                }
                                if ((bmee3.f128924a & 2) != 0) {
                                    LayoutInflater layoutInflater3 = this.f123963aH;
                                    bmjf bmjf2 = (bmea5.f128899a == 1 ? (bmee) bmea5.f128900b : bmee.f128922e).f128927d;
                                    if (bmjf2 == null) {
                                        bmjf2 = bmjf.f129685i;
                                    }
                                    View a3 = bkfr.m105548a(layoutInflater3, resourceId, bmjf2, mo65982av());
                                    a3.setId(mo65818aq().mo65614a());
                                    linearLayout5.addView(a3);
                                    this.f124420v.add(a3);
                                    ((ArrayList) this.f124402d.get(i33)).add((bjer) a3);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a3.getLayoutParams();
                                    C1260oz.m19821a(marginLayoutParams, this.f124400b);
                                    if (bmea5.f128899a != 1) {
                                        bmee5 = bmee.f128922e;
                                    } else {
                                        bmee5 = (bmee) bmea5.f128900b;
                                    }
                                    bmjf bmjf3 = bmee5.f128927d;
                                    if (bmjf3 == null) {
                                        bmjf3 = bmjf.f129685i;
                                    }
                                    if ((bmjf3.f129687a & 2) != 0) {
                                        if (bmea5.f128899a == 1) {
                                            bmee7 = (bmee) bmea5.f128900b;
                                        } else {
                                            bmee7 = bmee.f128922e;
                                        }
                                        bmjf bmjf4 = bmee7.f128927d;
                                        if (bmjf4 == null) {
                                            bmjf4 = bmjf.f129685i;
                                        }
                                        bmnr bmnr = bmjf4.f129689c;
                                        if (bmnr == null) {
                                            bmnr = bmnr.f130153o;
                                        }
                                        if (bmnr.f130164j) {
                                            marginLayoutParams.topMargin = 0;
                                            marginLayoutParams.bottomMargin = 0;
                                            if (bmea5.f128899a != 1) {
                                                bmee6 = (bmee) bmea5.f128900b;
                                            } else {
                                                bmee6 = bmee.f128922e;
                                            }
                                            bmjf = bmee6.f128927d;
                                            if (bmjf == null) {
                                                bmjf = bmjf.f129685i;
                                            }
                                            bkji bkji2 = new bkji(bmjf.f129688b, a3, null);
                                            if (summaryExpanderWrapper == null) {
                                                summaryExpanderWrapper.mo72160a(bkji2);
                                            } else {
                                                this.f124403e.add(bkji2);
                                            }
                                        }
                                    }
                                    marginLayoutParams.topMargin = dimensionPixelSize;
                                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                                    if (bmea5.f128899a != 1) {
                                    }
                                    bmjf = bmee6.f128927d;
                                    if (bmjf == null) {
                                    }
                                    bkji bkji22 = new bkji(bmjf.f129688b, a3, null);
                                    if (summaryExpanderWrapper == null) {
                                    }
                                }
                                if (bmea5.f128899a == 1) {
                                    bmee4 = (bmee) bmea5.f128900b;
                                } else {
                                    bmee4 = bmee.f128922e;
                                }
                                bmdn bmdn6 = bmee4.f128925b;
                                if (bmdn6 == null) {
                                    bmdn6 = bmdn.f128831k;
                                }
                                ViewGroup viewGroup6 = viewGroup5;
                                viewGroup6.addView(bkfr.m105550a(bmdn6, linearLayout5, this.f123963aH));
                                if (z10) {
                                    layoutInflater2 = layoutInflater;
                                    layoutInflater2.inflate((int) C0126R.C0128layout.view_splitting_view, viewGroup6, true);
                                } else {
                                    layoutInflater2 = layoutInflater;
                                }
                                i20 = i16;
                                i5 = i34;
                            } else {
                                i2 = i9;
                                int i35 = i10;
                                i12 = i8;
                                bxwc3 = bxwc2;
                                int i36 = i20;
                                bmea bmea6 = bmea;
                                if (i11 == 2) {
                                    if (z2) {
                                        i13 = i35;
                                        ViewGroup a4 = m105963a(viewGroup2, bmotArr[i36], i13, layoutInflater2);
                                        if (m105962a(bmotArr[i36]) == 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        viewGroup3 = a4;
                                        z3 = z4;
                                    } else {
                                        i13 = i35;
                                        viewGroup3 = viewGroup2;
                                        z3 = false;
                                    }
                                    if (bmea6.f128899a == 2) {
                                        bmdx = (bmdx) bmea6.f128900b;
                                    } else {
                                        bmdx = bmdx.f128886d;
                                    }
                                    bmdn bmdn7 = ((bmeb) this.f124069w).f128905b;
                                    if (bmdn7 == null) {
                                        bmdn7 = bmdn.f128831k;
                                    }
                                    ViewGroup viewGroup7 = viewGroup3;
                                    int i37 = i13;
                                    m105968a(viewGroup3, summaryExpanderWrapper, bmdx, bmdn7.f128834b, -1, i13, z3);
                                    if (z2) {
                                        bmot bmot3 = bmotArr[i36];
                                        ViewGroup viewGroup8 = viewGroup7;
                                        View childAt = viewGroup8.getChildAt(viewGroup7.getChildCount() - 1);
                                        if (bmea6.f128899a != 2) {
                                            bmdx2 = bmdx.f128886d;
                                        } else {
                                            bmdx2 = (bmdx) bmea6.f128900b;
                                        }
                                        if (!bmdx2.f128890c) {
                                            i5 = i37;
                                            boolean a5 = m105970a(bmot3, i5);
                                            LinearLayout.LayoutParams a6 = m105964a(childAt, bmot3, i5, a5);
                                            if (bmea6.f128899a == 2) {
                                                bmdx3 = (bmdx) bmea6.f128900b;
                                            } else {
                                                bmdx3 = bmdx.f128886d;
                                            }
                                            if (bmdx3.f128888a != 10) {
                                                if (bmea6.f128899a == 2) {
                                                    bmdx4 = (bmdx) bmea6.f128900b;
                                                } else {
                                                    bmdx4 = bmdx.f128886d;
                                                }
                                                if (bmdx4.f128888a != 11) {
                                                    if (bmea6.f128899a == 2) {
                                                        bmdx5 = (bmdx) bmea6.f128900b;
                                                    } else {
                                                        bmdx5 = bmdx.f128886d;
                                                    }
                                                }
                                            }
                                            a6.gravity = 16;
                                            int i38 = bmot3.f130258b;
                                            if (i5 == i38) {
                                                if (bmot3.f130260d.contains(Integer.valueOf(i38 + 1))) {
                                                    layoutInflater2.inflate((int) C0126R.C0128layout.view_splitting_view, viewGroup8, true);
                                                }
                                                i20 = i36 + 1;
                                                m105967a(viewGroup8, bmot3);
                                            } else {
                                                i20 = i36;
                                            }
                                            childAt.setLayoutParams(a6);
                                            if (childAt instanceof bkfl) {
                                                bkfl = (bkfl) childAt;
                                            } else {
                                                if (childAt instanceof ViewGroup) {
                                                    ViewGroup viewGroup9 = (ViewGroup) childAt;
                                                    int childCount = viewGroup9.getChildCount();
                                                    int i39 = 0;
                                                    while (true) {
                                                        if (i39 >= childCount) {
                                                            break;
                                                        }
                                                        View childAt2 = viewGroup9.getChildAt(i39);
                                                        if (childAt2 instanceof bkfl) {
                                                            bkfl = (bkfl) childAt2;
                                                            break;
                                                        }
                                                        i39++;
                                                    }
                                                }
                                                bkfl = null;
                                            }
                                            if (!(bkfl == null || childAt == bkfl)) {
                                                bkfl.getLayoutParams().width = -2;
                                                bkfl.mo65960a();
                                            }
                                            View b = bkft.m105641b(childAt);
                                            if (a5 && b.getLayoutParams().width <= 0) {
                                                b.getLayoutParams().width = -2;
                                                b.setLayoutParams(b.getLayoutParams());
                                            }
                                        } else {
                                            throw new IllegalArgumentException(mo65883d("Can not use hideFieldsBelow with FieldGrouping"));
                                        }
                                    } else {
                                        i5 = i37;
                                        i20 = i36;
                                    }
                                } else {
                                    throw new IllegalArgumentException(mo65883d("Empty or unknown form field in SimpleForm."));
                                }
                            }
                            if (z) {
                                bxwc = bxwc3;
                                i4 = i12;
                                if (i5 == ((bmlv) bxwc.get(i4)).f129975k) {
                                    summaryExpanderWrapper.mo72169i();
                                    i4++;
                                    summaryExpanderWrapper = null;
                                }
                            } else {
                                bxwc = bxwc3;
                                i4 = i12;
                            }
                            i19 = i5 + 1;
                            bxwc4 = bxwc;
                            i18 = i4;
                            size2 = i;
                            bmotArr2 = bmotArr;
                            size = i3;
                            length = i2;
                        }
                    } else {
                        i10 = i7;
                    }
                    z2 = false;
                    if (z) {
                        throw new IllegalArgumentException(mo65883d("Field groupings cannot partially intersect component groups."));
                    }
                    i11 = bmea.f128899a;
                    if (i11 == 1) {
                    }
                    if (z) {
                    }
                    i19 = i5 + 1;
                    bxwc4 = bxwc;
                    i18 = i4;
                    size2 = i;
                    bmotArr2 = bmotArr;
                    size = i3;
                    length = i2;
                }
            } else {
                i = size2;
            }
            z = false;
            if (!z) {
            }
            i9 = i6;
            if (i20 >= i9) {
            }
            z2 = false;
            if (z) {
            }
            i11 = bmea.f128899a;
            if (i11 == 1) {
            }
            if (z) {
            }
            i19 = i5 + 1;
            bxwc4 = bxwc;
            i18 = i4;
            size2 = i;
            bmotArr2 = bmotArr;
            size = i3;
            length = i2;
        }
        bmeb bmeb = (bmeb) this.f124069w;
        if ((bmeb.f128904a & 2) != 0) {
            LayoutInflater layoutInflater4 = this.f123963aH;
            bmjf bmjf5 = bmeb.f128908e;
            if (bmjf5 == null) {
                bmjf5 = bmjf.f129685i;
            }
            View a7 = bkfr.m105548a(layoutInflater4, resourceId, bmjf5, mo65982av());
            a7.setId(mo65818aq().mo65614a());
            this.f124404f.addView(a7);
            this.f124420v.add(a7);
            this.f124395P.add((bjer) a7);
            ArrayList arrayList = this.f124403e;
            bmjf bmjf6 = ((bmeb) this.f124069w).f128908e;
            if (bmjf6 == null) {
                bmjf6 = bmjf.f129685i;
            }
            arrayList.add(new bkji(bmjf6.f129688b, a7, null));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) a7.getLayoutParams();
            C1260oz.m19821a(marginLayoutParams2, this.f124400b);
            bmjf bmjf7 = ((bmeb) this.f124069w).f128908e;
            if (bmjf7 == null) {
                bmjf7 = bmjf.f129685i;
            }
            if ((bmjf7.f129687a & 2) != 0) {
                bmjf bmjf8 = ((bmeb) this.f124069w).f128908e;
                if (bmjf8 == null) {
                    bmjf8 = bmjf.f129685i;
                }
                bmnr bmnr2 = bmjf8.f129689c;
                if (bmnr2 == null) {
                    bmnr2 = bmnr.f130153o;
                }
                if (bmnr2.f130164j) {
                    marginLayoutParams2.topMargin = 0;
                }
            }
            marginLayoutParams2.topMargin = dimensionPixelSize;
        }
        m105971m();
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            this.f124387H = bundle2.getInt("revealBelowTriggeredCount");
        }
        if (this.f124387H != this.f124385F.size()) {
            int intValue = ((Integer) this.f124385F.get(this.f124387H)).intValue();
            int intValue2 = ((Integer) this.f124386G.get(this.f124387H)).intValue();
            int childCount2 = this.f124404f.getChildCount();
            for (int i40 = intValue + 1; i40 < childCount2; i40++) {
                this.f124404f.getChildAt(i40).setVisibility(8);
            }
            if (intValue2 >= 0) {
                ViewGroup viewGroup10 = (ViewGroup) this.f124404f.getChildAt(intValue);
                int childCount3 = viewGroup10.getChildCount();
                for (int i41 = intValue2 + 1; i41 < childCount3; i41++) {
                    viewGroup10.getChildAt(i41).setVisibility(8);
                }
            }
        }
        return this.f124404f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo52908a(View view, bmqf bmqf, ViewGroup viewGroup, boolean z) {
        if (!this.f124392M) {
            return view;
        }
        int a = bmqo.m108290a(mo52789r().f128839g);
        if (a == 0) {
            a = 1;
        }
        return !bkft.m105637a(a, bmqf) ? bkem.m105438a(this.f123962aG, view, viewGroup, mo65818aq().mo65614a(), z) : view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bkag mo52909a(bmbr bmbr, boolean z) {
        return bkfr.m105552a(bmbr, this.f123961aF, mo65980at());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bkbn mo52910a(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = i - 1;
        int i4 = C0126R.C0128layout.view_button_component;
        if (i3 != 7) {
            i2 = i3 != 15 ? C0126R.attr.internalUicButtonDefaultLayout : C0126R.attr.internalUicButtonTypeHairlineLayout;
        } else {
            i2 = C0126R.attr.internalUicButtonTypeLinkLayout;
            i4 = C0126R.C0128layout.view_link_button;
        }
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, i4);
        obtainStyledAttributes.recycle();
        bkbn bkbn = (bkbn) this.f123963aH.inflate(resourceId, viewGroup, false);
        if (i == 8) {
            bkbn.mo52703a().setTextColor(bkfr.m105600c(this.f123962aG));
        }
        return bkbn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bkdx mo52911a(bmcb bmcb) {
        throw new IllegalArgumentException(mo65883d("Can't create fragment for authentication form"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bkdx mo52912a(bmqf bmqf) {
        throw new IllegalArgumentException(mo65883d("Can't create fragment for uiField"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bkiv mo52913a(bmji bmji) {
        int i = this.f123961aF;
        LogContext at = mo65980at();
        bkiv bkiv = new bkiv();
        bkiv.setArguments(bkdx.m105383a(i, bmji, at));
        return bkiv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bmcc mo52914a(int i) {
        throw new IllegalArgumentException(mo65883d("Can't get authentication form value."));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SummaryExpanderWrapper mo52915a(bmlv bmlv, ViewGroup viewGroup) {
        throw new IllegalStateException(mo65883d("Field groups are not supported for SimpleFragment."));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52917a(bkdx bkdx) {
        throw new IllegalArgumentException(mo65883d("Can't initialize authentication form fragment"));
    }

    /* renamed from: a */
    public final void mo66081a(bmel bmel) {
        if (((bkjp) getFragmentManager().findFragmentByTag("updatableCartDialog")) == null) {
            int i = this.f123961aF;
            bkjp bkjp = new bkjp();
            Bundle a = bkbq.m105268a(i);
            bjvp.m104736a(a, "argDialogProto", bmel);
            bkjp.setArguments(a);
            bkjp.show(getChildFragmentManager(), "updatableCartDialog");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkev.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      bkev.a(android.os.Bundle, android.view.View):android.view.View
      bkev.a(int, android.os.Bundle):void
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkev.a(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkew.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      bkew.a(java.lang.String, java.lang.String):java.lang.String
      bkew.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        int size = this.f124403e.size();
        for (int i = 0; i < size; i++) {
            bkji bkji = (bkji) this.f124403e.get(i);
            bmaf bmaf = bmas.f128496a;
            if (bmaf == null) {
                bmaf = bmaf.f128436d;
            }
            if (bmaf.f128438a.equals(bkji.f124380c)) {
                bmaf bmaf2 = bmas.f128496a;
                if (bmaf2 == null) {
                    bmaf2 = bmaf.f128436d;
                }
                if (bmaf2.f128440c == bkji.f124381g) {
                    int i2 = bkji.f124378a;
                    if (i2 == 1) {
                        bkft.m105635a((View) this.f124407i.get(bkji.f124379b), bmas.f128497b);
                    } else if (i2 != 2) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        bmaf bmaf3 = bmas.f128496a;
                        if (bmaf3 == null) {
                            bmaf3 = bmaf.f128436d;
                        }
                        objArr[0] = Integer.valueOf(bmaf3.f128439b);
                        throw new IllegalArgumentException(mo65883d(String.format(locale, "Could not apply FormFieldMessage to fieldId: %d", objArr)));
                    } else {
                        ((bkev) this.f124413o.get(bkji.f124379b)).mo65794a((CharSequence) bmas.f128497b, true);
                    }
                    return true;
                }
            }
        }
        int size2 = this.f124408j.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((bkag) this.f124408j.get(i3)).mo52281a(bmas)) {
                return true;
            }
        }
        int size3 = this.f124410l.size();
        for (int i4 = 0; i4 < size3; i4++) {
            if (((bkiv) this.f124410l.get(i4)).mo52281a(bmas)) {
                return true;
            }
        }
        int size4 = this.f124418t.size();
        int i5 = 0;
        while (i5 < size4) {
            bkew bkew = (bkew) bkft.m105641b((View) this.f124418t.get(i5));
            bmaf bmaf4 = bmas.f128496a;
            if (bmaf4 == null) {
                bmaf4 = bmaf.f128436d;
            }
            String str = bmaf4.f128438a;
            bmdn bmdn = bkew.f124116a.f128869b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            if (!str.equals(bmdn.f128834b)) {
                i5++;
            } else {
                bkew.mo65794a((CharSequence) bmas.f128497b, true);
                return true;
            }
        }
        return false;
    }
}
