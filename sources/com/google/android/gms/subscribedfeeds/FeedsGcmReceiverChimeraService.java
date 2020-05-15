package com.google.android.gms.subscribedfeeds;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeedsGcmReceiverChimeraService extends Service {

    /* renamed from: a */
    public ashi f108297a;

    /* renamed from: b */
    private final Executor f108298b = adzl.f62962b.mo25876a(new stz("SubscribedFeeds-messages"));

    /* renamed from: c */
    private final ScheduledExecutorService f108299c = adzl.f62962b.mo25878a(new stz("SubscribedFeeds-timeout"), 1);

    /* renamed from: d */
    private int f108300d;

    /* renamed from: e */
    private int f108301e = 0;

    /* renamed from: a */
    public final Future mo59204a(String str) {
        if (!cgvi.m147137b()) {
            return bqga.m112770a();
        }
        return this.f108299c.schedule(new ashk(this, str), cgvi.f187809a.mo6606a().mo84536c(), TimeUnit.MILLISECONDS);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f108297a = ashi.m74130a(this.f108299c, new beof(this, "STREAMZ_SUBSCRIBEDFEEDS"));
        if (cgvi.m147137b()) {
            this.f108297a.mo49156a(cgvi.m147140e());
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this) {
            this.f108300d = i2;
            this.f108301e++;
        }
        this.f108298b.execute(new ashj(this, intent));
        return 3;
    }

    /* renamed from: a */
    public final synchronized void mo59205a() {
        int i = this.f108301e - 1;
        this.f108301e = i;
        if (i == 0) {
            stopSelf(this.f108300d);
        }
    }
}
