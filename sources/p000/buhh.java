package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: buhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buhh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ buhj f153845a;

    /* renamed from: b */
    private final int f153846b;

    /* renamed from: c */
    private final int f153847c;

    /* renamed from: d */
    private final byte[] f153848d;

    public buhh(buhj buhj, int i, int i2, byte[] bArr) {
        this.f153845a = buhj;
        this.f153846b = i;
        this.f153847c = i2;
        this.f153848d = bArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buhb.a(long, boolean):bugr
     arg types: [long, int]
     candidates:
      buhb.a(java.lang.StringBuilder, bugr):void
      buhb.a(long, byte[]):bugu
      buhb.a(bugo, android.os.Handler):void
      buha.a(bugo, android.os.Handler):bugz
      buha.a(int, bugo):void
      bugn.a(long, byte[]):bugu
      bugn.a(bugo, android.os.Handler):void
      buhb.a(long, boolean):bugr */
    public final void run() {
        buhy buhy;
        buib buib;
        bugr bugr;
        Locale locale = Locale.US;
        new Object[1][0] = Integer.valueOf(this.f153847c);
        int i = this.f153847c;
        if (i == 3) {
            byte[] bArr = this.f153848d;
            if (bArr != null && bArr.length == 5) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                wrap.getInt();
                synchronized (this.f153845a.f153859k) {
                    buhy = this.f153845a.f153860l;
                    this.f153845a.f153860l = null;
                }
                if (buhy != null) {
                    if (b == 0) {
                        buhi buhi = this.f153845a.f153857i;
                        int i2 = this.f153846b;
                        long j = buhy.f153904b;
                        buhb buhb = (buhb) buhi;
                        if (buhb.mo72660c(i2)) {
                            synchronized (buhb.f153813k) {
                                bugr bugr2 = (bugr) ((buhb) buhi).f153814l.get(j);
                                if (bugr2 != null) {
                                    if (bugr2 != buhb.f153804b) {
                                        ((buhb) buhi).f153815m.remove(bugr2.mo72644b());
                                    }
                                    ((buhb) buhi).f153814l.remove(j);
                                }
                            }
                            buhb.mo72657a(j, true);
                        }
                    }
                    buhy.f153906d = b;
                    buhy.f153905c.countDown();
                    return;
                }
                return;
            }
            Locale locale2 = Locale.US;
            Object[] objArr = {5, Arrays.toString(bArr)};
        } else if (i == 4) {
            byte[] bArr2 = this.f153848d;
            if (bArr2 != null && bArr2.length == 1) {
                byte b2 = bArr2[0];
                synchronized (this.f153845a.f153859k) {
                    buib = this.f153845a.f153861m;
                    this.f153845a.f153861m = null;
                }
                if (buib != null) {
                    if (b2 == 0) {
                        buhi buhi2 = this.f153845a.f153857i;
                        int i3 = this.f153846b;
                        int i4 = buib.f153919b;
                        buhb buhb2 = (buhb) buhi2;
                        if (buhb2.mo72660c(i3) && (bugr = (bugr) buhb2.f153815m.get(i4)) != null) {
                            buhb2.f153814l.delete(bugr.mo72639a());
                            buhb2.f153815m.delete(i4);
                        }
                    }
                    buib.f153921d = b2;
                    buib.f153920c.countDown();
                    return;
                }
                return;
            }
            Locale locale3 = Locale.US;
            Object[] objArr2 = {1, Arrays.toString(bArr2)};
        } else if (i == 5) {
        } else {
            if (i != 7) {
                Locale locale4 = Locale.US;
                new Object[1][0] = Integer.valueOf(this.f153847c);
                return;
            }
            ((buhb) this.f153845a.f153857i).mo72658b(this.f153846b);
        }
    }
}
