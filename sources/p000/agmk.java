package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: agmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f65936a;

    /* renamed from: b */
    final /* synthetic */ long f65937b;

    /* renamed from: c */
    final /* synthetic */ agmn f65938c;

    public agmk(agmn agmn, String str, long j) {
        this.f65938c = agmn;
        this.f65936a = str;
        this.f65937b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    public final void run() {
        long n;
        long j;
        agmn agmn = this.f65938c;
        String str = this.f65936a;
        long j2 = this.f65937b;
        agmn.mo35694r();
        agmn.mo35695s();
        agmn.mo35701y();
        agcv b = agmn.mo35684h().mo35349b(str);
        if (b == null || TextUtils.isEmpty(b.mo35275i())) {
            agmn.mo35497E().f65571j.mo35436a("No app data available; not logging uninstall event", str);
        } else {
            agdl h = agmn.mo35684h();
            sdo.m34977c(str);
            h.mo35243j();
            h.mo35241h();
            h.mo35659q();
            SQLiteDatabase e = h.mo35360e();
            e.beginTransaction();
            try {
                sdo.m34977c(str);
                h.mo35243j();
                h.mo35241h();
                h.mo35659q();
                try {
                    j = h.mo35335a("select previous_install_count from app2 where app_id=? limit 1;", new String[]{str}, -1);
                } catch (SQLiteException e2) {
                    h.mo35497E().f65564c.mo35437a("Error reading previous install count. appId, error", agid.m54288a(str), e2);
                    j = -1;
                }
                if (j == -1) {
                    try {
                        h.mo35243j();
                        sdo.m34977c(str);
                        h.mo35241h();
                        h.mo35659q();
                        h.mo35359e(str, "previous_install_count");
                    } catch (SQLiteException e3) {
                        e = e3;
                        try {
                            h.mo35497E().f65564c.mo35437a("Error trying to ensure previous install count. appId", agid.m54288a(str), e);
                            e.endTransaction();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_r", 1);
                            agmn.mo35670a(new EventParcel("_ui", new EventParams(bundle), "auto", j2), str);
                            agmn.mo35680d();
                            n = agdi.m54039n();
                            while (((long) r8) < n) {
                            }
                            agmn.mo35684h().mo35356c(str);
                            if (agmn.mo35680d().mo35320c(str, aghn.f65469Y)) {
                            }
                        } catch (Throwable th) {
                            e.endTransaction();
                            throw th;
                        }
                    }
                }
                e.setTransactionSuccessful();
            } catch (SQLiteException e4) {
                e = e4;
                h.mo35497E().f65564c.mo35437a("Error trying to ensure previous install count. appId", agid.m54288a(str), e);
                e.endTransaction();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("_r", 1);
                agmn.mo35670a(new EventParcel("_ui", new EventParams(bundle2), "auto", j2), str);
                agmn.mo35680d();
                n = agdi.m54039n();
                for (int i = 0; ((long) i) < n; i++) {
                }
                agmn.mo35684h().mo35356c(str);
                if (agmn.mo35680d().mo35320c(str, aghn.f65469Y)) {
                }
            }
            e.endTransaction();
            Bundle bundle22 = new Bundle();
            bundle22.putLong("_r", 1);
            agmn.mo35670a(new EventParcel("_ui", new EventParams(bundle22), "auto", j2), str);
        }
        agmn.mo35680d();
        n = agdi.m54039n();
        while (((long) i) < n && agmn.mo35678b(str, 0)) {
        }
        agmn.mo35684h().mo35356c(str);
        if (agmn.mo35680d().mo35320c(str, aghn.f65469Y)) {
            agmn.mo35497E().f65571j.mo35436a("Invalidating remote config cache", str);
            agmn.mo35682f().mo35480c(str);
        }
    }
}
