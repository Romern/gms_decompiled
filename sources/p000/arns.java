package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.io.UnsupportedEncodingException;

/* renamed from: arns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arns {
    /* renamed from: a */
    public static arnt m73193a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes[0] != 1) {
                return new arnv(str);
            }
            return new arnx(bytes);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static bowh m73194a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return bowh.m111606a((int) cgqs.f187523a.mo6606a().mo84315aa());
        }
        if (!cgqs.f187523a.mo6606a().mo84310W()) {
            return bowh.DEFAULT;
        }
        return bowh.HEX_PIN;
    }
}
