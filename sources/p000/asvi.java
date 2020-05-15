package p000;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.chimera.Activity;

/* renamed from: asvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asvi {

    /* renamed from: a */
    public final Activity f89811a;

    public asvi(Activity activity) {
        this.f89811a = activity;
    }

    /* renamed from: a */
    public static void m74896a(Activity activity, int i) {
        activity.startActivityForResult(new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT").putExtra("category", "payment").putExtra("component", new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.hce.service.TpHceService")), i);
    }

    /* renamed from: a */
    public final boolean mo49529a() {
        return atxx.m76528a(this.f89811a);
    }
}
