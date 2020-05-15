package p000;

import android.content.Context;
import android.content.res.Configuration;
import com.felicanetworks.mfc.C0126R;

/* renamed from: up */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1412up {

    /* renamed from: a */
    public final Context f27271a;

    private C1412up(Context context) {
        this.f27271a = context;
    }

    /* renamed from: a */
    public static C1412up m20487a(Context context) {
        return new C1412up(context);
    }

    /* renamed from: b */
    public final boolean mo16090b() {
        return this.f27271a.getResources().getBoolean(C0126R.bool.abc_action_bar_embed_tabs);
    }

    /* renamed from: a */
    public final int mo16089a() {
        Configuration configuration = this.f27271a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i < 360 ? 2 : 3;
        }
        return 4;
    }
}
