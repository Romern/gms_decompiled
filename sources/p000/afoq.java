package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Random;

/* renamed from: afoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afoq implements bbep, afqj {

    /* renamed from: a */
    private static final Random f64453a = new Random();

    /* renamed from: b */
    private final Context f64454b;

    /* renamed from: c */
    private final int f64455c;

    /* renamed from: d */
    private final String f64456d;

    /* renamed from: e */
    private final bbfi f64457e;

    public afoq(Context context, bbfi bbfi, int i) {
        this.f64454b = context;
        this.f64457e = bbfi;
        this.f64455c = i;
        this.f64456d = context.getPackageName();
    }

    /* renamed from: a */
    private final void m53360a(int i, bxvd bxvd, int i2) {
        boolean z;
        long j = (long) i2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb = (bpxb) bxvd.f164949b;
        bpxb bpxb2 = bpxb.f139606R;
        bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpxb.f139643s = j;
        bxvd da = bpxa.f139602c.mo74144da();
        if (this.f64454b.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) {
            z = true;
        } else {
            z = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxa bpxa = (bpxa) da.f164949b;
        bpxa.f139604a |= 1;
        bpxa.f139605b = z;
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
        String str = this.f64456d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpwn bpwn = (bpwn) da2.f164949b;
        str.getClass();
        int i3 = bpwn.f139535a | 2;
        bpwn.f139535a = i3;
        bpwn.f139537c = str;
        int i4 = this.f64455c;
        bpwn.f139535a = 1 | i3;
        bpwn.f139536b = i4;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb4 = (bpxb) bxvd.f164949b;
        bpwn bpwn2 = (bpwn) da2.mo74062i();
        bpwn2.getClass();
        bpxb4.f139619L = bpwn2;
        bpxb4.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        qwo a = this.f64457e.f102538a.mo24333a(bxvd.mo74062i());
        a.mo24328b(bpzd.m112421a(i));
        a.mo24327b();
    }

    /* renamed from: b */
    public final void mo34988b(int i) {
        int b = (int) cenp.m137587b();
        if (m53361a(b)) {
            m53360a(i, bpxb.f139606R.mo74144da(), b);
        }
    }

    /* renamed from: a */
    public static boolean m53361a(int i) {
        if (i > 0) {
            return f64453a.nextInt(i) == 0;
        }
        if (i < 0) {
            bbev.m87905a("Bad sample interval: %d", Integer.valueOf(i));
        }
        return false;
    }

    /* renamed from: a */
    public final void mo34978a(int i, int i2) {
        int b = (int) cenp.m137587b();
        if (m53361a(b)) {
            bxvd da = bpxb.f139606R.mo74144da();
            bxvd da2 = bpxp.f139751d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxp bpxp = (bpxp) da2.f164949b;
            int i3 = bpxp.f139753a | 2;
            bpxp.f139753a = i3;
            bpxp.f139755c = i2;
            bpxp.f139754b = i - 2;
            bpxp.f139753a = i3 | 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxp bpxp2 = (bpxp) da2.mo74062i();
            bpxp2.getClass();
            bpxb.f139617J = bpxp2;
            bpxb.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            m53360a(1053, da, b);
        }
    }

    /* renamed from: a */
    public final void mo34979a(int i, bpwz bpwz) {
        int b = (int) cenp.m137587b();
        if (m53361a(b)) {
            bxvd da = bpxb.f139606R.mo74144da();
            bxvd da2 = bpxo.f139746d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxo bpxo = (bpxo) da2.f164949b;
            if (i != 1) {
                bpxo.f139749b = i - 2;
                bpxo.f139748a |= 1;
                bpxo bpxo2 = (bpxo) da2.f164949b;
                bpwz.getClass();
                bpxo2.f139750c = bpwz;
                bpxo2.f139748a |= 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxb bpxb = (bpxb) da.f164949b;
                bpxo bpxo3 = (bpxo) da2.mo74062i();
                bpxo3.getClass();
                bpxb.f139623P = bpxo3;
                bpxb.f139626b |= 536870912;
                m53360a(1070, da, b);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: a */
    public final void mo34980a(int i, String str, int i2) {
        int b = (int) cenp.m137587b();
        if (m53361a(b)) {
            bxvd da = bpwz.f139594g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwz bpwz = (bpwz) da.f164949b;
            str.getClass();
            int i3 = bpwz.f139596a | 1;
            bpwz.f139596a = i3;
            bpwz.f139597b = str;
            bpwz.f139596a = i3 | 2;
            bpwz.f139598c = i2;
            bpwz bpwz2 = (bpwz) da.mo74062i();
            bxvd da2 = bpxb.f139606R.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxb bpxb = (bpxb) da2.f164949b;
            bpwz2.getClass();
            bpxb.f139634j = bpwz2;
            bpxb.f139625a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            m53360a(i, da2, b);
        }
    }

    /* renamed from: a */
    public final void mo34981a(bpwz bpwz) {
        int b = (int) cenp.m137587b();
        if (m53361a(b)) {
            bxvd da = bpxb.f139606R.mo74144da();
            bxvd da2 = bpxu.f139783c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxu bpxu = (bpxu) da2.f164949b;
            bpwz.getClass();
            bpxu.f139786b = bpwz;
            bpxu.f139785a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxu bpxu2 = (bpxu) da2.mo74062i();
            bpxu2.getClass();
            bpxb.f139624Q = bpxu2;
            bpxb.f139626b |= JGCastService.FLAG_PRIVATE_DISPLAY;
            m53360a(1071, da, b);
        }
    }

    /* renamed from: a */
    public final void mo34982a(bpwz bpwz, int i, long j, long j2, String str, int i2) {
        int b = (int) cenp.m137587b();
        if (m53361a(b)) {
            bxvd da = bpxb.f139606R.mo74144da();
            bxvd da2 = bpxr.f139762h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxr bpxr = (bpxr) da2.f164949b;
            bpwz.getClass();
            bpxr.f139765b = bpwz;
            int i3 = bpxr.f139764a | 1;
            bpxr.f139764a = i3;
            bpxr.f139766c = i - 2;
            bpxr.f139764a = i3 | 2;
            bpxr bpxr2 = (bpxr) da2.f164949b;
            int i4 = bpxr2.f139764a | 4;
            bpxr2.f139764a = i4;
            bpxr2.f139767d = j;
            int i5 = i4 | 8;
            bpxr2.f139764a = i5;
            bpxr2.f139768e = j2;
            str.getClass();
            int i6 = i5 | 16;
            bpxr2.f139764a = i6;
            bpxr2.f139769f = str;
            bpxr2.f139764a = i6 | 32;
            bpxr2.f139770g = i2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxr bpxr3 = (bpxr) da2.mo74062i();
            bpxr3.getClass();
            bpxb.f139622O = bpxr3;
            bpxb.f139626b |= 1048576;
            m53360a(1068, da, b);
        }
    }

    /* renamed from: a */
    public final void mo34983a(bpwz bpwz, bpxn bpxn) {
        int a = (int) cenp.f183105a.mo6606a().mo79453a();
        if (m53361a(a)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpwz.getClass();
            bpxb.f139634j = bpwz;
            int i = bpxb.f139625a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bpxb.f139625a = i;
            bpxn.getClass();
            bpxb.f139610C = bpxn;
            bpxb.f139625a = i | Integer.MIN_VALUE;
            m53360a(1047, da, a);
        }
    }

    /* renamed from: a */
    public final void mo34984a(bpwz bpwz, bpxq bpxq, int i) {
        bxvd da = bpxb.f139606R.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxb bpxb = (bpxb) da.f164949b;
        bpwz.getClass();
        bpxb.f139634j = bpwz;
        int i2 = bpxb.f139625a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bpxb.f139625a = i2;
        bpxq.getClass();
        bpxb.f139609B = bpxq;
        bpxb.f139625a = i2 | JGCastService.FLAG_PRIVATE_DISPLAY;
        m53360a(1046, da, i);
    }

    /* renamed from: a */
    public final void mo34985a(bpxt bpxt, int i) {
        bxvd da = bpxb.f139606R.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxb bpxb = (bpxb) da.f164949b;
        bpxt.getClass();
        bpxb.f139618K = bpxt;
        bpxb.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        m53360a(1058, da, i);
    }

    /* renamed from: a */
    public final void mo34986a(bpxv bpxv, int i) {
        bxvd da = bpxb.f139606R.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxb bpxb = (bpxb) da.f164949b;
        bpxv.getClass();
        bpxb.f139616I = bpxv;
        bpxb.f139626b |= 4096;
        m53360a(1057, da, i);
    }

    /* renamed from: a */
    public final void mo34987a(bpyj bpyj) {
        int e = (int) cenp.f183105a.mo6606a().mo79457e();
        if (m53361a(e)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpyj.getClass();
            bpxb.f139645u = bpyj;
            bpxb.f139625a |= 2097152;
            m53360a(13002, da, e);
        }
    }
}
