package p000;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: bhzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzb implements bhyv {

    /* renamed from: a */
    public final Executor f119932a;

    /* renamed from: b */
    private final Executor f119933b;

    public bhzb(Executor executor, Executor executor2) {
        this.f119933b = executor;
        this.f119932a = executor2;
    }

    /* renamed from: a */
    public final void mo64426a() {
    }

    /* renamed from: a */
    public final void mo64429a(Map map) {
    }

    /* renamed from: b */
    public final void mo64430b() {
    }

    /* renamed from: b */
    public final void mo64431b(Map map) {
    }

    /* renamed from: a */
    public final void mo64427a(Collection collection, bhyg bhyg) {
        this.f119933b.execute(new bhyx(this, collection, bhyg));
    }

    /* renamed from: a */
    public final void mo64428a(Collection collection, bhyu bhyu) {
        this.f119933b.execute(new bhyy(this, collection, bhyu));
    }
}
