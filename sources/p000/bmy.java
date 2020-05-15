package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

@Deprecated
/* renamed from: bmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmy extends ContextThemeWrapper {
    public bmy(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, false);
    }
}
