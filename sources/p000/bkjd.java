package p000;

import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bkjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjd {
    /* renamed from: a */
    public static int m105957a(ContextThemeWrapper contextThemeWrapper) {
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(new int[]{C0126R.attr.uicPopupRedirectActivityTheme});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
