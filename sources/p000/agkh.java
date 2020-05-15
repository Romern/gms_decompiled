package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: agkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f65789a;

    /* renamed from: b */
    final /* synthetic */ agkm f65790b;

    public agkh(agkm agkm, Bundle bundle) {
        this.f65790b = agkm;
        this.f65789a = bundle;
    }

    public final void run() {
        agkm agkm = this.f65790b;
        Bundle bundle = this.f65789a;
        agkm.mo35241h();
        agkm.mo35245l();
        sdo.m34959a(bundle);
        sdo.m34977c(bundle.getString("name"));
        if (!agkm.f65756y.mo35513q()) {
            agkm.mo35497E().f65572k.mo35435a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            agkm.mo35237d().mo35620a(new ConditionalUserPropertyParcel(bundle.getString("app_id"), bundle.getString("origin"), new UserAttributeParcel(bundle.getString("name"), 0, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), agkm.mo35540x().mo35725a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"))));
        } catch (IllegalArgumentException e) {
        }
    }
}
