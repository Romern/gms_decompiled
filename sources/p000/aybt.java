package p000;

import android.os.Message;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aybt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aybt extends aycg {

    /* renamed from: a */
    final /* synthetic */ aybu f97037a;

    public aybt(aybu aybu) {
        this.f97037a = aybu;
    }

    /* renamed from: a */
    public final void mo53860a() {
        this.f97037a.mo53870c();
        boolean z = ((ConnectionConfiguration) this.f97037a.f97057g.get()).f110868e;
        aybu aybu = this.f97037a;
        if (!z) {
            aybu.mo53895b(3);
        } else if (aybu.f97052b.getState() == 12) {
            this.f97037a.mo53899d(12);
        }
    }

    /* renamed from: c */
    public final String mo53863c() {
        return "ServiceOnState";
    }

    /* renamed from: a */
    public final boolean mo53861a(Message message) {
        boolean z = ((ConnectionConfiguration) this.f97037a.f97057g.get()).f110868e;
        int i = message.what;
        if (i != 2) {
            if (i == 3) {
                this.f97037a.mo53870c();
                if (!z) {
                    aybu aybu = this.f97037a;
                    aybu.mo53896b(aybu.f97075y);
                    return true;
                } else if (this.f97037a.f97052b.getState() != 12) {
                    return true;
                } else {
                    aybu aybu2 = this.f97037a;
                    aybu2.mo53896b(aybu2.f97072v);
                    return true;
                }
            } else if (i != 12) {
                return this.f97037a.mo53867a(message);
            } else {
                aybu aybu3 = this.f97037a;
                aybu3.mo53896b(aybu3.f97075y);
                return true;
            }
        } else if (message.arg1 != 12 || !z) {
            return true;
        } else {
            aybu aybu4 = this.f97037a;
            aybu4.mo53896b(aybu4.f97072v);
            return true;
        }
    }
}
