package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastPairScanner$FastPairFoundScanCallback extends aacm {

    /* renamed from: c */
    public static final /* synthetic */ int f80524c = 0;

    /* renamed from: a */
    public final ahxa f80525a;

    /* renamed from: b */
    public final AtomicInteger f80526b = new AtomicInteger(-1);

    /* renamed from: d */
    private final buqh f80527d;

    public FastPairScanner$FastPairFoundScanCallback(Context context, ahxa ahxa, buqh buqh) {
        super(context, "nearby");
        this.f80525a = ahxa;
        this.f80527d = buqh;
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        byte[] serviceData;
        if (scanResult.getScanRecord() != null && scanResult.getDevice() != null && (serviceData = scanResult.getScanRecord().getServiceData(ahzi.f68465b)) != null) {
            String a = srv.m36160a(serviceData);
            if (a.length() >= 6) {
                if (ahzi.f68464a.contains(a.substring(0, 6))) {
                    return;
                }
            }
            int i2 = this.f80526b.get();
            if (cfoj.m141538S()) {
                this.f80527d.mo72987c(new ahzg(this, "reportSighting", scanResult, i2));
            } else {
                this.f80525a.mo37253b(scanResult, i2);
            }
        }
    }
}
