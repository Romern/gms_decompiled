package p000;

import java.security.GeneralSecurityException;

/* renamed from: caqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqo {

    /* renamed from: a */
    public final caoo f175570a;

    /* renamed from: b */
    public final cara f175571b;

    /* renamed from: c */
    public final capx f175572c;

    /* renamed from: d */
    public capy f175573d;

    /* renamed from: e */
    public final caqm f175574e;

    /* renamed from: f */
    public final byte[] f175575f;

    /* renamed from: g */
    public final byte[] f175576g;

    /* renamed from: h */
    public final caov f175577h;

    /* renamed from: i */
    public final caqk f175578i;

    /* renamed from: j */
    public final casy f175579j;

    /* renamed from: k */
    public final caso f175580k;

    /* renamed from: l */
    public final casb f175581l;

    /* renamed from: m */
    public final carv f175582m;

    /* renamed from: n */
    private final caox f175583n;

    /* renamed from: o */
    private final carn f175584o;

    public caqo(caox caox, caoo caoo, cara cara) {
        byte[] bArr;
        this.f175583n = caox;
        this.f175570a = caoo;
        this.f175571b = cara;
        casa casa = cara.f175653o;
        if (casa != null) {
            this.f175581l = casa.f175729b;
            carv b = casa.mo74796b();
            this.f175582m = b;
            casb casb = this.f175581l;
            if (casb == null || b == null) {
                throw new capk("Invalid Card Profile for Generate AC");
            }
            caqk caqk = this.f175571b.f175642d;
            this.f175578i = caqk;
            if (caqk.f175556h) {
                carz h = casb.mo74804h();
                this.f175575f = h.f175727e;
                this.f175576g = h.f175725c;
                bArr = h.f175723a;
            } else {
                casc casc = casb.f175730a.f175742a;
                this.f175575f = casc.f175735d;
                this.f175576g = casc.f175739h;
                bArr = casb.mo74799c();
            }
            byte[] a = caql.m126973a(bArr);
            this.f175572c = capx.m126928a(this.f175581l.mo74797a());
            this.f175574e = new caqm();
            cara cara2 = this.f175571b;
            this.f175577h = cara2.f175643e;
            this.f175584o = cara2.f175651m;
            this.f175579j = new cata(a, this.f175582m.f175706b, this.f175570a, this.f175578i.mo74762a());
            this.f175571b.f175642d.f175563o = caoo.f175466b;
            caoo caoo2 = this.f175570a;
            caon a2 = this.f175578i.mo74762a();
            caqk caqk2 = this.f175578i;
            this.f175580k = new casq(caoo2, a2, caon.m126881a(caqk2.f175562n, caqk2.f175563o));
            return;
        }
        throw new capk("Invalid Card Profile for Generate AC");
    }

    /* renamed from: b */
    private final caqu m126980b() {
        return new caqu(this.f175578i, this.f175580k, new byte[0], new byte[0]);
    }

    /* renamed from: c */
    private final caow m126981c(caou caou) {
        byte[] c = caou.mo49410c();
        byte[] bArr = new byte[39];
        byte[] bArr2 = this.f175570a.f175466b;
        byte[] bArr3 = this.f175578i.f175557i;
        System.arraycopy(bArr2, 0, bArr, 0, 29);
        System.arraycopy(bArr3, 0, bArr, 29, 2);
        System.arraycopy(c, 0, bArr, 31, 2);
        System.arraycopy(this.f175572c.f175521a, 0, bArr, 33, 6);
        byte[] d = caou.mo49411d();
        byte[] a = caou.mo49408a();
        try {
            caow a2 = this.f175583n.mo74732a(bArr, d, a);
            catg.m127166c(d);
            catg.m127166c(a);
            return a2;
        } catch (GeneralSecurityException e) {
            throw new capk(e.getMessage());
        } catch (Throwable th) {
            catg.m127166c(d);
            catg.m127166c(a);
            throw th;
        }
    }

    /* renamed from: a */
    public final caou mo74767a() {
        return this.f175577h.mo49420d();
    }

    /* renamed from: a */
    public final byte[] mo74768a(caou caou) {
        this.f175578i.mo74763a(caou.mo49410c());
        this.f175572c.mo74743e();
        this.f175574e.mo74766b();
        caoo caoo = this.f175570a;
        if (caoo.f175479o && caoo.f175482r && this.f175571b.mo74775a()) {
            this.f175572c.mo74744f();
        }
        return mo74769b(caou);
    }

    /* renamed from: b */
    public final byte[] mo74769b(caou caou) {
        this.f175572c.mo74741c(this.f175576g);
        caow c = m126981c(caou);
        byte[] bArr = c.f175509a;
        byte[] bArr2 = c.f175510b;
        this.f175571b.f175642d.f175555g = bArr;
        byte[] a = this.f175581l.mo74797a();
        int length = a.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(a, 0, bArr3, 0, length);
        System.arraycopy(this.f175572c.f175521a, 0, bArr3, 2, 6);
        if (catg.m127168d(this.f175570a.f175476l)) {
            System.arraycopy(this.f175570a.f175475k, 0, bArr3, 8, 2);
        } else {
            System.arraycopy(this.f175570a.f175476l, 0, bArr3, 8, 2);
        }
        System.arraycopy(bArr2, 0, bArr3, 11, 5);
        caqv caqv = new caqv(caou.mo49410c(), bArr3, bArr, this.f175574e.f175568a);
        if ((this.f175572c.f175521a[1] & 64) == 64) {
            caop caop = new caop(this.f175583n, this.f175570a, this.f175578i, this.f175573d, caqv, caou.mo49409b(), this.f175581l.f175730a.f175745d);
            this.f175584o.mo49414a(m126980b());
            return caop.f175449a;
        }
        byte[] bArr4 = new caop(this.f175570a, this.f175578i, this.f175573d, caqv).f175449a;
        this.f175584o.mo49414a(m126980b());
        return bArr4;
    }
}
