package p000;

import android.os.RemoteException;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: nep */
final /* synthetic */ class nep implements roo {

    /* renamed from: a */
    private final neu f35414a;

    /* renamed from: b */
    private final nej f35415b;

    /* renamed from: c */
    private final rod f35416c;

    /* renamed from: d */
    private final BleSettings f35417d;

    public nep(neu neu, nej nej, rod rod, BleSettings bleSettings) {
        this.f35414a = neu;
        this.f35415b = nej;
        this.f35416c = rod;
        this.f35417d = bleSettings;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        neu neu = this.f35414a;
        nej nej = this.f35415b;
        rod rod = this.f35416c;
        BleSettings bleSettings = this.f35417d;
        nfn nfn = (nfn) obj;
        try {
            nfn.mo20565k().mo20577a(new nes((aucf) obj2), neu.f35424a.mo20568a(rod, nej), bleSettings);
        } catch (RemoteException e) {
            neu.f35424a.mo20571a(nej);
            throw e;
        }
    }
}
