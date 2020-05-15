package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: awxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awxd implements ImageLoader.ImageListener {
    public final void onErrorResponse(VolleyError volleyError) {
        Log.w("NetworkOwService", "Failed to pre-fetch hero image");
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
    }
}
