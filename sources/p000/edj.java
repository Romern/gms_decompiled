package p000;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: edj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f14725a;

    /* renamed from: b */
    final /* synthetic */ edm f14726b;

    public edj(edm edm, Message message) {
        this.f14726b = edm;
        this.f14725a = message;
    }

    public final void run() {
        this.f14726b.f14732b.add(this.f14725a);
    }
}
