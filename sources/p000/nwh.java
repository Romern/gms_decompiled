package p000;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;

/* renamed from: nwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwh extends npc {
    public nwh() {
        super("night_mode");
    }

    /* renamed from: a */
    public final String mo21374a(Context context) {
        return Integer.toString(((UiModeManager) context.getSystemService("uimode")).getNightMode());
    }

    /* renamed from: b */
    public final void mo21375b(Context context) {
    }

    /* renamed from: c */
    public final void mo21376c(Context context) {
        int i = Build.VERSION.SDK_INT;
    }
}
