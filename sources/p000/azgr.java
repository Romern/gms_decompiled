package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.concurrent.TimeUnit;

/* renamed from: azgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f99294a;

    /* renamed from: b */
    final /* synthetic */ String f99295b;

    /* renamed from: c */
    final /* synthetic */ aznz f99296c;

    /* renamed from: d */
    final /* synthetic */ byte[] f99297d;

    /* renamed from: e */
    final /* synthetic */ boolean f99298e;

    /* renamed from: f */
    final /* synthetic */ byte[] f99299f;

    /* renamed from: g */
    final /* synthetic */ byte[] f99300g;

    /* renamed from: h */
    final /* synthetic */ String f99301h;

    /* renamed from: i */
    final /* synthetic */ long f99302i;

    public azgr(Context context, String str, aznz aznz, byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3, String str2, long j) {
        this.f99294a = context;
        this.f99295b = str;
        this.f99296c = aznz;
        this.f99297d = bArr;
        this.f99298e = z;
        this.f99299f = bArr2;
        this.f99300g = bArr3;
        this.f99301h = str2;
        this.f99302i = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d A[SYNTHETIC, Splitter:B:42:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01eb A[SYNTHETIC, Splitter:B:63:0x01eb] */
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        boolean z;
        if (!azdl.m85412a(this.f99294a).mo54802x() && !azdl.m85412a(this.f99294a).mo54770e()) {
            azoj.m85933c("StorageIH", "start without registration", new Object[0]);
        }
        if (!TextUtils.isEmpty(this.f99295b)) {
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) this.f99295b)) {
                azcd.m85252a(this.f99294a).mo54608b(str);
            }
        }
        long a = azdj.m85399a(this.f99294a).mo54717a(this.f99296c.f99781h, (LocalEntityId) null, this.f99297d);
        this.f99294a.getContentResolver().notifyChange(DatabaseProvider.m94517a(this.f99296c), null);
        if (this.f99298e) {
            azph.m85998a(this.f99294a).mo55137a(363, this.f99296c);
        }
        if (this.f99299f != null) {
            azph.m85998a(this.f99294a).mo55137a(364, this.f99296c);
        }
        azcm a2 = azcm.m85300a(this.f99294a);
        byte[] bArr = this.f99300g;
        String str2 = this.f99301h;
        long j = this.f99302i;
        aznz aznz = this.f99296c;
        String str3 = aznz.f99777d;
        byte[] bArr2 = this.f99299f;
        if (!a2.mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
        } else {
            a2.f98996b.beginTransaction();
            if (azcm.m85306a(a2.f98996b, aznz.f99774a)) {
                if (!a2.mo54651a()) {
                    try {
                        a2.f98996b = azcl.m85289a(a2.f98995a).getReadableDatabase();
                    } catch (Exception e) {
                        azoj.m85931a("DatabaseOperations", e, "Failed to add prompt and intro info", new Object[0]);
                        sQLiteDatabase = a2.f98996b;
                    } catch (Throwable th) {
                        th = th;
                        a2.f98996b.setTransactionSuccessful();
                        a2.f98996b.endTransaction();
                        throw th;
                    }
                }
                try {
                    a2.f98996b.beginTransaction();
                    try {
                        cursor = a2.f98996b.query("messages", new String[]{"_id"}, "conversation_id = ?", new String[]{aznz.f99774a}, null, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    z = false;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    a2.f98996b.setTransactionSuccessful();
                                    a2.f98996b.endTransaction();
                                    if (!z) {
                                        sQLiteDatabase = a2.f98996b;
                                        sQLiteDatabase.setTransactionSuccessful();
                                        a2.f98996b.endTransaction();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor != null) {
                                }
                                a2.f98996b.setTransactionSuccessful();
                                a2.f98996b.endTransaction();
                                throw th;
                            }
                        }
                        z = true;
                        if (cursor != null) {
                        }
                        a2.f98996b.setTransactionSuccessful();
                        a2.f98996b.endTransaction();
                        if (!z) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        a2.f98996b.setTransactionSuccessful();
                        a2.f98996b.endTransaction();
                        throw th;
                    }
                } catch (Exception e2) {
                    azoj.m85931a("DatabaseOperations", e2, "Failed to add prompt and intro info", new Object[0]);
                    sQLiteDatabase = a2.f98996b;
                }
            }
            azdb azdb = new azdb();
            azdb.f99036j = aznz.f99774a;
            azdb.f99031e = a;
            azdb.f99028b = str3;
            azdb.f99029c = aznz.f99776c;
            azdb.f99037k = 2;
            long t = cfeo.f183719a.mo6606a().mo81091t();
            if (cfeo.f183719a.mo6606a().mo81089r()) {
                azdb.f99027a = azfn.m85576a();
                azdb.f99034h = "application/business-chat-prompt";
                azdb.f99032f = Long.toString(j).getBytes();
                azdb.f99033g = "integer/long";
                azdb.f99030d = System.currentTimeMillis();
                azdb.f99035i = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - t;
                a2.mo54641a(azdb.mo54711a(), (azph) null);
            }
            String a3 = azfn.m85576a();
            if (!TextUtils.isEmpty(str2)) {
                azdb.f99027a = a3;
                azdb.f99034h = "text/plain";
                azdb.f99032f = str2.getBytes();
                azdb.f99033g = "text/plain";
                azdb.f99030d = System.currentTimeMillis();
                azdb.f99035i = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - t;
                a2.mo54641a(azdb.mo54711a(), (azph) null);
                if (bArr2 != null) {
                    a2.mo54652a(aznz.f99774a, a3, bArr2);
                }
            }
            if (bArr != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("outgoing_message_properties", bArr);
                a2.f98996b.update("conversations", contentValues, "conversation_id = ?", new String[]{aznz.f99774a});
            }
            sQLiteDatabase = a2.f98996b;
            sQLiteDatabase.setTransactionSuccessful();
            a2.f98996b.endTransaction();
        }
        this.f99294a.getContentResolver().notifyChange(DatabaseProvider.m94534b(this.f99296c.f99774a), null);
    }
}
