package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: adbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbw {
    /* renamed from: a */
    public static SafeParcelable m50144a(Bundle bundle, String str, Class cls) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        return (SafeParcelable) bundle2.getParcelable("parcelable");
    }

    /* renamed from: a */
    public static void m50145a(Bundle bundle, String str, SafeParcelable safeParcelable) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("parcelable", safeParcelable);
        bundle.putBundle(str, bundle2);
    }
}
