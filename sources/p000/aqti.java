package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: aqti */
final /* synthetic */ class aqti implements tid {

    /* renamed from: a */
    private final ImageView f86760a;

    public aqti(ImageView imageView) {
        this.f86760a = imageView;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        ImageView imageView = this.f86760a;
        if (bmxv.mo66813a()) {
            imageView.setVisibility(0);
            imageView.setImageBitmap((Bitmap) bmxv.mo66814b());
        }
    }
}
