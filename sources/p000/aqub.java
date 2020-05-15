package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqub */
final /* synthetic */ class aqub implements tid {

    /* renamed from: a */
    private final aqud f86811a;

    /* renamed from: b */
    private final View f86812b;

    public aqub(aqud aqud, View view) {
        this.f86811a = aqud;
        this.f86812b = view;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        aqud aqud = this.f86811a;
        View view = this.f86812b;
        if (bmxv.mo66813a()) {
            ((ImageView) view.findViewById(C0126R.C0129id.avatar_icon)).setImageDrawable(new BitmapDrawable(aqud.f86816b.getResources(), tey.m36886a((Bitmap) bmxv.mo66814b(), (int) aqud.f86816b.getResources().getDimension(C0126R.dimen.profile_card_people_avatar_diameter))));
        }
    }
}
