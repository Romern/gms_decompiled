package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: wd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C1454wd implements AdapterView.OnItemClickListener, C1462wl, C1458wh {

    /* renamed from: g */
    public Rect f27491g;

    /* renamed from: a */
    protected static int m20678a(ListAdapter listAdapter, Context context, int i) {
        int i2;
        int i3 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i4 = 0;
        int i5 = 0;
        while (i3 < count) {
            int itemViewType = listAdapter.getItemViewType(i3);
            if (itemViewType != i5) {
                i2 = itemViewType;
            } else {
                i2 = i5;
            }
            if (itemViewType != i5) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
            i3++;
            i5 = i2;
        }
        return i4;
    }

    /* renamed from: b */
    protected static boolean m20680b(C1443vt vtVar) {
        int size = vtVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = vtVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo16190a(int i);

    /* renamed from: a */
    public final void mo466a(Context context, C1443vt vtVar) {
    }

    /* renamed from: a */
    public abstract void mo16191a(View view);

    /* renamed from: a */
    public abstract void mo16192a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo16193a(C1443vt vtVar);

    /* renamed from: a */
    public final boolean mo472a(C1446vw vwVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo474b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo16194b(int i);

    /* renamed from: b */
    public abstract void mo16195b(boolean z);

    /* renamed from: b */
    public final boolean mo475b(C1446vw vwVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo16196c(int i);

    /* renamed from: c */
    public abstract void mo16197c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo16198h() {
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C1443vt vtVar = m20679a(listAdapter).f27416a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!mo16198h()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        vtVar.mo16228a(menuItem, this, i2);
    }

    /* renamed from: a */
    protected static C1440vq m20679a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C1440vq) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C1440vq) listAdapter;
    }
}
