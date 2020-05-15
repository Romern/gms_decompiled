package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: bgol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgol {

    /* renamed from: a */
    public final long f116929a;

    /* renamed from: b */
    public final bgoo f116930b;

    /* renamed from: c */
    public final bgoo f116931c;

    /* renamed from: d */
    public final bgoo f116932d;

    /* renamed from: e */
    public final bgoo f116933e;

    /* renamed from: f */
    public final bgmm f116934f;

    public bgol(bgmm bgmm, long j, long j2) {
        bgoo bgoo = new bgoo("bandwidth", bfct.m96369o(), j, j2);
        bgoo bgoo2 = new bgoo("general-gps", bfct.m96370p(), j, j2);
        bgoo bgoo3 = new bgoo("sensor-gps", bfct.m96371q(), j, j2);
        bgoo bgoo4 = new bgoo("burst-gps", bfct.m96368n(), j, j2);
        this.f116934f = bgmm;
        this.f116929a = j;
        this.f116930b = bgoo;
        this.f116931c = bgoo2;
        this.f116932d = bgoo3;
        this.f116933e = bgoo4;
        mo63038b(j2);
    }

    /* renamed from: a */
    private static void m99518a(bgoo bgoo, bsax bsax, int i) {
        bsax bsax2 = new bsax(bgox.f117079bS);
        bgoo.mo63049a(bsax2);
        bsax.mo70118b(i, bsax2);
    }

    /* renamed from: b */
    public final synchronized void mo63038b(long j) {
        this.f116930b.mo63046a(j);
        this.f116931c.mo63046a(j);
        this.f116932d.mo63046a(j);
        this.f116933e.mo63046a(j);
    }

    /* renamed from: a */
    public static final void m99519a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo63036a(long j) {
        this.f116934f.mo62786f().submit(new bgok(this, j));
    }

    /* renamed from: a */
    public final synchronized void mo63037a(long j, ByteArrayOutputStream byteArrayOutputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(1);
        bsax bsax = new bsax(bgox.f117078bR);
        bsax.mo70117b(1, this.f116929a);
        bsax.mo70117b(2, j);
        m99518a(this.f116930b, bsax, 3);
        m99518a(this.f116931c, bsax, 4);
        m99518a(this.f116932d, bsax, 5);
        m99518a(this.f116933e, bsax, 6);
        dataOutputStream.write(bsax.mo70120b());
        dataOutputStream.close();
    }
}
