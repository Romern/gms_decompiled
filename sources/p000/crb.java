package p000;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: crb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class crb {
    /* renamed from: a */
    public static Object m7382a(Object obj) {
        m7383a(obj, "Argument must not be null");
        return obj;
    }

    /* renamed from: a */
    public static void m7383a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public static void m7384a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    /* renamed from: a */
    public static void m7385a(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    /* renamed from: a */
    public static void m7386a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
