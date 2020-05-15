package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: zx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1555zx implements Runnable {

    /* renamed from: a */
    public static final ThreadLocal f27811a = new ThreadLocal();

    /* renamed from: e */
    static final Comparator f27812e = new C1552zu();

    /* renamed from: b */
    public final ArrayList f27813b = new ArrayList();

    /* renamed from: c */
    long f27814c;

    /* renamed from: d */
    public long f27815d;

    /* renamed from: f */
    private final ArrayList f27816f = new ArrayList();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acc.a(acm, boolean):void
     arg types: [acm, int]
     candidates:
      acc.a(android.view.ViewGroup, boolean):void
      acc.a(int, long):acm
      acc.a(acm, boolean):void */
    /* renamed from: a */
    private static final acm m20998a(RecyclerView recyclerView, int i, long j) {
        int b = recyclerView.mChildHelper.mo16586b();
        for (int i2 = 0; i2 < b; i2++) {
            acm childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo16589c(i2));
            if (childViewHolderInt.f203c == i && !childViewHolderInt.mo330k()) {
                return null;
            }
        }
        acc acc = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            acm a = acc.mo277a(i, j);
            if (a != null) {
                if (!a.mo332m() || a.mo330k()) {
                    acc.mo280a(a, false);
                } else {
                    acc.mo281a(a.f201a);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zv.a(android.support.v7.widget.RecyclerView, boolean):void
     arg types: [android.support.v7.widget.RecyclerView, int]
     candidates:
      zv.a(int, int):void
      zv.a(android.support.v7.widget.RecyclerView, boolean):void */
    public final void run() {
        C1554zw zwVar;
        RecyclerView recyclerView;
        long j;
        RecyclerView recyclerView2;
        C1554zw zwVar2;
        boolean z;
        long j2 = 0;
        try {
            C1192ml.m19643a("RV Prefetch");
            if (!this.f27813b.isEmpty()) {
                int size = this.f27813b.size();
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.f27813b.get(i);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView3.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.f27815d;
                    int size2 = this.f27813b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.f27813b.get(i3);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.mPrefetchRegistry.mo16645a(recyclerView4, false);
                            i2 += recyclerView4.mPrefetchRegistry.f27805d;
                        }
                    }
                    this.f27816f.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView5 = (RecyclerView) this.f27813b.get(i5);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            C1553zv zvVar = recyclerView5.mPrefetchRegistry;
                            int abs = Math.abs(zvVar.f27802a) + Math.abs(zvVar.f27803b);
                            int i6 = 0;
                            while (true) {
                                int i7 = zvVar.f27805d;
                                if (i6 >= i7 + i7) {
                                    break;
                                }
                                if (i4 >= this.f27816f.size()) {
                                    zwVar2 = new C1554zw();
                                    this.f27816f.add(zwVar2);
                                } else {
                                    zwVar2 = (C1554zw) this.f27816f.get(i4);
                                }
                                int[] iArr = zvVar.f27804c;
                                int i8 = iArr[i6 + 1];
                                if (i8 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                zwVar2.f27806a = z;
                                zwVar2.f27807b = abs;
                                zwVar2.f27808c = i8;
                                zwVar2.f27809d = recyclerView5;
                                zwVar2.f27810e = iArr[i6];
                                i4++;
                                i6 += 2;
                            }
                        }
                    }
                    Collections.sort(this.f27816f, f27812e);
                    int i9 = 0;
                    while (i9 < this.f27816f.size() && (recyclerView = (zwVar = (C1554zw) this.f27816f.get(i9)).f27809d) != null) {
                        if (!zwVar.f27806a) {
                            j = nanos;
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        acm a = m20998a(recyclerView, zwVar.f27810e, j);
                        if (a != null && a.f202b != null) {
                            if (a.mo332m() && !a.mo330k() && (recyclerView2 = (RecyclerView) a.f202b.get()) != null) {
                                if (recyclerView2.mDataSetHasChangedAfterLayout) {
                                    if (recyclerView2.mChildHelper.mo16586b() != 0) {
                                        recyclerView2.removeAndRecycleViews();
                                    }
                                }
                                C1553zv zvVar2 = recyclerView2.mPrefetchRegistry;
                                zvVar2.mo16645a(recyclerView2, true);
                                if (zvVar2.f27805d != 0) {
                                    C1192ml.m19643a("RV Nested Prefetch");
                                    acj acj = recyclerView2.mState;
                                    abh abh = recyclerView2.mAdapter;
                                    acj.f180d = 1;
                                    acj.f181e = abh.mo161a();
                                    acj.f183g = false;
                                    acj.f184h = false;
                                    acj.f185i = false;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = zvVar2.f27805d;
                                        if (i10 >= i11 + i11) {
                                            break;
                                        }
                                        m20998a(recyclerView2, zvVar2.f27804c[i10], nanos);
                                        i10 += 2;
                                    }
                                    C1192ml.m19642a();
                                }
                            }
                        }
                        zwVar.f27806a = false;
                        zwVar.f27807b = 0;
                        zwVar.f27808c = 0;
                        zwVar.f27809d = null;
                        zwVar.f27810e = 0;
                        i9++;
                    }
                    this.f27814c = 0;
                    C1192ml.m19642a();
                }
                j2 = 0;
            }
            this.f27814c = j2;
            C1192ml.m19642a();
        } catch (Throwable th) {
            this.f27814c = 0;
            throw th;
        } finally {
        }
    }

    /* renamed from: a */
    public final void mo16647a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f27814c == 0) {
            this.f27814c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1553zv zvVar = recyclerView.mPrefetchRegistry;
        zvVar.f27802a = i;
        zvVar.f27803b = i2;
    }
}
