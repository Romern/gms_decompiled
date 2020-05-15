package p000;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.p002v7.widget.LinearLayoutManager$SavedState;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.chimera.FragmentTransaction;
import java.util.List;

/* renamed from: aah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aah extends abu implements ach {

    /* renamed from: a */
    private aaf f35a;

    /* renamed from: b */
    private boolean f36b;

    /* renamed from: c */
    private boolean f37c;

    /* renamed from: d */
    private final aae f38d;

    /* renamed from: e */
    private int f39e;

    /* renamed from: f */
    private int[] f40f;

    /* renamed from: i */
    public int f41i;

    /* renamed from: j */
    aaw f42j;

    /* renamed from: k */
    boolean f43k;

    /* renamed from: l */
    public boolean f44l;

    /* renamed from: m */
    int f45m;

    /* renamed from: n */
    int f46n;

    /* renamed from: o */
    LinearLayoutManager$SavedState f47o;

    /* renamed from: p */
    final aad f48p;

    public aah() {
        this(1);
    }

    /* renamed from: F */
    private final void m53F() {
        if (this.f41i == 1 || !mo79l()) {
            this.f43k = false;
        } else {
            this.f43k = true;
        }
    }

    /* renamed from: G */
    private final View m54G() {
        return mo245i(this.f43k ? mo250u() - 1 : 0);
    }

    /* renamed from: H */
    private final View m55H() {
        return mo245i(!this.f43k ? mo250u() - 1 : 0);
    }

    /* renamed from: I */
    private final View m56I() {
        return mo67c(0, mo250u());
    }

    /* renamed from: J */
    private final View m57J() {
        return mo67c(mo250u() - 1, -1);
    }

    /* renamed from: a */
    private final int m58a(int i, acc acc, acj acj, boolean z) {
        int a;
        int a2 = this.f42j.mo117a() - i;
        if (a2 <= 0) {
            return 0;
        }
        int i2 = -mo64c(-a2, acc, acj);
        int i3 = i + i2;
        if (!z || (a = this.f42j.mo117a() - i3) <= 0) {
            return i2;
        }
        this.f42j.mo119a(a);
        return a + i2;
    }

    /* renamed from: b */
    private final int m63b(int i, acc acc, acj acj, boolean z) {
        int c;
        int c2 = i - this.f42j.mo122c();
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -mo64c(c2, acc, acj);
        int i3 = i + i2;
        if (!z || (c = i3 - this.f42j.mo122c()) <= 0) {
            return i2;
        }
        this.f42j.mo119a(-c);
        return i2 - c;
    }

    /* renamed from: d */
    private final View m66d(acc acc, acj acj) {
        return mo20a(acc, acj, 0, mo250u(), acj.mo305a());
    }

    /* renamed from: e */
    private final View m67e(acc acc, acj acj) {
        return mo20a(acc, acj, mo250u() - 1, -1, acj.mo305a());
    }

    /* renamed from: g */
    private final void m68g(int i, int i2) {
        this.f35a.f24c = i2 - this.f42j.mo122c();
        aaf aaf = this.f35a;
        aaf.f25d = i;
        aaf.f26e = !this.f43k ? -1 : 1;
        aaf.f27f = -1;
        aaf.f23b = i2;
        aaf.f28g = Integer.MIN_VALUE;
    }

    /* renamed from: h */
    private final int m69h(acj acj) {
        int i = 0;
        if (mo250u() == 0) {
            return 0;
        }
        mo80m();
        aaw aaw = this.f42j;
        View b = mo61b(!this.f37c);
        View a = mo52a(!this.f37c);
        boolean z = this.f37c;
        boolean z2 = this.f43k;
        if (!(mo250u() == 0 || acj.mo305a() == 0 || b == null || a == null)) {
            i = z2 ? Math.max(0, (acj.mo305a() - Math.max(abu.m288i(b), abu.m288i(a))) - 1) : Math.max(0, Math.min(abu.m288i(b), abu.m288i(a)));
            if (z) {
                return Math.round((((float) i) * (((float) Math.abs(aaw.mo123c(a) - aaw.mo125d(b))) / ((float) (Math.abs(abu.m288i(b) - abu.m288i(a)) + 1)))) + ((float) (aaw.mo122c() - aaw.mo125d(b))));
            }
        }
        return i;
    }

    /* renamed from: i */
    private final int m70i(acj acj) {
        if (mo250u() == 0) {
            return 0;
        }
        mo80m();
        aaw aaw = this.f42j;
        View b = mo61b(!this.f37c);
        View a = mo52a(!this.f37c);
        boolean z = this.f37c;
        if (mo250u() == 0 || acj.mo305a() == 0 || b == null || a == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abu.m288i(b) - abu.m288i(a)) + 1;
        }
        return Math.min(aaw.mo124d(), aaw.mo123c(a) - aaw.mo125d(b));
    }

    /* renamed from: j */
    private final int m71j(acj acj) {
        if (mo250u() == 0) {
            return 0;
        }
        mo80m();
        aaw aaw = this.f42j;
        View b = mo61b(!this.f37c);
        View a = mo52a(!this.f37c);
        boolean z = this.f37c;
        if (mo250u() == 0 || acj.mo305a() == 0 || b == null || a == null) {
            return 0;
        }
        if (z) {
            return (int) ((((float) (aaw.mo123c(a) - aaw.mo125d(b))) / ((float) (Math.abs(abu.m288i(b) - abu.m288i(a)) + 1))) * ((float) acj.mo305a()));
        }
        return acj.mo305a();
    }

    /* renamed from: a */
    public void mo23a(acc acc, acj acj, aad aad, int i) {
    }

    /* renamed from: b */
    public boolean mo32b() {
        return this.f47o == null && this.f36b == this.f44l;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(int, int, boolean, acj):void
     arg types: [int, int, int, acj]
     candidates:
      aah.a(int, acc, acj, boolean):int
      aah.a(acc, aaf, acj, boolean):int
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(int, int, boolean, acj):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(acc, aaf, acj, boolean):int
     arg types: [acc, aaf, acj, int]
     candidates:
      aah.a(int, acc, acj, boolean):int
      aah.a(int, int, boolean, acj):void
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(acc, aaf, acj, boolean):int */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo64c(int i, acc acc, acj acj) {
        int i2;
        if (!(mo250u() == 0 || i == 0)) {
            mo80m();
            this.f35a.f22a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            m60a(i2, abs, true, acj);
            aaf aaf = this.f35a;
            int a = aaf.f28g + mo50a(acc, aaf, acj, false);
            if (a >= 0) {
                if (abs > a) {
                    i = i2 * a;
                }
                this.f42j.mo119a(-i);
                this.f35a.f32k = i;
                return i;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo72f(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f41i == 1) ? 1 : Integer.MIN_VALUE : this.f41i == 0 ? 1 : Integer.MIN_VALUE : this.f41i == 1 ? -1 : Integer.MIN_VALUE : this.f41i == 0 ? -1 : Integer.MIN_VALUE : (this.f41i == 1 || !mo79l()) ? 1 : -1 : (this.f41i == 1 || !mo79l()) ? -1 : 1;
    }

    /* renamed from: h */
    public final boolean mo75h() {
        return true;
    }

    /* renamed from: j */
    public final boolean mo77j() {
        return this.f41i == 0;
    }

    /* renamed from: k */
    public final boolean mo78k() {
        return this.f41i == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo79l() {
        return mo248s() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo80m() {
        if (this.f35a == null) {
            this.f35a = new aaf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo81n() {
        return this.f42j.mo128f() == 0 && this.f42j.mo120b() == 0;
    }

    /* renamed from: o */
    public final boolean mo82o() {
        if (!(this.f114C == 1073741824 || this.f113B == 1073741824)) {
            int u = mo250u();
            for (int i = 0; i < u; i++) {
                ViewGroup.LayoutParams layoutParams = mo245i(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(int, int, boolean):android.view.View
     arg types: [int, int, int]
     candidates:
      aah.a(int, acc, acj):int
      aah.a(acj, aaf, zv):void
      abu.a(int, int, int):int
      abu.a(android.view.View, int, boolean):void
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      aah.a(int, int, boolean):android.view.View */
    /* renamed from: p */
    public final int mo83p() {
        View a = mo51a(0, mo250u(), false);
        if (a != null) {
            return abu.m288i(a);
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(int, int, boolean):android.view.View
     arg types: [int, int, int]
     candidates:
      aah.a(int, acc, acj):int
      aah.a(acj, aaf, zv):void
      abu.a(int, int, int):int
      abu.a(android.view.View, int, boolean):void
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      aah.a(int, int, boolean):android.view.View */
    /* renamed from: q */
    public final int mo84q() {
        View a = mo51a(mo250u() - 1, -1, false);
        if (a != null) {
            return abu.m288i(a);
        }
        return -1;
    }

    public aah(int i) {
        this.f41i = 1;
        this.f43k = false;
        this.f44l = false;
        this.f37c = true;
        this.f45m = -1;
        this.f46n = Integer.MIN_VALUE;
        this.f47o = null;
        this.f48p = new aad();
        this.f38d = new aae();
        this.f39e = 2;
        this.f40f = new int[2];
        mo62b(i);
        mo59a((String) null);
    }

    /* renamed from: d */
    public final int mo68d(acj acj) {
        return m70i(acj);
    }

    /* renamed from: e */
    public final int mo70e(acj acj) {
        return m70i(acj);
    }

    /* renamed from: g */
    public final int mo74g(acj acj) {
        return m71j(acj);
    }

    /* renamed from: d */
    public final PointF mo69d(int i) {
        if (mo250u() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < abu.m288i(mo245i(0))) {
            z = true;
        }
        if (z != this.f43k) {
            i2 = -1;
        }
        if (this.f41i == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: e */
    public final void mo71e(int i) {
        this.f45m = i;
        this.f46n = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f47o;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.mo1418b();
        }
        mo247r();
    }

    /* renamed from: f */
    public final int mo73f(acj acj) {
        return m71j(acj);
    }

    /* renamed from: a */
    private final void mo14a(int i, int i2) {
        this.f35a.f24c = this.f42j.mo117a() - i2;
        aaf aaf = this.f35a;
        aaf.f26e = !this.f43k ? 1 : -1;
        aaf.f25d = i;
        aaf.f27f = 1;
        aaf.f23b = i2;
        aaf.f28g = Integer.MIN_VALUE;
    }

    /* renamed from: b */
    private final void m64b(aad aad) {
        m68g(aad.f14b, aad.f15c);
    }

    /* renamed from: c */
    public final int mo65c(acj acj) {
        return m69h(acj);
    }

    /* renamed from: a */
    private final void m60a(int i, int i2, boolean z, acj acj) {
        int i3;
        int i4;
        this.f35a.f34m = mo81n();
        this.f35a.f27f = i;
        int[] iArr = this.f40f;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        mo55a(acj, iArr);
        int max = Math.max(0, this.f40f[0]);
        int max2 = Math.max(0, this.f40f[1]);
        aaf aaf = this.f35a;
        if (i == 1) {
            i3 = max2;
        } else {
            i3 = max;
        }
        aaf.f29h = i3;
        if (i != 1) {
            max = max2;
        }
        aaf.f30i = max;
        if (i != 1) {
            View G = m54G();
            this.f35a.f29h += this.f42j.mo122c();
            aaf aaf2 = this.f35a;
            if (!this.f43k) {
                i5 = -1;
            }
            aaf2.f26e = i5;
            int i6 = abu.m288i(G);
            aaf aaf3 = this.f35a;
            aaf2.f25d = i6 + aaf3.f26e;
            aaf3.f23b = this.f42j.mo125d(G);
            i4 = (-this.f42j.mo125d(G)) + this.f42j.mo122c();
        } else {
            aaf.f29h = i3 + this.f42j.mo126e();
            View H = m55H();
            aaf aaf4 = this.f35a;
            if (this.f43k) {
                i5 = -1;
            }
            aaf4.f26e = i5;
            int i7 = abu.m288i(H);
            aaf aaf5 = this.f35a;
            aaf4.f25d = i7 + aaf5.f26e;
            aaf5.f23b = this.f42j.mo123c(H);
            i4 = this.f42j.mo123c(H) - this.f42j.mo117a();
        }
        aaf aaf6 = this.f35a;
        aaf6.f24c = i2;
        if (z) {
            aaf6.f24c = i2 - i4;
        }
        aaf6.f28g = i4;
    }

    /* renamed from: b */
    private final void m65b(acc acc, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                mo223a(i3, acc);
            }
            return;
        }
        while (i > i2) {
            mo223a(i, acc);
            i--;
        }
    }

    /* renamed from: c */
    public final View mo66c(int i) {
        int u = mo250u();
        if (u == 0) {
            return null;
        }
        int i2 = i - abu.m288i(mo245i(0));
        if (i2 >= 0 && i2 < u) {
            View i3 = mo245i(i2);
            if (abu.m288i(i3) == i) {
                return i3;
            }
        }
        int u2 = mo250u();
        for (int i4 = 0; i4 < u2; i4++) {
            View i5 = mo245i(i4);
            acm childViewHolderInt = RecyclerView.getChildViewHolderInt(i5);
            if (childViewHolderInt != null && childViewHolderInt.mo322c() == i && !childViewHolderInt.mo320aO() && (this.f120r.mState.f183g || !childViewHolderInt.mo333n())) {
                return i5;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final Parcelable mo76i() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f47o;
        if (linearLayoutManager$SavedState != null) {
            return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState);
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (mo250u() > 0) {
            mo80m();
            boolean z = this.f36b ^ this.f43k;
            linearLayoutManager$SavedState2.f1226c = z;
            if (z) {
                View H = m55H();
                linearLayoutManager$SavedState2.f1225b = this.f42j.mo117a() - this.f42j.mo123c(H);
                linearLayoutManager$SavedState2.f1224a = abu.m288i(H);
            } else {
                View G = m54G();
                linearLayoutManager$SavedState2.f1224a = abu.m288i(G);
                linearLayoutManager$SavedState2.f1225b = this.f42j.mo125d(G) - this.f42j.mo122c();
            }
        } else {
            linearLayoutManager$SavedState2.mo1418b();
        }
        return linearLayoutManager$SavedState2;
    }

    /* renamed from: b */
    public int mo30b(int i, acc acc, acj acj) {
        if (this.f41i != 0) {
            return mo64c(i, acc, acj);
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo60b(acj acj) {
        return m69h(acj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo61b(boolean z) {
        if (this.f43k) {
            return mo51a(mo250u() - 1, -1, z);
        }
        return mo51a(0, mo250u(), z);
    }

    /* renamed from: b */
    public final void mo62b(int i) {
        aaw aaw;
        if (i != 0) {
            i = 1;
        }
        mo59a((String) null);
        if (i != this.f41i || this.f42j == null) {
            if (i != 0) {
                aaw = aaw.m168b(this);
            } else {
                aaw = aaw.m167a(this);
            }
            this.f42j = aaw;
            this.f48p.f13a = aaw;
            this.f41i = i;
            mo247r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final View mo67c(int i, int i2) {
        int i3;
        int i4;
        mo80m();
        if (i2 <= i && i2 >= i) {
            return mo245i(i);
        }
        int d = this.f42j.mo125d(mo245i(i));
        int c = this.f42j.mo122c();
        if (d < c) {
            i3 = 16388;
        } else {
            i3 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (d < c) {
            i4 = 16644;
        } else {
            i4 = 4161;
        }
        if (this.f41i == 0) {
            return this.f121s.mo525a(i, i2, i4, i3);
        }
        return this.f122t.mo525a(i, i2, i4, i3);
    }

    /* renamed from: a */
    private final void m61a(aad aad) {
        mo14a(aad.f14b, aad.f15c);
    }

    /* renamed from: a */
    private final void m62a(acc acc, aaf aaf) {
        if (aaf.f22a && !aaf.f34m) {
            int i = aaf.f28g;
            int i2 = aaf.f30i;
            if (aaf.f27f == -1) {
                int u = mo250u();
                if (i >= 0) {
                    int b = (this.f42j.mo120b() - i) + i2;
                    if (!this.f43k) {
                        int i3 = u - 1;
                        for (int i4 = i3; i4 >= 0; i4--) {
                            View i5 = mo245i(i4);
                            if (this.f42j.mo125d(i5) < b || this.f42j.mo129f(i5) < b) {
                                m65b(acc, i3, i4);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i6 = 0; i6 < u; i6++) {
                        View i7 = mo245i(i6);
                        if (this.f42j.mo125d(i7) < b || this.f42j.mo129f(i7) < b) {
                            m65b(acc, 0, i6);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i8 = i - i2;
                int u2 = mo250u();
                if (this.f43k) {
                    int i9 = u2 - 1;
                    for (int i10 = i9; i10 >= 0; i10--) {
                        View i11 = mo245i(i10);
                        if (this.f42j.mo123c(i11) > i8 || this.f42j.mo127e(i11) > i8) {
                            m65b(acc, i9, i10);
                            return;
                        }
                    }
                    return;
                }
                for (int i12 = 0; i12 < u2; i12++) {
                    View i13 = mo245i(i12);
                    if (this.f42j.mo123c(i13) > i8 || this.f42j.mo127e(i13) > i8) {
                        m65b(acc, 0, i12);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63b(int i, int i2) {
        this.f45m = i;
        this.f46n = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f47o;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.mo1418b();
        }
        mo247r();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(acc, aaf, acj, boolean):int
     arg types: [acc, aaf, acj, int]
     candidates:
      aah.a(int, acc, acj, boolean):int
      aah.a(int, int, boolean, acj):void
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(acc, aaf, acj, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(int, acc, acj, boolean):int
     arg types: [int, acc, acj, int]
     candidates:
      aah.a(int, int, boolean, acj):void
      aah.a(acc, aaf, acj, boolean):int
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(int, acc, acj, boolean):int */
    /* renamed from: c */
    public void mo34c(acc acc, acj acj) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        View c;
        int i5;
        View view;
        int i6;
        boolean z2;
        boolean z3;
        int i7 = -1;
        if (!(this.f47o == null && this.f45m == -1) && acj.mo305a() == 0) {
            mo239c(acc);
            return;
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f47o;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.mo1417a()) {
            this.f45m = this.f47o.f1224a;
        }
        mo80m();
        this.f35a.f22a = false;
        m53F();
        View z4 = mo255z();
        aad aad = this.f48p;
        if (!aad.f17e || this.f45m != -1 || this.f47o != null) {
            aad.mo39a();
            aad aad2 = this.f48p;
            aad2.f16d = this.f43k ^ this.f44l;
            if (!acj.f183g && (i6 = this.f45m) != -1) {
                if (i6 >= 0 && i6 < acj.mo305a()) {
                    aad2.f14b = this.f45m;
                    LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = this.f47o;
                    if (linearLayoutManager$SavedState2 == null || !linearLayoutManager$SavedState2.mo1417a()) {
                        if (this.f46n != Integer.MIN_VALUE) {
                            boolean z5 = this.f43k;
                            aad2.f16d = z5;
                            if (z5) {
                                aad2.f15c = this.f42j.mo117a() - this.f46n;
                            } else {
                                aad2.f15c = this.f42j.mo122c() + this.f46n;
                            }
                        } else {
                            View c2 = mo66c(this.f45m);
                            if (c2 == null) {
                                if (mo250u() > 0) {
                                    if (this.f45m >= abu.m288i(mo245i(0))) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2 == this.f43k) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    aad2.f16d = z3;
                                }
                                aad2.mo41b();
                            } else if (this.f42j.mo118a(c2) > this.f42j.mo124d()) {
                                aad2.mo41b();
                            } else if (this.f42j.mo125d(c2) - this.f42j.mo122c() < 0) {
                                aad2.f15c = this.f42j.mo122c();
                                aad2.f16d = false;
                            } else if (this.f42j.mo117a() - this.f42j.mo123c(c2) < 0) {
                                aad2.f15c = this.f42j.mo117a();
                                aad2.f16d = true;
                            } else {
                                aad2.f15c = aad2.f16d ? this.f42j.mo123c(c2) + this.f42j.mo131h() : this.f42j.mo125d(c2);
                            }
                        }
                        this.f48p.f17e = true;
                    } else {
                        boolean z6 = this.f47o.f1226c;
                        aad2.f16d = z6;
                        if (z6) {
                            aad2.f15c = this.f42j.mo117a() - this.f47o.f1225b;
                        } else {
                            aad2.f15c = this.f42j.mo122c() + this.f47o.f1225b;
                        }
                        this.f48p.f17e = true;
                    }
                } else {
                    this.f45m = -1;
                    this.f46n = Integer.MIN_VALUE;
                }
            }
            if (mo250u() != 0) {
                View z7 = mo255z();
                if (z7 != null) {
                    abv abv = (abv) z7.getLayoutParams();
                    if (!abv.mo256a() && abv.mo258c() >= 0 && abv.mo258c() < acj.mo305a()) {
                        aad2.mo40a(z7, abu.m288i(z7));
                        this.f48p.f17e = true;
                    }
                }
                if (this.f36b == this.f44l) {
                    if (aad2.f16d) {
                        if (this.f43k) {
                            view = m66d(acc, acj);
                        } else {
                            view = m67e(acc, acj);
                        }
                    } else if (this.f43k) {
                        view = m67e(acc, acj);
                    } else {
                        view = m66d(acc, acj);
                    }
                    if (view != null) {
                        aad2.mo42b(view, abu.m288i(view));
                        if (!acj.f183g && mo32b()) {
                            int d = this.f42j.mo125d(view);
                            int c3 = this.f42j.mo123c(view);
                            int c4 = this.f42j.mo122c();
                            int a = this.f42j.mo117a();
                            if ((d >= a && c3 > a) || (c3 <= c4 && d < c4)) {
                                if (aad2.f16d) {
                                    c4 = a;
                                }
                                aad2.f15c = c4;
                            }
                        }
                        this.f48p.f17e = true;
                    }
                }
            }
            aad2.mo41b();
            aad2.f14b = this.f44l ? acj.mo305a() - 1 : 0;
            this.f48p.f17e = true;
        } else if (z4 != null && (this.f42j.mo125d(z4) >= this.f42j.mo117a() || this.f42j.mo123c(z4) <= this.f42j.mo122c())) {
            this.f48p.mo40a(z4, abu.m288i(z4));
        }
        aaf aaf = this.f35a;
        if (aaf.f32k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        aaf.f27f = i;
        int[] iArr = this.f40f;
        iArr[0] = 0;
        iArr[1] = 0;
        mo55a(acj, iArr);
        int max = Math.max(0, this.f40f[0]) + this.f42j.mo122c();
        int max2 = Math.max(0, this.f40f[1]) + this.f42j.mo126e();
        if (!(!acj.f183g || (i4 = this.f45m) == -1 || this.f46n == Integer.MIN_VALUE || (c = mo66c(i4)) == null)) {
            if (!this.f43k) {
                i5 = this.f46n - (this.f42j.mo125d(c) - this.f42j.mo122c());
            } else {
                i5 = (this.f42j.mo117a() - this.f42j.mo123c(c)) - this.f46n;
            }
            if (i5 <= 0) {
                max2 -= i5;
            } else {
                max += i5;
            }
        }
        aad aad3 = this.f48p;
        if (aad3.f16d) {
            if (this.f43k) {
                i7 = 1;
            }
        } else if (!this.f43k) {
            i7 = 1;
        }
        mo23a(acc, acj, aad3, i7);
        mo224a(acc);
        this.f35a.f34m = mo81n();
        aaf aaf2 = this.f35a;
        aaf2.f31j = acj.f183g;
        aaf2.f30i = 0;
        aad aad4 = this.f48p;
        if (aad4.f16d) {
            m64b(aad4);
            aaf aaf3 = this.f35a;
            aaf3.f29h = max;
            mo50a(acc, aaf3, acj, false);
            aaf aaf4 = this.f35a;
            i3 = aaf4.f23b;
            int i8 = aaf4.f25d;
            int i9 = aaf4.f24c;
            if (i9 > 0) {
                max2 += i9;
            }
            m61a(this.f48p);
            aaf aaf5 = this.f35a;
            aaf5.f29h = max2;
            aaf5.f25d += aaf5.f26e;
            mo50a(acc, aaf5, acj, false);
            aaf aaf6 = this.f35a;
            i2 = aaf6.f23b;
            int i10 = aaf6.f24c;
            if (i10 > 0) {
                m68g(i8, i3);
                aaf aaf7 = this.f35a;
                aaf7.f29h = i10;
                mo50a(acc, aaf7, acj, false);
                i3 = this.f35a.f23b;
            }
        } else {
            m61a(aad4);
            aaf aaf8 = this.f35a;
            aaf8.f29h = max2;
            mo50a(acc, aaf8, acj, false);
            aaf aaf9 = this.f35a;
            i2 = aaf9.f23b;
            int i11 = aaf9.f25d;
            int i12 = aaf9.f24c;
            if (i12 > 0) {
                max += i12;
            }
            m64b(this.f48p);
            aaf aaf10 = this.f35a;
            aaf10.f29h = max;
            aaf10.f25d += aaf10.f26e;
            mo50a(acc, aaf10, acj, false);
            aaf aaf11 = this.f35a;
            i3 = aaf11.f23b;
            int i13 = aaf11.f24c;
            if (i13 > 0) {
                mo14a(i11, i2);
                aaf aaf12 = this.f35a;
                aaf12.f29h = i13;
                mo50a(acc, aaf12, acj, false);
                i2 = this.f35a.f23b;
            }
        }
        if (mo250u() > 0) {
            if (this.f43k ^ this.f44l) {
                int a2 = m58a(i2, acc, acj, true);
                int i14 = i3 + a2;
                int b = m63b(i14, acc, acj, false);
                i3 = i14 + b;
                i2 = i2 + a2 + b;
            } else {
                int b2 = m63b(i3, acc, acj, true);
                int i15 = i2 + b2;
                int a3 = m58a(i15, acc, acj, false);
                i3 = i3 + b2 + a3;
                i2 = i15 + a3;
            }
        }
        if (acj.f187k && mo250u() != 0 && !acj.f183g && mo32b()) {
            List list = acc.f147d;
            int size = list.size();
            int i16 = abu.m288i(mo245i(0));
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                acm acm = (acm) list.get(i19);
                if (!acm.mo333n()) {
                    if (acm.mo322c() >= i16) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z != this.f43k) {
                        i17 += this.f42j.mo118a(acm.f201a);
                    } else {
                        i18 += this.f42j.mo118a(acm.f201a);
                    }
                }
            }
            this.f35a.f33l = list;
            if (i17 > 0) {
                m68g(abu.m288i(m54G()), i3);
                aaf aaf13 = this.f35a;
                aaf13.f29h = i17;
                aaf13.f24c = 0;
                aaf13.mo45a();
                mo50a(acc, this.f35a, acj, false);
            }
            if (i18 > 0) {
                mo14a(abu.m288i(m55H()), i2);
                aaf aaf14 = this.f35a;
                aaf14.f29h = i18;
                aaf14.f24c = 0;
                aaf14.mo45a();
                mo50a(acc, this.f35a, acj, false);
            }
            this.f35a.f33l = null;
        }
        if (acj.f183g) {
            this.f48p.mo39a();
        } else {
            aaw aaw = this.f42j;
            aaw.f88b = aaw.mo124d();
        }
        this.f36b = this.f44l;
    }

    /* renamed from: a */
    public int mo15a(int i, acc acc, acj acj) {
        if (this.f41i != 1) {
            return mo64c(i, acc, acj);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo50a(acc acc, aaf aaf, acj acj, boolean z) {
        int i = aaf.f24c;
        int i2 = aaf.f28g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                aaf.f28g = i2 + i;
            }
            m62a(acc, aaf);
        }
        int i3 = aaf.f24c + aaf.f29h;
        aae aae = this.f38d;
        while (true) {
            if ((!aaf.f34m && i3 <= 0) || !aaf.mo47a(acj)) {
                break;
            }
            aae.f18a = 0;
            aae.f19b = false;
            aae.f20c = false;
            aae.f21d = false;
            mo24a(acc, acj, aaf, aae);
            if (aae.f19b) {
                break;
            }
            int i4 = aaf.f23b;
            int i5 = aae.f18a;
            aaf.f23b = i4 + (aaf.f27f * i5);
            if (!aae.f20c || aaf.f33l != null || !acj.f183g) {
                aaf.f24c -= i5;
                i3 -= i5;
            }
            int i6 = aaf.f28g;
            if (i6 != Integer.MIN_VALUE) {
                int i7 = i6 + i5;
                aaf.f28g = i7;
                int i8 = aaf.f24c;
                if (i8 < 0) {
                    aaf.f28g = i7 + i8;
                }
                m62a(acc, aaf);
            }
            if (z && aae.f21d) {
                break;
            }
        }
        return i - aaf.f24c;
    }

    /* renamed from: a */
    public abv mo17a() {
        return new abv(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo51a(int i, int i2, boolean z) {
        int i3;
        mo80m();
        if (!z) {
            i3 = 320;
        } else {
            i3 = 24579;
        }
        if (this.f41i == 0) {
            return this.f121s.mo525a(i, i2, i3, 320);
        }
        return this.f122t.mo525a(i, i2, i3, 320);
    }

    /* renamed from: a */
    public View mo20a(acc acc, acj acj, int i, int i2, int i3) {
        int i4;
        mo80m();
        int c = this.f42j.mo122c();
        int a = this.f42j.mo117a();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = mo245i(i);
            int i6 = abu.m288i(i5);
            int d = this.f42j.mo125d(i5);
            int c2 = this.f42j.mo123c(i5);
            if (i6 >= 0 && i6 < i3) {
                if (!((abv) i5.getLayoutParams()).mo256a()) {
                    if ((d < a || c2 <= a) && (c2 > c || d >= c)) {
                        return i5;
                    }
                    if (view == null) {
                        view = i5;
                    }
                } else if (view2 == null) {
                    view2 = i5;
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(int, int, boolean, acj):void
     arg types: [int, int, int, acj]
     candidates:
      aah.a(int, acc, acj, boolean):int
      aah.a(acc, aaf, acj, boolean):int
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(int, int, boolean, acj):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(acc, aaf, acj, boolean):int
     arg types: [acc, aaf, acj, int]
     candidates:
      aah.a(int, acc, acj, boolean):int
      aah.a(int, int, boolean, acj):void
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(acc, aaf, acj, boolean):int */
    /* renamed from: a */
    public View mo21a(View view, int i, acc acc, acj acj) {
        int f;
        View view2;
        View view3;
        m53F();
        if (mo250u() == 0 || (f = mo72f(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo80m();
        m60a(f, (int) (((float) this.f42j.mo124d()) * 0.33333334f), false, acj);
        aaf aaf = this.f35a;
        aaf.f28g = Integer.MIN_VALUE;
        aaf.f22a = false;
        mo50a(acc, aaf, acj, true);
        if (f != -1) {
            if (this.f43k) {
                view2 = m56I();
            } else {
                view2 = m57J();
            }
        } else if (this.f43k) {
            view2 = m57J();
        } else {
            view2 = m56I();
        }
        if (f != -1) {
            view3 = m55H();
        } else {
            view3 = m54G();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 != null) {
            return view3;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo52a(boolean z) {
        if (!this.f43k) {
            return mo51a(mo250u() - 1, -1, z);
        }
        return mo51a(0, mo250u(), z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aah.a(int, int, boolean, acj):void
     arg types: [int, int, int, acj]
     candidates:
      aah.a(int, acc, acj, boolean):int
      aah.a(acc, aaf, acj, boolean):int
      aah.a(android.view.View, int, acc, acj):android.view.View
      aah.a(int, int, acj, zv):void
      aah.a(acc, acj, aad, int):void
      aah.a(acc, acj, aaf, aae):void
      abu.a(android.view.View, int, acc, acj):android.view.View
      abu.a(int, int, acj, zv):void
      abu.a(acc, acj, android.view.View, qm):void
      abu.a(android.view.View, int, int, abv):boolean
      aah.a(int, int, boolean, acj):void */
    /* renamed from: a */
    public final void mo53a(int i, int i2, acj acj, C1553zv zvVar) {
        int i3;
        if (this.f41i != 0) {
            i = i2;
        }
        if (mo250u() != 0 && i != 0) {
            mo80m();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m60a(i3, Math.abs(i), true, acj);
            mo27a(acj, this.f35a, zvVar);
        }
    }

    /* renamed from: a */
    public final void mo54a(int i, C1553zv zvVar) {
        boolean z;
        int i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.f47o;
        int i3 = -1;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.mo1417a()) {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = this.f47o;
            z = linearLayoutManager$SavedState2.f1226c;
            i2 = linearLayoutManager$SavedState2.f1224a;
        } else {
            m53F();
            z = this.f43k;
            i2 = this.f45m;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f39e && i2 >= 0 && i2 < i; i4++) {
            zvVar.mo16644a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo24a(acc acc, acj acj, aaf aaf, aae aae) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        View a = aaf.mo44a(acc);
        if (a != null) {
            abv abv = (abv) a.getLayoutParams();
            if (aaf.f33l == null) {
                boolean z3 = this.f43k;
                if (aaf.f27f != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z3 != z2) {
                    mo237b(a, 0);
                } else {
                    mo236b(a);
                }
            } else {
                boolean z4 = this.f43k;
                if (aaf.f27f != -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z4 != z) {
                    mo229a(a, 0);
                } else {
                    mo228a(a);
                }
            }
            mo246j(a);
            aae.f18a = this.f42j.mo118a(a);
            if (this.f41i == 1) {
                if (mo79l()) {
                    i4 = this.f115D - mo253x();
                    i3 = i4 - this.f42j.mo121b(a);
                } else {
                    i3 = mo251v();
                    i4 = this.f42j.mo121b(a) + i3;
                }
                if (aaf.f27f == -1) {
                    i = aaf.f23b;
                    i2 = i - aae.f18a;
                } else {
                    i2 = aaf.f23b;
                    i = aae.f18a + i2;
                }
            } else {
                int w = mo252w();
                int b = this.f42j.mo121b(a) + w;
                if (aaf.f27f == -1) {
                    int i5 = aaf.f23b;
                    int i6 = i5 - aae.f18a;
                    i4 = i5;
                    i = b;
                    i3 = i6;
                    i2 = w;
                } else {
                    int i7 = aaf.f23b;
                    int i8 = aae.f18a + i7;
                    i3 = i7;
                    i = b;
                    i2 = w;
                    i4 = i8;
                }
            }
            abu.m280b(a, i3, i2, i4, i);
            if (abv.mo256a() || abv.mo257b()) {
                aae.f20c = true;
            }
            aae.f21d = a.hasFocusable();
            return;
        }
        aae.f19b = true;
    }

    /* renamed from: a */
    public void mo26a(acj acj) {
        this.f47o = null;
        this.f45m = -1;
        this.f46n = Integer.MIN_VALUE;
        this.f48p.mo39a();
    }

    /* renamed from: a */
    public void mo27a(acj acj, aaf aaf, C1553zv zvVar) {
        int i = aaf.f25d;
        if (i >= 0 && i < acj.mo305a()) {
            zvVar.mo16644a(i, Math.max(0, aaf.f28g));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55a(acj acj, int[] iArr) {
        int i;
        int i2;
        if (acj.f177a != -1) {
            i = this.f42j.mo124d();
        } else {
            i = 0;
        }
        int i3 = this.f35a.f27f;
        if (i3 == -1) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (i3 != -1) {
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: a */
    public final void mo56a(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState = (LinearLayoutManager$SavedState) parcelable;
            this.f47o = linearLayoutManager$SavedState;
            if (this.f45m != -1) {
                linearLayoutManager$SavedState.mo1418b();
            }
            mo247r();
        }
    }

    /* renamed from: a */
    public void mo57a(RecyclerView recyclerView, int i) {
        aci aci = new aci(recyclerView.getContext());
        aci.f161a = i;
        mo226a(aci);
    }

    /* renamed from: a */
    public final void mo58a(AccessibilityEvent accessibilityEvent) {
        super.mo58a(accessibilityEvent);
        if (mo250u() > 0) {
            accessibilityEvent.setFromIndex(mo83p());
            accessibilityEvent.setToIndex(mo84q());
        }
    }

    /* renamed from: a */
    public final void mo59a(String str) {
        if (this.f47o == null) {
            super.mo59a(str);
        }
    }
}
