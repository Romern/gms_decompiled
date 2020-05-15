package p000;

import android.content.Context;
import com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver;

/* renamed from: bgto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgto {

    /* renamed from: a */
    public final bgyf f117500a;

    /* renamed from: b */
    public final bgvf f117501b;

    /* renamed from: c */
    public final Context f117502c;

    /* renamed from: d */
    public String f117503d;

    /* renamed from: e */
    public String f117504e;

    /* renamed from: f */
    public HomeWorkNearbyAlertsHelper$NearbyAlertReceiver f117505f;

    /* renamed from: g */
    public boolean f117506g;

    /* renamed from: h */
    public final bgtn f117507h;

    /* renamed from: i */
    public bgxf f117508i;

    public bgto(Context context, bgyf bgyf, bgtn bgtn, bgvf bgvf) {
        this.f117502c = context;
        this.f117500a = bgyf;
        this.f117507h = bgtn;
        this.f117501b = bgvf;
    }

    /* renamed from: b */
    public static final boolean m99923b() {
        return chcs.m148236h() || chcs.m148237i();
    }

    /* renamed from: a */
    public final void mo63157a() {
        if (this.f117506g) {
            HomeWorkNearbyAlertsHelper$NearbyAlertReceiver homeWorkNearbyAlertsHelper$NearbyAlertReceiver = this.f117505f;
            if (homeWorkNearbyAlertsHelper$NearbyAlertReceiver != null) {
                this.f117502c.unregisterReceiver(homeWorkNearbyAlertsHelper$NearbyAlertReceiver);
                this.f117505f = null;
            }
            bgvf bgvf = this.f117501b;
            bgvf.f117630a.execute(new bgvc(bgvf, bgzo.m100471b(this.f117502c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE")));
            bgyf bgyf = this.f117500a;
            bgyf.f118017i = false;
            bgyf.f118018j = false;
            this.f117506g = false;
        }
    }
}
