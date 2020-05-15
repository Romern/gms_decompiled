package p000;

import java.util.NoSuchElementException;

/* renamed from: acxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxf implements acwo {

    /* renamed from: a */
    private final acwo f61006a;

    /* renamed from: b */
    private final acwo f61007b;

    public acxf(acwo acwo, acwo acwo2) {
        sdo.m34959a(acwo);
        sdo.m34959a(acwo2);
        this.f61006a = acwo;
        this.f61007b = acwo2;
    }

    public final void close() {
        this.f61006a.close();
        this.f61007b.close();
    }

    public final boolean hasNext() {
        return this.f61006a.hasNext() || this.f61007b.hasNext();
    }

    public final Object next() {
        if (this.f61006a.hasNext()) {
            return this.f61006a.next();
        }
        if (this.f61007b.hasNext()) {
            return this.f61007b.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
