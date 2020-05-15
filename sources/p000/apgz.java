package p000;

import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;

/* renamed from: apgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgz {

    /* renamed from: a */
    public final UserManager f84367a;

    public apgz(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        this.f84367a = userManager;
        Class<?> cls = userManager.getClass();
        try {
            cls.getMethod("getUsers", new Class[0]);
        } catch (NoSuchMethodException e) {
        }
        try {
            cls.getMethod("getSerialNumbersOfUsers", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
        }
        try {
            UserHandle.class.getMethod("isOwner", new Class[0]);
        } catch (NoSuchMethodException e3) {
        }
    }
}
