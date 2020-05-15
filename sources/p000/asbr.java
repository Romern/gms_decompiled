package p000;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;

/* renamed from: asbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbr {
    /* renamed from: a */
    public static void m73757a(Activity activity, CharSequence charSequence) {
        AccessibilityManager accessibilityManager;
        if (!TextUtils.isEmpty(charSequence) && (accessibilityManager = (AccessibilityManager) activity.getApplicationContext().getSystemService("accessibility")) != null && accessibilityManager.isEnabled()) {
            activity.setTitle(charSequence);
            activity.getWindow().getDecorView().sendAccessibilityEvent(32);
        }
    }
}
