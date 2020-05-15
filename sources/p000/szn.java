package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: szn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szn {
    /* renamed from: a */
    private static int m36658a(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 3 ? 2 : 6;
        }
        return 5;
    }

    /* renamed from: b */
    static int m36662b(ServiceState serviceState) {
        try {
            Method declaredMethod = ServiceState.class.getDeclaredMethod("getDataRegState", new Class[0]);
            declaredMethod.setAccessible(true);
            return m36658a(((Integer) declaredMethod.invoke(serviceState, new Object[0])).intValue());
        } catch (Exception e) {
            return 2;
        }
    }

    /* renamed from: c */
    public static List m36664c(Context context) {
        List<SubscriptionInfo> list;
        ArrayList arrayList = new ArrayList();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
        if (subscriptionManager != null) {
            try {
                list = subscriptionManager.getActiveSubscriptionInfoList();
            } catch (SecurityException e) {
                list = null;
            }
            if (list != null) {
                for (SubscriptionInfo subscriptionInfo : list) {
                    arrayList.add(Integer.valueOf(subscriptionInfo.getSubscriptionId()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static int m36659a(ServiceState serviceState) {
        return m36658a(serviceState.getState());
    }

    /* renamed from: a */
    public static int m36660a(ServiceState serviceState, String str) {
        try {
            Method declaredMethod = ServiceState.class.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(serviceState, new Object[0])).intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: b */
    static boolean m36663b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "mobile_data", 1) == 1;
    }

    /* renamed from: a */
    static boolean m36661a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }
}
