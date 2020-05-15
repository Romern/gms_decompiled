package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.tapandpay.security.StorageKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: atbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class atbm {

    /* renamed from: a */
    public static final srn f90004a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static final ContentValues m75381a(atda atda, athj athj, String str) {
        byte[] bArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("environment", atda.f90100a.f89125c);
        contentValues.put("account_id", atda.f90100a.f89123a);
        contentValues.put("bundle_id", atda.f90102c);
        contentValues.put("bundle_type", atda.f90101b);
        contentValues.put("bundle_state", atda.f90103d);
        contentValues.put("session_id", atda.f90104e);
        contentValues.put("encryption_parameters", athj.mo49991b(atda.f90105f));
        contentValues.put("bundle_handle", atda.f90106g);
        contentValues.put("poll_timestamp", Long.valueOf(atda.f90107h));
        atcv atcv = atda.f90108i;
        byte[] bArr2 = null;
        if (atcv != null) {
            bArr = athj.mo49991b(atcv.mo49806h());
        } else {
            bArr = null;
        }
        contentValues.put("acknowledged_bundle", bArr);
        byda byda = atda.f90109j;
        if (byda != null) {
            bArr2 = byda.serializeToBytes();
        }
        contentValues.put("bundle_info", bArr2);
        contentValues.put("new_bundle_type", atda.f90110k);
        contentValues.put("last_modified", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("key_id", str);
        return contentValues;
    }

    /* renamed from: a */
    public static String[] m75392a(String str, askf askf) {
        return new String[]{str, askf.f89123a, askf.f89125c};
    }

    /* renamed from: b */
    public final List mo49780b(Context context, String str) {
        String str2;
        Cursor query = m75382a(context).query("PaymentBundles", new String[]{"account_id", "bundle_id"}, "environment= ?", new String[]{str}, null, null, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            HashMap hashMap = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!hashMap.containsKey(string)) {
                    str2 = mo49487a(context, string);
                    hashMap.put(string, str2);
                } else {
                    str2 = (String) hashMap.get(string);
                }
                if (str2 != null) {
                    arrayList.add(Pair.create(new askf(string, str2, str, context), query.getString(1)));
                }
            }
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static SQLiteDatabase m75382a(Context context) {
        return asko.m74292a(context).mo49214a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01fa A[SYNTHETIC, Splitter:B:117:0x01fa] */
    /* renamed from: a */
    public static final atda m75383a(SQLiteDatabase sQLiteDatabase, askf askf, String str, StorageKey storageKey) {
        Cursor cursor;
        Throwable th;
        atde atde;
        char c;
        askf askf2 = askf;
        athj athj = new athj(storageKey);
        Cursor query = sQLiteDatabase.query("PaymentBundles", new String[]{"bundle_type", "bundle_state", "session_id", "encryption_parameters", "bundle_handle", "poll_timestamp", "acknowledged_bundle", "bundle_info", "new_bundle_type"}, "bundle_id = ? AND account_id = ? AND environment = ?", m75392a(str, askf2), null, null, null);
        try {
            if (query.moveToFirst()) {
                Context context = askf2.f89126d;
                String string = query.getString(0);
                String string2 = query.getString(1);
                String string3 = query.getString(2);
                byte[] a = athj.mo49990a(query.getBlob(3));
                byte[] blob = query.getBlob(4);
                long j = query.getLong(5);
                byte[] blob2 = query.getBlob(6);
                String string4 = query.getString(0);
                if (blob2 != null) {
                    try {
                        if (blob2.length > 0) {
                            byte[] a2 = athj.mo49990a(blob2);
                            switch (string4.hashCode()) {
                                case -1688490866:
                                    if (string4.equals("canonical_interac_bundle")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1426184971:
                                    if (string4.equals("canonical_eftpos_bundle")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -905486322:
                                    if (string4.equals("amex2_bundle")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -152778304:
                                    if (string4.equals("canonical_mc_bundle")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 309674061:
                                    if (string4.equals("canonical_discover_bundle")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 366259608:
                                    if (string4.equals("discover_bundle")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 434689600:
                                    if (string4.equals("visa_bundle")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 959178788:
                                    if (string4.equals("canonical_elo_bundle")) {
                                        c = 8;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1640769725:
                                    if (string4.equals("mcbp_bundle")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    if (cgwn.m147273w()) {
                                        atde = new atby(context, (bycu) GeneratedMessageLite.m124016a(bycu.f165705k, a2, bxus.m123744c()));
                                        break;
                                    } else {
                                        atde = new atbv(context, (bycu) GeneratedMessageLite.m124016a(bycu.f165705k, a2, bxus.m123744c()));
                                        break;
                                    }
                                case 1:
                                    atde = new atdk((ataq) GeneratedMessageLite.m124016a(ataq.f89963f, a2, bxus.m123744c()));
                                    break;
                                case 2:
                                    atde = new atdo((bydf) GeneratedMessageLite.m124016a(bydf.f165769j, a2, bxus.m123744c()), new atdm());
                                    break;
                                case 3:
                                    atde = new atdh((bycz) GeneratedMessageLite.m124016a(bycz.f165744e, a2, bxus.m123744c()));
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                    bxvd da = asjr.f89085h.mo74144da();
                                    da.mo73635b(a2, bxus.m123744c());
                                    atde = new atde(string4, da);
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.format("Incorrect type: %s", string4));
                            }
                            cursor = query;
                            atda atda = new atda(askf, string, str, string2, string3, a, blob, j, atde, (byda) m75386a(query.getBlob(7)).mo74062i(), query.getString(8));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return atda;
                        }
                    } catch (bxwf e) {
                        throw new RuntimeException(e);
                    } catch (bxwf e2) {
                        throw new RuntimeException(e2);
                    } catch (bxwf e3) {
                        throw new RuntimeException(e3);
                    } catch (bxwf e4) {
                        throw new IllegalArgumentException("Not valid visa bundle", e4);
                    } catch (bxwf e5) {
                        throw new RuntimeException(e5);
                    } catch (bxwf e6) {
                        throw new RuntimeException("Payload is not valid CanonicalBundle", e6);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                atde = null;
                cursor = query;
                try {
                    atda atda2 = new atda(askf, string, str, string2, string3, a, blob, j, atde, (byda) m75386a(query.getBlob(7)).mo74062i(), query.getString(8));
                    if (cursor != null) {
                    }
                    return atda2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th4) {
                            bqye.m113761a(th, th4);
                        }
                    }
                    throw th;
                }
            } else {
                cursor = query;
                throw new atdb();
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = query;
            th = th;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static final atda m75384a(askf askf, String str) {
        return m75383a(m75382a(askf.f89126d), askf, str, m75385a().mo49999a(askf));
    }

    /* renamed from: a */
    public static final athq m75385a() {
        return new athq();
    }

    /* renamed from: a */
    private static bxvd m75386a(byte[] bArr) {
        if (bArr == null) {
            return byda.f165750e.mo74144da();
        }
        try {
            bxvd da = byda.f165750e.mo74144da();
            da.mo73635b(bArr, bxus.m123744c());
            return da;
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90004a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbm", "a", 252, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error parsing BundleInfo");
            return byda.f165750e.mo74144da();
        }
    }

    /* renamed from: a */
    public static final byda m75387a(askf askf, String str, long j, boolean z) {
        Cursor query;
        Throwable th;
        SQLiteDatabase a = m75382a(askf.f89126d);
        a.beginTransaction();
        try {
            query = a.query("PaymentBundles", new String[]{"bundle_info"}, "bundle_id = ? AND account_id = ? AND environment = ?", m75392a(str, askf), null, null, null);
            if (query.moveToFirst()) {
                bxvd a2 = m75386a(query.getBlob(0));
                if (query != null) {
                    query.close();
                }
                if (a2.f164950c) {
                    a2.mo74035c();
                    a2.f164950c = false;
                }
                byda byda = (byda) a2.f164949b;
                byda byda2 = byda.f165750e;
                int i = byda.f165752a | 1;
                byda.f165752a = i;
                byda.f165753b = j;
                int i2 = i | 2;
                byda.f165752a = i2;
                byda.f165754c++;
                if (!z) {
                    byda.f165752a = i2 | 4;
                    byda.f165755d = 0;
                } else {
                    byda.f165752a = i2 | 4;
                    byda.f165755d++;
                }
                byda byda3 = (byda) a2.mo74062i();
                ContentValues contentValues = new ContentValues();
                contentValues.put("bundle_info", byda3.serializeToBytes());
                a.update("PaymentBundles", contentValues, "bundle_id = ? AND account_id = ? AND environment = ?", m75392a(str, askf));
                a.setTransactionSuccessful();
                a.endTransaction();
                return byda3;
            }
            throw new atdb();
        } catch (Throwable th2) {
            a.endTransaction();
            throw th2;
        }
        throw th;
    }

    /* renamed from: a */
    public static final Object m75388a(askf askf, String str, atbl atbl) {
        Object obj;
        StorageKey a = m75385a().mo49999a(askf);
        athj athj = new athj(a);
        SQLiteDatabase a2 = m75382a(askf.f89126d);
        a2.beginTransaction();
        try {
            atda a3 = m75383a(a2, askf, str, a);
            atbk atbk = null;
            try {
                obj = atbl.mo49778a(a3);
            } catch (atbk e) {
                atbk = e;
                obj = null;
            }
            a2.update("PaymentBundles", m75381a(a3, athj, a.f108658a), "bundle_id = ? AND account_id = ? AND environment = ?", m75392a(str, askf));
            a2.setTransactionSuccessful();
            if (atbk == null) {
                return obj;
            }
            throw atbk;
        } finally {
            a2.endTransaction();
        }
    }

    /* renamed from: a */
    public static final void m75389a(askf askf, String str, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bundle_state", "deleted");
        contentValues.putNull("bundle_info");
        contentValues.putNull("acknowledged_bundle");
        contentValues.putNull("bundle_handle");
        contentValues.putNull("encryption_parameters");
        m75390a(askf.f89123a, askf.f89125c, str, contentValues, sQLiteDatabase);
    }

    /* renamed from: a */
    public static void m75390a(String str, String str2, String str3, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.update("PaymentBundles", contentValues, "bundle_id = ? AND account_id = ? AND environment = ?", new String[]{str3, str, str2});
    }

    /* renamed from: a */
    public static final boolean m75391a(askf askf, String str, String[] strArr, String str2) {
        Cursor query;
        String str3;
        sdo.m34959a(strArr);
        SQLiteDatabase a = m75382a(askf.f89126d);
        a.beginTransaction();
        try {
            query = a.query("PaymentBundles", new String[]{"bundle_state"}, "bundle_id = ? AND account_id = ? AND environment = ?", new String[]{str, askf.f89123a, askf.f89125c}, null, null, null);
            if (query.moveToFirst()) {
                str3 = query.getString(0);
            } else {
                str3 = null;
            }
            if (query != null) {
                query.close();
            }
            if (Arrays.asList(strArr).contains(str3)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("bundle_state", str2);
                contentValues.put("bundle_info", (byte[]) null);
                m75390a(askf.f89123a, askf.f89125c, str, contentValues, a);
                a.setTransactionSuccessful();
                a.endTransaction();
                return true;
            }
            a.endTransaction();
            return false;
        } catch (Throwable th) {
            a.endTransaction();
            throw th;
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo49487a(Context context, String str) {
        return asjg.m74211a(context, str);
    }

    /* renamed from: a */
    public final void mo49779a(askf askf, StorageKey storageKey, StorageKey storageKey2) {
        Cursor query;
        Throwable th;
        askf askf2 = askf;
        StorageKey storageKey3 = storageKey;
        StorageKey storageKey4 = storageKey2;
        SQLiteDatabase a = m75382a(askf2.f89126d);
        a.beginTransaction();
        try {
            query = a.query("PaymentBundles", new String[]{"bundle_id"}, "environment= ? AND account_id= ? AND key_id= ?", new String[]{askf2.f89125c, askf2.f89123a, storageKey3.f108658a}, null, null, null);
            while (query.moveToNext()) {
                String string = query.getString(0);
                a.update("PaymentBundles", m75381a(m75383a(a, askf2, string, storageKey3), new athj(storageKey4), storageKey4.f108658a), "bundle_id = ? AND account_id = ? AND environment = ?", m75392a(string, askf2));
            }
            if (query != null) {
                query.close();
            }
            try {
                bnsl bnsl = (bnsl) f90004a.mo68390d();
                bnsl.mo68432a("atbm", "a", 232, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Successfully rotated keys");
                a.setTransactionSuccessful();
                return;
            } finally {
                a.endTransaction();
            }
        } catch (atdb e) {
            bnsl bnsl2 = (bnsl) f90004a.mo68388c();
            bnsl2.mo68432a("atbm", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("RotateKeys error");
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
