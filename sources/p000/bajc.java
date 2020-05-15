package p000;

import java.util.List;

/* renamed from: bajc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajc extends cazu {

    /* renamed from: b */
    private final cijl f101037b;

    /* renamed from: c */
    private final cazn f101038c;

    /* renamed from: d */
    private final cazn f101039d;

    /* renamed from: e */
    private final cazn f101040e;

    /* renamed from: f */
    private final cazn f101041f;

    /* renamed from: g */
    private final cazn f101042g;

    /* renamed from: h */
    private final cazn f101043h;

    /* renamed from: i */
    private final cazn f101044i;

    /* renamed from: j */
    private final cazn f101045j;

    public bajc(cijl cijl, cijl cijl2, cijl cijl3, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5, cazn cazn6, cazn cazn7, cazn cazn8) {
        super(cijl2, cbag.m127657a(bajc.class), cijl);
        this.f101037b = cijl3;
        this.f101038c = cbac.m127643a(cazn);
        this.f101039d = cbac.m127643a(cazn2);
        this.f101040e = cbac.m127643a(cazn3);
        this.f101041f = cbac.m127643a(cazn4);
        this.f101042g = cbac.m127643a(cazn5);
        this.f101043h = cbac.m127643a(cazn6);
        this.f101044i = cbac.m127643a(cazn7);
        this.f101045j = cbac.m127643a(cazn8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101038c.mo75201b(), this.f101039d.mo75201b(), this.f101040e.mo75201b(), this.f101041f.mo75201b(), this.f101042g.mo75201b(), this.f101043h.mo75201b(), this.f101044i.mo75201b(), this.f101045j.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Throwable th;
        byhn byhn;
        byhi byhi;
        byhi byhi2;
        byho byho;
        List list = (List) obj;
        cayo b = cayx.m127580b(this.f101037b);
        bygz bygz = (bygz) list.get(0);
        int i = 1;
        byid byid = (byid) list.get(1);
        bafh bafh = (bafh) list.get(2);
        Long l = (Long) list.get(3);
        Long l2 = (Long) list.get(4);
        Integer num = (Integer) list.get(5);
        bngx bngx = (bngx) list.get(6);
        bara bara = (bara) list.get(7);
        int a = byic.m124838a(byid.f166551c);
        if (a == 0 || a != 2) {
            throw new bapa("Client doesn't support paging of server changes!");
        }
        bxwc<bygu> bxwc = byid.f166549a;
        bany b2 = bafh.mo55653a().mo55799b();
        try {
            for (bygu bygu : bxwc) {
                int a2 = bygt.m124796a(bygu.f166387d);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                if (i2 == 1) {
                    bafh.mo55661i();
                    bara.mo55900c();
                } else if (i2 == 2) {
                    if (bygu.f166385b == 4) {
                        byhi = (byhi) bygu.f166386c;
                    } else {
                        byhi = byhi.f166451f;
                    }
                    baiv.m86943a(byhi);
                    byhi.f166456d.getKey();
                    bafh.mo55656d();
                } else if (i2 == 3) {
                    if (bygu.f166385b == 4) {
                        byhi2 = (byhi) bygu.f166386c;
                    } else {
                        byhi2 = byhi.f166451f;
                    }
                    baiv.m86943a(byhi2);
                    bafh.mo55654b();
                } else if (i2 != 5) {
                    int a3 = bygt.m124796a(bygu.f166387d);
                    if (a3 != 0) {
                        i = a3;
                    }
                    String valueOf = String.valueOf(bygt.m124797b(i));
                    String valueOf2 = String.valueOf(bygz);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
                    sb.append("Got unknown change type ");
                    sb.append(valueOf);
                    sb.append(" while syncing channel ");
                    sb.append(valueOf2);
                    throw new bapa(sb.toString());
                } else {
                    if (bygu.f166385b == 7) {
                        byho = (byho) bygu.f166386c;
                    } else {
                        byho = byho.f166484c;
                    }
                    if ((byho.f166486a & 1) != 0) {
                        ByteString.m123258a(byho.f166487b).getKey();
                    }
                    bafh.mo55655c();
                }
            }
            byjj byjj = byid.f166550b;
            if (byjj == null) {
                byjj = byjj.f166658c;
            }
            bafh.mo55745a(b2, byjj);
            bafh.mo55743a(b2, num.intValue());
            bafh.mo55748b(b2, l2.longValue());
            bafh.mo55750c(b2, byid.f166552d);
            bxvd da = byjn.f166675c.mo74144da();
            bxvd da2 = byjo.f166679b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byjo byjo = (byjo) da2.f164949b;
            if (!byjo.f166681a.mo73666a()) {
                byjo.f166681a = GeneratedMessageLite.m124021a(byjo.f166681a);
            }
            bxsy.m123078a(bngx, byjo.f166681a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byjn byjn = (byjn) da.f164949b;
            byjo byjo2 = (byjo) da2.mo74062i();
            byjo2.getClass();
            byjn.f166678b = byjo2;
            byjn.f166677a = 3;
            bafh.mo55746a(b2, (byjn) da.mo74062i());
            bafh.mo55744a(b2, l.longValue());
            b2.mo55796b();
            b2.close();
            if (bygz.f166412a == 2) {
                byhn = (byhn) bygz.f166413b;
            } else {
                byhn = byhn.f166478e;
            }
            ((achw) b.mo16713a()).logVerbose("Downloaded %d changes to the local %s/%s footprints storage.", Integer.valueOf(bxwc.size()), Integer.valueOf(byhn.f166481b), Integer.valueOf(byhn.f166482c));
            bara.mo55899b((long) byid.f166549a.size());
            int i3 = byid.f164961ai;
            if (i3 == -1) {
                i3 = bxxm.f165037a.mo74228a(byid).mo74223b(byid);
                byid.f164961ai = i3;
            }
            long j = (long) i3;
            bara.mo55897a(j, j);
            return bqga.m112775a((Object) null);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
