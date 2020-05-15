package p000;

import android.content.Context;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

@Deprecated
/* renamed from: bhde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhde implements axot {

    /* renamed from: a */
    private final bhdg f118319a;

    /* renamed from: b */
    private final Context f118320b;

    public bhde(bhdg bhdg, Context context) {
        this.f118319a = bhdg;
        this.f118320b = context;
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        if ("com/google/android/location/fused/wearable/LOCATION_REQUESTS".equals(messageEventParcelable.f110947b)) {
            axos a = axos.m82822a(messageEventParcelable.f110948c);
            this.f118319a.mo63564a(messageEventParcelable.f110949d, bhdd.m100666a(a, this.f118320b), a.mo53344g("TRIGGER_UPDATE"));
        }
    }
}
