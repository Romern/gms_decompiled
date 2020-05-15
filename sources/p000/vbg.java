package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.database.Cursor;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: vbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbg extends smx {

    /* renamed from: a */
    private static final sbw f48917a = new sbw("DriveSyncAdapter", "");

    /* renamed from: b */
    private static final String[] f48918b = {"_id", "feed"};

    /* renamed from: c */
    private static final Set f48919c = Collections.singleton("sync");

    public vbg(Context context) {
        super(context, "drive");
    }

    /* renamed from: a */
    public static void m39921a(Account account, Context context) {
        new rtg(context);
        ContentResolver.setIsSyncable(account, "com.google.android.gms.drive.sync", 1);
        rtg.m34394a(account, "com.google.android.gms.drive.sync");
        rtg.m34395a(account, "com.google.android.gms.drive.sync", Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 2817;
    }

    /* renamed from: a */
    public static void m39922a(Context context, Account account, boolean z) {
        Cursor query;
        try {
            String str = account.name;
            ContentResolver contentResolver = context.getContentResolver();
            HashMap hashMap = new HashMap();
            query = contentResolver.query(ashq.f88987a, f48918b, "_sync_account=? AND authority=?", new String[]{str, "com.google.android.gms.drive.sync"}, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(1), Long.valueOf(query.getLong(0)));
                }
                query.close();
            }
            if (z) {
                for (String str2 : f48919c) {
                    if (hashMap.containsKey(str2)) {
                        hashMap.remove(str2);
                        f48917a.mo25369a("Account %s already subscribed to feed %s", str, str2);
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("feed", str2);
                        contentValues.put("_sync_account", account.name);
                        contentValues.put("_sync_account_type", account.type);
                        contentValues.put("authority", "com.google.android.gms.drive.sync");
                        contentValues.put("service", "cosmo");
                        contentResolver.insert(ashq.f88987a, contentValues);
                        f48917a.mo25369a("Subscribed account %s to feed %s", str, str2);
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                contentResolver.delete(ContentUris.withAppendedId(ashq.f88987a, ((Long) entry.getValue()).longValue()), null, null);
            }
        } catch (Exception e) {
            f48917a.mo25378c("DriveSyncAdapter", "Error updating feeds", e);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        boolean d;
        boolean z = false;
        try {
            tws.m37569b(getContext().getApplicationContext());
            if (vav.m39898a()) {
                var a = vav.m39900c().mo28181a(account.name);
                a.f48863c.incrementAndGet();
                synchronized (a) {
                    if (a.f48864d != null) {
                        z = true;
                    }
                    sdo.m34971a(z, (Object) "Not initialized yet");
                    if (!a.f48866f) {
                        a.f48865e = true;
                    } else {
                        a.f48867g = true;
                    }
                    d = a.mo28178d();
                }
                if (d) {
                    a.mo28176b();
                }
            } else {
                m39922a(getContext(), account, false);
            }
            return true;
        } catch (InterruptedException e) {
            f48917a.mo25372b("DriveSyncAdapter", "Interrupted while awaiting for initialization!");
            return false;
        }
    }
}
