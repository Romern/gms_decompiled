package p000;

import java.util.concurrent.Semaphore;

/* renamed from: acos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acos extends brhj {

    /* renamed from: a */
    public final Semaphore f60369a;

    /* renamed from: b */
    private final brhj f60370b;

    /* renamed from: c */
    private final aubq f60371c = new acor(this);

    public acos(brhj brhj, int i) {
        this.f60370b = brhj;
        this.f60369a = new Semaphore(i);
    }

    /* renamed from: a */
    public final aucb mo32869a(brhy... brhyArr) {
        this.f60369a.acquireUninterruptibly();
        aucb a = this.f60370b.mo32869a(brhyArr);
        a.mo50371a(this.f60371c);
        return a;
    }

    /* renamed from: b */
    public final aucb mo32872b(brhy... brhyArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final aucb mo32870a(String... strArr) {
        this.f60369a.acquireUninterruptibly();
        aucb a = this.f60370b.mo32870a(strArr);
        a.mo50371a(this.f60371c);
        return a;
    }

    /* renamed from: b */
    public final aucb mo32873b(String... strArr) {
        throw new UnsupportedOperationException();
    }
}
