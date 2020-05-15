package p000;

import android.os.Bundle;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ilb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilb extends ila {

    /* renamed from: b */
    private final bypc f21277b;

    static {
        new Logger("GenericApprovalProtoTextProvider");
    }

    public ilb(bypc bypc) {
        this.f21277b = bypc;
        byob byob = bypc.f167312f;
        byob = byob == null ? byob.f167181f : byob;
        bypb bypb = this.f21277b.f167310d;
        bypb = bypb == null ? bypb.f167289p : bypb;
        int i = this.f21277b.f167307a;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (i & 4) != 0) {
            if (byob.f167185c.size() > 0) {
                byos byos = (byos) byob.f167185c.get(0);
                if ((byos.f167244a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                    this.f21276a.putString(ikw.f21260b, byos.f167262s);
                }
                if ((byos.f167244a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
                    this.f21276a.putString(ikw.f21261c, byos.f167263t);
                }
                if ((byos.f167244a & 1048576) != 0) {
                    this.f21276a.putString(ikw.f21262d, byos.f167264u);
                }
                if ((byos.f167244a & 2097152) != 0) {
                    this.f21276a.putString(ikw.f21263e, byos.f167265v);
                }
                if ((byos.f167244a & 4194304) != 0) {
                    this.f21276a.putString(ikw.f21264f, byos.f167266w);
                }
                if ((byos.f167244a & 8388608) != 0) {
                    this.f21276a.putString(ikw.f21265g, byos.f167267x);
                }
            }
            if ((byob.f167183a & 2) != 0) {
                this.f21276a.putString(ikv.f21251b, byob.f167186d);
            }
            if ((byob.f167183a & 1) != 0) {
                this.f21276a.putString(ikv.f21252c, byob.f167184b);
            }
            if (byob.f167185c.size() > 0 && (((byos) byob.f167185c.get(0)).f167244a & 1) != 0) {
                this.f21276a.putString(ikv.f21253d, ((byos) byob.f167185c.get(0)).f167245b);
            }
            byoa byoa = bypb.f167301l;
            if ((byoa == null ? byoa.f167173e : byoa).f167176b.size() > 0) {
                Bundle bundle = this.f21276a;
                String str = ikv.f21255f;
                byoa byoa2 = bypb.f167301l;
                int a = byoq.m125038a(((byor) (byoa2 == null ? byoa.f167173e : byoa2).f167176b.get(0)).f167238c);
                bundle.putInt(str, (a == 0 ? 1 : a) - 1);
            }
            if (byob.f167185c.size() > 1 && (((byos) byob.f167185c.get(1)).f167244a & 1) != 0) {
                this.f21276a.putString(ikv.f21254e, ((byos) byob.f167185c.get(1)).f167245b);
            }
            byoa byoa3 = bypb.f167301l;
            if ((byoa3 == null ? byoa.f167173e : byoa3).f167176b.size() > 1) {
                Bundle bundle2 = this.f21276a;
                String str2 = ikv.f21256g;
                byoa byoa4 = bypb.f167301l;
                int a2 = byoq.m125038a(((byor) (byoa4 == null ? byoa.f167173e : byoa4).f167176b.get(1)).f167238c);
                bundle2.putInt(str2, (a2 == 0 ? 1 : a2) - 1);
            }
            if (m15646a(bypb, 0, 3) && byob.f167185c.size() > 0) {
                byos byos2 = (byos) byob.f167185c.get(0);
                if ((byos2.f167244a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
                    this.f21276a.putString(ikr.f21235b, byos2.f167261r);
                }
                if ((byos2.f167244a & 64) != 0) {
                    this.f21276a.putString(ikr.f21236c, byos2.f167251h);
                }
                if ((byos2.f167244a & 16) != 0) {
                    this.f21276a.putString(ikr.f21237d, byos2.f167249f);
                }
                if ((byos2.f167244a & 32) != 0) {
                    this.f21276a.putString(ikr.f21238e, byos2.f167250g);
                }
            }
            if (m15646a(bypb, 0, 2) && byob.f167185c.size() > 0) {
                byos byos3 = (byos) byob.f167185c.get(0);
                if ((byos3.f167244a & 8) != 0) {
                    this.f21276a.putString(ikq.f21226b, byos3.f167248e);
                }
                if ((byos3.f167244a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    this.f21276a.putString(ikq.f21227c, byos3.f167253j);
                }
                if ((byos3.f167244a & 32) != 0) {
                    this.f21276a.putString(ikq.f21230f, byos3.f167250g);
                }
            }
            if (m15646a(bypb, 1, 1) && byob.f167185c.size() > 1) {
                byos byos4 = (byos) byob.f167185c.get(1);
                if ((byos4.f167244a & 4) != 0) {
                    this.f21276a.putString(ikp.f21220b, byos4.f167247d);
                }
                if ((2 & byos4.f167244a) != 0) {
                    this.f21276a.putString(ikp.f21221c, byos4.f167246c);
                }
                if ((byos4.f167244a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                    this.f21276a.putString(ikp.f21223e, byos4.f167258o);
                }
                if ((byos4.f167244a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                    this.f21276a.putString(ikp.f21222d, byos4.f167259p);
                }
                if ((byos4.f167244a & 16777216) != 0) {
                    this.f21276a.putString(ild.f21287j, byos4.f167268y);
                }
            }
            if (byob.f167185c.size() > 0) {
                byos byos5 = (byos) byob.f167185c.get(0);
                if ((byos5.f167244a & 1024) != 0) {
                    this.f21276a.putString(ild.f21281d, byos5.f167255l);
                }
                if ((byos5.f167244a & 512) != 0) {
                    this.f21276a.putString(ild.f21282e, byos5.f167254k);
                }
                if ((byos5.f167244a & 2048) != 0) {
                    this.f21276a.putString(ild.f21283f, byos5.f167256m);
                }
                if ((byos5.f167244a & 4096) != 0) {
                    this.f21276a.putString(ild.f21284g, byos5.f167257n);
                }
                if ((16777216 & byos5.f167244a) != 0) {
                    this.f21276a.putString(ild.f21288k, byos5.f167268y);
                }
            }
            if (byob.f167185c.size() > 0) {
                byos byos6 = (byos) byob.f167185c.get(0);
                if ((byos6.f167244a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
                    this.f21276a.putString(ild.f21285h, byos6.f167260q);
                }
                if ((byos6.f167244a & 128) != 0) {
                    this.f21276a.putString(ild.f21286i, byos6.f167252i);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m15646a(bypb bypb, int i, int i2) {
        if ((bypb.f167291a & 1024) == 0) {
            return false;
        }
        byoa byoa = bypb.f167301l;
        if (byoa == null) {
            byoa = byoa.f167173e;
        }
        if (byoa.f167176b.size() <= i) {
            return false;
        }
        byoa byoa2 = bypb.f167301l;
        if (byoa2 == null) {
            byoa2 = byoa.f167173e;
        }
        int a = byou.m125042a(((byor) byoa2.f167176b.get(i)).f167237b);
        if (a == 0) {
            a = 1;
        }
        if (a == i2) {
            return true;
        }
        return false;
    }
}
