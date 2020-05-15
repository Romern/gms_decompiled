package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: afcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afcg {

    /* renamed from: d */
    private static afcg f64173d;

    /* renamed from: a */
    public final afba f64174a = afaz.m52798a();

    /* renamed from: b */
    public final Context f64175b;

    /* renamed from: c */
    public final sex f64176c;

    /* renamed from: e */
    private final Object f64177e = new Object();

    private afcg() {
        rpr b = rpr.m34216b();
        sex a = sex.m35104a(rpr.m34216b());
        this.f64175b = b;
        this.f64176c = a;
        int i = Build.VERSION.SDK_INT;
        this.f64176c.mo25443a(new NotificationChannelGroup("mt-notification-channel-group-id", this.f64175b.getString(C0126R.string.common_magictether_settings_title)));
        NotificationChannel notificationChannel = new NotificationChannel("mt-notification-connected-channel-id", this.f64175b.getString(C0126R.string.magictether_providing_internet_title), 2);
        notificationChannel.setGroup("mt-notification-channel-group-id");
        this.f64176c.mo25442a(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel("mt-notification-channel-id", this.f64175b.getString(C0126R.string.magictether_provide_data_title), 4);
        notificationChannel2.setGroup("mt-notification-channel-group-id");
        this.f64176c.mo25442a(notificationChannel2);
    }

    /* renamed from: a */
    public static synchronized afcg m52833a() {
        afcg afcg;
        synchronized (afcg.class) {
            if (f64173d == null) {
                f64173d = new afcg();
            }
            afcg = f64173d;
        }
        return afcg;
    }

    /* renamed from: b */
    public final void mo34742b() {
        mo34739a(3);
    }

    /* renamed from: a */
    public final C1102je mo34738a(boolean z, String str) {
        int i;
        if (!z) {
            i = C0126R.C0127drawable.ic_magictether_translucent_white_24;
        } else {
            i = C0126R.C0127drawable.ic_magictether_solid_white_24;
        }
        Bundle bundle = new Bundle();
        int i2 = Build.VERSION.SDK_INT;
        bundle.putString("android.substName", this.f64175b.getString(C0126R.string.common_magictether_settings_title));
        C1102je jeVar = new C1102je(this.f64175b);
        jeVar.mo13630b(qkj.m32287a(this.f64175b, i));
        jeVar.mo13619a(System.currentTimeMillis());
        jeVar.mo13627a(true);
        jeVar.mo13623a(bundle);
        int i3 = Build.VERSION.SDK_INT;
        jeVar.f22244B = str;
        return jeVar;
    }

    /* renamed from: a */
    public final void mo34739a(int i) {
        synchronized (this.f64177e) {
            this.f64176c.mo25444a("NotificationPresenter", i);
        }
    }

    /* renamed from: a */
    public final void mo34740a(PendingIntent pendingIntent) {
        C1096iz izVar = new C1096iz(qkj.m32287a(this.f64175b, C0126R.C0127drawable.quantum_ic_portable_wifi_off_grey600_24), this.f64175b.getString(C0126R.string.common_disconnect), pendingIntent);
        Context context = this.f64175b;
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent().setClassName(context, "com.google.android.gms.auth.proximity.multidevice.SettingsActivity"), 134217728);
        String string = this.f64175b.getString(C0126R.string.magictether_providing_internet_content);
        C1102je a = mo34738a(true, "mt-notification-connected-channel-id");
        a.mo13640e(this.f64175b.getString(C0126R.string.magictether_providing_internet_title));
        a.mo13632b(string);
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(string);
        a.mo13626a(jdVar);
        a.mo13639d(string);
        a.mo13633b(true);
        a.mo13627a(false);
        a.f22254f = activity;
        a.mo13624a(izVar.mo13508a());
        mo34741a(this.f64176c, a.mo13629b(), 3);
    }

    /* renamed from: a */
    public final void mo34741a(sex sex, Notification notification, int i) {
        synchronized (this.f64177e) {
            sex.mo25445a("NotificationPresenter", i, notification);
        }
    }
}
