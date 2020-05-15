package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: bhut */
final /* synthetic */ class bhut implements Runnable {

    /* renamed from: a */
    private final bhux f119654a;

    /* renamed from: b */
    private final bxsz[] f119655b;

    public bhut(bhux bhux, bxsz[] bxszArr) {
        this.f119654a = bhux;
        this.f119655b = bxszArr;
    }

    public final void run() {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        bhux bhux = this.f119654a;
        bxsz[] bxszArr = this.f119655b;
        bhux.f119667c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(cggm.m145256b());
        bvpf bvpf = ((bvpf[]) bxszArr)[0];
        if (bvpf != null) {
            int i6 = bvpf.f164961ai;
            int i7 = -1;
            if (i6 == -1) {
                i6 = bxxm.f165037a.mo74228a(bvpf).mo74223b(bvpf);
                bvpf.f164961ai = i6;
            }
            brtj brtj = new brtj(i6);
            int i8 = 1;
            if ((bvpf.f157280a & 1) != 0) {
                bvpd bvpd = bvpf.f157281b;
                if (bvpd == null) {
                    bvpd = bvpd.f157270b;
                }
                int size = bvpd.f157272a.size();
                if (size > 0) {
                    int[] iArr = new int[size];
                    int i9 = 0;
                    while (i9 < size) {
                        bvpd bvpd2 = bvpf.f157281b;
                        if (bvpd2 == null) {
                            bvpd2 = bvpd.f157270b;
                        }
                        bvpc bvpc = (bvpc) bvpd2.f157272a.get(i9);
                        int size2 = bvpc.f157264a.size();
                        float[] fArr = new float[size2];
                        for (int i10 = 0; i10 < bvpc.f157264a.size(); i10++) {
                            fArr[i10] = bvpc.f157264a.mo73923b(i10);
                        }
                        if (size2 > 0) {
                            ThreadLocal threadLocal = brtm.UTF8_CHARSET;
                            brtj.mo69870a(4, size2, 4);
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                brtj.mo69866a(fArr[size2]);
                            }
                            i4 = brtj.mo69876b();
                        } else {
                            i4 = 0;
                        }
                        int size3 = bvpc.f157265b.size();
                        float[] fArr2 = new float[size3];
                        for (int i11 = 0; i11 < bvpc.f157265b.size(); i11++) {
                            fArr2[i11] = bvpc.f157265b.mo73923b(i11);
                        }
                        if (size3 > 0) {
                            ThreadLocal threadLocal2 = brtm.UTF8_CHARSET;
                            brtj.mo69870a(4, size3, 4);
                            while (true) {
                                size3--;
                                if (size3 < 0) {
                                    break;
                                }
                                brtj.mo69866a(fArr2[size3]);
                            }
                            i5 = brtj.mo69876b();
                        } else {
                            i5 = 0;
                        }
                        ThreadLocal threadLocal3 = brtm.UTF8_CHARSET;
                        brtj.mo69885d(5);
                        brtj.mo69883c(0, i4);
                        brtj.mo69883c(1, i5);
                        brtj.mo69879b(2, bvpc.f157266c, 0);
                        brtj.mo69880b(3, bvpc.f157267d);
                        brtj.mo69879b(4, bvpc.f157268e, 0);
                        iArr[i9] = brtj.mo69886e();
                        i9++;
                        i7 = -1;
                        i8 = 1;
                    }
                    ThreadLocal threadLocal4 = brtm.UTF8_CHARSET;
                    brtj.mo69870a(4, size, 4);
                    for (int i12 = size + i7; i12 >= 0; i12--) {
                        brtj.mo69882c(iArr[i12]);
                    }
                    int b = brtj.mo69876b();
                    brtj.mo69885d(i8);
                    brtj.mo69883c(0, b);
                    i = brtj.mo69886e();
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (bvpf.f157282c.size() > 0) {
                int size4 = bvpf.f157282c.size();
                int[] iArr2 = new int[size4];
                for (int i13 = 0; i13 < bvpf.f157282c.size(); i13++) {
                    bvpi bvpi = (bvpi) bvpf.f157282c.get(i13);
                    int a = brtj.mo69862a(bvpi.f157300a);
                    double d = bvpi.f157301b;
                    ThreadLocal threadLocal5 = brtm.UTF8_CHARSET;
                    brtj.mo69885d(2);
                    brtj.mo69868a(1, d);
                    brtj.mo69883c(0, a);
                    iArr2[i13] = brtj.mo69886e();
                }
                ThreadLocal threadLocal6 = brtm.UTF8_CHARSET;
                brtj.mo69870a(4, size4, 4);
                for (int i14 = size4 - 1; i14 >= 0; i14--) {
                    brtj.mo69882c(iArr2[i14]);
                }
                i2 = brtj.mo69876b();
            } else {
                i2 = 0;
            }
            bvpb bvpb = bvpf.f157285f;
            if (bvpb == null) {
                bvpb = bvpb.f157257c;
            }
            if (bvpb.f157260b.size() > 0) {
                bvpb bvpb2 = bvpf.f157285f;
                if (bvpb2 == null) {
                    bvpb2 = bvpb.f157257c;
                }
                int size5 = bvpb2.f157260b.size();
                int[] iArr3 = new int[size5];
                for (int i15 = 0; i15 < size5; i15++) {
                    bvpb bvpb3 = bvpf.f157285f;
                    if (bvpb3 == null) {
                        bvpb3 = bvpb.f157257c;
                    }
                    bvpe bvpe = (bvpe) bvpb3.f157260b.get(i15);
                    int i16 = bvpe.f157275a;
                    int i17 = bvpe.f157276b;
                    ThreadLocal threadLocal7 = brtm.UTF8_CHARSET;
                    brtj.mo69885d(2);
                    brtj.mo69879b(1, i17, 0);
                    brtj.mo69879b(0, i16, 0);
                    iArr3[i15] = brtj.mo69886e();
                }
                ThreadLocal threadLocal8 = brtm.UTF8_CHARSET;
                brtj.mo69870a(4, size5, 4);
                for (int i18 = size5 - 1; i18 >= 0; i18--) {
                    brtj.mo69882c(iArr3[i18]);
                }
                int b2 = brtj.mo69876b();
                brtj.mo69885d(2);
                bvpb bvpb4 = bvpf.f157285f;
                if (bvpb4 == null) {
                    bvpb4 = bvpb.f157257c;
                }
                int a2 = bvnh.m121285a(bvpb4.f157259a);
                if (a2 == 0) {
                    a2 = 1;
                }
                brtj.mo69879b(0, a2 - 1, 0);
                brtj.mo69883c(1, b2);
                i3 = brtj.mo69886e();
            } else {
                i3 = 0;
            }
            ThreadLocal threadLocal9 = brtm.UTF8_CHARSET;
            brtj.mo69885d(5);
            brtj.mo69883c(0, i);
            brtj.mo69883c(1, i2);
            brtj.mo69879b(2, bvpf.f157283d, 0);
            brtj.mo69879b(3, bvpf.f157284e, 0);
            brtj.mo69883c(4, i3);
            brtj.mo69889f(brtj.mo69886e());
            int i19 = brtj.f143316b;
            int capacity = brtj.f143315a.capacity();
            int i20 = brtj.f143316b;
            brtj.mo69881c();
            bArr = new byte[(capacity - i20)];
            brtj.f143315a.position(i19);
            brtj.f143315a.get(bArr);
        } else {
            bArr = new byte[0];
        }
        int length = bArr.length;
        ByteBuffer a3 = bhux.mo64332a(bhux.f119671g.getPath(), ((long) length) + bhux.f119662a.longValue(), false);
        if (a3 != null) {
            a3.put((byte) 4);
            a3.putLong(bhux.f119667c);
            a3.putInt(length);
            a3.putLong(bhux.m101575a(bArr).longValue());
            a3.put(bArr);
            bhux.f119666b = 0;
            return;
        }
        bhuj.m101555a().mo64360b("Failed to write model weights to disk.");
    }
}
