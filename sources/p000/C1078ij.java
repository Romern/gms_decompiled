package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1078ij {
    /* renamed from: a */
    protected static final void m15503a(View view, Rect rect) {
        if (C1280ps.m19871F(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: a */
    public abstract Object mo2390a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo2391a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo2392a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2393a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2394a(Object obj, View view, ArrayList arrayList);

    /* renamed from: a */
    public abstract void mo2395a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: a */
    public abstract void mo2396a(Object obj, ArrayList arrayList);

    /* renamed from: a */
    public abstract void mo2397a(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: a */
    public void mo2398a(Object obj, C1187mg mgVar, Runnable runnable) {
        throw null;
    }

    /* renamed from: a */
    public abstract boolean mo2399a(Object obj);

    /* renamed from: b */
    public abstract Object mo2400b(Object obj);

    /* renamed from: b */
    public abstract Object mo2401b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2402b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2403b(Object obj, View view, ArrayList arrayList);

    /* renamed from: b */
    public abstract void mo2404b(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: c */
    public abstract Object mo2405c(Object obj);

    /* renamed from: c */
    public abstract void mo2406c(Object obj, View view);

    /* renamed from: a */
    protected static void m15504a(List list, View view) {
        int size = list.size();
        if (!m15506a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m15506a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m15505a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m15506a(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13056a(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = Build.VERSION.SDK_INT;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                mo13056a(arrayList, viewGroup.getChildAt(i2));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13057a(Map map, View view) {
        if (view.getVisibility() == 0) {
            String q = C1280ps.m19935q(view);
            if (q != null) {
                map.put(q, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo13057a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
}
