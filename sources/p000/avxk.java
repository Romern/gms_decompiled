package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;

/* renamed from: avxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface avxk extends IInterface {
    /* renamed from: a */
    void mo51686a(UserLocationParameters userLocationParameters, avxg avxg, CheckInReport checkInReport);

    /* renamed from: a */
    void mo51687a(UserLocationParameters userLocationParameters, avxh avxh);

    /* renamed from: a */
    void mo51688a(UserLocationParameters userLocationParameters, rnt rnt, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo51689a(UserLocationParameters userLocationParameters, rnt rnt, avxh avxh, SemanticLocationUpdateRequest semanticLocationUpdateRequest);

    /* renamed from: a */
    void mo51690a(UserLocationParameters userLocationParameters, rnt rnt, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo51691a(UserLocationParameters userLocationParameters, rnt rnt, CheckInReport checkInReport);

    /* renamed from: a */
    void mo51692a(UserLocationParameters userLocationParameters, rnt rnt, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo51693a(UserLocationParameters userLocationParameters, rnt rnt, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2);

    /* renamed from: a */
    void mo51694a(UserLocationParameters userLocationParameters, rnt rnt, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2);

    /* renamed from: a */
    void mo51695a(UserLocationParameters userLocationParameters, rnt rnt, String str);

    /* renamed from: b */
    void mo51696b(UserLocationParameters userLocationParameters, avxh avxh);

    /* renamed from: b */
    void mo51697b(UserLocationParameters userLocationParameters, rnt rnt, PendingIntent pendingIntent);

    /* renamed from: b */
    void mo51698b(UserLocationParameters userLocationParameters, rnt rnt, String str);

    /* renamed from: c */
    void mo51699c(UserLocationParameters userLocationParameters, rnt rnt, String str);
}
