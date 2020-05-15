package p000;

import android.content.Context;
import android.content.Intent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: buso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buso {
    /* renamed from: a */
    public static Intent m120390a(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.devices.DevicesListActivity");
        className.setFlags(268435456);
        return className.putExtra("caller", 1).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
    }
}
