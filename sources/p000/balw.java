package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: balw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class balw extends cazu {

    /* renamed from: b */
    private final cazn f101231b;

    /* renamed from: c */
    private final cazn f101232c;

    /* renamed from: d */
    private final cazn f101233d;

    public balw(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(balw.class), cijl);
        this.f101231b = cbac.m127643a(cazn);
        this.f101232c = cbac.m127643a(cazn2);
        this.f101233d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101231b.mo75201b(), this.f101232c.mo75201b(), this.f101233d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        Long l = (Long) list.get(2);
        bngs j = bngx.m109377j();
        for (baog baog : ((baok) list.get(1)).mo55825a()) {
            byjh d = baog.mo55817d();
            if (account.equals(baog.mo55815b()) && d != null && bard.m87434a(d)) {
                bxvd da = byiu.f166604d.mo74144da();
                bygz c = baog.mo55816c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byiu byiu = (byiu) da.f164949b;
                c.getClass();
                byiu.f166607b = c;
                int i = byiu.f166606a | 1;
                byiu.f166606a = i;
                int i2 = d.f166655e;
                byiu.f166606a = i | 2;
                byiu.f166608c = i2;
                j.mo67668c((byiu) da.mo74062i());
            }
        }
        return bqga.m112775a((Object) j.mo67664a());
    }
}
