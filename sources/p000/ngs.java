package p000;

import java.util.ArrayList;

/* renamed from: ngs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ngs implements ngm {

    /* renamed from: a */
    final /* synthetic */ ngu f35542a;

    public ngs(ngu ngu) {
        this.f35542a = ngu;
    }

    /* renamed from: a */
    public final void mo20580a() {
    }

    /* renamed from: b */
    public final synchronized void mo20581b() {
        if (this.f35542a.f35545a.mo20604b()) {
            ArrayList arrayList = new ArrayList(this.f35542a.f35546b.mo20631b());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ngr ngr = (ngr) arrayList.get(i);
                if (ngu.m26215a(ngr.f35541e.f29268d).isEmpty()) {
                    ngr.f35540d.mo13773a(6);
                    this.f35542a.mo20620a(ngr.f35540d);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20582c() {
        this.f35542a.mo20617a(5);
    }
}
