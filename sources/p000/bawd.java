package p000;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: bawd */
final /* synthetic */ class bawd implements bqeh {

    /* renamed from: a */
    private final bawq f101964a;

    /* renamed from: b */
    private final Pair f101965b;

    /* renamed from: c */
    private final bauu f101966c;

    public bawd(bawq bawq, Pair pair, bauu bauu) {
        this.f101964a = bawq;
        this.f101965b = pair;
        this.f101966c = bauu;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        int i;
        bawq bawq = this.f101964a;
        Pair pair = this.f101965b;
        bauu bauu = this.f101966c;
        bngs bngs = (bngs) obj;
        bavr bavr = (bavr) pair.first;
        bavd bavd = (bavd) pair.second;
        baud baud = (baud) bauu;
        if (!baud.f101756a && (!TextUtils.equals((CharSequence) baud.f101758c.mo66814b(), bavr.f101919b) || (baud.f101757b ? (bavr.f101918a & 4) != 0 : !(!baud.f101759d.mo66813a() || bawv.m87644a((Account) baud.f101759d.mo66814b()).equals(bavr.f101921d))))) {
            return bqga.m112775a(bngs);
        }
        boolean z = bavr.f101922e;
        if ((bavr.f101918a & 4) != 0) {
            str = bavr.f101921d;
        } else {
            str = null;
        }
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        return bqdx.m112673a(bqdx.m112673a(bawq.mo55997a(bavd, str, i), new bawi(bawq), bawq.f101996e), new bawf(bngs), bawq.f101996e);
    }
}
