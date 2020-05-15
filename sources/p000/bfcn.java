package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* renamed from: bfcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcn extends bfki {

    /* renamed from: a */
    public static final bfcn f113402a = new bfcn();

    /* renamed from: b */
    public bgmk f113403b;

    /* renamed from: c */
    public bgns f113404c;

    /* renamed from: d */
    public long f113405d = 0;

    /* renamed from: e */
    long f113406e = 0;

    /* renamed from: f */
    final int[] f113407f = new int[34];

    /* renamed from: m */
    private long f113408m = -1;

    private bfcn() {
    }

    /* renamed from: b */
    private final void m96351b(int i, int i2) {
        int[] iArr = this.f113407f;
        int i3 = i - 1;
        iArr[i3] = iArr[i3] + i2;
    }

    /* renamed from: a */
    public final void mo61394a() {
        Arrays.fill(this.f113407f, 0);
        this.f113406e = this.f113403b.mo62775b();
    }

    /* renamed from: a */
    public final void mo61395a(int i) {
        m96351b(i, 1);
    }

    /* renamed from: b */
    public final int mo61403b(int i) {
        return this.f113407f[i - 1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61396a(int i, int i2) {
        this.f113407f[i - 1] = i2;
    }

    /* renamed from: a */
    public final void mo61397a(int i, bsax bsax, int i2) {
        if (bsax.mo70137i(i2)) {
            try {
                m96351b(i, bsax.mo70129e(i2).mo70120b().length);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo61398a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(146);
        allocate.putShort(9);
        allocate.putLong(this.f113406e);
        for (int i : this.f113407f) {
            allocate.putInt(i);
        }
        this.f114294g.mo62786f().execute(new bfcl(this, allocate));
        this.f113405d = j;
    }

    /* renamed from: a */
    public final void mo61399a(bsax bsax) {
        long b = this.f113403b.mo62775b();
        long j = (b - this.f113406e) - 86400000;
        if (j > 1200000) {
            mo61394a();
            mo61398a(b);
        } else if (j >= -1200000) {
            boolean z = mo61403b(5) > 0;
            StringBuilder sb = new StringBuilder(24);
            sb.append("FREWLE is enabled? ");
            sb.append(z);
            sb.toString();
            int b2 = mo61403b(1);
            int b3 = mo61403b(2);
            StringBuilder sb2 = new StringBuilder(130);
            sb2.append("Number of successful wifi cluster gls transactions: ");
            sb2.append(b2);
            sb2.append(", Number of unsuccessful wifi cluster gls transactions: ");
            sb2.append(b3);
            sb2.toString();
            int b4 = mo61403b(11);
            int b5 = mo61403b(12);
            StringBuilder sb3 = new StringBuilder(130);
            sb3.append("Number of successful cell locator gls transactions: ");
            sb3.append(b4);
            sb3.append(", Number of unsuccessful cell locator gls transactions: ");
            sb3.append(b5);
            sb3.toString();
            int b6 = mo61403b(3);
            int b7 = mo61403b(4);
            StringBuilder sb4 = new StringBuilder(118);
            sb4.append("Number of successful FREWLE gls transactions: ");
            sb4.append(b6);
            sb4.append(", Number of unsuccessful FREWLE gls transactions: ");
            sb4.append(b7);
            sb4.toString();
            int b8 = mo61403b(13);
            int b9 = mo61403b(14);
            StringBuilder sb5 = new StringBuilder(136);
            sb5.append("Total number of successful gls transactions over wifi: ");
            sb5.append(b8);
            sb5.append(", Total number of unsuccessful gls transactions over wifi: ");
            sb5.append(b9);
            sb5.toString();
            int b10 = mo61403b(15);
            int b11 = mo61403b(16);
            StringBuilder sb6 = new StringBuilder(136);
            sb6.append("Total number of successful gls transactions over cell: ");
            sb6.append(b10);
            sb6.append(", Total number of unsuccessful gls transactions over cell: ");
            sb6.append(b11);
            sb6.toString();
            int b12 = mo61403b(18);
            int b13 = mo61403b(19);
            StringBuilder sb7 = new StringBuilder(116);
            sb7.append("Total number of successful gls transactions: ");
            sb7.append(b12);
            sb7.append(", Total number of unsuccessful gls transactions: ");
            sb7.append(b13);
            sb7.toString();
            int b14 = mo61403b(6);
            int b15 = mo61403b(7);
            StringBuilder sb8 = new StringBuilder(110);
            sb8.append("Number of bytes uploaded by wifi cluster: ");
            sb8.append(b14);
            sb8.append(", Number of bytes downloaded by wifi cluster: ");
            sb8.append(b15);
            sb8.toString();
            int b16 = mo61403b(8);
            int b17 = mo61403b(9);
            StringBuilder sb9 = new StringBuilder(98);
            sb9.append("Number of bytes uploaded by FREWLE: ");
            sb9.append(b16);
            sb9.append(", Number of bytes downloaded by FREWLE: ");
            sb9.append(b17);
            sb9.toString();
            int b18 = mo61403b(10);
            int b19 = mo61403b(17);
            StringBuilder sb10 = new StringBuilder(94);
            sb10.append("Number of bytes uploaded by cell: ");
            sb10.append(b18);
            sb10.append(", Number of bytes downloaded by cell: ");
            sb10.append(b19);
            sb10.toString();
            int b20 = mo61403b(22);
            int b21 = mo61403b(23);
            int b22 = mo61403b(24);
            int b23 = mo61403b(25);
            StringBuilder sb11 = new StringBuilder(163);
            sb11.append("Number of FREWLE locations: ");
            sb11.append(b20);
            sb11.append(", Number of GPWLE locations: ");
            sb11.append(b21);
            sb11.append(", Total number of Wifi locations: ");
            sb11.append(b22);
            sb11.append(", Number of cell locations: ");
            sb11.append(b23);
            sb11.toString();
            if (ceze.f183524a.mo6606a().uploadNlpDailyStats()) {
                mo61396a(26, this.f114294g.mo62787g());
                mo61396a(29, cewj.f183475a.mo80329e().elevationFromWifiEnabled() ? 1 : 0);
                mo61396a(5, cewj.m138361d() ? 1 : 0);
                bsax bsax2 = new bsax(bgox.f117056aw);
                for (int i = 1; i < this.f113407f.length + 1; i++) {
                    int g = bsax2.mo70133g(i);
                    if (g == 21) {
                        bsax2.mo70134g(i, mo61403b(i));
                    } else if (g == 24) {
                        bsax2.mo70119b(i, mo61403b(i) > 0);
                    } else {
                        StringBuilder sb12 = new StringBuilder(36);
                        sb12.append("Unexpected ProtoBufType: ");
                        sb12.append(g);
                        throw new IllegalStateException(sb12.toString());
                    }
                }
                bsax bsax3 = new bsax(bgox.f117055av);
                bsax3.mo70117b(1, b / 1000);
                bsax3.mo70134g(2, (int) ((b - this.f113406e) / 1000));
                bsax3.mo70118b(17, bsax2);
                bsax.mo70107a(5, bsax3);
            }
            mo61394a();
            mo61398a(b);
        }
    }

    /* renamed from: a */
    public final void mo61400a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bfnb bfnb = (bfnb) list.get(i);
            bfns bfns = bfnb.f114457b;
            if (bfns != null) {
                bfmy bfmy = bfmy.OK;
                int ordinal = bfns.f114450d.ordinal();
                if (ordinal == 1) {
                    mo61395a(33);
                } else if (ordinal == 3) {
                    mo61395a(34);
                } else if (ordinal == 4) {
                    mo61395a(32);
                }
            }
            bfmz bfmz = bfnb.f114456a;
            if (bfmz != null) {
                if (bfmz == bfnb.f114458c) {
                    mo61395a(25);
                } else if (bfmz == bfnb.f114457b) {
                    mo61395a(24);
                    if (bfnb.f114457b.f114508a == 5) {
                        mo61395a(22);
                        bfni bfni = bfnb.f114457b.f114449c;
                        if (bfni != null && bfni.mo61981b()) {
                            mo61395a(30);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61401a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.limit() - wrap.position() != 146) {
            throw new IOException("Byte buffer length doesn't match expected byte buffer length");
        } else if (wrap.getShort() == 9) {
            this.f113404c.mo62921a((Runnable) new bfcm(this, wrap));
        } else {
            throw new IOException("File version doesn't match expected version");
        }
    }

    /* renamed from: a */
    public final void mo61402a(bfoa[] bfoaArr, boolean z) {
        int i;
        if (bfoaArr != null) {
            if (z) {
                i = bfoaArr.length - 1;
            } else {
                i = 0;
            }
            while (i >= 0) {
                long d = bfoaArr[i].mo62009d();
                if (d > this.f113408m) {
                    this.f113408m = d;
                    mo61395a(31);
                }
                i--;
            }
        }
    }
}
