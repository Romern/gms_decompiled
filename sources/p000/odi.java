package p000;

import android.content.ComponentName;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.UUID;

/* renamed from: odi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class odi extends odg {
    /* renamed from: a */
    public static odh m28455a(bpcy bpcy, bpeb bpeb, bpea bpea) {
        odh odh = new odh(null);
        odh.f37254g = 37;
        if (bpcy != null) {
            odh.f37248a = bpcy;
            if (bpeb != null) {
                odh.f37249b = bpeb;
                if (bpea != null) {
                    odh.f37250c = bpea;
                    return odh;
                }
                throw new NullPointerException("Null action");
            }
            throw new NullPointerException("Null context");
        }
        throw new NullPointerException("Null domainIdType");
    }

    /* renamed from: A */
    public abstract bngx mo21986A();

    /* renamed from: e */
    public abstract bpeb mo21992e();

    /* renamed from: f */
    public abstract bpea mo21994f();

    /* renamed from: g */
    public abstract bmxv mo21995g();

    /* renamed from: h */
    public abstract bmxv mo21996h();

    /* renamed from: i */
    public abstract bmxv mo21998i();

    /* renamed from: j */
    public abstract bmxv mo21999j();

    /* renamed from: k */
    public abstract bmxv mo22000k();

    /* renamed from: l */
    public abstract bmxv mo22001l();

    /* renamed from: m */
    public abstract bmxv mo22002m();

    /* renamed from: n */
    public abstract bmxv mo22003n();

    /* renamed from: o */
    public abstract bmxv mo22004o();

    /* renamed from: p */
    public abstract bmxv mo22005p();

    /* renamed from: q */
    public abstract bmxv mo22006q();

    /* renamed from: r */
    public abstract bmxv mo22007r();

    /* renamed from: s */
    public abstract bmxv mo22008s();

    /* renamed from: t */
    public abstract bngx mo22009t();

    /* renamed from: u */
    public abstract bmxv mo22011u();

    /* renamed from: v */
    public abstract bmxv mo22012v();

    /* renamed from: w */
    public abstract bmxv mo22013w();

    /* renamed from: x */
    public abstract bmxv mo22014x();

    /* renamed from: y */
    public abstract bmxv mo22015y();

    /* renamed from: z */
    public abstract bmxv mo22016z();

    /* renamed from: C */
    public final bxvd mo22020C() {
        bxvd da = bpcl.f135759L.mo74144da();
        bxvd da2 = bpcx.f135883d.mo74144da();
        int i = mo21988a().f135894f;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcx bpcx = (bpcx) da2.f164949b;
        bpcx.f135885a |= 1;
        bpcx.f135886b = i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcl bpcl = (bpcl) da.f164949b;
        bpcx bpcx2 = (bpcx) da2.mo74062i();
        bpcx2.getClass();
        bpcl.f135765E = bpcx2;
        bpcl.f135774b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        if (mo21989b().mo66813a()) {
            bpds a = odj.m28480a((UUID) mo21989b().mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl2 = (bpcl) da.f164949b;
            a.getClass();
            bpcl2.f135796x = a;
            bpcl2.f135773a |= 536870912;
        }
        if (mo21990c().mo66813a()) {
            bpdf bpdf = (bpdf) mo21990c().mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl3 = (bpcl) da.f164949b;
            bpdf.getClass();
            bpcl3.f135767G = bpdf;
            bpcl3.f135774b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        }
        bxvd da3 = bped.f137237x.mo74144da();
        int i2 = mo21992e().f137221cE;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bped bped = (bped) da3.f164949b;
        bped.f137239a |= 1;
        bped.f137240b = i2;
        int i3 = mo21994f().f137033jW;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bped bped2 = (bped) da3.f164949b;
        bped2.f137239a |= 2;
        bped2.f137241c = i3;
        if (mo21995g().mo66813a()) {
            long longValue = ((Long) mo21995g().mo66814b()).longValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped3 = (bped) da3.f164949b;
            bped3.f137239a |= 4;
            bped3.f137242d = longValue;
        }
        if (mo21996h().mo66813a()) {
            String str = (String) mo21996h().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped4 = (bped) da3.f164949b;
            str.getClass();
            bped4.f137239a |= 8;
            bped4.f137243e = str;
        }
        if (mo21998i().mo66813a()) {
            int i4 = ((bpeb) mo21998i().mo66814b()).f137221cE;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped5 = (bped) da3.f164949b;
            bped5.f137239a |= 16;
            bped5.f137244f = i4;
        }
        if (mo21999j().mo66813a()) {
            int intValue = ((Integer) mo21999j().mo66814b()).intValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped6 = (bped) da3.f164949b;
            bped6.f137239a |= 32;
            bped6.f137245g = intValue;
        }
        if (mo22000k().mo66813a()) {
            int i5 = ((bpdy) mo22000k().mo66814b()).f136457I;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped7 = (bped) da3.f164949b;
            bped7.f137239a |= 64;
            bped7.f137246h = i5;
        }
        if (mo22001l().mo66813a()) {
            bpdg bpdg = (bpdg) mo22001l().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped8 = (bped) da3.f164949b;
            bpdg.getClass();
            bped8.f137247i = bpdg;
            bped8.f137239a |= 128;
        }
        if (mo22014x().mo66813a()) {
            bpdl bpdl = (bpdl) mo22014x().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped9 = (bped) da3.f164949b;
            bpdl.getClass();
            bped9.f137258t = bpdl;
            bped9.f137239a = 131072 | bped9.f137239a;
        }
        if (mo22015y().mo66813a()) {
            bpdm bpdm = (bpdm) mo22015y().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped10 = (bped) da3.f164949b;
            bpdm.getClass();
            bped10.f137259u = bpdm;
            bped10.f137239a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        }
        if (mo22016z().mo66813a()) {
            bpdk bpdk = (bpdk) mo22016z().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped11 = (bped) da3.f164949b;
            bpdk.getClass();
            bped11.f137260v = bpdk;
            bped11.f137239a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }
        if (mo22002m().mo66813a()) {
            String str2 = (String) mo22002m().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped12 = (bped) da3.f164949b;
            str2.getClass();
            bped12.f137239a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bped12.f137248j = str2;
        }
        if (mo22003n().mo66813a()) {
            int intValue2 = ((Integer) mo22003n().mo66814b()).intValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped13 = (bped) da3.f164949b;
            bped13.f137239a |= 512;
            bped13.f137249k = intValue2;
        }
        if (mo22004o().mo66813a()) {
            int i6 = ((bpdt) mo22004o().mo66814b()).f136389i;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped14 = (bped) da3.f164949b;
            bped14.f137239a |= 1024;
            bped14.f137250l = i6;
        }
        if (mo22005p().mo66813a()) {
            int intValue3 = ((Integer) mo22005p().mo66814b()).intValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped15 = (bped) da3.f164949b;
            bped15.f137239a |= 2048;
            bped15.f137251m = intValue3;
        }
        if (mo22006q().mo66813a()) {
            String str3 = (String) mo22006q().mo66814b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped16 = (bped) da3.f164949b;
            str3.getClass();
            bped16.f137239a |= 4096;
            bped16.f137252n = str3;
        }
        if (mo22007r().mo66813a()) {
            int i7 = ((bpdx) mo22007r().mo66814b()).f136421e;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped17 = (bped) da3.f164949b;
            bped17.f137239a |= 8192;
            bped17.f137253o = i7;
        }
        if (mo22008s().mo66813a()) {
            String flattenToString = ((ComponentName) mo22008s().mo66814b()).flattenToString();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped18 = (bped) da3.f164949b;
            flattenToString.getClass();
            bped18.f137239a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bped18.f137254p = flattenToString;
        }
        bnre i8 = mo22009t().listIterator();
        while (i8.hasNext()) {
            String flattenToString2 = ((ComponentName) i8.next()).flattenToString();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped19 = (bped) da3.f164949b;
            flattenToString2.getClass();
            if (!bped19.f137261w.mo73666a()) {
                bped19.f137261w = GeneratedMessageLite.m124021a(bped19.f137261w);
            }
            bped19.f137261w.add(flattenToString2);
        }
        if (mo22011u().mo66813a()) {
            int intValue4 = ((Integer) mo22011u().mo66814b()).intValue();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped20 = (bped) da3.f164949b;
            bped20.f137239a = 32768 | bped20.f137239a;
            bped20.f137255q = intValue4;
        }
        if (mo22012v().mo66813a()) {
            int i9 = ((bpec) mo22012v().mo66814b()).f137236n;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped21 = (bped) da3.f164949b;
            bped21.f137239a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bped21.f137256r = i9;
        }
        if (!mo22013w().mo66813a()) {
            bngx A = mo21986A();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bped bped22 = (bped) da3.f164949b;
            if (!bped22.f137257s.mo73666a()) {
                bped22.f137257s = GeneratedMessageLite.m124021a(bped22.f137257s);
            }
            bxsy.m123078a(A, bped22.f137257s);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl4 = (bpcl) da.f164949b;
            bped bped23 = (bped) da3.mo74062i();
            bped23.getClass();
            bpcl4.f135784l = bped23;
            bpcl4.f135773a |= 4096;
            return da;
        }
        ode ode = (ode) mo22013w().mo66814b();
        throw null;
    }
}
