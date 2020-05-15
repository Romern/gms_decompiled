package p000;

import com.google.android.chimera.Activity;

/* renamed from: wgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgq {
    /* renamed from: a */
    public static Object m41934a(Class cls, Activity activity) {
        if (cls.isInstance(activity)) {
            return cls.cast(activity);
        }
        String simpleName = activity.getClass().getSimpleName();
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 16 + String.valueOf(canonicalName).length());
        sb.append(simpleName);
        sb.append(" must implement ");
        sb.append(canonicalName);
        throw new IllegalStateException(sb.toString());
    }
}
