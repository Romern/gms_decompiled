package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: bpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bpi implements Iterator {

    /* renamed from: a */
    boolean f5309a = false;

    /* renamed from: b */
    private bpc f5310b;

    /* renamed from: c */
    private Iterator f5311c;

    /* renamed from: d */
    private final Stack f5312d;

    /* renamed from: e */
    private final bpo f5313e;

    public bpi(Iterator it, bpo bpo) {
        this.f5313e = bpo;
        this.f5311c = it;
        this.f5312d = new Stack();
    }

    public final boolean hasNext() {
        bpc bpc;
        while (true) {
            Iterator it = this.f5311c;
            if (it != null && !it.hasNext() && !this.f5312d.empty()) {
                this.f5311c = (Iterator) this.f5312d.pop();
            }
        }
        while (true) {
            Iterator it2 = this.f5311c;
            bpc = null;
            if (it2 == null || !it2.hasNext()) {
                break;
            }
            bpc = (bpc) this.f5311c.next();
            bpo a = bpc.mo3349a();
            if (a.mo3378b()) {
                this.f5312d.push(this.f5311c);
                this.f5311c = bpc.iterator();
            }
            if (a.equals(this.f5313e)) {
                this.f5310b = bpc;
                this.f5309a = true;
                break;
            }
            while (!this.f5311c.hasNext() && !this.f5312d.empty()) {
                this.f5311c = (Iterator) this.f5312d.pop();
            }
        }
        if (bpc != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f5310b == null) {
            hasNext();
        }
        bpc bpc = this.f5310b;
        if (bpc == null) {
            String valueOf = String.valueOf(cbm.m3893a(this.f5313e.mo3377a()));
            throw new NoSuchElementException(valueOf.length() == 0 ? new String("no TlvObject with tag ") : "no TlvObject with tag ".concat(valueOf));
        }
        this.f5309a = true;
        this.f5310b = null;
        return bpc;
    }

    public final void remove() {
        if (this.f5309a) {
            this.f5311c.remove();
            this.f5310b = null;
            this.f5309a = false;
            return;
        }
        throw new IllegalStateException("Iterator is pointing to nonexistent or already removed element.");
    }
}
