package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: ovr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovr {

    /* renamed from: a */
    private final Context f38498a;

    static {
        odk.m28481a("CAR.MISC.LocaleSupCheck");
    }

    public ovr(Context context) {
        this.f38498a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo22704b() {
        if (!ccvi.f180032a.mo6606a().mo76876a()) {
            try {
                nuu.m27794b(this.f38498a, ccqx.m131305b());
                return true;
            } catch (IllegalStateException | SecurityException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29886a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return sre.m36084d(context);
    }

    /* renamed from: a */
    public final int mo22703a() {
        if (ccui.m131662b() && m29886a(this.f38498a)) {
            return 5;
        }
        ccui.f179964a.mo6606a().mo76834r();
        if (ccui.f179964a.mo6606a().mo76828l()) {
            return ccui.f179964a.mo6606a().mo76829m() ? 3 : 0;
        }
        if (!mo22704b()) {
            return 2;
        }
        return 0;
    }
}
