package p000;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: bnay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnay extends bnbc implements Serializable, bnae {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    transient bnae f131329a;

    public bnay(bncb bncb) {
        super(bncb);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131329a = mo67036a().mo66951a(this.f131345m);
    }

    private Object readResolve() {
        return this.f131329a;
    }

    /* renamed from: a */
    public final Object mo66969a(Object obj) {
        throw null;
    }

    public final Object apply(Object obj) {
        return ((bnba) this.f131329a).mo66969a(obj);
    }
}
