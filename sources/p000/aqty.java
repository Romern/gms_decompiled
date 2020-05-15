package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqty */
final /* synthetic */ class aqty implements tid {

    /* renamed from: a */
    private final aqua f86799a;

    /* renamed from: b */
    private final View f86800b;

    public aqty(aqua aqua, View view) {
        this.f86799a = aqua;
        this.f86800b = view;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        aqua aqua = this.f86799a;
        View view = this.f86800b;
        if (bmxv.mo66813a()) {
            ((ImageView) view.findViewById(C0126R.C0129id.avatar_icon)).setImageDrawable(new BitmapDrawable(aqua.f86803a.getResources(), tey.m36886a((Bitmap) bmxv.mo66814b(), (int) aqua.f86803a.getResources().getDimension(C0126R.dimen.profile_card_people_avatar_diameter))));
        }
    }
}
