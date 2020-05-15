package p000;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: aamx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamx {

    /* renamed from: b */
    public static final long f28509b = TimeUnit.DAYS.toMillis(372);

    /* renamed from: a */
    public final C1245ok f28510a = new C1245ok();

    /* renamed from: c */
    public final int f28511c;

    /* renamed from: d */
    public final int f28512d;

    /* renamed from: e */
    public final aamw f28513e;

    /* renamed from: f */
    private final aakl f28514f;

    public aamx(int i, int i2, aakl aakl) {
        String str;
        this.f28511c = i;
        this.f28512d = i2;
        this.f28514f = aakl;
        boolean z = i != 1 ? false : true;
        if (z) {
            str = m21588d(rpr.m34216b());
        } else {
            str = null;
        }
        this.f28513e = new aamw(str, z);
    }

    /* renamed from: a */
    private static String m21585a(InetAddress inetAddress) {
        byte[] address;
        long j;
        if (inetAddress == null || (address = inetAddress.getAddress()) == null) {
            return "";
        }
        if (address.length == 16) {
            j = cecz.f182285a.mo6606a().mo78794M();
        } else {
            j = cecz.f182285a.mo6606a().mo78793L();
        }
        return Arrays.toString(Arrays.copyOf(address, (int) j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086 A[DONT_GENERATE] */
    /* renamed from: c */
    private final synchronized String m21587c(Context context) {
        String str;
        if (cecz.m136066n()) {
            if (aakb.m21381a().mo16919d().f28570s.mo17105b()) {
                if (cecz.f182285a.mo6606a().mo78829au()) {
                    str = this.f28513e.mo17077c();
                } else {
                    str = m21588d(context);
                    String c = this.f28513e.mo17077c();
                    if (cecz.m136075w()) {
                        if (m21586a(str)) {
                            if (m21586a(c)) {
                                if (!str.equals(c)) {
                                    this.f28514f.f28371a.mo16930a().mo16898a("MISMATCH");
                                }
                                this.f28514f.f28371a.mo16930a().mo16898a("MATCH");
                            }
                        }
                        if (!m21586a(str)) {
                            if (m21586a(c)) {
                            }
                            this.f28514f.f28371a.mo16930a().mo16898a("MATCH");
                        }
                        this.f28514f.f28371a.mo16930a().mo16898a("MISMATCH");
                    }
                }
                if (m21586a(str)) {
                    return null;
                }
                return str;
            }
        }
        str = m21588d(context);
        if (m21586a(str)) {
        }
    }

    /* renamed from: d */
    private final String m21588d(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo == null) {
            return null;
        }
        if (cecz.m136075w()) {
            ((beon) this.f28514f.f28371a.mo16930a().f28253b.mo6606a()).mo60861b(new Object[0]);
        }
        return connectionInfo.getSSID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17081b() {
        this.f28513e.mo17078d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17082b(Context context) {
        this.f28513e.mo17075a(m21588d(context));
    }

    /* renamed from: a */
    private static final boolean m21586a(String str) {
        return str != null && !str.equals("<unknown ssid>");
    }

    /* renamed from: a */
    public final synchronized aamv mo17079a(Context context) {
        String str;
        int i = this.f28511c;
        if (i == -1) {
            str = null;
        } else if (i == 1) {
            str = m21587c(context);
            if (cecz.f182285a.mo6606a().mo78825aq() && str == null) {
                str = m21585a(aakb.m21381a().mo16922g().mo17098f());
            }
        } else {
            str = aajg.m21347e(i) ? ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator() : m21585a(aakb.m21381a().mo16922g().mo17098f());
        }
        if (str == null) {
            return null;
        }
        if (!this.f28510a.containsKey(str)) {
            C1245ok okVar = this.f28510a;
            if (okVar.f26809h == this.f28512d) {
                okVar.remove(mo17080a());
            }
            bxvd da = aait.f28219k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aait aait = (aait) da.f164949b;
            str.getClass();
            int i2 = aait.f28221a | 1;
            aait.f28221a = i2;
            aait.f28222b = str;
            int i3 = i2 | 2;
            aait.f28221a = i3;
            aait.f28223c = -1;
            int i4 = this.f28511c;
            int i5 = i3 | 64;
            aait.f28221a = i5;
            aait.f28228h = i4;
            aait.f28221a = i5 | 128;
            aait.f28229i = -1;
            this.f28510a.put(str, new aamv(this, da));
        }
        return (aamv) this.f28510a.get(str);
    }

    /* renamed from: a */
    public final String mo17080a() {
        String str = (String) this.f28510a.mo15620b(0);
        long b = ((aamv) this.f28510a.get(str)).mo17068b();
        int i = 1;
        while (true) {
            C1245ok okVar = this.f28510a;
            if (i >= okVar.f26809h) {
                return str;
            }
            String str2 = (String) okVar.mo15620b(i);
            aamv aamv = (aamv) this.f28510a.get(str2);
            if (aamv.mo17068b() < b) {
                b = aamv.mo17068b();
                str = str2;
            }
            i++;
        }
    }
}
