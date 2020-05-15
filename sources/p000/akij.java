package p000;

import android.content.Context;
import android.content.IntentSender;
import android.location.LocationManager;
import android.os.Build;
import com.google.android.chimera.Activity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;

/* renamed from: akij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akij {
    /* renamed from: a */
    public static aucb m59822a(Activity activity) {
        if (m59823a((Context) activity)) {
            return aucu.m76778a((Object) null);
        }
        return aucu.m76780a(ahhr.m55807c(), new akii(activity));
    }

    /* renamed from: b */
    static final /* synthetic */ void m59824b(Activity activity) {
        rjp rjp;
        aeig aeig = new aeig();
        aeig.f63417b = true;
        aeig.mo34172a(LocationRequest.m66854a());
        LocationSettingsRequest a = aeig.mo34171a();
        rjx b = aeie.m51877b(activity);
        roz b2 = rpa.m34196b();
        b2.f43472a = new aeip(a);
        aucb a2 = b.mo24701a(b2.mo24977a());
        int b3 = ahhf.m55776b("setLocation", a2, 3000);
        if (b3 == 0) {
            return;
        }
        if (b3 != 6 || (rjp = (rjp) a2.mo50387e()) == null) {
            throw new Exception(String.format("Failed to enable location. Result code returned: %d", Integer.valueOf(b3)));
        }
        try {
            new rki(rjp.f43152a).mo24808a(activity.getContainerActivity(), 1005);
        } catch (IntentSender.SendIntentException e) {
            throw new Exception(e);
        }
    }

    /* renamed from: a */
    public static boolean m59823a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((LocationManager) context.getSystemService("location")).isLocationEnabled();
    }
}
