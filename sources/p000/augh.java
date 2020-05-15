package p000;

import android.net.Uri;
import android.os.Build;

/* renamed from: augh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class augh {

    /* renamed from: a */
    public static final Uri f91761a = Uri.parse("content://com.google.android.gms.thunderbird.config");

    /* renamed from: b */
    private static final String[] f91762b = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.READ_SMS", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_CALL_LOG"};

    /* renamed from: a */
    public static String[] m77021a() {
        int i = Build.VERSION.SDK_INT;
        return f91762b;
    }
}
