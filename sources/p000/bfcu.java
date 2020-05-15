package p000;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: bfcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcu implements bhba {

    /* renamed from: a */
    public long f113436a;

    /* renamed from: b */
    public boolean f113437b;

    /* renamed from: c */
    public final bfct f113438c;

    /* renamed from: d */
    final bgmk f113439d;

    /* renamed from: e */
    public final bgml f113440e;

    /* renamed from: f */
    public final bfdd f113441f = new bfdd(null);

    /* renamed from: g */
    private bfmf f113442g;

    public bfcu(bgml bgml, bgmk bgmk, bfct bfct) {
        this.f113440e = bgml;
        this.f113439d = bgmk;
        this.f113438c = bfct;
        mo61421a(bgmk.mo62776c());
    }

    /* renamed from: a */
    public final void mo61420a() {
        this.f113441f.f113469e.mo61440d();
    }

    /* renamed from: a */
    public final void mo61422a(long j, boolean z) {
        this.f113436a = j;
        this.f113437b = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfcu.a(long, boolean):void
     arg types: [long, int]
     candidates:
      bfcu.a(bsax, long):void
      bfcu.a(bxvd, long):void
      bhba.a(bsax, long):void
      bhba.a(bxvd, long):void
      bfcu.a(long, boolean):void */
    /* renamed from: a */
    public final void mo61421a(long j) {
        mo61422a(j - ((long) Math.floor(Math.random() * 8.64E7d)), true);
        this.f113441f.f113465a.clear();
    }

    /* renamed from: a */
    public final void mo61423a(bfmu bfmu, boolean z, long j) {
        int i;
        int i2;
        ArrayList arrayList = bfmu.f114429b;
        if (!arrayList.isEmpty()) {
            int d = this.f113438c.mo61410d();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                bsax bsax = (bsax) arrayList.get(i3);
                int j2 = bsax.mo70138j(3);
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    if (i4 >= j2) {
                        break;
                    }
                    bsax f = bsax.mo70131f(3, i4);
                    if (f.mo70137i(1)) {
                        bsax e = f.mo70129e(1);
                        if (e.mo70137i(8)) {
                            i2 = e.mo70114b(8);
                        } else {
                            i2 = -1;
                        }
                        if (f.mo70137i(2) && i2 != 3) {
                            String b = bfmn.m97258b(f.mo70129e(2));
                            if (e.mo70137i(3) && e.mo70137i(1)) {
                                bfni bfni = new bfni(e.mo70129e(1).mo70114b(1), e.mo70129e(1).mo70114b(2), e.mo70114b(3) * 1000);
                                bfdd bfdd = this.f113441f;
                                if (z || bfdd.f113465a.mo72561a(b)) {
                                    int b2 = bfdd.mo61457b();
                                    int a = ((buad) bfdd.f113465a).mo72531a(b, bfni);
                                    if (a < 0) {
                                        bfdd.f113469e.mo61439c();
                                        if (b2 == bfdd.mo61457b()) {
                                            bfdd.f113469e.mo61436a();
                                        }
                                        a ^= -1;
                                        bfdd.f113468d[a] = j;
                                    }
                                    bfdd.f113467c[a] = j;
                                    bfdd.f113466b[a] = d;
                                }
                            }
                        }
                    }
                    i4++;
                }
                i3 = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo61424a(bgmm bgmm) {
        File b = bgmm.mo62782b();
        if (b != null) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(b, "nlp_state")));
                byte[] b2 = this.f113440e.mo63006b();
                long d = this.f113439d.mo62777d();
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                dataOutputStream.writeShort(15);
                dataOutputStream.flush();
                bfdd bfdd = this.f113441f;
                ByteBuffer allocate = ByteBuffer.allocate(bfdd.mo61454a() + 12 + bfdd.f113465a.mo72569h() + 17);
                allocate.putLong(d);
                allocate.putLong(this.f113436a);
                allocate.put(this.f113437b ? (byte) 1 : 0);
                this.f113441f.mo61458b(allocate);
                if (this.f113442g == null) {
                    this.f113442g = bfmf.m97226a(b2, (bhdb) null);
                }
                this.f113442g.mo61918a(dataOutputStream, allocate.array());
                dataOutputStream.close();
            } catch (IOException | SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("exception is ");
                } else {
                    "exception is ".concat(valueOf);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61425a(bsax bsax, long j) {
        bfdd bfdd = this.f113441f;
        bsax.mo70118b(3, bfdd.f113469e.mo61435a(bfdd.f113465a.mo72567g(), bfdd.f113465a.size()));
    }

    /* renamed from: a */
    public final void mo61426a(bxvd bxvd, long j) {
        bfdd bfdd = this.f113441f;
        bums b = bfdd.f113469e.mo61437b(bfdd.f113465a.mo72567g(), bfdd.f113465a.size());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buna buna = (buna) bxvd.f164949b;
        buna buna2 = buna.f154289i;
        b.getClass();
        buna.f154293c = b;
        buna.f154291a |= 2;
    }

    /* renamed from: a */
    public final void mo61427a(InputStream inputStream, byte[] bArr, long j, long j2) {
        boolean z;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            Locale locale = Locale.US;
            new Object[1][0] = Integer.valueOf(readUnsignedShort);
            if (readUnsignedShort == 15) {
                if (this.f113442g == null) {
                    this.f113442g = bfmf.m97226a(bArr, (bhdb) null);
                }
                ByteBuffer wrap = ByteBuffer.wrap(this.f113442g.mo61917a(dataInputStream).f114390b);
                long min = Math.min(j2, (wrap.getLong() + wrap.getLong()) - j);
                if (wrap.get() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                mo61422a(min, z);
                this.f113441f.mo61456a(wrap);
                Locale locale2 = Locale.US;
                Object[] objArr = {Integer.valueOf(this.f113441f.mo61457b()), new Date(this.f113436a + j)};
                return;
            }
            mo61421a(j2);
        } catch (IllegalArgumentException | BufferUnderflowException e) {
            throw new IOException("Byte buffer read failed.", e);
        } catch (IOException e2) {
            mo61421a(j2);
            throw e2;
        }
    }
}
