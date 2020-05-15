package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: azod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azod {

    /* renamed from: a */
    private static azod f99787a;

    private azod() {
    }

    /* renamed from: a */
    public static final String m85905a(Context context, String str) {
        try {
            return addi.m50206a(azob.m85899a(context).f99785a).mo33343a(str, "GCM");
        } catch (IOException e) {
            azoj.m85931a("GcmTokenUtil", e, "Exception getting GCM token", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static final String m85907b(Context context, String str) {
        azdl a = azdl.m85412a(context);
        String a2 = m85905a(context, str);
        if (a2 != null) {
            a.mo54777g(a2);
        }
        return a.mo54791m();
    }

    /* renamed from: a */
    public static synchronized void m85906a() {
        synchronized (azod.class) {
            if (f99787a == null) {
                f99787a = new azod();
            }
        }
    }
}
