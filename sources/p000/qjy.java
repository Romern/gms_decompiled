package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.TimeUnit;

/* renamed from: qjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qjy {

    /* renamed from: c */
    private static final Logger f41519c = qgn.m32143a("RequestGenerator");

    /* renamed from: a */
    public final qgu f41520a;

    /* renamed from: b */
    public final qgr f41521b;

    /* renamed from: d */
    private final qjw f41522d;

    public qjy(cayo cayo, cayo cayo2, cayo cayo3, cayo cayo4, cayo cayo5, cayo cayo6, cayo cayo7, cayo cayo8, cayo cayo9, cayo cayo10, cayo cayo11, cayo cayo12, cayo cayo13, cayo cayo14, cayo cayo15, cayo cayo16, cayo cayo17, cayo cayo18, cayo cayo19, cayo cayo20, cayo cayo21, cayo cayo22, qdu qdu, qjw qjw) {
        qdu qdu2 = qdu;
        this.f41522d = qjw;
        bxvd da = qgr.f41209d.mo74144da();
        bmza b = bmza.m108659b(bmvy.f131119a);
        bxvd da2 = qgu.f41220A.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qgu qgu = (qgu) da2.f164949b;
        qgu.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        qgu.f41241r = 0;
        qhg qhg = (qhg) cayo2.mo16713a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qgu qgu2 = (qgu) da2.f164949b;
        qhg.getClass();
        qgu2.f41235l = qhg;
        qgu2.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        qgu.m32152a(qgu2);
        if (m32271a(1)) {
            bmxv bmxv = (bmxv) cayo10.mo16713a();
            if (bmxv.mo66813a()) {
                String str = (String) bmxv.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu3 = (qgu) da2.f164949b;
                str.getClass();
                qgu3.f41224a |= 1;
                qgu3.f41225b = str;
            }
        }
        if (m32271a(10)) {
            bmxv bmxv2 = (bmxv) cayo15.mo16713a();
            if (bmxv2.mo66813a()) {
                String str2 = (String) bmxv2.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu4 = (qgu) da2.f164949b;
                str2.getClass();
                qgu4.f41224a |= 2;
                qgu4.f41226c = str2;
            }
        }
        if (m32271a(9)) {
            Iterable iterable = (Iterable) cayo13.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu5 = (qgu) da2.f164949b;
            qgu5.mo24046a();
            bxsy.m123078a(iterable, qgu5.f41227d);
        }
        if (m32271a(19)) {
            Iterable iterable2 = (Iterable) cayo14.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu6 = (qgu) da2.f164949b;
            qgu6.mo24047b();
            bxsy.m123078a(iterable2, qgu6.f41228e);
        }
        if (m32271a(16)) {
            bmxv bmxv3 = (bmxv) cayo17.mo16713a();
            if (bmxv3.mo66813a()) {
                String str3 = (String) bmxv3.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu7 = (qgu) da2.f164949b;
                str3.getClass();
                qgu7.f41224a |= 4;
                qgu7.f41229f = str3;
            }
        }
        if (m32271a(17)) {
            bmxv bmxv4 = (bmxv) cayo9.mo16713a();
            if (bmxv4.mo66813a()) {
                String str4 = (String) bmxv4.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu8 = (qgu) da2.f164949b;
                str4.getClass();
                qgu8.f41224a |= 8;
                qgu8.f41230g = str4;
            }
        }
        if (m32271a(3)) {
            String str5 = (String) cayo8.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu9 = (qgu) da2.f164949b;
            str5.getClass();
            qgu9.f41224a |= 64;
            qgu9.f41233j = str5;
        }
        if (m32271a(15)) {
            Iterable iterable3 = (Iterable) cayo16.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu10 = (qgu) da2.f164949b;
            qgu10.mo24049d();
            bxsy.m123078a(iterable3, qgu10.f41239p);
        }
        if (m32271a(22)) {
            bmxv bmxv5 = (bmxv) cayo20.mo16713a();
            if (bmxv5.mo66813a()) {
                int intValue = ((Integer) bmxv5.mo66814b()).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu11 = (qgu) da2.f164949b;
                qgu11.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                qgu11.f41242s = intValue;
            }
        }
        if (m32271a(2)) {
            long longValue = ((Long) cayo3.mo16713a()).longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu12 = (qgu) da2.f164949b;
            qgu12.f41224a = 16 | qgu12.f41224a;
            qgu12.f41231h = longValue;
        }
        if (m32271a(7)) {
            long longValue2 = ((Long) cayo12.mo16713a()).longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu13 = (qgu) da2.f164949b;
            qgu13.f41224a |= 32;
            qgu13.f41232i = longValue2;
        }
        if (m32271a(13)) {
            long longValue3 = ((Long) cayo18.mo16713a()).longValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu14 = (qgu) da2.f164949b;
            qgu14.f41224a |= 4096;
            qgu14.f41238o = longValue3;
        }
        if (m32271a(6)) {
            String str6 = (String) cayo11.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu15 = (qgu) da2.f164949b;
            str6.getClass();
            qgu15.f41224a |= 128;
            qgu15.f41234k = str6;
        }
        if (m32271a(12) && ((bmxv) cayo19.mo16713a()).mo66813a()) {
            String str7 = (String) ((bmxv) cayo19.mo16713a()).mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu16 = (qgu) da2.f164949b;
            str7.getClass();
            qgu16.f41224a |= 2048;
            qgu16.f41237n = str7;
        }
        if (m32271a(11)) {
            Iterable iterable4 = (Iterable) cayo.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu17 = (qgu) da2.f164949b;
            qgu17.mo24048c();
            bxsy.m123078a(iterable4, qgu17.f41236m);
        }
        if (m32271a(18)) {
            qhd qhd = (qhd) cayo21.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu18 = (qgu) da2.f164949b;
            qhd.getClass();
            qgu18.f41240q = qhd;
            qgu18.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }
        if (m32271a(23)) {
            bmxv bmxv6 = (bmxv) cayo22.mo16713a();
            if (bmxv6.mo66813a()) {
                qgy qgy = (qgy) bmxv6.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu19 = (qgu) da2.f164949b;
                qgy.getClass();
                qgu19.f41243t = qgy;
                qgu19.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            }
        }
        if (m32271a(24) && Math.random() < cdci.m132551q() && ((bmxv) cayo7.mo16713a()).mo66813a()) {
            bmza b2 = bmza.m108659b(bmvy.f131119a);
            String str8 = (String) ((bmxv) cayo7.mo16713a()).mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu20 = (qgu) da2.f164949b;
            str8.getClass();
            qgu20.f41224a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            qgu20.f41244u = str8;
            b2.mo66931e();
            long a = b2.mo66928a(TimeUnit.MILLISECONDS);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qgr qgr = (qgr) da.f164949b;
            qgr.f41211a = 2 | qgr.f41211a;
            qgr.f41213c = a;
        }
        if (m32271a(25) && ((bmxv) cayo5.mo16713a()).mo66813a()) {
            String str9 = (String) ((bmxv) cayo5.mo16713a()).mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu21 = (qgu) da2.f164949b;
            str9.getClass();
            qgu21.f41224a |= 1048576;
            qgu21.f41245v = str9;
        }
        if (m32271a(26)) {
            qgt qgt = (qgt) cayo6.mo16713a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu22 = (qgu) da2.f164949b;
            qgu22.f41246w = qgt.f41219d;
            qgu22.f41224a |= 2097152;
        }
        if (m32271a(27)) {
            bmxv bmxv7 = (bmxv) cayo4.mo16713a();
            if (bmxv7.mo66813a()) {
                qgw qgw = (qgw) bmxv7.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                qgu qgu23 = (qgu) da2.f164949b;
                qgw.getClass();
                qgu23.f41247x = qgw;
                qgu23.f41224a |= 4194304;
            }
        }
        if (m32271a(29)) {
            boolean z = qdu2.f41033c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu24 = (qgu) da2.f164949b;
            qgu24.f41224a |= 8388608;
            qgu24.f41248y = z;
        }
        if (m32271a(30)) {
            boolean z2 = qdu2.f41041k;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu25 = (qgu) da2.f164949b;
            qgu25.f41224a |= 16777216;
            qgu25.f41249z = z2;
        }
        b.mo66931e();
        long a2 = b.mo66928a(TimeUnit.MILLISECONDS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qgr qgr2 = (qgr) da.f164949b;
        qgr2.f41211a |= 1;
        qgr2.f41212b = a2;
        this.f41520a = (qgu) da2.mo74062i();
        this.f41521b = (qgr) da.mo74062i();
    }

    /* renamed from: a */
    private final boolean m32271a(int i) {
        boolean a = this.f41522d.mo24054a(qgu.class, i);
        f41519c.mo25412b("Field %d of AndroidCheckinRequest is allowed: %s.", Integer.valueOf(i), Boolean.valueOf(a));
        return a;
    }
}
