package p000;

/* renamed from: bhcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhcm implements bgmo {

    /* renamed from: a */
    private final Object f118303a;

    /* renamed from: b */
    private final Object f118304b;

    /* renamed from: c */
    private boolean f118305c = true;

    public bhcm(Object obj, Object obj2) {
        this.f118303a = obj;
        this.f118304b = obj2;
    }

    /* renamed from: a */
    public void mo62746a() {
        this.f118305c = false;
    }

    /* renamed from: s */
    public final Object mo63553s() {
        return this.f118305c ? this.f118303a : this.f118304b;
    }

    /* renamed from: a */
    public final void mo62891a(bsax bsax) {
        ((bgmo) mo63553s()).mo62891a(bsax);
    }

    /* renamed from: a */
    public final void mo62892a(bsax bsax, int i, bgmj bgmj, bgmn bgmn) {
        ((bgmo) mo63553s()).mo62892a(bsax, i, bgmj, bgmn);
    }

    /* renamed from: a */
    public final void mo62893a(bsax bsax, bglz bglz) {
        ((bgmo) mo63553s()).mo62893a(bsax, bglz);
    }
}
