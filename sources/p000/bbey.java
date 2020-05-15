package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbey */
final /* synthetic */ class bbey implements bmxj {

    /* renamed from: a */
    private final Set f102515a;

    /* renamed from: b */
    private final bavt f102516b;

    /* renamed from: c */
    private final AtomicLong f102517c;

    /* renamed from: d */
    private final Set f102518d;

    /* renamed from: e */
    private final bbfb f102519e;

    /* renamed from: f */
    private final bavr f102520f;

    /* renamed from: g */
    private final Set f102521g;

    public bbey(Set set, bavt bavt, AtomicLong atomicLong, Set set2, bbfb bbfb, bavr bavr, Set set3) {
        this.f102515a = set;
        this.f102516b = bavt;
        this.f102517c = atomicLong;
        this.f102518d = set2;
        this.f102519e = bbfb;
        this.f102520f = bavr;
        this.f102521g = set3;
    }

    public final Object apply(Object obj) {
        Set set = this.f102515a;
        bavt bavt = this.f102516b;
        AtomicLong atomicLong = this.f102517c;
        Set set2 = this.f102518d;
        bbfb bbfb = this.f102519e;
        bavr bavr = this.f102520f;
        Set set3 = this.f102521g;
        Long l = (Long) obj;
        if (!set.contains(bavt)) {
            atomicLong.getAndAdd(l.longValue());
            set.add(bavt);
        }
        if (!set2.contains(bavt)) {
            bbfb.f102528a += l.longValue();
            set2.add(bavt);
        }
        if (!bavr.f101922e) {
            return null;
        }
        bmxy.m108581a(set3);
        if (set3.contains(bavt)) {
            return null;
        }
        bbfb.f102529b += l.longValue();
        set3.add(bavt);
        return null;
    }
}
