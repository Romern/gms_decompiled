package p000;

import android.app.NotificationChannel;
import android.content.Context;

/* renamed from: nyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyy {

    /* renamed from: a */
    public final sex f36993a;

    private nyy(sex sex) {
        this.f36993a = sex;
    }

    /* renamed from: a */
    public static nyy m28213a(Context context) {
        sex a = sex.m35104a(context);
        if (a != null) {
            return new nyy(a);
        }
        return null;
    }

    /* renamed from: a */
    public final NotificationChannel mo21865a(String str) {
        return this.f36993a.mo25437a(str);
    }

    /* renamed from: a */
    public final void mo21866a(NotificationChannel notificationChannel) {
        this.f36993a.mo25442a(notificationChannel);
    }
}
