package p000;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: wgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgv {

    /* renamed from: a */
    private static ImageLoader f50631a;

    /* renamed from: a */
    public static ImageLoader m41935a() {
        if (f50631a == null) {
            f50631a = new ImageLoader(rpr.m34216b().getRequestQueue(), new wgu(Math.min(1048576, (int) (Runtime.getRuntime().maxMemory() / 8))));
        }
        return f50631a;
    }
}
