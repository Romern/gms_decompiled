package p000;

import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppState;
import android.os.Handler;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: buhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buhm {

    /* renamed from: a */
    public final ContextHubManager f153867a;

    /* renamed from: b */
    public final buhn f153868b;

    /* renamed from: c */
    public final HashMap f153869c;

    /* renamed from: d */
    public final ThreadPoolExecutor f153870d;

    /* renamed from: e */
    public final AtomicInteger f153871e;

    /* renamed from: f */
    public final buhw f153872f;

    /* renamed from: g */
    private final bugn f153873g;

    /* renamed from: h */
    private final Handler f153874h;

    /* renamed from: i */
    private final LongSparseArray f153875i;

    /* renamed from: j */
    private final bgbq f153876j;

    public buhm() {
    }

    /* renamed from: a */
    public final buhc mo72676a(long j) {
        buhc buhc;
        synchronized (this.f153875i) {
            if (this.f153875i.get(j) == null) {
                this.f153875i.put(j, new buhc(j, this.f153867a, this.f153873g, this.f153876j, this.f153874h));
            }
            buhc = (buhc) this.f153875i.get(j);
        }
        return buhc;
    }

    /* renamed from: b */
    public final List mo72679b(ContextHubInfo contextHubInfo) {
        ContextHubTransaction.Response response;
        try {
            response = this.f153867a.queryNanoApps(contextHubInfo).waitForResponse(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            int id = contextHubInfo.getId();
            StringBuilder sb = new StringBuilder(65);
            sb.append("InterruptedException while querying nanoapps (hub id=");
            sb.append(id);
            sb.append(")");
            sb.toString();
            response = null;
        } catch (TimeoutException e2) {
            int id2 = contextHubInfo.getId();
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("TimeoutException while querying nanoapps (hub id=");
            sb2.append(id2);
            sb2.append(")");
            sb2.toString();
            response = null;
        }
        if (response == null) {
            return null;
        }
        if (response.getResult() == 0) {
            return (List) response.getContents();
        }
        int id3 = contextHubInfo.getId();
        int result = response.getResult();
        StringBuilder sb3 = new StringBuilder(62);
        sb3.append("Failed to query nanoapps (hub id=");
        sb3.append(id3);
        sb3.append(") code ");
        sb3.append(result);
        sb3.toString();
        return null;
    }

    public buhm(bugn bugn, ContextHubManager contextHubManager, buhn buhn, bgbq bgbq, Handler handler) {
        this.f153869c = new HashMap();
        this.f153871e = new AtomicInteger(0);
        this.f153872f = new buhw();
        this.f153875i = new LongSparseArray();
        this.f153873g = bugn;
        this.f153867a = contextHubManager;
        this.f153868b = buhn;
        this.f153876j = bgbq;
        this.f153874h = handler;
        this.f153870d = new soc(1, 9);
        for (ContextHubInfo contextHubInfo : mo72677a()) {
            this.f153869c.put(Integer.valueOf(contextHubInfo.getId()), contextHubManager.createClient(contextHubInfo, new buho(this), this.f153870d));
        }
    }

    /* renamed from: a */
    public final List mo72677a() {
        return this.f153867a.getContextHubs();
    }

    /* renamed from: a */
    public final List mo72678a(ContextHubInfo contextHubInfo) {
        bmxy.m108581a(contextHubInfo);
        ArrayList arrayList = new ArrayList();
        List<NanoAppState> b = mo72679b(contextHubInfo);
        if (b != null) {
            for (NanoAppState nanoAppState : b) {
                arrayList.add(mo72676a(nanoAppState.getNanoAppId()));
            }
        }
        return arrayList;
    }
}
