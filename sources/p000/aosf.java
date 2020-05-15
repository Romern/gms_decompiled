package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aosf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aosf {
    /* renamed from: a */
    public static aosi m69444a(Context context, Account account) {
        if (m69448a(account)) {
            List a = m69446a(context, "account_name=?", new String[]{account.name});
            if (!a.isEmpty()) {
                return (aosi) a.get(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static aosi m69445a(Context context, String str) {
        return m69444a(context, new Account(str, "com.google"));
    }

    /* renamed from: a */
    public static List m69446a(Context context, String str, String[] strArr) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(aosy.f83568a, new String[]{"_id", "account_name", "storage_version", "sync_status", "account_state"}, str, strArr, null);
        if (query == null) {
            return arrayList;
        }
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Account account = new Account(query.getString(1), "com.google");
                Long a = aows.m69725a(query, 2);
                if (!query.isNull(3)) {
                    bArr = query.getBlob(3);
                } else {
                    bArr = null;
                }
                arrayList.add(new aosi(j, account, a, bArr, aows.m69725a(query, 4)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* renamed from: a */
    public static void m69447a(Context context, aosi aosi) {
        new Object[1][0] = Long.valueOf(aosi.f83507a);
        new Object[1][0] = aosi.f83508b.name;
        ArrayList arrayList = new ArrayList();
        String[] strArr = {String.valueOf(aosi.f83507a)};
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("storage_version");
        contentValues.putNull("sync_status");
        contentValues.put("need_sync_snooze_preset", (Boolean) true);
        arrayList.add(ContentProviderOperation.newUpdate(aosy.f83568a).withSelection("_id=?", strArr).withValues(contentValues).build());
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("silent_change", (Boolean) true);
        contentValues2.put("dirty_sync_bit", (Boolean) true);
        arrayList.add(ContentProviderOperation.newUpdate(aotd.f83574a).withSelection("account_id=?", strArr).withValues(contentValues2).build());
        sgq.m35236a(context.getContentResolver(), arrayList, "RemindersAccount");
    }

    /* renamed from: a */
    public static boolean m69448a(Account account) {
        return account != null && !TextUtils.isEmpty(account.name) && "com.google".equalsIgnoreCase(account.type);
    }
}
