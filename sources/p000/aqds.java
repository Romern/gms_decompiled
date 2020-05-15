package p000;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.security.snet.SnetChimeraService;
import com.google.android.gms.security.snet.SnetLaunchChimeraIntentService;
import com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;

/* renamed from: aqds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqds implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SnetChimeraService f85786a;

    public aqds(SnetChimeraService snetChimeraService) {
        this.f85786a = snetChimeraService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027b, code lost:
        if (r1.mo47711a(new p000.apyx(r2), r3) == false) goto L_0x027f;
     */
    public final void run() {
        SnetChimeraService snetChimeraService;
        apyq apyq;
        try {
            this.f85786a.mo58940a();
            cgkr.m145927c();
            if (!this.f85786a.f107563c.mo47201a() && !cgkt.m145938j()) {
                this.f85786a.mo58941a(5);
                this.f85786a.mo58942a(true);
                return;
            }
            String str = null;
            int intExtra = this.f85786a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
            if (intExtra != 1) {
                if (!(intExtra == 2 || intExtra == 4)) {
                    this.f85786a.mo58941a(6);
                    this.f85786a.mo58942a(true);
                    return;
                }
            }
            if (((PowerManager) this.f85786a.getSystemService("power")).isScreenOn()) {
                this.f85786a.mo58941a(9);
                this.f85786a.mo58942a(true);
                return;
            }
            if (!cgkt.m145951w() || cgkt.m145946r()) {
                SnetChimeraService snetChimeraService2 = this.f85786a;
                String str2 = snetChimeraService2.f107568h;
                apuh.m71025a();
                boolean z = false;
                if (cgkt.f187180a.mo6606a().mo84023Z()) {
                    apyk apyk = new apyk(snetChimeraService2);
                    try {
                        if (new aqgt((ConnectivityManager) snetChimeraService2.getSystemService("connectivity")).mo47877a()) {
                            long j = apyk.f85143a.getLong("snet_last_snet_flags_update_ms", 0);
                            long currentTimeMillis = System.currentTimeMillis();
                            long j2 = !"googler".equals(cgkt.m145932d()) ? 518400000 : 86400000;
                            if (currentTimeMillis >= j + j2) {
                                File file = new File(snetChimeraService2.f107562b.f85201b, "installed/snet_flags");
                                if (file.exists()) {
                                    if (currentTimeMillis < file.lastModified() + j2) {
                                        str = apyk.mo47698a();
                                    }
                                }
                                apyk.mo47701a("snet_last_snet_flags_update_ms", currentTimeMillis);
                                byte[] a = apum.m71049a(!"googler".equals(cgkt.m145932d()) ? "https://www.gstatic.com/android/snet/snet.flags" : "https://www.gstatic.com/android/snet/snet_goog.flags", 0, snetChimeraService2);
                                if (a != null) {
                                    if (snetChimeraService2.f107562b.mo47713a(a, "download/metadata_flags", "download/snet_flags")) {
                                        File file2 = new File(snetChimeraService2.f107562b.f85201b, "download/snet_flags");
                                        apyy apyy = snetChimeraService2.f107562b;
                                        if (apyy.mo47715b(new File(apyy.f85201b, "download/metadata_flags"), file2)) {
                                            snetChimeraService2.f107569i = SnetChimeraService.m92421a(file2);
                                            String string = snetChimeraService2.f107569i.getString("url");
                                            int i = snetChimeraService2.f107569i.getInt("percent");
                                            snetChimeraService2.f107562b.mo47712a("download/metadata_flags", "installed/metadata_flags", "download/snet_flags", "installed/snet_flags");
                                            if (string != null) {
                                                if (i != 0) {
                                                    UUID fromString = UUID.fromString(str2);
                                                    long mostSignificantBits = fromString.getMostSignificantBits() ^ fromString.getLeastSignificantBits();
                                                    if ((Math.abs(((int) (mostSignificantBits >> 32)) ^ ((int) mostSignificantBits)) % 100) + 1 > i) {
                                                        str = apyk.mo47698a();
                                                    } else {
                                                        str = string;
                                                    }
                                                }
                                            }
                                            str = apyk.mo47698a();
                                        }
                                    }
                                    str = apyk.mo47698a();
                                } else {
                                    str = apyk.mo47698a();
                                }
                            } else {
                                str = apyk.mo47698a();
                            }
                        } else {
                            str = apyk.mo47698a();
                        }
                    } catch (Exception e) {
                        str = apyk.mo47698a();
                    }
                }
                if (str == null) {
                    str = "https://www.gstatic.com/android/snet/11142017-10002000.snet";
                }
                apyy apyy2 = this.f85786a.f107562b;
                if (!TextUtils.isEmpty(str)) {
                    if (!str.equals(apyy2.f85204e.mo47698a()) || !apyy2.mo47710a()) {
                        apyy apyy3 = this.f85786a.f107562b;
                        if (!apyy3.f85203d) {
                            if (TextUtils.isEmpty(str) || !str.startsWith("https://www.gstatic.com/android/snet/")) {
                                new aqdu(apyy3.f85200a, apyy3, apyy3.f85202c);
                                aqdu.f85794j = str;
                            }
                        }
                        byte[] a2 = apum.m71049a(str, 6145, this.f85786a);
                        if (a2 != null) {
                            this.f85786a.f107562b.mo47713a(a2, "download/metadata", "download/snet.jar");
                        }
                    }
                }
                apyy apyy4 = this.f85786a.f107562b;
                File file3 = new File(apyy4.f85201b, "download/metadata");
                File file4 = new File(apyy4.f85201b, "download/snet.jar");
                if (apyy.m71206a(file3, file4) && apyy4.mo47715b(file3, file4)) {
                    z = apyy4.mo47712a("download/metadata", "installed/metadata", "download/snet.jar", "installed/snet.jar");
                }
                if (z && !TextUtils.isEmpty(str)) {
                    this.f85786a.f107562b.f85204e.mo47702a("snet_saved_package_url", str);
                    z = true;
                }
                if (!this.f85786a.f107562b.mo47710a()) {
                    this.f85786a.mo58941a(2);
                    this.f85786a.mo58942a(true);
                    return;
                } else if (!z) {
                    apyy apyy5 = this.f85786a.f107562b;
                    File file5 = new File(apyy5.f85201b, "installed/metadata");
                    File file6 = new File(apyy5.f85201b, "installed/snet.jar");
                    if (apyy.m71206a(file5, file6)) {
                    }
                    this.f85786a.mo58941a(3);
                    this.f85786a.mo58942a(true);
                    return;
                }
            }
            aqdu.f85787c = true;
            apyq apyq2 = apyq.f85174b;
            if (!cgkt.m145930b()) {
                apyq = apyq2;
            } else {
                aqat aqat = aqat.f85474a;
                SnetChimeraService snetChimeraService3 = this.f85786a;
                apyq apyq3 = apyq.f85174b;
                synchronized (aqat.f85475b) {
                    try {
                        apyq3 = aqat.mo47723a(aqat.mo47724a(snetChimeraService3));
                    } catch (IOException e2) {
                    }
                }
                apyq = aqat.mo47722a(apyq3);
            }
            apyk apyk2 = new apyk(this.f85786a);
            ArrayList arrayList = new ArrayList(apyk2.f85144b.getStringSet("snet_verify_apps_api_usage", Collections.emptySet()));
            apyk2.mo47703a("snet_verify_apps_api_usage", Collections.emptySet());
            Set d = new apyk(this.f85786a).mo47707d();
            this.f85786a.mo58943b();
            SnetChimeraService snetChimeraService4 = this.f85786a;
            String str3 = snetChimeraService4.f107562b.f85201b;
            String absolutePath = new File(str3, "installed/snet.jar").getAbsolutePath();
            long b = this.f85786a.f107562b.mo47714b();
            SnetChimeraService snetChimeraService5 = this.f85786a;
            if (SnetLaunchChimeraIntentService.m92432a(snetChimeraService4, str3, absolutePath, b, snetChimeraService5.f107564d, snetChimeraService5.f107566f, snetChimeraService5.f107568h, "com.google.android.gms.security.snet.ACTION_IDLE_MODE", arrayList, apyq, d, snetChimeraService5.f107569i) != null) {
                SnetChimeraService snetChimeraService6 = this.f85786a;
                SnetWatchdogChimeraIntentService.m92440a(snetChimeraService6, snetChimeraService6.f107564d, snetChimeraService6.f107566f, snetChimeraService6.f107568h, "com.google.android.gms.security.snet.ACTION_IDLE_MODE");
            }
            snetChimeraService = this.f85786a;
            snetChimeraService.mo58942a(true);
        } catch (LinkageError e3) {
        } catch (Throwable th) {
            try {
                if (this.f85786a.f107565e != null) {
                    aqdu.m71410a(th);
                }
                snetChimeraService = this.f85786a;
            } catch (Throwable th2) {
                this.f85786a.mo58942a(true);
                throw th2;
            }
        }
    }
}
