package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* renamed from: imx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imx {

    /* renamed from: a */
    private static final sek f21369a = ght.m13171a("PackageManagerHelper");

    /* renamed from: b */
    private final Context f21370b;

    public imx(Context context) {
        this.f21370b = context;
    }

    /* renamed from: a */
    public final CharSequence mo13151a(String str) {
        try {
            return svr.m36484b(this.f21370b).mo26177b(str);
        } catch (PackageManager.NameNotFoundException e) {
            f21369a.mo25416d("Package does not exist: %s", str, e);
            return null;
        }
    }

    /* renamed from: b */
    public final Drawable mo13152b(String str) {
        try {
            return (Drawable) svr.m36484b(this.f21370b).mo26179c(str).f26799b;
        } catch (PackageManager.NameNotFoundException e) {
            f21369a.mo25416d("Package does not exist: %s", str, e);
            return null;
        }
    }
}
