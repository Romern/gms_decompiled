package p000;

import android.content.Intent;

/* renamed from: aica */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aica extends buqn {

    /* renamed from: a */
    final /* synthetic */ boolean f68656a;

    /* renamed from: b */
    final /* synthetic */ String f68657b;

    /* renamed from: c */
    final /* synthetic */ boolean f68658c;

    /* renamed from: d */
    final /* synthetic */ Intent f68659d;

    /* renamed from: e */
    final /* synthetic */ aics f68660e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aica(aics aics, String str, boolean z, String str2, boolean z2, Intent intent) {
        super(str);
        this.f68660e = aics;
        this.f68656a = z;
        this.f68657b = str2;
        this.f68658c = z2;
        this.f68659d = intent;
    }

    public final void run() {
        this.f68660e.mo37405a(this.f68656a, this.f68657b, this.f68658c, this.f68659d.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS"));
    }
}
