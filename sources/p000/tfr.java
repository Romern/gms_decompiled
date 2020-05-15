package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tfr */
final /* synthetic */ class tfr implements tid {

    /* renamed from: a */
    private final View f45874a;

    /* renamed from: b */
    private final int f45875b;

    public tfr(View view, int i) {
        this.f45874a = view;
        this.f45875b = i;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        View view = this.f45874a;
        int i = this.f45875b;
        if (bmxv.mo66813a()) {
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.icon);
            imageView.setImageBitmap(Bitmap.createScaledBitmap((Bitmap) bmxv.mo66814b(), i, i, false));
            imageView.setVisibility(0);
        }
    }
}
