package p000;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import java.util.List;

/* renamed from: bod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bod implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ImageLoader f5230a;

    public bod(ImageLoader imageLoader) {
        this.f5230a = imageLoader;
    }

    public final void run() {
        for (boe boe : this.f5230a.f7332b.values()) {
            List list = boe.f5233c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageLoader.ImageContainer imageContainer = (ImageLoader.ImageContainer) list.get(i);
                ImageLoader.ImageListener imageListener = imageContainer.f7339b;
                if (imageListener != null) {
                    VolleyError volleyError = boe.f5232b;
                    if (volleyError == null) {
                        imageContainer.f7338a = boe.f5231a;
                        imageListener.onResponse(imageContainer, false);
                    } else {
                        imageListener.onErrorResponse(volleyError);
                    }
                }
            }
        }
        this.f5230a.f7332b.clear();
        this.f5230a.f7333c = null;
    }
}
