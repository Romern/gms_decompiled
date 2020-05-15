package p000;

import android.os.Message;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aybp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aybp extends aycg {

    /* renamed from: a */
    final /* synthetic */ aybu f97033a;

    public aybp(aybu aybu) {
        this.f97033a = aybu;
    }

    /* renamed from: a */
    public final void mo53860a() {
        if (!((ConnectionConfiguration) this.f97033a.f97057g.get()).f110868e) {
            this.f97033a.mo53895b(3);
        } else if (this.f97033a.f97052b.getState() == 12) {
            this.f97033a.mo53895b(1);
        } else if (this.f97033a.f97052b.getState() == 10) {
            this.f97033a.mo53899d(10);
        }
    }

    /* renamed from: a */
    public final boolean mo53861a(Message message) {
        return true;
    }

    /* renamed from: c */
    public final String mo53863c() {
        return "DisconnectedState";
    }
}
