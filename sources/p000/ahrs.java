package p000;

import com.google.android.gms.nearby.messages.Message;

/* renamed from: ahrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrs extends buqn {

    /* renamed from: a */
    final /* synthetic */ Message f67895a;

    /* renamed from: b */
    final /* synthetic */ ahrx f67896b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahrs(ahrx ahrx, String str, Message message) {
        super(str);
        this.f67896b = ahrx;
        this.f67895a = message;
    }

    public final void run() {
        this.f67896b.f67907a.f67911a.mo37371a(this.f67895a, null, null, null);
    }
}
