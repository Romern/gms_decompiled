package p000;

import java.util.List;

/* renamed from: accn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class accn extends cazu {

    /* renamed from: b */
    private final cazn f59574b;

    /* renamed from: c */
    private final cazn f59575c;

    /* renamed from: d */
    private final cazn f59576d;

    /* renamed from: e */
    private final cazn f59577e;

    /* renamed from: f */
    private final cazn f59578f;

    public accn(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5) {
        super(cijl2, cbag.m127657a(accn.class), cijl);
        this.f59574b = cbac.m127643a(cazn);
        this.f59575c = cbac.m127643a(cazn2);
        this.f59576d = cbac.m127643a(cazn3);
        this.f59577e = cbac.m127643a(cazn4);
        this.f59578f = cbac.m127643a(cazn5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f59574b.mo75201b(), this.f59575c.mo75201b(), this.f59576d.mo75201b(), this.f59577e.mo75201b(), this.f59578f.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        acco acco;
        List list = (List) obj;
        achw achw = (achw) list.get(0);
        bygw bygw = (bygw) list.get(1);
        bygz bygz = (bygz) list.get(2);
        String str = (String) list.get(3);
        accl accl = (accl) list.get(4);
        if (!str.isEmpty()) {
            bxwc bxwc = bygw.f166400a;
            int size = bxwc.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    acco = acco.FAIL;
                    break;
                }
                bygv bygv = (bygv) bxwc.get(i);
                bygz bygz2 = bygv.f166392c;
                if (bygz2 == null) {
                    bygz2 = bygz.f166410c;
                }
                if (bygz2.equals(bygz)) {
                    bxwc bxwc2 = bygv.f166393d;
                    int size2 = bxwc2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        bygq bygq = (bygq) bxwc2.get(i2);
                        if (bygq.f166369a != 1 || !((String) bygq.f166370b).equals(str)) {
                            i2++;
                        } else {
                            bygp a = bygp.m124790a(bygq.f166371c);
                            if (a == null) {
                                a = bygp.UNKNOWN;
                            }
                            accl accl2 = accl.READ;
                            int ordinal = a.ordinal();
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    acco = acco.PASS;
                                } else if (ordinal != 3) {
                                    achw.mo25416d("Found unexpected access level enum '%s' in channel config list.  GmsCore too old for serverside service?", a);
                                    acco = acco.FAIL;
                                }
                            }
                            acco = accl != accl.READ ? acco.FAIL : acco.PASS;
                        }
                    }
                    continue;
                }
                i++;
            }
        } else {
            acco = acco.FAIL;
        }
        return bqga.m112775a(acco);
    }
}
