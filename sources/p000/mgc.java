package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: mgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mgc {

    /* renamed from: a */
    public final rtj f33613a;

    /* renamed from: b */
    public final long f33614b;

    private mgc(rtj rtj, sqv sqv, int i) {
        boolean z;
        sdo.m34959a(rtj);
        this.f33613a = rtj;
        sdo.m34959a(sqv);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        this.f33614b = TimeUnit.MINUTES.toMillis((long) i);
    }

    /* renamed from: a */
    public static mgc m25049a(Context context) {
        sdo.m34959a(context);
        return new mgc(new rtj(context, "com.google.android.gms.backup.migrate.service.MigrationStatusRecorder", true), srb.f45012a, (int) cckw.f179263a.mo6606a().mo76221K());
    }

    /* renamed from: a */
    public final void mo19975a() {
        sdo.m34960a();
        SharedPreferences.Editor edit = this.f33613a.edit();
        edit.putLong("migration_start_time_millis", System.currentTimeMillis());
        edit.apply();
    }
}
