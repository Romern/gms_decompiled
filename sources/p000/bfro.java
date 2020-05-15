package p000;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfro {

    /* renamed from: a */
    private final Context f115046a;

    /* renamed from: b */
    private final bhbl f115047b;

    /* renamed from: c */
    private WeakReference f115048c = new WeakReference(null);

    /* renamed from: d */
    private boolean f115049d;

    /* renamed from: e */
    private boolean f115050e;

    /* renamed from: f */
    private boolean f115051f;

    /* renamed from: g */
    private boolean f115052g;

    /* renamed from: h */
    private boolean f115053h;

    /* renamed from: i */
    private WeakReference f115054i = new WeakReference(null);

    public bfro(Context context, Looper looper) {
        this.f115046a = context;
        this.f115047b = new bhbl(context, new adzt(looper));
    }

    /* renamed from: a */
    public static Location m97633a(Location location, boolean z) {
        Location location2 = new Location(location);
        location2.setExtras(null);
        if (aeim.m51897c(location)) {
            aeim.m51894b(location2, aeim.m51893b(location));
        }
        if (aeim.m51898d(location)) {
            aeim.m51889a(location2, aeim.m51900e(location));
        }
        if (aeim.m51904h(location)) {
            aeim.m51885a(location2, aeim.m51905i(location));
        }
        if (z) {
            aeim.m51908l(location2);
        }
        return location2;
    }

    /* renamed from: a */
    public final Location mo62187a(Location location, boolean z, boolean z2) {
        Location location2;
        Location a;
        if (location == null) {
            return null;
        }
        if (z && z2) {
            return location;
        }
        boolean k = aeim.m51907k(location);
        if (z2 || k) {
            return m97633a(location, k);
        }
        if (cevw.m138330o()) {
            location2 = m97633a(location, false);
        } else {
            location2 = aeim.m51884a(location, "noGPSLocation");
        }
        if (location2 == null) {
            return null;
        }
        bhbl bhbl = this.f115047b;
        synchronized (bhbl.f118253a) {
            a = aeim.m51884a(location2, "coarseLocation");
            if (a == null) {
                a = bhbl.mo63523a(location2);
            } else if (a.getAccuracy() < bhbl.f118254b) {
                a = bhbl.mo63523a(location2);
            }
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo62188a(List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        List list3;
        if (this.f115048c.get() == list && this.f115049d == z && this.f115050e == z2 && this.f115051f == z3 && this.f115052g == z4 && this.f115053h == z5 && (list3 = (List) this.f115054i.get()) != null) {
            return list3;
        }
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location = (Location) it.next();
            Location location2 = null;
            if (location != null) {
                if (!aeim.m51907k(location) && !z3) {
                    if (z4) {
                        String provider = location.getProvider();
                        if ("fused".equals(provider)) {
                        }
                    }
                }
                location2 = mo62187a(location, z, z2);
            }
            if (location2 != null) {
                list2.add(location2);
            }
        }
        this.f115048c = new WeakReference(list);
        this.f115049d = z;
        this.f115050e = z2;
        this.f115051f = z3;
        this.f115052g = z4;
        this.f115053h = z5;
        this.f115054i = new WeakReference(list2);
        return list2;
    }
}
