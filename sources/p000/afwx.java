package p000;

import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* renamed from: afwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afwx {

    /* renamed from: a */
    public final aeeh f64899a;

    /* renamed from: b */
    public final afvy f64900b;

    public afwx(aeeh aeeh, afvy afvy) {
        this.f64899a = aeeh;
        this.f64900b = afvy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35052a(Intent intent) {
        try {
            this.f64899a.mo34078a().get();
            this.f64900b.mo35045a(2);
        } catch (ExecutionException e) {
            this.f64900b.mo35045a(4);
            bnsi c = afvx.m53603a().mo68388c();
            c.mo68402a((int) cfgy.m139566c());
            c.mo68437a(e.getCause());
            c.mo68432a("afwx", "a", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to schedule periodic tasks.");
        } catch (InterruptedException e2) {
            this.f64900b.mo35045a(6);
            bnsi c2 = afvx.m53604b().mo68388c();
            c2.mo68432a("afwx", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}
