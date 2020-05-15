package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.contextmanager.producer.module.BroadcastReceiverProducer$InternalBroadcastReceiver;

/* renamed from: dyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dyf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f14396a;

    /* renamed from: b */
    final /* synthetic */ Intent f14397b;

    /* renamed from: c */
    final /* synthetic */ BroadcastReceiverProducer$InternalBroadcastReceiver f14398c;

    public dyf(BroadcastReceiverProducer$InternalBroadcastReceiver broadcastReceiverProducer$InternalBroadcastReceiver, Context context, Intent intent) {
        this.f14398c = broadcastReceiverProducer$InternalBroadcastReceiver;
        this.f14396a = context;
        this.f14397b = intent;
    }

    public final void run() {
        this.f14398c.f7713a.mo9847a(this.f14396a, this.f14397b);
    }
}
