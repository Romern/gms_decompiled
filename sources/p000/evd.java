package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: evd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class evd {
    /* renamed from: a */
    public static void m11165a(ImageView imageView, int i) {
        C1329rn.m20096a(imageView, ColorStateList.valueOf(i));
        if (imageView.getDrawable() != null) {
            Drawable drawable = imageView.getDrawable();
            if (cbro.f178167a.mo6606a().mo75288h()) {
                drawable = imageView.getDrawable().mutate();
            }
            C1173lt.m19599a(drawable, i);
        }
    }
}
