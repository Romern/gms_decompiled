package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

/* renamed from: bpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpz implements cat {

    /* renamed from: a */
    public final bpv f5334a = new bpv();

    /* renamed from: b */
    public byte[] f5335b;

    static {
        bpz.class.getSimpleName();
    }

    public bpz() {
        new bpr();
    }

    /* renamed from: a */
    public final bxa mo3405a(bxd bxd) {
        try {
            byte[] bArr = this.f5335b;
            new Object[1][0] = bArr;
            int i = cbd.f6383a;
            if (bArr != null) {
                bxa bxa = new bxa(bxd.mo3438a(new ByteArrayInputStream(bArr)), new Date());
                this.f5334a.mo3394b();
                return bxa;
            }
            throw new IllegalStateException();
        } catch (IOException e) {
            throw cbb.m3877a((Throwable) e);
        } catch (Throwable th) {
            this.f5334a.mo3394b();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo3406a(bpc bpc) {
        this.f5334a.f5325c = bpc.mo3358e();
    }
}
