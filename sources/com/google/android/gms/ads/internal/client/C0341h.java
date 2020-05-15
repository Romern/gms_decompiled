package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.config.C0364h;
import com.google.android.gms.ads.internal.config.C0365i;
import com.google.android.gms.ads.internal.config.C0369m;
import com.google.android.gms.ads.internal.formats.client.C0420g;
import com.google.android.gms.ads.internal.formats.client.C0421h;
import com.google.android.gms.ads.internal.overlay.client.C0521a;
import com.google.android.gms.ads.internal.reward.client.C0577d;
import com.google.android.gms.ads.internal.util.client.C0626a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Random;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.internal.client.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0341h {

    /* renamed from: a */
    private static final C0341h f8159a = new C0341h();

    /* renamed from: b */
    private final C0626a f8160b;

    /* renamed from: c */
    private final String f8161c;

    /* renamed from: d */
    private final C0364h f8162d;

    /* renamed from: e */
    private final C0365i f8163e;

    /* renamed from: f */
    private final C0369m f8164f;

    protected C0341h() {
        C0626a aVar = new C0626a();
        new C0338e();
        new C0337d();
        new C0352s();
        new C0420g();
        new C0577d();
        new C0521a();
        new C0421h();
        C0364h hVar = new C0364h();
        C0365i iVar = new C0365i();
        C0369m mVar = new C0369m();
        String b = C0626a.m5638b();
        new VersionInfoParcel(0, 201515000);
        new Random();
        new WeakHashMap();
        this.f8160b = aVar;
        this.f8162d = hVar;
        this.f8163e = iVar;
        this.f8164f = mVar;
        this.f8161c = b;
    }

    /* renamed from: a */
    public static C0626a m5274a() {
        return f8159a.f8160b;
    }

    /* renamed from: b */
    public static C0364h m5275b() {
        return f8159a.f8162d;
    }

    /* renamed from: c */
    public static C0369m m5276c() {
        return f8159a.f8164f;
    }

    /* renamed from: d */
    public static String m5277d() {
        return f8159a.f8161c;
    }

    /* renamed from: e */
    public static void m5278e() {
        C0365i iVar = f8159a.f8163e;
    }
}
