package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: swn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swn {

    /* renamed from: a */
    private static volatile swn f45290a;

    private swn() {
    }

    /* renamed from: a */
    public static void m36529a() {
        if (f45290a == null) {
            synchronized (swn.class) {
                if (f45290a == null) {
                    f45290a = new swn();
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m36530a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setClassName(context, "com.google.android.gms.config.ConfigService");
        intent.setData(Uri.parse(str2.length() == 0 ? new String("package:") : "package:".concat(str2)));
        context.startService(intent);
    }
}
