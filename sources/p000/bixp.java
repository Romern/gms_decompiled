package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* renamed from: bixp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixp extends ContextThemeWrapper {
    public bixp(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, false);
    }
}
