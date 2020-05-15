package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: auey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auey {

    /* renamed from: a */
    private static final audg f91619a = audg.m76790a("SpamListSync");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auey.a(android.content.Context, int, boolean):bqhz
     arg types: [android.content.Context, int, int]
     candidates:
      auey.a(aecc, audk, android.content.Context):int
      auey.a(aebz, java.lang.String, int):void
      auey.a(android.database.sqlite.SQLiteDatabase, boolean, int):void
      auey.a(android.database.sqlite.SQLiteDatabase, java.util.List, int):boolean
      auey.a(android.content.Context, int, boolean):bqhz */
    /* renamed from: a */
    public static int m76958a(aecc aecc, audk audk, Context context) {
        bqhz bqhz;
        boolean z;
        bqhv bqhv;
        bqhw bqhw;
        bqhw bqhw2;
        boolean z2;
        aecc aecc2 = aecc;
        Context context2 = context;
        f91619a.mo50422a("SpamListSyncChimeraService.syncSpamList called with tag: %s, extras: %s", aecc2.f63128a, aecc2.f63129b);
        int b = bqig.m112866b(aecc2.f63129b.getInt("SpamList Type", 0));
        if (b == 0) {
            b = 2;
        }
        if (b == 2 && audi.m76805d(context2, 1).isEmpty()) {
            f91619a.mo50423b("Call spam module disabled. Skipping spam list syncing.");
            return 0;
        } else if (b == 3 && audi.m76805d(context2, 2).isEmpty()) {
            f91619a.mo50423b("SMS spam module disabled. Skipping spam list syncing.");
            return 0;
        } else {
            new Object[1][0] = audi.m76798a(context).getAll();
            bxvd da = bolp.f133560h.mo74144da();
            long c = audi.m76804c(context2, audi.m76802b(b));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bolp bolp = (bolp) da.f164949b;
            bolp.f133562a |= 16;
            bolp.f133566e = c;
            long f = audi.m76807f(context2, b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bolp bolp2 = (bolp) da.f164949b;
            bolp2.f133562a |= 32;
            bolp2.f133567f = f;
            long currentTimeMillis = System.currentTimeMillis();
            Bundle bundle = aecc2.f63129b;
            if (bundle != null) {
                if (bundle.getInt("Force_Use_Complete_List", -1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bqhz = m76960a(context2, b, z2);
            } else {
                bqhz = m76960a(context2, 2, false);
            }
            try {
                ClientContext a = audk.m76813a(context);
                audl audl = audk.f91418a;
                if (audl.f91419b == null) {
                    audl.f91419b = chtv.m149566a(chtu.UNARY, "scooby.SpamProtectionService/GetSpamNumbers", ciie.m150370a(bqhz.f140751h), ciie.m150370a(bqia.f140760f));
                }
                bqia bqia = (bqia) audl.f91422a.mo25553a(audl.f91419b, a, bqhz, 10000, TimeUnit.MILLISECONDS);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bolp bolp3 = (bolp) da.f164949b;
                bolp3.f133562a |= 8;
                bolp3.f133565d = currentTimeMillis2;
                new Object[1][0] = bqia;
                if (bqia.f140764c != null) {
                    int i = aecc2.f63129b.getInt("Retries Param", audf.m76789a(cgyd.f188020a.mo6606a().mo84746w()));
                    bqif bqif = bqia.f140764c;
                    if (bqif == null) {
                        bqif = bqif.f140792c;
                    }
                    int i2 = 4;
                    if (bqif.f140794a != 3) {
                        audg audg = f91619a;
                        Object[] objArr = new Object[2];
                        bqif bqif2 = bqia.f140764c;
                        if (bqif2 == null) {
                            bqif2 = bqif.f140792c;
                        }
                        if (bqif2.f140794a == 4) {
                            bqhw = (bqhw) bqif2.f140795b;
                        } else {
                            bqhw = bqhw.f140731c;
                        }
                        objArr[0] = Integer.valueOf(bqhw.f140733a.size());
                        bqif bqif3 = bqia.f140764c;
                        if (bqif3 == null) {
                            bqif3 = bqif.f140792c;
                        }
                        if (bqif3.f140794a == 4) {
                            bqhw2 = (bqhw) bqif3.f140795b;
                        } else {
                            bqhw2 = bqhw.f140731c;
                        }
                        objArr[1] = Integer.valueOf(bqhw2.f140734b.size());
                        audg.mo50422a("Received response with diff list. Added: %d, Deleted : %d ", objArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bolp bolp4 = (bolp) da.f164949b;
                        bolp4.f133564c = 2;
                        bolp4.f133562a |= 2;
                        int b2 = bqig.m112866b(bqhz.f140759g);
                        if (b2 != 0 && b2 == 3) {
                            z = m76971b(context2, bqia, i, 2);
                        } else {
                            z = m76971b(context2, bqia, i, 1);
                        }
                    } else {
                        audg audg2 = f91619a;
                        Object[] objArr2 = new Object[1];
                        bqif bqif4 = bqia.f140764c;
                        if (bqif4 == null) {
                            bqif4 = bqif.f140792c;
                        }
                        if (bqif4.f140794a == 3) {
                            bqhv = (bqhv) bqif4.f140795b;
                        } else {
                            bqhv = bqhv.f140728b;
                        }
                        objArr2[0] = Integer.valueOf(bqhv.f140730a.size());
                        audg2.mo50422a("Received response with complete list of size: %d", objArr2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bolp bolp5 = (bolp) da.f164949b;
                        bolp5.f133564c = 1;
                        bolp5.f133562a |= 2;
                        int b3 = bqig.m112866b(bqhz.f140759g);
                        if (b3 != 0 && b3 == 3) {
                            z = m76967a(context2, bqia, i, 2);
                        } else {
                            z = m76967a(context2, bqia, i, 1);
                        }
                    }
                    long f2 = audi.m76807f(context2, b);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bolp bolp6 = (bolp) da.f164949b;
                    int i3 = bolp6.f133562a | 64;
                    bolp6.f133562a = i3;
                    bolp6.f133568g = f2;
                    if (z) {
                        i2 = 3;
                    }
                    bolp6.f133563b = i2 - 1;
                    bolp6.f133562a = i3 | 1;
                    audq.m76833a(context2, (bolp) da.mo74062i());
                    if (!z) {
                        f91619a.mo50425c("Failed to write to spamdb");
                        return 2;
                    }
                    f91619a.mo50423b("Spam numbers synced successfully.");
                    return 0;
                }
                audg audg3 = f91619a;
                if (Log.isLoggable("TelephonySpam", 5)) {
                    Log.w("TelephonySpam", String.valueOf(audg3.f91416a).concat("No spamlist in response"));
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bolp bolp7 = (bolp) da.f164949b;
                bolp7.f133563b = 3;
                bolp7.f133562a |= 1;
                audq.m76833a(context2, (bolp) da.mo74062i());
                return 2;
            } catch (chuw | gid e) {
                audg audg4 = f91619a;
                if (Log.isLoggable("TelephonySpam", 6)) {
                    Log.e("TelephonySpam", String.valueOf(audg4.f91416a).concat("Unable to fetch spam numbers"), e);
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bolp bolp8 = (bolp) da.f164949b;
                bolp8.f133563b = 3;
                bolp8.f133562a |= 1;
                audq.m76833a(context2, (bolp) da.mo74062i());
                return 2;
            }
        }
    }

    /* renamed from: b */
    public static void m76969b() {
        m76962a(aeat.m51532a(rpr.m34216b()));
    }

    /* renamed from: c */
    public static void m76972c() {
        m76970b(aeat.m51532a(rpr.m34216b()));
    }

    /* renamed from: b */
    private static void m76970b(aeat aeat) {
        f91619a.mo50423b("scheduleOneTimeTask");
        aeat.mo33984a(m76959a(new Bundle()).mo33974b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auey.a(android.database.sqlite.SQLiteDatabase, boolean, int):void
     arg types: [android.database.sqlite.SQLiteDatabase, int, int]
     candidates:
      auey.a(aecc, audk, android.content.Context):int
      auey.a(android.content.Context, int, boolean):bqhz
      auey.a(aebz, java.lang.String, int):void
      auey.a(android.database.sqlite.SQLiteDatabase, java.util.List, int):boolean
      auey.a(android.database.sqlite.SQLiteDatabase, boolean, int):void */
    /* renamed from: b */
    private static boolean m76971b(Context context, bqia bqia, int i, int i2) {
        bqhw bqhw;
        boolean z;
        String str;
        try {
            SQLiteDatabase writableDatabase = audj.m76808a(context).getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                bqif bqif = bqia.f140764c;
                if (bqif == null) {
                    bqif = bqif.f140792c;
                }
                if (bqif.f140794a == 4) {
                    bqhw = (bqhw) bqif.f140795b;
                } else {
                    bqhw = bqhw.f140731c;
                }
                if (m76968a(writableDatabase, bqhw.f140733a, i2)) {
                    bxwc<String> bxwc = bqhw.f140734b;
                    if (bxwc.size() != 0) {
                        if (i2 != 2) {
                            str = "server_spam_table";
                        } else {
                            str = "server_sms_spam_table";
                        }
                        for (String str2 : bxwc) {
                            if (writableDatabase.delete(str, "number = ?", new String[]{str2}) < 0) {
                                new Object[1][0] = str2;
                                z = false;
                                break;
                            }
                        }
                        f91619a.mo50422a("Successfully deleted %s numbers", Integer.valueOf(bxwc.size()));
                    }
                    if (audi.m76800a(context, bqia)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    m76966a(writableDatabase, true, i);
                } else {
                    writableDatabase.setTransactionSuccessful();
                }
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                return z;
            } catch (SQLiteConstraintException e) {
                m76966a(writableDatabase, true, i);
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                return false;
            } catch (SQLiteException e2) {
                m76966a(writableDatabase, false, i);
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                return false;
            } catch (Throwable th) {
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    private static aebi m76959a(Bundle bundle) {
        int i;
        aebi aebi = new aebi();
        if (cgyd.m147567j() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        m76964a(aebi, "telephonyspam.SpamListSyncOneOffTask", i, bundle);
        aebi.mo34004a(60L, 120L);
        return aebi;
    }

    /* renamed from: a */
    static bqhz m76960a(Context context, int i, boolean z) {
        long j;
        Set<String> set;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        bxvd da = bqhz.f140751h.mo74144da();
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        simCountryIso.getClass();
        ((bqhz) da.f164949b).f140753a = simCountryIso;
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        networkCountryIso.getClass();
        ((bqhz) da.f164949b).f140754b = networkCountryIso;
        if (i != 3) {
            j = cgyd.m147565h();
        } else {
            j = cgyd.m147566i();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqhz bqhz = (bqhz) da.f164949b;
        bqhz.f140755c = j;
        bqhz.f140759g = bqig.m112865a(i);
        if (!z && audi.m76806e(context, i)) {
            f91619a.mo50423b("Creating request for diff list");
            long f = audi.m76807f(context, i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqhz) da.f164949b).f140757e = f;
            long b = audi.m76803b(context, audi.m76802b(i));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqhz) da.f164949b).f140756d = b;
            if (audi.m76802b(i) == 2) {
                set = audi.m76798a(context).getStringSet("messages_blacklist_country_codes", bnon.f131923a);
            } else {
                set = audi.m76798a(context).getStringSet("calls_blacklist_country_codes", bnon.f131923a);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqhz bqhz2 = (bqhz) da.f164949b;
            if (!bqhz2.f140758f.mo73666a()) {
                bqhz2.f140758f = GeneratedMessageLite.m124021a(bqhz2.f140758f);
            }
            bxsy.m123078a(set, bqhz2.f140758f);
        }
        String valueOf = String.valueOf(da.mo74062i());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("Request: ");
        sb.append(valueOf);
        sb.toString();
        return (bqhz) da.mo74062i();
    }

    /* renamed from: a */
    public static void m76961a() {
        aeat a = aeat.m51532a(rpr.m34216b());
        f91619a.mo50423b("scheduleSyncTasks");
        m76962a(a);
        m76970b(a);
    }

    /* renamed from: a */
    private static void m76962a(aeat aeat) {
        f91619a.mo50423b("schedulePeriodicTask");
        if (cgyd.m147568k() > 0) {
            aebl aebl = new aebl();
            m76963a(aebl, "telephonyspam.SpamListSyncTask", 1);
            long k = cgyd.m147568k();
            if (cdny.m134353r()) {
                aebl.mo34009a(aebh.m51568a(k));
            } else {
                aebl.f63070a = k;
            }
            aeat.mo33984a(aebl.mo33974b());
        }
        if (cgyd.m147567j() > 0) {
            aebl aebl2 = new aebl();
            m76963a(aebl2, "telephonyspam.SpamListSyncLtePeriodicTask", 0);
            long j = cgyd.m147567j();
            if (cdny.m134353r()) {
                aebl2.mo34009a(aebh.m51568a(j));
            } else {
                aebl2.f63070a = j;
            }
            aeat.mo33984a(aebl2.mo33974b());
        }
    }

    /* renamed from: a */
    private static void m76963a(aebz aebz, String str, int i) {
        m76964a(aebz, str, i, new Bundle());
    }

    /* renamed from: a */
    private static void m76964a(aebz aebz, String str, int i, Bundle bundle) {
        bundle.putDouble("Action", 1.0d);
        boolean B = cgyd.f188020a.mo6606a().mo84721B();
        aebz.f63097i = "com.google.android.gms.telephonyspam.sync.SpamListSyncTaskService";
        aebz.f63099k = str;
        aebz.mo34028b(i, cdny.f181385a.mo6606a().mo78041l() | i ? 1 : 0);
        aebz.f63102n = true;
        aebz.mo34027b(1);
        aebz.mo34024a(B ? 1 : 0, cdny.f181385a.mo6606a().mo78036g() | B ? 1 : 0);
        aebz.f63107s = bundle;
    }

    /* renamed from: a */
    public static void m76965a(Context context) {
        if (audi.m76805d(context, 1).isEmpty()) {
            f91619a.mo50423b("Call spam module disabled. Skipping cleaning cache sip header table.");
            return;
        }
        audj.m76808a(context);
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(cgyd.f188020a.mo6606a().mo84723D());
        try {
            SQLiteDatabase writableDatabase = audj.f91417a.getWritableDatabase();
            writableDatabase.delete("sip_header_table", "timestamp < ?", new String[]{String.valueOf(currentTimeMillis)});
        } catch (SQLiteException e) {
        }
    }

    /* renamed from: a */
    private static void m76966a(SQLiteDatabase sQLiteDatabase, boolean z, int i) {
        if (i > 0) {
            sQLiteDatabase.endTransaction();
            f91619a.mo50423b("scheduleOneTimeTaskRetry");
            aeat a = aeat.m51532a(rpr.m34216b());
            Bundle bundle = new Bundle();
            bundle.putInt("Force_Use_Complete_List", z ? 1 : 0);
            bundle.putInt("Retries Param", i - 1);
            a.mo33984a(m76959a(bundle).mo33974b());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auey.a(android.database.sqlite.SQLiteDatabase, boolean, int):void
     arg types: [android.database.sqlite.SQLiteDatabase, int, int]
     candidates:
      auey.a(aecc, audk, android.content.Context):int
      auey.a(android.content.Context, int, boolean):bqhz
      auey.a(aebz, java.lang.String, int):void
      auey.a(android.database.sqlite.SQLiteDatabase, java.util.List, int):boolean
      auey.a(android.database.sqlite.SQLiteDatabase, boolean, int):void */
    /* renamed from: a */
    private static boolean m76967a(Context context, bqia bqia, int i, int i2) {
        String str;
        bqhv bqhv;
        try {
            SQLiteDatabase writableDatabase = audj.m76808a(context).getWritableDatabase();
            writableDatabase.beginTransaction();
            if (i2 != 2) {
                str = "server_spam_table";
            } else {
                str = "server_sms_spam_table";
            }
            try {
                writableDatabase.execSQL(str.length() == 0 ? new String("DELETE FROM ") : "DELETE FROM ".concat(str));
                bqif bqif = bqia.f140764c;
                if (bqif == null) {
                    bqif = bqif.f140792c;
                }
                if (bqif.f140794a == 3) {
                    bqhv = (bqhv) bqif.f140795b;
                } else {
                    bqhv = bqhv.f140728b;
                }
                if (!m76968a(writableDatabase, bqhv.f140730a, i2) || !audi.m76800a(context, bqia)) {
                    m76966a(writableDatabase, true, i);
                    if (writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                    return false;
                }
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                return true;
            } catch (SQLiteException e) {
                m76966a(writableDatabase, true, i);
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                return false;
            } catch (Throwable th) {
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m76968a(SQLiteDatabase sQLiteDatabase, List list, int i) {
        String str;
        String str2;
        if (!(list == null || list.size() == 0)) {
            ContentValues contentValues = new ContentValues();
            if (i != 2) {
                str = "server_spam_table";
            } else {
                str = "server_sms_spam_table";
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                String str3 = (String) list.get(i2);
                contentValues.clear();
                contentValues.put("number", str3);
                i2++;
                if (sQLiteDatabase.insert(str, null, contentValues) < 0) {
                    new Object[1][0] = str3;
                    return false;
                }
            }
            audg audg = f91619a;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(list.size());
            if (i != 2) {
                str2 = "CALLS";
            } else {
                str2 = "SMS";
            }
            objArr[1] = str2;
            audg.mo50422a("Successfully inserted %s numbers into %s table", objArr);
        }
        return true;
    }
}
