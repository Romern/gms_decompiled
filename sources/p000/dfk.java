package p000;

import android.content.Intent;
import com.google.android.chimera.BoundService;
import java.util.Collection;

/* renamed from: dfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dfk {

    /* renamed from: a */
    final C1245ok f13010a = new C1245ok();

    /* renamed from: b */
    final C1223np f13011b = new C1223np();

    /* renamed from: c */
    final /* synthetic */ dfl f13012c;

    public dfk(dfl dfl) {
        this.f13012c = dfl;
    }

    /* renamed from: a */
    public final BoundService mo8853a(Intent intent) {
        return (BoundService) this.f13010a.get(intent.getAction());
    }

    /* renamed from: a */
    public final Collection mo8854a() {
        return this.f13011b.values();
    }
}
