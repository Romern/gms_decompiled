package com.google.android.location.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleLocationManagerChimeraService extends Service {

    /* renamed from: a */
    public Handler f150783a;

    /* renamed from: b */
    private bgap f150784b;

    /* renamed from: c */
    private bgaq f150785c;

    /* renamed from: a */
    public static Intent m117249a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.location.internal.GoogleLocationManagerService"));
        return intent;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        PrintWriter printWriter2 = printWriter;
        bgaq bgaq = this.f150785c;
        Class[] clsArr = {cerl.class, cero.class, cerr.class, ceru.class, cerx.class, cesa.class, cesd.class, cesg.class, cesj.class, cesm.class, cesp.class, cess.class, cesv.class, cetb.class, cete.class, ceth.class, ceto.class, cetr.class, cetu.class, cetx.class, ceto.class, cetr.class, cetu.class, ceua.class, ceud.class, ceug.class, ceum.class, ceup.class, ceus.class, ceuv.class, ceuy.class, cevb.class, ceve.class, ccrf.class, ccri.class, ccrl.class, cevh.class, cevp.class, cevm.class, cevs.class, cevv.class, cevy.class, cevz.class, cewf.class, cewi.class, cewl.class, cewo.class, cexg.class, cexj.class, cexm.class, cexp.class, cexs.class, cexv.class, ceyc.class, ceyf.class, ceyi.class, ceyl.class, ceyo.class, ceyr.class, ceyu.class, ceyx.class, ceza.class, cezd.class, cezg.class, cezh.class, cezn.class, cezq.class, cezt.class, cfac.class, cfai.class, cfal.class, cfao.class, cfar.class, cfau.class, cfax.class, cfay.class};
        Class[] clsArr2 = {cezz.class, cezx.class, cevk.class, cevm.class};
        for (int i = 0; i < 76; i++) {
            bfkj.m97123a(printWriter2, clsArr[i]);
        }
        if (cezu.m138491l()) {
            for (int i2 = 0; i2 < 4; i2++) {
                bfkj.m97123a(printWriter2, clsArr2[i2]);
            }
        }
        bfqm bfqm = bgaq.f115915b;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        bfqm.f114889p.mo62099a(20, new bfqb(bfqm, printWriter, strArr, fileDescriptor, countDownLatch));
        try {
            countDownLatch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            printWriter2.println("\nThread interrupted while dumping location requests");
        }
        bfyw bfyw = bgaq.f115917d;
        if (strArr.length <= 0) {
            printWriter2.println("\nGeofencer State:");
            bfzt bfzt = bfyw.f115741a;
            synchronized (bfzt.f115806k) {
                bfzt.mo62545b(102, printWriter2);
                bfys bfys = new bfys(printWriter2);
                bfys.mo62448a((bgan) bfzt);
                try {
                    if (bfys.f115731a.await(2, TimeUnit.SECONDS)) {
                        bfys.mo62450b();
                    } else {
                        throw new InterruptedException("Wait timeout.");
                    }
                } catch (InterruptedException e2) {
                    printWriter2.write("Failed to retrieve information from CHRE.\n");
                }
            }
        }
        bfld bfld = bgaq.f115920g;
        printWriter2.print("Current list of nanoapp logging IDs ");
        for (Long l : ((bflg) bfld).f114338e) {
            String valueOf = String.valueOf(Long.toHexString(l.longValue()));
            printWriter2.print(valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf));
        }
        printWriter.println();
        if (!((bfll) bgaq.f115921h).f114346d) {
            printWriter2.println("No active CHRE settings listener");
        } else {
            printWriter2.println("Have active CHRE settings listener");
        }
        bflq bflq = (bflq) bgaq.f115922i;
        boolean z = bflq.f114360b;
        boolean z2 = bflq.f114361c;
        StringBuilder sb = new StringBuilder(69);
        sb.append("Has active CHRE connection status listener : ");
        sb.append(z);
        sb.append(". Connected : ");
        sb.append(z2);
        printWriter2.println(sb.toString());
        new bgcb().mo62634a(bgaq.f115914a).mo72634a(printWriter2);
        bfuh bfuh = bgaq.f115916c;
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        bfuh.f115328d.mo62099a(29, new bfud(bfuh, printWriter2, countDownLatch2));
        try {
            countDownLatch2.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            printWriter2.println("\nThread interrupted while dumping Device Orientation Request ");
        }
        int c = bgaq.mo62568c();
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("ActivityRecognition Accuracy Mode : ");
        sb2.append(c);
        printWriter2.println(sb2.toString());
        printWriter.println();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.location.internal.GoogleLocationManagerService.START".equals(intent.getAction())) {
            return null;
        }
        this.f150785c.mo62561a(intent);
        return this.f150784b;
    }

    public final void onCreate() {
        super.onCreate();
        Intent a = m117249a(this);
        try {
            startService(a);
            this.f150784b = new bgap(this, this);
            if (cevw.f183465a.mo6606a().flpEnableDebugLogging()) {
                bftx.m97876a(new bggo(null));
            }
            this.f150785c = new bgaq(getApplicationContext());
            sns sns = new sns("LocationServiceBroker", 9);
            sns.start();
            this.f150783a = new snr(sns);
        } catch (IllegalStateException e) {
            int i = Build.VERSION.SDK_INT;
            if ((bmxx.m108577a(a.getPackage()) || a.getPackage().equals("com.google.android.gms")) && cdje.m133542b() && ((double) new Random().nextFloat()) < cdje.m133543c()) {
                Log.e("GLMS", "Google Play services is unable to start a service. Exiting.", e);
                spn.m35884e();
            }
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bugl, bflh], assign insn: 0x001a: IGET  (r1v2 ? I:bflh) = (r0v0 bgaq) bgaq.h bflh */
    public final void onDestroy() {
        bgaq bgaq = this.f150785c;
        bflg bflg = (bflg) bgaq.f115920g;
        if (bflg.f114340g) {
            bflg.f114334a.unregisterReceiver(bflg.f114339f);
            bflg.f114336c.mo61898a();
            bflg.f114340g = false;
        }
        ? r1 = bgaq.f115921h;
        bfll bfll = (bfll) r1;
        bfll.f114343a.mo72630a((bugl) r1);
        bfll.f114343a.mo72636b(bfll.f114347e);
        bfll.mo61887d();
        bxvd bxvd = bfll.f114348f;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bugf bugf = (bugf) bxvd.f164949b;
        bugf bugf2 = bugf.f153773g;
        bugf.f153775a |= 2;
        bugf.f153777c = false;
        bxvd bxvd2 = bfll.f114348f;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bugf bugf3 = (bugf) bxvd2.f164949b;
        bugf3.f153775a |= 4;
        bugf3.f153778d = false;
        bxvd bxvd3 = bfll.f114348f;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bugf bugf4 = (bugf) bxvd3.f164949b;
        bugf4.f153775a |= 8;
        bugf4.f153779e = false;
        bxvd bxvd4 = bfll.f114348f;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bugf bugf5 = (bugf) bxvd4.f164949b;
        bugf5.f153775a |= 16;
        bugf5.f153780f = false;
        bfll.mo61881a(1, bfll.f114348f);
        bgaq.f115922i.mo61892b();
        bgaq.f115919f.quit();
        bftx.m97876a(null);
    }

    public final void onRebind(Intent intent) {
        if ("com.google.android.location.internal.GoogleLocationManagerService.START".equals(intent.getAction())) {
            this.f150785c.mo62561a(intent);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (intent != null) {
            if (rsk.m34335a(intent)) {
                bgaq bgaq = this.f150785c;
                int b = rsk.m34336b(intent);
                if (b == 1) {
                    bfqm bfqm = bgaq.f115915b;
                    bfqm.f114889p.mo62099a(19, new bfpu(bfqm, new Intent(intent)));
                } else if (b != 2) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Unknown cache type: ");
                    sb.append(b);
                    Log.w("GLMSImpl", sb.toString());
                } else {
                    bfyw bfyw = bgaq.f115917d;
                    if (!rsk.m34335a(intent) || rsk.m34336b(intent) != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    sdo.m34974b(z);
                    bfzt bfzt = bfyw.f115741a;
                    Intent intent2 = new Intent(intent);
                    synchronized (bfzt.f115806k) {
                        if (!bfzt.f115816u) {
                            bfzt.mo62545b(2, intent2);
                            bfzt.f115816u = true;
                            for (bfyv bfyv : bfzt.f115818w) {
                                bfyv.mo62448a((bgan) bfzt);
                            }
                        } else if (Log.isLoggable("GeofencerStateMachine", 5)) {
                            bfxc.m98134c("GeofencerStateMachine", "sendInitialize called more than once.");
                        }
                    }
                }
            }
            intent.getBooleanExtra("fromDeviceBoot", false);
            if (intent.getBooleanExtra("fromGmsCoreInit", false)) {
                Context context = this.f150785c.f115914a;
                Intent a = m117249a(context);
                a.setPackage(context.getPackageName());
                bgev.m98710a(context, PendingIntent.getService(context, 0, a, 134217728));
            }
        }
        return 1;
    }

    public final boolean onUnbind(Intent intent) {
        if (!"com.google.android.location.internal.GoogleLocationManagerService.START".equals(intent.getAction())) {
            return true;
        }
        bgaq bgaq = this.f150785c;
        synchronized (bgaq.f115924k) {
            int b = bgaq.mo62566b(intent);
            if (b >= 0) {
                bgaq.f115924k.remove(b);
            }
            if (bgaq.f115924k.isEmpty()) {
                bfqm bfqm = bgaq.f115915b;
                bfqm.f114889p.mo62099a(25, new bfpv(bfqm));
                bfqm.mo62139a(false);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo70875a(sck sck, String str) {
        try {
            sck.mo16678a(0, new bgar(this.f150785c, str), (Bundle) null);
        } catch (RemoteException e) {
            if (Log.isLoggable("GLMS", 5)) {
                Log.w("GLMS", "client died while brokering service");
            }
        }
    }
}
