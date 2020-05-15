package p000;

import android.content.Context;
import android.graphics.Rect;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import java.util.Arrays;

/* renamed from: aab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aab extends aah {

    /* renamed from: a */
    boolean f3a = false;

    /* renamed from: b */
    public int f4b = -1;

    /* renamed from: c */
    int[] f5c;

    /* renamed from: d */
    View[] f6d;

    /* renamed from: e */
    final SparseIntArray f7e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f8f = new SparseIntArray();

    /* renamed from: g */
    public aaa f9g = new C1556zy();

    /* renamed from: h */
    final Rect f10h = new Rect();

    public aab(int i) {
        super(1);
        mo22a(i);
    }

    /* renamed from: F */
    private final void m12F() {
        int i;
        if (this.f41i == 1) {
            i = (this.f115D - mo253x()) - mo251v();
        } else {
            i = (this.f116E - mo254y()) - mo252w();
        }
        m19j(i);
    }

    /* renamed from: G */
    private final void m13G() {
        View[] viewArr = this.f6d;
        if (viewArr == null || viewArr.length != this.f4b) {
            this.f6d = new View[this.f4b];
        }
    }

    /* renamed from: a */
    private final int m14a(acc acc, acj acj, int i) {
        if (!acj.f183g) {
            return this.f9g.mo13c(i, this.f4b);
        }
        int a = acc.mo276a(i);
        if (a != -1) {
            return this.f9g.mo13c(a, this.f4b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: b */
    private final int m17b(acc acc, acj acj, int i) {
        if (!acj.f183g) {
            return this.f9g.mo11b(i, this.f4b);
        }
        int i2 = this.f8f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = acc.mo276a(i);
        if (a != -1) {
            return this.f9g.mo11b(a, this.f4b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: c */
    private final int m18c(acc acc, acj acj, int i) {
        if (!acj.f183g) {
            return this.f9g.mo8a(i);
        }
        int i2 = this.f7e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = acc.mo276a(i);
        if (a != -1) {
            return this.f9g.mo8a(a);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: j */
    private final void m19j(int i) {
        int i2;
        int length;
        int[] iArr = this.f5c;
        int i3 = this.f4b;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f5c = iArr;
    }

    /* renamed from: b */
    public final boolean mo32b() {
        return this.f47o == null && !this.f3a;
    }

    /* renamed from: d */
    public final void mo35d() {
        this.f9g.mo10a();
        this.f9g.mo12b();
    }

    /* renamed from: e */
    public final void mo36e() {
        this.f9g.mo10a();
        this.f9g.mo12b();
    }

    /* renamed from: f */
    public final void mo37f() {
        this.f9g.mo10a();
        this.f9g.mo12b();
    }

    /* renamed from: g */
    public final void mo38g() {
        this.f9g.mo10a();
        this.f9g.mo12b();
    }

    /* renamed from: a */
    private final void m15a(View view, int i, int i2, boolean z) {
        abv abv = (abv) view.getLayoutParams();
        if (!z) {
            if (!mo233a(view, i, i2, abv)) {
                return;
            }
        } else if (this.f126x && abu.m281b(view.getMeasuredWidth(), i, abv.width) && abu.m281b(view.getMeasuredHeight(), i2, abv.height)) {
            return;
        }
        view.measure(i, i2);
    }

    public aab(int i, byte[] bArr) {
        mo22a(i);
    }

    /* renamed from: b */
    public final int mo30b(int i, acc acc, acj acj) {
        m12F();
        m13G();
        return super.mo30b(i, acc, acj);
    }

    /* renamed from: c */
    public final void mo33c() {
        this.f9g.mo10a();
        this.f9g.mo12b();
    }

    /* renamed from: b */
    public final int mo31b(acc acc, acj acj) {
        if (this.f41i == 1) {
            return this.f4b;
        }
        if (acj.mo305a() > 0) {
            return m14a(acc, acj, acj.mo305a() - 1) + 1;
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo34c(acc acc, acj acj) {
        if (acj.f183g) {
            int u = mo250u();
            for (int i = 0; i < u; i++) {
                C1557zz zzVar = (C1557zz) mo245i(i).getLayoutParams();
                int c = zzVar.mo258c();
                this.f7e.put(c, zzVar.f27818b);
                this.f8f.put(c, zzVar.f27817a);
            }
        }
        super.mo34c(acc, acj);
        this.f7e.clear();
        this.f8f.clear();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aab.a(int, int):int
     arg types: [int, int]
     candidates:
      aab.a(acc, acj):int
      aab.a(android.content.Context, android.util.AttributeSet):abv
      aah.a(int, int):void
      aah.a(acc, aaf):void
      aah.a(int, zv):void
      aah.a(acj, int[]):void
      aah.a(android.support.v7.widget.RecyclerView, int):void
      abu.a(acc, acj):int
      abu.a(android.content.Context, android.util.AttributeSet):abv
      abu.a(int, acc):void
      abu.a(int, zv):void
      abu.a(android.support.v7.widget.RecyclerView, int):void
      abu.a(android.view.View, int):void
      abu.a(android.view.View, android.graphics.Rect):void
      abu.a(android.view.View, qm):void
      aab.a(int, int):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(int, int, int, int, boolean):int
     arg types: [int, int, int, int, int]
     candidates:
      abu.a(android.view.View, int, int, int, int):void
      abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean
      abu.a(int, int, int, int, boolean):int */
    /* renamed from: a */
    private final void m16a(View view, int i, boolean z) {
        int i2;
        int i3;
        C1557zz zzVar = (C1557zz) view.getLayoutParams();
        Rect rect = zzVar.f130d;
        int i4 = rect.top + rect.bottom + zzVar.topMargin + zzVar.bottomMargin;
        int i5 = rect.left + rect.right + zzVar.leftMargin + zzVar.rightMargin;
        int a = mo14a(zzVar.f27817a, zzVar.f27818b);
        if (this.f41i == 1) {
            i2 = abu.m277a(a, i, i5, zzVar.width, false);
            i3 = abu.m277a(this.f42j.mo124d(), this.f114C, i4, zzVar.height, true);
        } else {
            int a2 = abu.m277a(a, i, i4, zzVar.height, false);
            int a3 = abu.m277a(this.f42j.mo124d(), this.f113B, i5, zzVar.width, true);
            i3 = a2;
            i2 = a3;
        }
        m15a(view, i2, i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo14a(int i, int i2) {
        if (this.f41i == 1 && mo79l()) {
            int[] iArr = this.f5c;
            int i3 = this.f4b - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.f5c;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* renamed from: a */
    public final int mo15a(int i, acc acc, acj acj) {
        m12F();
        m13G();
        return super.mo15a(i, acc, acj);
    }

    /* renamed from: a */
    public final int mo16a(acc acc, acj acj) {
        if (this.f41i == 0) {
            return this.f4b;
        }
        if (acj.mo305a() > 0) {
            return m14a(acc, acj, acj.mo305a() - 1) + 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final abv mo17a() {
        if (this.f41i == 0) {
            return new C1557zz(-2, -1);
        }
        return new C1557zz(-1, -2);
    }

    /* renamed from: a */
    public final abv mo18a(Context context, AttributeSet attributeSet) {
        return new C1557zz(context, attributeSet);
    }

    /* renamed from: a */
    public final abv mo19a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1557zz((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1557zz(layoutParams);
    }

    /* renamed from: a */
    public final View mo20a(acc acc, acj acj, int i, int i2, int i3) {
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
            if (i6 >= 0 && i6 < i3 && m17b(acc, acj, i6) == 0) {
                if (!((abv) i5.getLayoutParams()).mo256a()) {
                    if (this.f42j.mo125d(i5) < a && this.f42j.mo123c(i5) >= c) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.f119q.mo16590c(r3) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f3, code lost:
        if (r13 != (r2 > r8)) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0102, code lost:
        if (r13 != (r2 > r15)) goto L_0x0105;
     */
    /* renamed from: a */
    public final View mo21a(View view, int i, acc acc, acj acj) {
        View view2;
        boolean z;
        int i2;
        int i3;
        int i4;
        View view3;
        int i5;
        View view4;
        View view5;
        acc acc2 = acc;
        acj acj2 = acj;
        RecyclerView recyclerView = this.f120r;
        View view6 = null;
        if (recyclerView != null) {
            view2 = recyclerView.findContainingItemView(view);
            if (view2 != null) {
            }
        }
        view2 = null;
        if (view2 != null) {
            C1557zz zzVar = (C1557zz) view2.getLayoutParams();
            int i6 = zzVar.f27817a;
            int i7 = zzVar.f27818b + i6;
            if (super.mo21a(view, i, acc, acj) != null) {
                if (mo72f(i) != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z != this.f43k) {
                    i4 = mo250u() - 1;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i3 = mo250u();
                    i4 = 0;
                    i2 = 1;
                }
                boolean z2 = this.f41i == 1 && mo79l();
                int a = m14a(acc2, acj2, i4);
                int i8 = i4;
                int i9 = i2;
                int i10 = -1;
                int i11 = 0;
                int i12 = 0;
                int i13 = -1;
                View view7 = null;
                while (true) {
                    if (i8 == i3) {
                        view3 = view7;
                        break;
                    }
                    int i14 = i3;
                    int a2 = m14a(acc2, acj2, i8);
                    View i15 = mo245i(i8);
                    if (i15 == view2) {
                        view3 = view7;
                        break;
                    }
                    if (i15.hasFocusable() && a2 != a) {
                        if (view6 != null) {
                            view3 = view7;
                            break;
                        }
                        view4 = view2;
                        view5 = view7;
                        i5 = a;
                    } else {
                        C1557zz zzVar2 = (C1557zz) i15.getLayoutParams();
                        int i16 = zzVar2.f27817a;
                        view4 = view2;
                        int i17 = zzVar2.f27818b + i16;
                        if (i15.hasFocusable() && i16 == i6 && i17 == i7) {
                            return i15;
                        }
                        if (i15.hasFocusable() && view6 == null) {
                            view5 = view7;
                            i5 = a;
                        } else if (!i15.hasFocusable() && view7 == null) {
                            view5 = view7;
                            i5 = a;
                        } else {
                            i5 = a;
                            int min = Math.min(i17, i7) - Math.max(i16, i6);
                            if (!i15.hasFocusable()) {
                                view5 = view7;
                                if (view6 == null && (!this.f121s.mo526a(i15) || !this.f122t.mo526a(i15))) {
                                    if (min <= i12) {
                                        if (min == i12) {
                                        }
                                    }
                                }
                            } else {
                                view5 = view7;
                                if (min <= i11) {
                                    if (min == i11) {
                                    }
                                }
                            }
                        }
                        if (i15.hasFocusable()) {
                            int i18 = zzVar2.f27817a;
                            i11 = Math.min(i17, i7) - Math.max(i16, i6);
                            i13 = i18;
                            view7 = view5;
                            view6 = i15;
                        } else {
                            int i19 = zzVar2.f27817a;
                            i12 = Math.min(i17, i7) - Math.max(i16, i6);
                            i10 = i19;
                            view7 = i15;
                        }
                        i8 += i9;
                        acc2 = acc;
                        acj2 = acj;
                        i3 = i14;
                        view2 = view4;
                        a = i5;
                    }
                    view7 = view5;
                    i8 += i9;
                    acc2 = acc;
                    acj2 = acj;
                    i3 = i14;
                    view2 = view4;
                    a = i5;
                }
                return view6 != null ? view6 : view3;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo22a(int i) {
        if (i != this.f4b) {
            this.f3a = true;
            if (i > 0) {
                this.f4b = i;
                this.f9g.mo10a();
                mo247r();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: a */
    public final void mo23a(acc acc, acj acj, aad aad, int i) {
        m12F();
        if (acj.mo305a() > 0 && !acj.f183g) {
            int b = m17b(acc, acj, aad.f14b);
            if (i == 1) {
                while (b > 0) {
                    int i2 = aad.f14b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aad.f14b = i3;
                    b = m17b(acc, acj, i3);
                }
            } else {
                int a = acj.mo305a() - 1;
                int i4 = aad.f14b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int b2 = m17b(acc, acj, i5);
                    if (b2 <= b) {
                        break;
                    }
                    i4 = i5;
                    b = b2;
                }
                aad.f14b = i4;
            }
        }
        m13G();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aab.a(android.view.View, int, boolean):void
     arg types: [android.view.View, ?, int]
     candidates:
      aab.a(acc, acj, int):int
      aab.a(int, acc, acj):int
      aab.a(acj, aaf, zv):void
      aab.a(android.graphics.Rect, int, int):void
      aah.a(int, acc, acj):int
      aah.a(int, int, boolean):android.view.View
      aah.a(acj, aaf, zv):void
      abu.a(int, int, int):int
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      aab.a(android.view.View, int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aab.a(int, int):int
     arg types: [int, int]
     candidates:
      aab.a(acc, acj):int
      aab.a(android.content.Context, android.util.AttributeSet):abv
      aah.a(int, int):void
      aah.a(acc, aaf):void
      aah.a(int, zv):void
      aah.a(acj, int[]):void
      aah.a(android.support.v7.widget.RecyclerView, int):void
      abu.a(acc, acj):int
      abu.a(android.content.Context, android.util.AttributeSet):abv
      abu.a(int, acc):void
      abu.a(int, zv):void
      abu.a(android.support.v7.widget.RecyclerView, int):void
      abu.a(android.view.View, int):void
      abu.a(android.view.View, android.graphics.Rect):void
      abu.a(android.view.View, qm):void
      aab.a(int, int):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(int, int, int, int, boolean):int
     arg types: [int, ?, int, int, int]
     candidates:
      abu.a(android.view.View, int, int, int, int):void
      abu.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean
      abu.a(int, int, int, int, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aab.a(android.view.View, int, int, boolean):void
     arg types: [android.view.View, int, int, int]
     candidates:
      aab.a(android.view.View, int, acc, acj):android.view.View
      aab.a(acc, acj, aad, int):void
      aab.a(acc, acj, aaf, aae):void
      aab.a(acc, acj, android.view.View, qm):void
      aah.a(int, acc, acj, boolean):int
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
      aab.a(android.view.View, int, int, boolean):void */
    /* renamed from: a */
    public final void mo24a(acc acc, acj acj, aaf aaf, aae aae) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        View a;
        acc acc2 = acc;
        acj acj2 = acj;
        aaf aaf2 = aaf;
        aae aae2 = aae;
        int g = this.f42j.mo130g();
        if (mo250u() > 0) {
            i = this.f5c[this.f4b];
        } else {
            i = 0;
        }
        if (g != 1073741824) {
            m12F();
        }
        int i12 = aaf2.f26e;
        int i13 = this.f4b;
        if (i12 != 1) {
            i13 = m17b(acc2, acj2, aaf2.f25d) + m18c(acc2, acj2, aaf2.f25d);
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.f4b && aaf2.mo47a(acj2) && i13 > 0) {
            int i14 = aaf2.f25d;
            int c = m18c(acc2, acj2, i14);
            if (c <= this.f4b) {
                i13 -= c;
                if (i13 < 0 || (a = aaf2.mo44a(acc2)) == null) {
                    break;
                }
                this.f6d[i2] = a;
                i2++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + c + " spans but GridLayoutManager has only " + this.f4b + " spans.");
            }
        }
        if (i2 != 0) {
            if (i12 != 1) {
                i5 = i2 - 1;
                i4 = -1;
                i3 = -1;
            } else {
                i4 = i2;
                i5 = 0;
                i3 = 1;
            }
            int i15 = 0;
            while (i5 != i4) {
                View view = this.f6d[i5];
                C1557zz zzVar = (C1557zz) view.getLayoutParams();
                int c2 = m18c(acc2, acj2, abu.m288i(view));
                zzVar.f27818b = c2;
                zzVar.f27817a = i15;
                i15 += c2;
                i5 += i3;
            }
            float f = 0.0f;
            int i16 = 0;
            for (int i17 = 0; i17 < i2; i17++) {
                View view2 = this.f6d[i17];
                if (aaf2.f33l == null) {
                    z = false;
                    if (i12 != 1) {
                        mo237b(view2, 0);
                    } else {
                        mo236b(view2);
                    }
                } else if (i12 != 1) {
                    z = false;
                    mo229a(view2, 0);
                } else {
                    z = false;
                    mo228a(view2);
                }
                mo230a(view2, this.f10h);
                m16a(view2, g, z);
                int a2 = this.f42j.mo118a(view2);
                if (a2 > i16) {
                    i16 = a2;
                }
                float b = ((float) this.f42j.mo121b(view2)) / ((float) ((C1557zz) view2.getLayoutParams()).f27818b);
                if (b > f) {
                    f = b;
                }
            }
            if (g != 1073741824) {
                m19j(Math.max(Math.round(f * ((float) this.f4b)), i));
                i16 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    View view3 = this.f6d[i18];
                    m16a(view3, (int) JGCastService.FLAG_PRIVATE_DISPLAY, true);
                    int a3 = this.f42j.mo118a(view3);
                    if (a3 > i16) {
                        i16 = a3;
                    }
                }
            }
            for (int i19 = 0; i19 < i2; i19++) {
                View view4 = this.f6d[i19];
                if (this.f42j.mo118a(view4) != i16) {
                    C1557zz zzVar2 = (C1557zz) view4.getLayoutParams();
                    Rect rect = zzVar2.f130d;
                    int i20 = rect.top + rect.bottom + zzVar2.topMargin + zzVar2.bottomMargin;
                    int i21 = rect.left + rect.right + zzVar2.leftMargin + zzVar2.rightMargin;
                    int a4 = mo14a(zzVar2.f27817a, zzVar2.f27818b);
                    if (this.f41i == 1) {
                        i11 = abu.m277a(a4, (int) JGCastService.FLAG_PRIVATE_DISPLAY, i21, zzVar2.width, false);
                        i10 = View.MeasureSpec.makeMeasureSpec(i16 - i20, JGCastService.FLAG_PRIVATE_DISPLAY);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, JGCastService.FLAG_PRIVATE_DISPLAY);
                        i10 = abu.m277a(a4, (int) JGCastService.FLAG_PRIVATE_DISPLAY, i20, zzVar2.height, false);
                        i11 = makeMeasureSpec;
                    }
                    m15a(view4, i11, i10, true);
                }
            }
            aae2.f18a = i16;
            if (this.f41i == 1) {
                if (aaf2.f27f == -1) {
                    int i22 = aaf2.f23b;
                    i9 = i22 - i16;
                    i8 = i22;
                    i7 = 0;
                    i6 = 0;
                } else {
                    int i23 = aaf2.f23b;
                    i8 = i23 + i16;
                    i9 = i23;
                    i7 = 0;
                    i6 = 0;
                }
            } else if (aaf2.f27f == -1) {
                i6 = aaf2.f23b;
                i7 = i6 - i16;
                i9 = 0;
                i8 = 0;
            } else {
                int i24 = aaf2.f23b;
                i7 = i24;
                i8 = 0;
                i6 = i24 + i16;
                i9 = 0;
            }
            for (int i25 = 0; i25 < i2; i25++) {
                View view5 = this.f6d[i25];
                C1557zz zzVar3 = (C1557zz) view5.getLayoutParams();
                if (this.f41i != 1) {
                    i9 = mo252w() + this.f5c[zzVar3.f27817a];
                    i8 = this.f42j.mo121b(view5) + i9;
                } else if (mo79l()) {
                    int v = mo251v() + this.f5c[this.f4b - zzVar3.f27817a];
                    i6 = v;
                    i7 = v - this.f42j.mo121b(view5);
                } else {
                    i7 = mo251v() + this.f5c[zzVar3.f27817a];
                    i6 = this.f42j.mo121b(view5) + i7;
                }
                abu.m280b(view5, i7, i9, i6, i8);
                if (zzVar3.mo256a() || zzVar3.mo257b()) {
                    aae2.f20c = true;
                }
                aae2.f21d = view5.hasFocusable() | aae2.f21d;
            }
            Arrays.fill(this.f6d, (Object) null);
            return;
        }
        aae2.f19b = true;
    }

    /* renamed from: a */
    public final void mo25a(acc acc, acj acj, View view, C1301qm qmVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1557zz)) {
            super.mo231a(view, qmVar);
            return;
        }
        C1557zz zzVar = (C1557zz) layoutParams;
        int a = m14a(acc, acj, zzVar.mo258c());
        if (this.f41i == 0) {
            qmVar.mo15761b(C1300ql.m20014a(zzVar.f27817a, zzVar.f27818b, a, 1, false));
        } else {
            qmVar.mo15761b(C1300ql.m20014a(a, 1, zzVar.f27817a, zzVar.f27818b, false));
        }
    }

    /* renamed from: a */
    public final void mo26a(acj acj) {
        super.mo26a(acj);
        this.f3a = false;
    }

    /* renamed from: a */
    public final void mo27a(acj acj, aaf aaf, C1553zv zvVar) {
        int i = this.f4b;
        for (int i2 = 0; i2 < this.f4b && aaf.mo47a(acj) && i > 0; i2++) {
            int i3 = aaf.f25d;
            zvVar.mo16644a(i3, Math.max(0, aaf.f28g));
            i -= this.f9g.mo8a(i3);
            aaf.f25d += aaf.f26e;
        }
    }

    /* renamed from: a */
    public final void mo28a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f5c == null) {
            super.mo28a(rect, i, i2);
        }
        int v = mo251v() + mo253x();
        int w = mo252w() + mo254y();
        if (this.f41i == 1) {
            i4 = abu.m276a(i2, rect.height() + w, mo220C());
            int[] iArr = this.f5c;
            i3 = abu.m276a(i, iArr[iArr.length - 1] + v, mo219B());
        } else {
            i3 = abu.m276a(i, rect.width() + v, mo219B());
            int[] iArr2 = this.f5c;
            i4 = abu.m276a(i2, iArr2[iArr2.length - 1] + w, mo220C());
        }
        mo242f(i3, i4);
    }

    /* renamed from: a */
    public final boolean mo29a(abv abv) {
        return abv instanceof C1557zz;
    }
}
