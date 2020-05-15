package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ahcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahcz extends ahcy {

    /* renamed from: a */
    public static final bnsp f67037a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: s */
    public String f67038s = null;

    public ahcz(buye buye, buqb buqb, String str, String str2, byte b, ahdj ahdj, ahdm ahdm, ahcs ahcs) {
        super(buye, buqb, str, str2, b, ahdj, ahdm, ahcs);
    }

    /* renamed from: a */
    private final void m55519a() {
        if (this.f67033o.mo36314c()) {
            try {
                if (m55502a(this.f67034p)) {
                    this.f67034p.mo36348c();
                }
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f67037a.mo68388c();
                bnsl.mo68432a("ahcz", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("TargetDevice: fail to call ConnectionListener.onTokenNeeded");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract buzk mo36290a(String str, String str2);

    /* renamed from: b */
    public final void mo36340b(String str) {
        mo36341b(this.f67038s, str);
    }

    /* renamed from: d */
    public final void mo36328d() {
        m55519a();
        this.f67033o.mo36313b();
    }

    /* renamed from: e */
    public final void mo36329e() {
        mo36337m();
        m55519a();
        this.f67033o.mo36313b();
    }

    /* renamed from: b */
    public final boolean mo36341b(String str, String str2) {
        this.f67033o.mo36312a();
        if (this.f67025g) {
            bnsl bnsl = (bnsl) f67037a.mo68388c();
            bnsl.mo68432a("ahcz", "b", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("TargetDevice: Source device is receiving");
            return false;
        }
        this.f67038s = str;
        mo36323a(mo36290a(str, str2));
        return true;
    }

    /* renamed from: a */
    public final void mo36339a(Device device, String str) {
        super.mo36334j();
        this.f67029k = device;
        this.f67038s = str;
    }

    /* renamed from: a */
    public final boolean mo36326a(Device device) {
        Device device2 = this.f67029k;
        return device2 != null && device2.f80399d.equals(device.f80399d) && device != null && mo36338n();
    }
}
