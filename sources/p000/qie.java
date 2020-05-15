package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: qie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qie {

    /* renamed from: a */
    private static final Logger f41456a = qgn.m32143a("ConnectivityPropertiesModule");

    /* renamed from: b */
    private static final Pattern f41457b = Pattern.compile("^([0-9]{0,15})$");

    /* renamed from: c */
    private static final Pattern f41458c = Pattern.compile("^([0-9a-fA-F]{8})$");

    /* renamed from: d */
    private static final Pattern f41459d = Pattern.compile("^([0-9a-fA-F][0-9a-fA-F][:-]?){5}[0-9a-fA-F][0-9a-fA-F]$");

    /* renamed from: e */
    private static final Pattern f41460e = Pattern.compile("^(([0-9]{15})|([0-9a-fA-F]{14}))$");

    /* renamed from: a */
    static bmxv m32201a(Context context, bmxv bmxv, boolean z) {
        if (!z) {
            return bmvz.f131120a;
        }
        if (bmxv.mo66813a()) {
            return !f41460e.matcher((CharSequence) bmxv.mo66814b()).matches() ? bmvz.f131120a : bmxv;
        }
        int i = Build.VERSION.SDK_INT;
        return bmxv.m108567c(((TelephonyManager) context.getSystemService("phone")).getMeid());
    }

    /* renamed from: c */
    static bmxv m32211c(Context context) {
        String str;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return bmvz.f131120a;
        }
        String typeName = activeNetworkInfo.getTypeName();
        String subtypeName = activeNetworkInfo.getSubtypeName();
        if (!activeNetworkInfo.isRoaming()) {
            str = "";
        } else {
            str = "r";
        }
        int length = String.valueOf(typeName).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(subtypeName).length() + str.length());
        sb.append(typeName);
        sb.append(":");
        sb.append(subtypeName);
        sb.append(":");
        sb.append(str);
        return bmxv.m108566b(sb.toString());
    }

    /* renamed from: d */
    static bmxv m32213d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null ? bmxv.m108567c(activeNetworkInfo.getTypeName()) : bmvz.f131120a;
    }

    /* renamed from: e */
    static List m32215e(Context context, boolean z) {
        bmxv bmxv;
        String str;
        if (!z) {
            return bngx.m109376e();
        }
        int i = Build.VERSION.SDK_INT;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            f41456a.mo25414c("Unknown state of subscriptions on the device", new Object[0]);
            bmxv = bmvz.f131120a;
        } else if (activeSubscriptionInfoList.isEmpty()) {
            f41456a.logVerbose("No Subscription records found on the device", new Object[0]);
            bmxv = bmxv.m108566b(bngx.m109376e());
        } else {
            f41456a.logVerbose("Reading the Subscription data for each Subscription.", new Object[0]);
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            int defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
            int i4 = Build.VERSION.SDK_INT;
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            int i5 = Build.VERSION.SDK_INT;
            int defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
            ArrayList arrayList = new ArrayList();
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                bxvd da = qhu.f41418i.mo74144da();
                int subscriptionId = subscriptionInfo.getSubscriptionId();
                int i6 = Build.VERSION.SDK_INT;
                bmxv c = bmxv.m108567c(bmxx.m108579c(telephonyManager.createForSubscriptionId(subscriptionId).getSimOperator()));
                if (c.mo66813a()) {
                    String str2 = (String) c.mo66814b();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhu qhu = (qhu) da.f164949b;
                    str2.getClass();
                    qhu.f41420a |= 1;
                    qhu.f41421b = str2;
                }
                if (!TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                    String charSequence = subscriptionInfo.getCarrierName().toString();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhu qhu2 = (qhu) da.f164949b;
                    charSequence.getClass();
                    qhu2.f41420a |= 2;
                    qhu2.f41422c = charSequence;
                }
                String num = Integer.toString(subscriptionInfo.getDataRoaming());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhu qhu3 = (qhu) da.f164949b;
                num.getClass();
                qhu3.f41420a |= 4;
                qhu3.f41423d = num;
                if (subscriptionId != -1) {
                    if (subscriptionId == defaultVoiceSubscriptionId) {
                        da.mo74016a(qht.VOICE);
                    }
                    if (subscriptionId == defaultDataSubscriptionId) {
                        da.mo74016a(qht.DATA);
                    }
                    if (subscriptionId == defaultSmsSubscriptionId) {
                        da.mo74016a(qht.SMS);
                    }
                }
                int i7 = Build.VERSION.SDK_INT;
                bmxv c2 = bmxv.m108567c(bmxx.m108579c(telephonyManager.createForSubscriptionId(subscriptionId).getSubscriberId()));
                if (cdci.m132539e() && c2.mo66813a()) {
                    bmxv a = m32205a((String) c2.mo66814b());
                    if (a.mo66813a()) {
                        String str3 = (String) a.mo66814b();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu4 = (qhu) da.f164949b;
                        str3.getClass();
                        qhu4.f41420a |= 16;
                        qhu4.f41425f = str3;
                    }
                    int i8 = Build.VERSION.SDK_INT;
                    bmxv c3 = bmxv.m108567c(bmxx.m108579c(telephonyManager.createForSubscriptionId(subscriptionId).getGroupIdLevel1()));
                    if (c3.mo66813a()) {
                        String str4 = (String) c3.mo66814b();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qhu qhu5 = (qhu) da.f164949b;
                        str4.getClass();
                        qhu5.f41420a |= 32;
                        qhu5.f41426g = str4;
                    }
                }
                bmxv a2 = m32204a(c2, (int) cdci.m132548n());
                if (a2.mo66813a()) {
                    ByteString bxtx = (ByteString) a2.mo66814b();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    qhu qhu6 = (qhu) da.f164949b;
                    bxtx.getClass();
                    qhu6.f41420a |= 64;
                    qhu6.f41427h = bxtx;
                }
                arrayList.add((qhu) da.mo74062i());
            }
            bmxv = bmxv.m108566b(bngx.m109368a((Collection) arrayList));
        }
        if (bmxv.mo66813a()) {
            return (List) bmxv.mo66814b();
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
        bxvd da2 = qhu.f41418i.mo74144da();
        String simOperator = telephonyManager2.getSimOperator();
        if (!TextUtils.isEmpty(simOperator)) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhu qhu7 = (qhu) da2.f164949b;
            simOperator.getClass();
            qhu7.f41420a |= 1;
            qhu7.f41421b = simOperator;
        }
        String simOperatorName = telephonyManager2.getSimOperatorName();
        if (telephonyManager2.getSimState() == 5 && !TextUtils.isEmpty(simOperatorName)) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhu qhu8 = (qhu) da2.f164949b;
            simOperatorName.getClass();
            qhu8.f41420a |= 2;
            qhu8.f41422c = simOperatorName;
        }
        int i9 = ((qhu) da2.f164949b).f41420a;
        if ((i9 & 1) == 0 && (i9 & 2) == 0) {
            return bngx.m109376e();
        }
        if (!telephonyManager2.isNetworkRoaming()) {
            str = "0";
        } else {
            str = "1";
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qhu qhu9 = (qhu) da2.f164949b;
        str.getClass();
        qhu9.f41420a |= 4;
        qhu9.f41423d = str;
        da2.mo74016a(qht.VOICE);
        da2.mo74016a(qht.DATA);
        da2.mo74016a(qht.SMS);
        String subscriberId = telephonyManager2.getSubscriberId();
        if (cdci.m132539e()) {
            bmxv a3 = m32205a(subscriberId);
            if (a3.mo66813a()) {
                String str5 = (String) a3.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qhu qhu10 = (qhu) da2.f164949b;
                str5.getClass();
                qhu10.f41420a |= 16;
                qhu10.f41425f = str5;
            }
            int i10 = Build.VERSION.SDK_INT;
            String groupIdLevel1 = telephonyManager2.getGroupIdLevel1();
            if (!TextUtils.isEmpty(groupIdLevel1)) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qhu qhu11 = (qhu) da2.f164949b;
                groupIdLevel1.getClass();
                qhu11.f41420a |= 32;
                qhu11.f41426g = groupIdLevel1;
            }
        }
        bmxv a4 = m32204a(bmxv.m108567c(subscriberId), (int) cdci.m132548n());
        if (a4.mo66813a()) {
            ByteString bxtx2 = (ByteString) a4.mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhu qhu12 = (qhu) da2.f164949b;
            bxtx2.getClass();
            qhu12.f41420a |= 64;
            qhu12.f41427h = bxtx2;
        }
        return bngx.m109356a((qhu) da2.mo74062i());
    }

    /* renamed from: b */
    static bmxv m32208b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return bmxv.m108566b(Boolean.valueOf(((TelephonyManager) context.getSystemService("phone")).isVoiceCapable()));
    }

    /* renamed from: d */
    static bmxv m32214d(Context context, boolean z) {
        return z ? bmxv.m108567c(bmxx.m108579c(((TelephonyManager) context.getSystemService("phone")).getSimOperator())) : bmvz.f131120a;
    }

    /* renamed from: a */
    static bmxv m32202a(Context context, boolean z) {
        if (!z) {
            return bmvz.f131120a;
        }
        int i = Build.VERSION.SDK_INT;
        return !cdci.m132555u() ? bmxv.m108567c(((TelephonyManager) context.getSystemService("phone")).getDeviceId()) : bmvz.f131120a;
    }

    /* renamed from: b */
    static bmxv m32209b(Context context, boolean z) {
        if (!z) {
            return bmvz.f131120a;
        }
        if (!cdci.m132555u()) {
            return bmvz.f131120a;
        }
        int i = Build.VERSION.SDK_INT;
        return bmxv.m108567c(((TelephonyManager) context.getSystemService("phone")).getImei());
    }

    /* renamed from: c */
    static bmxv m32212c(Context context, boolean z) {
        return z ? bmxv.m108567c(bmxx.m108579c(((TelephonyManager) context.getSystemService("phone")).getNetworkOperator())) : bmvz.f131120a;
    }

    /* renamed from: b */
    static bngx m32210b(bnic bnic) {
        bngs j = bngx.m109377j();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            j.mo67668c(((qhv) a.next()).f41432c);
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    static bmxv m32203a(bmxv bmxv) {
        if (bmxv.mo66813a()) {
            return !f41458c.matcher((CharSequence) bmxv.mo66814b()).matches() ? bmvz.f131120a : bmxv;
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    private static bmxv m32204a(bmxv bmxv, int i) {
        return bmxv.mo66813a() ? bmxv.m108566b(ByteString.m123261a(azoh.m85915a((String) bmxv.mo66814b(), i))) : bmvz.f131120a;
    }

    /* renamed from: a */
    private static bmxv m32205a(String str) {
        if (TextUtils.isEmpty(str) || !f41457b.matcher(str).matches()) {
            return bmvz.f131120a;
        }
        int k = (int) cdci.m132545k();
        if (k > str.length()) {
            k = str.length();
        }
        String valueOf = String.valueOf(str.substring(0, str.length() - k));
        String valueOf2 = String.valueOf("000000000000000".substring(0, k));
        return bmxv.m108566b(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: a */
    static bngx m32206a(bnic bnic) {
        bngs j = bngx.m109377j();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            j.mo67668c(((qhv) a.next()).f41431b);
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    static bnic m32207a(Context context) {
        WifiInfo connectionInfo;
        String macAddress;
        String extraInfo;
        bnia j = bnic.m109500j();
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(9);
        if (!(networkInfo == null || (extraInfo = networkInfo.getExtraInfo()) == null || !f41459d.matcher(extraInfo).matches())) {
            String replace = extraInfo.replace(":", "").replace("-", "");
            bxvd da = qhv.f41428d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhv qhv = (qhv) da.f164949b;
            "ethernet".getClass();
            int i = qhv.f41430a | 2;
            qhv.f41430a = i;
            qhv.f41432c = "ethernet";
            replace.getClass();
            qhv.f41430a = i | 1;
            qhv.f41431b = replace;
            j.mo67629b((qhv) da.mo74062i());
        }
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (!(wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null || (macAddress = connectionInfo.getMacAddress()) == null)) {
            String replace2 = macAddress.replace(":", "");
            bxvd da2 = qhv.f41428d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qhv qhv2 = (qhv) da2.f164949b;
            "wifi".getClass();
            int i2 = qhv2.f41430a | 2;
            qhv2.f41430a = i2;
            qhv2.f41432c = "wifi";
            replace2.getClass();
            qhv2.f41430a = i2 | 1;
            qhv2.f41431b = replace2;
            j.mo67629b((qhv) da2.mo74062i());
        }
        return j.mo67751a();
    }

    /* renamed from: e */
    static boolean m32216e(Context context) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f41456a.mo25418e("READ_PHONE_STATE permission not granted, checkin would miss device information.", new Object[0]);
        }
        return z;
    }
}
