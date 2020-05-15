package p000;

import java.util.concurrent.CancellationException;

/* renamed from: aubx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucb f91379a;

    /* renamed from: b */
    final /* synthetic */ auby f91380b;

    public aubx(auby auby, aucb aucb) {
        this.f91380b = auby;
        this.f91379a = aucb;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubw):void
     arg types: [java.util.concurrent.Executor, auby]
     candidates:
      aucb.a(java.util.concurrent.Executor, aubg):aucb
      aucb.a(java.util.concurrent.Executor, auca):aucb
      aucb.a(android.app.Activity, aubq):void
      aucb.a(android.app.Activity, aubt):void
      aucb.a(android.app.Activity, aubw):void
      aucb.a(com.google.android.chimera.Activity, aubq):void
      aucb.a(com.google.android.chimera.Activity, aubt):void
      aucb.a(com.google.android.chimera.Activity, aubw):void
      aucb.a(java.util.concurrent.Executor, aubn):void
      aucb.a(java.util.concurrent.Executor, aubq):void
      aucb.a(java.util.concurrent.Executor, aubt):void
      aucb.a(java.util.concurrent.Executor, aubw):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubt):void
     arg types: [java.util.concurrent.Executor, auby]
     candidates:
      aucb.a(java.util.concurrent.Executor, aubg):aucb
      aucb.a(java.util.concurrent.Executor, auca):aucb
      aucb.a(android.app.Activity, aubq):void
      aucb.a(android.app.Activity, aubt):void
      aucb.a(android.app.Activity, aubw):void
      aucb.a(com.google.android.chimera.Activity, aubq):void
      aucb.a(com.google.android.chimera.Activity, aubt):void
      aucb.a(com.google.android.chimera.Activity, aubw):void
      aucb.a(java.util.concurrent.Executor, aubn):void
      aucb.a(java.util.concurrent.Executor, aubq):void
      aucb.a(java.util.concurrent.Executor, aubw):void
      aucb.a(java.util.concurrent.Executor, aubt):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubn):void
     arg types: [java.util.concurrent.Executor, auby]
     candidates:
      aucb.a(java.util.concurrent.Executor, aubg):aucb
      aucb.a(java.util.concurrent.Executor, auca):aucb
      aucb.a(android.app.Activity, aubq):void
      aucb.a(android.app.Activity, aubt):void
      aucb.a(android.app.Activity, aubw):void
      aucb.a(com.google.android.chimera.Activity, aubq):void
      aucb.a(com.google.android.chimera.Activity, aubt):void
      aucb.a(com.google.android.chimera.Activity, aubw):void
      aucb.a(java.util.concurrent.Executor, aubq):void
      aucb.a(java.util.concurrent.Executor, aubt):void
      aucb.a(java.util.concurrent.Executor, aubw):void
      aucb.a(java.util.concurrent.Executor, aubn):void */
    public final void run() {
        try {
            aucb a = this.f91380b.f91381a.mo13157a(this.f91379a.mo50386d());
            if (a != null) {
                a.mo50380a(auci.f91391b, (aubw) this.f91380b);
                a.mo50379a(auci.f91391b, (aubt) this.f91380b);
                a.mo50377a(auci.f91391b, (aubn) this.f91380b);
                return;
            }
            this.f91380b.mo10476a((Exception) new NullPointerException("Continuation returned null"));
        } catch (aubz e) {
            if (e.getCause() instanceof Exception) {
                this.f91380b.mo10476a((Exception) e.getCause());
            } else {
                this.f91380b.mo10476a((Exception) e);
            }
        } catch (CancellationException e2) {
            this.f91380b.mo13386b();
        } catch (Exception e3) {
            this.f91380b.mo10476a(e3);
        }
    }
}
