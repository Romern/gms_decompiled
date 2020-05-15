package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CompletableFuture;

/* renamed from: bjbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbs extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ Context f122490a;

    /* renamed from: b */
    final /* synthetic */ CompletableFuture f122491b;

    public bjbs(Context context, CompletableFuture completableFuture) {
        this.f122490a = context;
        this.f122491b = completableFuture;
    }

    public final void onReceive(Context context, Intent intent) {
        if (bjbt.m103168a(this.f122490a)) {
            this.f122491b.complete(null);
        }
    }
}
