package p000;

import android.hardware.location.GeofenceHardwareCallback;
import android.location.Location;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzz extends GeofenceHardwareCallback {

    /* renamed from: a */
    public volatile CountDownLatch f115845a;

    /* renamed from: b */
    public volatile CountDownLatch f115846b;

    /* renamed from: c */
    public final SparseIntArray f115847c = new SparseIntArray(50);

    /* renamed from: d */
    final /* synthetic */ bgac f115848d;

    /* renamed from: e */
    private final Object f115849e = new Object();

    /* renamed from: f */
    private Location f115850f = null;

    public bfzz(bgac bgac) {
        this.f115848d = bgac;
    }

    public final void onGeofenceAdd(int i, int i2) {
        bfzz.super.onGeofenceAdd(i, i2);
        synchronized (this.f115847c) {
            this.f115847c.put(i, i2);
        }
        if (this.f115845a != null) {
            this.f115845a.countDown();
        }
    }

    public final void onGeofenceRemove(int i, int i2) {
        bfzz.super.onGeofenceRemove(i, i2);
        if (i2 != 0) {
            boolean z = bfxc.f115575a;
        }
        if (this.f115846b != null) {
            this.f115846b.countDown();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfzt.a(android.location.Location, java.util.Map, boolean):void
     arg types: [android.location.Location, ?[OBJECT, ARRAY], int]
     candidates:
      bfzt.a(java.util.List, int, android.location.Location):void
      bfzt.a(android.location.Location, java.util.Map, boolean):void */
    public final void onGeofenceTransition(int i, int i2, Location location, long j, int i3) {
        bfzz.super.onGeofenceTransition(i, i2, location, j, i3);
        synchronized (this.f115849e) {
            if (location != null) {
                if (Math.abs(location.getLatitude()) > 9.999999747378752E-6d || Math.abs(location.getLongitude()) > 9.999999747378752E-6d) {
                    Location location2 = this.f115850f;
                    if (location2 == null || location2.getTime() != location.getTime()) {
                        this.f115850f = location;
                        this.f115848d.f115858d.mo62509a(location, (Map) null, false);
                    }
                }
            }
            if (!cexh.m138383b()) {
                bfxa.f115569a.mo62416a(new bfwy(-1801621853, location, "Invalid location dropped"));
            } else {
                bfxa.f115569a.mo62412a(2022288865, location, 5);
            }
            if (Log.isLoggable("GeofenceHardware", 5)) {
                Log.w("GeofenceHardware", "Ignored invalid location.");
            }
        }
        boolean z = bfxc.f115575a;
    }
}
