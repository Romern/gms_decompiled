package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: acc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acc {

    /* renamed from: a */
    public final ArrayList f144a = new ArrayList();

    /* renamed from: b */
    public ArrayList f145b = null;

    /* renamed from: c */
    public final ArrayList f146c = new ArrayList();

    /* renamed from: d */
    public final List f147d = Collections.unmodifiableList(this.f144a);

    /* renamed from: e */
    public int f148e = 2;

    /* renamed from: f */
    int f149f = 2;

    /* renamed from: g */
    public acb f150g;

    /* renamed from: h */
    public ack f151h;

    /* renamed from: i */
    public final /* synthetic */ RecyclerView f152i;

    public acc(RecyclerView recyclerView) {
        this.f152i = recyclerView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acc.a(android.view.ViewGroup, boolean):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      acc.a(int, long):acm
      acc.a(acm, boolean):void
      acc.a(android.view.ViewGroup, boolean):void */
    /* renamed from: a */
    private final void m388a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m388a((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    /* renamed from: c */
    public final void mo286c() {
        for (int size = this.f146c.size() - 1; size >= 0; size--) {
            mo287c(size);
        }
        this.f146c.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            this.f152i.mPrefetchRegistry.mo16643a();
        }
    }

    /* renamed from: d */
    public final acb mo289d() {
        if (this.f150g == null) {
            this.f150g = new acb();
        }
        return this.f150g;
    }

    /* renamed from: b */
    public final View mo282b(int i) {
        return mo277a(i, Long.MAX_VALUE).f201a;
    }

    /* renamed from: b */
    public final void mo283b() {
        abu abu = this.f152i.mLayout;
        this.f149f = this.f148e + (abu != null ? abu.f128z : 0);
        for (int size = this.f146c.size() - 1; size >= 0 && this.f146c.size() > this.f149f; size--) {
            mo287c(size);
        }
    }

    /* renamed from: a */
    public final int mo276a(int i) {
        if (i < 0 || i >= this.f152i.mState.mo305a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f152i.mState.mo305a() + this.f152i.exceptionLabel());
        }
        RecyclerView recyclerView = this.f152i;
        return recyclerView.mState.f183g ? recyclerView.mAdapterHelper.mo16487b(i) : i;
    }

    /* renamed from: b */
    public final void mo284b(acm acm) {
        if (acm.f214n) {
            this.f145b.remove(acm);
        } else {
            this.f144a.remove(acm);
        }
        acm.f213m = null;
        acm.f214n = false;
        acm.mo328i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acc.a(acm, boolean):void
     arg types: [acm, int]
     candidates:
      acc.a(android.view.ViewGroup, boolean):void
      acc.a(int, long):acm
      acc.a(acm, boolean):void */
    /* renamed from: c */
    public final void mo287c(int i) {
        mo280a((acm) this.f146c.get(i), true);
        this.f146c.remove(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acc.a(android.view.ViewGroup, boolean):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      acc.a(int, long):acm
      acc.a(acm, boolean):void
      acc.a(android.view.ViewGroup, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0300, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04bb, code lost:
        if ((r6 + r9) < r20) goto L_0x04be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* renamed from: a */
    public final acm mo277a(int i, long j) {
        acm acm;
        boolean z;
        boolean z2;
        boolean z3;
        abv abv;
        RecyclerView findNestedRecyclerView;
        acm acm2;
        ack ack;
        View a;
        acm acm3;
        View view;
        acm acm4;
        int b;
        int i2 = i;
        if (i2 < 0 || i2 >= this.f152i.mState.mo305a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + this.f152i.mState.mo305a() + this.f152i.exceptionLabel());
        }
        if (this.f152i.mState.f183g) {
            ArrayList arrayList = this.f145b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 0) {
                    acm = null;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            acm = (acm) this.f145b.get(i3);
                            if (!acm.mo327h() && acm.mo322c() == i2) {
                                acm.mo321b(32);
                                break;
                            }
                            i3++;
                        } else {
                            RecyclerView recyclerView = this.f152i;
                            if (recyclerView.mAdapter.f103b && (b = recyclerView.mAdapterHelper.mo16487b(i2)) > 0 && b < this.f152i.mAdapter.mo161a()) {
                                long L = this.f152i.mAdapter.mo157L(b);
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    acm acm5 = (acm) this.f145b.get(i4);
                                    if (!acm5.mo327h() && acm5.f205e == L) {
                                        acm5.mo321b(32);
                                        acm = acm5;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                    }
                }
                z = acm == null;
            }
            acm = null;
            if (acm == null) {
            }
        } else {
            acm = null;
            z = false;
        }
        if (acm == null) {
            int size2 = this.f144a.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    C1524yt ytVar = this.f152i.mChildHelper;
                    int size3 = ytVar.f27683b.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) ytVar.f27683b.get(i6);
                        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                        if (childViewHolderInt.mo322c() == i2 && !childViewHolderInt.mo330k() && !childViewHolderInt.mo333n()) {
                            break;
                        }
                        i6++;
                    }
                    if (view == null) {
                        int size4 = this.f146c.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                acm4 = null;
                                break;
                            }
                            acm acm6 = (acm) this.f146c.get(i7);
                            if (!acm6.mo330k() && acm6.mo322c() == i2 && !acm6.mo335p()) {
                                this.f146c.remove(i7);
                                acm4 = acm6;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        acm4 = RecyclerView.getChildViewHolderInt(view);
                        C1524yt ytVar2 = this.f152i.mChildHelper;
                        int a2 = ytVar2.f27684c.mo147a(view);
                        if (a2 < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        } else if (ytVar2.f27682a.mo16577c(a2)) {
                            ytVar2.f27682a.mo16576b(a2);
                            ytVar2.mo16592d(view);
                            int b2 = this.f152i.mChildHelper.mo16587b(view);
                            if (b2 != -1) {
                                this.f152i.mChildHelper.mo16591d(b2);
                                mo288c(view);
                                acm4.mo321b(8224);
                            } else {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + acm4 + this.f152i.exceptionLabel());
                            }
                        } else {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                    }
                } else {
                    acm acm7 = (acm) this.f144a.get(i5);
                    if (!acm7.mo327h() && acm7.mo322c() == i2 && !acm7.mo330k() && (this.f152i.mState.f183g || !acm7.mo333n())) {
                        acm7.mo321b(32);
                        acm4 = acm7;
                    } else {
                        i5++;
                    }
                }
            }
            if (acm != null) {
                if (!acm.mo333n()) {
                    int i8 = acm.f203c;
                    if (i8 < 0 || i8 >= this.f152i.mAdapter.mo161a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + acm + this.f152i.exceptionLabel());
                    }
                    RecyclerView recyclerView2 = this.f152i;
                    if (recyclerView2.mState.f183g || recyclerView2.mAdapter.mo162a(acm.f203c) == acm.f206f) {
                        abh abh = this.f152i.mAdapter;
                        if (!abh.f103b || acm.f205e == abh.mo157L(acm.f203c)) {
                            z = true;
                        }
                    }
                } else if (this.f152i.mState.f183g) {
                    z = true;
                }
                acm.mo321b(4);
                if (acm.mo325f()) {
                    this.f152i.removeDetachedView(acm.f201a, false);
                    acm.mo326g();
                } else if (acm.mo327h()) {
                    acm.mo328i();
                }
                mo279a(acm);
                acm = null;
            }
        }
        if (acm == null) {
            int b3 = this.f152i.mAdapterHelper.mo16487b(i2);
            if (b3 < 0 || b3 >= this.f152i.mAdapter.mo161a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + b3 + ").state:" + this.f152i.mState.mo305a() + this.f152i.exceptionLabel());
            }
            int a3 = this.f152i.mAdapter.mo162a(b3);
            abh abh2 = this.f152i.mAdapter;
            if (abh2.f103b) {
                long L2 = abh2.mo157L(b3);
                int size5 = this.f144a.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = this.f146c.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            acm acm8 = (acm) this.f146c.get(size6);
                            if (acm8.f205e != L2 || acm8.mo335p()) {
                                size6--;
                            } else if (a3 == acm8.f206f) {
                                this.f146c.remove(size6);
                                acm3 = acm8;
                            } else {
                                mo287c(size6);
                            }
                        }
                    } else {
                        acm3 = (acm) this.f144a.get(size5);
                        if (acm3.f205e == L2 && !acm3.mo327h()) {
                            if (a3 != acm3.f206f) {
                                this.f144a.remove(size5);
                                this.f152i.removeDetachedView(acm3.f201a, false);
                                mo285b(acm3.f201a);
                            } else {
                                acm3.mo321b(32);
                                if (acm3.mo333n() && !this.f152i.mState.f183g) {
                                    acm3.mo313a(2, 14);
                                }
                            }
                        }
                        size5--;
                    }
                }
                if (acm != null) {
                    acm.f203c = b3;
                    z = true;
                }
            }
            if (!(acm != null || (ack = this.f151h) == null || (a = ack.mo308a()) == null)) {
                acm = this.f152i.getChildViewHolder(a);
                if (acm == null) {
                    throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + this.f152i.exceptionLabel());
                } else if (acm.mo320aO()) {
                    throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + this.f152i.exceptionLabel());
                }
            }
            if (acm == null) {
                aca aca = (aca) mo289d().f142a.get(a3);
                if (aca != null && !aca.f138a.isEmpty()) {
                    ArrayList arrayList2 = aca.f138a;
                    int size7 = arrayList2.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            break;
                        } else if (!((acm) arrayList2.get(size7)).mo335p()) {
                            acm2 = (acm) arrayList2.remove(size7);
                            break;
                        } else {
                            size7--;
                        }
                    }
                }
                acm2 = null;
                if (acm2 != null) {
                    acm2.mo338s();
                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                        View view2 = acm2.f201a;
                        if (view2 instanceof ViewGroup) {
                            m388a((ViewGroup) view2, false);
                        }
                    }
                }
                acm = acm2;
            }
            if (acm == null) {
                long nanoTime = this.f152i.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.f150g.mo273a(a3).f140c;
                    if (j2 != 0 && j2 + nanoTime >= j) {
                        return null;
                    }
                }
                RecyclerView recyclerView3 = this.f152i;
                acm = recyclerView3.mAdapter.mo172b(recyclerView3, a3);
                if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(acm.f201a)) != null) {
                    acm.f202b = new WeakReference(findNestedRecyclerView);
                }
                long nanoTime2 = this.f152i.getNanoTime();
                aca a4 = this.f150g.mo273a(a3);
                a4.f140c = acb.m384a(a4.f140c, nanoTime2 - nanoTime);
            }
        }
        if (z && !this.f152i.mState.f183g && acm.mo318a(8192)) {
            acm.mo313a(0, 8192);
            if (this.f152i.mState.f186j) {
                abp.m248g(acm);
                acm.mo337r();
                this.f152i.recordAnimationInfoIfBouncedHiddenView(acm, abp.m249h(acm));
            }
        }
        if (!this.f152i.mState.f183g || !acm.mo332m()) {
            if (!acm.mo332m() || acm.mo331l() || acm.mo330k()) {
                int b4 = this.f152i.mAdapterHelper.mo16487b(i2);
                acm.f218r = null;
                RecyclerView recyclerView4 = this.f152i;
                acm.f217q = recyclerView4;
                int i9 = acm.f206f;
                long nanoTime3 = recyclerView4.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j3 = this.f150g.mo273a(i9).f141d;
                    if (j3 != 0) {
                    }
                }
                this.f152i.mAdapter.mo176b(acm, b4);
                long nanoTime4 = this.f152i.getNanoTime();
                aca a5 = this.f150g.mo273a(acm.f206f);
                a5.f141d = acb.m384a(a5.f141d, nanoTime4 - nanoTime3);
                if (!this.f152i.isAccessibilityEnabled()) {
                    z2 = true;
                } else {
                    View view3 = acm.f201a;
                    if (C1280ps.m19917f(view3) != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                        C1280ps.m19906b(view3, 1);
                    }
                    aco aco = this.f152i.mAccessibilityDelegate;
                    if (aco != null) {
                        C1251oq b5 = aco.mo352b();
                        if (b5 instanceof acn) {
                            acn acn = (acn) b5;
                            C1251oq c = C1280ps.m19908c(view3);
                            if (!(c == null || c == acn)) {
                                acn.f221c.put(view3, c);
                            }
                        }
                        C1280ps.m19894a(view3, b5);
                    }
                }
                if (this.f152i.mState.f183g) {
                    acm.f207g = i2;
                }
                z3 = true;
            }
            z3 = false;
            z2 = true;
        } else {
            acm.f207g = i2;
            z3 = false;
            z2 = true;
        }
        ViewGroup.LayoutParams layoutParams = acm.f201a.getLayoutParams();
        if (layoutParams == null) {
            abv = (abv) this.f152i.generateDefaultLayoutParams();
            acm.f201a.setLayoutParams(abv);
        } else if (!this.f152i.checkLayoutParams(layoutParams)) {
            abv = (abv) this.f152i.generateLayoutParams(layoutParams);
            acm.f201a.setLayoutParams(abv);
        } else {
            abv = (abv) layoutParams;
        }
        abv.f129c = acm;
        if (!z || !z3) {
            z2 = false;
        }
        abv.f132f = z2;
        return acm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acm.a(acc, boolean):void
     arg types: [acc, int]
     candidates:
      acm.a(int, int):void
      acm.a(int, boolean):void
      acm.a(acc, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo288c(View view) {
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!childViewHolderInt.mo318a(12) && childViewHolderInt.mo341u() && !this.f152i.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f145b == null) {
                this.f145b = new ArrayList();
            }
            childViewHolderInt.mo315a(this, true);
            this.f145b.add(childViewHolderInt);
        } else if (!childViewHolderInt.mo330k() || childViewHolderInt.mo333n() || this.f152i.mAdapter.f103b) {
            childViewHolderInt.mo315a(this, false);
            this.f144a.add(childViewHolderInt);
        } else {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f152i.exceptionLabel());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo285b(View view) {
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.f213m = null;
        childViewHolderInt.f214n = false;
        childViewHolderInt.mo328i();
        mo279a(childViewHolderInt);
    }

    /* renamed from: a */
    public final void mo278a() {
        this.f144a.clear();
        mo286c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acc.a(acm, boolean):void
     arg types: [acm, int]
     candidates:
      acc.a(android.view.ViewGroup, boolean):void
      acc.a(int, long):acm
      acc.a(acm, boolean):void */
    /* renamed from: a */
    public final void mo279a(acm acm) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (acm.mo325f() || acm.f201a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(acm.mo325f());
            sb.append(" isAttached:");
            if (acm.f201a.getParent() == null) {
                z3 = false;
            }
            sb.append(z3);
            sb.append(this.f152i.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        } else if (acm.mo334o()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + acm + this.f152i.exceptionLabel());
        } else if (!acm.mo320aO()) {
            if ((acm.f210j & 16) == 0) {
                z = C1280ps.m19913d(acm.f201a);
            } else {
                z = false;
            }
            if (!acm.mo339t()) {
                z3 = false;
            } else {
                if (this.f149f <= 0 || acm.mo318a(526)) {
                    z2 = false;
                } else {
                    int size = this.f146c.size();
                    if (size >= this.f149f && size > 0) {
                        mo287c(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !this.f152i.mPrefetchRegistry.mo16646a(acm.f203c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!this.f152i.mPrefetchRegistry.mo16646a(((acm) this.f146c.get(i)).f203c)) {
                                break;
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                    this.f146c.add(size, acm);
                    z2 = true;
                }
                if (!z2) {
                    mo280a(acm, true);
                    z4 = z2;
                } else {
                    z4 = z2;
                    z3 = false;
                }
            }
            this.f152i.mViewInfoStore.mo535d(acm);
            if (!z4 && !z3 && z) {
                acm.f218r = null;
                acm.f217q = null;
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.f152i.exceptionLabel());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo280a(acm acm, boolean z) {
        C1251oq oqVar;
        RecyclerView.clearNestedRecyclerViewIfNotNested(acm);
        View view = acm.f201a;
        aco aco = this.f152i.mAccessibilityDelegate;
        if (aco != null) {
            C1251oq b = aco.mo352b();
            if (b instanceof acn) {
                oqVar = (C1251oq) ((acn) b).f221c.remove(view);
            } else {
                oqVar = null;
            }
            C1280ps.m19894a(view, oqVar);
        }
        if (z) {
            acd acd = this.f152i.mRecyclerListener;
            if (acd != null) {
                acd.mo290a();
            }
            abh abh = this.f152i.mAdapter;
            if (abh != null) {
                abh.mo167a(acm);
            }
            RecyclerView recyclerView = this.f152i;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo535d(acm);
            }
        }
        acm.f218r = null;
        acm.f217q = null;
        acb d = mo289d();
        int i = acm.f206f;
        ArrayList arrayList = d.mo273a(i).f138a;
        int i2 = ((aca) d.f142a.get(i)).f139b;
        if (arrayList.size() < 5) {
            acm.mo338s();
            arrayList.add(acm);
        }
    }

    /* renamed from: a */
    public final void mo281a(View view) {
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.mo334o()) {
            this.f152i.removeDetachedView(view, false);
        }
        if (childViewHolderInt.mo325f()) {
            childViewHolderInt.mo326g();
        } else if (childViewHolderInt.mo327h()) {
            childViewHolderInt.mo328i();
        }
        mo279a(childViewHolderInt);
        if (this.f152i.mItemAnimator != null && !childViewHolderInt.mo339t()) {
            this.f152i.mItemAnimator.mo206d(childViewHolderInt);
        }
    }
}
