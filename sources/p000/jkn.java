package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkn {

    /* renamed from: a */
    private final ios f22711a;

    /* renamed from: b */
    private final jli f22712b;

    /* renamed from: c */
    private final jlg f22713c;

    public jkn(ios ios, jli jli, jlg jlg) {
        this.f22711a = ios;
        this.f22712b = jli;
        this.f22713c = jlg;
    }

    /* renamed from: a */
    public final aucb mo13835a(Account account, boolean z, boolean z2) {
        int i;
        String str;
        if (cchr.m129714b()) {
            bxvd da = bsnj.f146255c.mo74144da();
            List<bsni> a = this.f22712b.mo13854a(account);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsnj bsnj = (bsnj) da.f164949b;
            if (!bsnj.f146257a.mo73666a()) {
                bsnj.f146257a = GeneratedMessageLite.m124019a(bsnj.f146257a);
            }
            for (bsni bsni : a) {
                bsnj.f146257a.mo74153d(bsni.mo3214a());
            }
            jlg jlg = this.f22713c;
            ArrayList arrayList = new ArrayList();
            List a2 = jlg.f22748b.mo14089a(account);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                bsni bsni2 = (bsni) a2.get(i2);
                if (!jlg.f22749c.mo14090a(account, bsni2)) {
                    arrayList.add(bsni2);
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsnj bsnj2 = (bsnj) da.f164949b;
            if (!bsnj2.f146258b.mo73666a()) {
                bsnj2.f146258b = GeneratedMessageLite.m124019a(bsnj2.f146258b);
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bsnj2.f146258b.mo74153d(((bsni) arrayList.get(i3)).mo3214a());
            }
            bsnj bsnj3 = (bsnj) da.mo74062i();
            bxvd da2 = bsnn.f146304c.mo74144da();
            bsnm bsnm = bsnm.BETTER_TOGETHER;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bsnn) da2.f164949b).f146306a = bsnm.mo3214a();
            ByteString aL = bsnj3.mo73639aL();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aL.getClass();
            ((bsnn) da2.f164949b).f146307b = aL;
            bsnn bsnn = (bsnn) da2.mo74062i();
            ArrayList a3 = bnkn.m109665a("PublicKey", "authzen");
            if (cchu.m129748d()) {
                a3.add("DeviceSync:BetterTogether");
            }
            ios ios = this.f22711a;
            if (!z2) {
                i = 4;
            } else {
                i = 9;
            }
            if (!z) {
                str = "AuthzenAccountRegistration";
            } else {
                str = "ForceRegistration";
            }
            return ios.mo13178a(i, a3, str, account, bsnn.serializeToBytes());
        }
        throw new jkm("Should not enroll if v2 enrollment from proximity is disabled");
    }
}
