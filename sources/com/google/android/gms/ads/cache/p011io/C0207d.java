package com.google.android.gms.ads.cache.p011io;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.ads.cache.io.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0207d extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ C0208e f7871a;

    public C0207d(C0208e eVar) {
        this.f7871a = eVar;
    }

    /* renamed from: a */
    private final void m5065a() {
        C0208e eVar = this.f7871a;
        if (this == eVar.f7874c) {
            eVar.mo6416e();
            return;
        }
        throw new IOException("attempt to reuse closed OutputStream");
    }

    public final void close() {
        synchronized (this.f7871a.f7872a) {
            m5065a();
            C0208e eVar = this.f7871a;
            eVar.f7874c = null;
            eVar.f7872a.notifyAll();
        }
    }

    public final void write(int i) {
        synchronized (this.f7871a.f7872a) {
            m5065a();
            C0208e eVar = this.f7871a;
            eVar.f7875d.seek(eVar.f7877f);
            this.f7871a.f7875d.write(i);
            C0208e eVar2 = this.f7871a;
            eVar2.f7877f++;
            eVar2.f7872a.notifyAll();
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i2 < 0 || i < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            synchronized (this.f7871a.f7872a) {
                m5065a();
                C0208e eVar = this.f7871a;
                eVar.f7875d.seek(eVar.f7877f);
                this.f7871a.f7875d.write(bArr, i, i2);
                C0208e eVar2 = this.f7871a;
                eVar2.f7877f += (long) (i2 - i);
                eVar2.f7872a.notifyAll();
            }
        }
    }
}
