package p000;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cats */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cats implements Runnable {

    /* renamed from: a */
    final /* synthetic */ catt f175955a;

    public cats(catt catt) {
        this.f175955a = catt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        r9 = r9 + 1;
        r0 = r3 - r11.f176422l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        if (r0 <= r6) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a7, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        if (r0 > r6) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r6 = r12;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
        p000.cavk.m127312a(r5.f176413c);
        r0 = 0;
     */
    public final void run() {
        Iterator it;
        cats cats = this;
        while (true) {
            catt catt = cats.f175955a;
            long nanoTime = System.nanoTime();
            synchronized (catt) {
                try {
                    Iterator it2 = catt.f175961f.iterator();
                    cayl cayl = null;
                    long j = Long.MIN_VALUE;
                    int i = 0;
                    int i2 = 0;
                    while (it2.hasNext()) {
                        try {
                            cayl cayl2 = (cayl) it2.next();
                            List list = cayl2.f176420j;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= list.size()) {
                                    it = it2;
                                    if (list.size() > 0) {
                                        i2++;
                                        it2 = it;
                                    }
                                } else if (((Reference) list.get(i3)).get() == null) {
                                    Logger logger = cavb.f176115a;
                                    Level level = Level.WARNING;
                                    String valueOf = String.valueOf(cayl2.f176411a.f176065a.f175826a);
                                    it = it2;
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
                                    sb.append("A connection to ");
                                    sb.append(valueOf);
                                    sb.append(" was leaked. Did you forget to close a response body?");
                                    logger.logp(level, "com.squareup.okhttp.ConnectionPool", "pruneAndGetAllocationCount", sb.toString());
                                    list.remove(i3);
                                    cayl2.f176421k = true;
                                    if (list.isEmpty()) {
                                        cayl2.f176422l = nanoTime - catt.f175959d;
                                        break;
                                    }
                                    it2 = it;
                                } else {
                                    i3++;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                    }
                    long j2 = catt.f175959d;
                    if (j < j2) {
                        if (i <= catt.f175958c) {
                            if (i > 0) {
                                j2 -= j;
                            } else if (i2 > 0) {
                            }
                            if (j2 == -1) {
                                return;
                            }
                            if (j2 > 0) {
                                long j3 = j2 / 1000000;
                                long j4 = j2 - (1000000 * j3);
                                synchronized (this.f175955a) {
                                    try {
                                        this.f175955a.wait(j3, (int) j4);
                                    } catch (InterruptedException e) {
                                    }
                                }
                                cats = this;
                            } else {
                                cats = this;
                            }
                        }
                    }
                    catt.f175961f.remove(cayl);
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        break;
                    }
                    throw th;
                }
            }
        }
    }
}
