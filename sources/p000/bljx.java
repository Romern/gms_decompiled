package p000;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: bljx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bljx {

    /* renamed from: a */
    public static final /* synthetic */ int f126710a = 0;

    static {
        Math.abs((long) new Random().nextInt());
        new HashMap();
    }

    /* renamed from: a */
    public static bmxj m107264a(bmxj bmxj) {
        return new bljv(blkh.m107296c(), bmxj);
    }

    /* renamed from: a */
    public static bqeg m107265a(bqeg bqeg) {
        bmxy.m108581a(bqeg);
        return new blju(blkh.m107296c(), bqeg);
    }

    /* renamed from: a */
    public static bqeh m107266a(bqeh bqeh) {
        return new bljw(blkh.m107296c(), bqeh);
    }

    /* renamed from: a */
    public static bqer m107267a(bqer bqer) {
        return new bljr(blkh.m107296c(), bqer);
    }

    /* renamed from: a */
    public static Runnable m107268a(bljg bljg, Runnable runnable) {
        return new bljs(bljg, runnable);
    }

    /* renamed from: a */
    public static Runnable m107269a(Runnable runnable) {
        return m107268a(blkh.m107296c(), runnable);
    }

    /* renamed from: a */
    public static Callable m107270a(Callable callable) {
        return new bljt(blkh.m107296c(), callable);
    }
}
