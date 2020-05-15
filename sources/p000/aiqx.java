package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* renamed from: aiqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiqx implements bluw {

    /* renamed from: a */
    final /* synthetic */ aiqy f69520a;

    public aiqx(aiqy aiqy) {
        this.f69520a = aiqy;
    }

    /* renamed from: a */
    private final void m57739a(int i, byte[] bArr) {
        aiqy aiqy = this.f69520a;
        byte[] bArr2 = aiqy.f69521a;
        if (aiqy.f69526f == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiqx", "a", 535, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV1 connected to %s received an unexpected intro packet as a client socket.", this.f69520a.f69522b);
            return;
        }
        aiqi a = aiqy.mo37871a(i, bArr);
        if (a != null) {
            this.f69520a.f69526f.mo37589a(a);
        }
    }

    /* renamed from: b */
    public final void mo13820b() {
        aiqy aiqy = this.f69520a;
        aiqu aiqu = new aiqu(this);
        byte[] bArr = aiqy.f69521a;
        aiqy.mo37873a(aiqu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo37870c(byte[] bArr) {
        aips a = aips.m57682a(bArr);
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aiqx", "c", 477, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            aiqy aiqy = this.f69520a;
            byte[] bArr2 = aiqy.f69521a;
            bnsl.mo68420a("MultiplexBleSocketV1 connected to %s was unable to parse incoming data.", aiqy.f69522b);
        } else if (!Arrays.equals(a.f69459b, aiqy.f69521a)) {
            byte[] bArr3 = a.f69459b;
            byte[] bArr4 = a.f69460c;
            try {
                aiqi aiqi = (aiqi) this.f69520a.f69527g.get(sqd.m35972d(bArr3));
                aiqi.f69491c.write(bArr4);
                if (cfnv.m140741C()) {
                    aiqi.f69491c.flush();
                }
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("aiqx", "a", 552, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("MultiplexBleSocketV1 connected to %s encountered an error while receiving incoming data for service ID hash %s.", this.f69520a.f69522b, ails.m57438a(bArr3));
            }
        } else {
            mo37869b(a.f69460c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo37868b(IOException iOException) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("aiqx", "b", 497, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        aiqy aiqy = this.f69520a;
        byte[] bArr = aiqy.f69521a;
        bnsl.mo68420a("MultiplexBleSocketV1 connected to %s encountered an error with its internal Weave socket.", aiqy.f69522b);
    }

    /* renamed from: b */
    public final void mo37869b(byte[] bArr) {
        try {
            bvgi bvgi = (bvgi) bxvk.m124014a(bvgi.f156000e, bArr);
            int a = bvgh.m121088a(bvgi.f156003b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 0) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aiqx", "b", 525, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                aiqy aiqy = this.f69520a;
                byte[] bArr2 = aiqy.f69521a;
                bnsl.mo68420a("MultiplexBleSocketV1 connected to %s received a control frame of an unknown type.", aiqy.f69522b);
            } else if (i2 != 1) {
                aiqy aiqy2 = this.f69520a;
                bvge bvge = bvgi.f156005d;
                if (bvge == null) {
                    bvge = bvge.f155990c;
                }
                byte[] k = bvge.f155993b.mo73780k();
                byte[] bArr3 = aiqy.f69521a;
                aiqy2.mo37874a(k);
            } else {
                bvgf bvgf = bvgi.f156004c;
                if (bvgf == null) {
                    bvgf = bvgf.f155994d;
                }
                int a2 = bvgk.m121091a(bvgf.f155998c);
                if (a2 != 0) {
                    i = a2;
                }
                int i3 = i - 1;
                bvgf bvgf2 = bvgi.f156004c;
                if (bvgf2 == null) {
                    bvgf2 = bvgf.f155994d;
                }
                byte[] k2 = bvgf2.f155997b.mo73780k();
                aiqy aiqy3 = this.f69520a;
                byte[] bArr4 = aiqy.f69521a;
                if (aiqy3.f69526f == null) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68432a("aiqx", "a", 535, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("MultiplexBleSocketV1 connected to %s received an unexpected intro packet as a client socket.", this.f69520a.f69522b);
                    return;
                }
                aiqi a3 = aiqy3.mo37871a(i3, k2);
                if (a3 != null) {
                    this.f69520a.f69526f.mo37589a(a3);
                }
            }
        } catch (bxwf e) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aiqx", "b", 510, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            aiqy aiqy4 = this.f69520a;
            byte[] bArr5 = aiqy.f69521a;
            bnsl3.mo68420a("MultiplexBleSocketV1 connected to %s was unable to parse control frame.", aiqy4.f69522b);
        }
    }

    /* renamed from: a */
    private final void m57740a(byte[] bArr, byte[] bArr2) {
        try {
            aiqy aiqy = this.f69520a;
            byte[] bArr3 = aiqy.f69521a;
            aiqi aiqi = (aiqi) aiqy.f69527g.get(sqd.m35972d(bArr));
            aiqi.f69491c.write(bArr2);
            if (cfnv.m140741C()) {
                aiqi.f69491c.flush();
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiqx", "a", 552, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            aiqy aiqy2 = this.f69520a;
            byte[] bArr4 = aiqy.f69521a;
            bnsl.mo68424a("MultiplexBleSocketV1 connected to %s encountered an error while receiving incoming data for service ID hash %s.", aiqy2.f69522b, ails.m57438a(bArr));
        }
    }

    /* renamed from: a */
    public final void mo13814a() {
        aiqy aiqy = this.f69520a;
        byte[] bArr = aiqy.f69521a;
        CountDownLatch countDownLatch = aiqy.f69523c;
        countDownLatch.getClass();
        aiqy.mo37873a(new aiqt(countDownLatch));
    }

    /* renamed from: a */
    public final void mo13815a(IOException iOException) {
        aiqy aiqy = this.f69520a;
        aiqw aiqw = new aiqw(this, iOException);
        byte[] bArr = aiqy.f69521a;
        aiqy.mo37873a(aiqw);
    }

    /* renamed from: a */
    public final void mo13818a(byte[] bArr) {
        aiqy aiqy = this.f69520a;
        aiqv aiqv = new aiqv(this, bArr);
        byte[] bArr2 = aiqy.f69521a;
        aiqy.mo37873a(aiqv);
    }
}
