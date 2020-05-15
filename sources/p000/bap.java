package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bap {

    /* renamed from: d */
    private static final Object f2788d = new Object();

    /* renamed from: a */
    public final Context f2789a;

    /* renamed from: b */
    public String f2790b;

    /* renamed from: c */
    public final Map f2791c;

    public bap(Drawable.Callback callback, String str, Map map) {
        this.f2790b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f2790b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f2790b += '/';
            }
        }
        if (!(callback instanceof View)) {
            bek.m2805a("LottieDrawable must be inside of a view for images to work.");
            this.f2791c = new HashMap();
            this.f2789a = null;
            return;
        }
        this.f2789a = ((View) callback).getContext();
        this.f2791c = map;
    }

    /* renamed from: a */
    public final void mo2958a(String str, Bitmap bitmap) {
        synchronized (f2788d) {
            ((ayp) this.f2791c.get(str)).f2570e = bitmap;
        }
    }
}
