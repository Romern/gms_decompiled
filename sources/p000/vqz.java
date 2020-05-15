package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.util.Pair;
import java.util.Map;

/* renamed from: vqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqz {
    /* renamed from: a */
    public static Pair m41087a(sex sex, ComponentName componentName) {
        if (sex != null) {
            for (Map.Entry entry : sex.mo25454f().entrySet()) {
                if (entry.getValue() != null && componentName.equals(((AutomaticZenRule) entry.getValue()).getOwner())) {
                    return new Pair((String) entry.getKey(), (AutomaticZenRule) entry.getValue());
                }
            }
        }
        return null;
    }
}
