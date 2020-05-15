package p000;

import java.util.Set;

/* renamed from: acpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acpj extends acpn {

    /* renamed from: a */
    private final Set f60415a;

    public acpj(Set set) {
        super(bqbd.ON_SLEEP_ACTIONS, 2);
        this.f60415a = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        for (Runnable runnable : this.f60415a) {
            runnable.run();
        }
        return null;
    }
}
