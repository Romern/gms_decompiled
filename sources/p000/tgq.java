package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tgq */
final /* synthetic */ class tgq implements tid {

    /* renamed from: a */
    private final tgr f45953a;

    /* renamed from: b */
    private final View f45954b;

    public tgq(tgr tgr, View view) {
        this.f45953a = tgr;
        this.f45954b = view;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        tgr tgr = this.f45953a;
        View view = this.f45954b;
        if (bmxv.mo66813a()) {
            Bitmap a = tey.m36886a((Bitmap) bmxv.mo66814b(), (int) tgr.f45956b.getResources().getDimension(C0126R.dimen.gm_card_avatar_diameter));
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.icon);
            imageView.setImageDrawable(new BitmapDrawable(tgr.f45956b.getResources(), a));
            imageView.setVisibility(0);
        }
    }
}
