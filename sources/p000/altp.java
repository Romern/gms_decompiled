package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: altp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altp extends srp {

    /* renamed from: a */
    final /* synthetic */ altq f74240a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public altp(altq altq, Context context, String str, String str2) {
        super(context, str, str2, 1900);
        this.f74240a = altq;
    }

    /* renamed from: a */
    public static final void m61798a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (str2 != null) {
            sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1 WHERE tbl=? AND idx=?", new String[]{str, str2});
        } else {
            sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1 WHERE tbl=? AND idx IS NULL", new String[]{str});
        }
        sQLiteDatabase.execSQL("INSERT INTO sqlite_stat1 (tbl,idx,stat) VALUES (?,?,?)", new String[]{str, str2, str3});
    }

    /* renamed from: d */
    public static final void m61800d(SQLiteDatabase sQLiteDatabase) {
        bnre i = altg.m61757c().entrySet().mo67639g().mo67670d().listIterator();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            String format = String.format("DROP VIEW IF EXISTS %s;", (String) entry.getKey());
            entry.getKey();
            sQLiteDatabase.execSQL(format);
            entry.getKey();
        }
        bnrd a = altg.m61757c().entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a.next();
            entry2.getKey();
            entry2.getValue();
            sQLiteDatabase.execSQL((String) entry2.getValue());
            entry2.getKey();
        }
    }

    /* renamed from: e */
    public static final void m61801e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1");
            m61798a(sQLiteDatabase, "people", "sqlite_autoindex_people_1", "500 250 1");
            m61798a(sQLiteDatabase, "owners", null, "3");
            m61798a(sQLiteDatabase, "owner_sync_requests", "sqlite_autoindex_owner_sync_requests_1", "3 1 1");
            m61798a(sQLiteDatabase, "sync_tokens", "sqlite_autoindex_sync_tokens_1", "15");
            m61798a(sQLiteDatabase, "circle_members", "sqlite_autoindex_circle_members_1", "1000 300 2 1");
            m61798a(sQLiteDatabase, "circles", "sqlite_autoindex_circles_1", "20 10 1");
            m61798a(sQLiteDatabase, "search_index", "search_value", "1500 3");
            m61798a(sQLiteDatabase, "search_index", "search_person_id_index", "1500 3");
            m61798a(sQLiteDatabase, "emails", "email_person", "500 150 1");
            m61798a(sQLiteDatabase, "phones", "phone_person", "500 150 1");
            m61798a(sQLiteDatabase, "postal_address", "postal_address_person", "500 150 1");
            m61798a(sQLiteDatabase, "owner_emails", null, "6");
            m61798a(sQLiteDatabase, "owner_phones", null, "6");
            m61798a(sQLiteDatabase, "owner_postal_address", null, "6");
            m61798a(sQLiteDatabase, "properties", null, "10");
            m61798a(sQLiteDatabase, "gaia_id_map", "sqlite_autoindex_gaia_id_map_1", "500 200 2 1");
            m61798a(sQLiteDatabase, "ac_people", "sqlite_autoindex_ac_people_1", "500 250 1");
            m61798a(sQLiteDatabase, "ac_people", "ac_people_v2_id", "500 250 1");
            m61798a(sQLiteDatabase, "ac_container", "ac_item_container_person_id", "1000 2");
            m61798a(sQLiteDatabase, "ac_item", "ac_item_container", "2000 2");
            m61798a(sQLiteDatabase, "ac_index", "ac_index_1", "8000 2000 2 2");
            m61798a(sQLiteDatabase, "ac_index", "ac_index_item_id", "8000 4");
            m61798a(sQLiteDatabase, "applications", "sqlite_autoindex_applications_1", "1 1 1");
            m61798a(sQLiteDatabase, "application_packages", null, "1");
            m61798a(sQLiteDatabase, "facl_people", "sqlite_autoindex_facl_people_1", "50 50 50 1");
            m61798a(sQLiteDatabase, "temp_gaia_ordinal", null, "3");
            sQLiteDatabase.execSQL("ANALYZE sqlite_master;");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            Log.e("PeopleDatabaseHelper", "Could not update index stats", e);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: f */
    public static final void m61802f(SQLiteDatabase sQLiteDatabase) {
        bnrd a = altg.m61755a().entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            entry.getKey();
            entry.getValue();
            sQLiteDatabase.execSQL((String) entry.getValue());
            entry.getKey();
        }
        bnrd a2 = altg.m61756b().entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) a2.next();
            entry2.getKey();
            entry2.getValue();
            sQLiteDatabase.execSQL((String) entry2.getValue());
            entry2.getKey();
        }
        m61800d(sQLiteDatabase);
        sQLiteDatabase.execSQL("ANALYZE;");
        m61801e(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        amig.m62939a();
        if (!sQLiteDatabase.isReadOnly() && !((Boolean) amgl.f74888a.mo41191a()).booleanValue()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (p000.sre.m36084d(r0.f74246b) != false) goto L_0x0083;
     */
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        amig.m62939a();
        if (((Boolean) amgl.f74888a.mo41191a()).booleanValue()) {
            if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83295aY()).booleanValue() || sQLiteDatabase.isReadOnly()) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(false);
            } else {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
        }
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83346bW()).booleanValue()) {
            if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83438di()).booleanValue()) {
                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83253J()).booleanValue()) {
                    altq altq = this.f74240a;
                    ancd ancd = altq.f74241a;
                }
                sQLiteDatabase.enableWriteAheadLogging();
            }
            sQLiteDatabase.disableWriteAheadLogging();
        }
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83375bz()).booleanValue()) {
            almk.m61263a();
            boolean isWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
            bxvd da = ammb.f75247o.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammb ammb = (ammb) da.f164949b;
            ammb.f75249a |= 2;
            ammb.f75251c = isWriteAheadLoggingEnabled;
            ammb ammb2 = (ammb) da.mo74062i();
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            ammb2.getClass();
            amoh.f75607m = ammb2;
            amoh.f75595a |= 1024;
            alml.m61288a(null, da2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(boolean, boolean):android.os.Bundle
     arg types: [int, int]
     candidates:
      amea.a(java.lang.String, long):java.util.List
      amea.a(android.accounts.Account, java.lang.String):void
      amea.a(java.lang.String, java.lang.String):void
      amea.a(boolean, boolean):android.os.Bundle */
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (stu.m36321g() != -1) {
            almk.m61263a();
            bxvd da = bpwg.f139467r.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwg bpwg = (bpwg) da.f164949b;
            bpwg.f139469a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            bpwg.f139485q = true;
            bpwg bpwg2 = (bpwg) da.mo74062i();
            bxvd da2 = bpwi.f139493h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpwi bpwi = (bpwi) da2.f164949b;
            bpwg2.getClass();
            bpwi.f139498d = bpwg2;
            bpwi.f139495a |= 4;
            alml.m61287a((bpwi) da2.mo74062i());
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("Downgrading from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        String sb2 = sb.toString();
        altq altq = this.f74240a;
        ancd ancd = altq.f74241a;
        aluj.m61898a(altq.f74246b, "PeopleDatabaseHelper", sb2);
        Log.w("PeopleDatabaseHelper", sb2);
        this.f74240a.mo40773f(sQLiteDatabase);
        if (cgay.m144130c()) {
            Context context = this.f74240a.f74246b;
            sQLiteDatabase.execSQL("DELETE FROM sync_tokens;");
            amea a = amea.m62724a(context);
            aluj.m61904b(a.f74784a, "PeopleSync", "requestAllFullSyncForDbUpgradeWithLogging");
            bnrd a2 = a.f74786c.mo41680d(a.f74784a).iterator();
            while (a2.hasNext()) {
                Bundle a3 = amea.m62725a(false, false);
                a3.putBoolean("db_downgrade", true);
                amea.m62728a((Account) a2.next(), "com.google.android.gms.people", a3);
            }
            return;
        }
        altq.m61807a(this.f74240a.f74246b, sQLiteDatabase);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(boolean, boolean):android.os.Bundle
     arg types: [int, int]
     candidates:
      amea.a(java.lang.String, long):java.util.List
      amea.a(android.accounts.Account, java.lang.String):void
      amea.a(java.lang.String, java.lang.String):void
      amea.a(boolean, boolean):android.os.Bundle */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x09bc A[Catch:{ SQLException -> 0x0926 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x09c1 A[Catch:{ SQLException -> 0x0926 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x09c4 A[Catch:{ SQLException -> 0x0926 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x09d5  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x09f4  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0a45  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        altp altp;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        boolean z3;
        String str5;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        try {
            amdk.m62655a("PeopleDatabaseHelper", "Upgrading from version %d to %d", i3, i2);
            if (i3 < 32) {
                m61799c(sQLiteDatabase);
                m61802f(sQLiteDatabase);
                atomicBoolean3.set(true);
                i3 = 32;
                z = true;
            } else {
                z = false;
            }
            if (i3 < 33) {
                atomicBoolean3.set(true);
                i3 = 33;
            }
            if (i3 < 34) {
                ancd ancd = altq.f74241a;
                sQLiteDatabase2.execSQL("UPDATE owners SET gaia_id=(SELECT gaia_id FROM owners AS i WHERE owners.account_name = i.account_name ) WHERE page_gaia_id IS NOT NULL");
                i3 = 34;
            }
            String str6 = "_id";
            if (i3 < 35) {
                sQLiteDatabase2.execSQL(alth.m61758a("gaia_id_map"));
                sQLiteDatabase2.execSQL(alth.m61761a("gaia_id_map", "owner_id INTEGER NOT NULL", "contact_id TEXT NOT NULL", "value TEXT NOT NULL", "gaia_id TEXT NOT NULL", alth.m61763a("owner_id", "contact_id", "value"), alth.m61759a("owner_id", "owners", str6)));
                atomicBoolean3.set(true);
                i3 = 35;
                z = true;
            }
            if (i3 < 36) {
                ancd ancd2 = altq.f74241a;
                altq.m61810a(sQLiteDatabase2, alth.m61767c("application_packages", "facl_applications", "facl_circles"));
                sQLiteDatabase2.execSQL(alth.m61761a("application_packages", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "dev_console_id TEXT NOT NULL", "package_name TEXT NOT NULL", "certificate_hash TEXT NOT NULL", alth.m61763a("package_name")));
                String[] strArr = new String[6];
                strArr[0] = "_id INTEGER PRIMARY KEY AUTOINCREMENT";
                strArr[1] = "owner_id INTEGER NOT NULL";
                strArr[2] = "dev_console_id TEXT NOT NULL";
                strArr[3] = "qualified_id TEXT NOT NULL";
                strArr[4] = alth.m61763a("owner_id", "dev_console_id", "qualified_id");
                atomicBoolean2 = atomicBoolean3;
                try {
                    strArr[5] = alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 0);
                    sQLiteDatabase2.execSQL(alth.m61761a("facl_people", strArr));
                    sQLiteDatabase2.execSQL(alth.m61761a("facl_applications", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "everyone INTEGER NOT NULL", alth.m61763a("owner_id", "dev_console_id"), alth.m61759a("owner_id", "owners", str6)));
                    i3 = 36;
                    z = true;
                } catch (SQLException e) {
                    e = e;
                    altp = this;
                    SQLException sQLException = e;
                    if (!rfy.m33543a()) {
                    }
                }
            } else {
                atomicBoolean2 = atomicBoolean3;
            }
            if (i3 < 37) {
                ancd ancd3 = altq.f74241a;
                altq.m61810a(sQLiteDatabase2, alth.m61767c("applications", "application_packages", "facl_applications", "facl_people"));
                sQLiteDatabase2.execSQL(alth.m61761a("applications", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", alth.m61763a("owner_id", "dev_console_id"), alth.m61759a("owner_id", "owners", str6)));
                sQLiteDatabase2.execSQL(alth.m61761a("application_packages", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "package_name TEXT NOT NULL", "certificate_hash TEXT NOT NULL", alth.m61762a(bngx.m109357a("owner_id", "dev_console_id"), "applications", bngx.m109357a("owner_id", "dev_console_id"), 1)));
                sQLiteDatabase2.execSQL(alth.m61761a("facl_people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "qualified_id TEXT NOT NULL", alth.m61766b("owner_id", "dev_console_id", "qualified_id"), alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1), alth.m61762a(bngx.m109357a("owner_id", "dev_console_id"), "applications", bngx.m109357a("owner_id", "dev_console_id"), 1)));
                i3 = 37;
                z = true;
            }
            if (i3 < 38) {
                ancd ancd4 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN invisible_3p INTEGER NOT NULL DEFAULT 0;");
                i3 = 38;
            }
            if (i3 < 39) {
                altq.m61808a(sQLiteDatabase);
                i3 = 39;
            }
            if (i3 < 40) {
                ancd ancd5 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN is_dasher INTEGER NOT NULL DEFAULT 0;");
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN dasher_domain TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN in_viewer_domain INTEGER NOT NULL DEFAULT 0;");
                i3 = 40;
            }
            if (i3 < 41) {
                sQLiteDatabase2.execSQL(alth.m61758a("postal_address"));
                z2 = z;
                str = "owners";
                sQLiteDatabase2.execSQL(alth.m61761a("postal_address", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "postal_address TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1)));
                sQLiteDatabase2.execSQL(alth.m61765b("postal_address_person", "postal_address", "owner_id", "qualified_id"));
                i3 = 41;
            } else {
                z2 = z;
                str = "owners";
            }
            if (i3 < 42) {
                altq.m61808a(sQLiteDatabase);
                i3 = 42;
            }
            if (i3 < 44) {
                try {
                    altq altq = this.f74240a;
                    ancd ancd6 = altq.f74241a;
                    Context context = altq.f74246b;
                    aluj.m61904b(context, "PeopleDatabaseHelper", "Fixing sync");
                    bnrd a = altq.f74242h.mo41680d(context).iterator();
                    while (a.hasNext()) {
                        Account account = (Account) a.next();
                        int a2 = altq.m61805a(sQLiteDatabase2, account.name);
                        boolean syncAutomatically = ContentResolver.getSyncAutomatically(account, "com.android.contacts");
                        boolean syncAutomatically2 = ContentResolver.getSyncAutomatically(account, "com.google.android.gms.people");
                        bnrd bnrd = a;
                        String str7 = str6;
                        aluj.m61897a(context, "PeopleDatabaseHelper", account, String.format(Locale.US, "Last status=%d  people sync=%s  focus sync=%s", Integer.valueOf(a2), Boolean.valueOf(syncAutomatically2), Boolean.valueOf(syncAutomatically)));
                        if (cgbe.f186279a.mo6606a().mo83423cu()) {
                            if (a2 == 3 && syncAutomatically2) {
                                aluj.m61897a(context, "PeopleDatabaseHelper", account, "Last=failure");
                                ContentResolver.requestSync(account, "com.google.android.gms.people", amea.m62725a(false, false));
                            }
                        }
                        if (!cgbe.f186279a.mo6606a().mo83424cv() || !syncAutomatically || syncAutomatically2) {
                            a = bnrd;
                            str6 = str7;
                        } else {
                            aluj.m61897a(context, "PeopleDatabaseHelper", account, "Re-enabling");
                            ContentResolver.setSyncAutomatically(account, "com.google.android.gms.people", true);
                            a = bnrd;
                            str6 = str7;
                        }
                    }
                    str2 = str6;
                    i3 = 44;
                } catch (SQLException e2) {
                    e = e2;
                    altp = this;
                    SQLException sQLException2 = e;
                    if (!rfy.m33543a()) {
                    }
                }
            } else {
                str2 = str6;
            }
            if (i3 < 45) {
                ancd ancd7 = altq.f74241a;
                sQLiteDatabase2.execSQL("DELETE FROM people WHERE name IS NULL;");
                i3 = 45;
            }
            if (i3 < 46) {
                ancd ancd8 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN name_verified INTEGER NOT NULL DEFAULT 0;");
                i3 = 46;
            }
            if (i3 < 47) {
                altq.m61808a(sQLiteDatabase);
                i3 = 47;
            }
            if (i3 < 100) {
                ancd ancd9 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN etag TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN in_circle INTEGER NOT NULL DEFAULT 0;");
                sQLiteDatabase2.execSQL("UPDATE people SET in_circle=1;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN in_contacts INTEGER NOT NULL DEFAULT 0;");
                str4 = str;
                str3 = str2;
                sQLiteDatabase2.execSQL(alth.m61761a("owner_emails", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "email TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61759a("owner_id", str4, str3)));
                sQLiteDatabase2.execSQL(alth.m61761a("owner_phones", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "phone TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61759a("owner_id", str4, str3)));
                sQLiteDatabase2.execSQL(alth.m61761a("owner_postal_address", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "postal_address TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61759a("owner_id", str4, str3)));
                i3 = 100;
                z2 = true;
            } else {
                str4 = str;
                str3 = str2;
            }
            if (i3 < 101) {
                ancd ancd10 = altq.f74241a;
                sQLiteDatabase2.execSQL(alth.m61761a("owner_sync_requests", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "account_name TEXT NOT NULL", "page_gaia_id TEXT", "sync_requested_time INTEGER NOT NULL DEFAULT 0", alth.m61763a("account_name", "page_gaia_id")));
                i3 = 101;
                z2 = true;
            }
            if (i3 < 102) {
                ancd ancd11 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN sync_circles_to_contacts INTEGER NOT NULL DEFAULT 0;");
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN sync_evergreen_to_contacts INTEGER NOT NULL DEFAULT 0;");
                i3 = 102;
            }
            if (i3 < 103) {
                ancd ancd12 = altq.f74241a;
                sQLiteDatabase2.execSQL("DELETE from people WHERE in_circle=0 AND in_contacts=0;");
                i3 = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            }
            if (i3 < 104) {
                i3 = ErrorInfo.TYPE_SDU_FAILED;
            }
            if (i3 < 105) {
                ancd ancd13 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE gaia_id_map ADD COLUMN type INTEGER;");
                sQLiteDatabase2.execSQL("UPDATE gaia_id_map SET type = (CASE WHEN value LIKE '%@%' then 1 ELSE 2 END);");
                sQLiteDatabase2.execSQL(alth.m61761a("new_table", "owner_id INTEGER NOT NULL", "contact_id TEXT NOT NULL", "value TEXT NOT NULL", "gaia_id TEXT NOT NULL", "type INTEGER NOT NULL", alth.m61763a("owner_id", "contact_id", "value"), alth.m61759a("owner_id", str4, str3)));
                sQLiteDatabase2.execSQL("INSERT INTO new_table SELECT * FROM gaia_id_map;");
                sQLiteDatabase2.execSQL("DROP TABLE gaia_id_map;");
                sQLiteDatabase2.execSQL("ALTER TABLE new_table RENAME TO gaia_id_map;");
                sQLiteDatabase2.execSQL("DELETE FROM sync_tokens WHERE name = 'gaiamap';");
                i3 = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                z2 = true;
            }
            if (i3 < 106) {
                altq.m61808a(sQLiteDatabase);
                i3 = 106;
            }
            if (i3 < 107) {
                ancd ancd14 = altq.f74241a;
                sQLiteDatabase2.execSQL("DELETE FROM owners WHERE account_name='';");
                i3 = 107;
            }
            if (i3 < 108) {
                altq.m61815b(sQLiteDatabase);
                i3 = 108;
            }
            if (i3 < 200) {
                altq.m61816c(sQLiteDatabase);
                i3 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
            }
            if (i3 < 201) {
                altq.m61817d(sQLiteDatabase);
                i3 = ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
            }
            if (i3 < 202) {
                ancd ancd15 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN affinity1 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN affinity2 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN affinity3 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN affinity4 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN affinity5 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN people_in_common TEXT;");
                i3 = 202;
            }
            if (i3 >= 411) {
                z3 = false;
            } else {
                ancd ancd16 = altq.f74241a;
                altq.m61810a(sQLiteDatabase2, alth.m61767c("ac_item_container_person_id", "ac_item_container", "ac_index_1", "ac_index_item_id", "ac_index", "ac_item", "ac_container", "ac_people"));
                sQLiteDatabase2.execSQL(alth.m61761a("ac_people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "people_v2_id TEXT NOT NULL", "qualified_id TEXT", "sync_is_alive INTEGER NOT NULL DEFAULT 0", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", alth.m61763a("owner_id", "people_v2_id"), alth.m61759a("owner_id", str4, str3)));
                sQLiteDatabase2.execSQL(alth.m61761a("ac_container", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "people_id INTEGER NOT NULL", "container_type INTEGER NOT NULL", "profile_type INTEGER NOT NULL", "gaia_id TEXT", "contact_id TEXT", "compressed_avatar_url TEXT", "has_avatar INTEGER NOT NULL DEFAULT 0", "in_circle INTEGER NOT NULL DEFAULT 0", "in_viewer_domain INTEGER NOT NULL DEFAULT 0", "display_name TEXT", "formatted_name TEXT", "given_name TEXT", "family_name TEXT", "middle_name TEXT", "honorific_prefix TEXT", "honorific_suffix TEXT", "yomi_given_name TEXT", "yomi_family_name TEXT", "yomi_honorific_prefix TEXT", "yomi_honorific_suffix TEXT", "nickname TEXT", alth.m61759a("people_id", "ac_people", str3)));
                sQLiteDatabase2.execSQL(alth.m61761a("ac_item", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "container_id INTEGER NOT NULL", "item_type INTEGER NOT NULL", "is_edge_key INTEGER", "value TEXT NOT NULL", "value2 TEXT", "value_type INTEGER", "custom_label TEXT", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", alth.m61759a("container_id", "ac_container", str3)));
                sQLiteDatabase2.execSQL(alth.m61761a("ac_index", "item_id INTEGER NOT NULL", "owner_id INTEGER NOT NULL", "is_normalized INTEGER NOT NULL", "kind INTEGER NOT NULL", "value TEXT NOT NULL COLLATE NOCASE", alth.m61759a("owner_id", str4, str3), alth.m61759a("item_id", "ac_item", str3)));
                sQLiteDatabase2.execSQL(alth.m61760a("ac_index_1", "ac_index", "owner_id", "value", "kind"));
                sQLiteDatabase2.execSQL(alth.m61760a("ac_index_item_id", "ac_index", "item_id"));
                sQLiteDatabase2.execSQL(alth.m61760a("ac_item_container", "ac_item", "container_id"));
                sQLiteDatabase2.execSQL(alth.m61760a("ac_item_container_person_id", "ac_container", "people_id"));
                sQLiteDatabase2.execSQL(alth.m61765b("ac_people_v2_id", "ac_people", "owner_id", "people_v2_id"));
                altq.m61808a(sQLiteDatabase);
                i3 = 411;
                z3 = true;
                z2 = true;
            }
            if (i3 < 412) {
                sQLiteDatabase2.execSQL(alth.m61758a("temp_gaia_ordinal"));
                sQLiteDatabase2.execSQL(alth.m61761a("temp_gaia_ordinal", "ordinal INTEGER NOT NULL", "gaia_id TEXT NOT NULL"));
                i3 = 412;
            }
            if (i3 < 413) {
                sQLiteDatabase2.execSQL(alth.m61758a("temp_gaia_ordinal"));
                sQLiteDatabase2.execSQL(alth.m61761a("temp_gaia_ordinal", "ordinal INTEGER NOT NULL", "qualified_id TEXT NOT NULL"));
                i3 = 413;
                z2 = true;
            }
            if (i3 < 414) {
                ancd ancd17 = altq.f74241a;
                sQLiteDatabase2.execSQL("DELETE FROM sync_tokens WHERE name = 'me';");
                i3 = 414;
            }
            if (i3 < 415) {
                sQLiteDatabase2.execSQL(alth.m61758a("temp_gaia_ordinal"));
                sQLiteDatabase2.execSQL(alth.m61761a("temp_gaia_ordinal", "ordinal INTEGER NOT NULL", "gaia_id TEXT NULL", "qualified_id TEXT NOT NULL"));
                i3 = 415;
                z2 = true;
            }
            if (i3 < 501) {
                ancd ancd18 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN sync_is_alive INTEGER NOT NULL DEFAULT 0;");
                i3 = 501;
                z2 = true;
            }
            if (i3 < 600) {
                ancd ancd19 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN logging_id TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN affinity1 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN affinity2 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN affinity3 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN affinity4 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN affinity5 REAL;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN logging_id TEXT;");
                i3 = 600;
            }
            if (i3 < 601) {
                ancd ancd20 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN logging_id TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_people ADD COLUMN logging_id TEXT;");
                i3 = 601;
            }
            if (i3 < 602) {
                ancd ancd21 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN logging_id2 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN logging_id3 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN logging_id4 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN logging_id5 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN logging_id2 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN logging_id3 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN logging_id4 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE emails ADD COLUMN logging_id5 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_people ADD COLUMN logging_id2 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_people ADD COLUMN logging_id3 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_people ADD COLUMN logging_id4 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_people ADD COLUMN logging_id5 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN logging_id2 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN logging_id3 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN logging_id4 TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN logging_id5 TEXT;");
                i3 = 602;
            }
            if (i3 < 603) {
                ancd ancd22 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN mobile_owner_id TEXT;");
                i3 = 603;
            }
            if (i3 < 604) {
                altq.m61808a(sQLiteDatabase);
                i3 = 604;
            }
            if (i3 < 700) {
                altq.m61808a(sQLiteDatabase);
                i3 = 700;
            }
            if (i3 < 1400) {
                ancd ancd23 = altq.f74241a;
                i3 = 1400;
            }
            if (i3 < 1401) {
                altp = this;
                try {
                    altq altq2 = altp.f74240a;
                    ancd ancd24 = altq.f74241a;
                    Context context2 = altq2.f74246b;
                    sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN is_active_plus_account  INTEGER NOT NULL DEFAULT 0;");
                    bnrd a3 = altq.f74242h.mo41680d(context2).iterator();
                    while (a3.hasNext()) {
                        Account account2 = (Account) a3.next();
                        String[] strArr2 = new String[2];
                        if (!altq.f74241a.mo41687a(context2, account2)) {
                            str5 = "0";
                        } else {
                            str5 = "1";
                        }
                        strArr2[0] = str5;
                        strArr2[1] = account2.name;
                        sQLiteDatabase2.execSQL("UPDATE owners SET is_active_plus_account=? WHERE account_name=?;", strArr2);
                    }
                    i3 = 1401;
                } catch (SQLException e3) {
                    e = e3;
                    SQLException sQLException22 = e;
                    if (!rfy.m33543a()) {
                        Log.e("PeopleDatabaseHelper", "Upgrade failed. Re-creating the database.", sQLException22);
                        altq altq3 = altp.f74240a;
                        ancd ancd25 = altq.f74241a;
                        aluj.m61903a(altq3.f74246b, "PeopleDatabaseHelper", "Upgrade failed. Re-creating the database.", sQLException22);
                        altp.f74240a.mo40773f(sQLiteDatabase2);
                        atomicBoolean = atomicBoolean2;
                        atomicBoolean.set(true);
                        if (!atomicBoolean.get()) {
                        }
                    } else {
                        throw sQLException22;
                    }
                }
            } else {
                altp = this;
            }
            if (i3 < 1402) {
                ancd ancd26 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE ac_people ADD COLUMN last_update_time  INTEGER NOT NULL DEFAULT 0;");
                i3 = 1402;
            }
            if (i3 < 1403) {
                ancd ancd27 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN name_visibility TEXT DEFAULT 'public';");
                sQLiteDatabase2.execSQL("ALTER TABLE people ADD COLUMN avatar_visibility TEXT DEFAULT 'public';");
                i3 = 1403;
            }
            if (i3 < 1404) {
                ancd ancd28 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN sync_me_to_contacts INTEGER NOT NULL DEFAULT 0");
                i3 = 1404;
            }
            if (i3 < 1405) {
                ancd ancd29 = altq.f74241a;
                sQLiteDatabase2.execSQL("UPDATE people SET name_visibility='public';");
                sQLiteDatabase2.execSQL("UPDATE people SET avatar_visibility='public';");
                i3 = 1405;
            }
            if (i3 < 1500) {
                ancd ancd30 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN certificate_expiration_millis INTEGER NOT NULL DEFAULT 0;");
                sQLiteDatabase2.execSQL("ALTER TABLE ac_item ADD COLUMN certificate_status TEXT;");
                i3 = 1500;
            }
            if (i3 < 1501) {
                ancd ancd31 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN given_name TEXT;");
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN family_name TEXT;");
                i3 = 1501;
            }
            if (i3 < 1600) {
                ancd ancd32 = altq.f74241a;
                sQLiteDatabase2.execSQL("ALTER TABLE owners ADD COLUMN contacts_backup_and_sync INTEGER NOT NULL DEFAULT 0");
                i3 = 1600;
            }
            if (i3 < 1700) {
                m61800d(sQLiteDatabase);
                i3 = 1700;
            }
            if (i3 >= 1800) {
                if (i3 < 1900) {
                }
                if (z2) {
                    m61801e(sQLiteDatabase);
                }
                if (z3) {
                    atomicBoolean = atomicBoolean2;
                } else {
                    altq.m61818e(sQLiteDatabase);
                    atomicBoolean = atomicBoolean2;
                }
                if (!atomicBoolean.get()) {
                    return;
                }
                if (cgay.m144131d()) {
                    altq altq4 = altp.f74240a;
                    ancd ancd33 = altq.f74241a;
                    Context context3 = altq4.f74246b;
                    sQLiteDatabase2.execSQL("DELETE FROM sync_tokens;");
                    amea a4 = amea.m62724a(context3);
                    aluj.m61904b(a4.f74784a, "PeopleSync", "requestAllFullSyncForDbUpgradeWithLogging");
                    bnrd a5 = a4.f74786c.mo41680d(a4.f74784a).iterator();
                    while (a5.hasNext()) {
                        Bundle a6 = amea.m62725a(false, false);
                        a6.putBoolean("db_upgrade", true);
                        amea.m62728a((Account) a5.next(), "com.google.android.gms.people", a6);
                    }
                    return;
                }
                altq altq5 = altp.f74240a;
                ancd ancd34 = altq.f74241a;
                altq.m61807a(altq5.f74246b, sQLiteDatabase2);
                return;
            }
            m61800d(sQLiteDatabase);
            m61800d(sQLiteDatabase);
            if (z2) {
            }
            if (z3) {
            }
        } catch (SQLException e4) {
            e = e4;
            atomicBoolean2 = atomicBoolean3;
            altp = this;
            SQLException sQLException222 = e;
            if (!rfy.m33543a()) {
            }
        }
        if (!atomicBoolean.get()) {
        }
    }

    /* renamed from: c */
    public static final void m61799c(SQLiteDatabase sQLiteDatabase) {
        Log.w("PeopleDatabaseHelper", "Wiping the database...");
        altq.m61810a(sQLiteDatabase, alth.m61767c("temp_gaia_ordinal", "ac_index", "ac_item", "ac_container", "ac_people", "owner_emails", "owner_phones", "owner_postal_address", "owner_sync_requests", "applications", "application_packages", "facl_application", "facl_applications", "facl_circles", "facl_people", "owners", "search_index", "emails", "phones", "postal_address", "circle_members", "circles", "people", "sync_tokens", "properties", "email_gaia_map", "gaia_id_map"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        m61802f(sQLiteDatabase);
        altq.m61811a(sQLiteDatabase, Locale.getDefault());
    }
}
