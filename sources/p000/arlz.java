package p000;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.List;

/* renamed from: arlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arlz {

    /* renamed from: a */
    private static final sek f87874a = ascp.m73787a("WorkProfileHelper");

    /* renamed from: b */
    private final UserManager f87875b;

    /* renamed from: c */
    private final DevicePolicyManager f87876c;

    public arlz(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f87875b = (UserManager) applicationContext.getSystemService("user");
        this.f87876c = (DevicePolicyManager) applicationContext.getSystemService("device_policy");
    }

    /* renamed from: b */
    public final int mo48625b() {
        List<ComponentName> activeAdmins;
        String deviceOwner = this.f87876c.getDeviceOwner();
        UserHandle a = mo48624a();
        if (cgps.f187469a.mo6606a().mo84245b() && deviceOwner == null && a == null && (activeAdmins = this.f87876c.getActiveAdmins()) != null) {
            String c = cgps.f187469a.mo6606a().mo84246c();
            for (ComponentName componentName : activeAdmins) {
                if (c.equals(componentName.flattenToShortString())) {
                    if (!cgps.f187469a.mo6606a().mo84251h()) {
                        return 3;
                    }
                    return 5;
                }
            }
        }
        if (deviceOwner != null && a != null) {
            return 6;
        }
        if (deviceOwner == null) {
            return a == null ? 2 : 4;
        }
        return 5;
    }

    /* renamed from: a */
    public static arlz m73092a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new arlz(context);
    }

    /* renamed from: a */
    public final UserHandle mo48624a() {
        for (UserHandle userHandle : this.f87875b.getUserProfiles()) {
            int identifier = userHandle.getIdentifier();
            String profileOwnerNameAsUser = this.f87876c.getProfileOwnerNameAsUser(identifier);
            f87874a.mo25412b("ProfileOwnerName(%d) = %s", Integer.valueOf(identifier), profileOwnerNameAsUser);
            if (profileOwnerNameAsUser != null) {
                return userHandle;
            }
        }
        return null;
    }
}
