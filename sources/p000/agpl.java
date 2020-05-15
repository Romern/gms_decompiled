package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import java.util.concurrent.TimeUnit;

/* renamed from: agpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpl {

    /* renamed from: c */
    private static final srn f66243c = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public final agpm f66244a;

    /* renamed from: b */
    public final Object f66245b = new Object();

    public agpl(Context context, String str) {
        bmxy.m108581a(str);
        bmxy.m108581a(context);
        this.f66244a = new agpm(context, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (r2 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r2 != null) goto L_0x00c5;
     */
    /* renamed from: a */
    public final agps mo35852a(Long l) {
        byte[] bArr;
        String str;
        byte[] bArr2;
        byte[] bArr3;
        agps agps = null;
        byte[] bArr4 = null;
        agps = null;
        agps = null;
        if (l == null) {
            return null;
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            agpm.mo35864a("CarrierTable", "expiration_time");
            try {
                Cursor query = agpm.getReadableDatabase().query("CarrierTable", null, "carrier_id = ?", new String[]{l.toString()}, null, null, null);
                try {
                    if (query.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("carrier_id", l);
                        int columnIndex = query.getColumnIndex("list_cpid_endpoints_resp");
                        if (query.getType(columnIndex) != 0) {
                            bArr = query.getBlob(columnIndex);
                        } else {
                            bArr = null;
                        }
                        contentValues.put("list_cpid_endpoints_resp", bArr);
                        int columnIndex2 = query.getColumnIndex("mcc_mnc");
                        if (query.getType(columnIndex2) != 0) {
                            str = query.getString(columnIndex2);
                        } else {
                            str = null;
                        }
                        contentValues.put("mcc_mnc", str);
                        int columnIndex3 = query.getColumnIndex("carrier_app_logo");
                        if (query.getType(columnIndex3) != 0) {
                            bArr2 = query.getBlob(columnIndex3);
                        } else {
                            bArr2 = null;
                        }
                        contentValues.put("carrier_app_logo", bArr2);
                        int columnIndex4 = query.getColumnIndex("carrier_logo");
                        if (query.getType(columnIndex4) != 0) {
                            bArr3 = query.getBlob(columnIndex4);
                        } else {
                            bArr3 = null;
                        }
                        contentValues.put("carrier_logo", bArr3);
                        contentValues.put("expiration_time", Long.valueOf(query.getLong(query.getColumnIndex("expiration_time"))));
                        int columnIndex5 = query.getColumnIndex("carrier_extra");
                        if (query.getType(columnIndex5) != 0) {
                            bArr4 = query.getBlob(columnIndex5);
                        }
                        contentValues.put("carrier_extra", bArr4);
                        agps = agps.m54783a(contentValues);
                    }
                    query.close();
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (SQLiteException e) {
                bnsl bnsl = (bnsl) agpm.f66246a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Cannot get readable SQLite database");
            }
        }
        return agps;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* renamed from: b */
    public final agpu mo35860b(Long l) {
        agpu agpu;
        byte[] bArr;
        synchronized (this.f66245b) {
            agpu = null;
            byte[] bArr2 = null;
            agpu = null;
            agpu = null;
            agpu = null;
            try {
                SQLiteDatabase readableDatabase = this.f66244a.getReadableDatabase();
                if (readableDatabase.getVersion() >= 5) {
                    Cursor query = readableDatabase.query("DeviceTable", null, "version_index = ?", new String[]{l.toString()}, null, null, null);
                    try {
                        if (query.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("version_index", l);
                            int columnIndex = query.getColumnIndex("consent_record");
                            if (query.getType(columnIndex) != 0) {
                                bArr = query.getBlob(columnIndex);
                            } else {
                                bArr = null;
                            }
                            contentValues.put("consent_record", bArr);
                            int columnIndex2 = query.getColumnIndex("device_info");
                            if (query.getType(columnIndex2) != 0) {
                                bArr2 = query.getBlob(columnIndex2);
                            }
                            contentValues.put("device_info", bArr2);
                            agpu = agpu.m54793a(contentValues);
                        }
                        query.close();
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
            } catch (SQLiteException e) {
                bnsl bnsl = (bnsl) agpm.f66246a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Cannot get readable SQLite database");
            }
        }
        return agpu;
        throw th;
    }

    /* renamed from: c */
    public final ConsentAgreementText mo35862c(Long l) {
        agps a = mo35852a(l);
        if (a == null || a.mo35892f() == null || a.mo35892f().f165194a.mo73779j()) {
            return null;
        }
        try {
            return (ConsentAgreementText) sef.m35069a(a.mo35892f().f165194a.mo73780k(), ConsentAgreementText.CREATOR);
        } catch (sec e) {
            bnsl bnsl = (bnsl) f66243c.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Exception reading consent text byte string");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r2 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r2 != null) goto L_0x00a1;
     */
    /* renamed from: b */
    public final agpy mo35861b(Long l, String str) {
        String str2;
        byte[] bArr;
        agpy agpy = null;
        byte[] bArr2 = null;
        agpy = null;
        agpy = null;
        if (l == null || str == null) {
            return null;
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            agpm.mo35864a("SubscriptionTable", "expiration_time");
            try {
                Cursor query = agpm.getReadableDatabase().query("SubscriptionTable", null, "carrier_id = ? AND cpid = ?", new String[]{l.toString(), str}, null, null, null);
                try {
                    if (query.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("carrier_id", l);
                        contentValues.put("cpid", str);
                        int columnIndex = query.getColumnIndex("locale");
                        if (query.getType(columnIndex) != 0) {
                            str2 = query.getString(columnIndex);
                        } else {
                            str2 = null;
                        }
                        contentValues.put("locale", str2);
                        int columnIndex2 = query.getColumnIndex("data_plan");
                        if (query.getType(columnIndex2) != 0) {
                            bArr = query.getBlob(columnIndex2);
                        } else {
                            bArr = null;
                        }
                        contentValues.put("data_plan", bArr);
                        int columnIndex3 = query.getColumnIndex("upsell_offer");
                        if (query.getType(columnIndex3) != 0) {
                            bArr2 = query.getBlob(columnIndex3);
                        }
                        contentValues.put("upsell_offer", bArr2);
                        contentValues.put("expiration_time", Long.valueOf(query.getLong(query.getColumnIndex("expiration_time"))));
                        agpy = agpy.m54823a(contentValues);
                    }
                    query.close();
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (SQLiteException e) {
                bnsl bnsl = (bnsl) agpm.f66246a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Cannot get readable SQLite database");
            }
        }
        return agpy;
        throw th;
    }

    /* renamed from: a */
    public final agpw mo35853a(Long l, String str) {
        agpw agpw = null;
        if (l == null || l.longValue() <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            if (l.longValue() > 0 && !TextUtils.isEmpty(str)) {
                agpw = agpm.mo35863a("carrier_id = ? AND cpid = ?", new String[]{l.toString(), str});
            }
        }
        return agpw;
    }

    /* renamed from: a */
    public final agpw mo35854a(String str) {
        agpw agpw = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            if (!TextUtils.isEmpty(str)) {
                agpw = agpm.mo35863a("iccid = ?", new String[]{str});
            }
        }
        return agpw;
    }

    /* renamed from: a */
    public final boolean mo35855a(agps agps) {
        boolean a;
        if (agps.mo35888b() == null) {
            return false;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + agqg.m54854i().longValue();
        if (agps.mo35891e() == null || agps.mo35891e().longValue() - seconds > 0 || cfmd.m140085e()) {
            agps.mo35868a().put("expiration_time", Long.valueOf(seconds));
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            String[] strArr = {agps.mo35888b().toString()};
            agpm.mo35864a("CarrierTable", "expiration_time");
            a = agpm.mo35866a("CarrierTable", agps.mo35868a(), "carrier_id = ?", strArr);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo35856a(agpu agpu) {
        boolean a;
        if (agpu.mo35896b() == null) {
            return false;
        }
        synchronized (this.f66245b) {
            a = this.f66244a.mo35866a("DeviceTable", agpu.mo35872a(), "version_index = ?", new String[]{agpu.mo35896b().toString()});
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo35857a(agpw agpw) {
        Long l;
        boolean a;
        if (agpw.mo35911b() == null) {
            return false;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + agqg.m54855j();
        agpw a2 = mo35854a(agpw.mo35911b());
        if (a2 != null) {
            l = a2.mo35914e();
        } else {
            l = null;
        }
        if ((agpw.mo35914e() == null && l == null) || ((agpw.mo35914e() != null && agpw.mo35914e().longValue() - seconds > 0) || cfmd.m140085e())) {
            agpw.mo35876a().put("expiration_time", Long.valueOf(seconds));
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            String[] strArr = {agpw.mo35911b()};
            agpm.mo35864a("SimCardTable", "expiration_time");
            a = agpm.mo35866a("SimCardTable", agpw.mo35876a(), "iccid = ?", strArr);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo35858a(agpy agpy) {
        boolean a;
        if (agpy.mo35923b() == null || agpy.mo35924c() == null) {
            return false;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + agqg.m54854i().longValue();
        if (agpy.mo35925d() == null || agpy.mo35925d().longValue() - seconds > 0 || cfmd.m140085e()) {
            agpy.mo35879a().put("expiration_time", Long.valueOf(seconds));
        }
        synchronized (this.f66245b) {
            agpm agpm = this.f66244a;
            String[] strArr = {agpy.mo35923b().toString(), agpy.mo35924c()};
            agpm.mo35864a("SubscriptionTable", "expiration_time");
            a = agpm.mo35866a("SubscriptionTable", agpy.mo35879a(), "carrier_id = ? AND cpid = ?", strArr);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo35859a(String str, Long l, String str2, long j) {
        bxvd bxvd;
        agpw a = mo35854a(str);
        if (a == null || a.mo35917h() == null) {
            bxvd = bxzz.f165211e.mo74144da();
        } else {
            bxzz h = a.mo35917h();
            bxvd = (bxvd) h.mo74142c(5);
            bxvd.mo73625a((bxvk) h);
        }
        agpv agpv = new agpv();
        agpv.mo35904a(l);
        agpv.mo35905a(str2);
        agpv.mo35908b(str);
        long seconds = j + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxzz bxzz = bxzz.f165211e;
        ((bxzz) bxvd.f164949b).f165216d = seconds;
        agpv.mo35902a((bxzz) bxvd.mo74062i());
        return mo35857a(agpv.mo35900a());
    }
}
