package com.google.android.gms.accountsettings.service;

import android.content.Context;
import com.google.android.gms.accountsettings.p007mg.poc.model.repository.RepositoryDatabase;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurgeScreenDataChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f7804a = ffw.m11631a("PurgeScreenDataSvc");

    /* renamed from: b */
    private RepositoryDatabase f7805b;

    /* renamed from: a */
    public static aebm m5000a() {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
        aebl.f63099k = "PurgeScreenData";
        aebl.mo34027b(1);
        aebl.f63070a = cbri.f178135a.mo6606a().mo75270t();
        aebl.f63071b = cbri.f178135a.mo6606a().mo75269s();
        aebl.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebl.mo34023a(2);
        aebn aebn = new aebn();
        aebn.f63074a = 0;
        aebn.f63075b = (int) TimeUnit.HOURS.toSeconds(4);
        aebn.f63076c = (int) TimeUnit.DAYS.toSeconds(3);
        aebl.f63106r = aebn.mo34011a();
        aebl.f63102n = true;
        return aebl.mo33974b();
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f7805b == null) {
            this.f7805b = RepositoryDatabase.m4960a(getBaseContext());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        RepositoryDatabase repositoryDatabase = this.f7805b;
        if (repositoryDatabase != null) {
            repositoryDatabase.mo9942d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c A[RETURN] */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        boolean z;
        f7804a.mo25409a("Running gcm task %s", aecc.f63128a);
        if (!"PurgeScreenData".equals(aecc.f63128a)) {
            return 0;
        }
        if (cbri.f178135a.mo6606a().mo75256f()) {
            this.f7805b.mo6323k().mo10439a(System.currentTimeMillis() - cbri.f178135a.mo6606a().mo75268r());
            z = true;
        } else {
            z = false;
        }
        if (cbro.f178167a.mo6606a().mo75291k()) {
            f7804a.mo25409a("Purging deprecated account database", new Object[0]);
            Context baseContext = getBaseContext();
            boolean deleteDatabase = new HashSet(Arrays.asList(baseContext.databaseList())).contains("id_as_screens.db") ? baseContext.deleteDatabase("id_as_screens.db") : true;
            if (!z || !deleteDatabase) {
                return 1;
            }
        } else if (z) {
            return 0;
        }
        return 0;
    }
}
