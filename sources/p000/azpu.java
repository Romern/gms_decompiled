package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: azpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azpu extends soa {

    /* renamed from: a */
    final /* synthetic */ bngx f99853a;

    /* renamed from: b */
    final /* synthetic */ bcoh f99854b;

    /* renamed from: c */
    final /* synthetic */ azpw f99855c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azpu(azpw azpw, bngx bngx, bcoh bcoh) {
        super(9);
        this.f99855c = azpw;
        this.f99853a = bngx;
        this.f99854b = bcoh;
    }

    public final void run() {
        bnre i = this.f99853a.listIterator();
        while (i.hasNext()) {
            Notification notification = (Notification) i.next();
            if (notification.mo60565e() == Notification.NotificationType.MESSAGE_RECEIVED) {
                MessageReceivedNotification f = notification.mo60566f();
                azpw azpw = this.f99855c;
                bcoh bcoh = this.f99854b;
                ConversationId a = f.mo60508a();
                azam b = azpw.mo55202b(bcoh, a);
                bdar a2 = azbj.m85193a(azpw.f99860a).mo54564d().mo56310a(bcoh, a, 0);
                azqf.m86130a(azpw.f99860a);
                azpw.mo55197a(bcoh, b, a, ((Integer) azqf.m86131a(a2).mo66812a((Object) 0)).intValue());
                b.f98854r = bmxv.m108566b(2);
                azpw.mo55195a(b, a);
            }
        }
    }
}
