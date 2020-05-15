package p000;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: edk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f14727a;

    /* renamed from: b */
    final /* synthetic */ edm f14728b;

    public edk(edm edm, Message message) {
        this.f14728b = edm;
        this.f14727a = message;
    }

    public final void run() {
        this.f14728b.f14732b.remove(this.f14727a);
    }
}
