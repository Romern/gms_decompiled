package com.google.android.gms.mdi.download.service;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataDownloadChimeraService extends zzx {

    /* renamed from: a */
    private Context f80016a;

    /* renamed from: b */
    private bbch f80017b;

    /* renamed from: k */
    private afon f80018k;

    /* renamed from: l */
    private afoj f80019l;

    /* renamed from: m */
    private bbep f80020m;

    /* renamed from: n */
    private ayte f80021n;

    public DataDownloadChimeraService() {
        super(new int[]{152}, new String[]{"com.google.android.mdd.service.START"}, Collections.emptySet(), 3, 9, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        afot afot;
        Context context = this.f80016a;
        bbch bbch = this.f80017b;
        afon afon = this.f80018k;
        afoj afoj = this.f80019l;
        bbep bbep = this.f80020m;
        aaag a = aaag.m21014a(this, this.f56354e, this.f56355f);
        String str = getServiceRequest.f30230d;
        int i = getServiceRequest.f30229c;
        if (spn.m35869b()) {
            afot = afot.ZERO_PARTY;
        } else {
            afot = rfz.m33557a(this.f80016a).mo24610b(str) ? afot.FIRST_PARTY : afot.THIRD_PARTY;
        }
        aaac.mo16652a(new afow(context, bbch, afon, afoj, bbep, a, str, i, afot, this.f80021n));
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (!ceni.f183073a.mo6606a().mo79428e() && (strArr == null || strArr.length <= 0 || !"force_mdd_dump".equals(strArr[0]))) {
            printWriter.println("==== MDD dumped info is DISABLED ====");
            return;
        }
        printWriter.println("==== MDD dumped info ====");
        if (ceni.m137518b()) {
            afon afon = this.f80018k;
            printWriter.println("==== PhenotypeConfigPopulator ====");
            baun baun = (baun) afqh.m53443a(afok.f64442c, afon.f64445a, (bxxk) baun.f101788b.mo74142c(7));
            if (baun != null) {
                printWriter.println("\n== PhConfig: ==");
                bxwc bxwc = baun.f101790a;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    baum baum = (baum) bxwc.get(i);
                    printWriter.format("Found ph flag %s from ph config.\n", baum.f101786a);
                    baui baui = (baui) afqh.m53443a(bdyx.m91611a(afok.f64441b, baum.f101786a, afok.f64440a), afon.f64445a, (bxxk) baui.f101771e.mo74142c(7));
                    if (baui != null) {
                        printWriter.format("groupName: %s\nDataFileGroup:\n %s\n", baui.f101774b, baui.toString());
                    }
                }
            }
        }
        try {
            bbch bbch = this.f80017b;
            bqdx.m112674a(bbch.mo56063a(), new bbbh(bbch, printWriter), bbch.f102327n).get(3, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", e2);
        }
        printWriter.println();
    }

    public final void onCreate() {
        this.f80016a = getApplicationContext();
        this.f80021n = new aytg();
        bqgj bqgj = this.f56355f;
        if (afoi.f64426b == null) {
            synchronized (afoi.f64425a) {
                if (afoi.f64426b == null) {
                    afnt afnt = new afnt();
                    afnu afnu = new afnu(bqgj);
                    cazf.m127594a(afnu);
                    afnt.f64413a = afnu;
                    cazf.m127595a(afnt.f64413a, afnu.class);
                    afoi.f64426b = new afoi(afnt.f64413a);
                }
            }
        }
        afoi afoi = afoi.f64426b;
        this.f80017b = afoi.mo34975a();
        this.f80020m = (bbep) afoi.f64427c.mo6445a();
        this.f80018k = new afon(afoi.mo34975a(), (bbep) afoi.f64427c.mo6445a(), (Executor) afoi.f64428d.mo6445a());
        this.f80019l = rfy.m33550g(getApplicationContext()) ? new afoj(getApplicationContext()) : null;
    }

    public final void onDestroy() {
    }
}
