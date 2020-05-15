package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: aczr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczr {

    /* renamed from: a */
    private static final sek f61172a = ght.m13172b("PackageUtils");

    /* renamed from: a */
    public static bmxv m50057a(Context context, String str) {
        try {
            C1240of c = svr.m36484b(context).mo26179c(str);
            Drawable drawable = (Drawable) c.f26799b;
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bmxv.m108566b(new C1240of((CharSequence) c.f26798a, createBitmap));
        } catch (PackageManager.NameNotFoundException e) {
            f61172a.mo25417e("Package not found!", e, new Object[0]);
            return bmvz.f131120a;
        }
    }
}
