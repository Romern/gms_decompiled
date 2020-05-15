package p000;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ium */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ium {

    /* renamed from: e */
    private static ium f21804e;

    /* renamed from: a */
    public final Context f21805a;

    /* renamed from: b */
    public final sex f21806b;

    /* renamed from: c */
    public final Object f21807c = new Object();

    /* renamed from: d */
    public final String f21808d = this.f21805a.getString(C0126R.string.auth_proximity_auth_device_type_chromebook);

    public ium(Context context) {
        sdo.m34959a(context);
        Context applicationContext = context.getApplicationContext();
        sex a = sex.m35104a(context);
        this.f21805a = applicationContext;
        this.f21806b = a;
        int i = Build.VERSION.SDK_INT;
        this.f21806b.mo25442a(new NotificationChannel("easy-unlock-notification-channel-id", applicationContext.getString(C0126R.string.auth_proximity_auth_feature_name), 2));
    }

    /* renamed from: a */
    public static synchronized ium m16171a(Context context) {
        ium ium;
        synchronized (ium.class) {
            if (f21804e == null) {
                f21804e = new ium(context);
            }
            ium = f21804e;
        }
        return ium;
    }
}
