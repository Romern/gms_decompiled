package p000;

import java.util.List;

/* renamed from: caqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqq {

    /* renamed from: a */
    public static final byte[] f175588a = {-97, 105};

    /* renamed from: b */
    public static final byte[] f175589b = {112};

    /* renamed from: c */
    public final byte[] f175590c;

    /* renamed from: d */
    private final byte f175591d;

    /* renamed from: e */
    private final byte f175592e;

    /* renamed from: f */
    private final List f175593f;

    /* renamed from: g */
    private cara f175594g;

    private caqq(caoi caoi, cara cara) {
        byte[] a;
        byte b;
        caom caom;
        this.f175594g = cara;
        this.f175591d = caoi.mo74722a();
        this.f175592e = (byte) (caoi.mo74723b() >>> 3);
        this.f175593f = cara.f175648j;
        carx[] carxArr = cara.f175653o.f175729b.f175731b;
        int length = carxArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                a = caor.m126888a(27267);
                break;
            }
            carx carx = carxArr[i];
            byte b2 = carx.f175715a;
            byte b3 = this.f175591d;
            if (b2 == b3 && carx.f175716b == (b = this.f175592e)) {
                try {
                    byte[] bArr = carx.f175717c;
                    if (b3 == 1) {
                        if (b == 1) {
                            catj a2 = catj.m127172a(bArr);
                            if (a2 != null) {
                                catj a3 = catj.m127172a(a2.mo74844b(f175589b));
                                if (a3 != null) {
                                    caom a4 = caom.m126877a(a3.mo74844b(f175588a));
                                    List<caol> list = this.f175593f;
                                    if (list == null) {
                                        this.f175594g.f175642d.f175560l = a4;
                                    } else {
                                        for (caol caol : list) {
                                            a4.mo74727a(caol.f175462a, caol.f175463b);
                                        }
                                        this.f175594g.f175642d.f175560l = a4;
                                        a3.mo74841a(f175588a, a4.mo74728b());
                                        a2.mo74841a(f175589b, a3.mo74842a());
                                        bArr = a2.mo74842a();
                                    }
                                    a = caor.m126889a(bArr);
                                } else {
                                    throw new capk("Invalid Record 1 SFI 1 profile data");
                                }
                            } else {
                                throw new capk("Invalid Record 1 SFI 1 profile data");
                            }
                        }
                    }
                    catj a5 = catj.m127172a(bArr);
                    if (a5 != null) {
                        catj a6 = catj.m127172a(a5.mo74844b(f175589b));
                        if (a6 != null) {
                            byte[] a7 = a6.mo74843a("8C");
                            if (a7 != null) {
                                caom = caom.m126877a(a7);
                            } else {
                                caom = null;
                            }
                            if (caom != null) {
                                this.f175594g.f175642d.f175562n = caom;
                            }
                            a = caor.m126889a(bArr);
                        } else {
                            throw new caph("Invalid Record profile data");
                        }
                    } else {
                        throw new caph("Invalid Record profile data");
                    }
                } catch (capg e) {
                    throw new capk("Invalid Record format");
                }
            } else {
                i++;
            }
        }
        this.f175590c = a;
    }

    /* renamed from: a */
    public static caqq m126987a(caoi caoi, cara cara) {
        return new caqq(caoi, cara);
    }
}
