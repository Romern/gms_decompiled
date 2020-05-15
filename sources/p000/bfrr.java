package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bfrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfrr extends bfow implements bhbz {

    /* renamed from: a */
    private final bhca f115066a;

    /* renamed from: b */
    private Collection f115067b = Collections.emptyList();

    /* renamed from: c */
    private final ArrayList f115068c = new ArrayList();

    /* renamed from: d */
    private boolean f115069d = false;

    /* renamed from: f */
    private boolean f115070f = false;

    public bfrr(Context context, Looper looper, bfrc bfrc) {
        super(bfrc);
        this.f115066a = new bhca(context, this, looper);
    }

    /* renamed from: c */
    private final void m97647c(boolean z) {
        Collection collection = this.f115067b;
        if (this.f115069d) {
            if (!collection.isEmpty() && this.f115068c.isEmpty()) {
                this.f115068c.ensureCapacity(this.f115067b.size());
                int minPriority = (int) cesq.f183407a.mo6606a().minPriority();
                for (LocationRequestInternal locationRequestInternal : this.f115067b) {
                    LocationRequest locationRequest = locationRequestInternal.f79420b;
                    int i = locationRequest.f79349a;
                    if (i != 100) {
                        if (i == 102) {
                            if (locationRequest.f79350b >= (locationRequest.mo43555c() ? cesq.m138192b() : cesq.m138193c())) {
                            }
                        }
                    }
                    long b = locationRequest.mo43555c() ? cesq.m138192b() : cesq.m138193c();
                    if (locationRequest.f79350b < b && locationRequest.f79349a >= minPriority) {
                        LocationRequest locationRequest2 = new LocationRequest(locationRequest);
                        locationRequestInternal = LocationRequestInternal.m66888a(locationRequestInternal);
                        locationRequestInternal.mo43612a(locationRequest2);
                        locationRequest2.mo43554c(b);
                    }
                    this.f115068c.add(locationRequestInternal);
                }
                collection = this.f115068c;
            } else {
                collection = this.f115068c;
            }
        }
        bfrc bfrc = this.f114732e;
        boolean z2 = false;
        if (!this.f115069d && z) {
            z2 = true;
        }
        bfrc.mo62059a(collection, z2);
    }

    /* renamed from: a */
    public final void mo62058a() {
        if (!this.f115070f) {
            this.f115070f = true;
            this.f115066a.mo63543a();
            this.f114732e.mo62058a();
        }
    }

    /* renamed from: b */
    public final void mo62061b() {
        if (this.f115070f) {
            this.f115070f = false;
            this.f115066a.mo63545b();
            this.f114732e.mo62061b();
        }
    }

    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        this.f115067b = collection;
        this.f115068c.clear();
        m97647c(z);
    }

    /* renamed from: b */
    public final void mo62189b(boolean z) {
        if (z != this.f115069d) {
            this.f115069d = z;
            m97647c(false);
        }
    }
}
