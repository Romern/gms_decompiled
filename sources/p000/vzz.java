package p000;

import android.content.Context;

/* renamed from: vzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzz {

    /* renamed from: c */
    private static vzz f50309c;

    /* renamed from: a */
    public final vzy f50310a;

    /* renamed from: b */
    private final Context f50311b;

    private vzz(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f50311b = applicationContext;
        this.f50310a = new vzy(this.f50311b, new vzw(new sgv(applicationContext, cbvz.m128699g(), cbvz.m128698f(), cbvz.m128696d(), cbvz.m128700h(), cbvz.m128695c(), cbvz.m128697e(), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk")));
    }

    /* renamed from: a */
    public static synchronized vzz m41646a(Context context) {
        vzz vzz;
        synchronized (vzz.class) {
            if (f50309c == null) {
                f50309c = new vzz(context);
            }
            vzz = f50309c;
        }
        return vzz;
    }
}
