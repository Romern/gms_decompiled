package p000;

import android.widget.Toast;

/* renamed from: loo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class loo implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lop f26503a;

    public loo(lop lop) {
        this.f26503a = lop;
    }

    /* renamed from: a */
    private final void m19459a() {
        Toast.makeText(this.f26503a.f26159a, "Failed to update prediction data.", 1).show();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (((kpx) obj) != kpx.SUCCESS) {
            m19459a();
        } else {
            Toast.makeText(this.f26503a.f26159a, "Finished updating prediction data.", 1).show();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        m19459a();
    }
}
