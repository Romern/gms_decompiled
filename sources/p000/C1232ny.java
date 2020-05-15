package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1232ny implements Iterator {

    /* renamed from: a */
    final int f26783a;

    /* renamed from: b */
    int f26784b;

    /* renamed from: c */
    int f26785c;

    /* renamed from: d */
    boolean f26786d = false;

    /* renamed from: e */
    final /* synthetic */ C1238od f26787e;

    public C1232ny(C1238od odVar, int i) {
        this.f26787e = odVar;
        this.f26783a = i;
        this.f26784b = odVar.mo15496a();
    }

    public final boolean hasNext() {
        return this.f26785c < this.f26784b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f26787e.mo15498a(this.f26785c, this.f26783a);
            this.f26785c++;
            this.f26786d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f26786d) {
            int i = this.f26785c - 1;
            this.f26785c = i;
            this.f26784b--;
            this.f26786d = false;
            this.f26787e.mo15500a(i);
            return;
        }
        throw new IllegalStateException();
    }
}
