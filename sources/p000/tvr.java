package p000;

import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: tvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvr {

    /* renamed from: a */
    public static final rtc f46738a = rtc.m34379a("deviceconnection.enable_device_feature_tracking", true);

    /* renamed from: b */
    public static final rtc f46739b = rtc.m34377a("deviceconnection.millis_feature_remains_available", (Long) 7776000000L);

    /* renamed from: c */
    public static final rtc f46740c = rtc.m34377a("deviceconnection.millis_between_feature_reaping", (Long) 86400000L);

    /* renamed from: d */
    public static final rtc f46741d = rtc.m34378a("deviceconnection.dpad_required_keys", m37534a(19, 20, 21, 22, 23));

    /* renamed from: e */
    public static final rtc f46742e = rtc.m34378a("deviceconnection.gamepad_required_keys", m37534a(96, 97, 99, 100, 102, ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 106, 107, 4, 3));

    /* renamed from: a */
    private static String m37534a(int... iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int[] m37535a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = Integer.parseInt(split[i]);
        }
        return iArr;
    }
}
