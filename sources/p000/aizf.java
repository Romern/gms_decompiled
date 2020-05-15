package p000;

import android.content.Context;
import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: aizf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aizf {

    /* renamed from: a */
    private final gcs f70131a;

    public aizf(Context context) {
        this.f70131a = gcg.m12928a(context);
    }

    /* renamed from: a */
    private static int m58268a(boolean z, boolean z2) {
        if (z && z2) {
            return 3;
        }
        if (!z) {
            return z2 ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: b */
    public static Encoding m58270b(Context context, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ajat ajat = (ajat) ahgz.m55754a(context, ajat.class);
        gcb gcb = new gcb();
        byxx byxx = ajat.f70278f.f168929l;
        if (byxx == null) {
            byxx = byxx.f168830k;
        }
        byxt byxt = byxx.f168839h;
        if (byxt == null) {
            byxt = byxt.f168792g;
        }
        long j = byxt.f168795b;
        boolean z4 = false;
        sdo.m34975b(j >= 0, "attackTimeMillis must be non-negative");
        gcb.f17871a = j;
        byxx byxx2 = ajat.f70278f.f168929l;
        if (byxx2 == null) {
            byxx2 = byxx.f168830k;
        }
        byxt byxt2 = byxx2.f168839h;
        if (byxt2 == null) {
            byxt2 = byxt.f168792g;
        }
        long j2 = byxt2.f168796c;
        sdo.m34975b(j2 >= 0, "decayTimeMillis must be non-negative");
        gcb.f17872b = j2;
        byxx byxx3 = ajat.f70278f.f168929l;
        if (byxx3 == null) {
            byxx3 = byxx.f168830k;
        }
        byxt byxt3 = byxx3.f168839h;
        if (byxt3 == null) {
            byxt3 = byxt.f168792g;
        }
        long j3 = byxt3.f168797d;
        sdo.m34975b(j3 >= 0, "sustainTimeMillis must be non-negative");
        gcb.f17873c = j3;
        byxx byxx4 = ajat.f70278f.f168929l;
        if (byxx4 == null) {
            byxx4 = byxx.f168830k;
        }
        byxt byxt4 = byxx4.f168839h;
        if (byxt4 == null) {
            byxt4 = byxt.f168792g;
        }
        long j4 = byxt4.f168798e;
        sdo.m34975b(j4 >= 0, "releaseTimeMillis must be non-negative");
        gcb.f17874d = j4;
        byxx byxx5 = ajat.f70278f.f168929l;
        if (byxx5 == null) {
            byxx5 = byxx.f168830k;
        }
        byxt byxt5 = byxx5.f168839h;
        if (byxt5 == null) {
            byxt5 = byxt.f168792g;
        }
        float f = (float) byxt5.f168799f;
        sdo.m34975b(f >= 0.0f && ((double) f) <= 1.0d, "sustainAmplitude must be in [0, 1]");
        gcb.f17875e = f;
        AdsrParams a = gcb.mo11635a();
        gdq gdq = new gdq();
        gdq.mo11698b(i);
        byxx byxx6 = ajat.f70278f.f168929l;
        if (byxx6 == null) {
            byxx6 = byxx.f168830k;
        }
        boolean z5 = byxx6.f168833b;
        byxx byxx7 = ajat.f70278f.f168929l;
        if (byxx7 == null) {
            byxx7 = byxx.f168830k;
        }
        gdq.mo11697a(m58268a(z5, byxx7.f168834c));
        byxx byxx8 = ajat.f70278f.f168929l;
        if (byxx8 == null) {
            byxx8 = byxx.f168830k;
        }
        float f2 = (float) byxx8.f168835d;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "coderSampleRate must be greater than zero");
        gdq.f17972a = f2;
        byxx byxx9 = ajat.f70278f.f168929l;
        if (byxx9 == null) {
            byxx9 = byxx.f168830k;
        }
        int i2 = byxx9.f168836e;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "basebandDecimationFactor must be greater than zero");
        gdq.f17973b = i2;
        byxx byxx10 = ajat.f70278f.f168929l;
        if (byxx10 == null) {
            byxx10 = byxx.f168830k;
        }
        int i3 = byxx10.f168837f;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34975b(z3, "frequenciesPerSymbol must be greater than zero");
        gdq.f17975d = i3;
        byxx byxx11 = ajat.f70278f.f168929l;
        if (byxx11 == null) {
            byxx11 = byxx.f168830k;
        }
        int i4 = byxx11.f168838g;
        if (i4 > 0) {
            z4 = true;
        }
        sdo.m34975b(z4, "windowDurationMillis must be greater than zero");
        gdq.f17974c = i4;
        sdo.m34975b(true, "adsrParams must not be null");
        gdq.f17976e = a;
        return gdq.mo11696a();
    }

    /* renamed from: a */
    public static Encoding m58269a(Context context, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ajat ajat = (ajat) ahgz.m55754a(context, ajat.class);
        gdp gdp = new gdp();
        gdp.mo11695b(i);
        byxv byxv = ajat.f70278f.f168923f;
        if (byxv == null) {
            byxv = byxv.f168807p;
        }
        gdp.f17961a = byxv.f168812d;
        byxv byxv2 = ajat.f70278f.f168923f;
        if (byxv2 == null) {
            byxv2 = byxv.f168807p;
        }
        float f = (float) byxv2.f168813e;
        boolean z4 = false;
        sdo.m34975b(f > 0.0f, "desiredCarrierFrequency must be greater than zero");
        gdp.f17966f = f;
        byxv byxv3 = ajat.f70278f.f168923f;
        if (byxv3 == null) {
            byxv3 = byxv.f168807p;
        }
        boolean z5 = byxv3.f168811c;
        byxv byxv4 = ajat.f70278f.f168923f;
        if (byxv4 == null) {
            byxv4 = byxv.f168807p;
        }
        gdp.mo11694a(m58268a(z5, byxv4.f168814f));
        byxv byxv5 = ajat.f70278f.f168923f;
        if (byxv5 == null) {
            byxv5 = byxv.f168807p;
        }
        int i2 = byxv5.f168815g;
        sdo.m34975b(i2 >= 5 ? i2 <= 11 : false, "numberOfTapsLfsr must be in the range [5, 11]");
        gdp.f17962b = i2;
        byxv byxv6 = ajat.f70278f.f168923f;
        if (byxv6 == null) {
            byxv6 = byxv.f168807p;
        }
        gdp.f17963c = byxv6.f168816h;
        byxv byxv7 = ajat.f70278f.f168923f;
        if (byxv7 == null) {
            byxv7 = byxv.f168807p;
        }
        float f2 = (float) byxv7.f168817i;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "coderSampleRate must be greater than zero");
        gdp.f17964d = f2;
        byxv byxv8 = ajat.f70278f.f168923f;
        if (byxv8 == null) {
            byxv8 = byxv.f168807p;
        }
        int i3 = byxv8.f168818j;
        sdo.m34975b((i3 == 1 || i3 == 2 || i3 == 4) ? true : i3 == 8, "bitsPerSymbol must be 1, 2, 4, or 8");
        gdp.f17967g = i3;
        byxv byxv9 = ajat.f70278f.f168923f;
        if (byxv9 == null) {
            byxv9 = byxv.f168807p;
        }
        int i4 = byxv9.f168819k;
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "minCyclesPerFrame must be greater than zero");
        gdp.f17968h = i4;
        byxv byxv10 = ajat.f70278f.f168923f;
        if (byxv10 == null) {
            byxv10 = byxv.f168807p;
        }
        int i5 = byxv10.f168820l;
        if (i5 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34975b(z3, "basebandDecimationFactor must be greater than zero");
        gdp.f17969i = i5;
        byxv byxv11 = ajat.f70278f.f168923f;
        if (byxv11 == null) {
            byxv11 = byxv.f168807p;
        }
        int i6 = byxv11.f168821m;
        if (i6 > 0) {
            z4 = true;
        }
        sdo.m34975b(z4, "upsamplingFactor must be greater than zero");
        gdp.f17965e = i6;
        return gdp.mo11693a();
    }

    /* renamed from: a */
    public final void mo38325a(geh geh) {
        gcs gcs = this.f70131a;
        rob rob = gcs.mo24714a(geh, geh.class.getName()).f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        gcs.mo24698a(rob).mo50371a(new aize());
    }

    /* renamed from: a */
    public final void mo38326a(geh geh, TokenBroadcaster$Params tokenBroadcaster$Params) {
        srn srn = ahfq.f67120a;
        srv.m36160a(tokenBroadcaster$Params.f9891a);
        gcs gcs = this.f70131a;
        rod a = gcs.mo24714a(geh, geh.class.getName());
        gfi gfi = new gfi(a);
        gck gck = new gck(gfi, tokenBroadcaster$Params);
        gcl gcl = new gcl(gfi);
        rom a2 = ron.m34179a();
        a2.f43443a = gck;
        a2.f43444b = gcl;
        a2.f43445c = a;
        gcs.mo24700a(a2.mo24973a()).mo50371a(new aizd());
    }

    /* renamed from: a */
    public final void mo38327a(ger ger) {
        this.f70131a.mo11650a(ger).mo50371a(new aizc());
    }

    /* renamed from: a */
    public final void mo38328a(ger ger, TokenReceiver$Params tokenReceiver$Params, boolean z, long j, gee gee) {
        this.f70131a.mo11651a(ger, tokenReceiver$Params).mo50371a(new aiza());
        if (gee != null) {
            gef gef = new gef(tokenReceiver$Params.f9895a);
            if (z) {
                gef.f18027b = true;
            }
            if (j != -1) {
                sdo.m34974b(j > 0);
                gef.f18028c = true;
                gef.f18029d = j;
            }
            gcs gcs = this.f70131a;
            gcj gcj = new gcj(gcs.mo24714a(gee, gee.class.getName()), new Snoop$Params(gef.f18026a, gef.f18027b, gef.f18028c, gef.f18029d));
            roz b = rpa.m34196b();
            b.f43472a = gcj;
            gcs.mo24701a(b.mo24977a()).mo50371a(new aizb());
        }
    }
}
