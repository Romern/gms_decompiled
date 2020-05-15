package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: bkss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bkss extends bkse {

    /* renamed from: e */
    public boolean f125241e;

    /* renamed from: f */
    private Set f125242f;

    public bkss(bksm bksm, bkqy bkqy, bkqw bkqw) {
        super(bksm, bkqy, bkqw, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66316a(bkqo bkqo) {
        if (this.f125241e) {
            if (this.f125242f == null) {
                this.f125242f = Collections.newSetFromMap(new IdentityHashMap());
            }
            this.f125242f.add(bkqo);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set mo66342e() {
        Set set = this.f125242f;
        if (set == null) {
            return Collections.emptySet();
        }
        Set unmodifiableSet = Collections.unmodifiableSet(set);
        this.f125242f = null;
        return unmodifiableSet;
    }
}
