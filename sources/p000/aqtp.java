package p000;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqtp */
final /* synthetic */ class aqtp implements tid {

    /* renamed from: a */
    private final ViewGroup f86780a;

    public aqtp(ViewGroup viewGroup) {
        this.f86780a = viewGroup;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        ViewGroup viewGroup = this.f86780a;
        if (bmxv.mo66813a()) {
            ImageView imageView = (ImageView) viewGroup.findViewById(C0126R.C0129id.image);
            imageView.setVisibility(0);
            imageView.setImageBitmap((Bitmap) bmxv.mo66814b());
        }
    }
}
