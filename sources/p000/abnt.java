package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abnt {
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03aa A[Catch:{ all -> 0x0b35, all -> 0x0b3b, all -> 0x0b23, all -> 0x0b29, all -> 0x0b17, all -> 0x0b1d, all -> 0x0b11, all -> 0x0aff, all -> 0x0b05, all -> 0x04ea, all -> 0x043b, Exception -> 0x0274, all -> 0x0b41 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03ab A[Catch:{ all -> 0x0b35, all -> 0x0b3b, all -> 0x0b23, all -> 0x0b29, all -> 0x0b17, all -> 0x0b1d, all -> 0x0b11, all -> 0x0aff, all -> 0x0b05, all -> 0x04ea, all -> 0x043b, Exception -> 0x0274, all -> 0x0b41 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03bf A[Catch:{ all -> 0x0b35, all -> 0x0b3b, all -> 0x0b23, all -> 0x0b29, all -> 0x0b17, all -> 0x0b1d, all -> 0x0b11, all -> 0x0aff, all -> 0x0b05, all -> 0x04ea, all -> 0x043b, Exception -> 0x0274, all -> 0x0b41 }] */
    /* renamed from: a */
    public static bosu m47963a(Context context, String str, int i, aboa aboa) {
        bosu bosu;
        Throwable th;
        abne a;
        Throwable th2;
        abne a2;
        Throwable th3;
        Throwable th4;
        bost bost;
        bosr[] bosrArr;
        abne a3;
        Throwable th5;
        List<SubscriptionInfo> list;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        boolean z7;
        boolean z8;
        abom abom;
        skh a4;
        char c;
        boolean z9;
        abom abom2;
        skh a5;
        String str2;
        Context context2 = context;
        aboa aboa2 = aboa;
        abne a6 = abne.m47947a("BUILD_NETWORK_OBSERVATION_EXTENSION");
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            eoa.m10828c("Herrevad", "No source package sent.  Not logging this event.", new Object[0]);
            bosu = null;
        } else {
            int i5 = i;
            if (i5 == -1) {
                i5 = abob.m47970a(context);
            }
            bxvd da = bosu.f134668af.mo74144da();
            abne a7 = abne.m47947a("APPEND_INFO_FOR_CONNECTIVITY_TYPE");
            try {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bosu bosu2 = (bosu) da.f164949b;
                bosu2.f134696a |= 128;
                bosu2.f134710j = i5;
                boolean z11 = true;
                if (i5 == -1) {
                    m47966b(context2, da);
                    z11 = true;
                } else if (i5 == 0) {
                    m47966b(context2, da);
                    z11 = true;
                } else if (i5 == 1) {
                    if (aboa2 == null || (str2 = aboa2.f57764f) == null || aboa2.f57765g == null || abob.m47980c(str2)) {
                        z11 = false;
                    } else {
                        String a8 = abob.m47973a(aboa2.f57765g);
                        String a9 = abob.m47974a(aboa2.f57764f, aboa2.f57765g);
                        bxvd da2 = bort.f134503m.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bort bort = (bort) da2.f164949b;
                        a9.getClass();
                        int i6 = bort.f134505a | 1;
                        bort.f134505a = i6;
                        bort.f134506b = a9;
                        String str3 = aboa2.f57764f;
                        str3.getClass();
                        int i7 = i6 | 4;
                        bort.f134505a = i7;
                        bort.f134508d = str3;
                        a8.getClass();
                        bort.f134505a = i7 | 2;
                        bort.f134507c = a8;
                        int b = abob.m47976b(aboa2.f57765g);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bort bort2 = (bort) da2.f164949b;
                        int i8 = bort2.f134505a | 2048;
                        bort2.f134505a = i8;
                        bort2.f134516l = b;
                        bort2.f134505a = i8 | 8;
                        bort2.f134509e = false;
                        if (abmm.m47918b("hasValidCaptivePortalData") && a9.equals(abmm.m47920c())) {
                            boolean b2 = abmm.m47918b("lastApIsCaptivePortal");
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bort bort3 = (bort) da2.f164949b;
                            bort3.f134505a |= 32;
                            bort3.f134511g = b2;
                        }
                        int intValue = aboa2.f57762d.intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu3 = (bosu) da.f164949b;
                        bosu3.f134696a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bosu3.f134711k = intValue;
                        Integer num = aboa2.f57759a;
                        if (num != null) {
                            int intValue2 = num.intValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bosu bosu4 = (bosu) da.f164949b;
                            bosu4.f134702b |= 8;
                            bosu4.f134677H = intValue2;
                        }
                        if (aboa2.f57760b != 0) {
                            bxvd da3 = borw.f134518d.mo74144da();
                            int a10 = borv.m111488a(aboa2.f57760b);
                            if (a10 != 0) {
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                borw borw = (borw) da3.f164949b;
                                borw.f134521b = a10 - 1;
                                borw.f134520a |= 1;
                            }
                            boolean z12 = aboa2.f57761c;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            borw borw2 = (borw) da3.f164949b;
                            borw2.f134520a |= 2;
                            borw2.f134522c = z12;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bort bort4 = (bort) da2.f164949b;
                            borw borw3 = (borw) da3.mo74062i();
                            borw3.getClass();
                            bort4.f134513i = borw3;
                            bort4.f134505a |= 128;
                        }
                        Integer num2 = aboa2.f57763e;
                        if (num2 != null) {
                            int intValue3 = num2.intValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bort bort5 = (bort) da2.f164949b;
                            bort5.f134505a |= 512;
                            bort5.f134514j = intValue3;
                        }
                        int intValue4 = aboa2.f57766h.intValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bort bort6 = (bort) da2.f164949b;
                        bort6.f134505a |= 16;
                        bort6.f134510f = intValue4;
                        if (abob.m47970a(context) == 1) {
                            boolean e = abob.m47983e(context);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bort bort7 = (bort) da2.f164949b;
                            bort7.f134505a |= 64;
                            bort7.f134512h = e;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu5 = (bosu) da.f164949b;
                        bort bort8 = (bort) da2.mo74062i();
                        bort8.getClass();
                        bosu5.f134709i = bort8;
                        bosu5.f134696a |= 64;
                        z11 = true;
                    }
                }
                a7.close();
                if (!z11) {
                    da = null;
                }
                if (da != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosu bosu6 = (bosu) da.f164949b;
                    str.getClass();
                    bosu6.f134696a |= 1;
                    bosu6.f134704d = str;
                    String a11 = spn.m35848a(context, str);
                    if (a11 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu7 = (bosu) da.f164949b;
                        a11.getClass();
                        bosu7.f134696a |= 4;
                        bosu7.f134705e = a11;
                    }
                    int b3 = spn.m35864b(context, str);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosu bosu8 = (bosu) da.f164949b;
                    bosu8.f134696a |= 8;
                    bosu8.f134706f = b3;
                    try {
                        int i9 = ModuleManager.get(context).getCurrentModule().moduleVersion;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu9 = (bosu) da.f164949b;
                        bosu9.f134696a |= 16;
                        bosu9.f134707g = i9;
                    } catch (IllegalStateException e2) {
                        eoa.m10829d("Herrevad", "unable to get chimera module info, context is probably an Application context.  That's not allowed.", new Object[0]);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu10 = (bosu) da.f164949b;
                        bosu10.f134696a |= 16;
                        bosu10.f134707g = -1;
                    }
                    long a12 = abnj.m47955a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosu bosu11 = (bosu) da.f164949b;
                    bosu11.f134702b |= 2;
                    bosu11.f134675F = a12;
                    if (i5 == 1) {
                        long a13 = abnj.m47955a();
                        String str4 = aboa2.f57764f;
                        String str5 = aboa2.f57765g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 20 + String.valueOf(str5).length());
                        sb.append(a13);
                        sb.append(str4);
                        sb.append(str5);
                        long a14 = abni.m47952a(sb.toString(), 8);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu12 = (bosu) da.f164949b;
                        bosu12.f134702b |= 2;
                        bosu12.f134675F = a14;
                    }
                    m47964a(context2, da);
                    boolean i10 = spn.m35898i(context);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosu bosu13 = (bosu) da.f164949b;
                    bosu13.f134702b |= 2097152;
                    bosu13.f134687R = i10;
                    if (cekh.f182840a.mo6606a().mo79224c()) {
                        int i11 = Build.VERSION.SDK_INT;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                        int i12 = Build.VERSION.SDK_INT;
                        try {
                            Network[] allNetworks = connectivityManager.getAllNetworks();
                            if (allNetworks != null) {
                                int length = allNetworks.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    try {
                                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i13]);
                                        if (networkInfo != null) {
                                            if (networkInfo.getType() == 17 && networkInfo.isConnected()) {
                                                z7 = true;
                                                break;
                                            }
                                        }
                                    } catch (NullPointerException e3) {
                                        eoa.m10824a("Herrevad", "Failed getting network info. %s", e3.getMessage());
                                    }
                                    i13++;
                                }
                                if (!da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bosu bosu14 = (bosu) da.f164949b;
                                bosu14.f134702b |= 1048576;
                                bosu14.f134686Q = z7;
                                if (z7) {
                                    if (cekw.f182871a.mo6606a().mo79248a()) {
                                        int i14 = Build.VERSION.SDK_INT;
                                        if (!abon.m48007a(context)) {
                                            int i15 = eoa.f15378a;
                                            c = 2;
                                        } else {
                                            Intent b4 = abon.m48009b(context);
                                            if (b4 != null) {
                                                abom2 = new abom();
                                                try {
                                                    if (!skh.m35531a().mo25690a(context2, b4, abom2, 1)) {
                                                        eoa.m10824a("Herrevad", "GCS won't be enabled (couldn't bind with %s)", b4);
                                                        a5 = skh.m35531a();
                                                        a5.mo25689a(context2, abom2);
                                                        c = 0;
                                                    } else {
                                                        try {
                                                            abom2.mo32247a(cekh.m137058b());
                                                            dcn dcn = abom2.f57800a;
                                                            if (dcn == null) {
                                                                eoa.m10824a("Herrevad", "GcsService is null", new Object[0]);
                                                                a5 = skh.m35531a();
                                                                a5.mo25689a(context2, abom2);
                                                                c = 0;
                                                            } else {
                                                                if (!dcn.mo8534a().getBoolean("isChellVpnActive")) {
                                                                    c = 2;
                                                                } else {
                                                                    c = 1;
                                                                }
                                                                skh.m35531a().mo25689a(context2, abom2);
                                                            }
                                                        } catch (InterruptedException e4) {
                                                            a5 = skh.m35531a();
                                                        }
                                                    }
                                                } catch (RemoteException e5) {
                                                    eoa.m10824a("Herrevad", "GcsConnection failure: %s", e5.getMessage());
                                                    abmm.m47921c(abon.m48008a(context2, b4));
                                                    a5 = skh.m35531a();
                                                }
                                            } else {
                                                int i16 = eoa.f15378a;
                                                c = 0;
                                            }
                                        }
                                        if (c != 0) {
                                            if (c == 1) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bosu bosu15 = (bosu) da.f164949b;
                                            bosu15.f134702b = 524288 | bosu15.f134702b;
                                            bosu15.f134685P = z9;
                                        }
                                    } else {
                                        int i17 = Build.VERSION.SDK_INT;
                                        if (!abon.m48007a(context)) {
                                            int i18 = eoa.f15378a;
                                            z8 = false;
                                        } else {
                                            Intent b5 = abon.m48009b(context);
                                            if (b5 != null) {
                                                abom = new abom();
                                                try {
                                                    if (!skh.m35531a().mo25690a(context2, b5, abom, 1)) {
                                                        eoa.m10824a("Herrevad", "GCS won't be enabled (couldn't bind with %s)", b5);
                                                        a4 = skh.m35531a();
                                                        a4.mo25689a(context2, abom);
                                                        z8 = false;
                                                    } else {
                                                        abom.mo32247a(cekh.m137058b());
                                                        dcn dcn2 = abom.f57800a;
                                                        if (dcn2 == null) {
                                                            eoa.m10824a("Herrevad", "GcsService is null", new Object[0]);
                                                            a4 = skh.m35531a();
                                                            a4.mo25689a(context2, abom);
                                                            z8 = false;
                                                        } else {
                                                            z8 = dcn2.mo8534a().getBoolean("isChellVpnActive");
                                                            skh.m35531a().mo25689a(context2, abom);
                                                        }
                                                    }
                                                } catch (RemoteException e6) {
                                                    eoa.m10824a("Herrevad", "GcsConnection failure: %s", e6.getMessage());
                                                    abmm.m47921c(abon.m48008a(context2, b5));
                                                    a4 = skh.m35531a();
                                                }
                                            } else {
                                                int i19 = eoa.f15378a;
                                                z8 = false;
                                            }
                                        }
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bosu bosu16 = (bosu) da.f164949b;
                                        bosu16.f134702b = 524288 | bosu16.f134702b;
                                        bosu16.f134685P = z8;
                                    }
                                }
                            }
                            z7 = false;
                        } catch (NullPointerException e7) {
                            eoa.m10824a("Herrevad", "Failed getting all networks. %s", e7.getMessage());
                            z7 = false;
                        }
                        if (!da.f164950c) {
                        }
                        bosu bosu142 = (bosu) da.f164949b;
                        bosu142.f134702b |= 1048576;
                        bosu142.f134686Q = z7;
                        if (z7) {
                        }
                    }
                    a = abne.m47947a("GET_BATTERY_DETAILS");
                    bose a15 = abnb.m47939a(context);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosu bosu17 = (bosu) da.f164949b;
                    a15.getClass();
                    bosu17.f134695Z = a15;
                    bosu17.f134703c |= 8;
                    a.close();
                    a2 = abne.m47947a("GET_EXTRA_DEVICE_INFO");
                    bosn b6 = abob.m47978b(context);
                    if (b6 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu18 = (bosu) da.f164949b;
                        b6.getClass();
                        bosu18.f134676G = b6;
                        bosu18.f134702b |= 4;
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu19 = (bosu) da.f164949b;
                        bosu19.f134676G = null;
                        bosu19.f134702b &= -5;
                    }
                    a2.close();
                    abne a16 = abne.m47947a("GET_TELEPHONY_DATA");
                    try {
                        aboi aboi = new aboi((TelephonyManager) context2.getSystemService("phone"));
                        if (!cekn.m137072c()) {
                            bxvd da4 = bost.f134657j.mo74144da();
                            int callState = aboi.f57789a.getCallState();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost2 = (bost) da4.f164949b;
                            bost2.f134659a |= 1;
                            bost2.f134660b = callState;
                            int i20 = Build.VERSION.SDK_INT;
                            boolean b7 = aboi.mo32236b();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost3 = (bost) da4.f164949b;
                            bost3.f134659a |= 2;
                            bost3.f134661c = b7;
                            int dataActivity = aboi.f57789a.getDataActivity();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost4 = (bost) da4.f164949b;
                            bost4.f134659a |= 4;
                            bost4.f134662d = dataActivity;
                            int i21 = Build.VERSION.SDK_INT;
                            boolean c2 = aboi.mo32237c();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost5 = (bost) da4.f164949b;
                            bost5.f134659a |= 8;
                            bost5.f134663e = c2;
                            int dataState = aboi.f57789a.getDataState();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost6 = (bost) da4.f164949b;
                            bost6.f134659a |= 16;
                            bost6.f134664f = dataState;
                            int i22 = Build.VERSION.SDK_INT;
                            int dataNetworkType = aboi.f57789a.getDataNetworkType();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost7 = (bost) da4.f164949b;
                            bost7.f134659a |= 32;
                            bost7.f134665g = dataNetworkType;
                            int i23 = Build.VERSION.SDK_INT;
                            boss a17 = aboi.mo32235a();
                            if (a17 != null) {
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bost bost8 = (bost) da4.f164949b;
                                a17.getClass();
                                bost8.f134666h = a17;
                                bost8.f134659a |= 64;
                            }
                            int i24 = Build.VERSION.SDK_INT;
                            int d = aboi.mo32238d();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bost bost9 = (bost) da4.f164949b;
                            bost9.f134659a |= 128;
                            bost9.f134667i = d;
                            bost = (bost) da4.mo74062i();
                        } else {
                            bxvd da5 = bost.f134657j.mo74144da();
                            abol abol = aboj.f57790a;
                            if (abol.mo32244a()) {
                                synchronized (abol.f57799h) {
                                    i2 = abol.f57797f ? abol.f57793b : -1;
                                }
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost10 = (bost) da5.f164949b;
                                bost10.f134659a |= 1;
                                bost10.f134660b = i2;
                                synchronized (abol.f57799h) {
                                    i3 = abol.f57797f ? abol.f57794c : -1;
                                }
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost11 = (bost) da5.f164949b;
                                bost11.f134659a |= 4;
                                bost11.f134662d = i3;
                                synchronized (abol.f57799h) {
                                    i4 = abol.f57797f ? abol.f57795d : -1;
                                }
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost12 = (bost) da5.f164949b;
                                bost12.f134659a |= 16;
                                bost12.f134664f = i4;
                                int c3 = abol.mo32246c();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost13 = (bost) da5.f164949b;
                                bost13.f134659a |= 32;
                                bost13.f134665g = c3;
                                if (abol.mo32245b() != null) {
                                    boss b8 = abol.mo32245b();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bost bost14 = (bost) da5.f164949b;
                                    b8.getClass();
                                    bost14.f134666h = b8;
                                    bost14.f134659a |= 64;
                                }
                            } else {
                                int callState2 = aboi.f57789a.getCallState();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost15 = (bost) da5.f164949b;
                                bost15.f134659a |= 1;
                                bost15.f134660b = callState2;
                                int dataActivity2 = aboi.f57789a.getDataActivity();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost16 = (bost) da5.f164949b;
                                bost16.f134659a |= 4;
                                bost16.f134662d = dataActivity2;
                                int i25 = Build.VERSION.SDK_INT;
                                boolean c4 = aboi.mo32237c();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost17 = (bost) da5.f164949b;
                                bost17.f134659a |= 8;
                                bost17.f134663e = c4;
                                int dataState2 = aboi.f57789a.getDataState();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost18 = (bost) da5.f164949b;
                                bost18.f134659a |= 16;
                                bost18.f134664f = dataState2;
                                int i26 = Build.VERSION.SDK_INT;
                                int dataNetworkType2 = aboi.f57789a.getDataNetworkType();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bost bost19 = (bost) da5.f164949b;
                                bost19.f134659a |= 32;
                                bost19.f134665g = dataNetworkType2;
                                int i27 = Build.VERSION.SDK_INT;
                                boss a18 = aboi.mo32235a();
                                if (a18 != null) {
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bost bost20 = (bost) da5.f164949b;
                                    a18.getClass();
                                    bost20.f134666h = a18;
                                    bost20.f134659a |= 64;
                                }
                            }
                            int i28 = Build.VERSION.SDK_INT;
                            boolean b9 = aboi.mo32236b();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bost bost21 = (bost) da5.f164949b;
                            bost21.f134659a |= 2;
                            bost21.f134661c = b9;
                            int i29 = Build.VERSION.SDK_INT;
                            int d2 = aboi.mo32238d();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bost bost22 = (bost) da5.f164949b;
                            bost22.f134659a |= 128;
                            bost22.f134667i = d2;
                            bost = (bost) da5.mo74062i();
                        }
                        if (bost != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bosu bosu20 = (bosu) da.f164949b;
                            bost.getClass();
                            bosu20.f134698ab = bost;
                            bosu20.f134703c |= 16;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bosu bosu21 = (bosu) da.f164949b;
                            bosu21.f134698ab = null;
                            bosu21.f134703c &= -17;
                        }
                        a16.close();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((bosu) da.f164949b).f134699ac = bxvk.m124030de();
                        aboh aboh = new aboh(rpr.m34216b());
                        int i30 = Build.VERSION.SDK_INT;
                        SubscriptionManager subscriptionManager = (SubscriptionManager) aboh.f57788a.getSystemService("telephony_subscription_service");
                        if (subscriptionManager == null) {
                            eoa.m10828c("Herrevad", "SubscriptionManager is null", new Object[0]);
                            bosrArr = new bosr[0];
                        } else {
                            if (cele.m137150b()) {
                                int i31 = Build.VERSION.SDK_INT;
                                list = subscriptionManager.getAvailableSubscriptionInfoList();
                            } else {
                                list = subscriptionManager.getActiveSubscriptionInfoList();
                            }
                            if (list == null || list.isEmpty()) {
                                bosrArr = new bosr[0];
                            } else {
                                int i32 = Build.VERSION.SDK_INT;
                                int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
                                int defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
                                int defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
                                if (cele.m137150b()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (SubscriptionInfo subscriptionInfo : list) {
                                        if (subscriptionInfo.getSimSlotIndex() >= 0) {
                                            bxvd da6 = bosr.f134643f.mo74144da();
                                            int subscriptionId = subscriptionInfo.getSubscriptionId();
                                            int i33 = Build.VERSION.SDK_INT;
                                            if (subscriptionId == defaultDataSubscriptionId) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            bosr bosr = (bosr) da6.f164949b;
                                            int i34 = bosr.f134645a | 1;
                                            bosr.f134645a = i34;
                                            bosr.f134646b = z4;
                                            if (subscriptionId == defaultSmsSubscriptionId) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            int i35 = i34 | 2;
                                            bosr.f134645a = i35;
                                            bosr.f134647c = z5;
                                            if (subscriptionId == defaultVoiceSubscriptionId) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            bosr.f134645a = i35 | 4;
                                            bosr.f134648d = z6;
                                            bxvd da7 = bosq.f134637e.mo74144da();
                                            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                                            if (da7.f164950c) {
                                                da7.mo74035c();
                                                da7.f164950c = false;
                                            }
                                            bosq bosq = (bosq) da7.f164949b;
                                            bosq.f134639a |= 1;
                                            bosq.f134640b = simSlotIndex;
                                            int i36 = Build.VERSION.SDK_INT;
                                            boolean isEmbedded = subscriptionInfo.isEmbedded();
                                            if (da7.f164950c) {
                                                da7.mo74035c();
                                                da7.f164950c = false;
                                            }
                                            bosq bosq2 = (bosq) da7.f164949b;
                                            bosq2.f134639a |= 2;
                                            bosq2.f134641c = isEmbedded;
                                            int i37 = Build.VERSION.SDK_INT;
                                            boolean isOpportunistic = subscriptionInfo.isOpportunistic();
                                            if (da7.f164950c) {
                                                da7.mo74035c();
                                                da7.f164950c = false;
                                            }
                                            bosq bosq3 = (bosq) da7.f164949b;
                                            bosq3.f134639a |= 4;
                                            bosq3.f134642d = isOpportunistic;
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            bosr bosr2 = (bosr) da6.f164949b;
                                            bosq bosq4 = (bosq) da7.mo74062i();
                                            bosq4.getClass();
                                            bosr2.f134649e = bosq4;
                                            bosr2.f134645a |= 8;
                                            arrayList.add((bosr) da6.mo74062i());
                                        }
                                    }
                                    bosrArr = (bosr[]) arrayList.toArray(new bosr[arrayList.size()]);
                                } else {
                                    bosr[] bosrArr2 = new bosr[list.size()];
                                    int i38 = 0;
                                    while (i38 < list.size()) {
                                        bxvd da8 = bosr.f134643f.mo74144da();
                                        SubscriptionInfo subscriptionInfo2 = list.get(i38);
                                        int subscriptionId2 = subscriptionInfo2.getSubscriptionId();
                                        bxvd da9 = bosq.f134637e.mo74144da();
                                        int simSlotIndex2 = subscriptionInfo2.getSimSlotIndex();
                                        if (da9.f164950c) {
                                            da9.mo74035c();
                                            da9.f164950c = z10;
                                        }
                                        bosq bosq5 = (bosq) da9.f164949b;
                                        bosq5.f134639a |= 1;
                                        bosq5.f134640b = simSlotIndex2;
                                        if (da8.f164950c) {
                                            da8.mo74035c();
                                            da8.f164950c = false;
                                        }
                                        bosr bosr3 = (bosr) da8.f164949b;
                                        bosq bosq6 = (bosq) da9.mo74062i();
                                        bosq6.getClass();
                                        bosr3.f134649e = bosq6;
                                        bosr3.f134645a |= 8;
                                        int i39 = Build.VERSION.SDK_INT;
                                        if (subscriptionId2 == defaultDataSubscriptionId) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (da8.f164950c) {
                                            da8.mo74035c();
                                            da8.f164950c = false;
                                        }
                                        bosr bosr4 = (bosr) da8.f164949b;
                                        int i40 = bosr4.f134645a | 1;
                                        bosr4.f134645a = i40;
                                        bosr4.f134646b = z;
                                        if (subscriptionId2 == defaultSmsSubscriptionId) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i41 = i40 | 2;
                                        bosr4.f134645a = i41;
                                        bosr4.f134647c = z2;
                                        if (subscriptionId2 == defaultVoiceSubscriptionId) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        bosr4.f134645a = i41 | 4;
                                        bosr4.f134648d = z3;
                                        bosrArr2[i38] = (bosr) da8.mo74062i();
                                        i38++;
                                        z10 = false;
                                    }
                                    bosrArr = bosrArr2;
                                }
                            }
                        }
                        List asList = Arrays.asList(bosrArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosu bosu22 = (bosu) da.f164949b;
                        if (!bosu22.f134699ac.mo73666a()) {
                            bosu22.f134699ac = bxvk.m124021a(bosu22.f134699ac);
                        }
                        bxsy.m123078a(asList, bosu22.f134699ac);
                        a3 = abne.m47947a("GET_CONNECTIVITY_DATA");
                        bosm a19 = abnf.m47948a(context).mo32222a();
                        if (a19 != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bosu bosu23 = (bosu) da.f164949b;
                            a19.getClass();
                            bosu23.f134700ad = a19;
                            bosu23.f134703c |= 32;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bosu bosu24 = (bosu) da.f164949b;
                            bosu24.f134700ad = null;
                            bosu24.f134703c &= -33;
                        }
                        a3.close();
                        bosu = (bosu) da.mo74062i();
                    } catch (Throwable th6) {
                        th4 = th6;
                        a16.close();
                        throw th4;
                    }
                } else {
                    bosu = null;
                }
            } catch (Exception e8) {
                eoa.m10828c("Herrevad", "Package name not recognized after it was verified", new Object[0]);
            } catch (Throwable th7) {
                Throwable th8 = th7;
                try {
                    a6.close();
                } catch (Throwable th9) {
                    bqye.m113761a(th8, th9);
                }
                throw th8;
            }
        }
        a6.close();
        return bosu;
        throw th;
        throw th3;
        throw th5;
        throw th2;
    }

    /* renamed from: b */
    private static void m47966b(Context context, bxvd bxvd) {
        abnx d = abob.m47981d(context);
        int i = d.f57753d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu = (bosu) bxvd.f164949b;
        bosu bosu2 = bosu.f134668af;
        bosu.f134696a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bosu.f134711k = i;
        int i2 = d.f57754e;
        int i3 = bosu.f134702b | 8388608;
        bosu.f134702b = i3;
        bosu.f134689T = i2;
        boso boso = d.f57752c;
        boso.getClass();
        bosu.f134692W = boso;
        int i4 = 536870912 | i3;
        bosu.f134702b = i4;
        int i5 = d.f57755f;
        bosu.f134702b = i4 | Integer.MIN_VALUE;
        bosu.f134693X = i5;
        int i6 = d.f57756g;
        boolean z = true;
        bosu.f134703c |= 1;
        bosu.f134694Y = i6;
        bosu.f134697aa = bxvk.m124030de();
        borm borm = d.f57750a;
        bxvd bxvd2 = (bxvd) borm.mo74142c(5);
        bxvd2.mo73625a((bxvk) borm);
        int i7 = Build.VERSION.SDK_INT;
        if (Settings.Global.getInt(context.getContentResolver(), "mobile_data", 1) != 1) {
            z = false;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        borm borm2 = (borm) bxvd2.f164949b;
        borm borm3 = borm.f134436t;
        borm2.f134438a |= 2048;
        borm2.f134449l = z;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu3 = (bosu) bxvd.f164949b;
        borm borm4 = (borm) bxvd2.mo74062i();
        borm4.getClass();
        bosu3.f134708h = borm4;
        bosu3.f134696a |= 32;
        borm[] bormArr = d.f57751b;
        if (bormArr != null && bormArr.length > 0) {
            List asList = Arrays.asList(bormArr);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu4 = (bosu) bxvd.f164949b;
            if (!bosu4.f134697aa.mo73666a()) {
                bosu4.f134697aa = bxvk.m124021a(bosu4.f134697aa);
            }
            bxsy.m123078a(asList, bosu4.f134697aa);
        }
    }

    /* renamed from: a */
    static void m47964a(Context context, bxvd bxvd) {
        bosc bosc;
        Location location = null;
        if (celh.f182898a.mo6606a().mo79272c()) {
            if (!cekn.m137071b()) {
                bory a = abmy.m47934a();
                if (a != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bosu bosu = (bosu) bxvd.f164949b;
                    bosu bosu2 = bosu.f134668af;
                    a.getClass();
                    bosu.f134672C = a;
                    bosu.f134696a |= 536870912;
                } else {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bosu bosu3 = (bosu) bxvd.f164949b;
                    bosu bosu4 = bosu.f134668af;
                    bosu3.f134672C = null;
                    bosu3.f134696a &= -536870913;
                }
            } else {
                sdo.m34973b("Must not call getActivityRecognition() from main thread");
                int i = eoa.f15378a;
                abnd.m47941a().mo54075a("init");
                aucb k = abmy.m47936b().mo24754k();
                k.mo50373a(new abmv(bxvd));
                k.mo50372a(new abmw(bxvd));
            }
        }
        if (cekz.m137120c()) {
            abno abno = abnm.f57737a;
            synchronized (abno.f57739a) {
                if (abno.f57741c != -1) {
                    bxvd da = bosc.f134554e.mo74144da();
                    int i2 = abno.f57740b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosc bosc2 = (bosc) da.f164949b;
                    int i3 = bosc2.f134556a | 1;
                    bosc2.f134556a = i3;
                    bosc2.f134557b = i2;
                    int i4 = abno.f57742d;
                    int i5 = i4 - 1;
                    if (i4 != 0) {
                        bosc2.f134556a = i3 | 2;
                        bosc2.f134558c = i5;
                        long elapsedRealtime = SystemClock.elapsedRealtime() - abno.f57741c;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bosc bosc3 = (bosc) da.f164949b;
                        bosc3.f134556a |= 4;
                        bosc3.f134559d = elapsedRealtime;
                        bosc = (bosc) da.mo74062i();
                    } else {
                        throw null;
                    }
                } else {
                    int i6 = eoa.f15378a;
                    bosc = null;
                }
            }
            if (bosc == null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bosu bosu5 = (bosu) bxvd.f164949b;
                bosu bosu6 = bosu.f134668af;
                bosu5.f134701ae = null;
                bosu5.f134703c &= -257;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bosu bosu7 = (bosu) bxvd.f164949b;
                bosu bosu8 = bosu.f134668af;
                bosc.getClass();
                bosu7.f134701ae = bosc;
                bosu7.f134703c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }
        if (!aeri.m52437b(context)) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu9 = (bosu) bxvd.f164949b;
            bosu bosu10 = bosu.f134668af;
            bosu9.f134684O = 9;
            bosu9.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        } else if (cekn.m137071b()) {
            abnd.m47941a().mo54078b("init");
            aucb l = aeie.m51878c(context).mo24756l();
            l.mo50373a(new abnr(bxvd));
            l.mo50372a(new abns(bxvd));
        } else {
            try {
                location = (Location) aucu.m76783a(aeie.m51878c(context).mo24756l(), celh.f182898a.mo6606a().mo79273d(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException e) {
            } catch (TimeoutException e2) {
                abnd.m47943a("LOCATION_SERVICES_TIMEOUT");
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu11 = (bosu) bxvd.f164949b;
            bosu bosu12 = bosu.f134668af;
            bosu11.f134684O = 7;
            bosu11.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            if (location == null) {
                abnd.m47943a("LOCATION_SERVICES_NO_RESPONSE");
                return;
            }
            int i7 = Build.VERSION.SDK_INT;
            m47965a(location, bxvd, SystemClock.elapsedRealtimeNanos());
        }
    }

    /* renamed from: a */
    static void m47965a(Location location, bxvd bxvd, long j) {
        int i = Build.VERSION.SDK_INT;
        double elapsedRealtimeNanos = (double) (j - location.getElapsedRealtimeNanos());
        Double.isNaN(elapsedRealtimeNanos);
        long round = Math.round(elapsedRealtimeNanos / 1.0E9d);
        int round2 = (int) Math.round(location.getLatitude() * 1000000.0d);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu = (bosu) bxvd.f164949b;
        bosu bosu2 = bosu.f134668af;
        bosu.f134696a |= 1024;
        bosu.f134712l = round2;
        int round3 = (int) Math.round(location.getLongitude() * 1000000.0d);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu3 = (bosu) bxvd.f164949b;
        int i2 = bosu3.f134696a | 2048;
        bosu3.f134696a = i2;
        bosu3.f134713m = round3;
        bosu3.f134696a = i2 | 8192;
        bosu3.f134715o = (int) round;
        if (location.hasAccuracy()) {
            int round4 = Math.round(location.getAccuracy());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu4 = (bosu) bxvd.f164949b;
            int i3 = bosu4.f134696a | 4096;
            bosu4.f134696a = i3;
            bosu4.f134714n = round4;
            bosu4.f134696a = 2097152 | i3;
            bosu4.f134722v = true;
        }
        if (location.hasSpeed()) {
            double speed = (double) location.getSpeed();
            Double.isNaN(speed);
            int round5 = (int) Math.round(speed * 10.0d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu5 = (bosu) bxvd.f164949b;
            int i4 = bosu5.f134696a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bosu5.f134696a = i4;
            bosu5.f134718r = round5;
            bosu5.f134696a = 16777216 | i4;
            bosu5.f134725y = true;
        }
        if (location.hasBearing()) {
            double bearing = (double) location.getBearing();
            Double.isNaN(bearing);
            int round6 = (int) Math.round(bearing * 100.0d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu6 = (bosu) bxvd.f164949b;
            int i5 = bosu6.f134696a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bosu6.f134696a = i5;
            bosu6.f134719s = round6;
            bosu6.f134696a = 33554432 | i5;
            bosu6.f134726z = true;
        }
        if (location.hasAltitude()) {
            int altitude = (int) location.getAltitude();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu7 = (bosu) bxvd.f164949b;
            int i6 = bosu7.f134696a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            bosu7.f134696a = i6;
            bosu7.f134720t = altitude;
            bosu7.f134696a = 67108864 | i6;
            bosu7.f134670A = true;
        }
        if (aeim.m51904h(location)) {
            double i7 = (double) aeim.m51905i(location);
            Double.isNaN(i7);
            long round7 = Math.round(i7 * 1000.0d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu8 = (bosu) bxvd.f164949b;
            int i8 = bosu8.f134696a | 1048576;
            bosu8.f134696a = i8;
            bosu8.f134721u = round7;
            bosu8.f134696a = 268435456 | i8;
            bosu8.f134671B = true;
        }
        String b = aeim.m51893b(location);
        if (b != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu9 = (bosu) bxvd.f164949b;
            b.getClass();
            int i9 = bosu9.f134696a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bosu9.f134696a = i9;
            bosu9.f134716p = b;
            bosu9.f134696a = 4194304 | i9;
            bosu9.f134723w = true;
        }
        Integer e = aeim.m51900e(location);
        if (e != null) {
            int intValue = e.intValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu10 = (bosu) bxvd.f164949b;
            int i10 = bosu10.f134696a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            bosu10.f134696a = i10;
            bosu10.f134717q = intValue;
            bosu10.f134696a = 8388608 | i10;
            bosu10.f134724x = true;
        }
        if (aeim.m51907k(location)) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu11 = (bosu) bxvd.f164949b;
            bosu11.f134684O = 1;
            bosu11.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            return;
        }
        int j2 = aeim.m51906j(location);
        if (j2 == 1) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu12 = (bosu) bxvd.f164949b;
            bosu12.f134684O = 4;
            bosu12.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        } else if (j2 == 2) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu13 = (bosu) bxvd.f164949b;
            bosu13.f134684O = 2;
            bosu13.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        } else if (j2 != 3) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu14 = (bosu) bxvd.f164949b;
            bosu14.f134684O = 0;
            bosu14.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu15 = (bosu) bxvd.f164949b;
            bosu15.f134684O = 3;
            bosu15.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        }
    }
}
