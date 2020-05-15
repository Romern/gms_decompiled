package p000;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: axkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkz {

    /* renamed from: a */
    public static ImageLoader f96122a;

    /* renamed from: a */
    public static synchronized ImageLoader m82688a() {
        ImageLoader imageLoader;
        synchronized (axkz.class) {
            if (f96122a == null) {
                f96122a = new ImageLoader(rpr.m34216b().getRequestQueue(), new axky());
            }
            imageLoader = f96122a;
        }
        return imageLoader;
    }
}
