package p000;

import android.os.Looper;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aesj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aesj {

    /* renamed from: a */
    public Collection f63727a;

    /* renamed from: b */
    private final aesh f63728b;

    /* renamed from: c */
    private final aehy f63729c;

    /* renamed from: d */
    private final Looper f63730d;

    /* renamed from: e */
    private Collection f63731e;

    /* renamed from: f */
    private LocationResult f63732f;

    /* renamed from: g */
    private final rjx f63733g;

    @Deprecated
    public aesj(aesh aesh, aehy aehy, Looper looper) {
        this.f63728b = aesh;
        this.f63733g = null;
        this.f63729c = aehy;
        this.f63730d = looper;
        this.f63727a = Collections.emptyList();
        this.f63731e = Collections.emptyList();
        this.f63732f = null;
    }

    /* renamed from: a */
    public final synchronized void mo34510a(LocationResult locationResult) {
        LocationResult locationResult2 = this.f63732f;
        if (locationResult2 != null) {
            if (locationResult2.equals(locationResult)) {
                return;
            }
        }
        this.f63729c.mo9910a(locationResult);
        this.f63732f = locationResult;
    }

    /* renamed from: a */
    public final synchronized void mo34511a(Collection collection, boolean z) {
        List list;
        List<LocationRequestInternal> list2;
        if (!z) {
            if (this.f63727a.equals(collection)) {
                return;
            }
        }
        if (collection.isEmpty()) {
            list2 = Collections.emptyList();
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            ArrayList arrayList2 = new ArrayList(collection.size());
            list2 = arrayList;
            list = arrayList2;
        }
        for (LocationRequestInternal locationRequestInternal : list2) {
            aesi aesi = new aesi(this);
            list.add(aesi);
            aesh aesh = this.f63728b;
            if (aesh != null) {
                aesh.mo34505a(locationRequestInternal, aesi, this.f63730d);
            } else {
                this.f63733g.mo24725a(locationRequestInternal, aesi, this.f63730d);
            }
        }
        for (aehy aehy : this.f63731e) {
            aesh aesh2 = this.f63728b;
            if (aesh2 != null) {
                aesh2.mo34502a(aehy);
            } else {
                this.f63733g.mo24716a(aehy);
            }
        }
        this.f63727a = list2;
        this.f63731e = list;
        this.f63732f = null;
    }

    public aesj(rjx rjx, aehy aehy, Looper looper) {
        this.f63733g = rjx;
        this.f63728b = null;
        this.f63729c = aehy;
        this.f63730d = looper;
        this.f63727a = Collections.emptyList();
        this.f63731e = Collections.emptyList();
        this.f63732f = null;
    }
}
