package p000;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: hen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hen implements ImageLoader.ImageListener {

    /* renamed from: a */
    final /* synthetic */ bdep f19609a;

    public hen(bdep bdep) {
        this.f19609a = bdep;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f19609a.mo57931a(null);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (imageContainer.getBitmap() != null) {
            this.f19609a.mo57931a(imageContainer.getBitmap());
        }
    }
}
