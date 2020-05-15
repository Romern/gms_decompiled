package p000;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: atv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atv {
    /* renamed from: a */
    static atu m2097a(ViewGroup viewGroup) {
        int i = Build.VERSION.SDK_INT;
        return new atu(viewGroup);
    }

    /* renamed from: a */
    static void m2098a(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        viewGroup.suppressLayout(z);
    }
}
