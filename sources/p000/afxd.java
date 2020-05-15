package p000;

import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* renamed from: afxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxd {

    /* renamed from: a */
    public final aeeh f64907a;

    /* renamed from: b */
    public final afvy f64908b;

    public afxd(aeeh aeeh, afvy afvy) {
        this.f64907a = aeeh;
        this.f64908b = afvy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35056a(Intent intent, int i) {
        try {
            this.f64907a.mo34078a().get();
            this.f64908b.mo35047b(2);
        } catch (ExecutionException e) {
            this.f64908b.mo35047b(4);
            bnsi c = afvx.m53603a().mo68388c();
            c.mo68402a((int) cfgy.m139566c());
            c.mo68437a(e.getCause());
            c.mo68432a("afxd", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to schedule periodic tasks.");
        } catch (InterruptedException e2) {
            this.f64908b.mo35047b(6);
            bnsi c2 = afvx.m53604b().mo68388c();
            c2.mo68432a("afxd", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}
