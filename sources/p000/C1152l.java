package p000;

import java.util.Iterator;

/* renamed from: l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C1152l implements Iterator, C1180m {

    /* renamed from: a */
    C1097j f25510a;

    /* renamed from: b */
    C1097j f25511b;

    public C1152l(C1097j jVar, C1097j jVar2) {
        this.f25510a = jVar2;
        this.f25511b = jVar;
    }

    /* renamed from: a */
    private final C1097j m18837a() {
        C1097j jVar = this.f25511b;
        C1097j jVar2 = this.f25510a;
        if (jVar == jVar2 || jVar2 == null) {
            return null;
        }
        return mo12359a(jVar);
    }

    /* renamed from: a */
    public abstract C1097j mo12359a(C1097j jVar);

    /* renamed from: b */
    public abstract C1097j mo12360b(C1097j jVar);

    /* renamed from: c */
    public final void mo14269c(C1097j jVar) {
        if (this.f25510a == jVar && jVar == this.f25511b) {
            this.f25511b = null;
            this.f25510a = null;
        }
        C1097j jVar2 = this.f25510a;
        if (jVar2 == jVar) {
            this.f25510a = mo12360b(jVar2);
        }
        if (this.f25511b == jVar) {
            this.f25511b = m18837a();
        }
    }

    public final boolean hasNext() {
        return this.f25511b != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C1097j jVar = this.f25511b;
        this.f25511b = m18837a();
        return jVar;
    }
}
