package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.Random;

/* renamed from: achu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achu implements bads {

    /* renamed from: a */
    private final bmzi f59879a;

    /* renamed from: b */
    private final Random f59880b = new Random();

    /* renamed from: c */
    private final Context f59881c;

    /* renamed from: d */
    private final int f59882d;

    public achu(Context context) {
        bmzi a = bmzn.m108681a((bmzi) new acht(context));
        this.f59881c = context;
        int i = -1;
        try {
            Iterator it = ModuleManager.get(context).getAllModules().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                if (moduleInfo.moduleId.equals("com.google.android.gms.icing")) {
                    i = moduleInfo.moduleVersion;
                    break;
                }
            }
        } catch (Exception e) {
            absg.m48192b("Failed to set icing module version: %s", e);
        }
        this.f59882d = i;
        this.f59879a = a;
    }

    /* renamed from: a */
    private final void m49135a(int i, bxvd bxvd, long j) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb = (bpxb) bxvd.f164949b;
        bpxb bpxb2 = bpxb.f139606R;
        bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpxb.f139643s = j;
        bxvd da = bpxa.f139602c.mo74144da();
        boolean a = abyk.m48545a(this.f59881c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxa bpxa = (bpxa) da.f164949b;
        bpxa.f139604a |= 1;
        bpxa.f139605b = a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb3 = (bpxb) bxvd.f164949b;
        bpxa bpxa2 = (bpxa) da.mo74062i();
        bpxa2.getClass();
        bpxb3.f139612E = bpxa2;
        bpxb3.f139626b |= 64;
        bxvd da2 = bpwn.f139533d.mo74144da();
        int i2 = this.f59882d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpwn bpwn = (bpwn) da2.f164949b;
        bpwn.f139535a |= 1;
        bpwn.f139536b = i2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb4 = (bpxb) bxvd.f164949b;
        bpwn bpwn2 = (bpwn) da2.mo74062i();
        bpwn2.getClass();
        bpxb4.f139619L = bpwn2;
        bpxb4.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        qwo a2 = ((qws) this.f59879a.mo6606a()).mo24333a(bxvd.mo74062i());
        a2.mo24328b(bpzd.m112421a(i));
        a2.mo24327b();
    }

    /* renamed from: a */
    public final void mo32743a(int i) {
        long c = cema.m137236c();
        if (mo32750a(c)) {
            m49135a(i, bpxb.f139606R.mo74144da(), c);
        }
    }

    /* renamed from: a */
    public final void mo32744a(int i, bpxz bpxz) {
        long intValue = (long) ((Integer) abzv.f59014a.mo58455c()).intValue();
        if (mo32750a(intValue)) {
            bxvd da = bpxb.f139606R.mo74144da();
            bxvd da2 = bpxy.f139806c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxy bpxy = (bpxy) da2.f164949b;
            bpxz.getClass();
            bpxy.f139809b = bpxz;
            bpxy.f139808a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxy bpxy2 = (bpxy) da2.mo74062i();
            bpxy2.getClass();
            bpxb.f139614G = bpxy2;
            bpxb.f139626b |= 512;
            m49135a(i, da, intValue);
        }
    }

    /* renamed from: a */
    public final void mo32745a(bpxw bpxw) {
        long intValue = (long) ((Integer) abzv.f59015b.mo58455c()).intValue();
        if (mo32750a(intValue)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxw.getClass();
            bpxb.f139642r = bpxw;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            m49135a(10003, da, intValue);
        }
    }

    /* renamed from: a */
    public final void mo32746a(bpxx bpxx) {
        long a = cemg.f182977a.mo6606a().mo79340a();
        if (mo32750a(a)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxx.getClass();
            bpxb.f139641q = bpxx;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            m49135a(10002, da, a);
        }
    }

    /* renamed from: a */
    public final void mo32747a(bpya bpya) {
        long f = cemg.f182977a.mo6606a().mo79345f();
        if (mo32750a(f)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpya.getClass();
            bpxb.f139646v = bpya;
            bpxb.f139625a |= 16777216;
            m49135a(10011, da, f);
        }
    }

    /* renamed from: a */
    public final void mo32748a(bpye bpye) {
        long intValue = (long) ((Integer) abzv.f59017d.mo58455c()).intValue();
        if (mo32750a(intValue)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpye.getClass();
            bpxb.f139611D = bpye;
            bpxb.f139626b |= 2;
            m49135a(10013, da, intValue);
        }
    }

    /* renamed from: a */
    public final void mo32749a(bpyi bpyi) {
        long intValue = (long) ((Integer) abzv.f59016c.mo58455c()).intValue();
        if (mo32750a(intValue)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpyi.getClass();
            bpxb.f139644t = bpyi;
            bpxb.f139625a |= 1048576;
            m49135a(10004, da, intValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo32750a(long j) {
        if (j <= 0) {
            if (j < 0) {
                absg.m48192b("Bad sample interval: %d", Long.valueOf(j));
            }
            return false;
        } else if (j <= 2147483647L) {
            return this.f59880b.nextInt((int) j) == 0;
        } else {
            absg.m48192b("Bad sample interval: %d", Long.valueOf(j));
            return false;
        }
    }
}
