package p000;

import android.telephony.TelephonyManager;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Activity;
import java.util.regex.Pattern;

/* renamed from: akxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akxg implements akww {

    /* renamed from: a */
    private final Activity f73049a;

    /* renamed from: b */
    private final akxf f73050b;

    /* renamed from: c */
    private final TelephonyManager f73051c = ((TelephonyManager) this.f73049a.getSystemService("phone"));

    /* JADX WARN: Type inference failed for: r2v0, types: [akxf, com.google.android.chimera.Activity], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akxg(Activity r2) {
        this.f73049a = r2;
        sdo.m34974b(true);
        this.f73050b = r2;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocTelephony", new akzu(Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82556n())), Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82555m()))), cfrc.m142649c());
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public String getPhoneNumber() {
        if (this.f73051c == null) {
            return null;
        }
        int a = sfr.f44142a.mo25481a("android.permission.READ_PHONE_STATE");
        int a2 = sfr.f44142a.mo25481a("android.permission.READ_SMS");
        if (a == 0 || a2 == 0) {
            return this.f73051c.getLine1Number();
        }
        return null;
    }

    @JavascriptInterface
    public String getSimCountryIso() {
        TelephonyManager telephonyManager = this.f73051c;
        if (telephonyManager != null) {
            return telephonyManager.getSimCountryIso();
        }
        return null;
    }

    @JavascriptInterface
    public int getSimState() {
        TelephonyManager telephonyManager = this.f73051c;
        if (telephonyManager != null) {
            return telephonyManager.getSimState();
        }
        return 0;
    }

    @JavascriptInterface
    public boolean hasPhoneNumber() {
        return !stm.m36302d(getPhoneNumber());
    }

    @JavascriptInterface
    public boolean hasTelephony() {
        TelephonyManager telephonyManager = this.f73051c;
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0) ? false : true;
    }

    @JavascriptInterface
    public void listenForSmsCodes() {
        this.f73050b.mo39953a();
    }

    @JavascriptInterface
    public void stopListeningForSmsCodes() {
        this.f73050b.mo39954b();
    }
}
