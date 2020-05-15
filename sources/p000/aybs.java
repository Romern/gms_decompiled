package p000;

import android.os.Message;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aybs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aybs extends aycg {

    /* renamed from: a */
    final /* synthetic */ aybu f97036a;

    public aybs(aybu aybu) {
        this.f97036a = aybu;
    }

    /* renamed from: a */
    public final void mo53860a() {
        if (this.f97036a.f97058h.compareAndSet(true, false)) {
            aybu aybu = this.f97036a;
            aybu.f97051a.unregisterReceiver(aybu.f97068r);
        }
        if (((ConnectionConfiguration) this.f97036a.f97057g.get()).f110868e) {
            this.f97036a.mo53895b(3);
        }
    }

    /* renamed from: a */
    public final boolean mo53861a(Message message) {
        return true;
    }

    /* renamed from: c */
    public final String mo53863c() {
        return "ServiceOffState";
    }
}
