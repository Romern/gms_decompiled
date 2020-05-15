package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tfw */
final /* synthetic */ class tfw implements tid {

    /* renamed from: a */
    private final View f45896a;

    public tfw(View view) {
        this.f45896a = view;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        View view = this.f45896a;
        if (bmxv.mo66813a()) {
            ((ImageView) view.findViewById(C0126R.C0129id.image)).setImageBitmap((Bitmap) bmxv.mo66814b());
            view.setVisibility(0);
        }
    }
}
