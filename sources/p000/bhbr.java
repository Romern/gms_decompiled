package p000;

import android.content.Context;
import android.location.GpsStatus;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bhbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhbr {

    /* renamed from: e */
    private static bhbr f118270e = null;

    /* renamed from: a */
    public final LocationManager f118271a;

    /* renamed from: b */
    public final Map f118272b = new HashMap();

    /* renamed from: c */
    public final bhbq f118273c = new bhbq(this);

    /* renamed from: d */
    public GpsStatus f118274d;

    protected bhbr(Context context) {
        this.f118271a = (LocationManager) context.getSystemService("location");
    }

    /* renamed from: a */
    public static synchronized bhbr m100591a(Context context) {
        bhbr bhbr;
        synchronized (bhbr.class) {
            if (f118270e == null) {
                Context applicationContext = context.getApplicationContext();
                if (ssw.m36269a()) {
                    f118270e = new bhbw(applicationContext);
                } else {
                    int i = Build.VERSION.SDK_INT;
                    f118270e = new bhbv(applicationContext);
                }
            }
            bhbr = f118270e;
        }
        return bhbr;
    }

    /* renamed from: a */
    public String mo63528a() {
        return "";
    }

    /* renamed from: a */
    public void mo63533a(String str) {
    }

    /* renamed from: a */
    public void mo63537a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo63538b() {
        this.f118271a.removeGpsStatusListener(this.f118273c);
    }

    /* renamed from: a */
    public final void mo63529a(LocationListener locationListener) {
        try {
            this.f118271a.removeUpdates(locationListener);
        } catch (NullPointerException e) {
            Log.e("LocationManagerCompat", "unable to remove location updates", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63530a(bfkr bfkr) {
        synchronized (this.f118272b) {
            for (Map.Entry entry : this.f118272b.entrySet()) {
                Executor executor = (Executor) entry.getValue();
                executor.execute(new bhbo(this, (bhbp) entry.getKey(), executor, bfkr));
            }
        }
    }

    /* renamed from: a */
    public final void mo63531a(bhbp bhbp) {
        synchronized (this.f118272b) {
            if (this.f118272b.remove(bhbp) != null && this.f118272b.isEmpty()) {
                mo63538b();
            }
        }
    }

    /* renamed from: a */
    public final void mo63532a(bhbp bhbp, Executor executor) {
        synchronized (this.f118272b) {
            boolean isEmpty = this.f118272b.isEmpty();
            if (this.f118272b.put(bhbp, executor) == null) {
                if (isEmpty) {
                    mo63536a(executor);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo63534a(String str, long j, LocationListener locationListener, Looper looper, Collection collection, boolean z) {
        if (cevw.m138319d()) {
            try {
                this.f118271a.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            } catch (NullPointerException | SecurityException e) {
                Log.wtf("LocationManagerCompat", "Unable to request location updates.", e);
            }
        } else {
            try {
                this.f118271a.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            } catch (NullPointerException e2) {
                Log.wtf("LocationManagerCompat", "Unable to request location updates.", e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo63535a(String str, LocationListener locationListener, Looper looper, Collection collection) {
        mo63534a(str, 0, locationListener, looper, collection, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63536a(Executor executor) {
        FutureTask futureTask = new FutureTask(new bhbn(this));
        if (Looper.myLooper() != null) {
            futureTask.run();
        } else {
            new adzt(Looper.getMainLooper()).post(futureTask);
        }
        try {
            futureTask.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            throw new IllegalStateException("The Looper appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread.", e2);
        }
    }
}
