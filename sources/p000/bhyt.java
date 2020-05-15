package p000;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: bhyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhyt implements bhyv {

    /* renamed from: a */
    public int f119914a = 0;

    /* renamed from: b */
    public final Executor f119915b;

    /* renamed from: c */
    public sbc f119916c;

    /* renamed from: d */
    public sbc f119917d;

    /* renamed from: e */
    private final Executor f119918e;

    public bhyt(Executor executor, Executor executor2) {
        this.f119918e = executor;
        this.f119915b = executor2;
    }

    /* renamed from: a */
    public final void mo64426a() {
        this.f119918e.execute(new bhyl(this));
    }

    /* renamed from: b */
    public final void mo64430b() {
        this.f119918e.execute(new bhym(this));
    }

    /* renamed from: a */
    public final void mo64427a(Collection collection, bhyg bhyg) {
        this.f119918e.execute(new bhyp(this, collection, bhyg));
    }

    /* renamed from: b */
    public final void mo64431b(Map map) {
        this.f119918e.execute(new bhyo(this, map));
    }

    /* renamed from: a */
    public final void mo64428a(Collection collection, bhyu bhyu) {
        this.f119918e.execute(new bhyr(this, collection, bhyu));
    }

    /* renamed from: a */
    public final void mo64429a(Map map) {
        this.f119918e.execute(new bhyn(this, map));
    }
}
