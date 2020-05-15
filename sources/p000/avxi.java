package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;

/* renamed from: avxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxi extends dcj implements avxk {
    public avxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.userlocation.internal.ISemanticLocationProviderClient");
    }

    /* renamed from: a */
    public final void mo51686a(UserLocationParameters userLocationParameters, avxg avxg, CheckInReport checkInReport) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51687a(UserLocationParameters userLocationParameters, avxh avxh) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51689a(UserLocationParameters userLocationParameters, rnt rnt, avxh avxh, SemanticLocationUpdateRequest semanticLocationUpdateRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51691a(UserLocationParameters userLocationParameters, rnt rnt, CheckInReport checkInReport) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51692a(UserLocationParameters userLocationParameters, rnt rnt, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51695a(UserLocationParameters userLocationParameters, rnt rnt, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo51696b(UserLocationParameters userLocationParameters, avxh avxh) {
        throw null;
    }

    /* renamed from: b */
    public final void mo51698b(UserLocationParameters userLocationParameters, rnt rnt, String str) {
        throw null;
    }

    /* renamed from: c */
    public final void mo51699c(UserLocationParameters userLocationParameters, rnt rnt, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userLocationParameters);
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        mo8528b(11, bj);
    }

    /* renamed from: b */
    public final void mo51697b(UserLocationParameters userLocationParameters, rnt rnt, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userLocationParameters);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo51688a(UserLocationParameters userLocationParameters, rnt rnt, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userLocationParameters);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo51690a(UserLocationParameters userLocationParameters, rnt rnt, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userLocationParameters);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, placefencingRequest);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo51693a(UserLocationParameters userLocationParameters, rnt rnt, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userLocationParameters);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, semanticLocationEventRequest);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8165a(bj, pendingIntent2);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo51694a(UserLocationParameters userLocationParameters, rnt rnt, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, userLocationParameters);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, userLocationNearbyAlertRequest);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8165a(bj, pendingIntent2);
        mo8528b(12, bj);
    }
}
