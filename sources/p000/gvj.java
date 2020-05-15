package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import java.util.ArrayList;

/* renamed from: gvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvj {

    /* renamed from: a */
    private static final sbw f19074a = new sbw("AccountTransfer", "[RespPersistTableUtil]");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static long m14007a(Context context, AuthenticatorAnnotatedData authenticatorAnnotatedData) {
        AuthenticatorTransferInfo authenticatorTransferInfo = authenticatorAnnotatedData.f10055c;
        String str = authenticatorTransferInfo.f10062c;
        String str2 = authenticatorAnnotatedData.f10057e;
        String str3 = authenticatorAnnotatedData.f10056d;
        SQLiteDatabase b = m14014b(context);
        ContentValues a = m14009a(authenticatorTransferInfo, str2, str3);
        a.put("msg_for", (Integer) 2);
        a.put("msg_from", (Integer) 1);
        long insert = b.insert("responses", null, a);
        if (insert < 0) {
            sbw sbw = f19074a;
            String valueOf = String.valueOf(str);
            sbw.mo25377c("AccountTransfer", valueOf.length() == 0 ? new String("Error inserting record for account type ") : "Error inserting record for account type ".concat(valueOf));
        }
        return insert;
    }

    /* renamed from: b */
    private static SQLiteDatabase m14014b(Context context) {
        return gvg.m13994a(context).mo12265a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static gtx m14015b(Context context, AuthenticatorTransferInfo authenticatorTransferInfo) {
        long j;
        String str = authenticatorTransferInfo.f10062c;
        Cursor query = gvg.m13994a(context).mo12265a().query("responses", null, "account_type = ? AND read_state = ? AND msg_for = ?", new String[]{str, "1", "2"}, null, null, "timestamp DESC", "1");
        try {
            if (!query.moveToFirst()) {
                f19074a.mo25372b("AccountTransfer", String.format("Reading for accountType:%s found no rows", str));
                query.close();
                return null;
            }
            AuthenticatorTransferInfo a = m14010a(imu.m15737a(query, "data"));
            if (cccc.m129224b()) {
                j = imu.m15738b(query, "id").longValue();
            } else {
                j = -1;
            }
            gtx gtx = new gtx(imu.m15738b(query, "id").longValue(), new AuthenticatorAnnotatedData(a, imu.m15739c(query, "signature"), imu.m15739c(query, "package_name"), String.valueOf(j)));
            query.close();
            query.close();
            return gtx;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static long m14008a(Context context, AuthenticatorTransferInfo authenticatorTransferInfo) {
        String str = authenticatorTransferInfo.f10062c;
        String str2 = (String) gub.m13906a().mo12225a(context).get(str);
        String a = gtv.m13886a(str, str2, context);
        SQLiteDatabase b = m14014b(context);
        ContentValues a2 = m14009a(authenticatorTransferInfo, str2, a);
        a2.put("msg_for", (Integer) 1);
        a2.put("msg_from", (Integer) 2);
        long insert = b.insert("responses", null, a2);
        if (insert < 0) {
            sbw sbw = f19074a;
            String valueOf = String.valueOf(str);
            sbw.mo25377c("AccountTransfer", valueOf.length() == 0 ? new String("Error inserting record for account type ") : "Error inserting record for account type ".concat(valueOf));
        }
        return insert;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    private static ContentValues m14009a(AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_type", authenticatorTransferInfo.f10062c);
        contentValues.put("read_state", (Integer) 1);
        contentValues.put("package_name", str);
        contentValues.put("signature", str2);
        PendingIntent pendingIntent = authenticatorTransferInfo.f10065f;
        if (pendingIntent != null) {
            gub.m13906a().mo12227b().put(authenticatorTransferInfo.f10062c, pendingIntent);
            authenticatorTransferInfo.mo7390a((PendingIntent) null);
        }
        contentValues.put("data", sef.m35074a(authenticatorTransferInfo));
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    /* renamed from: a */
    private static AuthenticatorTransferInfo m14010a(byte[] bArr) {
        AuthenticatorTransferInfo authenticatorTransferInfo = (AuthenticatorTransferInfo) sef.m35069a(bArr, AuthenticatorTransferInfo.CREATOR);
        if (authenticatorTransferInfo.f10063d == 4) {
            authenticatorTransferInfo.mo7390a((PendingIntent) gub.m13906a().mo12227b().get(authenticatorTransferInfo.f10062c));
        }
        return authenticatorTransferInfo;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static guc m14011a(Context context) {
        guc guc;
        long j;
        Cursor query = gvg.m13994a(context).mo12265a().query("responses", null, "read_state = ? AND msg_for = ?", new String[]{"1", "1"}, null, null, null);
        try {
            if (query.moveToFirst()) {
                int count = query.getCount();
                C1223np npVar = new C1223np(count);
                ArrayList arrayList = new ArrayList(count);
                StringBuilder sb = new StringBuilder((count + count) - 1);
                while (true) {
                    byte[] a = imu.m15737a(query, "data");
                    if (cccc.m129224b()) {
                        j = imu.m15738b(query, "id").longValue();
                    } else {
                        j = -1;
                    }
                    AuthenticatorTransferInfo a2 = m14010a(a);
                    npVar.put(a2.f10062c, AccountTransferProgress.m6324a(a2.f10063d));
                    arrayList.add(new AuthenticatorAnnotatedData(a2, imu.m15739c(query, "signature"), imu.m15739c(query, "package_name"), String.valueOf(j)));
                    if (query.isLast()) {
                        break;
                    }
                    sb.append(j);
                    sb.append(",");
                    query.moveToNext();
                }
                sb.append(j);
                query.close();
                guc = new guc(arrayList, npVar, sb.toString());
            } else {
                guc = null;
            }
            query.close();
            return guc;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static void m14012a(Context context, long j) {
        SQLiteDatabase a = gvg.m13994a(context).mo12265a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read_state", (Integer) 2);
        a.update("responses", contentValues, "id = ? ", new String[]{String.valueOf(j)});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static void m14013a(Context context, String str) {
        SQLiteDatabase a = gvg.m13994a(context).mo12265a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read_state", (Integer) 2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("id IN (");
        sb.append(str);
        sb.append(")");
        a.update("responses", contentValues, sb.toString(), null);
    }
}
