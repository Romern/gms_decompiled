package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: bnpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpx extends bnpy {
    private static final long serialVersionUID = 0;

    public final Iterator iterator() {
        return new bnpw(this, super.iterator());
    }

    public bnpx(Collection collection, Object obj) {
        super(collection, obj);
    }
}
