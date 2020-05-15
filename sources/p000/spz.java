package p000;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: spz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class spz extends spy {
    public spz(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final String mo25953a(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
