package p000;

import android.content.Intent;

/* renamed from: aibq */
public final /* synthetic */ class aibq implements Runnable {

    /* renamed from: a */
    private final aics f68627a;

    /* renamed from: b */
    private final Intent f68628b;

    public aibq(aics aics, Intent intent) {
        this.f68627a = aics;
        this.f68628b = intent;
    }

    public final void run() {
        aics aics = this.f68627a;
        Intent intent = this.f68628b;
        aics.f68710g.mo73062b();
        String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS");
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", false);
        buqh buqh = aics.f68704a;
        String valueOf = String.valueOf(stringExtra);
        buqh.mo72987c(new aiby(aics, valueOf.length() == 0 ? new String("fastPairDeviceAdded=") : "fastPairDeviceAdded=".concat(valueOf), intent, stringExtra, stringExtra2, booleanExtra));
    }
}
