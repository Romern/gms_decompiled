package p000;

import android.accounts.Account;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bduh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bduh implements bdtr {

    /* renamed from: a */
    public final bdqu f106464a;

    /* renamed from: b */
    private final Object f106465b = new Object();

    /* renamed from: c */
    private final Map f106466c = new HashMap();

    /* renamed from: d */
    private final bdug f106467d;

    public bduh(bdug bdug) {
        bmxy.m108581a(bdug);
        this.f106467d = bdug;
        bdtv bdtv = (bdtv) bdug;
        this.f106464a = bdqu.m91313a(bdtv.f106429a, bdtv.f106430b);
    }

    /* renamed from: b */
    public final bdtq mo58357a(Account account) {
        bdtq bdtq;
        synchronized (this.f106465b) {
            if (!this.f106466c.containsKey(account)) {
                Map map = this.f106466c;
                bdvb bdvb = new bdvb(new bdvc(), new bdvj(wem.m41836a(((bdtv) this.f106467d).f106429a, wel.m41834a(account)), ((bdtv) this.f106467d).f106430b));
                bdrl bdrl = ((bdtv) this.f106467d).f106432d;
                bbis bbis = new bbis();
                bdqu bdqu = this.f106464a;
                bdrl.getClass();
                bdvd bdvd = new bdvd(bdrl);
                bxvd da = bxpp.f164297d.mo74144da();
                String d = bdqu.mo58306d();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxpp bxpp = (bxpp) da.f164949b;
                d.getClass();
                int i = bxpp.f164299a | 1;
                bxpp.f164299a = i;
                bxpp.f164300b = d;
                bxpp.f164299a = i | 2;
                bxpp.f164301c = 1;
                bdve bdve = new bdve(bdvd, bbis, (bxpp) da.mo74062i());
                bdqu bdqu2 = this.f106464a;
                bdug bdug = this.f106467d;
                bdro a = bdro.m91337a(bdqu2, 3011, ((bdtv) bdug).f106432d, account, batx.m87541b(((bdtv) bdug).f106431c, account.toString(), (int) chbb.f188227a.mo6606a().mo84901b()), true);
                bdug bdug2 = this.f106467d;
                ((bdtv) bdug2).f106429a.registerReceiver(new bdvg(bdvb, bdve, ((bdtv) bdug2).f106431c), new IntentFilter("com.google.android.gms.udc.action.FACS_CACHE_UPDATED"));
                map.put(account, new bdua(bdvb, bdve, a, ((bdtv) this.f106467d).f106431c));
            }
            bdtq = (bdtq) this.f106466c.get(account);
        }
        return bdtq;
    }
}
