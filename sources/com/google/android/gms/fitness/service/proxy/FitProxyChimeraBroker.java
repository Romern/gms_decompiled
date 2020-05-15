package com.google.android.gms.fitness.service.proxy;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitProxyChimeraBroker extends zmb {

    /* renamed from: g */
    public static final srn f32398g = zvt.m46581a();

    /* renamed from: h */
    public static final sgj f32399h = sgj.FITNESS;

    /* renamed from: q */
    private static final long f32400q = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: i */
    public volatile zma f32401i;

    /* renamed from: j */
    public volatile zma f32402j;

    /* renamed from: k */
    public volatile zma f32403k;

    /* renamed from: l */
    public volatile zma f32404l;

    /* renamed from: m */
    public volatile zma f32405m;

    /* renamed from: n */
    public volatile zma f32406n;

    /* renamed from: o */
    public volatile zma f32407o;

    /* renamed from: p */
    public CountDownLatch f32408p;

    /* renamed from: r */
    private zob f32409r;

    /* renamed from: s */
    private zob f32410s;

    /* renamed from: t */
    private zob f32411t;

    /* renamed from: u */
    private zob f32412u;

    /* renamed from: v */
    private zob f32413v;

    /* renamed from: w */
    private zob f32414w;

    /* renamed from: x */
    private zob f32415x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19167a() {
        return f32399h.mo3214a();
    }

    /* renamed from: d */
    public final zoc mo19172d(String str) {
        sdo.m34973b("Deadlock!");
        try {
            if (this.f32408p.await(f32400q, TimeUnit.NANOSECONDS)) {
                try {
                    return new zoc(this, str, this.f32401i, this.f32402j, this.f32403k, this.f32404l, this.f32405m, this.f32406n, this.f32407o, this.f55438f);
                } catch (NullPointerException e) {
                    bnsl bnsl = (bnsl) f32398g.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker", "d", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to connect to Fit proxy broker dependency");
                    return null;
                }
            } else {
                bnsl bnsl2 = (bnsl) f32398g.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker", "d", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Proxy connections timed out");
                return null;
            }
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            if (this.f32408p.getCount() > 0) {
                bnsl bnsl3 = (bnsl) f32398g.mo68388c();
                bnsl3.mo68432a("com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker", "d", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Proxy dependencies not ready yet");
                return null;
            }
        }
    }

    public final void onDestroy() {
        zob zob = this.f32409r;
        if (zob != null) {
            zob.mo31286a();
        }
        zob zob2 = this.f32410s;
        if (zob2 != null) {
            zob2.mo31286a();
        }
        zob zob3 = this.f32411t;
        if (zob3 != null) {
            zob3.mo31286a();
        }
        zob zob4 = this.f32412u;
        if (zob4 != null) {
            zob4.mo31286a();
        }
        zob zob5 = this.f32413v;
        if (zob5 != null) {
            zob5.mo31286a();
        }
        zob zob6 = this.f32414w;
        if (zob6 != null) {
            zob6.mo31286a();
        }
        zob zob7 = this.f32415x;
        if (zob7 != null) {
            zob7.mo31286a();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zlz mo19168a(String str) {
        sdo.m34973b("Deadlock!");
        try {
            if (this.f32408p.await(f32400q, TimeUnit.NANOSECONDS)) {
                try {
                    return new zoc(this, str, this.f32401i, this.f32402j, this.f32403k, this.f32404l, this.f32405m, this.f32406n, this.f32407o, this.f55438f);
                } catch (NullPointerException e) {
                    bnsl bnsl = (bnsl) f32398g.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker", "d", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to connect to Fit proxy broker dependency");
                    return null;
                }
            } else {
                bnsl bnsl2 = (bnsl) f32398g.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker", "d", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Proxy connections timed out");
                return null;
            }
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            if (this.f32408p.getCount() > 0) {
                bnsl bnsl3 = (bnsl) f32398g.mo68388c();
                bnsl3.mo68432a("com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker", "d", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Proxy dependencies not ready yet");
                return null;
            }
        }
    }

    /* renamed from: a */
    public final void mo19171a(yzs yzs, sns sns, snr snr, ExecutorService executorService) {
        super.mo19171a(yzs, sns, snr, executorService);
        this.f32408p = new CountDownLatch(7);
        znu znu = new znu(this);
        this.f32409r = znu;
        bmxy.m108600b(znu.mo31287a("com.google.android.gms.fitness.service.recording.FitRecordingBroker"));
        znv znv = new znv(this);
        this.f32410s = znv;
        bmxy.m108600b(znv.mo31287a("com.google.android.gms.fitness.service.sessions.FitSessionsBroker"));
        znw znw = new znw(this);
        this.f32411t = znw;
        bmxy.m108600b(znw.mo31287a("com.google.android.gms.fitness.service.history.FitHistoryBroker"));
        znx znx = new znx(this);
        this.f32412u = znx;
        bmxy.m108600b(znx.mo31287a("com.google.android.gms.fitness.service.sensors.FitSensorsBroker"));
        zny zny = new zny(this);
        this.f32413v = zny;
        bmxy.m108600b(zny.mo31287a("com.google.android.gms.fitness.service.ble.FitBleBroker"));
        znz znz = new znz(this);
        this.f32414w = znz;
        bmxy.m108600b(znz.mo31287a("com.google.android.gms.fitness.service.config.FitConfigBroker"));
        zoa zoa = new zoa(this);
        this.f32415x = zoa;
        bmxy.m108600b(zoa.mo31287a("com.google.android.gms.fitness.service.internal.FitInternalBroker"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19169a(Intent intent) {
        return "com.google.android.gms.fitness.GoogleFitnessService.START".equals(intent.getAction());
    }
}
