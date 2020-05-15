package com.google.android.gms.cast.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastInitIntentOperation extends qlf {

    /* renamed from: a */
    static final String[] f29904a = {"com.google.android.gms.cast.service.CastPersistentService"};

    /* renamed from: b */
    static final String[] f29905b = {"CAST_ACTIVE_NETWORK_MAP", "PREF_CAST_SENDER_NONCE", "PREF_CAST_SENDER_ID"};

    /* renamed from: c */
    private final qav f29906c = new qav("CastInitIntentOperation");

    /* renamed from: a */
    private final void m22315a() {
        sex a = sex.m35104a(rpr.m34216b());
        Set<Integer> a2 = new pzz(this).mo23834a();
        if (!a2.isEmpty()) {
            this.f29906c.mo23857a("Removing %d RCNs: %s", Integer.valueOf(a2.size()), TextUtils.join(", ", a2));
            for (Integer num : a2) {
                a.mo25444a("CastRCN", num.intValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        m22315a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        pku.m30747a(getApplicationContext());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.cast.service.CastInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        for (String str : f29904a) {
            spn.m35856a((Context) this, str, true);
        }
        String[] strArr = f29905b;
        for (String str2 : strArr) {
            SharedPreferences.Editor edit = qay.m31785b(getApplicationContext()).edit();
            SharedPreferences b = qay.m31786b(getApplicationContext(), str2);
            Map<String, ?> all = b.getAll();
            for (String str3 : all.keySet()) {
                Object obj = all.get(str3);
                if (obj instanceof Boolean) {
                    edit.putBoolean(str3, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    edit.putString(str3, (String) obj);
                } else if (obj instanceof Float) {
                    edit.putFloat(str3, ((Float) obj).floatValue());
                } else if (obj instanceof Integer) {
                    edit.putInt(str3, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str3, ((Long) obj).longValue());
                } else if (obj instanceof Set) {
                    edit.putStringSet(str3, (Set) obj);
                }
            }
            edit.apply();
            b.edit().clear().apply();
        }
        m22315a();
    }
}
