package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bckg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bckg extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bckh f104370a;

    public bckg(bckh bckh) {
        this.f104370a = bckh;
    }

    public final void onReceive(Context context, Intent intent) {
        if (bbqk.m88407a(context)) {
            chqp chqp = this.f104370a.f104373c;
            if (chqp instanceof chsz) {
                ((chsz) chqp).mo85628g();
            }
        }
    }
}
