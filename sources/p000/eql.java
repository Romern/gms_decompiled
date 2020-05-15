package p000;

import java.util.HashMap;

/* renamed from: eql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eql {

    /* renamed from: a */
    private final bmzi f15528a;

    /* renamed from: b */
    private final HashMap f15529b = new HashMap();

    public eql(bmzi bmzi) {
        this.f15528a = bmzi;
    }

    /* renamed from: a */
    private final void m10997a(ffk ffk, epd epd) {
        if (!stm.m36302d(ffk.f16458a)) {
            ((rjx) this.f15528a.mo6606a()).mo24710a((alkx) null).mo9458a(new eqk(ffk, epd));
        } else {
            epd.mo2450b(bmxv.m108566b(ffl.f16459d));
        }
    }

    /* renamed from: b */
    public final void mo10416b(ffk ffk) {
        epd epd = (epd) this.f15529b.get(ffk);
        if (epd != null && ((bmxv) epd.mo2448b()).mo66813a()) {
            m10997a(ffk, epd);
        }
    }

    /* renamed from: a */
    public final C0034at mo10415a(ffk ffk) {
        epd epd = (epd) this.f15529b.get(ffk);
        if (epd != null) {
            bmxv bmxv = (bmxv) epd.mo2448b();
            if (bmxv.mo66813a() && (stm.m36302d(((ffl) bmxv.mo66814b()).f16462b) || ((ffl) bmxv.mo66814b()).f16462b.equals(ffk.f16458a) || ((ffl) bmxv.mo66814b()).f16463c == 0)) {
                m10997a(ffk, epd);
            }
            return epd;
        }
        bxvd da = ffl.f16459d.mo74144da();
        String str = ffk.f16458a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((ffl) da.f164949b).f16461a = str;
        epd epd2 = new epd(bmxv.m108566b((ffl) da.mo74062i()));
        this.f15529b.put(ffk, epd2);
        m10997a(ffk, epd2);
        return epd2;
    }
}
