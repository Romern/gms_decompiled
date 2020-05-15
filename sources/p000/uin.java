package p000;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: uin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uin extends uny {

    /* renamed from: a */
    public final long f47708a;

    /* renamed from: b */
    public final AppIdentity f47709b;

    /* renamed from: c */
    public int f47710c;

    /* renamed from: d */
    public int f47711d;

    /* renamed from: e */
    public boolean f47712e;

    public uin(uno uno, long j, long j2, AppIdentity appIdentity, int i, int i2, boolean z) {
        super(uno, uiq.f47724a, j);
        this.f47708a = j2;
        sdo.m34959a(appIdentity);
        this.f47709b = appIdentity;
        this.f47710c = i;
        this.f47711d = i2;
        this.f47712e = z;
    }

    /* renamed from: a */
    public static uin m38683a(uno uno, Cursor cursor) {
        return new uin(uno, uiq.f47724a.f48341a.mo27705b(cursor).longValue(), uip.DRIVE_APP_ID.f47723j.mo27705b(cursor).longValue(), AppIdentity.m22942a(uip.PACKAGE_NAME.f47723j.mo27702a(cursor), uip.CERTIFICATE_HASH.f47723j.mo27702a(cursor)), uip.NETWORK_TYPE_PREFERENCE.f47723j.mo27705b(cursor).intValue(), uip.BATTERY_USAGE_PREFERENCE.f47723j.mo27705b(cursor).intValue(), uip.ROAMING_PREFERENCE.f47723j.mo27718e(cursor));
    }

    public final String toString() {
        return String.format("AuthenticatedApp [driveAppId=%s, mAppIdentity=%s, networkPreference=%s, batteryPreference=%s, roamingPreference=%s]", Long.valueOf(this.f47708a), this.f47709b, Integer.valueOf(this.f47710c), Integer.valueOf(this.f47711d), Boolean.valueOf(this.f47712e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(uip.DRIVE_APP_ID.f47723j.mo27700a(), Long.valueOf(this.f47708a));
        contentValues.put(uip.PACKAGE_NAME.f47723j.mo27700a(), this.f47709b.f30764b);
        contentValues.put(uip.CERTIFICATE_HASH.f47723j.mo27700a(), this.f47709b.f30765c);
        contentValues.put(uip.NETWORK_TYPE_PREFERENCE.f47723j.mo27700a(), Integer.valueOf(this.f47710c));
        contentValues.put(uip.BATTERY_USAGE_PREFERENCE.f47723j.mo27700a(), Integer.valueOf(this.f47711d));
        contentValues.put(uip.ROAMING_PREFERENCE.f47723j.mo27700a(), Boolean.valueOf(this.f47712e));
    }
}
