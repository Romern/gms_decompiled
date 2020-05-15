package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;

/* renamed from: ado */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ado extends ContextWrapper {
    public final AssetManager getAssets() {
        throw null;
    }

    public final Resources getResources() {
        throw null;
    }

    public final Resources.Theme getTheme() {
        throw null;
    }

    public final void setTheme(int i) {
        throw null;
    }

    /* renamed from: a */
    public static void m520a(Context context) {
        if (!(context instanceof ado) && !(context.getResources() instanceof adq) && !(context.getResources() instanceof aed)) {
            int i = Build.VERSION.SDK_INT;
            aed.m595a();
        }
    }
}
