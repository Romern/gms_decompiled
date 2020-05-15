package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.location.util.DeviceActiveAlarmTimer;
import com.google.android.location.util.DeviceIdleHelper$PowerManagerReciever;

/* renamed from: bhbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbg {

    /* renamed from: a */
    public final Context f118231a;

    /* renamed from: b */
    public final PowerManager f118232b;

    /* renamed from: c */
    public final DeviceIdleHelper$PowerManagerReciever f118233c = new DeviceIdleHelper$PowerManagerReciever(this);

    /* renamed from: d */
    public final IntentFilter f118234d = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");

    /* renamed from: e */
    public boolean f118235e;

    /* renamed from: f */
    public DeviceActiveAlarmTimer f118236f;

    public bhbg(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.f118231a = context;
        this.f118232b = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final boolean mo63518a() {
        int i = Build.VERSION.SDK_INT;
        return this.f118232b.isDeviceIdleMode();
    }
}
