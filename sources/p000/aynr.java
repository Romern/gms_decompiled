package p000;

import android.content.Intent;

/* renamed from: aynr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aynr extends ayon {

    /* renamed from: a */
    final /* synthetic */ ayns f98082a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aynr(ayns ayns) {
        super(ayns.f98083a, ayns.f98084b, ayns.f98086d, "android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.f98082a = ayns;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54160b(Intent intent) {
        if (this.f98082a.f98086d.getBondState() == 10) {
            ayqr ayqr = new ayqr(this.f98082a.f98088f, "Close UnbondedReceiver");
            try {
                close();
                ayqr.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
