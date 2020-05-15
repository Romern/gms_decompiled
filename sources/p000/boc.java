package p000;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: boc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boc implements Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ String f5228a;

    /* renamed from: b */
    final /* synthetic */ ImageLoader f5229b;

    public boc(ImageLoader imageLoader, String str) {
        this.f5229b = imageLoader;
        this.f5228a = str;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f5229b.onGetImageError(this.f5228a, volleyError);
    }
}
