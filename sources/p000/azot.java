package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: azot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azot {
    /* renamed from: a */
    static cbmr m85960a(bxvd bxvd, String str, String str2, String str3) {
        bxvd e = bxvd.clone();
        if (((cbmr) bxvd.f164949b).f177671a.isEmpty() && !TextUtils.isEmpty(str) && str.equals(str2)) {
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            cbmr cbmr = cbmr.f177669c;
            str3.getClass();
            ((cbmr) e.f164949b).f177671a = str3;
        }
        return (cbmr) e.mo74062i();
    }

    /* renamed from: b */
    public static beat m85967b(String str, String str2) {
        beao a = beao.m91670a();
        try {
            beat a2 = a.mo58483a(str, str2);
            if (a.mo58492b(a2)) {
                return a2;
            }
            Object[] objArr = {str, str2};
            return null;
        } catch (bean e) {
            azoj.m85931a("PhoneUtils", e, "PhoneUtils", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    static cbmr m85970c(Context context, TelephonyManager telephonyManager) {
        byte[] d = m85972d(context, telephonyManager);
        String a = m85961a(context, telephonyManager);
        bxvd da = cbmr.f177669c.mo74144da();
        if (d != null) {
            ByteString a2 = ByteString.m123261a(d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((cbmr) da.f164949b).f177672b = a2;
        }
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((cbmr) da.f164949b).f177671a = a;
        }
        return (cbmr) da.mo74062i();
    }

    /* renamed from: d */
    public static byte[] m85972d(Context context, TelephonyManager telephonyManager) {
        if (!azos.m85959b(context)) {
            return null;
        }
        try {
            String subscriberId = telephonyManager.getSubscriberId();
            if (!TextUtils.isEmpty(subscriberId)) {
                return azoh.m85915a(subscriberId, (int) cfdz.f183675a.mo6606a().mo80873a());
            }
            return null;
        } catch (SecurityException e) {
            azoj.m85931a("PhoneUtils", e, "No READ_PHONE_STATE permission", new Object[0]);
            azph.m85998a(context).mo55126a(663, 35);
            return null;
        }
    }

    /* renamed from: e */
    public static String m85973e(Context context, TelephonyManager telephonyManager) {
        if (azos.m85959b(context)) {
            try {
                String simSerialNumber = telephonyManager.getSimSerialNumber();
                if (!TextUtils.isEmpty(simSerialNumber)) {
                    return simSerialNumber.toLowerCase(Locale.US);
                }
                return null;
            } catch (SecurityException e) {
                azoj.m85931a("PhoneUtils", e, "No READ_PHONE_STATE permission", new Object[0]);
                azph.m85998a(context).mo55126a(663, 35);
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m85974f(Context context, TelephonyManager telephonyManager) {
        new Object[1][0] = Integer.valueOf(telephonyManager.getPhoneType());
        if (cfeo.f183719a.mo6606a().mo81050cb()) {
            return true;
        }
        if (telephonyManager.getPhoneType() != 0) {
            int i = Build.VERSION.SDK_INT;
            if (telephonyManager.isVoiceCapable()) {
                if (cfec.m138765b() && cfeo.f183719a.mo6606a().mo81076e()) {
                    List b = azoe.m85910b(context);
                    if (!b.isEmpty() && b.get(0) != null) {
                        return true;
                    }
                }
                if (telephonyManager.getSimState() != 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m85968b(Context context, TelephonyManager telephonyManager) {
        if (!azos.m85958a(context, "android.permission.READ_PHONE_STATE") && !azos.m85958a(context, "android.permission.READ_SMS")) {
            return null;
        }
        try {
            return telephonyManager.getLine1Number();
        } catch (SecurityException e) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m85969b(TelephonyManager telephonyManager) {
        String c = m85971c(telephonyManager);
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (!TextUtils.isEmpty(networkCountryIso)) {
            return networkCountryIso.toUpperCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: a */
    public static String m85961a(Context context, TelephonyManager telephonyManager) {
        String b = m85968b(context, telephonyManager);
        if (!TextUtils.isEmpty(b)) {
            return m85965a(b, m85963a(telephonyManager));
        }
        return null;
    }

    /* renamed from: a */
    public static String m85962a(Context context, String str) {
        return m85964a(str, (TelephonyManager) context.getSystemService("phone"));
    }

    /* renamed from: c */
    private static String m85971c(TelephonyManager telephonyManager) {
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (!TextUtils.isEmpty(simCountryIso)) {
            return simCountryIso.toUpperCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: a */
    public static String m85963a(TelephonyManager telephonyManager) {
        String c = m85971c(telephonyManager);
        if (c != null) {
            return c;
        }
        String country = Locale.getDefault().getCountry();
        if (!TextUtils.isEmpty(country)) {
            return country.toUpperCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: a */
    public static String m85964a(String str, TelephonyManager telephonyManager) {
        String a = m85963a(telephonyManager);
        if (TextUtils.isEmpty(str) || str.replaceAll("\\D", "").length() < 6) {
            return str;
        }
        beao a2 = beao.m91670a();
        int b = a2.mo58491b(a);
        try {
            beat a3 = a2.mo58483a(str, a);
            int i = 2;
            if (b > 0 && a3.f106841a == b) {
                i = 3;
            }
            return C1211nd.m19661a().mo15492a(a2.mo58486a(a3, i), C1220nm.f26744a);
        } catch (bean e) {
            azoj.m85931a("PhoneUtils", e, "Exception trying to parse phone number", new Object[0]);
            return str;
        }
    }

    /* renamed from: a */
    public static String m85965a(String str, String str2) {
        beao a = beao.m91670a();
        beat b = m85967b(str, str2);
        if (b != null) {
            return a.mo58486a(b, 1);
        }
        return null;
    }

    /* renamed from: a */
    public static cbmr[] m85966a(Context context, TelephonyManager telephonyManager, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (SubscriptionManager.from(context).getActiveSubscriptionInfoCount() > 1) {
                for (SubscriptionInfo subscriptionInfo : SubscriptionManager.from(context).getActiveSubscriptionInfoList()) {
                    int i3 = Build.VERSION.SDK_INT;
                    TelephonyManager createForSubscriptionId = telephonyManager.createForSubscriptionId(subscriptionInfo.getSubscriptionId());
                    cbmr c = m85970c(context, createForSubscriptionId);
                    bxvd bxvd = (bxvd) c.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) c);
                    cbmr a = m85960a(bxvd, m85973e(context, createForSubscriptionId), str, str2);
                    bxvd bxvd2 = (bxvd) a.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) a);
                    if (!((cbmr) bxvd2.f164949b).f177672b.mo73779j() || !((cbmr) bxvd2.f164949b).f177671a.isEmpty()) {
                        arrayList.add((cbmr) bxvd2.mo74062i());
                    }
                }
            } else {
                cbmr c2 = m85970c(context, telephonyManager);
                bxvd bxvd3 = (bxvd) c2.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) c2);
                cbmr a2 = m85960a(bxvd3, m85973e(context, telephonyManager), str, str2);
                bxvd bxvd4 = (bxvd) a2.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) a2);
                if (!((cbmr) bxvd4.f164949b).f177672b.mo73779j() || !((cbmr) bxvd4.f164949b).f177671a.isEmpty()) {
                    arrayList.add((cbmr) bxvd4.mo74062i());
                }
            }
        } catch (SecurityException e) {
            azoj.m85931a("PhoneUtils", e, "No READ_PHONE_STATE permission", new Object[0]);
            azph.m85998a(context).mo55126a(663, 35);
        }
        cbmr[] cbmrArr = new cbmr[arrayList.size()];
        int size = arrayList.size();
        int i4 = 0;
        while (i < size) {
            cbmrArr[i4] = (cbmr) arrayList.get(i);
            i++;
            i4++;
        }
        return cbmrArr;
    }
}
