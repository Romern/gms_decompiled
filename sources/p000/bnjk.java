package p000;

import java.util.NoSuchElementException;

/* renamed from: bnjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjk extends bnrd {

    /* renamed from: a */
    boolean f131705a;

    /* renamed from: b */
    final /* synthetic */ Object f131706b;

    public bnjk(Object obj) {
        this.f131706b = obj;
    }

    public final boolean hasNext() {
        return !this.f131705a;
    }

    public final Object next() {
        if (!this.f131705a) {
            this.f131705a = true;
            return this.f131706b;
        }
        throw new NoSuchElementException();
    }
}
