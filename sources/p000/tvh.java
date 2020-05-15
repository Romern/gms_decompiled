package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.FadeInImageView;

/* renamed from: tvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tvh implements ImageLoader.ImageListener {

    /* renamed from: a */
    final /* synthetic */ tus f46712a;

    public tvh(tus tus) {
        this.f46712a = tus;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f46712a.f46702a.setImageResource(C0126R.C0127drawable.quantum_ic_chrome_product_vd_theme_24);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        tus tus = this.f46712a;
        Bitmap bitmap = imageContainer.getBitmap();
        if (z) {
            tus.f46702a.setImageBitmap(bitmap);
            return;
        }
        FadeInImageView fadeInImageView = tus.f46702a;
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C1133kh.m17843b(fadeInImageView.getContext(), 17170445)), new BitmapDrawable(fadeInImageView.getContext().getResources(), bitmap)});
        transitionDrawable.setCrossFadeEnabled(true);
        fadeInImageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(500);
    }
}
