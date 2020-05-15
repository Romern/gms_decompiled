package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: ati */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ati implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    final atf f2198a;

    /* renamed from: b */
    final ViewGroup f2199b;

    public ati(atf atf, ViewGroup viewGroup) {
        this.f2198a = atf;
        this.f2199b = viewGroup;
    }

    /* renamed from: a */
    private final void m2051a() {
        this.f2199b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f2199b.removeOnAttachStateChangeListener(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.a(android.view.ViewGroup, boolean):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      atf.a(android.view.View, boolean):atq
      atf.a(atq, atq):boolean
      atf.a(android.view.ViewGroup, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.a(android.view.View, boolean):atq
     arg types: [android.view.View, int]
     candidates:
      atf.a(android.view.ViewGroup, boolean):void
      atf.a(atq, atq):boolean
      atf.a(android.view.View, boolean):atq */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        atb atb;
        atr atr;
        atq atq;
        View view;
        View view2;
        atr atr2;
        m2051a();
        int i = 1;
        if (!atj.f2200a.remove(this.f2199b)) {
            return true;
        }
        C1223np a = atj.m2052a();
        ArrayList arrayList2 = (ArrayList) a.get(this.f2199b);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            a.put(this.f2199b, arrayList2);
            arrayList = null;
        } else {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
        }
        arrayList2.add(this.f2198a);
        this.f2198a.mo2463a(new ath(this, a));
        this.f2198a.mo2460a(this.f2199b, false);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((atf) arrayList.get(i2)).mo2474c(this.f2199b);
            }
        }
        atf atf = this.f2198a;
        ViewGroup viewGroup = this.f2199b;
        atf.f2187o = new ArrayList();
        atf.f2188p = new ArrayList();
        atr atr3 = atf.f2183k;
        atr atr4 = atf.f2184l;
        C1223np npVar = new C1223np(atr3.f2218a);
        C1223np npVar2 = new C1223np(atr4.f2218a);
        int i3 = 0;
        while (true) {
            int[] iArr = atf.f2186n;
            if (i3 >= iArr.length) {
                break;
            }
            int i4 = iArr[i3];
            if (i4 == i) {
                atr = atr4;
                for (int i5 = npVar.f26809h - 1; i5 >= 0; i5--) {
                    View view3 = (View) npVar.mo15620b(i5);
                    if (view3 != null && atf.mo2468a(view3) && (atq = (atq) npVar2.remove(view3)) != null && atf.mo2468a(atq.f2216b)) {
                        atf.f2187o.add((atq) npVar.mo8152d(i5));
                        atf.f2188p.add(atq);
                    }
                }
            } else if (i4 == 2) {
                atr = atr4;
                C1223np npVar3 = atr3.f2221d;
                C1223np npVar4 = atr.f2221d;
                int i6 = npVar3.f26809h;
                for (int i7 = 0; i7 < i6; i7++) {
                    View view4 = (View) npVar3.mo15621c(i7);
                    if (view4 != null && atf.mo2468a(view4) && (view = (View) npVar4.get(npVar3.mo15620b(i7))) != null && atf.mo2468a(view)) {
                        atq atq2 = (atq) npVar.get(view4);
                        atq atq3 = (atq) npVar2.get(view);
                        if (!(atq2 == null || atq3 == null)) {
                            atf.f2187o.add(atq2);
                            atf.f2188p.add(atq3);
                            npVar.remove(view4);
                            npVar2.remove(view);
                        }
                    }
                }
            } else if (i4 == 3) {
                SparseArray sparseArray = atr3.f2219b;
                atr = atr4;
                SparseArray sparseArray2 = atr.f2219b;
                int size2 = sparseArray.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    View view5 = (View) sparseArray.valueAt(i8);
                    if (view5 != null && atf.mo2468a(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i8))) != null && atf.mo2468a(view2)) {
                        atq atq4 = (atq) npVar.get(view5);
                        atq atq5 = (atq) npVar2.get(view2);
                        if (!(atq4 == null || atq5 == null)) {
                            atf.f2187o.add(atq4);
                            atf.f2188p.add(atq5);
                            npVar.remove(view5);
                            npVar2.remove(view2);
                        }
                    }
                }
            } else if (i4 != 4) {
                atr = atr4;
            } else {
                C1230nw nwVar = atr3.f2220c;
                C1230nw nwVar2 = atr4.f2220c;
                int b = nwVar.mo15537b();
                int i9 = 0;
                while (i9 < b) {
                    View view6 = (View) nwVar.mo15538b(i9);
                    if (view6 == null) {
                        atr2 = atr4;
                    } else if (atf.mo2468a(view6)) {
                        atr2 = atr4;
                        View view7 = (View) nwVar2.mo15534a(nwVar.mo15533a(i9));
                        if (view7 != null && atf.mo2468a(view7)) {
                            atq atq6 = (atq) npVar.get(view6);
                            atq atq7 = (atq) npVar2.get(view7);
                            if (!(atq6 == null || atq7 == null)) {
                                atf.f2187o.add(atq6);
                                atf.f2188p.add(atq7);
                                npVar.remove(view6);
                                npVar2.remove(view7);
                            }
                        }
                    } else {
                        atr2 = atr4;
                    }
                    i9++;
                    atr4 = atr2;
                }
                atr = atr4;
            }
            i3++;
            atr4 = atr;
            i = 1;
        }
        for (int i10 = 0; i10 < npVar.f26809h; i10++) {
            atq atq8 = (atq) npVar.mo15621c(i10);
            if (atf.mo2468a(atq8.f2216b)) {
                atf.f2187o.add(atq8);
                atf.f2188p.add(null);
            }
        }
        for (int i11 = 0; i11 < npVar2.f26809h; i11++) {
            atq atq9 = (atq) npVar2.mo15621c(i11);
            if (atf.mo2468a(atq9.f2216b)) {
                atf.f2188p.add(atq9);
                atf.f2187o.add(null);
            }
        }
        C1223np c = atf.m2011c();
        int i12 = c.f26809h;
        aue b2 = aty.m2103b(viewGroup);
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            Animator animator = (Animator) c.mo15620b(i13);
            if (!(animator == null || (atb = (atb) c.get(animator)) == null || atb.f2161a == null || !b2.equals(atb.f2165e))) {
                atq atq10 = atb.f2163c;
                View view8 = atb.f2161a;
                atq a2 = atf.mo2455a(view8, true);
                atq b3 = atf.mo2470b(view8, true);
                if (a2 == null && b3 == null) {
                    b3 = (atq) atf.f2184l.f2218a.get(view8);
                }
                if (!(a2 == null && b3 == null) && atb.f2164d.mo2469a(atq10, b3)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c.remove(animator);
                    }
                }
            }
        }
        atf.mo2459a(viewGroup, atf.f2183k, atf.f2184l, atf.f2187o, atf.f2188p);
        atf.mo2477d();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        m2051a();
        atj.f2200a.remove(this.f2199b);
        ArrayList arrayList = (ArrayList) atj.m2052a().get(this.f2199b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((atf) arrayList.get(i)).mo2474c(this.f2199b);
            }
        }
        this.f2198a.mo2466a(true);
    }
}
