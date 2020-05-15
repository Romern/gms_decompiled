package com.google.android.gms.nearby.messages.debug;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugPokeChimeraService extends Service {

    /* renamed from: a */
    public CountDownLatch f80707a;

    /* renamed from: b */
    private final bvhd f80708b = new ajau(this);

    /* renamed from: c */
    private final ServiceConnection f80709c = new ajav(this, "nearby");

    public final IBinder onBind(Intent intent) {
        return this.f80708b;
    }

    public final void onCreate() {
        srn srn = ahfq.f67120a;
        this.f80707a = new CountDownLatch(1);
        skh a = skh.m35531a();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE");
        intent.setComponent(new ComponentName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        a.mo25690a(this, intent, this.f80709c, 1);
    }

    public final void onDestroy() {
        srn srn = ahfq.f67120a;
        skh.m35531a().mo25689a(this, this.f80709c);
        super.onDestroy();
    }
}
