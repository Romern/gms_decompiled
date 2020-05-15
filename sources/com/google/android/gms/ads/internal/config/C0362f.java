package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.util.C0616an;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.config.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0362f {

    /* renamed from: a */
    public final int f8166a;

    /* renamed from: b */
    public final String f8167b;

    /* renamed from: c */
    public final Object f8168c;

    public C0362f(int i, String str, Object obj) {
        this.f8166a = i;
        this.f8167b = str;
        this.f8168c = obj;
        C0341h.m5275b().f8171a.add(this);
    }

    /* renamed from: a */
    public static C0362f m5314a(int i, String str, Boolean bool) {
        return new C0357a(i, str, bool);
    }

    /* renamed from: b */
    public static void m5319b(String str) {
        C0341h.m5275b().f8173c.add(m5317a(str, (String) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo6598a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    public abstract Object mo6599a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo6600a(JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo6601a(SharedPreferences.Editor editor, Object obj);

    /* renamed from: a */
    public abstract void mo6602a(SharedPreferences.Editor editor, String str);

    /* renamed from: a */
    public abstract void mo6603a(JSONObject jSONObject, String str);

    /* renamed from: a */
    public static C0362f m5315a(String str, int i) {
        return new C0358b(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static C0362f m5316a(String str, long j) {
        return new C0359c(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static C0362f m5317a(String str, String str2) {
        return new C0361e(str, str2);
    }

    /* renamed from: a */
    public static void m5318a(String str) {
        new C0360d(str, Float.valueOf(0.0f));
    }

    /* renamed from: a */
    public final Object mo6604a() {
        C0369m c = C0341h.m5276c();
        if (!c.f8179b.block(5000)) {
            synchronized (c.f8178a) {
                if (!c.f8181d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!c.f8180c || c.f8182e == null) {
            synchronized (c.f8178a) {
                if (c.f8180c) {
                    if (c.f8182e == null) {
                    }
                }
                Object obj = this.f8168c;
                return obj;
            }
        }
        int i = this.f8166a;
        if (i == 2) {
            Bundle bundle = c.f8183f;
            if (bundle == null) {
                return this.f8168c;
            }
            return mo6599a(bundle);
        } else if (i == 1 && c.f8185h.has(this.f8167b)) {
            return mo6600a(c.f8185h);
        } else {
            return C0616an.m5620a(new C0366j(c, this));
        }
    }
}
