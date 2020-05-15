package p000;

import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bfwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwp implements bfwe {

    /* renamed from: c */
    final ArrayList f115523c;

    /* renamed from: d */
    bfwf f115524d = null;

    /* renamed from: e */
    private final ArrayList f115525e;

    /* renamed from: f */
    private final ArrayList f115526f = new ArrayList(1);

    /* renamed from: g */
    private final bfvz f115527g = new bfvz();

    /* renamed from: h */
    private Location f115528h = null;

    /* renamed from: i */
    private long f115529i = -1;

    /* renamed from: j */
    private double f115530j = 1.0d;

    /* renamed from: k */
    private int f115531k = 0;

    /* renamed from: l */
    private final bfww f115532l;

    public bfwp(bfww bfww) {
        ArrayList arrayList = new ArrayList(100);
        this.f115523c = arrayList;
        this.f115526f.add(arrayList);
        this.f115525e = new ArrayList();
        this.f115532l = bfww;
    }

    /* renamed from: a */
    private final void m98084a(Iterable iterable, int i, long j, Location location) {
        int i2 = i;
        ArrayList arrayList = new ArrayList(i2);
        this.f115525e.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            for (bfwf bfwf : (Iterable) it.next()) {
                if (bfwf.mo62354b() != Double.MAX_VALUE) {
                    arrayList.add(bfwf);
                }
                if (bfwf.mo62355c()) {
                    this.f115525e.add(bfwf);
                }
            }
        }
        if (arrayList.size() <= 100) {
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(148);
            sb.append("Number of Geofences with known distances (");
            sb.append(size);
            sb.append(") is not larger than mMaxGeofencesToTrack (100). setUpdateWindow() shouldn't be called.");
            Log.wtf("NearbyLocationUpdater", new IllegalStateException(sb.toString()));
        }
        if (arrayList.size() != i2) {
            int size2 = arrayList.size();
            StringBuilder sb2 = new StringBuilder(162);
            sb2.append("All Geofences should have known distances when setUpdateWindow() is called. Number of Geofences with known distances is ");
            sb2.append(size2);
            sb2.append(", expected value is ");
            sb2.append(i2);
            Log.wtf("NearbyLocationUpdater", new IllegalStateException(sb2.toString()));
        }
        this.f115523c.clear();
        List a = bnny.m109908a(f115481a).mo68162a(arrayList, 101);
        for (int i3 = 0; i3 < 100; i3++) {
            this.f115523c.add((bfwf) a.get(i3));
        }
        Iterator it2 = this.f115525e.iterator();
        while (it2.hasNext()) {
            bfwf bfwf2 = (bfwf) it2.next();
            if (!this.f115523c.contains(bfwf2)) {
                this.f115523c.add(bfwf2);
            } else {
                it2.remove();
            }
        }
        bfwf bfwf3 = (bfwf) a.get(a.size() - 1);
        bfww bfww = this.f115532l;
        if (bfww != null) {
            bfww.mo62405b();
        }
        double b = bfwf3.mo62354b();
        aehf aehf = new aehf();
        aehf.mo34147b();
        ParcelableGeofence parcelableGeofence = bfwf3.f115483a;
        String format = String.format(Locale.US, "Sentinel of '%s (%.6f, %.6f) %.0fm, %ds, %.0fm to boundary'", parcelableGeofence.f79438a, Double.valueOf(parcelableGeofence.f79441d), Double.valueOf(parcelableGeofence.f79442e), Float.valueOf(parcelableGeofence.f79443f), Integer.valueOf(parcelableGeofence.f79445h / 1000), Double.valueOf(bfwf3.mo62354b()));
        aehf.f63388a = format.substring(0, Math.min(100, format.length()));
        aehf.f63389b = 3;
        aehf.mo34146a(location.getLatitude(), location.getLongitude(), (float) b);
        bfwf bfwf4 = new bfwf(aehf.mo34145a(), 5, null, -3, "");
        this.f115524d = bfwf4;
        bfwf4.mo62349a(j, location);
        bfxa.f115569a.mo62411a(15824420, 3, this.f115524d);
        boolean z = bfxc.f115575a;
        this.f115531k = 0;
        ArrayList arrayList2 = this.f115523c;
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            for (bfwf bfwf5 : (Iterable) it3.next()) {
                if (!arrayList2.contains(bfwf5)) {
                    bfwf5.f115493k.f115514c = Double.MAX_VALUE;
                    bfwf5.f115488f = false;
                }
            }
        }
    }

    /* renamed from: b */
    public final List mo62343b(Iterable iterable, int i) {
        return mo62390a(iterable, i, f115481a);
    }

    /* renamed from: c */
    public final List mo62344c(Iterable iterable, int i) {
        if (!m98085a()) {
            return this.f115527g.mo62344c(iterable, i);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f115523c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            bfwf bfwf = (bfwf) arrayList2.get(i2);
            if (bfwf.mo62355c()) {
                arrayList.add(bfwf);
            }
        }
        if (arrayList.size() != 0) {
            return bnny.m109908a(f115482b).mo68162a(arrayList, i);
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m98085a() {
        return this.f115523c.size() > 0;
    }

    /* renamed from: a */
    public final bfwc mo62336a(Iterable iterable, int i, long j, Location location, double d, Map map) {
        bfwc bfwc;
        boolean z;
        ArrayList arrayList;
        bfww bfww;
        long j2 = j;
        Location location2 = location;
        double d2 = d;
        SystemClock.elapsedRealtime();
        if (i <= 100) {
            if (!(!cewy.m138375b() || this.f115524d == null || (bfww = this.f115532l) == null)) {
                bfww.mo62405b();
            }
            this.f115523c.clear();
            this.f115524d = null;
            bfxa.f115569a.mo62411a(-807398311, 3, this.f115524d);
            bfwc = this.f115527g.mo62336a(iterable, i, j, location, d, map);
            this.f115531k = 0;
        } else {
            rzz.m34729a(this.f115523c.size() == 0 || this.f115523c.size() >= 100);
            rzz.m34729a((this.f115523c.size() == 0) == (this.f115524d == null));
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                for (bfwf bfwf : (Iterable) it.next()) {
                    if (bfwf.mo62354b() == Double.MAX_VALUE && bfwf.f115488f) {
                        i2++;
                    }
                }
            }
            boolean a = m98085a();
            bfwf bfwf2 = this.f115524d;
            if (bfwf2 != null) {
                ParcelableGeofence parcelableGeofence = bfwf2.f115483a;
                z = ayuo.m84846b(parcelableGeofence.f79441d, parcelableGeofence.f79442e, location.getLatitude(), location.getLongitude()) < ((double) parcelableGeofence.f79443f);
            } else {
                z = false;
            }
            int i3 = this.f115531k;
            boolean z2 = bfxc.f115575a;
            if (i2 == 0) {
                if (a && z && i3 < 5) {
                    bfwc = this.f115527g.mo62336a(this.f115526f, this.f115523c.size(), j, location, d, map);
                    this.f115524d.mo62349a(j2, location2);
                    List a2 = mo62338a(iterable, d2, 1);
                    if (a2 != null && a2.size() == 1 && a2.get(0) == this.f115524d) {
                        this.f115531k++;
                        boolean z3 = bfxc.f115575a;
                    } else {
                        this.f115531k = 0;
                    }
                    if (!(bfwc == null || (arrayList = bfwc.f115479c) == null || arrayList.size() <= 0)) {
                        Iterator it2 = this.f115523c.iterator();
                        while (it2.hasNext()) {
                            bfwf bfwf3 = (bfwf) it2.next();
                            if (!bfwf3.mo62355c() && this.f115525e.contains(bfwf3)) {
                                it2.remove();
                                this.f115525e.remove(bfwf3);
                                boolean z4 = bfxc.f115575a;
                            }
                        }
                    }
                }
            }
            bfwc = this.f115527g.mo62336a(iterable, i, j, location, d, map);
            m98084a(iterable, i, j, location);
        }
        boolean z5 = bfxc.f115575a;
        this.f115528h = location2;
        this.f115529i = j2;
        this.f115530j = d2;
        return bfwc;
    }

    /* renamed from: a */
    public final List mo62337a(Iterable iterable) {
        return this.f115527g.mo62337a(iterable);
    }

    /* renamed from: a */
    public final List mo62338a(Iterable iterable, double d, int i) {
        return mo62390a(iterable, i, new bfwd(d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo62390a(Iterable iterable, int i, Comparator comparator) {
        if (!m98085a()) {
            return this.f115527g.mo62339a(iterable, i, comparator);
        }
        ArrayList arrayList = new ArrayList(this.f115523c.size() + 1);
        arrayList.addAll(this.f115523c);
        arrayList.add(this.f115524d);
        return bnny.m109908a(comparator).mo68162a(arrayList, i);
    }

    /* renamed from: a */
    public final void mo62341a(PrintWriter printWriter) {
        printWriter.println("Location updater: NearbyGeofenceLocationUpdater.");
        if (this.f115523c.size() == 0) {
            printWriter.println("    Monitoring all now.");
        } else {
            printWriter.println("    Monitoring:");
            ArrayList arrayList = this.f115523c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String valueOf = String.valueOf((bfwf) arrayList.get(i));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
                sb.append("    ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            }
        }
        String valueOf2 = String.valueOf(this.f115524d);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
        sb2.append("    Sentinel geofence: ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
    }

    /* renamed from: a */
    public final void mo62342a(Iterable iterable, int i) {
        Location location;
        this.f115527g.mo62340a();
        if (i > 100 && (location = this.f115528h) != null) {
            this.f115527g.mo62336a(iterable, i, this.f115529i, location, this.f115530j, null);
            m98084a(iterable, i, this.f115529i, this.f115528h);
            return;
        }
        this.f115523c.clear();
        this.f115524d = null;
        this.f115531k = 0;
    }
}
