package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: agkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f65787a;

    /* renamed from: b */
    final /* synthetic */ agkm f65788b;

    public agkg(agkm agkm, Bundle bundle) {
        this.f65788b = agkm;
        this.f65787a = bundle;
    }

    public final void run() {
        agkm agkm = this.f65788b;
        Bundle bundle = this.f65787a;
        agkm.mo35241h();
        agkm.mo35245l();
        sdo.m34959a(bundle);
        sdo.m34977c(bundle.getString("name"));
        sdo.m34977c(bundle.getString("origin"));
        sdo.m34959a(bundle.get("value"));
        if (!agkm.f65756y.mo35513q()) {
            agkm.mo35497E().f65572k.mo35435a("Conditional property not set since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            EventParcel a = agkm.mo35540x().mo35725a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0);
            agkm.mo35237d().mo35620a(new ConditionalUserPropertyParcel(bundle.getString("app_id"), bundle.getString("origin"), userAttributeParcel, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), agkm.mo35540x().mo35725a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0), bundle.getLong("trigger_timeout"), a, bundle.getLong("time_to_live"), agkm.mo35540x().mo35725a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0)));
        } catch (IllegalArgumentException e) {
        }
    }
}
