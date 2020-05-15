package p000;

import java.util.ListIterator;

/* renamed from: bnqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnqo extends bnqn implements ListIterator {
    public bnqo(ListIterator listIterator) {
        super(listIterator);
    }

    /* renamed from: a */
    private final ListIterator m110128a() {
        return (ListIterator) this.f131993b;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return m110128a().hasPrevious();
    }

    public final int nextIndex() {
        return m110128a().nextIndex();
    }

    public final Object previous() {
        return mo67847a(m110128a().previous());
    }

    public final int previousIndex() {
        return m110128a().previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
