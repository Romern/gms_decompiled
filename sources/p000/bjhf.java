package p000;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

/* renamed from: bjhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjhf {
    /* renamed from: a */
    public static void m103483a(ContextWrapper contextWrapper, WidgetConfig widgetConfig) {
        contextWrapper.getTheme().applyStyle(widgetConfig.f151764e, true);
    }

    /* renamed from: a */
    public static boolean m103484a(Context context, WidgetConfig widgetConfig) {
        int i = widgetConfig.f151769j;
        if (bjhz.m103567a().mo65275k()) {
            if (i == 1) {
                return true;
            }
            if (i == 2 && (context.getResources().getConfiguration().uiMode & 48) == 32) {
                return true;
            }
            return false;
        }
        return false;
    }
}
