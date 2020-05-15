package com.google.android.gms.people.service;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeletedNullContactsCleanupChimeraService extends aeah {
    /* renamed from: a */
    private static long m68178a(boolean z) {
        if (!z) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public static void m68181b(Context context) {
        if (cgbo.m144208f()) {
            alsj a = alsj.m61651a(context);
            long d = cgbo.m144206d();
            boolean h = cgbo.m144210h();
            boolean i = cgbo.m144211i();
            boolean g = cgbo.m144209g();
            boolean j = cgbo.m144212j();
            long e = cgbo.m144207e();
            if (!a.f74200a.getBoolean("deleted_null_contacts_cleanup_enabled", false) || a.f74200a.getLong("deleted_null_contacts_cleanup_periodic_interval_seconds", 0) != d || a.f74200a.getBoolean("deleted_null_contacts_cleanup_requires_charging", false) != h || a.f74200a.getBoolean("deleted_null_contacts_cleanup_requires_device_idle", false) != i || a.f74200a.getBoolean("deleted_null_contacts_cleanup_persisted", false) != g || a.f74200a.getBoolean("deleted_null_contacts_cleanup_use_flex", false) != j || (j && a.f74200a.getLong("deleted_null_contacts_cleanup_flex_seconds", 0) != e)) {
                Log.i("DeletedNullContactsCleanup", "Flags changed. Will re-scheduling the service.");
                m68179a(context);
                return;
            }
            return;
        }
        m68183c(context);
    }

    /* renamed from: c */
    private final int m68182c() {
        int i;
        Cursor query = getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
        if (query != null) {
            try {
                i = query.getCount();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            i = -1;
        }
        if (query != null) {
            query.close();
        }
        return i;
        throw th;
    }

    /* renamed from: a */
    public static void m68179a(Context context) {
        Log.i("DeletedNullContactsCleanup", "Scheduling the service.");
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
        aebl.f63099k = "DeletedNullContactsCleanupPeriodicTask";
        int i = 2;
        aebl.mo34023a(2);
        aebl.mo34024a(cgbo.m144210h() ? 1 : 0, (cdny.m134338c() || cgbo.m144210h()) ? 1 : 0);
        aebl.mo34026a(cgbo.m144211i());
        aebl.mo34027b(1);
        aebl.f63102n = cgbo.m144209g();
        long d = cgbo.m144206d();
        if (cdny.m134350o()) {
            aebl.mo34009a(aebh.m51568a(d));
        } else {
            aebl.f63070a = d;
        }
        if (cgbo.m144212j()) {
            aebl.f63071b = cgbo.m144207e();
        }
        alsj.m61651a(context).mo40684a(cgbo.m144208f(), cgbo.m144206d(), cgbo.m144210h(), cgbo.m144211i(), cgbo.m144209g(), cgbo.m144212j(), cgbo.m144207e());
        try {
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
        } catch (IllegalArgumentException e) {
            Log.e("DeletedNullContactsCleanup", "Error when scheduling the periodic task.", e);
            i = 8;
        }
        almk a = almk.m61263a();
        bxvd da = amkz.f75139f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkz amkz = (amkz) da.f164949b;
        amkz.f75142b = i - 1;
        int i2 = amkz.f75141a | 1;
        amkz.f75141a = i2;
        amkz.f75145e = 1;
        amkz.f75141a = i2 | 32;
        a.mo40517a((amkz) da.mo74062i());
    }

    /* renamed from: c */
    public static void m68183c(Context context) {
        int i;
        Log.i("DeletedNullContactsCleanup", "Canceling the service.");
        alsj.m61651a(context).mo40684a(cgbo.m144208f(), cgbo.m144206d(), cgbo.m144210h(), cgbo.m144211i(), cgbo.m144209g(), cgbo.m144212j(), cgbo.m144207e());
        try {
            aeat.m51532a(context).mo33985a("com.google.android.gms.people.service.DeletedNullContactsCleanupService");
            i = 2;
        } catch (IllegalArgumentException e) {
            Log.e("DeletedNullContactsCleanup", "Error when canceling the service.", e);
            i = 8;
        }
        almk a = almk.m61263a();
        bxvd da = amkz.f75139f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkz amkz = (amkz) da.f164949b;
        amkz.f75142b = i - 1;
        int i2 = amkz.f75141a | 1;
        amkz.f75141a = i2;
        amkz.f75145e = 3;
        amkz.f75141a = i2 | 32;
        a.mo40517a((amkz) da.mo74062i());
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo46469b() {
        HashSet a = bnpf.m110048a(1024);
        Cursor query = getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"contact_id"}, "deleted!=1", null, null);
        if (!m68180a(query)) {
            try {
                if (query.getCount() > 0) {
                    int columnIndex = query.getColumnIndex("contact_id");
                    while (query.moveToNext()) {
                        a.add(query.getString(columnIndex));
                    }
                }
                query = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "contact_last_updated_timestamp"}, null, null, null);
                try {
                    if (!m68180a(query)) {
                        if (query.getCount() > 0) {
                            int columnIndex2 = query.getColumnIndex("_id");
                            int columnIndex3 = query.getColumnIndex("contact_last_updated_timestamp");
                            ArrayList arrayList = new ArrayList();
                            int i = 0;
                            while (query.moveToNext()) {
                                String string = query.getString(columnIndex2);
                                if (!a.contains(string)) {
                                    i++;
                                    String valueOf = String.valueOf(string);
                                    Log.i("DeletedNullContactsCleanup", valueOf.length() == 0 ? new String("Dangling contacts id : ") : "Dangling contacts id : ".concat(valueOf));
                                    if (cgbl.m144199b()) {
                                        String string2 = query.getString(columnIndex3);
                                        ContentProviderOperation.Builder withYieldAllowed = ContentProviderOperation.newDelete(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(string))).withYieldAllowed(true);
                                        String valueOf2 = String.valueOf(string2);
                                        arrayList.add(withYieldAllowed.withSelection(valueOf2.length() == 0 ? new String("contact_last_updated_timestamp=") : "contact_last_updated_timestamp=".concat(valueOf2), null).build());
                                    }
                                }
                            }
                            int c = m68182c();
                            if (cgbl.m144199b()) {
                                Log.i("DeletedNullContactsCleanup", "Start cleanup all dangling contacts");
                                getContentResolver().applyBatch("com.android.contacts", arrayList);
                            }
                            int c2 = m68182c();
                            bxvd da = amky.f75132f.mo74144da();
                            if (cgbl.m144199b()) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amky amky = (amky) da.f164949b;
                                int i2 = 2 | amky.f75134a;
                                amky.f75134a = i2;
                                amky.f75136c = c;
                                amky.f75134a = i2 | 4;
                                amky.f75137d = c2;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amky amky2 = (amky) da.f164949b;
                            amky2.f75134a |= 1;
                            amky2.f75135b = i;
                            if (cgbo.f186290a.mo6606a().mo83228a()) {
                                int i3 = Settings.Global.getInt(getApplicationContext().getContentResolver(), "new_contact_aggregator", -1);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                amky amky3 = (amky) da.f164949b;
                                amky3.f75134a |= 8;
                                amky3.f75138e = i3;
                            }
                            almk.m61263a();
                            amky amky4 = (amky) da.mo74062i();
                            bxvd da2 = amoh.f75593x.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            amoh amoh = (amoh) da2.f164949b;
                            amky4.getClass();
                            amoh.f75616v = amky4;
                            amoh.f75595a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                            alml.m61288a(null, da2);
                        }
                        if (query == null) {
                            return;
                        }
                    } else if (query == null) {
                        return;
                    }
                } catch (OperationApplicationException | RemoteException e) {
                    try {
                        Log.e("DeletedNullContactsCleanup", "Failed to cleanup the dangling contacts");
                        if (query == null) {
                        }
                        query.close();
                    } catch (Throwable th) {
                        th = th;
                        if (query != null) {
                        }
                        throw th;
                    }
                }
            } catch (OperationApplicationException | RemoteException e2) {
                Log.e("DeletedNullContactsCleanup", "Failed to cleanup the dangling contacts");
                if (query == null) {
                    return;
                }
                query.close();
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
            query.close();
        }
    }

    /* renamed from: a */
    private static boolean m68180a(Cursor cursor) {
        if (cursor != null) {
            return false;
        }
        Log.e("DeletedNullContactsCleanup", "Failed to query dangling contacts.");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0140 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0141 A[RETURN] */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i;
        int i2;
        bxvd da;
        int hashCode;
        char c;
        boolean p = cgbo.f186290a.mo6606a().mo83243p();
        long a = m68178a(p);
        String str = aecc.f63128a;
        if ("DeletedNullContactsCleanupPeriodicTask".equals(str) || "DeletedNullContactsCleanupOneoffTask".equals(str)) {
            if (!"DeletedNullContactsCleanupPeriodicTask".equals(str) || !cgbo.m144208f()) {
                if ("DeletedNullContactsCleanupOneoffTask".equals(str)) {
                    if (!cgbo.m144204b()) {
                    }
                }
                Log.e("DeletedNullContactsCleanup", "The service is disabled. Will cancel it.");
                i2 = 3;
                i = 0;
            }
            if (C1133kh.m17835a(this, "android.permission.WRITE_CONTACTS") != 0) {
                i2 = 5;
                i = 0;
            } else {
                try {
                    i = getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "account_name IS NULL AND account_type IS NULL AND data_set IS NULL AND deleted=1", null);
                    try {
                        if (!cgbo.f186290a.mo6606a().mo83229b()) {
                            i2 = 2;
                        } else {
                            mo46469b();
                            i2 = 2;
                        }
                    } catch (IllegalArgumentException e) {
                        i2 = 6;
                        alsj a2 = alsj.m61651a(this);
                        long currentTimeMillis = System.currentTimeMillis();
                        sdo.m34973b((String) null);
                        a2.f74200a.edit().putLong("deleted_null_contacts_cleanup_last_run_timestamp", currentTimeMillis).commit();
                        if (i > 0) {
                        }
                        almk a3 = almk.m61263a();
                        da = amkz.f75139f.mo74144da();
                        if (da.f164950c) {
                        }
                        amkz amkz = (amkz) da.f164949b;
                        amkz.f75142b = i2 - 1;
                        int i3 = 1;
                        int i4 = amkz.f75141a | 1;
                        amkz.f75141a = i4;
                        amkz.f75141a = i4 | 2;
                        amkz.f75143c = i;
                        long a4 = m68178a(p) - a;
                        if (da.f164950c) {
                        }
                        amkz amkz2 = (amkz) da.f164949b;
                        int i5 = amkz2.f75141a | 16;
                        amkz2.f75141a = i5;
                        amkz2.f75144d = a4;
                        hashCode = str.hashCode();
                        if (hashCode != -1860432143) {
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                        amkz2.f75145e = i3 - 1;
                        amkz2.f75141a = i5 | 32;
                        a3.mo40517a((amkz) da.mo74062i());
                        m68181b(this);
                        if (i2 == 2) {
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException | UnsupportedOperationException e2) {
                        i2 = 7;
                        alsj a22 = alsj.m61651a(this);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        sdo.m34973b((String) null);
                        a22.f74200a.edit().putLong("deleted_null_contacts_cleanup_last_run_timestamp", currentTimeMillis2).commit();
                        if (i > 0) {
                        }
                        almk a32 = almk.m61263a();
                        da = amkz.f75139f.mo74144da();
                        if (da.f164950c) {
                        }
                        amkz amkz3 = (amkz) da.f164949b;
                        amkz3.f75142b = i2 - 1;
                        int i32 = 1;
                        int i42 = amkz3.f75141a | 1;
                        amkz3.f75141a = i42;
                        amkz3.f75141a = i42 | 2;
                        amkz3.f75143c = i;
                        long a42 = m68178a(p) - a;
                        if (da.f164950c) {
                        }
                        amkz amkz22 = (amkz) da.f164949b;
                        int i52 = amkz22.f75141a | 16;
                        amkz22.f75141a = i52;
                        amkz22.f75144d = a42;
                        hashCode = str.hashCode();
                        if (hashCode != -1860432143) {
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                        amkz22.f75145e = i32 - 1;
                        amkz22.f75141a = i52 | 32;
                        a32.mo40517a((amkz) da.mo74062i());
                        m68181b(this);
                        if (i2 == 2) {
                        }
                    }
                } catch (IllegalArgumentException e3) {
                    i = 0;
                    i2 = 6;
                    alsj a222 = alsj.m61651a(this);
                    long currentTimeMillis22 = System.currentTimeMillis();
                    sdo.m34973b((String) null);
                    a222.f74200a.edit().putLong("deleted_null_contacts_cleanup_last_run_timestamp", currentTimeMillis22).commit();
                    if (i > 0) {
                    }
                    almk a322 = almk.m61263a();
                    da = amkz.f75139f.mo74144da();
                    if (da.f164950c) {
                    }
                    amkz amkz32 = (amkz) da.f164949b;
                    amkz32.f75142b = i2 - 1;
                    int i322 = 1;
                    int i422 = amkz32.f75141a | 1;
                    amkz32.f75141a = i422;
                    amkz32.f75141a = i422 | 2;
                    amkz32.f75143c = i;
                    long a422 = m68178a(p) - a;
                    if (da.f164950c) {
                    }
                    amkz amkz222 = (amkz) da.f164949b;
                    int i522 = amkz222.f75141a | 16;
                    amkz222.f75141a = i522;
                    amkz222.f75144d = a422;
                    hashCode = str.hashCode();
                    if (hashCode != -1860432143) {
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    amkz222.f75145e = i322 - 1;
                    amkz222.f75141a = i522 | 32;
                    a322.mo40517a((amkz) da.mo74062i());
                    m68181b(this);
                    if (i2 == 2) {
                    }
                } catch (SQLiteException | IllegalStateException | SecurityException | UnsupportedOperationException e4) {
                    i = 0;
                    i2 = 7;
                    alsj a2222 = alsj.m61651a(this);
                    long currentTimeMillis222 = System.currentTimeMillis();
                    sdo.m34973b((String) null);
                    a2222.f74200a.edit().putLong("deleted_null_contacts_cleanup_last_run_timestamp", currentTimeMillis222).commit();
                    if (i > 0) {
                    }
                    almk a3222 = almk.m61263a();
                    da = amkz.f75139f.mo74144da();
                    if (da.f164950c) {
                    }
                    amkz amkz322 = (amkz) da.f164949b;
                    amkz322.f75142b = i2 - 1;
                    int i3222 = 1;
                    int i4222 = amkz322.f75141a | 1;
                    amkz322.f75141a = i4222;
                    amkz322.f75141a = i4222 | 2;
                    amkz322.f75143c = i;
                    long a4222 = m68178a(p) - a;
                    if (da.f164950c) {
                    }
                    amkz amkz2222 = (amkz) da.f164949b;
                    int i5222 = amkz2222.f75141a | 16;
                    amkz2222.f75141a = i5222;
                    amkz2222.f75144d = a4222;
                    hashCode = str.hashCode();
                    if (hashCode != -1860432143) {
                    }
                    c = 65535;
                    if (c == 0) {
                    }
                    amkz2222.f75145e = i3222 - 1;
                    amkz2222.f75141a = i5222 | 32;
                    a3222.mo40517a((amkz) da.mo74062i());
                    m68181b(this);
                    if (i2 == 2) {
                    }
                }
                alsj a22222 = alsj.m61651a(this);
                long currentTimeMillis2222 = System.currentTimeMillis();
                sdo.m34973b((String) null);
                a22222.f74200a.edit().putLong("deleted_null_contacts_cleanup_last_run_timestamp", currentTimeMillis2222).commit();
                if (i > 0) {
                    amdk.m62654a("DeletedNullContactsCleanup", "Cleaned-up %d deleted null contacts", i);
                }
            }
        } else {
            Log.e("DeletedNullContactsCleanup", "Unknown tag received. Will not run");
            i2 = 4;
            i = 0;
        }
        almk a32222 = almk.m61263a();
        da = amkz.f75139f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkz amkz3222 = (amkz) da.f164949b;
        amkz3222.f75142b = i2 - 1;
        int i32222 = 1;
        int i42222 = amkz3222.f75141a | 1;
        amkz3222.f75141a = i42222;
        amkz3222.f75141a = i42222 | 2;
        amkz3222.f75143c = i;
        long a42222 = m68178a(p) - a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkz amkz22222 = (amkz) da.f164949b;
        int i52222 = amkz22222.f75141a | 16;
        amkz22222.f75141a = i52222;
        amkz22222.f75144d = a42222;
        hashCode = str.hashCode();
        if (hashCode != -1860432143) {
            if (hashCode == 1861281503 && str.equals("DeletedNullContactsCleanupOneoffTask")) {
                c = 1;
                if (c == 0) {
                    i32222 = 3;
                } else if (c == 1) {
                    i32222 = 6;
                }
                amkz22222.f75145e = i32222 - 1;
                amkz22222.f75141a = i52222 | 32;
                a32222.mo40517a((amkz) da.mo74062i());
                m68181b(this);
                return i2 == 2 ? 0 : 2;
            }
        } else if (str.equals("DeletedNullContactsCleanupPeriodicTask")) {
            c = 0;
            if (c == 0) {
            }
            amkz22222.f75145e = i32222 - 1;
            amkz22222.f75141a = i52222 | 32;
            a32222.mo40517a((amkz) da.mo74062i());
            m68181b(this);
            if (i2 == 2) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
        amkz22222.f75145e = i32222 - 1;
        amkz22222.f75141a = i52222 | 32;
        a32222.mo40517a((amkz) da.mo74062i());
        m68181b(this);
        if (i2 == 2) {
        }
    }
}
