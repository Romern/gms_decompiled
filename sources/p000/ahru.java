package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;

/* renamed from: ahru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahru extends buqn {

    /* renamed from: a */
    final /* synthetic */ Message f67900a;

    /* renamed from: b */
    final /* synthetic */ ahrx f67901b;

    /* renamed from: c */
    final /* synthetic */ BleSignalImpl f67902c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahru(ahrx ahrx, String str, Message message, BleSignalImpl bleSignalImpl) {
        super(str);
        this.f67901b = ahrx;
        this.f67900a = message;
        this.f67902c = bleSignalImpl;
    }

    public final void run() {
        this.f67901b.f67907a.f67911a.mo37371a(this.f67900a, null, this.f67902c, null);
    }
}
