package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.os.SystemClock;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
import java.util.List;

/* renamed from: hgw */
final /* synthetic */ class hgw implements bqeh {

    /* renamed from: a */
    private final hhe f19732a;

    /* renamed from: b */
    private final MatchPasswordResult f19733b;

    public hgw(hhe hhe, MatchPasswordResult matchPasswordResult) {
        this.f19732a = hhe;
        this.f19733b = matchPasswordResult;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgy bqgy;
        hhe hhe = this.f19732a;
        MatchPasswordResult matchPasswordResult = this.f19733b;
        alky alky = (alky) obj;
        List<Account> list = matchPasswordResult.f10237a;
        if (alky == null || alky.mo12459b().mo24660a() <= 0) {
            rtu a = DataHolder.m22537a(new String[]{"account_name", "display_name", "given_name", "family_name", "avatar"});
            for (Account account : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_name", account.name);
                contentValues.put("display_name", account.name);
                contentValues.putNull("given_name");
                contentValues.putNull("family_name");
                contentValues.putNull("avatar");
                a.mo25160a(contentValues);
            }
            alky = new hgy(a);
        }
        bngx a2 = bngx.m109355a((Iterable) alky.mo12459b());
        bnha h = bnhe.m109414h();
        for (Account account2 : matchPasswordResult.f10237a) {
            alzr alzr = (alzr) bnjd.m109597e(a2, new hgo(account2));
            hek a3 = hek.m14270a(alzr.mo41063c(), alzr.mo41064d(), alzr.mo41063c(), null);
            a3.f19606f = alzr.mo41069j();
            h.mo67695b(a3, account2);
        }
        alky.mo12460c();
        hhe.f19758m = h.mo67618b();
        hhe.f19766u.mo2453l((hek) hhe.f19758m.keySet().mo67639g().get(0));
        hhe.f19764s.mo2453l(bngx.m109368a((Collection) hhe.f19758m.keySet().mo67639g()));
        hhe.f19763r.mo2453l(matchPasswordResult);
        int size = matchPasswordResult.f10237a.size();
        boolean z = matchPasswordResult.f10238b;
        qws qws = hhe.f19755j;
        bxvd da = bong.f133782r.mo74144da();
        String str = hhe.f19751f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        str.getClass();
        int i = bong.f133784a | 2;
        bong.f133784a = i;
        bong.f133786c = str;
        bong.f133785b = 11;
        bong.f133784a = i | 1;
        bxvd da2 = bomy.f133736f.mo74144da();
        String str2 = hhe.f19750e;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomy bomy = (bomy) da2.f164949b;
        str2.getClass();
        int i2 = bomy.f133738a | 8;
        bomy.f133738a = i2;
        bomy.f133742e = str2;
        int i3 = 2 | i2;
        bomy.f133738a = i3;
        bomy.f133740c = false;
        int i4 = i3 | 1;
        bomy.f133738a = i4;
        bomy.f133739b = z;
        bomy.f133738a = 4 | i4;
        bomy.f133741d = size;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bomy bomy2 = (bomy) da2.mo74062i();
        bomy2.getClass();
        bong2.f133795l = bomy2;
        bong2.f133784a |= 1024;
        qws.mo24333a(da.mo74062i()).mo24327b();
        hhc hhc = hhe.f19759n;
        long c = cccr.m129264c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = hhc.f19741b;
        long j2 = c - (elapsedRealtime - j);
        if (j != 0 && j2 >= 0) {
            bqgy c2 = bqgy.m112818c();
            hhc.f19742c.f19757l.execute(new hgz(j2, c2));
            bqgy = c2;
        } else {
            hhc.f19740a.cancel();
            bqgy = bqga.m112775a((Object) null);
        }
        return bqdx.m112674a(bqgy, hgx.f19734a, hhe.f19753h);
    }
}
