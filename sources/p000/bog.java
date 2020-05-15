package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/* renamed from: bog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bog implements ImageLoader.ImageListener {

    /* renamed from: a */
    final /* synthetic */ boolean f5237a;

    /* renamed from: b */
    final /* synthetic */ NetworkImageView f5238b;

    public bog(NetworkImageView networkImageView, boolean z) {
        this.f5238b = networkImageView;
        this.f5237a = z;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NetworkImageView networkImageView = this.f5238b;
        int i = networkImageView.f7357d;
        if (i == 0) {
            Drawable drawable = networkImageView.f7358e;
            if (drawable == null) {
                Bitmap bitmap = networkImageView.f7359f;
                if (bitmap != null) {
                    networkImageView.setImageBitmap(bitmap);
                    return;
                }
                return;
            }
            networkImageView.setImageDrawable(drawable);
            return;
        }
        networkImageView.setImageResource(i);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        if (z && this.f5237a) {
            this.f5238b.post(new bof(this, imageContainer));
        } else if (imageContainer.getBitmap() == null) {
            NetworkImageView networkImageView = this.f5238b;
            int i = networkImageView.f7354a;
            if (i == 0) {
                Drawable drawable = networkImageView.f7355b;
                if (drawable == null) {
                    Bitmap bitmap = networkImageView.f7356c;
                    if (bitmap != null) {
                        networkImageView.setImageBitmap(bitmap);
                        return;
                    }
                    return;
                }
                networkImageView.setImageDrawable(drawable);
                return;
            }
            networkImageView.setImageResource(i);
        } else {
            this.f5238b.setImageBitmap(imageContainer.getBitmap());
        }
    }
}
