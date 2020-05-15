package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: cnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnk {

    /* renamed from: a */
    private static volatile boolean f7104a = true;

    /* renamed from: a */
    public static Drawable m4591a(Context context, Context context2, int i) {
        try {
            if (f7104a) {
                return C1391tv.m20459b(context2, i);
            }
        } catch (NoClassDefFoundError e) {
            f7104a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C1133kh.m17836a(context2, i);
            }
            throw e2;
        } catch (Resources.NotFoundException e3) {
        }
        return C1163lk.m19268a(context2.getResources(), i, context2.getTheme());
    }
}
