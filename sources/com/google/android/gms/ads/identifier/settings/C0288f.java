package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.security.MessageDigest;
import java.util.UUID;

/* renamed from: com.google.android.gms.ads.identifier.settings.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0288f {

    /* renamed from: a */
    private static final String f8026a = VersionInfoParcel.m5635a().f8949a;

    /* renamed from: b */
    private static final String f8027b = UUID.randomUUID().toString();

    /* renamed from: a */
    private static void m5212a(Context context, Bundle bundle) {
        bundle.putString("cl", "306758586");
        bundle.putString("r_cl", "HEAD");
        bundle.putString("session", f8027b);
        C0387d.m5363a().mo6853a(context, f8026a, "event-attestation", bundle);
    }

    /* renamed from: b */
    static void m5217b(Context context, String str, String str2) {
        if (cbvp.m128521h()) {
            Bundle bundle = new Bundle();
            bundle.putString("info_type", str);
            bundle.putString("info_detail", str2);
            m5212a(context, bundle);
        }
    }

    /* renamed from: a */
    static void m5213a(Context context, String str, String str2) {
        if (cbvp.m128521h()) {
            Bundle bundle = new Bundle();
            bundle.putString("error_type", str);
            bundle.putString("error_detail", str2);
            m5212a(context, bundle);
        }
    }

    /* renamed from: a */
    static void m5214a(Context context, String str, String str2, long j) {
        if (cbvp.m128521h()) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", str);
            bundle.putString("latency", Long.toString(j));
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("status", str2);
            }
            m5212a(context, bundle);
        }
    }

    /* renamed from: a */
    public static void m5215a(Context context, String str, Throwable th) {
        String str2;
        if (cbvp.m128521h()) {
            if (th != null) {
                str2 = Log.getStackTraceString(th);
            } else {
                str2 = "NULL_EXCEPTION";
            }
            Bundle bundle = new Bundle();
            bundle.putString("error_type", str);
            bundle.putString("exception", str2);
            m5212a(context, bundle);
        }
    }

    /* renamed from: a */
    static byte[] m5216a(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(bArr);
        return instance.digest();
    }
}
