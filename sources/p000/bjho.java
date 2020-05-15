package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* renamed from: bjho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjho {
    /* renamed from: a */
    public static void m103508a(Context context, CharSequence charSequence) {
        if (((AccessibilityManager) context.getSystemService("accessibility")).isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
            obtain.setEnabled(true);
            obtain.getText().add(charSequence);
            ((AccessibilityManager) context.getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }
}
