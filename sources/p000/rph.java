package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;
import java.util.Locale;

/* renamed from: rph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rph {

    /* renamed from: a */
    public final Context f43487a;

    public rph(Context context) {
        this.f43487a = context;
    }

    /* renamed from: a */
    private static String m34206a(aymd aymd) {
        return Integer.toString(aymd.f97966p);
    }

    /* renamed from: a */
    public final void mo24987a(boolean z, boolean z2, aymd aymd, aymd aymd2) {
        if (!z) {
            Log.e("BuildVerifier", String.format(Locale.US, "Incorrect Google Play Services build variant used, expected %s, but actual is %s", m34206a(aymd), m34206a(aymd2)));
        } else if (!z2) {
            NotificationManager notificationManager = (NotificationManager) this.f43487a.getSystemService("notification");
            String[] strArr = {"NOT_LMP", "NOT_MNC", "OLD_VARIANT", "BAD_VARIANT"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                try {
                    notificationManager.cancel(str, 10436);
                    notificationManager.cancel(str, 39789);
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Failure to cancel notifications: ");
                    sb.append(valueOf);
                    Log.w("BuildVerifier", sb.toString());
                }
            }
        } else {
            Log.w("BuildVerifier", String.format(Locale.US, "Old Google Play Services build variant used, expected %s, but actual is %s, should be fixed when it updates", m34206a(aymd), m34206a(aymd2)));
            rfi.f42868a.mo24587a(this.f43487a, 2, "OLD_VARIANT");
        }
    }
}
