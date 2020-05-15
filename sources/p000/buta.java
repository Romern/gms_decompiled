package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: buta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buta {

    /* renamed from: a */
    private final Context f154838a;

    public buta(Context context) {
        this.f154838a = context;
    }

    /* renamed from: a */
    public final void mo73096a(Intent intent, ahsb ahsb, long j) {
        boolean z;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Don't call bindOneShot on main thread!");
        bqgy c = bqgy.m112818c();
        busz busz = new busz(c);
        this.f154838a.bindService(intent, busz, 1);
        try {
            ahsb.mo37008a((IBinder) c.get(j, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buta", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("OneShotServiceBinder: bindOneShot fail for intent action:%s", intent.getAction());
            ahsb.mo37008a(null);
        }
        this.f154838a.unbindService(busz);
    }
}
