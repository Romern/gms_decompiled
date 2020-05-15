package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: bkbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkbh extends bkdx implements bker, bkae {

    /* renamed from: C */
    private boolean f123917C;

    /* renamed from: a */
    public RelativeLayout f123918a;

    /* renamed from: b */
    public final ArrayList f123919b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f123920c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f123921d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f123922e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f123923f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f123924g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f123925h = new ArrayList();

    /* renamed from: i */
    public int[] f123926i;

    /* renamed from: j */
    protected bjxv f123927j;

    /* renamed from: k */
    boolean f123928k;

    /* renamed from: l */
    public final ArrayList f123929l = new ArrayList();

    /* renamed from: m */
    int[] f123930m;

    /* renamed from: n */
    bkbm f123931n;

    /* renamed from: o */
    public final ArrayList f123932o = new ArrayList();

    /* renamed from: p */
    public final ArrayList f123933p = new ArrayList();

    /* renamed from: q */
    public bmhq f123934q;

    /* renamed from: r */
    public bkbg f123935r;

    /* renamed from: s */
    public bjep f123936s;

    /* renamed from: t */
    public TextWatcher f123937t;

    /* renamed from: u */
    public TextWatcher f123938u;

    /* renamed from: v */
    private final ArrayList f123939v = new ArrayList();

    /* renamed from: a */
    public static final void m105207a(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i != -1) {
            bkfr.m105592b();
            layoutParams.addRule(10, 0);
            bkfr.m105592b();
            layoutParams.addRule(3, i);
            return;
        }
        bkfr.m105592b();
        layoutParams.addRule(10);
        bkfr.m105592b();
        layoutParams.addRule(3, 0);
    }

    /* renamed from: W */
    public final long mo52837W() {
        return 0;
    }

    /* renamed from: b */
    public final ArrayList mo65774b(int i) {
        ArrayList arrayList = new ArrayList();
        int size = this.f123933p.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = (ArrayList) this.f123933p.get(i2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bkbf bkbf = (bkbf) arrayList2.get(i3);
                if (bkbf.f123914a == 1 && bkbf.f123916c == i) {
                    arrayList.add((View) this.f123921d.get(bkbf.f123915b));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        bmhq bmhq = this.f123934q;
        if (bmhq == null) {
            return false;
        }
        bxvt bxvt = bmhq.f129469j;
        int size = bxvt.size();
        int i = 0;
        while (i < size) {
            int intValue = ((Integer) bxvt.get(i)).intValue();
            ArrayList arrayList = (ArrayList) this.f123933p.get(intValue);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bkbf bkbf = (bkbf) arrayList.get(i2);
                if (bkbf.f123914a == 4) {
                    bjzp bjzp = (bjzp) this.f123922e.get(bkbf.f123915b);
                }
            }
            i++;
            if (!((ArrayList) this.f123925h.get(intValue)).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        ArrayList arrayList = new ArrayList();
        bmhq bmhq = this.f123934q;
        if (bmhq != null) {
            bxvt bxvt = bmhq.f129469j;
            int size = bxvt.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((bjer) this.f123939v.get(((Integer) bxvt.get(i)).intValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        ArrayList arrayList = new ArrayList();
        bmhq bmhq = this.f123934q;
        if (bmhq != null) {
            bxvt bxvt = bmhq.f129469j;
            int size = bxvt.size();
            for (int i = 0; i < size; i++) {
                arrayList.addAll((Collection) this.f123933p.get(((Integer) bxvt.get(i)).intValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        int size = this.f123921d.size();
        for (int i = 0; i < size; i++) {
            bkft.m105645c((View) this.f123921d.get(i));
        }
        int size2 = this.f123922e.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bjzp) this.f123922e.get(i2)).mo52947bY();
        }
        int size3 = this.f123923f.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((bkev) this.f123923f.get(i3)).mo52947bY();
        }
        int size4 = this.f123933p.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ArrayList arrayList = (ArrayList) this.f123933p.get(i4);
            int size5 = arrayList.size();
            for (int i5 = 0; i5 < size5; i5++) {
                bkbf bkbf = (bkbf) arrayList.get(i5);
                int i6 = bkbf.f123914a;
                if (i6 == 1) {
                    bjwl.m104790b((View) this.f123921d.get(bkbf.f123915b), bkbf.f124038d, this.f124196aK);
                } else if (!(i6 == 2 || i6 == 4)) {
                    throw new IllegalStateException(String.format("Unknown field type %d in CardSubform.", Integer.valueOf(i6)));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo65692c() {
        bjep bjep = this.f123936s;
        if (bjep != null) {
            bjep.mo65063i();
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        int size = this.f123921d.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f123921d.get(i)).setEnabled(z);
        }
        int size2 = this.f123922e.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bjzp) this.f123922e.get(i2)).mo52808n(z);
        }
        int size3 = this.f123923f.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((bkev) this.f123923f.get(i3)).mo52808n(z);
        }
        int size4 = this.f123924g.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((View) this.f123924g.get(i4)).setEnabled(z);
        }
        int size5 = this.f123919b.size();
        for (int i5 = 0; i5 < size5; i5++) {
            ((SummaryExpanderWrapper) this.f123919b.get(i5)).setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo52964m() {
        return false;
    }

    public final void onDestroyView() {
        this.f123939v.clear();
        this.f123933p.clear();
        this.f123920c.clear();
        this.f123921d.clear();
        this.f123922e.clear();
        this.f123923f.clear();
        this.f123924g.clear();
        super.onDestroyView();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntArray("revealBelowTriggeredCount", this.f123926i);
        Bundle bundle2 = new Bundle();
        this.f123927j.mo65615a(bundle2);
        bundle.putBundle("resettableIdGeneratorState", bundle2);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        ArrayList b = mo65774b(4);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) b.get(i);
            if (view instanceof TextView) {
                ((TextView) view).addTextChangedListener(this.f123937t);
            }
        }
        ArrayList b2 = mo65774b(2);
        int size2 = b2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            View view2 = (View) b2.get(i2);
            if (view2 instanceof TextView) {
                ((TextView) view2).addTextChangedListener(this.f123938u);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmhi.f129409r.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: b */
    public final void mo65691b() {
        bjep bjep = this.f123936s;
        if (bjep != null) {
            bjep.mo65061c();
        }
    }

    /* renamed from: a */
    public final View mo65772a(int i) {
        int i2;
        bmhq bmhq = this.f123934q;
        View view = null;
        if (bmhq != null) {
            bxvt bxvt = bmhq.f129469j;
            int size = bxvt.size();
            int i3 = 0;
            while (i3 < size) {
                ArrayList arrayList = (ArrayList) this.f123933p.get(((Integer) bxvt.get(i3)).intValue());
                int size2 = arrayList.size();
                int i4 = 0;
                while (true) {
                    i2 = i3 + 1;
                    if (i4 >= size2) {
                        break;
                    }
                    bkbf bkbf = (bkbf) arrayList.get(i4);
                    if (bkbf.f123914a == 1 && bkbf.f123916c == i) {
                        view = (View) this.f123921d.get(bkbf.f123915b);
                    }
                    i4++;
                }
                i3 = i2;
            }
            if (view instanceof bkdd) {
                return bkft.m105641b(view);
            }
        }
        return view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.RelativeLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0505, code lost:
        r0.f123925h.add(r5);
        r8.setVisibility(8);
        r0.f123918a.addView(r8);
        r2 = r2 + 1;
        r1 = r22;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0160, code lost:
        throw new java.lang.IllegalArgumentException("Field groups containing address forms may not contain multiple fields.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017e, code lost:
        r11 = r15;
        r7 = r16;
     */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int[] iArr;
        bkba bkba;
        int i2;
        int i3;
        bkbf bkbf;
        View view;
        bmds bmds;
        bmds bmds2;
        bmbr bmbr;
        bmbr bmbr2;
        bmqf bmqf;
        bmqf bmqf2;
        bmqf bmqf3;
        bmqf bmqf4;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        LayoutInflater layoutInflater2 = layoutInflater;
        Bundle bundle2 = bundle;
        int size = ((bmhi) this.f124069w).f129414d.size();
        boolean[] zArr = new boolean[size];
        boolean[] zArr2 = new boolean[size];
        boolean[] zArr3 = new boolean[size];
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int i7 = 2;
            if (i6 >= size) {
                break;
            }
            bmhk bmhk = (bmhk) ((bmhi) this.f124069w).f129414d.get(i6);
            if (bmhk.f129440d.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[i6] = z2;
            bxwc bxwc = bmhk.f129440d;
            int size2 = bxwc.size();
            int i8 = 0;
            while (i8 < size2) {
                bmhc bmhc = (bmhc) bxwc.get(i8);
                int i9 = size;
                int i10 = bmhc.f129398a;
                if (i10 == i7) {
                    zArr2[i6] = true;
                } else if (i10 == 4) {
                    zArr3[i6] = true;
                }
                if (bmhc.f129400c) {
                    z3 = true;
                }
                i8++;
                size = i9;
                i7 = 2;
            }
            int i11 = size;
            if (bmhk.f129442f >= 0) {
                z4 = true;
            }
            i6++;
            size = i11;
        }
        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        boolean z5 = bmdn.f128840h.size() == 1;
        bxwc bxwc2 = ((bmhi) this.f124069w).f129421m;
        int size3 = bxwc2.size();
        boolean z6 = z5;
        int i12 = 0;
        loop2:
        while (i12 < size3) {
            bmhq bmhq = (bmhq) bxwc2.get(i12);
            int i13 = 0;
            while (true) {
                int i14 = i12 + 1;
                bxwc bxwc3 = bxwc2;
                if (i13 >= bmhq.f129470k.size()) {
                    break;
                }
                bmlv bmlv = (bmlv) bmhq.f129470k.get(i13);
                int a = bmlu.m108157a(bmlv.f129968d);
                if (a != 0 && a == 4) {
                    if (!z5) {
                        z = z5;
                        i5 = size3;
                        i4 = i12;
                    } else if (i13 == 0) {
                        z = z5;
                        if (bmlv.f129974j == 0) {
                            int i15 = 1;
                            while (true) {
                                i5 = size3;
                                if (i15 > bmlv.f129975k) {
                                    i4 = i12;
                                    break;
                                }
                                int i16 = i12;
                                int b = bmhq.f129469j.mo74151b(i15 - 1);
                                if (!((Boolean) bjwe.f123472G.mo54082a()).booleanValue() && zArr3[b]) {
                                    throw new IllegalArgumentException("OTP fields are not supported in field groups.");
                                } else if (!zArr2[b]) {
                                    i15++;
                                    size3 = i5;
                                    i12 = i16;
                                } else {
                                    throw new IllegalArgumentException("Field groups containing address forms may not contain multiple fields.");
                                }
                            }
                            i13++;
                            bxwc2 = bxwc3;
                            z5 = z;
                            size3 = i5;
                            i12 = i4;
                            z6 = true;
                        } else {
                            throw new IllegalArgumentException("The first field group must contain the card number field.");
                        }
                    } else {
                        z = z5;
                        i5 = size3;
                        i4 = i12;
                    }
                    int i17 = bmlv.f129974j;
                    if (i17 != 0) {
                        while (i17 <= bmlv.f129975k) {
                            int b2 = bmhq.f129469j.mo74151b(i17 - 1);
                            if (!((Boolean) bjwe.f123472G.mo54082a()).booleanValue() && zArr3[b2]) {
                                throw new IllegalArgumentException("OTP fields are not supported in field groups.");
                            } else if (!zArr2[b2] || (!zArr[b2] && bmlv.f129974j >= bmlv.f129975k)) {
                                i17++;
                            }
                        }
                        continue;
                        i13++;
                        bxwc2 = bxwc3;
                        z5 = z;
                        size3 = i5;
                        i12 = i4;
                        z6 = true;
                    } else {
                        throw new IllegalArgumentException("This field group may not contain the card number field.");
                    }
                }
            }
            throw new IllegalArgumentException("Component group types other than field groups are not supported.");
        }
        if (z6) {
            if (!mo52964m()) {
                throw new IllegalArgumentException("Component groups are not supported.");
            } else if (z3) {
                throw new IllegalArgumentException("CardField.hide_fields_below may not be used in a card form which uses component groups.");
            } else if (z4) {
                throw new IllegalArgumentException("CardSubform.collapsible_fields_end_index may not be used in a card form which uses component groups.");
            }
        }
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicLegalMessageLayout, C0126R.attr.internalUicFormNonEditableTextStartMargin, C0126R.attr.internalUicCardFragmentCollapsibleStateEnabled, C0126R.attr.internalUicMaterialFieldLayoutEnabled});
        int resourceId = obtainStyledAttributes.getResourceId(0, C0126R.C0128layout.view_legal_message_text);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f123928k = obtainStyledAttributes.getBoolean(2, false);
        this.f123917C = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        int dimension = (int) this.f123962aG.getResources().getDimension(C0126R.dimen.wallet_uic_legal_message_top_margin);
        this.f123918a = (RelativeLayout) layoutInflater2.inflate((int) C0126R.C0128layout.fragment_card_sub_form, viewGroup, false);
        new bjes(1716);
        int size4 = ((bmhi) this.f124069w).f129414d.size();
        if (bundle2 == null) {
            this.f123926i = new int[size4];
            this.f123927j = bjxv.m104862d();
        } else {
            this.f123926i = bundle2.getIntArray("revealBelowTriggeredCount");
            this.f123927j = bjxv.m104860b(bundle2.getBundle("resettableIdGeneratorState"));
        }
        if (this.f123928k) {
            this.f123930m = new int[size4];
            i = 0;
        } else {
            i = 0;
        }
        while (i < size4) {
            bmhk bmhk2 = (bmhk) ((bmhi) this.f124069w).f129414d.get(i);
            LinearLayout linearLayout = (LinearLayout) layoutInflater2.inflate((int) C0126R.C0128layout.view_subform, (ViewGroup) this.f123918a, false);
            linearLayout.setId(mo65818aq().mo65614a());
            bkba bkba2 = new bkba();
            this.f123920c.add(linearLayout);
            this.f123939v.add(bkba2);
            this.f123933p.add(new ArrayList());
            FormHeaderView formHeaderView = (FormHeaderView) linearLayout.findViewById(C0126R.C0129id.subform_header);
            bmdn bmdn2 = bmhk2.f129438b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            formHeaderView.mo71963a(bmdn2, layoutInflater2, mo65982av(), bkba2.f123907a);
            int size5 = bmhk2.f129440d.size();
            ArrayList arrayList = new ArrayList(size5);
            int i18 = 0;
            while (i18 < size5) {
                bmhc bmhc2 = (bmhc) ((bmhk) ((bmhi) this.f124069w).f129414d.get(i)).f129440d.get(i18);
                int a2 = mo65818aq().mo65614a();
                int i19 = bmhc2.f129398a;
                if (i19 == 1) {
                    i3 = size4;
                    bkfu bkfu = new bkfu((bmqf) bmhc2.f129399b, this.f123963aH, mo65818aq(), linearLayout);
                    bkfu.f124162a = getActivity();
                    bkfu.f124164c = mo65980at();
                    bkfu.f124165d = this;
                    bkfu.f124167f = this;
                    view = bkfu.mo65971a();
                    if (this.f123917C) {
                        view = bkem.m105437a(this.f123962aG, view, linearLayout, mo65818aq().mo65614a());
                    }
                    if (bmhc2.f129398a == 1) {
                        bmqf = (bmqf) bmhc2.f129399b;
                    } else {
                        bmqf = bmqf.f130370r;
                    }
                    bkba = bkba2;
                    i2 = size5;
                    long j = bmqf.f130376e;
                    if (bmhc2.f129398a == 1) {
                        bmqf2 = (bmqf) bmhc2.f129399b;
                    } else {
                        bmqf2 = bmqf.f130370r;
                    }
                    bkbf = new bkbf(j, view, bkft.m105642b(bmqf2));
                    bkbf.f123914a = 1;
                    bkbf.f123915b = this.f123921d.size();
                    if (bmhc2.f129398a == 1) {
                        bmqf3 = (bmqf) bmhc2.f129399b;
                    } else {
                        bmqf3 = bmqf.f130370r;
                    }
                    int a3 = bmpn.m108259a(bmqf3.f130388q);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    bkbf.f123916c = a3;
                    this.f123921d.add(view);
                    if (bmhc2.f129398a == 1) {
                        bmqf4 = (bmqf) bmhc2.f129399b;
                    } else {
                        bmqf4 = bmqf.f130370r;
                    }
                    bjwl.m104784a(view, bmqf4.f130376e, this.f124196aK);
                } else {
                    i3 = size4;
                    bkba = bkba2;
                    i2 = size5;
                    if (i19 == 2) {
                        view = new FrameLayout(this.f123962aG);
                        view.setId(a2);
                        bjzp bjzp = (bjzp) getChildFragmentManager().findFragmentById(a2);
                        if (bjzp == null) {
                            if (bmhc2.f129398a == 2) {
                                bmbr2 = (bmbr) bmhc2.f129399b;
                            } else {
                                bmbr2 = bmbr.f128572L;
                            }
                            bjzp = mo52962a(bmbr2);
                            getChildFragmentManager().beginTransaction().add(a2, bjzp).commit();
                        }
                        bjzp.mo65674a(this);
                        bjzp.f124196aK = this.f124196aK;
                        if (bmhc2.f129398a == 2) {
                            bmbr = (bmbr) bmhc2.f129399b;
                        } else {
                            bmbr = bmbr.f128572L;
                        }
                        bkbf bkbf2 = new bkbf(bmbr.f128587d, bjzp, null);
                        bkbf2.f123914a = 4;
                        bkbf2.f123915b = this.f123922e.size();
                        this.f123922e.add(bjzp);
                        bjer bjer = (bjer) this.f123939v.get(i);
                        bjzp.mo52779bZ();
                        ((bjer) this.f123939v.get(i)).mo52777bV().add(bjzp);
                        bkbf = bkbf2;
                    } else if (i19 == 4) {
                        view = new FrameLayout(this.f123962aG);
                        view.setId(a2);
                        bkev bkev = (bkev) getChildFragmentManager().findFragmentById(a2);
                        if (bkev == null) {
                            if (bmhc2.f129398a == 4) {
                                bmds2 = (bmds) bmhc2.f129399b;
                            } else {
                                bmds2 = bmds.f128852h;
                            }
                            bkev = bkev.m105454a(bmds2, this.f123961aF, mo65980at());
                            getChildFragmentManager().beginTransaction().add(a2, bkev).commit();
                        }
                        bkev.f124196aK = this.f124196aK;
                        if (bmhc2.f129398a == 4) {
                            bmds = (bmds) bmhc2.f129399b;
                        } else {
                            bmds = bmds.f128852h;
                        }
                        bmqf bmqf5 = bmds.f128855b;
                        if (bmqf5 == null) {
                            bmqf5 = bmqf.f130370r;
                        }
                        bkbf bkbf3 = new bkbf(bmqf5.f130376e, bkev, null);
                        bkbf3.f123914a = 2;
                        bkbf3.f123915b = this.f123923f.size();
                        this.f123923f.add(bkev);
                        bjer bjer2 = (bjer) this.f123939v.get(i);
                        ((bjer) this.f123939v.get(i)).mo52777bV().add(bkev);
                        bkbf = bkbf3;
                    } else {
                        throw new IllegalArgumentException("Empty or unknown field in CardSubform.");
                    }
                }
                ((ArrayList) this.f123933p.get(i)).add(bkbf);
                view.setTag(C0126R.C0129id.field_type, Integer.valueOf(bkbf.f123914a));
                arrayList.add(view);
                i18++;
                bkba2 = bkba;
                size4 = i3;
                size5 = i2;
            }
            int i20 = size4;
            bkba bkba3 = bkba2;
            int i21 = size5;
            int[] a4 = bkfr.m105585a(this.f123962aG, arrayList, (bmot[]) bmhk2.f129441e.toArray(new bmot[0]), linearLayout);
            if ((bmhk2.f129437a & 8) != 0) {
                LayoutInflater layoutInflater3 = this.f123963aH;
                bmjf bmjf = bmhk2.f129443g;
                if (bmjf == null) {
                    bmjf = bmjf.f129685i;
                }
                View a5 = bkfr.m105548a(layoutInflater3, resourceId, bmjf, mo65982av());
                a5.setId(mo65818aq().mo65614a());
                linearLayout.addView(a5);
                this.f123924g.add(a5);
                bkba3.f123907a.add((bjer) a5);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a5.getLayoutParams();
                C1260oz.m19821a(marginLayoutParams, dimensionPixelSize);
                marginLayoutParams.topMargin = dimension;
                marginLayoutParams.bottomMargin = dimension;
            }
            int i22 = -1;
            if (this.f123928k) {
                int i23 = bmhk2.f129442f;
                if (i23 < 0) {
                    this.f123930m[i] = -1;
                    this.f123929l.add(null);
                } else {
                    int[] iArr2 = this.f123930m;
                    int i24 = a4[i23];
                    iArr2[i] = i24;
                    if (i24 != -1) {
                        this.f123929l.add(mo65773a(i, i23));
                    } else {
                        throw new IllegalStateException("Invalid collapsibleFieldsEndIndex");
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i25 = this.f123926i[i];
            int i26 = 0;
            while (true) {
                int i27 = i21;
                if (i26 >= i27) {
                    break;
                }
                if (((bmhc) bmhk2.f129440d.get(i26)).f129400c) {
                    if (i25 > 0) {
                        i25--;
                    } else {
                        int i28 = a4[i26];
                        if (i28 != i22) {
                            mo65773a(i, i26).mo65785a(new bkbb(this, i, i28));
                            if (arrayList2.isEmpty()) {
                                int i29 = i28 + 1;
                                int childCount = linearLayout.getChildCount();
                                while (i29 < childCount) {
                                    linearLayout.getChildAt(i29).setVisibility(8);
                                    i29++;
                                    a4 = a4;
                                }
                                iArr = a4;
                            } else {
                                iArr = a4;
                            }
                            arrayList2.add(Integer.valueOf(i28));
                            i26++;
                            a4 = iArr;
                            i21 = i27;
                            i22 = -1;
                        } else {
                            throw new IllegalStateException("Invalid hideFieldsBelow field");
                        }
                    }
                }
                iArr = a4;
                i26++;
                a4 = iArr;
                i21 = i27;
                i22 = -1;
            }
        }
        this.f123937t = new bkbc(this);
        this.f123938u = new bkbd(this);
        return this.f123918a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bjzp mo52962a(bmbr bmbr) {
        return bkfr.m105552a(bmbr, this.f123961aF, mo65980at());
    }

    /* renamed from: a */
    public final bkbm mo65773a(int i, int i2) {
        bkbf bkbf = (bkbf) ((ArrayList) this.f123933p.get(i)).get(i2);
        int i3 = bkbf.f123914a;
        if (i3 == 1) {
            View b = bkft.m105641b((View) this.f123921d.get(bkbf.f123915b));
            if (b instanceof bkbm) {
                return (bkbm) b;
            }
        } else if (i3 == 2) {
            return (bkbm) this.f123923f.get(bkbf.f123915b);
        }
        throw new IllegalStateException(String.format(Locale.US, "Field (subform %s, field %s, type %s) is not an AutoAdvancer", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bkbf.f123914a)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SummaryExpanderWrapper mo52963a(bmlv bmlv, ViewGroup viewGroup) {
        throw new IllegalStateException("Field groups are not supported for CardSubformFragment.");
    }

    /* renamed from: a */
    public final void mo65764a(View view) {
        bkbg bkbg = this.f123935r;
        if (bkbg != null) {
            bkbg.mo65753v();
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
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r3 = r9;
     */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmhq bmhq = this.f123934q;
        if (bmhq != null) {
            bxvt bxvt = bmhq.f129469j;
            int size = bxvt.size();
            int i = 0;
            while (i < size) {
                int intValue = ((Integer) bxvt.get(i)).intValue();
                ArrayList arrayList = (ArrayList) this.f123933p.get(intValue);
                bmaf bmaf = bmas.f128496a;
                if (bmaf == null) {
                    bmaf = bmaf.f128436d;
                }
                String str = bmaf.f128438a;
                bmdn bmdn = ((bmhk) ((bmhi) this.f124069w).f129414d.get(intValue)).f129438b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                if (!str.equals(bmdn.f128834b)) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        int i3 = i + 1;
                        if (i2 >= size2) {
                            break;
                        }
                        bkbf bkbf = (bkbf) arrayList.get(i2);
                        if (bkbf.f123914a == 4 && ((bjzp) this.f123922e.get(bkbf.f123915b)).mo52281a(bmas)) {
                            return true;
                        }
                        i2++;
                    }
                } else {
                    bmaf bmaf2 = bmas.f128496a;
                    if (bmaf2 == null) {
                        bmaf2 = bmaf.f128436d;
                    }
                    bkbf bkbf2 = (bkbf) arrayList.get(bmaf2.f128440c);
                    int i4 = bkbf2.f123914a;
                    if (i4 == 1) {
                        bkft.m105635a((View) this.f123921d.get(bkbf2.f123915b), bmas.f128497b);
                        bjep bjep = this.f123936s;
                        if (bjep != null) {
                            if (bkbf2.f123916c == 4) {
                                bjep.mo65059b();
                            }
                            if (bkbf2.f123916c == 2) {
                                this.f123936s.mo65061c();
                            }
                        }
                    } else if (i4 == 2) {
                        ((bkev) this.f123923f.get(bkbf2.f123915b)).mo65794a((CharSequence) bmas.f128497b, true);
                    } else {
                        bmaf bmaf3 = bmas.f128496a;
                        if (bmaf3 == null) {
                            bmaf3 = bmaf.f128436d;
                        }
                        int i5 = bmaf3.f128439b;
                        StringBuilder sb = new StringBuilder(56);
                        sb.append("Could not apply FormFieldMessage to fieldId: ");
                        sb.append(i5);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
