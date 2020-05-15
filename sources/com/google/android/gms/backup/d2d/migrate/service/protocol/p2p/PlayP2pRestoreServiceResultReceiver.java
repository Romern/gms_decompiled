package com.google.android.gms.backup.d2d.migrate.service.protocol.p2p;

import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlayP2pRestoreServiceResultReceiver extends ResultReceiver {

    /* renamed from: a */
    public final mhx f29040a;

    /* renamed from: b */
    private final ExecutorService f29041b;

    /* renamed from: c */
    private final List f29042c = bnkn.m109661a();

    /* renamed from: d */
    private final mis f29043d;

    public PlayP2pRestoreServiceResultReceiver(mis mis, mhx mhx, ExecutorService executorService) {
        super(new adzt(Looper.getMainLooper()));
        bmxy.m108581a(mis);
        this.f29043d = mis;
        bmxy.m108581a(mhx);
        this.f29040a = mhx;
        bmxy.m108581a(executorService);
        this.f29041b = executorService;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        mih a;
        if (i == 2) {
            this.f29043d.mo20080a(bngx.m109368a((Collection) this.f29042c));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("p2pdisconnectservice", true);
            this.f29041b.execute(new miq(this, bundle2));
        } else if (i == 1 && (a = mik.m25177a(bundle)) != null) {
            this.f29042c.add(a);
        }
    }
}
