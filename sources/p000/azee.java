package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: azee */
public final /* synthetic */ class azee implements Runnable {

    /* renamed from: a */
    private final azef f99148a;

    /* renamed from: b */
    private final int f99149b;

    public azee(azef azef, int i) {
        this.f99148a = azef;
        this.f99149b = i;
    }

    /* JADX INFO: finally extract failed */
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azan.a(aznz, boolean, java.lang.String):void
     arg types: [aznz, int, java.lang.String]
     candidates:
      azan.a(android.app.Notification$Builder, android.graphics.Bitmap, int):void
      azan.a(java.lang.String, boolean, boolean):void
      azan.a(aznz, boolean, java.lang.String):void */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0247, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0248, code lost:
        r6 = r25;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025f, code lost:
        if (r9 != null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0262, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0265, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
        r0 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0273, code lost:
        if (r0.hasNext() == false) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0275, code lost:
        r5 = (java.lang.String) r0.next();
        new java.lang.Object[r12][r15] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0285, code lost:
        if (r5.startsWith("file") == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0287, code lost:
        p000.azoc.m85904a(android.net.Uri.parse(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028f, code lost:
        p000.azoc.m85904a(android.net.Uri.fromFile(new java.io.File(r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x029c, code lost:
        r4.beginTransaction();
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r9 = r4.rawQuery("SELECT conversations.conversation_id FROM conversations WHERE blocked == 0 AND  NOT EXISTS (  SELECT messages.message_id FROM messages WHERE messages.conversation_id == conversations.conversation_id ) ", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02aa, code lost:
        if (r9.moveToFirst() == false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ac, code lost:
        r0 = r9.getString(r15);
        new java.lang.Object[r12][r15] = r0;
        p000.azan.m85141a(r2.f99093b).mo54541b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c2, code lost:
        if (r9.moveToNext() != false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c4, code lost:
        if (r9 != null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c7, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ca, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
        new java.lang.Object[r12][r15] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r19);
        r7 = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.SECONDS.toMillis(p000.cfeo.f183719a.mo6606a().mo80947aG());
        r4.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        new java.lang.Object[r12][r15] = "DELETE FROM conversations WHERE last_active_timestamp <  ?  AND blocked == 0 AND  NOT EXISTS (  SELECT messages.message_id FROM messages WHERE messages.conversation_id == conversations.conversation_id ) ";
        r0 = r4.compileStatement("DELETE FROM conversations WHERE last_active_timestamp <  ?  AND blocked == 0 AND  NOT EXISTS (  SELECT messages.message_id FROM messages WHERE messages.conversation_id == conversations.conversation_id ) ");
        r5 = new java.lang.String[r12];
        r5[r15] = java.lang.Long.toString(r7);
        r0.bindAllArgsAsStrings(r5);
        new java.lang.Object[r12][r15] = java.lang.Integer.valueOf(r0.executeUpdateDelete());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0319, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
        r4.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r0 = r4.compileStatement(p000.azdm.f99090e);
        new java.lang.Object[r12][r15] = r0.toString();
        new java.lang.Object[r12][r15] = java.lang.Integer.valueOf(r0.executeUpdateDelete());
        r0 = r4.compileStatement(p000.azdm.f99091f);
        new java.lang.Object[r12][r15] = r0.toString();
        new java.lang.Object[r12][r15] = java.lang.Integer.valueOf(r0.executeUpdateDelete());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0356, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
        r4.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r0 = r4.compileStatement("DROP TABLE IF EXISTS tachystickreachability");
        new java.lang.Object[r12][r15] = r0.toString();
        r0.execute();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0377, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0378, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x037f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0380, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0386, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0387, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0388, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0391, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0395, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0396, code lost:
        if (r9 != null) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0399, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039c, code lost:
        r4.setTransactionSuccessful();
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x050a, code lost:
        if (r9 == null) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x050e, code lost:
        if (r9 == null) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05dc, code lost:
        if (r9 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05ec, code lost:
        if (r9 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0737, code lost:
        if (r9 == null) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x073b, code lost:
        if (r9 == null) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d3, code lost:
        r6 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01da, code lost:
        if (r9 == null) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01de, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ed, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ee, code lost:
        r28 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023c, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:37:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0929  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01de A[ExcHandler: all (th java.lang.Throwable), Splitter:B:51:0x0195] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:42:0x0173] */
    public final void run() {
        int i;
        String str;
        int i2;
        int i3;
        Cursor cursor;
        String str2;
        Cursor cursor2;
        String str3;
        String str4;
        int i4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i5;
        Cursor cursor3;
        Cursor cursor4;
        String str11;
        Cursor cursor5;
        Cursor cursor6;
        String str12;
        String str13;
        String str14;
        Cursor cursor7;
        HashSet hashSet;
        Cursor cursor8;
        Cursor cursor9;
        Cursor cursor10;
        azef azef = this.f99148a;
        int i6 = this.f99149b;
        azdm azdm = azef.f99153d;
        azox.m85982b();
        try {
            SQLiteDatabase writableDatabase = azdm.f99092a.getWritableDatabase();
            if ((i6 & 512) == 512) {
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", (Integer) 1);
                    new Object[1][0] = Integer.valueOf(writableDatabase.update("appData", contentValues, "(status&?) - ? = 0", new String[]{Integer.toString(15), Integer.toString(2)}));
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("status", (Integer) 0);
                    new Object[1][0] = Integer.valueOf(writableDatabase.update("profile", contentValues2, "status = ?", new String[]{Integer.toString(1)}));
                } finally {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
            }
            if ((i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                str = "server_app_id";
                i = 0;
            } else {
                String locale = Locale.getDefault().toString();
                try {
                    writableDatabase.beginTransaction();
                    str = "server_app_id";
                    i = 0;
                    try {
                        cursor9 = writableDatabase.query("appData", new String[]{"sid"}, "locale != ? ", new String[]{locale}, null, null, null);
                        if (cursor9 != null) {
                            try {
                                if (cursor9.moveToFirst()) {
                                    do {
                                        String string = cursor9.getString(0);
                                        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.GET_APP_DATA");
                                        intent.putExtra(str, string);
                                        intent.putExtra("fetch_icon", false);
                                        MessagingService.m94557b(intent, azdm.f99093b);
                                    } while (cursor9.moveToNext());
                                    cursor9.close();
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (cursor9 != null) {
                                    cursor9.close();
                                }
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        }
                        if (cursor9 != null) {
                            cursor9.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        th = th2;
                        cursor10 = null;
                        cursor9 = cursor10;
                        if (cursor9 != null) {
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor10 = null;
                    cursor9 = cursor10;
                    if (cursor9 != null) {
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            if ((i6 & 16) == 16) {
                long currentTimeMillis = System.currentTimeMillis();
                long J = cfeo.f183719a.mo6606a().mo80923J();
                if (azdm.f99095d.mo54734H()) {
                    J = Math.min(J, TimeUnit.DAYS.toSeconds(7));
                }
                long currentTimeMillis2 = System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(J);
                writableDatabase.beginTransaction();
                try {
                    String[] strArr = new String[1];
                    strArr[i] = Long.toString(currentTimeMillis2);
                    new Object[1][i] = Integer.valueOf(writableDatabase.delete("messages", "timestamp_ms < ?", strArr));
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    HashSet hashSet2 = new HashSet();
                    writableDatabase.beginTransaction();
                    try {
                        String[] strArr2 = new String[3];
                        strArr2[i] = "message_id";
                        strArr2[1] = "encrypted";
                        strArr2[2] = "downloaded_file_uri";
                        HashSet hashSet3 = hashSet2;
                        i2 = 3;
                        Cursor query = writableDatabase.query("media", strArr2, null, null, null, null, null);
                        while (query.moveToNext()) {
                            try {
                                hashSet = hashSet3;
                                i3 = 1;
                                cursor8 = query;
                                try {
                                    String string2 = cursor8.getString(i);
                                    int i7 = cursor8.getInt(1);
                                    String string3 = cursor8.getString(2);
                                    if (!azcm.m85300a(azdm.f99093b).mo54662c(string2)) {
                                        if (i7 != 0) {
                                            if (!TextUtils.isEmpty(string3)) {
                                                hashSet.add(string3);
                                            }
                                        }
                                        String[] strArr3 = new String[1];
                                        strArr3[i] = string2;
                                        writableDatabase.delete("media", "message_id = ? ", strArr3);
                                        query = cursor8;
                                        hashSet3 = hashSet;
                                    } else {
                                        query = cursor8;
                                        hashSet3 = hashSet;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    cursor7 = cursor8;
                                    try {
                                        azoj.m85931a("SyncChecker", e, "Failed to delete stale media entry", new Object[i]);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (cursor7 != null) {
                                            cursor7.close();
                                        }
                                        writableDatabase.setTransactionSuccessful();
                                        writableDatabase.endTransaction();
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor7 = cursor8;
                                    if (cursor7 != null) {
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                cursor8 = query;
                                hashSet = hashSet3;
                                i3 = 1;
                                cursor7 = cursor8;
                                azoj.m85931a("SyncChecker", e, "Failed to delete stale media entry", new Object[i]);
                            } catch (Throwable th6) {
                            }
                        }
                        String[] strArr4 = new String[2];
                        strArr4[i] = "message_id";
                        strArr4[1] = "local_file_uri";
                        Cursor cursor11 = query;
                        try {
                            cursor7 = writableDatabase.query("mediaUpload", strArr4, null, null, null, null, null);
                            while (cursor7.moveToNext()) {
                                try {
                                    String string4 = cursor7.getString(i);
                                    i3 = 1;
                                    String string5 = cursor7.getString(1);
                                    if (!azcm.m85300a(azdm.f99093b).mo54662c(string4)) {
                                        if (TextUtils.isEmpty(string5)) {
                                            hashSet = hashSet3;
                                        } else {
                                            hashSet = hashSet3;
                                            hashSet.add(string5);
                                        }
                                        String[] strArr5 = new String[1];
                                        strArr5[i] = string4;
                                        writableDatabase.delete("mediaUpload", "message_id = ? ", strArr5);
                                        hashSet3 = hashSet;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    hashSet = hashSet3;
                                    i3 = 1;
                                    azoj.m85931a("SyncChecker", e, "Failed to delete stale media entry", new Object[i]);
                                } catch (Throwable th7) {
                                }
                            }
                            hashSet = hashSet3;
                            i3 = 1;
                        } catch (Exception e4) {
                            e = e4;
                            hashSet = hashSet3;
                            i3 = 1;
                            cursor8 = cursor11;
                            cursor7 = cursor8;
                            azoj.m85931a("SyncChecker", e, "Failed to delete stale media entry", new Object[i]);
                        } catch (Throwable th8) {
                            th = th8;
                            cursor8 = cursor11;
                            cursor7 = cursor8;
                            if (cursor7 != null) {
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        HashSet hashSet4 = hashSet2;
                        int i8 = 1;
                        i2 = 3;
                        cursor7 = null;
                        azoj.m85931a("SyncChecker", e, "Failed to delete stale media entry", new Object[i]);
                    } catch (Throwable th9) {
                    }
                } catch (Throwable th10) {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    throw th10;
                }
            } else {
                cursor = null;
                i3 = 1;
                i2 = 3;
            }
            String str15 = "entity_type";
            if ((i6 & 2) == 2) {
                writableDatabase.beginTransaction();
                ArrayList arrayList = new ArrayList();
                try {
                    String[] strArr6 = new String[i3];
                    strArr6[i] = "conversation_id";
                    String[] strArr7 = new String[i3];
                    strArr7[i] = Integer.toString(20);
                    str2 = "conversation_id";
                    String str16 = "entity_id";
                    String str17 = str15;
                    String str18 = "com.google.android.apps.libraries.matchstick.action.GET_ENTITY_PROFILE";
                    cursor2 = cursor;
                    Cursor query2 = writableDatabase.query("messages", strArr6, "status == ?", strArr7, "conversation_id", null, null);
                    if (query2 != null) {
                        while (query2.moveToNext()) {
                            arrayList.add(query2.getString(i));
                        }
                        query2.close();
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        aznz a = aznz.m85891a((String) arrayList.get(i9));
                        if (a.mo55104b()) {
                            azdi b = azdj.m85399a(azdm.f99093b).mo54722b(a.f99781h);
                            if (b != null) {
                                str12 = str18;
                                Intent intent2 = new Intent(str12);
                                intent2.putExtra("update_profile_id", b.f99075a);
                                str13 = str16;
                                intent2.putExtra(str13, a.f99777d);
                                str14 = str17;
                                intent2.putExtra(str14, a.f99776c);
                                intent2.putExtra(str, a.f99775b);
                                intent2.putExtra("trigger_notification", true);
                                MessagingService.m94557b(intent2, azdm.f99093b);
                            } else {
                                str13 = str16;
                                str14 = str17;
                                str12 = str18;
                            }
                        } else {
                            str13 = str16;
                            str14 = str17;
                            str12 = str18;
                        }
                        i9++;
                        str17 = str14;
                        str16 = str13;
                        str18 = str12;
                    }
                    str4 = str16;
                    str15 = str17;
                    str3 = str18;
                    i4 = 1;
                } catch (Throwable th11) {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    throw th11;
                }
            } else {
                str2 = "conversation_id";
                str3 = "com.google.android.apps.libraries.matchstick.action.GET_ENTITY_PROFILE";
                cursor2 = cursor;
                i4 = 1;
                str4 = "entity_id";
            }
            if ((i6 & 4) != 4) {
                str7 = str15;
                str6 = str4;
                str5 = str3;
                str8 = str2;
            } else {
                writableDatabase.beginTransaction();
                try {
                    String[] strArr8 = new String[i4];
                    strArr8[i] = str2;
                    String[] strArr9 = new String[i4];
                    strArr9[i] = Integer.toString(i2);
                    str8 = str2;
                    str7 = str15;
                    str6 = str4;
                    str5 = str3;
                    cursor6 = writableDatabase.query("messages", strArr8, "status == ?", strArr9, "conversation_id", null, null);
                    try {
                        if (cursor6.moveToFirst()) {
                            do {
                                String string6 = cursor6.getString(i);
                                Intent intent3 = new Intent("com.google.android.apps.libraries.matchstick.action.SEND_READ_RECEIPT_MESSAGE");
                                intent3.putExtra(str8, string6);
                                MessagingService.m94557b(intent3, azdm.f99093b);
                            } while (cursor6.moveToNext());
                        }
                        cursor6.close();
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th12) {
                        th = th12;
                        if (cursor6 != null) {
                            cursor6.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    cursor6 = cursor2;
                    if (cursor6 != null) {
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            if ((i6 & 64) != 64) {
                str10 = str7;
                str9 = str6;
            } else if (cfeo.f183719a.mo6606a().mo81058cj()) {
                long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis() - cfeo.m138856M());
                writableDatabase.beginTransaction();
                try {
                    String[] strArr10 = new String[4];
                    strArr10[i] = "_id";
                    strArr10[1] = str6;
                    strArr10[2] = str7;
                    strArr10[3] = "app_id";
                    String[] strArr11 = new String[5];
                    strArr11[i] = Integer.toString(1);
                    strArr11[1] = Integer.toString(3);
                    strArr11[2] = Integer.toString(i);
                    strArr11[3] = Integer.toString(2);
                    strArr11[4] = Long.toString(micros);
                    String str19 = str7;
                    String str20 = str6;
                    cursor5 = writableDatabase.query("profile", strArr10, "(entity_type = ? OR entity_type = ? ) AND (status = ? OR (status = ? AND last_sync_timestamp < ? ))", strArr11, null, null, null);
                    try {
                        if (cursor5.moveToFirst()) {
                            while (true) {
                                long j = cursor5.getLong(i);
                                String string7 = cursor5.getString(1);
                                int i10 = cursor5.getInt(2);
                                String string8 = cursor5.getString(3);
                                String str21 = str5;
                                Intent intent4 = new Intent(str21);
                                intent4.putExtra("update_profile_id", j);
                                str9 = str20;
                                intent4.putExtra(str9, string7);
                                str10 = str19;
                                intent4.putExtra(str10, i10);
                                intent4.putExtra(str, string8);
                                intent4.putExtra("update_profile_notifyconversation", true);
                                MessagingService.m94557b(intent4, azdm.f99093b);
                                if (!cursor5.moveToNext()) {
                                    break;
                                }
                                str19 = str10;
                                str5 = str21;
                                str20 = str9;
                                i = 0;
                            }
                        } else {
                            str10 = str19;
                            str9 = str20;
                        }
                        cursor5.close();
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th14) {
                        th = th14;
                        if (cursor5 != null) {
                            cursor5.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    cursor5 = cursor2;
                    if (cursor5 != null) {
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    throw th;
                }
            } else {
                str10 = str7;
                str9 = str6;
            }
            if ((i6 & 128) == 128 && cfeo.m138866W()) {
                azcd a2 = azcd.m85252a(azdm.f99093b);
                HashMap hashMap = new HashMap();
                try {
                    cursor4 = a2.f98961a.getReadableDatabase().query("appData", new String[]{"sid", "blocked", "status"}, null, null, null, null, null);
                    if (cursor4 != null) {
                        while (cursor4.moveToNext()) {
                            try {
                                if ((cursor4.getInt(2) & 3840) == 512) {
                                    hashMap.put(cursor4.getString(0), Boolean.valueOf(cursor4.getInt(1) != 0));
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (!((Boolean) entry.getValue()).booleanValue()) {
                            str11 = "com.google.android.apps.libraries.matchstick.action.UNBLOCK_APP";
                        } else {
                            str11 = "com.google.android.apps.libraries.matchstick.action.BLOCK_APP";
                        }
                        Intent intent5 = new Intent(str11);
                        intent5.putExtra(str, (String) entry.getKey());
                        intent5.putExtra("sync_app_block_state_with_server", true);
                        MessagingService.m94557b(intent5, azdm.f99093b);
                    }
                } catch (Throwable th17) {
                    th = th17;
                    cursor4 = cursor2;
                    if (cursor4 != null) {
                    }
                    throw th;
                }
            }
            if ((i6 & 1024) != 1024) {
                i5 = 1;
            } else {
                writableDatabase.beginTransaction();
                try {
                    String str22 = str10;
                    String str23 = str9;
                    i5 = 1;
                    cursor3 = writableDatabase.query("profile", new String[]{str9, "app_id", str10}, "blocked =? ", new String[]{Integer.toString(2)}, null, null, null);
                    try {
                        if (cursor3.moveToFirst()) {
                            do {
                                String string9 = cursor3.getString(0);
                                String string10 = cursor3.getString(1);
                                String string11 = cursor3.getString(2);
                                Intent intent6 = new Intent("com.google.android.apps.libraries.matchstick.action.BLOCK_USER");
                                intent6.putExtra(str23, string9);
                                intent6.putExtra(str, string10);
                                intent6.putExtra(str22, string11);
                                MessagingService.m94557b(intent6, azdm.f99093b);
                            } while (cursor3.moveToNext());
                        }
                        cursor3.close();
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th18) {
                        th = th18;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th19) {
                    th = th19;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            if ((i6 & 2048) == 2048) {
                if (cffa.m139280b() > 0) {
                    ScheduledTaskService.m94660a(azdm.f99093b, "gms:matchstick:renotification", TimeUnit.MILLISECONDS.toSeconds(azpi.m86059a((int) cffa.m139280b())), TimeUnit.MINUTES.toSeconds(10));
                }
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                String d = cffa.f183914a.mo6606a().mo81106d();
                if (!TextUtils.isEmpty(d)) {
                    for (String str24 : bmyx.m108640a(',').mo66918a((CharSequence) d)) {
                        String a3 = azcd.m85252a(azdm.f99093b).mo54600a(str24, 14);
                        if (a3 != null) {
                            concurrentHashMap.put(str24, a3);
                        }
                    }
                    if (!concurrentHashMap.isEmpty()) {
                        HashSet<String> hashSet5 = new HashSet();
                        writableDatabase.beginTransaction();
                        try {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            long millis = currentTimeMillis3 - TimeUnit.HOURS.toMillis(cffa.f183914a.mo6606a().mo81107e());
                            long millis2 = currentTimeMillis3 - TimeUnit.HOURS.toMillis(cffa.f183914a.mo6606a().mo81108f());
                            String[] strArr12 = new String[i5];
                            strArr12[0] = str8;
                            StringBuilder sb = new StringBuilder(87);
                            sb.append("status IN (?, ?) AND timestamp_ms BETWEEN ");
                            sb.append(millis);
                            sb.append(" AND ");
                            sb.append(millis2);
                            String sb2 = sb.toString();
                            String[] strArr13 = new String[2];
                            strArr13[0] = Integer.toString(i5);
                            strArr13[i5] = Integer.toString(2);
                            long j2 = millis2;
                            Cursor query3 = writableDatabase.query(true, "messages", strArr12, sb2, strArr13, "conversation_id", null, null, null);
                            if (query3 != null && query3.moveToFirst()) {
                                do {
                                    hashSet5.add(query3.getString(0));
                                } while (query3.moveToNext());
                                query3.close();
                            }
                            if (!hashSet5.isEmpty()) {
                                String[] strArr14 = new String[i5];
                                strArr14[0] = str8;
                                String[] strArr15 = new String[3];
                                strArr15[0] = Integer.toString(i5);
                                strArr15[i5] = Integer.toString(2);
                                strArr15[2] = Long.toString(j2);
                                Cursor query4 = writableDatabase.query(true, "messages", strArr14, "status IN (?, ?) AND timestamp_ms > ? ", strArr15, "conversation_id", null, null, null);
                                if (query4 != null && query4.moveToFirst()) {
                                    do {
                                        hashSet5.remove(query4.getString(0));
                                    } while (query4.moveToNext());
                                    query4.close();
                                }
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            for (String str25 : hashSet5) {
                                aznz a4 = aznz.m85891a(str25);
                                if (a4 != null) {
                                    String str26 = (String) concurrentHashMap.get(a4.f99775b);
                                    if (!TextUtils.isEmpty(str26)) {
                                        azan azan = azdm.f99094c;
                                        aznz a5 = aznz.m85891a(str25);
                                        if (a5 == null) {
                                            Object[] objArr = new Object[i5];
                                            objArr[0] = str25;
                                            azoj.m85933c("NotificationManager", "Invalid conversation id format:%s", objArr);
                                        } else if (str26 == null || !a5.mo55107e() || cffa.f183914a.mo6606a().mo81103a()) {
                                            azan.mo54536a(a5, false, str26);
                                        } else {
                                            Object[] objArr2 = new Object[i5];
                                            objArr2[0] = a5;
                                            azoj.m85933c("NotificationManager", "Do not renotify Bot conversations:%s", objArr2);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th20) {
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            throw th20;
                        }
                    }
                }
            }
        } catch (SQLiteException e6) {
        }
    }
}
