package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bfhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhi extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bfho f113907a;

    public bfhi(bfho bfho) {
        this.f113907a = bfho;
    }

    public final void onReceive(Context context, Intent intent) {
        bfho bfho = this.f113907a;
        AtomicLong atomicLong = bfho.f113936i;
        bhdb bhdb = bfho.f113938b;
        if (!bfho.f113948m.mo62924b(bgnq.COLLECTIONLIB_REPLAYER)) {
            this.f113907a.f113948m.mo62923b(bgnq.COLLECTIONLIB_REPLAYER, 600000, this.f113907a.f113947l);
        }
        this.f113907a.mo61703a();
    }
}
