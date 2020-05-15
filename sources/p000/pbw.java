package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;

/* renamed from: pbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbw {
    static {
        odk.m28481a("CAR.SETUP.SERVICE");
    }

    /* renamed from: a */
    public static bngx m30186a(Context context) {
        bngs j = bngx.m109377j();
        bnha h = bnhe.m109414h();
        bxwc bxwc = ccpv.f179719a.mo6606a().mo76617e().f165797a;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            String[] split = ((String) bxwc.get(i)).split(":", 2);
            String str = split[0];
            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
            if (unflattenFromString != null) {
                long j2 = 0;
                if (split.length > 1 && !split[1].isEmpty()) {
                    j2 = Long.parseLong(split[1]);
                }
                h.mo67695b(unflattenFromString, Long.valueOf(j2));
                i++;
            } else {
                String valueOf = String.valueOf(str);
                throw new InvalidPropertiesFormatException(valueOf.length() == 0 ? new String("Failed to unflatten component name: ") : "Failed to unflatten component name: ".concat(valueOf));
            }
        }
        bnrd a = h.mo67618b().entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            ComponentName componentName = (ComponentName) entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            try {
                long a2 = C1147kv.m18618a(context.getPackageManager().getPackageInfo(componentName.getPackageName(), 0));
                if (!"com.google.android.projection.gearhead".equals(componentName.getPackageName()) ? a2 >= longValue : ooc.INSTANCE.compare(Long.valueOf(a2), Long.valueOf(longValue)) >= 0) {
                    j.mo67668c((ComponentName) entry.getKey());
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            entry.getKey();
            entry.getValue();
        }
        return j.mo67664a();
    }
}
