package p000;

import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: dsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsz implements eev {

    /* renamed from: a */
    public final HashMap f13973a = new HashMap();

    /* renamed from: a */
    public final void mo9535a(doh doh, tjq tjq) {
        if (doh == null && tjq.mo26591a() == 4) {
            try {
                byte[] c = tjq.mo26593c();
                bxus c2 = bxus.m123744c();
                this.f13973a.put(tjq.mo26594d().mo26605b(), (bxht) bxvk.m124016a(bxht.f163469c, c, c2));
                new Object[1][0] = tjq.mo26594d().mo26605b();
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("dsz", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[KeyStore] Could not parse device registration from feature.");
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo9536a(String str) {
        sdo.m34977c(str);
        boolean containsKey = this.f13973a.containsKey(str);
        bxht bxht = (bxht) this.f13973a.get(str);
        if (bxht == null) {
            if (containsKey) {
                return null;
            }
            tjr tjr = new tjr(null);
            tkb tkb = new tkb();
            tkb.mo26624b();
            TimeFilterImpl a = tkb.mo26620a();
            tjv tjv = new tjv();
            tjv.mo26613a(str);
            tjr.mo26597a(4, a, tjv.mo26612a());
            ArrayList a2 = dwq.m9673q().mo10052a(tjr.mo26595a());
            if (a2.isEmpty()) {
                this.f13973a.put(str, null);
                return null;
            }
            if (a2.size() > 1) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dsz", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[KeyStore] Got more than one key.");
            }
            try {
                bxht bxht2 = (bxht) bxvk.m124016a(bxht.f163469c, ((tjq) a2.get(0)).mo26593c(), bxus.m123744c());
                this.f13973a.put(str, bxht2);
                bxht = bxht2;
            } catch (bxwf e) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("dsz", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[KeyStore] Could not parse encryption key data.");
                return null;
            }
        }
        return bxht.f163472b.mo73780k();
    }
}
