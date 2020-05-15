package com.google.android.gms.wallet.dynamite.logging;

import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.wallet.dynamite.logging.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1675a {

    /* renamed from: a */
    public static final Charset f110131a = Charset.forName("UTF-8");

    /* renamed from: b */
    public final String f110132b;

    /* renamed from: c */
    public final String f110133c;

    /* renamed from: d */
    public final long f110134d;

    /* renamed from: e */
    public final long f110135e;

    public C1675a(String str, String str2, long j, long j2) {
        this.f110132b = str;
        this.f110133c = str2;
        this.f110134d = j;
        this.f110135e = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* renamed from: a */
    public static C1675a m93928a(String str) {
        String str2;
        String str3;
        String[] split = str.split("/");
        if (split.length <= 2) {
            return null;
        }
        String str4 = split[0];
        if (str4.startsWith("UTF8-BASE64-TRACE:")) {
            try {
                str2 = new String(Base64.decode(str4.substring(18), 10), f110131a);
            } catch (Exception e) {
                Log.e("CrashBin", "Failed to decode encoded trace.");
            }
            long b = m93929b(split[1]);
            long b2 = m93929b(split[2]);
            if (split.length <= 3) {
                str3 = split[3];
            } else {
                str3 = null;
            }
            return new C1675a(str2, str3, b, b2);
        }
        str2 = str4.replaceAll("@", "\n");
        long b3 = m93929b(split[1]);
        long b22 = m93929b(split[2]);
        if (split.length <= 3) {
        }
        return new C1675a(str2, str3, b3, b22);
    }

    /* renamed from: b */
    private static long m93929b(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
