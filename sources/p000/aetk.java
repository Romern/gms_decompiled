package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: aetk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetk {

    /* renamed from: b */
    private static final SecureRandom f63774b = bmyk.f131202b;

    /* renamed from: c */
    private static final boolean f63775c = cfaz.f183554a.mo6606a().mo80790m();

    /* renamed from: a */
    public String f63776a;

    /* renamed from: d */
    private final qws f63777d;

    /* renamed from: e */
    private boolean f63778e = false;

    public aetk(Context context) {
        this.f63777d = new qws(context, "SOCIAL_USER_LOCATION", null);
    }

    /* renamed from: a */
    public static cajl m52536a(SharingCondition sharingCondition) {
        if (sharingCondition == null) {
            return null;
        }
        bxvd da = cajl.f174833d.mo74144da();
        if (sharingCondition.mo43781c() == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajl cajl = (cajl) da.f164949b;
            cajl.f174836b = 2;
            cajl.f174835a |= 1;
        } else if (sharingCondition.mo43781c() == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajl cajl2 = (cajl) da.f164949b;
            cajl2.f174836b = 1;
            int i = cajl2.f174835a | 1;
            cajl2.f174835a = i;
            long j = sharingCondition.f79644b;
            cajl2.f174835a = i | 2;
            cajl2.f174837c = (int) (j / 60000);
        }
        return (cajl) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m52538a(int i) {
        return i == 1 || i == 99;
    }

    /* renamed from: d */
    public static bxvd m52539d(int i) {
        bxvd da = caix.f174776l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caix caix = (caix) da.f164949b;
        caix.f174779b = i - 1;
        caix.f174778a |= 1;
        return da;
    }

    /* renamed from: b */
    public final void mo34553b(int i) {
        mo34552a((caix) m52539d(i).mo74062i());
    }

    /* renamed from: c */
    public final void mo34554c(int i) {
        bxvd da = cajn.f174839c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajn cajn = (cajn) da.f164949b;
        cajn.f174842b = i - 1;
        cajn.f174841a |= 1;
        cajn cajn2 = (cajn) da.mo74062i();
        bxvd d = m52539d(20);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        caix caix2 = caix.f174776l;
        cajn2.getClass();
        caix.f174788k = cajn2;
        caix.f174778a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        mo34552a((caix) d.mo74062i());
    }

    public aetk(Context context, caiu caiu, Bundle bundle, String str) {
        if (bundle != null) {
            this.f63778e = bundle.getBoolean("has_logged_launch", false);
        }
        this.f63776a = str;
        this.f63777d = qws.m33019a(context, "SOCIAL_USER_LOCATION");
        if (!this.f63778e && f63775c) {
            bxvd d = m52539d(15);
            if (caiu != null) {
                if (d.f164950c) {
                    d.mo74035c();
                    d.f164950c = false;
                }
                caix caix = (caix) d.f164949b;
                caix caix2 = caix.f174776l;
                caiu.getClass();
                caix.f174783f = caiu;
                caix.f174778a |= 512;
            }
            mo34552a((caix) d.mo74062i());
            this.f63778e = true;
        }
    }

    /* renamed from: a */
    public static String m52537a() {
        return new BigInteger(64, f63774b).toString();
    }

    /* renamed from: a */
    public final void mo34549a(int i, int i2) {
        bxvd da = cajc.f174803d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajc cajc = (cajc) da.f164949b;
        cajc.f174806b = i - 1;
        int i3 = cajc.f174805a | 1;
        cajc.f174805a = i3;
        if (i2 > 0) {
            cajc.f174805a = i3 | 2;
            cajc.f174807c = i2;
        }
        bxvd d = m52539d(19);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        cajc cajc2 = (cajc) da.mo74062i();
        caix caix2 = caix.f174776l;
        cajc2.getClass();
        caix.f174787j = cajc2;
        caix.f174778a |= 8192;
        mo34552a((caix) d.mo74062i());
    }

    /* renamed from: a */
    public final void mo34550a(int i, SharingCondition sharingCondition) {
        cajl a = m52536a(sharingCondition);
        bxvd da = cajh.f174820f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajh cajh = (cajh) da.f164949b;
        cajh.f174823b = i - 1;
        int i2 = cajh.f174822a | 1;
        cajh.f174822a = i2;
        if (a != null) {
            a.getClass();
            cajh.f174824c = a;
            cajh.f174822a = i2 | 2;
        }
        cajh cajh2 = (cajh) da.mo74062i();
        bxvd d = m52539d(18);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        caix caix2 = caix.f174776l;
        cajh2.getClass();
        caix.f174786i = cajh2;
        caix.f174778a |= 4096;
        mo34552a((caix) d.mo74062i());
    }

    /* renamed from: a */
    public final void mo34551a(Bundle bundle) {
        bundle.putBoolean("has_logged_launch", this.f63778e);
    }

    /* renamed from: a */
    public final void mo34552a(caix caix) {
        if (f63775c && caix != null) {
            qwo a = this.f63777d.mo24335a(caix.serializeToBytes());
            int a2 = caiw.m126680a(caix.f174779b);
            if (a2 == 0) {
                a2 = 1;
            }
            a.mo24328b(a2 - 1);
            String str = this.f63776a;
            if (str != null) {
                a.mo24323a((long) str.hashCode());
            }
            a.mo24327b();
        }
    }
}
