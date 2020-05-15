package p000;

import java.util.Arrays;

/* renamed from: bro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bro extends bxo {

    /* renamed from: a */
    public byte[] f5482a;

    /* renamed from: b */
    public brb f5483b;

    /* renamed from: c */
    public brh f5484c;

    /* renamed from: e */
    private boolean f5485e = true;

    /* renamed from: f */
    private byte[] f5486f = null;

    public bro() {
    }

    /* renamed from: a */
    public final bxo mo3460a() {
        bro bro;
        byte[] bArr;
        byte[] i = mo3587i();
        if (i == null) {
            bro = new bro();
        } else {
            bro = new bro(Arrays.copyOf(i, i.length));
        }
        bro.f5485e = this.f5485e;
        byte[] bArr2 = this.f5486f;
        byte[] bArr3 = null;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        bro.f5486f = bArr;
        byte[] bArr4 = this.f5482a;
        if (bArr4 != null) {
            bArr3 = Arrays.copyOf(bArr4, bArr4.length);
        }
        bro.f5482a = bArr3;
        return bro;
    }

    /* renamed from: b */
    public final brj mo3461b() {
        return new brj(mo3586a(bpk.m3440c(brj.f5454a)));
    }

    /* renamed from: c */
    public final brk mo3464e() {
        return new brk(mo3586a(bpk.m3440c(bxs.f6023b)));
    }

    /* renamed from: d */
    public final bwz mo3463d() {
        return new brd(mo3586a(bpk.m3440c(brd.f5417a)));
    }

    public bro(byte[] bArr) {
        super(bArr);
    }
}
