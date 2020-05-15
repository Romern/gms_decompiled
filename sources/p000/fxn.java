package p000;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxn extends fxg {

    /* renamed from: e */
    public final fxo f17521e;

    /* renamed from: f */
    public final int f17522f;

    /* renamed from: g */
    public final boolean f17523g;

    /* renamed from: h */
    public final boolean f17524h;

    /* renamed from: i */
    public String f17525i;

    /* renamed from: j */
    public String f17526j;

    /* renamed from: k */
    public int f17527k;

    /* renamed from: l */
    public final List f17528l = new ArrayList();

    /* renamed from: m */
    public Object[] f17529m;

    /* renamed from: n */
    public int[] f17530n;

    /* renamed from: o */
    private final int f17531o;

    /* renamed from: p */
    private final int f17532p;

    /* renamed from: q */
    private final boolean f17533q;

    /* renamed from: r */
    private boolean f17534r;

    /* renamed from: s */
    private boolean f17535s;

    /* renamed from: t */
    private boolean f17536t;

    /* renamed from: u */
    private final allg f17537u;

    /* renamed from: v */
    private final View.OnClickListener f17538v;

    /* renamed from: w */
    private final View.OnLongClickListener f17539w;

    /* renamed from: x */
    private final View.OnClickListener f17540x;

    public fxn(fxo fxo, int i, int i2, boolean z, int i3, boolean z2) {
        this.f17521e = fxo;
        this.f17531o = i;
        this.f17532p = i2;
        this.f17533q = z;
        this.f17522f = i3;
        this.f17523g = z2;
        this.f17524h = true;
        allf allf = new allf();
        allf.f73618a = 1;
        allf.mo40485b();
        this.f17537u = allf.mo40484a();
        this.f17538v = new fxk(this);
        this.f17539w = new fxl(this);
        this.f17540x = new fxm(this);
    }

    /* renamed from: a */
    private static final void m12656a(fyq fyq, String str) {
        fyq.f17648s.setText(str);
    }

    /* renamed from: c */
    private final void m12657c(ContactPerson contactPerson) {
        if (!((fxg) this).f17497a) {
            for (int i = 0; i < this.f17528l.size(); i++) {
                if (fzm.m12800d(contactPerson, (ContactPerson) this.f17528l.get(i))) {
                    mo158M(this.f17527k + i);
                }
            }
        }
    }

    /* renamed from: h */
    private final ContactPerson m12658h(int i) {
        return (ContactPerson) this.f17528l.get(i);
    }

    /* renamed from: i */
    private final int m12659i(int i) {
        if (i >= this.f17527k) {
            return 3;
        }
        if (i == 0) {
            if (!TextUtils.isEmpty(this.f17525i)) {
                return 1;
            }
            if (TextUtils.isEmpty(this.f17526j)) {
                return -1;
            }
            return 2;
        } else if (i != 1 || TextUtils.isEmpty(this.f17525i) || TextUtils.isEmpty(this.f17526j)) {
            return -1;
        } else {
            return 2;
        }
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        int i2 = this.f17527k;
        if (i >= i2) {
            i = m12658h(i - i2).hashCode();
        }
        return (long) i;
    }

    /* renamed from: b */
    public final void mo11458b(ContactPerson contactPerson) {
        m12657c(contactPerson);
    }

    /* renamed from: d */
    public final void mo11465d(boolean z) {
        this.f17534r = z;
    }

    /* renamed from: e */
    public final void mo11467e(boolean z) {
        this.f17535s = z;
    }

    /* renamed from: f */
    public final int mo11468f() {
        Object[] objArr = this.f17529m;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo11471g(int i) {
        int i2 = m12659i(i);
        if (i2 == 1) {
            return this.f17532p;
        }
        if (i2 == 2) {
            return this.f17532p;
        }
        if (this.f17533q) {
            return this.f17532p;
        }
        return 1;
    }

    public final int getPositionForSection(int i) {
        return this.f17530n[i];
    }

    public final int getSectionForPosition(int i) {
        int i2 = 1;
        while (true) {
            int[] iArr = this.f17530n;
            if (i2 >= iArr.length) {
                return this.f17529m.length - 1;
            }
            if (i < iArr[i2]) {
                return i2 - 1;
            }
            i2++;
        }
    }

    public final Object[] getSections() {
        return this.f17529m;
    }

    /* renamed from: a */
    public final int mo161a() {
        if (((fxg) this).f17497a || this.f17528l.size() <= 0) {
            return 0;
        }
        return this.f17527k + this.f17528l.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11461c() {
        mo171aJ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo11472g(boolean z) {
        if (!z) {
            mo177c(0, this.f17527k + this.f17528l.size());
        } else {
            mo178d(0, this.f17527k + this.f17528l.size());
        }
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        int i2 = m12659i(i);
        if (i2 != 1) {
            return i2 != 2 ? this.f17531o : C0126R.C0128layout.appinvite_contextual_selection_sub_header_text;
        }
        return C0126R.C0128layout.appinvite_contextual_selection_header_text;
    }

    /* renamed from: c */
    public final void mo11463c(boolean z) {
        this.f17536t = z;
        mo171aJ();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i == C0126R.C0128layout.appinvite_contextual_selection_header_text || i == C0126R.C0128layout.appinvite_contextual_selection_sub_header_text) {
            return new fyq(inflate);
        }
        if (i == C0126R.C0128layout.appinvite_contextual_selection_grid_item) {
            return new fym(inflate);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        boolean z;
        View.OnClickListener onClickListener;
        int i2 = i;
        int i3 = m12659i(i2);
        boolean z2 = true;
        if (i3 == 1) {
            m12656a((fyq) acm, this.f17525i);
        } else if (i3 != 2) {
            fym fym = (fym) acm;
            ContactPerson h = m12658h(i2 - this.f17527k);
            boolean a = this.f17521e.mo11434a(h);
            boolean b = this.f17521e.mo11438b(h);
            fwo fwo = (fwo) this.f17521e;
            fxj.m12624a(fwo.f17463b, this.f17537u, fym, h, a, b, this.f17536t, this.f17534r, this.f17535s, fwo.f17470i, fwo.f17471j, this.f17498d);
            View view = fym.f201a;
            if (h.f9753e.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            view.setEnabled(z);
            fym.f201a.setSelected(a);
            fym.f201a.setOnClickListener(this.f17538v);
            fym.f201a.setOnLongClickListener(this.f17539w);
            fym.f201a.setTag(C0126R.C0129id.appinvite_chip_view_holder_tag_person, h);
            View view2 = fym.f17624B;
            if (view2 != null) {
                if (!this.f17534r) {
                    z2 = false;
                } else if (b || h.f9753e.size() <= 1) {
                    z2 = false;
                }
                if (z2) {
                    onClickListener = this.f17540x;
                } else {
                    onClickListener = null;
                }
                view2.setOnClickListener(onClickListener);
                view2.setClickable(z2);
            }
        } else {
            m12656a((fyq) acm, this.f17526j);
        }
    }

    /* renamed from: a */
    public final void mo11455a(ContactPerson contactPerson) {
        m12657c(contactPerson);
    }

    /* renamed from: a */
    public final void mo11456a(ContactPerson contactPerson, int i) {
        m12657c(contactPerson);
    }

    /* renamed from: a */
    public final void mo11487a(String str, String str2) {
        this.f17525i = str;
        this.f17526j = str2;
        this.f17527k = 0;
        if (!TextUtils.isEmpty(str)) {
            this.f17527k++;
        }
        if (!TextUtils.isEmpty(this.f17526j)) {
            this.f17527k++;
        }
        mo171aJ();
    }
}
