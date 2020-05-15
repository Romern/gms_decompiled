package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;
import java.util.Locale;

/* renamed from: bjdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdj extends avxj implements aaai {

    /* renamed from: a */
    private final aaag f122549a;

    /* renamed from: b */
    private final bidi f122550b;

    /* renamed from: c */
    private final bidx f122551c;

    /* renamed from: d */
    private final bhpt f122552d;

    public bjdj(bidx bidx, bidi bidi, aaag aaag, bhpt bhpt) {
        this.f122551c = bidx;
        this.f122550b = bidi;
        this.f122549a = aaag;
        this.f122552d = bhpt;
    }

    /* renamed from: a */
    static PlacesParams m103218a(UserLocationParameters userLocationParameters) {
        String str = userLocationParameters.f109605b.f109602a;
        if ("com.google.android.gms".equals(str)) {
            return new PlacesParams(str, Locale.getDefault(), userLocationParameters.f109604a, userLocationParameters.f109605b.f109603b, 0);
        }
        return new PlacesParams(str, Locale.getDefault(), userLocationParameters.f109604a);
    }

    /* renamed from: b */
    public final void mo51696b(UserLocationParameters userLocationParameters, avxh avxh) {
        m103219a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bier(avxh), "EstimateCurrentSemanticLocation", this.f122552d), avxh);
    }

    /* renamed from: c */
    public final void mo51699c(UserLocationParameters userLocationParameters, rnt rnt, String str) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifv(str, rnt), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.f122552d), rnt);
    }

    /* renamed from: b */
    public final void mo51697b(UserLocationParameters userLocationParameters, rnt rnt, PendingIntent pendingIntent) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifw(pendingIntent, rnt), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.f122552d), rnt);
    }

    /* renamed from: a */
    private final void m103219a(biew biew, avxh avxh) {
        if (cggy.m145392c()) {
            avxh.mo51685a(Status.f30112f, (SemanticLocation) null);
        } else {
            this.f122549a.mo16658a(biew);
        }
    }

    /* renamed from: b */
    public final void mo51698b(UserLocationParameters userLocationParameters, rnt rnt, String str) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifr(str, rnt), "UnregisterSemanticLocationUpdates", this.f122552d), rnt);
    }

    /* renamed from: a */
    private final void m103220a(biew biew, rnt rnt) {
        if (cggy.m145392c()) {
            rnt.mo11797a(Status.f30107a);
        } else {
            this.f122549a.mo16658a(biew);
        }
    }

    /* renamed from: a */
    private static void m103221a(rnt rnt) {
        try {
            rnt.mo11797a(rjs.m33676a(26000, "The supplied PendingIntent was not created by your application."));
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    private final boolean m103222a(PendingIntent pendingIntent, PlacesParams placesParams) {
        return this.f122550b.f120299b.equals("com.google.android.gms") || placesParams.f79572b.equals(pendingIntent.getTargetPackage());
    }

    /* renamed from: a */
    public final void mo51686a(UserLocationParameters userLocationParameters, avxg avxg, CheckInReport checkInReport) {
        biew biew = new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifi(checkInReport, avxg), "ReportCheckIn", this.f122552d);
        if (cggy.m145392c()) {
            avxg.mo51684a(Status.f30112f, null);
        } else {
            this.f122549a.mo16658a(biew);
        }
    }

    /* renamed from: a */
    public final void mo51687a(UserLocationParameters userLocationParameters, avxh avxh) {
        PlacesParams a = m103218a(userLocationParameters);
        m103219a(new biew(a, this.f122550b, this.f122551c, new biet(a.f79574d, avxh), "GetLastKnownSemanticLocation", this.f122552d), avxh);
    }

    /* renamed from: a */
    public final void mo51688a(UserLocationParameters userLocationParameters, rnt rnt, PendingIntent pendingIntent) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifx(pendingIntent, rnt), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.f122552d), rnt);
    }

    /* renamed from: a */
    public final void mo51689a(UserLocationParameters userLocationParameters, rnt rnt, avxh avxh, SemanticLocationUpdateRequest semanticLocationUpdateRequest) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifc(semanticLocationUpdateRequest, rnt, avxh), "RegisterForSemanticLocationUpdates", this.f122552d), rnt);
    }

    /* renamed from: a */
    public final void mo51690a(UserLocationParameters userLocationParameters, rnt rnt, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent) {
        PlacesParams a = m103218a(userLocationParameters);
        if (m103222a(pendingIntent, a)) {
            m103220a(new biew(a, this.f122550b, this.f122551c, new bifs(placefencingRequest, pendingIntent, rnt), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.f122552d), rnt);
            return;
        }
        m103221a(rnt);
    }

    /* renamed from: a */
    public final void mo51691a(UserLocationParameters userLocationParameters, rnt rnt, CheckInReport checkInReport) {
        mo51686a(userLocationParameters, new avxf(rnt), checkInReport);
    }

    /* renamed from: a */
    public final void mo51692a(UserLocationParameters userLocationParameters, rnt rnt, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent) {
        PlacesParams a = m103218a(userLocationParameters);
        if (m103222a(pendingIntent, a)) {
            m103220a(new biew(a, this.f122550b, this.f122551c, new bifb(semanticLocationEventRequest, rnt, pendingIntent), "RegisterForSemanticLocationEvents", this.f122552d), rnt);
            return;
        }
        m103221a(rnt);
    }

    /* renamed from: a */
    public final void mo51693a(UserLocationParameters userLocationParameters, rnt rnt, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifu(semanticLocationEventRequest, rnt, pendingIntent, pendingIntent2), "RegisterSemanticLocationEventsByPendingIntentOperation", this.f122552d), rnt);
    }

    /* renamed from: a */
    public final void mo51694a(UserLocationParameters userLocationParameters, rnt rnt, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bift(userLocationNearbyAlertRequest, pendingIntent, pendingIntent2, rnt), "UnregisterSemanticLocationEventsByPendingIntentOperation", this.f122552d), rnt);
    }

    /* renamed from: a */
    public final void mo51695a(UserLocationParameters userLocationParameters, rnt rnt, String str) {
        m103220a(new biew(m103218a(userLocationParameters), this.f122550b, this.f122551c, new bifq(str, rnt), "UnregisterSemanticLocationEvents", this.f122552d), rnt);
    }
}
