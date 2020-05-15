package com.google.location.nearby.direct.service;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyDirectChimeraService extends Service implements ahha {

    /* renamed from: a */
    public Handler f191777a;

    /* renamed from: b */
    private bvdx f191778b;

    /* renamed from: c */
    private buqh f191779c;

    /* renamed from: d */
    private int f191780d;

    /* renamed from: e */
    private ahgz f191781e;

    /* renamed from: a */
    public final ahgz mo7339a() {
        return this.f191781e;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bved bved;
        buwo buwo;
        buyc buyc;
        buxb buxb = (buxb) ahgz.m55755b(this, buxb.class);
        if (!(buxb == null || (buwo = buxb.f155214l) == null || (buyc = buwo.f155160g) == null)) {
            Object[] objArr = new Object[2];
            int i = buyc.f155298k;
            String a = bzal.m125582a(i);
            if (i != 0) {
                objArr[0] = a;
                objArr[1] = Long.valueOf(cfog.m141288p());
                printWriter.printf("FastPairScanner: scan mode=%s, lost millis=%s\n", objArr);
                printWriter.printf("  Last %d scans\n    %s\n", Long.valueOf(cfoa.m141103j()), bmxr.m108544a("\n    ").mo66874a((Iterable) buyc.f155295h));
                printWriter.printf("  Ongoing scan\n    %s\n", buyc.f155296i);
                printWriter.printf("  Screen state\n    Interactive=%s\n", Boolean.valueOf(buyc.mo73249c()));
            } else {
                throw null;
            }
        }
        bvdx bvdx = this.f191778b;
        if (bvdx == null || (bved = bvdx.f155685a) == null) {
            printWriter.println("No bound clients.");
        } else {
            bved.dump(fileDescriptor, printWriter, strArr);
        }
    }

    public final IBinder onBind(Intent intent) {
        srn srn = bvcm.f155598a;
        this.f191778b = new bvdx(this);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.location.nearby.direct.service.NearbyDirectService"));
        startService(intent2);
        return this.f191778b;
    }

    public final void onCreate() {
        srn srn = bvcm.f155598a;
        HandlerThread handlerThread = new HandlerThread("NearbyDirectMain");
        handlerThread.start();
        this.f191777a = new adzt(handlerThread.getLooper());
        ahgz ahgz = new ahgz(this);
        this.f191781e = ahgz;
        buqh buqh = new buqh(new buqm("NearbyDirect", this.f191777a.getLooper()));
        this.f191779c = buqh;
        ahgz.mo36476a(buqh.class, buqh);
        ahgz.mo36476a(bvbu.class, new bvbu(this));
        ahgz.mo36476a(bvbv.class, new bvbv());
        ahgz.mo36476a(buwe.class, new buwe());
        ahgz.mo36476a(buvp.class, new buvp(this));
        ahgz.mo36476a(buvc.class, new buvc());
        if (buxb.m120649a(this)) {
            buxb buxb = new buxb(this);
            ahgz.mo36476a(buxb.class, buxb);
            if (buxb.mo73228c()) {
                ahgz.mo36476a(neg.class, nef.m26014a(this));
            }
        }
    }

    public final void onDestroy() {
        srn srn = bvcm.f155598a;
        buxb buxb = (buxb) ahgz.m55755b(this, buxb.class);
        if (buxb != null) {
            buxb.mo73229c(null);
            buwt buwt = buxb.f155209g;
            if (buwt != null) {
                try {
                    buwt.f155183a.unregisterReceiver(buwt.f155190h);
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68432a("buwt", "i", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Unregistered bluetooth broadcast receiver when it wasn't registered.");
                }
                buwt.f155188f = true;
            }
        }
        this.f191779c.mo72988d(new bvdw(this, "StopBackgroundThread"));
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f191780d = i2;
        srn srn = bvcm.f155598a;
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        srn srn = bvcm.f155598a;
        bved bved = this.f191778b.f155685a;
        if (bved != null && bved.f155703i.compareAndSet(false, true)) {
            bved.f155696b.obtainMessage(1).sendToTarget();
        }
        this.f191779c.mo72988d(new bvdv(this, "StopNearbyDirect", this.f191780d));
        return false;
    }
}
