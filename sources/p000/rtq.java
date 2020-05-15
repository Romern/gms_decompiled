package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rtq implements Iterator {

    /* renamed from: a */
    protected final rtp f43670a;

    /* renamed from: b */
    protected int f43671b = -1;

    public rtq(rtp rtp) {
        sdo.m34959a(rtp);
        this.f43670a = rtp;
    }

    public final boolean hasNext() {
        return this.f43671b < this.f43670a.mo24660a() + -1;
    }

    public final Object next() {
        if (hasNext()) {
            rtp rtp = this.f43670a;
            int i = this.f43671b + 1;
            this.f43671b = i;
            return rtp.mo24661a(i);
        }
        int i2 = this.f43671b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
