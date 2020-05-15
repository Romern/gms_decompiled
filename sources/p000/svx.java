package p000;

import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: svx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svx extends svw {
    /* renamed from: c */
    public final int mo26189c() {
        try {
            return ((Integer) UserHandle.class.getMethod("myUserId", new Class[0]).invoke(null, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return 0;
        }
    }

    /* renamed from: c */
    public final int mo26190c(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        try {
            return ((Integer) UserManager.class.getMethod("getUserSerialNumber", Integer.TYPE).invoke(userManager, Integer.valueOf(mo26189c()))).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return 0;
        }
    }
}
