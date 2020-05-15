package p000;

/* renamed from: aubj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucb f91355a;

    /* renamed from: b */
    final /* synthetic */ aubk f91356b;

    public aubj(aubk aubk, aucb aucb) {
        this.f91356b = aubk;
        this.f91355a = aucb;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubw):void
     arg types: [java.util.concurrent.Executor, aubk]
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
     arg types: [java.util.concurrent.Executor, aubk]
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
     arg types: [java.util.concurrent.Executor, aubk]
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
            aucb aucb = (aucb) this.f91356b.f91357a.mo7031a(this.f91355a);
            if (aucb != null) {
                aucb.mo50380a(auci.f91391b, (aubw) this.f91356b);
                aucb.mo50379a(auci.f91391b, (aubt) this.f91356b);
                aucb.mo50377a(auci.f91391b, (aubn) this.f91356b);
                return;
            }
            this.f91356b.mo10476a((Exception) new NullPointerException("Continuation returned null"));
        } catch (aubz e) {
            if (e.getCause() instanceof Exception) {
                this.f91356b.f91358b.mo50397a((Exception) e.getCause());
            } else {
                this.f91356b.f91358b.mo50397a((Exception) e);
            }
        } catch (Exception e2) {
            this.f91356b.f91358b.mo50397a(e2);
        }
    }
}
