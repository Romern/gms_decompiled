package p000;

import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: boa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boa implements ImageLoader.ImageListener {

    /* renamed from: a */
    final /* synthetic */ int f5223a;

    /* renamed from: b */
    final /* synthetic */ ImageView f5224b;

    /* renamed from: c */
    final /* synthetic */ int f5225c;

    public boa(int i, ImageView imageView, int i2) {
        this.f5223a = i;
        this.f5224b = imageView;
        this.f5225c = i2;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        int i = this.f5223a;
        if (i != 0) {
            this.f5224b.setImageResource(i);
        }
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (imageContainer.getBitmap() != null) {
            this.f5224b.setImageBitmap(imageContainer.getBitmap());
            return;
        }
        int i = this.f5225c;
        if (i != 0) {
            this.f5224b.setImageResource(i);
        }
    }
}
