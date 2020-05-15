package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: dvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvp extends drx {

    /* renamed from: c */
    private final Collection f14206c;

    /* renamed from: d */
    private final List f14207d;

    /* renamed from: e */
    private final PendingIntent f14208e;

    public dvp(Collection collection, PendingIntent pendingIntent, Collection collection2) {
        super("UpdateGeofencesOperation");
        boolean z = true;
        if ((collection2 == null || collection2.isEmpty()) && (collection == null || collection.isEmpty() || pendingIntent == null)) {
            z = false;
        }
        sdo.m34974b(z);
        this.f14206c = collection;
        ArrayList arrayList = null;
        if (collection2 != null && !collection2.isEmpty()) {
            arrayList = new ArrayList(collection2.size());
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParcelableGeofence) it.next()).f79438a);
            }
        }
        this.f14207d = arrayList;
        this.f14208e = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        rjx a = aeie.m51876a(dwq.m9662f());
        List list = this.f14207d;
        if (list != null && !list.isEmpty()) {
            a.mo24697a(this.f14207d).mo50371a(new dqi("[UpdateGeofencesOperation] remove geofences %s", this.f14207d));
        }
        Collection collection = this.f14206c;
        if (collection != null && !collection.isEmpty()) {
            aehm aehm = new aehm();
            for (ParcelableGeofence parcelableGeofence : this.f14206c) {
                aehm.mo34150a(parcelableGeofence);
            }
            a.mo24684a(aehm.mo34149a(), this.f14208e).mo50371a(new dqi("[UpdateGeofencesOperation] add geofences %s", this.f14206c));
        }
    }
}
