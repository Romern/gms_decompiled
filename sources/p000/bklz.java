package p000;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* renamed from: bklz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklz implements bkmq {

    /* renamed from: a */
    private final bknp f124861a;

    /* renamed from: b */
    private final List f124862b = new ArrayList();

    /* renamed from: c */
    private final bkqy f124863c;

    /* renamed from: d */
    private final vhy f124864d;

    public bklz(vhy vhy, bkrb bkrb, bknp bknp) {
        this.f124864d = vhy;
        this.f124863c = new bksw(null, bkrb, -1, null);
        this.f124861a = bknp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public final void mo27174a(bkmt bkmt) {
        while (bkmt.mo66118c()) {
            try {
                blhg blhg = bkmt.mo66117b().f125119g;
                if (blhg != null) {
                    ((bksw) this.f124863c).mo66343b(blhg);
                    this.f124862b.add(blhg);
                }
            } catch (Exception e) {
                bkma.f124865a.logp(Level.WARNING, "com.google.apps.brix.api.client.cache.sync.OtStateSyncer$SynchronousOperationReceivedHandler", "onChangeEvent", "Failed to apply operation", (Throwable) e);
                this.f124861a.mo66131b();
                this.f124864d.mo28478b(new bknn(500));
                return;
            }
        }
        if (!bkmt.mo66118c() && !bkmt.mo66122f()) {
            this.f124861a.mo66131b();
            vhy vhy = this.f124864d;
            List unmodifiableList = Collections.unmodifiableList(this.f124862b);
            bkpx g = bkmt.mo66123g();
            bkra bkra = bkra.f125145b;
            bkqy bkqy = this.f124863c;
            vhy.f49304c = true;
            if (!vhy.f49302a.f49288b) {
                bkra = bkra.f125144a;
            }
            try {
                new vid(vhy.f49302a, vhy.f49306e.f49309c, unmodifiableList, g, bkra, bkqy, false).mo6502a(vhy.f49306e.f49308b);
            } catch (aaaj | RemoteException e2) {
                vhz.f49307a.mo25378c("RealtimeDocumentSyncer", "Failed to send updates to server.", e2);
            }
            vhy.f49303b.countDown();
        }
    }
}
