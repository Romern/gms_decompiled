package p000;

import java.util.ListIterator;

/* renamed from: bncy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bncy extends bncw implements ListIterator {

    /* renamed from: d */
    final /* synthetic */ bncz f131472d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncy(bncz bncz) {
        super(bncz);
        this.f131472d = bncz;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f131472d.isEmpty();
        m109020b().add(obj);
        bndd.m109026a(this.f131472d.f131473f);
        if (isEmpty) {
            this.f131472d.mo67218c();
        }
    }

    public final boolean hasPrevious() {
        return m109020b().hasPrevious();
    }

    public final int nextIndex() {
        return m109020b().nextIndex();
    }

    public final Object previous() {
        return m109020b().previous();
    }

    public final int previousIndex() {
        return m109020b().previousIndex();
    }

    public final void set(Object obj) {
        m109020b().set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncy(bncz bncz, int i) {
        super(bncz, bncz.mo67238d().listIterator(i));
        this.f131472d = bncz;
    }

    /* renamed from: b */
    private final ListIterator m109020b() {
        mo67210a();
        return (ListIterator) this.f131464a;
    }
}
