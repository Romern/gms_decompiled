package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tfs */
final /* synthetic */ class tfs implements tid {

    /* renamed from: a */
    private final View f45876a;

    /* renamed from: b */
    private final int f45877b;

    public tfs(View view, int i) {
        this.f45876a = view;
        this.f45877b = i;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        View view = this.f45876a;
        int i = this.f45877b;
        if (bmxv.mo66813a()) {
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.alt_icon);
            imageView.setImageBitmap(Bitmap.createScaledBitmap((Bitmap) bmxv.mo66814b(), i, i, false));
            imageView.setVisibility(0);
        }
    }
}
