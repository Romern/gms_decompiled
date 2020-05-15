package p000;

import java.util.Map;

/* renamed from: bxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxb {

    /* renamed from: a */
    private String f5942a = null;

    /* renamed from: b */
    public final Map f5943b;

    static {
        bxb.class.getSimpleName();
    }

    public bxb(Map map) {
        this.f5943b = map;
    }

    /* renamed from: a */
    public final int mo3569a(byte b) {
        return Integer.valueOf(cbm.m3892a(b)).intValue();
    }

    /* renamed from: a */
    public abstract boolean mo3423a();

    /* renamed from: b */
    public abstract bys mo3424b();

    /* renamed from: b */
    public final bys mo3573b(byte b, byte b2) {
        return mo3576c(new bze(b, b2));
    }

    /* renamed from: c */
    public final bys mo3576c(bze bze) {
        String str;
        Map map;
        bzo bzo = (bzo) this.f5943b.get(bzo.f6260a);
        bys bys = null;
        if (!(bzo == null || (str = this.f5942a) == null || (map = (Map) bzo.f6262f.get(str)) == null)) {
            bys = (bys) map.get(bze);
        }
        if (bys == null) {
            bys = (bys) this.f5943b.get(bze);
        }
        if (bys != null) {
            return bys;
        }
        String valueOf = String.valueOf(bze);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("No such dgi ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public abstract boolean mo3426c();

    /* renamed from: d */
    public abstract byl mo3429d();

    /* renamed from: e */
    public byl mo3431e() {
        return mo3429d();
    }

    /* renamed from: f */
    public abstract bxr mo3432f(bxm bxm);

    /* renamed from: k */
    public final bxv mo3577k() {
        byte[] b = mo3575b(bxv.f6042a);
        if (b != null) {
            return new bxv(b);
        }
        return null;
    }

    /* renamed from: b */
    public final bys mo3574b(bze bze) {
        byte[] bArr = bop.f5263c;
        try {
            return mo3576c(bze);
        } catch (IllegalArgumentException e) {
            throw new bon("Conditions Not Satisfied", bArr, e);
        }
    }

    /* renamed from: a */
    public final void mo3570a(byte[] bArr) {
        this.f5942a = cbm.m3893a(bArr);
    }

    /* renamed from: a */
    public final boolean mo3571a(byte b, byte b2) {
        return mo3572a(new bze(b, b2));
    }

    /* renamed from: a */
    public final boolean mo3572a(bze bze) {
        String str;
        Map map;
        bzo bzo = (bzo) this.f5943b.get(bzo.f6260a);
        if (bzo == null || (str = this.f5942a) == null || (map = (Map) bzo.f6262f.get(str)) == null || !map.containsKey(bze)) {
            return this.f5943b.containsKey(bze);
        }
        return true;
    }

    /* renamed from: b */
    public final byte[] mo3575b(byte[] bArr) {
        for (bys bys : this.f5943b.values()) {
            if (bys instanceof byx) {
                byx byx = (byx) bys;
                if (byx.mo3583b(bArr)) {
                    return byx.mo3582a(bArr);
                }
            }
        }
        return null;
    }
}
