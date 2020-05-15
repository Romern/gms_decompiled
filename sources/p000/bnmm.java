package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bnmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnmm extends AbstractMap {
    /* renamed from: b */
    public abstract Iterator mo68058b();

    public void clear() {
        bnjr.m109625g(mo68058b());
    }

    public final Set entrySet() {
        return new bnml(this);
    }
}
