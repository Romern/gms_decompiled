package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.appcontent.C0314e;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0652j implements C0649g {

    /* renamed from: a */
    public final Object f8984a = new Object();

    /* renamed from: b */
    public boolean f8985b;

    /* renamed from: c */
    public bqgg f8986c;

    /* renamed from: d */
    public C0314e f8987d;

    /* renamed from: e */
    public SharedPreferences f8988e;

    /* renamed from: f */
    public SharedPreferences.Editor f8989f;

    /* renamed from: g */
    public boolean f8990g;

    /* renamed from: h */
    public String f8991h;

    /* renamed from: i */
    public String f8992i;

    /* renamed from: j */
    public boolean f8993j;

    /* renamed from: k */
    public String f8994k;

    /* renamed from: l */
    public long f8995l;

    /* renamed from: m */
    public long f8996m;

    /* renamed from: n */
    public long f8997n;

    /* renamed from: o */
    public int f8998o;

    /* renamed from: p */
    public int f8999p;

    /* renamed from: q */
    public Set f9000q;

    /* renamed from: r */
    public JSONObject f9001r;

    /* renamed from: s */
    public boolean f9002s;

    /* renamed from: t */
    public boolean f9003t;

    /* renamed from: u */
    public String f9004u;

    /* renamed from: v */
    public int f9005v;

    public C0652j() {
        new ArrayList();
        this.f8987d = null;
        this.f8990g = true;
        this.f8993j = false;
        this.f8994k = "";
        this.f8995l = 0;
        this.f8996m = 0;
        this.f8997n = 0;
        this.f8998o = -1;
        this.f8999p = 0;
        this.f9000q = Collections.emptySet();
        this.f9001r = new JSONObject();
        this.f9002s = true;
        this.f9003t = true;
        this.f9004u = null;
        this.f9005v = -1;
    }

    /* renamed from: a */
    public final void mo6839a() {
        bqgg bqgg = this.f8986c;
        if (bqgg != null && !bqgg.isDone()) {
            try {
                this.f8986c.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C0633h.m5673d("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                C0633h.m5669b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: b */
    public final void mo6840b() {
        C0645d.f8973a.execute(new C0651i(this));
    }
}
