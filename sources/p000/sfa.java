package p000;

import android.content.Context;
import java.util.List;

/* renamed from: sfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfa implements sfb {
    private sfa() {
    }

    /* renamed from: a */
    public static sfb m35133a() {
        return new sfa();
    }

    /* renamed from: b */
    public static final qws m35134b(Context context, String str) {
        sdo.m34977c(str);
        return new qws(context, str, null);
    }

    /* renamed from: b */
    public final boolean mo25464b() {
        return true;
    }

    /* renamed from: a */
    public final List mo25461a(Context context) {
        return mo25462a(context, "GMS_CORE");
    }

    /* renamed from: a */
    public final List mo25462a(Context context, String str) {
        sdo.m34977c(str);
        return bngx.m109356a(m35134b(context, str));
    }

    /* renamed from: b */
    public final qws mo25463b(Context context) {
        return m35134b(context, "GMS_CORE");
    }
}
