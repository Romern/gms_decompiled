package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.List;

/* renamed from: aejz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aejz extends dcj implements aekb {
    public aejz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final Location mo34206a() {
        Parcel a = mo8526a(7, mo8529bj());
        Location location = (Location) dcl.m8163a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    /* renamed from: a */
    public final void mo34209a(aehw aehw) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34211a(aejy aejy) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34214a(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34216a(Location location) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34221a(LocationRequest locationRequest, aehw aehw) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34222a(LocationRequest locationRequest, aehw aehw, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34223a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34227a(LocationRequestInternal locationRequestInternal, aehw aehw) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34228a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34230a(List list, PendingIntent pendingIntent, aejy aejy) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34232a(boolean z) {
        throw null;
    }

    /* renamed from: b */
    public final Location mo34235b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(80, bj);
        Location location = (Location) dcl.m8163a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    /* renamed from: b */
    public final void mo34236b(PendingIntent pendingIntent) {
        throw null;
    }

    /* renamed from: b */
    public final void mo34237b(PendingIntent pendingIntent, rnt rnt) {
        throw null;
    }

    /* renamed from: c */
    public final int mo34238c() {
        throw null;
    }

    /* renamed from: c */
    public final void mo34240c(PendingIntent pendingIntent) {
        throw null;
    }

    /* renamed from: c */
    public final void mo34241c(PendingIntent pendingIntent, rnt rnt) {
        throw null;
    }

    /* renamed from: d */
    public final Location mo34242d() {
        throw null;
    }

    /* renamed from: d */
    public final void mo34243d(PendingIntent pendingIntent, rnt rnt) {
        throw null;
    }

    /* renamed from: e */
    public final void mo34244e(PendingIntent pendingIntent, rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final ActivityRecognitionResult mo34207a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(64, bj);
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) dcl.m8163a(a, ActivityRecognitionResult.CREATOR);
        a.recycle();
        return activityRecognitionResult;
    }

    /* renamed from: c */
    public final LocationAvailability mo34239c(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(34, bj);
        LocationAvailability locationAvailability = (LocationAvailability) dcl.m8163a(a, LocationAvailability.CREATOR);
        a.recycle();
        return locationAvailability;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo34208a(long j, boolean z, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        bj.writeLong(j);
        dcl.m8166a(bj, true);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo34210a(aejv aejv) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, aejv);
        mo8528b(67, bj);
    }

    /* renamed from: a */
    public final void mo34212a(PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, pendingIntent);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo34213a(PendingIntent pendingIntent, aejy aejy, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, aejy);
        bj.writeString(str);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo34215a(PendingIntent pendingIntent, rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, rnt);
        mo8528b(73, bj);
    }

    /* renamed from: a */
    public final void mo34217a(Location location, int i) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, location);
        bj.writeInt(1);
        mo8528b(26, bj);
    }

    /* renamed from: a */
    public final void mo34218a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, activityRecognitionRequest);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, rnt);
        mo8528b(70, bj);
    }

    /* renamed from: a */
    public final void mo34219a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, activityTransitionRequest);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, rnt);
        mo8528b(72, bj);
    }

    /* renamed from: a */
    public final void mo34220a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, aejy aejy) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, geofencingRequest);
        dcl.m8165a(bj, pendingIntent);
        dcl.m8164a(bj, aejy);
        mo8528b(57, bj);
    }

    /* renamed from: a */
    public final void mo34224a(LocationSettingsRequest locationSettingsRequest, aeke aeke, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, locationSettingsRequest);
        dcl.m8164a(bj, aeke);
        bj.writeString(str);
        mo8528b(63, bj);
    }

    /* renamed from: a */
    public final void mo34225a(RemoveGeofencingRequest removeGeofencingRequest, aejy aejy) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, removeGeofencingRequest);
        dcl.m8164a(bj, aejy);
        mo8528b(74, bj);
    }

    /* renamed from: a */
    public final void mo34226a(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deviceOrientationRequestUpdateData);
        mo8528b(75, bj);
    }

    /* renamed from: a */
    public final void mo34229a(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, locationRequestUpdateData);
        mo8528b(59, bj);
    }

    /* renamed from: a */
    public final void mo34231a(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(71, bj);
    }

    /* renamed from: a */
    public final void mo34233a(String[] strArr, aejy aejy, String str) {
        Parcel bj = mo8529bj();
        bj.writeStringArray(strArr);
        dcl.m8164a(bj, aejy);
        bj.writeString(str);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final boolean mo34234a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        Parcel a = mo8526a(77, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
