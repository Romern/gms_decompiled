package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: auho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auho {

    /* renamed from: a */
    public static final C1223np f91828a = new C1223np(1);

    /* renamed from: a */
    public static long m77068a(Location location) {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    /* renamed from: b */
    public static String m77073b(String str) {
        String convertKeypadLettersToDigits = PhoneNumberUtils.convertKeypadLettersToDigits(str);
        int length = convertKeypadLettersToDigits.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = convertKeypadLettersToDigits.charAt(i);
            if (charAt == '*' || charAt == '#') {
                if (!z) {
                    if (i < length - 1) {
                        int i2 = i + 1;
                        if (convertKeypadLettersToDigits.charAt(i2) == '#') {
                            i = i2;
                        }
                    }
                    z = true;
                } else if (charAt == '#') {
                    z = false;
                }
            } else if (!z) {
                if (charAt != '+') {
                    if (charAt == ',' || charAt == ';') {
                        break;
                    }
                    int digit = Character.digit(charAt, 10);
                    if (digit != -1) {
                        sb.append(digit);
                    }
                } else if (sb.length() == 0) {
                    sb.append('+');
                }
            } else {
                continue;
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m77069a(Context context, Throwable th) {
        Log.wtf("Thunderbird", "nonfatal failure", th);
        m77074b(context, th);
    }

    /* renamed from: a */
    public static boolean m77070a() {
        return Log.isLoggable("Thunderbird", 3);
    }

    /* renamed from: a */
    public static boolean m77071a(String str) {
        return str != null && (str.contains("@") || str.contains("%40"));
    }

    /* renamed from: a */
    public static int[] m77072a(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null) {
                if (!activeSubscriptionInfoList.isEmpty()) {
                    int[] iArr = new int[activeSubscriptionInfoList.size()];
                    int i2 = 0;
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        iArr[i2] = subscriptionInfo.getSubscriptionId();
                        i2++;
                    }
                    return iArr;
                }
            }
            return new int[]{Integer.MAX_VALUE};
        } catch (SecurityException e) {
            Log.w("Thunderbird", "cannot retrieve subscription ids - lost permission", e);
            return new int[]{Integer.MAX_VALUE};
        }
    }

    /* renamed from: b */
    public static void m77074b(Context context, Throwable th) {
        wwr wwr = new wwr(context);
        wwv wwv = new wwv(th);
        wwv.f51512j = "com.google.android.gms.thunderbird";
        wwv.f51499d = "com.google.android.gms.thunderbird.CRASH_REPORT";
        wwv.mo29496b();
        wwr.mo29488b(wwv.mo29490a());
    }
}
