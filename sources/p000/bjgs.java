package p000;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: bjgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjgs implements ImageLoader.ImageListener {

    /* renamed from: a */
    final /* synthetic */ bjgt f122674a;

    public bjgs(bjgt bjgt) {
        this.f122674a = bjgt;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f122674a.f122687l.mo15636a(-1);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        bjgt bjgt = this.f122674a;
        bjgt.f122687l.mo15636a(-1);
        if (!bjgt.mo65175i() && bjgt.f122678c != 3 && imageContainer.getBitmap() != null) {
            bjgt.mo65159a(imageContainer.getBitmap());
        }
    }
}
