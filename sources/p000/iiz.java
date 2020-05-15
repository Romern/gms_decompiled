package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iiz {

    /* renamed from: b */
    public static final Logger f21079b = new Logger("PermitStore");

    /* renamed from: a */
    public final iiw f21080a;

    public iiz(Context context) {
        this.f21080a = iiw.m15495a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ad  */
    /* renamed from: a */
    public static Permit m15498a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        String str;
        Cursor cursor2 = cursor;
        try {
            str = imu.m15739c(cursor2, "id");
            try {
                ifn ifn = new ifn();
                ifn.f20866a = imu.m15739c(cursor2, "license__id");
                ifn.f20867b = imu.m15739c(cursor2, "license__type");
                ifn.f20868c = imu.m15737a(cursor2, "license__data");
                ifn.f20869d = imu.m15739c(cursor2, "license__name");
                ifn.f20870e = imu.m15740d(cursor2, "license__is_unlockable");
                ifn.f20871f = imu.m15740d(cursor2, "license__is_unlock_key");
                ifn.f20872g = imu.m15740d(cursor2, "license__is_mobile_hotspot_supported");
                ifn.f20873h = imu.m15739c(cursor2, "license__bt_mac_address");
                ifn.f20874i = imu.m15739c(cursor2, "license__device_type");
                ifn.mo12971a(iiu.m15491a(imu.m15737a(cursor2, "license__beacon_seeds")));
                ifn.f20876k = imu.m15740d(cursor2, "license__is_pixel_phone");
                ifn.f20877l = imu.m15740d(cursor2, "license__is_arc_plus_plus");
                PermitAccess a = ifn.mo12970a();
                ifm ifm = new ifm();
                ifm.f20860a = imu.m15739c(cursor2, "id");
                ifm.f20861b = imu.m15739c(cursor2, "account_id");
                ifm.f20862c = imu.m15739c(cursor2, "type");
                ifm.f20863d = a;
                String c = imu.m15739c(cursor2, "allowed_channels");
                if (c != null) {
                    String[] strArr = ija.f21081a;
                    for (String str2 : TextUtils.split(c, ",")) {
                        ifm.mo12969a(str2);
                    }
                }
                Cursor query = sQLiteDatabase.query("permit__requester_access", null, "permit_id=?", new String[]{str}, null, null, "last_update_time DESC");
                if (query.moveToFirst()) {
                    while (!query.isAfterLast()) {
                        ifn ifn2 = new ifn();
                        ifn2.f20866a = imu.m15739c(query, "id");
                        ifn2.f20867b = imu.m15739c(query, "type");
                        ifn2.f20868c = imu.m15737a(query, "data");
                        ifn2.f20869d = imu.m15739c(query, "name");
                        ifn2.f20870e = imu.m15740d(query, "is_unlockable");
                        ifn2.f20871f = imu.m15740d(query, "is_unlock_key");
                        ifn2.f20872g = imu.m15740d(query, "is_mobile_hotspot_supported");
                        ifn2.f20873h = imu.m15739c(query, "bt_mac_address");
                        ifn2.f20874i = imu.m15739c(query, "device_type");
                        ifn2.mo12971a(iiu.m15491a(imu.m15737a(query, "beacon_seeds")));
                        ifn2.f20875j = imu.m15738b(query, "last_update_time").longValue();
                        ifn2.f20876k = imu.m15740d(query, "is_pixel_phone");
                        ifn2.f20877l = imu.m15740d(query, "is_arc_plus_plus");
                        ifm.mo12968a(ifn2.mo12970a());
                        query.moveToNext();
                    }
                }
                query.close();
                return ifm.mo12967a();
            } catch (NullPointerException e) {
                m15499a(sQLiteDatabase, str);
                throw new iiy("Error when creating permit from Cursor.");
            } catch (IllegalArgumentException e2) {
                m15499a(sQLiteDatabase, str);
                throw new iiy("Error when creating permit from Cursor.");
            } catch (IOException e3) {
                m15499a(sQLiteDatabase, str);
                throw new iiy("Error when creating permit from Cursor: IOException deserializing BeaconSeeds.");
            } catch (NullPointerException e4) {
                m15499a(sQLiteDatabase, str);
                throw new iiy("Error when creating permit from Cursor.");
            } catch (IllegalArgumentException e5) {
                m15499a(sQLiteDatabase, str);
                throw new iiy("Error when creating permit from Cursor.");
            } catch (NullPointerException e6) {
                throw new iiy("Error when creating permit requester access from Cursor.");
            } catch (IllegalArgumentException e7) {
                throw new iiy("Error when creating permit requester access from Cursor.");
            } catch (IOException e8) {
                throw new iiy("Error when creating permit requester access from Cursor: IOException deserializing BeaconSeeds.");
            } catch (IllegalArgumentException e9) {
                if (str != null) {
                }
                throw new iiy("Got invalid permit from database.");
            }
        } catch (IllegalArgumentException e10) {
            str = null;
            if (str != null) {
                m15499a(sQLiteDatabase, str);
            }
            throw new iiy("Got invalid permit from database.");
        }
    }

    /* renamed from: b */
    public final List mo13054b(String str) {
        SQLiteDatabase a = this.f21080a.mo13052a();
        Cursor query = a.query("permit", null, "account_id=?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                while (!query.isAfterLast()) {
                    arrayList.add(m15498a(a, query));
                    query.moveToNext();
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            query.close();
            return arrayList2;
        } finally {
            query.close();
        }
    }

    /* renamed from: c */
    public final void mo13055c(String str) {
        f21079b.mo25414c("Removing permit with permitId: %s...", Logger.m35081a(str));
        m15499a(this.f21080a.mo13052a(), str);
    }

    /* renamed from: a */
    private static void m15499a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.delete("permit", "id=?", new String[]{str});
            sQLiteDatabase.delete("permit__requester_access", "permit_id=?", new String[]{str});
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public final boolean mo13053a(String str) {
        try {
            return ((Boolean) igt.f20956f.mo58455c()).booleanValue() && !mo13054b(str).isEmpty();
        } catch (iiy e) {
            f21079b.mo25417e("Error when trying to get all permits from database.", e, new Object[0]);
            return false;
        }
    }
}
