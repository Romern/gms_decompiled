package p000;

import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;

/* renamed from: amh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amh {
    /* renamed from: a */
    public static Display m1080a(Object obj) {
        try {
            return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
            return null;
        }
    }
}
