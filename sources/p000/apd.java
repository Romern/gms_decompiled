package p000;

import android.os.Bundle;

/* renamed from: apd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apd {

    /* renamed from: a */
    public final apc f1922a = new apc();

    /* renamed from: b */
    private final ape f1923b;

    private apd(ape ape) {
        this.f1923b = ape;
    }

    /* renamed from: a */
    public static apd m1789a(ape ape) {
        return new apd(ape);
    }

    /* renamed from: b */
    public final void mo2256b(Bundle bundle) {
        apc apc = this.f1922a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = apc.f1920b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1124k a = apc.f1919a.mo15482a();
        while (a.hasNext()) {
            C1097j jVar = (C1097j) a.next();
            bundle2.putBundle((String) jVar.f22014a, ((apb) jVar.f22015b).mo2254a());
        }
        bundle.putBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: a */
    public final void mo2255a(Bundle bundle) {
        C0008af lifecycle = this.f1923b.getLifecycle();
        if (lifecycle.mo556a() == C0007ae.INITIALIZED) {
            lifecycle.mo557a(new aoy(this.f1923b));
            apc apc = this.f1922a;
            if (!apc.f1921c) {
                if (bundle != null) {
                    apc.f1920b = bundle.getBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.mo557a(new aoz());
                apc.f1921c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
