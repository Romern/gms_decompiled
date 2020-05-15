package p000;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: akjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjl {
    /* renamed from: a */
    public static akjk m59882a(akmh akmh, akmz akmz, Context context) {
        if (cfpd.f185332a.mo6606a().mo82448m() || akke.m59908a()) {
            try {
                return (akjk) Class.forName("akkf").getConstructor(akmh.class, akmz.class, akni.class).newInstance(akmh, akmz, new akni(context));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                eoa.m10825a("NetRec", e, "Could not instantiate %s", "com.google.android.gms.netrec.debug.FullDumpsysHandler");
                return null;
            }
        } else {
            eoa.m10828c("NetRec", "Extended dumpsys support disabled.", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m59883a(String... strArr) {
        if (strArr.length != 0) {
            return "netrec".equals(strArr[0]);
        }
        return false;
    }
}
