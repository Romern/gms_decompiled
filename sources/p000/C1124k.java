package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1124k implements Iterator, C1180m {

    /* renamed from: a */
    final /* synthetic */ C1207n f23594a;

    /* renamed from: b */
    private C1097j f23595b;

    /* renamed from: c */
    private boolean f23596c = true;

    public C1124k(C1207n nVar) {
        this.f23594a = nVar;
    }

    /* renamed from: a */
    public final Map.Entry next() {
        C1097j jVar;
        if (this.f23596c) {
            this.f23596c = false;
            jVar = this.f23594a.f26711b;
        } else {
            C1097j jVar2 = this.f23595b;
            jVar = jVar2 != null ? jVar2.f22016c : null;
        }
        this.f23595b = jVar;
        return this.f23595b;
    }

    /* renamed from: c */
    public final void mo14269c(C1097j jVar) {
        C1097j jVar2 = this.f23595b;
        if (jVar == jVar2) {
            C1097j jVar3 = jVar2.f22017d;
            this.f23595b = jVar3;
            this.f23596c = jVar3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.f23596c) {
            return this.f23594a.f26711b != null;
        }
        C1097j jVar = this.f23595b;
        return (jVar == null || jVar.f22016c == null) ? false : true;
    }
}
