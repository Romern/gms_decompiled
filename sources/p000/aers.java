package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;

/* renamed from: aers */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aers extends aero {

    /* renamed from: i */
    private final BroadcastReceiver f63695i = new aerr(this);

    public aers(Context context, aeri aeri) {
        super(context, aeri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34492a() {
        this.f63682a.registerReceiver(this.f63695i, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        LocationManager locationManager = (LocationManager) this.f63682a.getSystemService(LocationManager.class);
        for (String str : locationManager.getAllProviders()) {
            if (locationManager.isProviderEnabled(str)) {
                mo34493a(str, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34494b() {
        this.f63682a.unregisterReceiver(this.f63695i);
    }
}
