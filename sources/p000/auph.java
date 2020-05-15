package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;

/* renamed from: auph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auph {

    /* renamed from: b */
    private static auph f92268b;

    /* renamed from: a */
    public final DevicePolicyManager f92269a;

    private auph(Context context) {
        this.f92269a = (DevicePolicyManager) context.getSystemService("device_policy");
    }

    /* renamed from: a */
    public static synchronized auph m77555a(Context context) {
        auph auph;
        synchronized (auph.class) {
            if (f92268b == null) {
                f92268b = new auph(context);
            }
            auph = f92268b;
        }
        return auph;
    }
}
