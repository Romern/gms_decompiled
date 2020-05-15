package com.google.android.gms.mdm.receivers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiStateChangedReceiver extends aacn {

    /* renamed from: a */
    private final apys f80052a;

    static {
        WifiStateChangedReceiver.class.getSimpleName();
    }

    public WifiStateChangedReceiver() {
        super("security-wifi-state-changed");
        if (apys.f85179a == null) {
            apys.f85179a = new apys();
        }
        this.f80052a = apys.f85179a;
    }

    /* renamed from: a */
    private static boolean m67201a(int i) {
        return i == 3 || i == 2;
    }

    /* renamed from: b */
    private static boolean m67203b(int i) {
        return i == 1 || i == 0;
    }

    /* renamed from: a */
    private static byte[] m67202a(Context context, String str) {
        byte[] bArr = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            long j = packageManager.getPackageInfo(str, 0).lastUpdateTime;
            bArr = apyw.m71203a(str, j);
            if (bArr == null) {
                bArr = apuh.m71026a(new File(packageManager.getApplicationInfo(str, 0).publicSourceDir));
                bxvd da = aqdw.f85807d.mo74144da();
                bxtx a = bxtx.m123261a(bArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aqdw aqdw = (aqdw) da.f164949b;
                a.getClass();
                int i = aqdw.f85809a | 1;
                aqdw.f85809a = i;
                aqdw.f85810b = a;
                aqdw.f85809a = i | 2;
                aqdw.f85811c = j;
                aqdw aqdw2 = (aqdw) da.mo74062i();
                if (!apyw.f85197a.containsKey(str)) {
                    if (apyw.f85197a.size() == 100) {
                        apyw.f85197a.remove((String) apyw.f85197a.keySet().iterator().next());
                    }
                    apyw.f85197a.put(str, aqdw2);
                } else {
                    apyw.f85197a.put(str, aqdw2);
                }
            }
        } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
        }
        return bArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String str;
        String str2;
        bnkd bnkd;
        boolean z;
        bxvd bxvd;
        String str3;
        Context context2 = context;
        Intent intent2 = intent;
        if (intent2 == null) {
            return;
        }
        if (!"android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
            return;
        }
        if (!cgkt.m145937i()) {
            return;
        }
        if (new apgy(context2).mo47201a()) {
            int intExtra = intent2.getIntExtra("wifi_state", 4);
            int intExtra2 = intent2.getIntExtra("previous_wifi_state", 4);
            boolean b = m67203b(intExtra);
            boolean b2 = m67203b(intExtra2);
            boolean a = m67201a(intExtra);
            if (!m67201a(intExtra2) || !b) {
                if (!b2) {
                    return;
                }
                if (!a) {
                    return;
                }
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
            int i = Build.VERSION.SDK_INT;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return;
            }
            if (networkCapabilities.hasCapability(12)) {
                long currentTimeMillis = System.currentTimeMillis();
                SystemClock.sleep(Math.min(cgkt.f187180a.mo6606a().mo84026ab(), 60000L));
                List a2 = agad.m53795a(context2, currentTimeMillis);
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                String simOperator = telephonyManager.getSimOperator();
                boolean z2 = false;
                if (simOperator == null) {
                    str2 = null;
                    str = null;
                } else if (!simOperator.isEmpty()) {
                    str = simOperator.substring(0, 3);
                    str2 = simOperator.substring(3);
                } else {
                    str2 = null;
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                long j = currentTimeMillis - 300000;
                int i2 = Build.VERSION.SDK_INT;
                try {
                    new aqec(AppOpsManager.class);
                    bnkd = new aqea(context2).mo47766a(j);
                } catch (Exception e) {
                    bnkd = null;
                }
                int size = a2.size();
                int i3 = 0;
                while (i3 < size) {
                    agad agad = (agad) a2.get(i3);
                    String str4 = agad.f65054b;
                    if (bnkd != null) {
                        List<aqdz> a3 = bnkd.mo67124a(str4);
                        if (a3 != null) {
                            bxvd bxvd2 = null;
                            for (aqdz aqdz : a3) {
                                Integer num = aqdz.f85831a;
                                if (num == null || num.intValue() != 71) {
                                    z = false;
                                } else {
                                    bxvd da = aqdy.f85813k.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = z;
                                    }
                                    aqdy aqdy = (aqdy) da.f164949b;
                                    str4.getClass();
                                    int i4 = aqdy.f85815a | 1;
                                    aqdy.f85815a = i4;
                                    aqdy.f85816b = str4;
                                    aqdy.f85815a = i4 | 32;
                                    aqdy.f85821g = true;
                                    bxvd2 = da;
                                    z = false;
                                }
                            }
                            bxvd = bxvd2;
                        } else {
                            bxvd = null;
                        }
                    } else {
                        bxvd = aqdy.f85813k.mo74144da();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        aqdy aqdy2 = (aqdy) bxvd.f164949b;
                        str4.getClass();
                        int i5 = aqdy2.f85815a | 1;
                        aqdy2.f85815a = i5;
                        aqdy2.f85816b = str4;
                        aqdy2.f85815a = i5 | 32;
                        aqdy2.f85821g = false;
                    }
                    if (bxvd != null) {
                        String str5 = agad.f65054b;
                        if (cgkt.f187180a.mo6606a().mo84037l()) {
                            str3 = agad.f65055c;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            if (str3.contains("wap")) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                aqdy aqdy3 = (aqdy) bxvd.f164949b;
                                aqdy aqdy4 = aqdy.f85813k;
                                aqdy3.f85815a |= 512;
                                aqdy3.f85824j = true;
                            }
                            int i6 = Build.VERSION.SDK_INT;
                            String meid = telephonyManager.getMeid();
                            String imei = telephonyManager.getImei();
                            if (meid != null && bmwb.m108444b(str3).contains(bmwb.m108444b(meid))) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                aqdy.m71415a((aqdy) bxvd.f164949b);
                            }
                            if (imei != null && bmwb.m108444b(str3).contains(bmwb.m108444b(imei))) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                aqdy.m71415a((aqdy) bxvd.f164949b);
                            }
                        }
                        if (!a) {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            aqdy aqdy5 = (aqdy) bxvd.f164949b;
                            aqdy aqdy6 = aqdy.f85813k;
                            aqdy5.f85818d = 2;
                            aqdy5.f85815a |= 4;
                        } else {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            aqdy aqdy7 = (aqdy) bxvd.f164949b;
                            aqdy aqdy8 = aqdy.f85813k;
                            aqdy7.f85818d = 1;
                            aqdy7.f85815a |= 4;
                        }
                        byte[] a4 = m67202a(context2, str5);
                        if (a4 != null) {
                            bxtx a5 = bxtx.m123261a(a4);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            aqdy aqdy9 = (aqdy) bxvd.f164949b;
                            a5.getClass();
                            aqdy9.f85815a |= 2;
                            aqdy9.f85817c = a5;
                        }
                        if (str != null) {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            aqdy aqdy10 = (aqdy) bxvd.f164949b;
                            str.getClass();
                            aqdy10.f85815a |= 8;
                            aqdy10.f85819e = str;
                            if (str3 != null && str3.contains(str)) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                aqdy aqdy11 = (aqdy) bxvd.f164949b;
                                aqdy11.f85815a |= 64;
                                aqdy11.f85822h = true;
                            }
                        }
                        if (str2 != null) {
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            aqdy aqdy12 = (aqdy) bxvd.f164949b;
                            str2.getClass();
                            aqdy12.f85815a |= 16;
                            aqdy12.f85820f = str2;
                            if (str3 != null) {
                                if (str3.contains(str2)) {
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    aqdy aqdy13 = (aqdy) bxvd.f164949b;
                                    aqdy13.f85815a |= 128;
                                    aqdy13.f85823i = true;
                                }
                            }
                        }
                        arrayList.add((aqdy) bxvd.mo74062i());
                    }
                    i3++;
                    z2 = false;
                }
                if (!arrayList.isEmpty()) {
                    apys apys = this.f80052a;
                    if (cgkt.m145937i()) {
                        apys.f85181c.execute(new apyr(apys, arrayList));
                    }
                }
            }
        }
    }
}
