package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: aljq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aljq {

    /* renamed from: a */
    private final qws f73573a;

    public aljq(Context context) {
        Account account;
        Account[] a = adyd.m51363a(context).mo33916a("com.google");
        String str = null;
        if (a.length == 1 && (account = a[0]) != null) {
            str = account.name;
        }
        this.f73573a = new qws(context, "TAP_AND_PAY_APP", str);
    }

    /* renamed from: b */
    public final void mo40451b(int i) {
        bxvd da = bvzy.f158592b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bvzy) da.f164949b).f158594a = i - 2;
        bvzy bvzy = (bvzy) da.mo74062i();
        bxvd da2 = bwac.f158609d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvzy.getClass();
        ((bwac) da2.f164949b).f158613c = bvzy;
        m61093a((bwac) da2.mo74062i());
    }

    /* renamed from: a */
    private final void m61093a(bwac bwac) {
        bxvd bxvd = (bxvd) bwac.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bwac);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwac bwac2 = bwac.f158609d;
        ((bwac) bxvd.f164949b).f158611a = 3;
        this.f73573a.mo24335a(((bwac) bxvd.mo74062i()).serializeToBytes()).mo24327b();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo40450a(int i) {
        char c;
        bxvd da = bvzz.f158595e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bvzz) da.f164949b).f158597a = i - 2;
        String b = cfuc.m143050b();
        int i2 = 4;
        switch (b.hashCode()) {
            case -1924094359:
                if (b.equals("PUBLIC")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1153558044:
                if (b.equals("EXTERNAL_BETA")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -885405637:
                if (b.equals("TEAMFOOD")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 175259132:
                if (b.equals("INELIGIBLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 676970034:
                if (b.equals("INTERNAL_BETA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i2 = 3;
        } else if (c != 1) {
            i2 = c != 2 ? c != 3 ? c != 4 ? 2 : 7 : 6 : 5;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bvzz) da.f164949b).f158598b = i2 - 2;
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bvzz) da.f164949b).f158599c = currentTimeMillis;
        String str = (String) rtc.m34378a("device_country", "").mo25081c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((bvzz) da.f164949b).f158600d = str;
        bvzz bvzz = (bvzz) da.mo74062i();
        bxvd da2 = bwac.f158609d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvzz.getClass();
        ((bwac) da2.f164949b).f158612b = bvzz;
        m61093a((bwac) da2.mo74062i());
    }
}
