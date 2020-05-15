package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.backup.ApplicationBackupStats;
import java.util.Random;

/* renamed from: mza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mza implements mys {

    /* renamed from: a */
    final /* synthetic */ mzb f34999a;

    public mza(mzb mzb) {
        this.f34999a = mzb;
    }

    /* renamed from: a */
    public final void mo20330a() {
        luh luh;
        luj luj;
        mzb mzb = this.f34999a;
        nad nad = mzb.f35009j;
        String str = mzb.f35013n;
        int i = (int) mzb.f35015p;
        rex rex = new rex();
        if (skh.m35531a().mo25690a(nad.f35123b, new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupStatsService").addCategory("android.intent.category.DEFAULT"), rex, 1)) {
            try {
                IBinder a = rex.mo24567a();
                if (a != null) {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.backup.IBackupStatsService");
                    if (!(queryLocalInterface instanceof luj)) {
                        luh = new luh(a);
                        luh.mo19608a(new ApplicationBackupStats(str, 0, i, System.currentTimeMillis()));
                        skh.m35531a().mo25689a(nad.f35123b, rex);
                    } else {
                        luj = (luj) queryLocalInterface;
                    }
                } else {
                    luj = null;
                }
                luh = luj;
                luh.mo19608a(new ApplicationBackupStats(str, 0, i, System.currentTimeMillis()));
                try {
                    skh.m35531a().mo25689a(nad.f35123b, rex);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    nad.f35122a.mo25415d("Exception when unbinding: ", e, new Object[0]);
                }
            } catch (Exception e2) {
                nad.f35122a.mo25417e("Exception on updating local backup stats", e2, new Object[0]);
                try {
                    skh.m35531a().mo25689a(nad.f35123b, rex);
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    nad.f35122a.mo25415d("Exception when unbinding: ", e3, new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    skh.m35531a().mo25689a(nad.f35123b, rex);
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    nad.f35122a.mo25415d("Exception when unbinding: ", e4, new Object[0]);
                }
                throw th;
            }
        }
        mzb mzb2 = this.f34999a;
        myz myz = mzb2.f35007h;
        String str2 = mzb2.f35013n;
        myz.f34996a.mo3198a();
        myz.mo20342a(str2);
    }

    /* renamed from: b */
    public final void mo20331b() {
        mzb mzb = this.f34999a;
        myz myz = mzb.f35007h;
        String str = mzb.f35013n;
        myz.f34996a.mo3200b();
        String valueOf = String.valueOf(str);
        long j = myz.f34998c.getLong(valueOf.length() == 0 ? new String("Tracker_") : "Tracker_".concat(valueOf), 0);
        if (j <= 0) {
            long j2 = j - 1;
            if (j2 == -2) {
                long currentTimeMillis = System.currentTimeMillis();
                long h = ccnf.f179489a.mo6606a().mo76436h();
                long b = ccnf.m130733b() - h;
                if (b <= 0) {
                    b = 1;
                }
                j2 = currentTimeMillis + ((h + ((long) new Random(System.currentTimeMillis()).nextInt((int) b))) * 1000);
            }
            myz.mo20343a(str, j2);
        }
    }
}
