package p000;

import android.content.Context;

/* renamed from: wia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wia {

    /* renamed from: a */
    private final qws f50698a;

    /* renamed from: b */
    private String f50699b = null;

    /* renamed from: c */
    private final bxvd f50700c = dct.f12880d.mo74144da();

    public wia(Context context) {
        this.f50698a = new qws(context, "UNICORN_FAMILY_MANAGEMENT", null);
    }

    /* renamed from: a */
    private final void m41956a(dcv dcv) {
        bxvd da = ddc.f12912f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ddc ddc = (ddc) da.f164949b;
        dcv.getClass();
        ddc.f12918e = dcv;
        ddc.f12914a |= 16;
        dct dct = (dct) this.f50700c.mo74062i();
        dct.getClass();
        ddc.f12917d = dct;
        ddc.f12914a |= 8;
        m41957a((ddc) da.mo74062i());
    }

    /* renamed from: b */
    public final void mo29116b(int i) {
        bxvd da = ddd.f12919d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ddd ddd = (ddd) da.f164949b;
        ddd.f12922b = i - 1;
        ddd.f12921a |= 1;
        mo29113a((ddd) da.mo74062i());
    }

    public wia(Context context, String str, String str2, String str3) {
        this.f50698a = new qws(context, "UNICORN_FAMILY_MANAGEMENT", str);
        bxvd bxvd = this.f50700c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        dct dct = (dct) bxvd.f164949b;
        str2.getClass();
        dct.f12882a |= 1;
        dct.f12883b = str2;
        bxvd bxvd2 = this.f50700c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        dct dct2 = (dct) bxvd2.f164949b;
        str3.getClass();
        dct2.f12882a |= 2;
        dct2.f12884c = str3;
    }

    /* renamed from: a */
    private final void m41957a(ddc ddc) {
        String str;
        qwo a = this.f50698a.mo24335a(ddc.mo73642k());
        if (this.f50698a.f42342i == null && (str = this.f50699b) != null) {
            a.mo24330c(str);
        }
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo29109a(int i) {
        bxvd da = dcx.f12900d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dcx dcx = (dcx) da.f164949b;
        dcx.f12903b = i - 1;
        dcx.f12902a |= 1;
        mo29112a((dcx) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo29110a(int i, int i2) {
        bxvd da = dcv.f12886e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dcv dcv = (dcv) da.f164949b;
        dcv.f12889b = i - 1;
        int i3 = dcv.f12888a | 1;
        dcv.f12888a = i3;
        dcv.f12890c = i2 - 1;
        dcv.f12888a = i3 | 2;
        m41956a((dcv) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo29111a(int i, int i2, String str) {
        bxvd da = dcv.f12886e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dcv dcv = (dcv) da.f164949b;
        dcv.f12889b = i - 1;
        int i3 = dcv.f12888a | 1;
        dcv.f12888a = i3;
        dcv.f12890c = i2 - 1;
        int i4 = i3 | 2;
        dcv.f12888a = i4;
        str.getClass();
        dcv.f12888a = i4 | 4;
        dcv.f12891d = str;
        m41956a((dcv) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo29112a(dcx dcx) {
        bxvd da = ddc.f12912f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ddc ddc = (ddc) da.f164949b;
        dcx.getClass();
        ddc.f12915b = dcx;
        ddc.f12914a |= 1;
        dct dct = (dct) this.f50700c.mo74062i();
        dct.getClass();
        ddc.f12917d = dct;
        ddc.f12914a |= 8;
        m41957a((ddc) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo29113a(ddd ddd) {
        bxvd da = ddc.f12912f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ddc ddc = (ddc) da.f164949b;
        ddd.getClass();
        ddc.f12916c = ddd;
        ddc.f12914a |= 2;
        dct dct = (dct) this.f50700c.mo74062i();
        dct.getClass();
        ddc.f12917d = dct;
        ddc.f12914a |= 8;
        m41957a((ddc) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo29114a(String str, String str2, String str3) {
        this.f50699b = str;
        if (str2 != null) {
            bxvd bxvd = this.f50700c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dct dct = (dct) bxvd.f164949b;
            dct dct2 = dct.f12880d;
            str2.getClass();
            dct.f12882a |= 1;
            dct.f12883b = str2;
        } else {
            bxvd bxvd2 = this.f50700c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            dct dct3 = (dct) bxvd2.f164949b;
            dct dct4 = dct.f12880d;
            dct3.f12882a &= -2;
            dct3.f12883b = dct.f12880d.f12883b;
        }
        if (str3 == null) {
            bxvd bxvd3 = this.f50700c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            dct dct5 = (dct) bxvd3.f164949b;
            dct5.f12882a &= -3;
            dct5.f12884c = dct.f12880d.f12884c;
            return;
        }
        bxvd bxvd4 = this.f50700c;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        dct dct6 = (dct) bxvd4.f164949b;
        str3.getClass();
        dct6.f12882a |= 2;
        dct6.f12884c = str3;
    }

    /* renamed from: a */
    public final void mo29115a(boolean z, int i) {
        bxvd da = dcw.f12892g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dcw dcw = (dcw) da.f164949b;
        dcw.f12895b = i - 1;
        dcw.f12894a |= 1;
        dcw dcw2 = (dcw) da.mo74062i();
        if (z) {
            bxvd da2 = ddd.f12919d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ddd ddd = (ddd) da2.f164949b;
            dcw2.getClass();
            ddd.f12923c = dcw2;
            ddd.f12921a |= 2;
            mo29113a((ddd) da2.mo74062i());
            return;
        }
        bxvd da3 = dcx.f12900d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        dcx dcx = (dcx) da3.f164949b;
        dcw2.getClass();
        dcx.f12904c = dcw2;
        dcx.f12902a |= 2;
        mo29112a((dcx) da3.mo74062i());
    }
}
