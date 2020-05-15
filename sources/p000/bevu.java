package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: bevu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevu {
    /* renamed from: a */
    public static final Intent m95969a(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.location.settings.DrivingConditionProvider");
        className.setAction("ActivityTransition");
        return className;
    }
}
