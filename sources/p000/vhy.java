package p000;

import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* renamed from: vhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhy implements bknm {

    /* renamed from: a */
    public final vhs f49302a;

    /* renamed from: b */
    public final CountDownLatch f49303b = new CountDownLatch(1);

    /* renamed from: c */
    public boolean f49304c;

    /* renamed from: d */
    public bknn f49305d;

    /* renamed from: e */
    public final /* synthetic */ vhz f49306e;

    public vhy(vhz vhz, vhs vhs) {
        this.f49306e = vhz;
        this.f49302a = vhs;
    }

    /* renamed from: a */
    public final void mo28447a(bknn bknn) {
        mo28478b(bknn);
    }

    /* renamed from: b */
    public final void mo28478b(bknn bknn) {
        this.f49305d = bknn;
        this.f49304c = false;
        this.f49303b.countDown();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28448a(Object obj) {
        bkpw bkpw = (bkpw) obj;
        this.f49304c = true;
        try {
            new vhn(this.f49302a, this.f49306e.f49309c, bkpw).mo6502a(this.f49306e.f49308b);
        } catch (aaaj | RemoteException e) {
            vhz.f49307a.mo25378c("RealtimeDocumentSyncer", "Failed to get initial snapshot.", e);
        }
        this.f49303b.countDown();
    }
}
