package p000;

import android.os.RemoteException;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: nfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfi extends nfk {

    /* renamed from: a */
    final /* synthetic */ rod f35452a;

    /* renamed from: b */
    final /* synthetic */ nej f35453b;

    /* renamed from: c */
    final /* synthetic */ BleSettings f35454c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nfi(rkb rkb, rod rod, nej nej, BleSettings bleSettings) {
        super(rkb);
        this.f35452a = rod;
        this.f35453b = nej;
        this.f35454c = bleSettings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        nfn nfn = (nfn) rjd;
        rod rod = this.f35452a;
        nej nej = this.f35453b;
        try {
            nfn.mo20565k().mo20577a(new ros(this), nfn.f35458a.mo20568a(rod, nej), this.f35454c);
        } catch (RemoteException e) {
            nfn.f35458a.mo20571a(nej);
            throw e;
        }
    }
}
