package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: buyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyd {
    /* renamed from: a */
    public static Intent m120746a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.location.nearby.direct.service.NearbyDirectService"));
        return intent;
    }

    /* renamed from: a */
    public static buye m120747a(IBinder iBinder) {
        bvba bvba;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.direct.client.internal.INearbyDirectService");
            bvba = queryLocalInterface instanceof bvba ? (bvba) queryLocalInterface : new bvay(iBinder);
        } else {
            bvba = null;
        }
        return new buyl(bvba);
    }
}
