package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.pm.PackageInstaller;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpv {

    /* renamed from: a */
    public final Context f24766a;

    /* renamed from: b */
    public final BroadcastReceiver f24767b;

    /* renamed from: c */
    public final PackageInstaller f24768c;

    /* renamed from: d */
    public final kpw f24769d;

    /* renamed from: e */
    public final AtomicBoolean f24770e = new AtomicBoolean(false);

    public kpv(Context context, BroadcastReceiver broadcastReceiver, PackageInstaller packageInstaller, kpw kpw) {
        this.f24766a = context;
        this.f24767b = broadcastReceiver;
        this.f24768c = packageInstaller;
        this.f24769d = kpw;
    }
}
