package p000;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqtm */
final /* synthetic */ class aqtm implements tid {

    /* renamed from: a */
    private final ViewGroup f86776a;

    public aqtm(ViewGroup viewGroup) {
        this.f86776a = viewGroup;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        ViewGroup viewGroup = this.f86776a;
        if (bmxv.mo66813a()) {
            ImageView imageView = (ImageView) viewGroup.findViewById(C0126R.C0129id.image);
            imageView.setVisibility(0);
            imageView.setImageBitmap((Bitmap) bmxv.mo66814b());
        }
    }
}
