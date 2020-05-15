package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqse implements tid {

    /* renamed from: a */
    final /* synthetic */ aqsf f86680a;

    public aqse(aqsf aqsf) {
        this.f86680a = aqsf;
    }

    /* renamed from: a */
    public final void mo26454a(bmxv bmxv) {
        aqsf aqsf = this.f86680a;
        if (bmxv.mo66813a()) {
            aqsf.f86681a.setImageDrawable(new BitmapDrawable(aqsf.f86682b.f86687e, tey.m36886a((Bitmap) bmxv.mo66814b(), (int) aqsf.f86682b.f86687e.getDimension(C0126R.dimen.profile_card_people_avatar_diameter))));
            return;
        }
        int i = Build.VERSION.SDK_INT;
        aqsf.f86681a.setImageDrawable(aqsf.f86682b.f86687e.getDrawable(C0126R.C0127drawable.product_logo_avatar_anonymous_color_48, null));
    }
}
