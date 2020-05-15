package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: aqvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvz implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aqwa f86952a;

    /* renamed from: b */
    private final String f86953b;

    /* renamed from: c */
    private final aqqa f86954c;

    public aqvz(aqwa aqwa, String str, aqqa aqqa) {
        this.f86952a = aqwa;
        this.f86953b = str;
        this.f86954c = aqqa;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aqwb(this.f86952a.f86956b, this.f86953b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        bmxv bmxv = (bmxv) obj;
        aqqa aqqa = this.f86954c;
        if (bmxv.mo66813a()) {
            aqqa.f86578a.f86584a.setImageDrawable(new BitmapDrawable(aqqa.f86579b.f86587b, (Bitmap) bmxv.mo66814b()));
            return;
        }
        ImageView imageView = aqqa.f86578a.f86584a;
        Resources resources = aqqa.f86579b.f86587b;
        imageView.setImageDrawable(rzl.m34707a(resources, resources.getDrawable(C0126R.C0127drawable.product_logo_avatar_anonymous_color_48)));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
