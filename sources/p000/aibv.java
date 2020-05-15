package p000;

import android.content.Intent;

/* renamed from: aibv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibv extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68640a;

    /* renamed from: b */
    final /* synthetic */ aics f68641b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibv(aics aics, String str, Intent intent) {
        super(str);
        this.f68641b = aics;
        this.f68640a = intent;
    }

    public final void run() {
        this.f68641b.mo37398a(this.f68640a.getByteArrayExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER"), this.f68640a.getBooleanExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SUPPRESS_NOTIFICATION", false), this.f68640a.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS"), this.f68640a.getByteArrayExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SALT"), this.f68640a.getByteArrayExtra("com.google.android.gms.nearby.discovery.BATTERY_VALUES"), this.f68640a.getBooleanExtra("com.google.android.gms.nearby.discovery.BATTERY_SUPPRESS_NOTIFICATION", true), this.f68640a.getDoubleExtra("com.google.android.gms.nearby.discovery.DISTANCE_ESTIMATE", Double.NaN));
    }
}
