package p000;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bao {

    /* renamed from: a */
    public final bay f2783a = new bay();

    /* renamed from: b */
    public final Map f2784b = new HashMap();

    /* renamed from: c */
    public final Map f2785c = new HashMap();

    /* renamed from: d */
    public final AssetManager f2786d;

    /* renamed from: e */
    public final String f2787e = ".ttf";

    public bao(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            bek.m2805a("LottieDrawable must be inside of a view for images to work.");
            this.f2786d = null;
            return;
        }
        this.f2786d = ((View) callback).getContext().getAssets();
    }
}
