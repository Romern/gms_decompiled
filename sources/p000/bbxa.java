package p000;

import android.database.Cursor;
import android.database.SQLException;
import java.util.concurrent.Callable;

/* renamed from: bbxa */
final /* synthetic */ class bbxa implements Callable {

    /* renamed from: a */
    private final bbxm f103648a;

    public bbxa(bbxm bbxm) {
        this.f103648a = bbxm;
    }

    public final Object call() {
        Cursor a;
        bbxm bbxm = this.f103648a;
        bngs bngs = new bngs();
        bdaw bdaw = bbxm.f103676b;
        bngs bngs2 = new bngs();
        bcav bcav = (bcav) bdaw;
        bcav.f103920a.mo54678a();
        try {
            a = ((bcav) bdaw).f103920a.mo54677a(((bcav) bdaw).mo56666a("registration"), new String[]{"registration_id"}, null, null, null, null);
            while (a != null) {
                if (!a.moveToNext()) {
                    break;
                }
                bmxv a2 = ((bcav) bdaw).mo56667a(a.getLong(0));
                if (a2.mo66813a()) {
                    bngs2.mo67668c((bcoh) a2.mo66814b());
                }
            }
            if (a != null) {
                a.close();
            }
            ((bcav) bdaw).f103920a.mo54681d();
            bcav.f103920a.mo54679b();
            bngx a3 = bngs2.mo67664a();
            bngs.mo67666b((Iterable) a3);
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                bcoh bcoh = (bcoh) a3.get(i);
                if (bcoh.mo57060d() == bcog.INVALID) {
                    bbxm.mo56490d(bcoh.mo57058b().mo57074e());
                }
            }
            return bngs.mo67664a();
        } catch (Exception e) {
            try {
                throw new SQLException("Error when executing transaction!!", e);
            } catch (Throwable th) {
                bcav.f103920a.mo54679b();
                throw th;
            }
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
