package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ciez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciez {

    /* renamed from: a */
    public static final ciez f189992a = new ciez(new chuy[0]);

    /* renamed from: b */
    public final chuy[] f189993b;

    /* renamed from: c */
    public final AtomicBoolean f189994c = new AtomicBoolean(false);

    public ciez(chuy[] chuyArr) {
        this.f189993b = chuyArr;
    }

    /* renamed from: a */
    public static ciez m150148a(chqo chqo, chqh chqh) {
        List list = chqo.f189011f;
        if (list.isEmpty()) {
            return f189992a;
        }
        chqz chqz = new chqz();
        bmxy.m108582a(chqh, "transportAttrs cannot be null");
        chqz.f189020a = chqh;
        bmxy.m108582a(chqo, "callOptions cannot be null");
        chqz.f189021b = chqo;
        new chra(chqz.f189020a, chqz.f189021b);
        int size = list.size();
        chuy[] chuyArr = new chuy[size];
        for (int i = 0; i < size; i++) {
            chuyArr[i] = ((chqy) list.get(i)).mo70090a();
        }
        return new ciez(chuyArr);
    }

    /* renamed from: b */
    public final void mo86025b() {
        chuy[] chuyArr = this.f189993b;
        for (chuy chuy : chuyArr) {
        }
    }

    /* renamed from: a */
    public final void mo86023a() {
        chuy[] chuyArr = this.f189993b;
        for (chuy chuy : chuyArr) {
        }
    }

    /* renamed from: a */
    public final void mo86024a(long j) {
        for (chuy chuy : this.f189993b) {
            chuy.mo70089b(j);
        }
    }
}
