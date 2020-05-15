package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

/* renamed from: bfyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyl extends bfyv {

    /* renamed from: a */
    public final GeofencingRequest f115696a;

    /* renamed from: b */
    public final PendingIntent f115697b;

    /* renamed from: c */
    public final bgad f115698c;

    public bfyl(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, bgad bgad) {
        super(4);
        this.f115696a = geofencingRequest;
        this.f115697b = pendingIntent;
        this.f115698c = bgad;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62422a() {
        bgad bgad = this.f115698c;
        int intValue = ((Integer) mo62450b()).intValue();
        List list = this.f115696a.f79341a;
        String[] strArr = new String[list.size()];
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i] = ((ParcelableGeofence) list.get(i2)).f79438a;
            i++;
        }
        aejy aejy = bgad.f115862a;
        if (aejy != null) {
            try {
                aejy.mo34204a(intValue, strArr);
            } catch (RemoteException e) {
            }
        }
    }

    public final String toString() {
        return "AddGeofenceRequest[GeofencingRequest=" + this.f115696a + ", pendingIntent=PendingIntent[creatorPackage=" + bhcb.m100621a(this.f115697b) + "]";
    }
}
