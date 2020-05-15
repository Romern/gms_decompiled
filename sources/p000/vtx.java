package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vtx {

    /* renamed from: c */
    public final Context f49970c;

    /* renamed from: d */
    final sex f49971d;

    public vtx(Context context) {
        this.f49970c = context;
        this.f49971d = sex.m35104a(context);
    }

    /* renamed from: a */
    public static SharedPreferences m41293a(Context context) {
        return context.getApplicationContext().getSharedPreferences("driving_mode_notification_prefs", 0);
    }

    /* renamed from: b */
    public void mo28846b() {
        this.f49971d.mo25444a("car_driving_mode.default_notification_channel", mo28850g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1102je mo28848d() {
        C1102je jeVar = new C1102je(this.f49970c, "car_driving_mode.default_notification_channel");
        jeVar.mo13616a(-1);
        jeVar.f22258j = 2;
        jeVar.f22271w = this.f49970c.getResources().getColor(C0126R.color.car_light_blue_500);
        jeVar.mo13630b(qkj.m32287a(this.f49970c, C0126R.C0127drawable.quantum_gm_ic_directions_car_vd_theme_24));
        jeVar.mo13627a(true);
        return jeVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo28850g();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final SharedPreferences mo28858l() {
        return m41293a(this.f49970c);
    }

    /* renamed from: a */
    public void mo28845a() {
        mo28857a(mo28850g(), mo28848d().mo13629b());
    }

    /* renamed from: a */
    public final void mo28857a(int i, Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (this.f49971d.mo25437a("car_driving_mode.default_notification_channel") == null) {
            this.f49971d.mo25442a(new NotificationChannel("car_driving_mode.default_notification_channel", this.f49970c.getString(C0126R.string.car_driving_mode_notification_channel_name), 4));
        }
        this.f49971d.mo25445a("car_driving_mode.default_notification_channel", i, notification);
    }
}
