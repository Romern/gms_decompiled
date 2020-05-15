package p000;

import android.graphics.Bitmap;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: bob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bob implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ String f5226a;

    /* renamed from: b */
    final /* synthetic */ ImageLoader f5227b;

    public bob(ImageLoader imageLoader, String str) {
        this.f5227b = imageLoader;
        this.f5226a = str;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.f5227b.onGetImageSuccess(this.f5226a, (Bitmap) obj);
    }
}
