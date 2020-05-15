package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: evb */
final /* synthetic */ class evb implements fgn {

    /* renamed from: a */
    private final FadeInImageView f15871a;

    public evb(FadeInImageView fadeInImageView) {
        this.f15871a = fadeInImageView;
    }

    /* renamed from: a */
    public final void mo10504a(Bitmap bitmap, boolean z) {
        FadeInImageView fadeInImageView = this.f15871a;
        if (!z) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C1133kh.m17843b(fadeInImageView.getContext(), 17170445)), new BitmapDrawable(fadeInImageView.getContext().getResources(), bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            fadeInImageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(500);
            return;
        }
        fadeInImageView.setImageBitmap(bitmap);
    }
}
