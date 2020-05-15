package p000;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: lqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqx {
    /* renamed from: a */
    public static Bundle m19547a(Parcelable parcelable) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("_", parcelable);
        return bundle;
    }

    /* renamed from: a */
    public static Parcelable m19548a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getParcelable("_");
        }
        return null;
    }
}
