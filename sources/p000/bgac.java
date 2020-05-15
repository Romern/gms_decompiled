package p000;

import android.hardware.location.GeofenceHardwareRequest;
import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: bgac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgac implements bfyr {

    /* renamed from: a */
    public final int f115855a;

    /* renamed from: b */
    bfyu f115856b;

    /* renamed from: c */
    final ArrayList f115857c = new ArrayList(Collections.nCopies(50, null));

    /* renamed from: d */
    public final bfzt f115858d;

    /* renamed from: e */
    final bfzz f115859e = new bfzz(this);

    /* renamed from: f */
    final bgab f115860f = new bgab(this);

    /* renamed from: g */
    private final bgaa f115861g;

    public bgac(bfzt bfzt, int i) {
        bgaa bgaa = new bgaa();
        i = i != 0 ? 1 : i;
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unsupported monitoring type ");
        sb.append(i);
        sdo.m34975b(true, sb.toString());
        this.f115858d = bfzt;
        this.f115855a = i;
        this.f115861g = bgaa;
    }

    /* renamed from: c */
    private final void m98375c() {
        synchronized (this.f115857c) {
            for (int i = 0; i < 50; i++) {
                this.f115857c.set(i, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo62441a(bfyu bfyu) {
        boolean z = bfxc.f115575a;
        if (bfyu != null) {
            bfyu bfyu2 = this.f115856b;
            if (bfyu2 == null || bfyu.f115736a != bfyu2.f115736a) {
                this.f115856b = bfyu;
                try {
                    bfyu.f115736a.registerForMonitorStateChangeCallback(this.f115855a, this.f115860f);
                    return;
                } catch (SecurityException e) {
                }
            } else {
                return;
            }
        }
        this.f115856b = null;
    }

    /* renamed from: b */
    public final boolean mo62445b() {
        bfyu bfyu = this.f115856b;
        if (bfyu == null) {
            return false;
        }
        try {
            int[] monitoringTypes = bfyu.f115736a.getMonitoringTypes();
            int length = monitoringTypes.length;
            int i = 0;
            while (i < length) {
                int i2 = monitoringTypes[i];
                int i3 = this.f115855a;
                if (i2 != i3) {
                    i++;
                } else if (this.f115856b.mo62447a(i3) != 2) {
                    return true;
                } else {
                    boolean z = bfxc.f115575a;
                    return false;
                }
            }
            boolean z2 = bfxc.f115575a;
            return false;
        } catch (SecurityException e) {
            boolean z3 = bfxc.f115575a;
            return false;
        }
    }

    /* renamed from: a */
    public final void mo62442a(PrintWriter printWriter) {
        boolean z;
        printWriter.print("Dump of hardware geofencing:");
        int i = this.f115855a;
        StringBuilder sb = new StringBuilder(80);
        sb.append("\n    Class is RealBlockingGeofenceHardware, monitoringType=");
        sb.append(i);
        sb.append(", limit=50");
        printWriter.print(sb.toString());
        boolean b = mo62445b();
        int i2 = 0;
        if (!mo62445b()) {
            z = false;
        } else if (this.f115856b.mo62447a(this.f115855a) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean b2 = cexq.m138396b();
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("\n    Supported=");
        sb2.append(b);
        sb2.append(", available=");
        sb2.append(z);
        sb2.append(", enabled on this device=");
        sb2.append(b2);
        printWriter.print(sb2.toString());
        printWriter.print("\n    Registered geofences:");
        synchronized (this.f115857c) {
            Iterator it = this.f115857c.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                bfwf bfwf = (bfwf) it.next();
                if (bfwf != null) {
                    String valueOf = String.valueOf(bfwf);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb3.append("\n        id=");
                    sb3.append(i3);
                    sb3.append(" ");
                    sb3.append(valueOf);
                    printWriter.print(sb3.toString());
                    i2++;
                }
                i3++;
            }
            if (i2 == 0) {
                printWriter.print("\n    <none>");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo62443a() {
        if (!mo62445b()) {
            return false;
        }
        m98375c();
        bfzz bfzz = this.f115859e;
        if (bfzz.f115846b == null || bfzz.f115846b.getCount() == 0) {
            bfzz.f115846b = new CountDownLatch(50);
            for (int i = 0; i < 50; i++) {
                try {
                    bfyu bfyu = this.f115856b;
                    if (bfyu.f115736a.removeGeofence(i, this.f115855a)) {
                    }
                } catch (IllegalArgumentException e) {
                    boolean z = bfxc.f115575a;
                } catch (SecurityException e2) {
                    boolean z2 = bfxc.f115575a;
                }
                this.f115859e.f115846b.countDown();
            }
            try {
                this.f115859e.f115846b.await(10000, TimeUnit.MILLISECONDS);
                boolean z3 = bfxc.f115575a;
                return true;
            } catch (InterruptedException e3) {
                return true;
            }
        } else {
            if (Log.isLoggable("GeofenceHardware", 6)) {
                bfxc.m98133b("GeofenceHardware", "Ongoing remove geofence operation.");
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo62444a(List list, Location location, boolean z) {
        boolean z2;
        int i;
        GeofenceHardwareRequest geofenceHardwareRequest;
        List list2 = list;
        boolean z3 = false;
        if (this.f115861g.f115853c || !mo62445b()) {
            return false;
        }
        if (!z && this.f115857c.containsAll(list2)) {
            boolean z4 = bfxc.f115575a;
            return true;
        }
        bgaa bgaa = this.f115861g;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        sdo.m34975b(bgaa.f115852b.size() == 0 || elapsedRealtime >= ((Long) bgaa.f115852b.getLast()).longValue(), "Unable to add events in the past.");
        if (bgaa.f115852b.size() >= 4) {
            bgaa.f115852b.removeFirst();
        }
        bgaa.f115852b.add(Long.valueOf(elapsedRealtime));
        if (bgaa.f115852b.size() >= 4) {
            z2 = elapsedRealtime - ((Long) bgaa.f115852b.getFirst()).longValue() <= bgaa.f115851a;
        } else {
            z2 = false;
        }
        bgaa.f115853c = z2;
        if (!mo62443a()) {
            return false;
        }
        int min = Math.min(50, list.size());
        bfzz bfzz = this.f115859e;
        if (bfzz.f115845a == null || bfzz.f115845a.getCount() == 0) {
            bfzz.f115845a = new CountDownLatch(min);
            bfzz.f115847c.clear();
            int i2 = 0;
            while (i2 < min) {
                bfwf bfwf = (bfwf) list2.get(i2);
                if (i2 != 49) {
                    boolean z5 = bfxc.f115575a;
                    ParcelableGeofence parcelableGeofence = bfwf.f115483a;
                    i = min;
                    geofenceHardwareRequest = GeofenceHardwareRequest.createCircularGeofence(parcelableGeofence.f79441d, parcelableGeofence.f79442e, (double) parcelableGeofence.f79443f);
                    geofenceHardwareRequest.setLastTransition(4);
                    geofenceHardwareRequest.setMonitorTransitions(7);
                    geofenceHardwareRequest.setNotificationResponsiveness(9000);
                    geofenceHardwareRequest.setUnknownTimer(9000);
                } else {
                    i = min;
                    geofenceHardwareRequest = GeofenceHardwareRequest.createCircularGeofence(location.getLatitude(), location.getLongitude(), bfwf.mo62354b());
                    geofenceHardwareRequest.setLastTransition(4);
                    geofenceHardwareRequest.setMonitorTransitions(7);
                    geofenceHardwareRequest.setNotificationResponsiveness(9000);
                    geofenceHardwareRequest.setUnknownTimer(9000);
                    boolean z6 = bfxc.f115575a;
                }
                synchronized (this.f115857c) {
                    this.f115857c.set(i2, bfwf);
                }
                try {
                    if (this.f115856b.f115736a.addGeofence(i2, this.f115855a, geofenceHardwareRequest, this.f115859e)) {
                        continue;
                        i2++;
                        min = i;
                    }
                } catch (SecurityException e) {
                    boolean z7 = bfxc.f115575a;
                }
                bfzz bfzz2 = this.f115859e;
                synchronized (bfzz2.f115847c) {
                    bfzz2.f115847c.put(i2, 5);
                }
                bfzz2.f115845a.countDown();
                i2++;
                min = i;
            }
            try {
                bfzz bfzz3 = this.f115859e;
                if (bfzz3.f115845a.await(10000, TimeUnit.MILLISECONDS)) {
                    synchronized (bfzz3.f115847c) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < bfzz3.f115847c.size()) {
                                if (bfzz3.f115847c.valueAt(i3) != 0) {
                                    break;
                                }
                                i3++;
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                    }
                } else {
                    boolean z8 = bfxc.f115575a;
                    bfzz3.f115845a = null;
                }
            } catch (InterruptedException e2) {
            }
        } else if (Log.isLoggable("GeofenceHardware", 6)) {
            bfxc.m98133b("GeofenceHardware", "Ongoing add geofence operation.");
        }
        if (!z3) {
            boolean z9 = bfxc.f115575a;
            mo62443a();
            m98375c();
        }
        return z3;
    }
}
