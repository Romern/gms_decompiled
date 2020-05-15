package p000;

import java.security.GeneralSecurityException;
import java.util.LinkedList;

/* renamed from: caqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqt {

    /* renamed from: a */
    public final caov f175604a;

    /* renamed from: b */
    public final caro f175605b;

    /* renamed from: c */
    public final capx f175606c;

    /* renamed from: d */
    public final cark f175607d;

    /* renamed from: e */
    public final casy f175608e;

    /* renamed from: f */
    public final caso f175609f;

    /* renamed from: g */
    public final caqm f175610g;

    /* renamed from: h */
    public final carw f175611h;

    /* renamed from: i */
    public final carv f175612i;

    /* renamed from: j */
    private final caox f175613j;

    public caqt(caox caox, casa casa, caro caro, cark cark) {
        this.f175613j = caox;
        carw a = casa.mo74795a();
        this.f175611h = a;
        if (a != null) {
            carv b = casa.mo74796b();
            this.f175612i = b;
            if (b != null) {
                this.f175605b = caro;
                this.f175607d = cark;
                this.f175604a = cark.f175673a;
                this.f175606c = capx.m126928a(this.f175611h.f175708b);
                this.f175608e = new catb(this.f175612i.f175706b, this.f175605b);
                this.f175610g = new caqm();
                this.f175609f = new casr(this.f175605b);
                return;
            }
            throw new capj("Card Risk Management data not found");
        }
        throw new capj("Remote payment data not found");
    }

    /* renamed from: a */
    private final caow m126995a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return this.f175613j.mo74732a(bArr, bArr2, bArr3);
        } catch (GeneralSecurityException e) {
            throw new InternalError(e.getMessage());
        }
    }

    /* renamed from: a */
    public static byte[] m126996a(caro caro) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(caro.f175680a);
        linkedList.add(caro.f175681b);
        linkedList.add(caro.f175682c);
        linkedList.add(caro.f175683d);
        linkedList.add(caro.f175684e);
        linkedList.add(caro.f175685f);
        linkedList.add(caro.f175686g);
        linkedList.add(caro.f175687h);
        return catg.m127161a(linkedList);
    }

    /* renamed from: a */
    public final caru mo74772a(caro caro, byte b, caou caou) {
        byte[] c = caou.mo49410c();
        this.f175606c.mo74741c(this.f175611h.f175709c);
        LinkedList linkedList = new LinkedList();
        linkedList.add(m126996a(caro));
        linkedList.add(this.f175611h.f175714h);
        linkedList.add(c);
        linkedList.add(this.f175606c.f175521a);
        caow a = m126995a(catg.m127161a(linkedList), caou.mo49411d(), caou.mo49408a());
        byte[] bArr = a.f175509a;
        byte[] bArr2 = a.f175510b;
        byte[] bArr3 = this.f175611h.f175708b;
        int length = bArr3.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = this.f175606c.f175521a;
        System.arraycopy(bArr3, 0, bArr4, 0, length);
        System.arraycopy(bArr5, 0, bArr4, 2, bArr5.length);
        bArr4[8] = 0;
        bArr4[9] = 0;
        System.arraycopy(bArr2, 0, bArr4, 11, 5);
        caqv caqv = new caqv(c, bArr4, bArr, b);
        carw carw = this.f175611h;
        return new caru(carw.f175711e, carw.f175707a, carw.f175712f, carw.f175714h, carw.f175710d, this.f175607d.mo74792a(), caqv);
    }
}
