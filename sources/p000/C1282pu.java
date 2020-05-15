package p000;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: pu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1282pu {
    /* renamed from: a */
    public static void m19948a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C1267pf) {
            ((C1267pf) viewParent).mo1130a(view, i);
        } else if (i == 0) {
            int i2 = Build.VERSION.SDK_INT;
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    /* renamed from: b */
    public static void m19954b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C1267pf) {
            ((C1267pf) viewParent).mo1144b(view, view2, i, i2);
        } else if (i2 == 0) {
            int i3 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: a */
    public static void m19949a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C1268pg) {
            ((C1268pg) viewParent2).mo1132a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C1267pf) {
            ((C1267pf) viewParent2).mo1131a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            int i6 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static void m19950a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C1267pf) {
            ((C1267pf) viewParent).mo1133a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            int i4 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m19951a(ViewParent viewParent, View view, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m19952a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m19953a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C1267pf) {
            return ((C1267pf) viewParent).mo1139a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }
}
