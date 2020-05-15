package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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

/* renamed from: aekb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aekb extends IInterface {
    @Deprecated
    /* renamed from: a */
    Location mo34206a();

    /* renamed from: a */
    ActivityRecognitionResult mo34207a(String str);

    /* renamed from: a */
    void mo34208a(long j, boolean z, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo34209a(aehw aehw);

    /* renamed from: a */
    void mo34210a(aejv aejv);

    /* renamed from: a */
    void mo34211a(aejy aejy);

    /* renamed from: a */
    void mo34212a(PendingIntent pendingIntent);

    /* renamed from: a */
    void mo34213a(PendingIntent pendingIntent, aejy aejy, String str);

    /* renamed from: a */
    void mo34214a(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, rnt rnt);

    /* renamed from: a */
    void mo34215a(PendingIntent pendingIntent, rnt rnt);

    /* renamed from: a */
    void mo34216a(Location location);

    /* renamed from: a */
    void mo34217a(Location location, int i);

    /* renamed from: a */
    void mo34218a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, rnt rnt);

    /* renamed from: a */
    void mo34219a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, rnt rnt);

    /* renamed from: a */
    void mo34220a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, aejy aejy);

    /* renamed from: a */
    void mo34221a(LocationRequest locationRequest, aehw aehw);

    /* renamed from: a */
    void mo34222a(LocationRequest locationRequest, aehw aehw, String str);

    /* renamed from: a */
    void mo34223a(LocationRequest locationRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo34224a(LocationSettingsRequest locationSettingsRequest, aeke aeke, String str);

    /* renamed from: a */
    void mo34225a(RemoveGeofencingRequest removeGeofencingRequest, aejy aejy);

    /* renamed from: a */
    void mo34226a(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData);

    /* renamed from: a */
    void mo34227a(LocationRequestInternal locationRequestInternal, aehw aehw);

    /* renamed from: a */
    void mo34228a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo34229a(LocationRequestUpdateData locationRequestUpdateData);

    /* renamed from: a */
    void mo34230a(List list, PendingIntent pendingIntent, aejy aejy);

    /* renamed from: a */
    void mo34231a(rnt rnt);

    /* renamed from: a */
    void mo34232a(boolean z);

    /* renamed from: a */
    void mo34233a(String[] strArr, aejy aejy, String str);

    /* renamed from: a */
    boolean mo34234a(int i);

    /* renamed from: b */
    Location mo34235b(String str);

    /* renamed from: b */
    void mo34236b(PendingIntent pendingIntent);

    /* renamed from: b */
    void mo34237b(PendingIntent pendingIntent, rnt rnt);

    /* renamed from: c */
    int mo34238c();

    /* renamed from: c */
    LocationAvailability mo34239c(String str);

    /* renamed from: c */
    void mo34240c(PendingIntent pendingIntent);

    /* renamed from: c */
    void mo34241c(PendingIntent pendingIntent, rnt rnt);

    @Deprecated
    /* renamed from: d */
    Location mo34242d();

    @Deprecated
    /* renamed from: d */
    void mo34243d(PendingIntent pendingIntent, rnt rnt);

    /* renamed from: e */
    void mo34244e(PendingIntent pendingIntent, rnt rnt);
}
