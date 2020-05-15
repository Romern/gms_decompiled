package p000;

import android.net.wifi.WifiConfiguration;
import java.util.UUID;

/* renamed from: afca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afca {

    /* renamed from: a */
    public final afby f64165a;

    /* renamed from: b */
    public final aezv f64166b = new aezv("com.google.android.gms.magictether.client.CONFIG_HELPER_PREFERENCE_FILE", rpr.m34216b());

    static {
        new sek(new String[]{"WifiApConfigHelper"}, (int[]) null);
    }

    public afca(afby afby) {
        this.f64165a = afby;
    }

    /* renamed from: c */
    public static final String m52828c() {
        String uuid = UUID.randomUUID().toString();
        String valueOf = String.valueOf(uuid.substring(0, 8));
        String valueOf2 = String.valueOf(uuid.substring(9, 13));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public final boolean mo34735a() {
        WifiConfiguration a = this.f64165a.mo34730a();
        if (!(a == null || a.SSID == null || a.preSharedKey == null)) {
            Object[] objArr = {a.SSID, this.f64166b.mo34696c()};
            if (!a.SSID.equals(this.f64166b.mo34696c()) || !a.preSharedKey.equals(this.f64166b.mo34693b("com.google.android.gms.magictether.GENERATED_PASSWORD"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo34736b() {
        String b = this.f64166b.mo34693b("com.google.android.gms.magictether.SSID");
        String b2 = this.f64166b.mo34693b("com.google.android.gms.magictether.PASSWORD");
        int a = this.f64166b.mo34688a("com.google.android.gms.magictether.AUTH_TYPE");
        this.f64166b.f64056b.edit().remove("com.google.android.gms.magictether.SSID").remove("com.google.android.gms.magictether.PASSWORD").remove("com.google.android.gms.magictether.AUTH_TYPE").commit();
        if (b != null && mo34735a()) {
            WifiConfiguration a2 = this.f64165a.mo34730a();
            a2.SSID = b;
            a2.preSharedKey = b2;
            a2.allowedKeyManagement.clear();
            a2.allowedKeyManagement.set(a);
            this.f64165a.mo34731a(a2);
        }
    }
}
