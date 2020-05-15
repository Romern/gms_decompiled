package p000;

import android.os.RemoteException;

/* renamed from: nmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nmt extends omk {

    /* renamed from: a */
    final /* synthetic */ nmu f36054a;

    public nmt(nmu nmu) {
        this.f36054a = nmu;
    }

    /* renamed from: a */
    public final void mo21166a() {
        this.f36054a.f36059e.mo21174a();
        synchronized (this.f36054a) {
            if (this.f36054a.f36056b != null) {
                try {
                    this.f36054a.f36056b.mo22290b(this);
                } catch (RemoteException e) {
                    bnsi c = nmv.f36061a.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("nmt", "a", 1326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Removing proxyCallback failed");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo21168b() {
        synchronized (this.f36054a) {
            this.f36054a.f36058d = true;
        }
    }

    /* renamed from: a */
    public final void mo21167a(int i, byte[] bArr) {
        this.f36054a.f36059e.mo21176a(biva.m102863a(i), ojx.m28966a(biva.m102863a(i), bArr));
    }
}
