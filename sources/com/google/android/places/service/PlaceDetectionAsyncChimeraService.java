package com.google.android.places.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.places.Subscription;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceDetectionAsyncChimeraService extends Service implements bhrb, bidp {

    /* renamed from: a */
    public bidv f151368a;

    /* renamed from: b */
    private final Binder f151369b = new bido(this);

    /* renamed from: a */
    public final Future mo64550a(CheckInReport checkInReport, PlacesParams placesParams) {
        bidv bidv = this.f151368a;
        FutureTask futureTask = new FutureTask(new bidu(bidv, checkInReport, placesParams));
        bidv.f120328c.post(futureTask);
        return futureTask;
    }

    /* renamed from: a */
    public final Future mo64551a(Subscription subscription) {
        bhri bhri = this.f151368a.f120331f;
        FutureTask futureTask = new FutureTask(new bhrg(bhri, subscription));
        bhri.f119379a.post(new bhre(bhri, futureTask));
        return futureTask;
    }

    /* renamed from: b */
    public final Future mo64553b(Subscription subscription) {
        return this.f151368a.f120331f.mo64183a(subscription);
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bidv bidv = this.f151368a;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        bidv.f120328c.post(new bids(bidv, printWriter, countDownLatch));
        try {
            if (!countDownLatch.await(4, TimeUnit.SECONDS)) {
                printWriter.println("Thread timed out dumping Place Detection Service state.");
            }
        } catch (InterruptedException e) {
            printWriter.println("Thread interrupted while dumping Place Detection Service state.");
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f151369b;
    }

    public final void onCreate() {
        super.onCreate();
        bidv bidv = new bidv(this, this);
        this.f151368a = bidv;
        bidv.mo64559a(bljx.m107269a(new bidl(this)));
    }

    public final void onDestroy() {
        bidv bidv = this.f151368a;
        bidv.f120334i.mo17933a();
        bidv.f120326a.unregisterReceiver(bidv.f120335j);
        bidv.f120331f.mo25990b();
        bigx bigx = bidv.f120333h;
        try {
            bigx.f120553c.unregisterReceiver(bigx.f120562l);
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "IllegalArgumentException whilst unregistering receiver. Was SignalManager stopped before being started?");
            }
        }
        bidv.f120328c.post(new bidr(bidv));
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        if (!(intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("PREFETCHING"))) {
            this.f151368a.mo64559a(bljx.m107269a(new bidm(this)));
        }
        if (!rsk.m34335a(intent)) {
            return 1;
        }
        this.f151368a.mo64559a(bljx.m107269a(new bidn(this, intent)));
        return 1;
    }

    public final boolean onUnbind(Intent intent) {
        return false;
    }

    /* renamed from: a */
    public final Future mo64552a(String str) {
        bidv bidv = this.f151368a;
        FutureTask futureTask = new FutureTask(new bidt(bidv, str));
        bidv.f120328c.post(futureTask);
        return futureTask;
    }

    /* renamed from: a */
    public final void mo64176a(int i) {
        if (i > 0) {
            Intent intent = new Intent("com.google.android.gms.location.places.PlaceDetectionAsyncService");
            intent.setPackage(getPackageName());
            startService(intent);
            return;
        }
        stopSelf();
    }
}
