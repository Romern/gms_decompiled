package p000;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: pmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmu {

    /* renamed from: a */
    public final String f39748a;

    /* renamed from: b */
    public CastDevice f39749b;

    /* renamed from: c */
    public String f39750c;

    /* renamed from: d */
    public final Map f39751d;

    /* renamed from: e */
    private final String f39752e;

    /* renamed from: f */
    private final Map f39753f;

    /* renamed from: g */
    private MdnsServiceInfo f39754g;

    /* renamed from: h */
    private final phy f39755h;

    /* renamed from: i */
    private final qav f39756i = new qav("MdnsDeviceScannerEntry");

    public pmu(String str, String str2, Map map, phy phy) {
        this.f39748a = str;
        this.f39751d = new HashMap();
        this.f39752e = str2;
        this.f39753f = map;
        this.f39755h = phy;
    }

    /* renamed from: a */
    public static String m30854a(int i) {
        return String.format(Locale.ROOT, "\"%d %s\"", Integer.valueOf(i), i != -1 ? i != 0 ? i != 1 ? i != 2 ? "Different device" : "Updated device" : "New device" : "No change" : "Invalid data");
    }

    public final String toString() {
        return String.format(Locale.ROOT, "MdnsDeviceScannerEntry(%s) %s %s", this.f39748a, this.f39749b, TextUtils.join(",", this.f39751d.keySet()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ce  */
    /* renamed from: a */
    public final int mo23441a(MdnsServiceInfo mdnsServiceInfo, long j, long j2) {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        CastDevice castDevice;
        String str3;
        WebImage a;
        this.f39754g = mdnsServiceInfo;
        String a2 = mdnsServiceInfo.mo43969a("id");
        int i4 = -1;
        if (a2 != null) {
            String str4 = this.f39754g.f80076f;
            if (TextUtils.isEmpty(str4) && cczx.m132361b()) {
                str4 = this.f39754g.f80077g;
            }
            if (!TextUtils.isEmpty(str4)) {
                try {
                    InetAddress byName = InetAddress.getByName(str4);
                    String a3 = this.f39754g.mo43969a("fn");
                    if (TextUtils.isEmpty(a3)) {
                        str = this.f39754g.f80071a;
                    } else {
                        str = a3;
                    }
                    String a4 = this.f39754g.mo43969a("md");
                    String replaceAll = !TextUtils.isEmpty(a4) ? a4.replaceAll("(Eureka|Chromekey)( Dongle)?", "Chromecast") : this.f39752e;
                    try {
                        i = Integer.parseInt(this.f39754g.mo43969a("ve"));
                    } catch (NumberFormatException e) {
                        this.f39756i.mo23675c("Invalid device version: %s", this.f39754g.mo43969a("ve"));
                        i = 0;
                    }
                    try {
                        int parseInt = Integer.parseInt(this.f39754g.mo43969a("st"));
                        if (parseInt == 0) {
                            i4 = 0;
                        } else if (parseInt == 1) {
                            i4 = 1;
                        }
                    } catch (NumberFormatException e2) {
                        this.f39756i.mo23675c("Invalid receiver status; %s", this.f39754g.mo43969a("st"));
                    }
                    try {
                        i2 = Integer.parseInt(this.f39754g.mo43969a("ca"));
                    } catch (NumberFormatException e3) {
                        this.f39756i.mo23675c("Invalid capabilities mask: %s", this.f39754g.mo43969a("ca"));
                        i2 = 0;
                    }
                    String a5 = this.f39754g.mo43969a("rs");
                    String a6 = this.f39754g.mo43969a("rm");
                    ArrayList arrayList = new ArrayList();
                    String a7 = this.f39754g.mo43969a("ic");
                    if (!TextUtils.isEmpty(a7) && (a = ptk.m31229a(a7, byName)) != null) {
                        arrayList.add(a);
                    }
                    String a8 = this.f39754g.mo43969a("nf");
                    if (a8 != null) {
                        try {
                            i3 = Integer.parseInt(a8);
                        } catch (NumberFormatException e4) {
                            this.f39756i.mo23675c("Failed to parse RCN enabled status from %s", a8);
                            i3 = 0;
                        }
                    } else {
                        i3 = 0;
                    }
                    if (!(i3 == 1 || i3 == 2)) {
                        this.f39756i.mo23675c("Invalid remote control notifications enabled status; %d", Integer.valueOf(i3));
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        i3 = (int) cday.m132439c();
                    }
                    String a9 = this.f39754g.mo43969a("bs");
                    if (cczq.m132283b()) {
                        str2 = this.f39754g.mo43969a("cd");
                    } else {
                        str2 = null;
                    }
                    pet a10 = CastDevice.m22256a(a2, byName);
                    a10.f38994b = str;
                    a10.f38995c = replaceAll;
                    a10.f38996d = String.valueOf(i);
                    a10.f38997e = this.f39754g.f80075e;
                    a10.f38999g = i2;
                    a10.f38998f = arrayList;
                    a10.f39000h = i4;
                    a10.f39001i = this.f39748a;
                    a10.f39002j = a6;
                    a10.f39003k = i3;
                    a10.f39004l = a9;
                    a10.f39005m = qat.m31759a(byName);
                    a10.f39006n = str2;
                    CastDevice a11 = a10.mo22985a();
                    CastDevice castDevice2 = this.f39749b;
                    if (castDevice2 != null) {
                        if (a11.f29715c.equals(castDevice2.f29715c)) {
                            int i5 = a11.f29719g;
                            CastDevice castDevice3 = this.f39749b;
                            if (i5 == castDevice3.f29719g && a11.f29720h == castDevice3.f29720h) {
                                if (a11.equals(castDevice3)) {
                                    z2 = false;
                                    z = false;
                                    if (!ptk.m31236a(a5, this.f39750c)) {
                                        this.f39750c = a5;
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!(mdnsServiceInfo.f80073c.isEmpty() || (castDevice = this.f39749b) == null || (str3 = castDevice.f29718f) == null)) {
                                        if (Integer.parseInt(str3) >= 4) {
                                            List a12 = mdnsServiceInfo.mo43970a();
                                            int size = a12.size();
                                            z4 = false;
                                            for (int i6 = 0; i6 < size; i6++) {
                                                String str5 = (String) a12.get(i6);
                                                if (str5.startsWith("_")) {
                                                    str5 = str5.substring(1);
                                                }
                                                String str6 = (String) this.f39753f.get(str5);
                                                if (str6 == null) {
                                                    this.f39756i.mo23670a("Unexpected subtype: %s; ignoring", str5);
                                                } else {
                                                    boolean z5 = this.f39751d.put(str6, Long.valueOf(j)) == null;
                                                    this.f39756i.mo23670a("Found matching criterion %s (subtype %s) for %s", str6, str5, this.f39749b);
                                                    if (z5 && j2 != -1) {
                                                        this.f39755h.mo23127a(this.f39749b, str6);
                                                    }
                                                    z4 |= z5;
                                                }
                                            }
                                            if (this.f39749b != null) {
                                                return 0;
                                            }
                                            if (castDevice2 == null) {
                                                return 1;
                                            }
                                            if (!z) {
                                                return (z2 || z3 || z4) ? 2 : 0;
                                            }
                                            return 3;
                                        }
                                    }
                                    z4 = false;
                                    if (this.f39749b != null) {
                                    }
                                }
                            }
                        }
                        this.f39749b = a11;
                        z2 = false;
                        z = true;
                        if (!ptk.m31236a(a5, this.f39750c)) {
                        }
                        if (Integer.parseInt(str3) >= 4) {
                        }
                        z4 = false;
                        if (this.f39749b != null) {
                        }
                    }
                    this.f39749b = a11;
                    z2 = true;
                    z = false;
                    if (!ptk.m31236a(a5, this.f39750c)) {
                    }
                    try {
                        if (Integer.parseInt(str3) >= 4) {
                        }
                        z4 = false;
                    } catch (NumberFormatException e5) {
                        z4 = false;
                    }
                    if (this.f39749b != null) {
                    }
                } catch (UnknownHostException e6) {
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final Set mo23442a() {
        return new HashSet(this.f39751d.keySet());
    }
}
