package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ffp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffp {
    /* renamed from: a */
    public static void m11618a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
        Context context = null;
        if (!(view == null || view.getContext() == null)) {
            context = view.getContext().getApplicationContext();
        }
        if (context != null && !TextUtils.isEmpty(charSequence)) {
            if (accessibilityManager == null) {
                accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            }
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                obtain.getText().add(charSequence);
                obtain.setEnabled(view.isEnabled());
                obtain.setClassName(view.getClass().getName());
                obtain.setPackageName(context.getPackageName());
                new C1305qq(obtain).mo15795a(view);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
