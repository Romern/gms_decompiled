package p000;

import android.accounts.Account;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;
import java.util.Map;

/* renamed from: avvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avvk implements aubq {

    /* renamed from: a */
    final /* synthetic */ Account f93973a;

    /* renamed from: b */
    final /* synthetic */ Map f93974b;

    /* renamed from: c */
    final /* synthetic */ List f93975c;

    /* renamed from: d */
    final /* synthetic */ bymg f93976d;

    /* renamed from: e */
    final /* synthetic */ avup f93977e;

    /* renamed from: f */
    final /* synthetic */ avvl f93978f;

    /* renamed from: g */
    final /* synthetic */ bxvd f93979g;

    public avvk(avvl avvl, Account account, bxvd bxvd, Map map, List list, bymg bymg, avup avup) {
        this.f93978f = avvl;
        this.f93973a = account;
        this.f93979g = bxvd;
        this.f93974b = map;
        this.f93975c = list;
        this.f93976d = bymg;
        this.f93977e = avup;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bxvd bxvd = this.f93979g;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        calo calo = (calo) bxvd.f164949b;
        calo calo2 = calo.f175155l;
        int i = calo.f175157a & -65;
        calo.f175157a = i;
        calo.f175164h = 0;
        int i2 = i & -33;
        calo.f175157a = i2;
        calo.f175163g = 0;
        int i3 = i2 & -17;
        calo.f175157a = i3;
        calo.f175162f = 0;
        int i4 = i3 & -9;
        calo.f175157a = i4;
        calo.f175161e = 0;
        calo.f175157a = i4 & -257;
        calo.f175166j = 0;
        int b = this.f93978f.f93983b.mo51646b(this.f93973a.name);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        calo calo3 = (calo) bxvd.f164949b;
        calo3.f175166j = b - 1;
        calo3.f175157a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (aucb.mo50384b()) {
            for (UdcCacheResponse.UdcSetting udcSetting : ((UdcCacheResponse) aucb.mo50386d()).f109350a) {
                int i5 = udcSetting.f109355b;
                int i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 1 : 2;
                }
                switch (udcSetting.f109354a) {
                    case 7:
                        bxvd bxvd2 = this.f93979g;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        calo calo4 = (calo) bxvd2.f164949b;
                        calo4.f175163g = i6 - 1;
                        calo4.f175157a |= 32;
                        break;
                    case 8:
                        bxvd bxvd3 = this.f93979g;
                        if (bxvd3.f164950c) {
                            bxvd3.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        calo calo5 = (calo) bxvd3.f164949b;
                        calo5.f175161e = i6 - 1;
                        calo5.f175157a |= 8;
                        break;
                    case 9:
                        bxvd bxvd4 = this.f93979g;
                        if (bxvd4.f164950c) {
                            bxvd4.mo74035c();
                            bxvd4.f164950c = false;
                        }
                        calo calo6 = (calo) bxvd4.f164949b;
                        calo6.f175164h = i6 - 1;
                        calo6.f175157a |= 64;
                        break;
                    case 10:
                        bxvd bxvd5 = this.f93979g;
                        if (bxvd5.f164950c) {
                            bxvd5.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        calo calo7 = (calo) bxvd5.f164949b;
                        calo7.f175162f = i6 - 1;
                        calo7.f175157a |= 16;
                        break;
                }
            }
        }
        this.f93974b.put(this.f93973a.name, (calo) this.f93979g.mo74062i());
        if (this.f93974b.size() == this.f93975c.size()) {
            avvl.m79431a(this.f93974b, this.f93976d, this.f93977e);
        }
    }
}
