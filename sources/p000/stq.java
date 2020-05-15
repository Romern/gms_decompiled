package p000;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: stq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stq {
    /* renamed from: a */
    public static void m36308a(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m36308a(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m36309a(Runnable runnable) {
        new adzt(Looper.getMainLooper()).post(runnable);
    }
}
