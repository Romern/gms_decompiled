package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bbwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbwh extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bbwq f103585a;

    public bbwh(bbwq bbwq) {
        this.f103585a = bbwq;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        boolean a = bbqk.m88407a(this.f103585a.f103603a);
        if (a) {
            this.f103585a.mo56470a();
        }
        bbxo bbxo = this.f103585a.f103613k;
        if (!a) {
            i = 3;
        } else {
            i = 2;
        }
        if (bbxo.f103695d != i) {
            bbxo.f103695d = i;
            bbxo.mo56492a();
        }
    }
}
