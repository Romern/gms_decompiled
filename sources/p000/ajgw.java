package p000;

import android.content.Context;
import android.os.WorkSource;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Set;

/* renamed from: ajgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgw {
    /* renamed from: a */
    public static WorkSource m58695a(Context context) {
        WorkSource workSource = null;
        for (ClientAppIdentifier clientAppIdentifier : m58696b(context)) {
            if (clientAppIdentifier != null) {
                if (workSource == null) {
                    workSource = new WorkSource();
                }
                WorkSource a = stx.m36335a(context, clientAppIdentifier.mo44291a());
                if (a == null) {
                    return null;
                }
                workSource.add(a);
            }
        }
        return workSource;
    }

    /* renamed from: b */
    public static Set m58696b(Context context) {
        Set a = ((aiyh) ahgz.m55754a(context, aiyh.class)).mo38261a();
        a.addAll(((aiyr) ahgz.m55754a(context, aiyr.class)).mo38301c());
        return a;
    }
}
