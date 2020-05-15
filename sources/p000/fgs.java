package p000;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: fgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fgs implements ImageLoader.ImageListener {

    /* renamed from: a */
    final /* synthetic */ fgn f16523a;

    public fgs(fgn fgn) {
        this.f16523a = fgn;
    }

    public final void onErrorResponse(VolleyError volleyError) {
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        this.f16523a.mo10504a(imageContainer.getBitmap(), z);
    }
}
