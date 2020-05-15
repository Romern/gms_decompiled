package p000;

import android.content.Intent;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;

/* renamed from: aynp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aynp extends ayon {

    /* renamed from: a */
    final /* synthetic */ ayns f98078a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aynp(ayns ayns, ayoe ayoe) {
        super(ayns.f98083a, ayns.f98084b, ayns.f98086d, ayoe.f98116c);
        this.f98078a = ayns;
    }

    /* renamed from: b */
    public final void mo54160b(Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", Integer.MIN_VALUE);
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aynp", "b", 652, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Connection state changed to %d", intExtra);
        if (intExtra == 0) {
            throw new ConnectException(4, "Disconnected", new Object[0]);
        } else if (intExtra == 2) {
            ayqr ayqr = new ayqr(this.f98078a.f98088f, "Close ConnectedReceiver");
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
