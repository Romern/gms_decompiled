package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;

/* renamed from: abu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abu {

    /* renamed from: A */
    public boolean f112A;

    /* renamed from: B */
    public int f113B;

    /* renamed from: C */
    public int f114C;

    /* renamed from: D */
    public int f115D;

    /* renamed from: E */
    public int f116E;

    /* renamed from: a */
    private final aef f117a = new abs(this);

    /* renamed from: b */
    private final aef f118b = new abt(this);

    /* renamed from: q */
    C1524yt f119q;

    /* renamed from: r */
    public RecyclerView f120r;

    /* renamed from: s */
    final aeg f121s = new aeg(this.f117a);

    /* renamed from: t */
    final aeg f122t = new aeg(this.f118b);

    /* renamed from: u */
    public aci f123u;

    /* renamed from: v */
    public boolean f124v = false;

    /* renamed from: w */
    boolean f125w = false;

    /* renamed from: x */
    public final boolean f126x = true;

    /* renamed from: y */
    public final boolean f127y = true;

    /* renamed from: z */
    public int f128z;

    /* renamed from: a */
    public static int m276a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* renamed from: b */
    public static final void m280b(View view, int i, int i2, int i3, int i4) {
        abv abv = (abv) view.getLayoutParams();
        Rect rect = abv.f130d;
        view.layout(i + rect.left + abv.leftMargin, i2 + rect.top + abv.topMargin, (i3 - rect.right) - abv.rightMargin, (i4 - rect.bottom) - abv.bottomMargin);
    }

    /* renamed from: c */
    public static final int m282c(View view) {
        return view.getBottom() + ((abv) view.getLayoutParams()).f130d.bottom;
    }

    /* renamed from: d */
    public static final int m283d(View view) {
        return view.getLeft() - ((abv) view.getLayoutParams()).f130d.left;
    }

    /* renamed from: e */
    public static final int m284e(View view) {
        Rect rect = ((abv) view.getLayoutParams()).f130d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: f */
    public static final int m285f(View view) {
        Rect rect = ((abv) view.getLayoutParams()).f130d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: g */
    public static final int m286g(View view) {
        return view.getRight() + ((abv) view.getLayoutParams()).f130d.right;
    }

    /* renamed from: h */
    public static final int m287h(View view) {
        return view.getTop() - ((abv) view.getLayoutParams()).f130d.top;
    }

    /* renamed from: i */
    public static final int m288i(View view) {
        return ((abv) view.getLayoutParams()).mo258c();
    }

    /* renamed from: A */
    public final int mo218A() {
        RecyclerView recyclerView = this.f120r;
        abh adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo161a();
        }
        return 0;
    }

    /* renamed from: B */
    public final int mo219B() {
        return C1280ps.m19929k(this.f120r);
    }

    /* renamed from: C */
    public final int mo220C() {
        return C1280ps.m19930l(this.f120r);
    }

    /* renamed from: D */
    public void mo221D() {
    }

    @Deprecated
    /* renamed from: E */
    public final void mo222E() {
        this.f125w = true;
    }

    /* renamed from: a */
    public int mo15a(int i, acc acc, acj acj) {
        throw null;
    }

    /* renamed from: a */
    public int mo16a(acc acc, acj acj) {
        return -1;
    }

    /* renamed from: a */
    public abstract abv mo17a();

    /* renamed from: a */
    public View mo21a(View view, int i, acc acc, acj acj) {
        return null;
    }

    /* renamed from: a */
    public void mo53a(int i, int i2, acj acj, C1553zv zvVar) {
    }

    /* renamed from: a */
    public void mo54a(int i, C1553zv zvVar) {
    }

    /* renamed from: a */
    public void mo25a(acc acc, acj acj, View view, C1301qm qmVar) {
    }

    /* renamed from: a */
    public void mo26a(acj acj) {
    }

    /* renamed from: a */
    public void mo56a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo57a(RecyclerView recyclerView, int i) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo29a(abv abv) {
        return abv != null;
    }

    /* renamed from: b */
    public int mo30b(int i, acc acc, acj acj) {
        throw null;
    }

    /* renamed from: b */
    public int mo31b(acc acc, acj acj) {
        return -1;
    }

    /* renamed from: b */
    public int mo60b(acj acj) {
        throw null;
    }

    /* renamed from: b */
    public boolean mo32b() {
        throw null;
    }

    /* renamed from: c */
    public int mo65c(acj acj) {
        throw null;
    }

    /* renamed from: c */
    public View mo66c(int i) {
        throw null;
    }

    /* renamed from: c */
    public void mo33c() {
    }

    /* renamed from: c */
    public void mo34c(acc acc, acj acj) {
        throw null;
    }

    /* renamed from: d */
    public int mo68d(acj acj) {
        throw null;
    }

    /* renamed from: d */
    public void mo35d() {
    }

    /* renamed from: e */
    public int mo70e(acj acj) {
        throw null;
    }

    /* renamed from: e */
    public void mo36e() {
    }

    /* renamed from: e */
    public void mo71e(int i) {
        throw null;
    }

    /* renamed from: f */
    public int mo73f(acj acj) {
        throw null;
    }

    /* renamed from: f */
    public void mo37f() {
    }

    /* renamed from: g */
    public int mo74g(acj acj) {
        throw null;
    }

    /* renamed from: g */
    public void mo38g() {
    }

    /* renamed from: h */
    public boolean mo75h() {
        return this.f125w;
    }

    /* renamed from: i */
    public Parcelable mo76i() {
        return null;
    }

    /* renamed from: j */
    public void mo246j(View view) {
        abv abv = (abv) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f120r.getItemDecorInsetsForChild(view);
        int i = itemDecorInsetsForChild.left;
        int i2 = itemDecorInsetsForChild.right;
        int i3 = itemDecorInsetsForChild.top;
        int i4 = itemDecorInsetsForChild.bottom;
        int a = m277a(this.f115D, this.f113B, mo251v() + mo253x() + abv.leftMargin + abv.rightMargin + i + i2, abv.width, mo77j());
        int a2 = m277a(this.f116E, this.f114C, mo252w() + mo254y() + abv.topMargin + abv.bottomMargin + i3 + i4, abv.height, mo78k());
        if (mo233a(view, a, a2, abv)) {
            view.measure(a, a2);
        }
    }

    /* renamed from: j */
    public boolean mo77j() {
        throw null;
    }

    /* renamed from: k */
    public boolean mo78k() {
        throw null;
    }

    /* renamed from: o */
    public boolean mo82o() {
        return false;
    }

    /* renamed from: r */
    public final void mo247r() {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: s */
    public final int mo248s() {
        return C1280ps.m19923h(this.f120r);
    }

    /* renamed from: t */
    public final void mo249t() {
        for (int u = mo250u() - 1; u >= 0; u--) {
            this.f119q.mo16582a(u);
        }
    }

    /* renamed from: u */
    public final int mo250u() {
        C1524yt ytVar = this.f119q;
        if (ytVar != null) {
            return ytVar.mo16581a();
        }
        return 0;
    }

    /* renamed from: v */
    public final int mo251v() {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: w */
    public final int mo252w() {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: x */
    public final int mo253x() {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: y */
    public final int mo254y() {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: z */
    public final View mo255z() {
        View focusedChild;
        RecyclerView recyclerView = this.f120r;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f119q.mo16590c(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    /* renamed from: b */
    public static boolean m281b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo244h(int i) {
        mo245i(i);
        this.f119q.mo16591d(i);
    }

    /* renamed from: i */
    public final View mo245i(int i) {
        C1524yt ytVar = this.f119q;
        if (ytVar != null) {
            return ytVar.mo16588b(i);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r5 == 1073741824) goto L_0x0030;
     */
    /* renamed from: a */
    public static int m277a(int i, int i2, int i3, int i4, boolean z) {
        int max = Math.max(0, i - i3);
        if (!z) {
            if (i4 >= 0) {
                i2 = JGCastService.FLAG_PRIVATE_DISPLAY;
                return View.MeasureSpec.makeMeasureSpec(i4, i2);
            } else if (i4 != -1) {
                if (i4 == -2) {
                    i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                }
                i2 = 0;
                i4 = 0;
                return View.MeasureSpec.makeMeasureSpec(i4, i2);
            }
        } else if (i4 >= 0) {
            i2 = JGCastService.FLAG_PRIVATE_DISPLAY;
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        } else {
            if (i4 == -1) {
                if (i2 != Integer.MIN_VALUE) {
                    if (i2 != 0) {
                    }
                }
            }
            i2 = 0;
            i4 = 0;
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }
        i4 = max;
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* renamed from: f */
    public final void mo242f(int i, int i2) {
        this.f120r.setMeasuredDimension(i, i2);
    }

    /* renamed from: d */
    public final void mo240d(int i, int i2) {
        this.f115D = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f113B = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f115D = 0;
        }
        this.f116E = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f114C = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.f116E = 0;
        }
    }

    /* renamed from: e */
    public final void mo241e(int i, int i2) {
        int u = mo250u();
        if (u != 0) {
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < u; i7++) {
                View i8 = mo245i(i7);
                Rect rect = this.f120r.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(i8, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.f120r.mTempRect.set(i5, i6, i3, i4);
            mo28a(this.f120r.mTempRect, i, i2);
            return;
        }
        this.f120r.defaultOnMeasure(i, i2);
    }

    /* renamed from: g */
    public final void mo243g(int i) {
        if (mo245i(i) != null) {
            this.f119q.mo16582a(i);
        }
    }

    /* renamed from: a */
    public static final void m278a(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((abv) view.getLayoutParams()).f130d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    /* renamed from: b */
    public final void mo234b(acc acc) {
        int size = acc.f144a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((acm) acc.f144a.get(i)).f201a;
            acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo320aO()) {
                childViewHolderInt.mo317a(false);
                if (childViewHolderInt.mo334o()) {
                    this.f120r.removeDetachedView(view, false);
                }
                abp abp = this.f120r.mItemAnimator;
                if (abp != null) {
                    abp.mo206d(childViewHolderInt);
                }
                childViewHolderInt.mo317a(true);
                acc.mo285b(view);
            }
        }
        acc.f144a.clear();
        ArrayList arrayList = acc.f145b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f120r.invalidate();
        }
    }

    /* renamed from: c */
    public final void mo239c(acc acc) {
        for (int u = mo250u() - 1; u >= 0; u--) {
            if (!RecyclerView.getChildViewHolderInt(mo245i(u)).mo320aO()) {
                mo223a(u, acc);
            }
        }
    }

    /* renamed from: a */
    private final void m279a(View view, int i, boolean z) {
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z || childViewHolderInt.mo333n()) {
            this.f120r.mViewInfoStore.mo532b(childViewHolderInt);
        } else {
            this.f120r.mViewInfoStore.mo534c(childViewHolderInt);
        }
        abv abv = (abv) view.getLayoutParams();
        if (childViewHolderInt.mo327h() || childViewHolderInt.mo325f()) {
            if (childViewHolderInt.mo325f()) {
                childViewHolderInt.mo326g();
            } else {
                childViewHolderInt.mo328i();
            }
            this.f119q.mo16584a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f120r) {
            int b = this.f119q.mo16587b(view);
            if (i == -1) {
                i = this.f119q.mo16581a();
            }
            if (b == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f120r.indexOfChild(view) + this.f120r.exceptionLabel());
            } else if (b != i) {
                abu abu = this.f120r.mLayout;
                View i2 = abu.mo245i(b);
                if (i2 != null) {
                    abu.mo244h(b);
                    abv abv2 = (abv) i2.getLayoutParams();
                    acm childViewHolderInt2 = RecyclerView.getChildViewHolderInt(i2);
                    if (childViewHolderInt2.mo333n()) {
                        abu.f120r.mViewInfoStore.mo532b(childViewHolderInt2);
                    } else {
                        abu.f120r.mViewInfoStore.mo534c(childViewHolderInt2);
                    }
                    abu.f119q.mo16584a(i2, i, abv2, childViewHolderInt2.mo333n());
                } else {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + abu.f120r.toString());
                }
            }
        } else {
            this.f119q.mo16585a(view, i, false);
            abv.f131e = true;
            aci aci = this.f123u;
            if (aci != null && aci.f165e && aci.mo298a(view) == aci.f161a) {
                aci.f166f = view;
            }
        }
        if (abv.f132f) {
            childViewHolderInt.f201a.invalidate();
            abv.f132f = false;
        }
    }

    /* renamed from: b */
    public final void mo235b(RecyclerView recyclerView) {
        mo240d(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: b */
    public final void mo236b(View view) {
        mo237b(view, -1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(android.view.View, int, boolean):void
     arg types: [android.view.View, int, int]
     candidates:
      abu.a(int, int, int):int
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      abu.a(android.view.View, int, boolean):void */
    /* renamed from: b */
    public final void mo237b(View view, int i) {
        m279a(view, i, false);
    }

    /* renamed from: b */
    public final void mo238b(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((abv) view.getLayoutParams()).f130d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.f120r == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.f120r.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: a */
    public abv mo18a(Context context, AttributeSet attributeSet) {
        return new abv(context, attributeSet);
    }

    /* renamed from: a */
    public abv mo19a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof abv) {
            return new abv((abv) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new abv((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new abv(layoutParams);
    }

    /* renamed from: a */
    public final void mo223a(int i, acc acc) {
        View i2 = mo245i(i);
        mo243g(i);
        acc.mo281a(i2);
    }

    /* renamed from: a */
    public final void mo224a(acc acc) {
        for (int u = mo250u() - 1; u >= 0; u--) {
            View i = mo245i(u);
            acm childViewHolderInt = RecyclerView.getChildViewHolderInt(i);
            if (!childViewHolderInt.mo320aO()) {
                if (!childViewHolderInt.mo330k() || childViewHolderInt.mo333n() || this.f120r.mAdapter.f103b) {
                    mo244h(u);
                    acc.mo288c(i);
                    this.f120r.mViewInfoStore.mo534c(childViewHolderInt);
                } else {
                    mo243g(u);
                    acc.mo279a(childViewHolderInt);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo225a(acc acc, int i, int i2) {
        this.f120r.defaultOnMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo226a(aci aci) {
        aci aci2 = this.f123u;
        if (!(aci2 == null || aci == aci2 || !aci2.f165e)) {
            aci2.mo300a();
        }
        this.f123u = aci;
        RecyclerView recyclerView = this.f120r;
        recyclerView.mViewFlinger.mo311b();
        if (aci.f167g) {
            Log.w("RecyclerView", "An instance of " + aci.getClass().getSimpleName() + " was started more than once. Each instance of" + aci.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        aci.f162b = recyclerView;
        aci.f163c = this;
        int i = aci.f161a;
        if (i != -1) {
            RecyclerView recyclerView2 = aci.f162b;
            recyclerView2.mState.f177a = i;
            aci.f165e = true;
            aci.f164d = true;
            aci.f166f = recyclerView2.mLayout.mo66c(aci.f161a);
            aci.f162b.mViewFlinger.mo309a();
            aci.f167g = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    /* renamed from: a */
    public void mo28a(Rect rect, int i, int i2) {
        int width = rect.width();
        int v = mo251v();
        int x = mo253x();
        int height = rect.height();
        int w = mo252w();
        mo242f(m276a(i, width + v + x, mo219B()), m276a(i2, height + w + mo254y(), mo220C()));
    }

    /* renamed from: a */
    public final void mo227a(RecyclerView recyclerView) {
        int i;
        if (recyclerView != null) {
            this.f120r = recyclerView;
            this.f119q = recyclerView.mChildHelper;
            this.f115D = recyclerView.getWidth();
            i = recyclerView.getHeight();
        } else {
            this.f120r = null;
            this.f119q = null;
            i = 0;
            this.f115D = 0;
        }
        this.f116E = i;
        this.f113B = JGCastService.FLAG_PRIVATE_DISPLAY;
        this.f114C = JGCastService.FLAG_PRIVATE_DISPLAY;
    }

    /* renamed from: a */
    public final void mo228a(View view) {
        mo229a(view, -1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abu.a(android.view.View, int, boolean):void
     arg types: [android.view.View, int, int]
     candidates:
      abu.a(int, int, int):int
      abu.a(int, acc, acj):int
      abu.a(acc, int, int):void
      abu.a(android.graphics.Rect, int, int):void
      abu.a(android.view.View, int, boolean):void */
    /* renamed from: a */
    public final void mo229a(View view, int i) {
        m279a(view, i, true);
    }

    /* renamed from: a */
    public final void mo230a(View view, Rect rect) {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo231a(View view, C1301qm qmVar) {
        acm childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null && !childViewHolderInt.mo333n() && !this.f119q.mo16590c(childViewHolderInt.f201a)) {
            RecyclerView recyclerView = this.f120r;
            mo25a(recyclerView.mRecycler, recyclerView.mState, view, qmVar);
        }
    }

    /* renamed from: a */
    public void mo58a(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f120r;
        acc acc = recyclerView.mRecycler;
        acj acj = recyclerView.mState;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f120r.canScrollVertically(-1) && !this.f120r.canScrollHorizontally(-1) && !this.f120r.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            abh abh = this.f120r.mAdapter;
            if (abh != null) {
                accessibilityEvent.setItemCount(abh.mo161a());
            }
        }
    }

    /* renamed from: a */
    public void mo59a(String str) {
        RecyclerView recyclerView = this.f120r;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        if ((r10.bottom - r15) > r5) goto L_0x00b6;
     */
    /* renamed from: a */
    public final boolean mo232a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        RecyclerView recyclerView2 = recyclerView;
        int[] iArr = new int[2];
        int v = mo251v();
        int w = mo252w();
        int i = this.f115D;
        int x = mo253x();
        int i2 = this.f116E;
        int y = mo254y();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width();
        int height = rect.height();
        int i3 = left - v;
        int min = Math.min(0, i3);
        int i4 = top - w;
        int min2 = Math.min(0, i4);
        int i5 = (left + width) - (i - x);
        int max = Math.max(0, i5);
        int max2 = Math.max(0, (top + height) - (i2 - y));
        if (mo248s() == 1) {
            min = max == 0 ? Math.max(min, i5) : max;
        } else if (min == 0) {
            min = Math.min(i3, max);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        iArr[0] = min;
        iArr[1] = min2;
        int i6 = iArr[0];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int v2 = mo251v();
                int w2 = mo252w();
                int i7 = this.f115D;
                int x2 = mo253x();
                int y2 = this.f116E - mo254y();
                Rect rect2 = this.f120r.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(focusedChild, rect2);
                if (rect2.left - i6 < i7 - x2) {
                    if (rect2.right - i6 > v2) {
                        if (rect2.top - min2 < y2) {
                        }
                    }
                }
            }
            return false;
        }
        if (!(i6 == 0 && min2 == 0)) {
            if (!z) {
                recyclerView2.smoothScrollBy(i6, min2);
            } else {
                recyclerView2.scrollBy(i6, min2);
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo233a(View view, int i, int i2, abv abv) {
        return view.isLayoutRequested() || !this.f126x || !m281b(view.getWidth(), i, abv.width) || !m281b(view.getHeight(), i2, abv.height);
    }
}
