package p000;

import android.content.Context;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;

/* renamed from: dej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dej extends HostApduService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.HostApduService f12976a;

    public dej(com.google.android.chimera.HostApduService hostApduService) {
        this.f12976a = hostApduService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onDeactivated(int i) {
        this.f12976a.onDeactivated(i);
    }

    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        return this.f12976a.processCommandApdu(bArr, bundle);
    }
}
