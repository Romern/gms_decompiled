package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bhbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbi implements GpsStatus.Listener {

    /* renamed from: a */
    public final Object f118237a = new Object();

    /* renamed from: b */
    public final ArrayList f118238b;

    /* renamed from: c */
    public boolean f118239c;

    /* renamed from: d */
    private final LocationManager f118240d;

    /* renamed from: e */
    private GpsStatus f118241e;

    public bhbi(LocationManager locationManager) {
        this.f118240d = locationManager;
        this.f118238b = new ArrayList();
        this.f118239c = false;
    }

    /* renamed from: a */
    public final void mo63519a() {
        if (!this.f118239c || this.f118238b.isEmpty()) {
            this.f118240d.removeGpsStatusListener(this);
        } else {
            this.f118240d.addGpsStatusListener(this);
        }
    }

    public final void onGpsStatusChanged(int i) {
        if (i == 4) {
            try {
                this.f118241e = this.f118240d.getGpsStatus(this.f118241e);
            } catch (NullPointerException e) {
                this.f118241e = null;
            }
            GpsStatus gpsStatus = this.f118241e;
            if (gpsStatus != null) {
                Iterable<GpsSatellite> satellites = gpsStatus.getSatellites();
                synchronized (this.f118237a) {
                    Iterator it = this.f118238b.iterator();
                    while (it.hasNext()) {
                        ((bhbh) it.next()).mo62152a(satellites);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63520a(bhbh bhbh) {
        synchronized (this.f118237a) {
            boolean isEmpty = this.f118238b.isEmpty();
            if (this.f118238b.add(bhbh)) {
                if (isEmpty) {
                    mo63519a();
                }
            }
        }
    }
}
