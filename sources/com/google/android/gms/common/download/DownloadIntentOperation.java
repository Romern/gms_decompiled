package com.google.android.gms.common.download;

import android.app.DownloadManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadIntentOperation extends IntentOperation {

    /* renamed from: c */
    public static final /* synthetic */ int f30182c = 0;

    /* renamed from: d */
    private static final srn f30183d = srn.m36126a("GmsDownloadIntentOp", sgj.DOWNLOAD);

    /* renamed from: e */
    private static final Object f30184e = new Object();

    /* renamed from: f */
    private static final Object f30185f = new Object();

    /* renamed from: g */
    private static final Pattern f30186g = Pattern.compile("[a-zA-Z0-9_\\.]+");

    /* renamed from: h */
    private static boolean f30187h = false;

    /* renamed from: a */
    asfb f30188a;

    /* renamed from: b */
    asfa f30189b;

    /* renamed from: a */
    static SharedPreferences m22553a(Context context) {
        return context.getSharedPreferences("DownloadService", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return null;
     */
    /* renamed from: b */
    public static File m22560b(Context context, String str) {
        synchronized (f30185f) {
            DownloadDetails d = ryd.m34647d(context, str);
            if (d != null && m22561b(context, d)) {
                File a = rye.m34650a(context, d);
                return a;
            }
        }
    }

    /* renamed from: c */
    private final void m22562c() {
        mo17781a(cdev.f180623a.mo6606a().mo77369b());
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
    /* renamed from: d */
    public static void m22565d(Context context, String str) {
        synchronized (f30185f) {
            Uri a = ryd.m34636a(str);
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("enabled", (Integer) 0);
            contentValues.put("retries", (Integer) 0);
            context.getContentResolver().update(a, contentValues, null, null);
        }
    }

    /* renamed from: e */
    public static Status m22566e(Context context, String str) {
        DownloadDetails d = ryd.m34647d(context, str);
        if (d == null) {
            return m22554a(context, 13);
        }
        if (!m22557a(context, d)) {
            return m22554a(context, 7011);
        }
        if (m22559a(context, d.f30175a)) {
            return m22554a(context, 7010);
        }
        if (!m22556a(context, d.f30177c)) {
            return m22554a(context, 7012);
        }
        Cursor query = context.getContentResolver().query(ryd.m34636a(str), ryd.f43851f, null, null, null);
        long j = -1;
        if (query != null) {
            try {
                if (query.moveToNext() && !query.isNull(1)) {
                    j = query.getLong(1);
                }
            } finally {
                query.close();
            }
        }
        int i = 0;
        Cursor a = ryd.m34634a((DownloadManager) context.getSystemService("download"), new DownloadManager.Query().setFilterById(j));
        if (a != null) {
            int columnIndex = a.getColumnIndex("status");
            if (columnIndex != -1) {
                try {
                    if (a.moveToNext()) {
                        i = a.getInt(columnIndex);
                    }
                } finally {
                    a.close();
                }
            } else {
                throw new IllegalArgumentException("Unable to resolve 'COLUMN_STATUS'!");
            }
        }
        if ((i & 7) != 0) {
            return m22554a(context, 7001);
        }
        return m22554a(context, 7000);
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
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0266, code lost:
        r2.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0272, code lost:
        r22 = r3;
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0276, code lost:
        r6 = r6 + 1;
        r4 = r16;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x027e, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0286, code lost:
        if (r2.hasNext() != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0288, code lost:
        r2 = new java.io.File(p000.rye.m34651b(r23));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0295, code lost:
        if (r2.exists() != false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x029c, code lost:
        if (r2.isDirectory() == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x029e, code lost:
        r3 = r2.list();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a2, code lost:
        if (r3 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a4, code lost:
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a6, code lost:
        if (r5 >= r4) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a8, code lost:
        r6 = r3[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ae, code lost:
        if (r0.contains(r6) != false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b0, code lost:
        new java.io.File(r2, r6).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02b8, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02bb, code lost:
        r0 = (android.app.DownloadManager) getSystemService("download");
        r2 = p000.ryd.m34634a(r0, new android.app.DownloadManager.Query().setFilterByStatus(16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d2, code lost:
        if (r2 == null) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02d8, code lost:
        if (r2.moveToNext() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02da, code lost:
        r3 = r2.getLong(r2.getColumnIndexOrThrow("_id"));
        r5 = mo17779a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e8, code lost:
        if (r5 == null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02ea, code lost:
        p000.ryd.m34640a(r1, r5);
        r0.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fe, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0301, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0302, code lost:
        r2 = p000.ryd.m34634a(r0, new android.app.DownloadManager.Query().setFilterByStatus(8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0311, code lost:
        if (r2 == null) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0317, code lost:
        if (r2.moveToNext() == false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0319, code lost:
        r3 = r2.getLong(r2.getColumnIndexOrThrow("_id"));
        r0 = mo17779a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0327, code lost:
        if (r0 == null) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x032d, code lost:
        if (m22559a(r1, r0) != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x032f, code lost:
        r0 = com.google.android.chimera.IntentOperation.getStartIntent(r1, com.google.android.gms.common.download.DownloadCompleteIntentOperation.class, "android.intent.action.DOWNLOAD_COMPLETE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0337, code lost:
        if (r0 == null) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0339, code lost:
        r0.putExtra("extra_download_id", r3);
        startService(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0342, code lost:
        r0 = (p000.bnsl) com.google.android.gms.common.download.DownloadIntentOperation.f30183d.mo68387b();
        r0.mo68432a("com.google.android.gms.common.download.DownloadIntentOperation", "onHandleIntent", 334, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("IntentOperation.getStartIntent() returned null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0355, code lost:
        p000.ryd.m34644b(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035e, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0361, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0362, code lost:
        m22562c();
        r2 = com.google.android.gms.common.download.DownloadIntentOperation.f30184e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0367, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        com.google.android.gms.common.download.DownloadIntentOperation.f30187h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036c, code lost:
        mo17782b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x036f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r3 = (com.google.android.gms.common.download.DownloadDetails) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r4 = (android.app.DownloadManager) getSystemService("download");
        r6 = new android.app.DownloadManager.Request(android.net.Uri.parse(r3.f30176b)).setTitle(r3.f30175a).setVisibleInDownloadsUi(false).setAllowedOverRoaming(false);
        r7 = getContentResolver().query(p000.ryd.m34636a(r3.f30175a), p000.ryd.f43852g, null, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b9, code lost:
        if (r7 != null) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03bb, code lost:
        r7 = (p000.bnsl) p000.ryd.f43846a.mo68387b();
        r7.mo68437a(new java.lang.Exception());
        r7.mo68432a("ryd", "e", 546, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r7.mo68405a("getNotification Cursor was null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03d5, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03db, code lost:
        if (r7.moveToNext() != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03dd, code lost:
        r15 = (p000.bnsl) p000.ryd.f43846a.mo68388c();
        r15.mo68432a("ryd", "e", 551, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r15.mo68405a("No pending download found.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f5, code lost:
        if (r7.isNull(2) != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03fc, code lost:
        if (r7.isNull(3) != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03fe, code lost:
        r13 = new android.util.Pair(r7.getString(2), r7.getString(3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x040f, code lost:
        r7.close();
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0413, code lost:
        if (r13 == null) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0415, code lost:
        r6.setTitle((java.lang.CharSequence) r13.first);
        r6.setDescription((java.lang.CharSequence) r13.second);
        r6.setNotificationVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0428, code lost:
        r6.setNotificationVisibility(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x042c, code lost:
        r5 = p000.ryd.m34636a(r3.f30175a);
        r7 = new android.content.ContentValues(2);
        r7.putNull("notificationTitle");
        r7.putNull("notificationDescription");
        getContentResolver().update(r5, r7, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        p000.ryd.m34641a(r1, r3.f30175a, r4.enqueue(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0454, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x045d, code lost:
        throw new java.lang.IllegalArgumentException("Insert returned null", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x045e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x045f, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0462, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0464, code lost:
        m22562c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0469, code lost:
        monitor-enter(com.google.android.gms.common.download.DownloadIntentOperation.f30184e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        com.google.android.gms.common.download.DownloadIntentOperation.f30187h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0473, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0477, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0479, code lost:
        m22562c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x047e, code lost:
        monitor-enter(com.google.android.gms.common.download.DownloadIntentOperation.f30184e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        com.google.android.gms.common.download.DownloadIntentOperation.f30187h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0483, code lost:
        m22562c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0488, code lost:
        monitor-enter(com.google.android.gms.common.download.DownloadIntentOperation.f30184e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        com.google.android.gms.common.download.DownloadIntentOperation.f30187h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0495, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0496, code lost:
        m22562c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x049b, code lost:
        monitor-enter(com.google.android.gms.common.download.DownloadIntentOperation.f30184e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        com.google.android.gms.common.download.DownloadIntentOperation.f30187h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04a0, code lost:
        mo17782b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04a3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0150, code lost:
        mo17780a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0 = new java.util.TreeSet();
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        new org.json.JSONArray(p000.cdev.m132877b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r3 = new java.util.HashSet();
        getSystemService("download");
        r4 = p000.ryd.m34634a((android.app.DownloadManager) getSystemService("download"), new android.app.DownloadManager.Query().setFilterByStatus(15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0187, code lost:
        if (r4 != null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5 = r4.getColumnIndexOrThrow("_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0194, code lost:
        if (r4.moveToNext() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0196, code lost:
        r6 = p000.ryd.m34637a(r1, r4.getLong(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019e, code lost:
        if (r6 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a0, code lost:
        r3.add(r6.f30175a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a9, code lost:
        r4 = p000.ryd.m34642a(r23);
        r5 = r4.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01af, code lost:
        if (r6 >= r5) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b1, code lost:
        r12 = r4[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b7, code lost:
        if (m22557a(r1, r12) == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b9, code lost:
        r0.add(r12.f30175a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c4, code lost:
        if (r3.contains(r12.f30175a) == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c6, code lost:
        r22 = r3;
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01cc, code lost:
        r17 = p000.ryd.m34636a(r12.f30175a);
        r13 = p000.ryd.f43853h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01da, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r22 = r3;
        r3 = getContentResolver().query(r17, p000.ryd.f43849d, null, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ed, code lost:
        if (r3 != null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ef, code lost:
        r3 = (p000.bnsl) p000.ryd.f43846a.mo68387b();
        r16 = r4;
        r3.mo68437a(new java.lang.Exception());
        r3.mo68432a("ryd", "b", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r3.mo68405a("getDownloadFailedCount Cursor was null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020b, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020c, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020e, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0214, code lost:
        if (r3.moveToNext() != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0219, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021a, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r11 = r3.getInt(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0225, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0233, code lost:
        if (((long) r11) > p000.cdev.f180623a.mo6606a().mo77375h()) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0236, code lost:
        if (r7 == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0238, code lost:
        r3 = p000.ryd.m34636a(r12.f30175a);
        r4 = new android.content.ContentValues(1);
        r4.put("retries", (java.lang.Integer) 0);
        getContentResolver().update(r3, r4, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025c, code lost:
        if (m22559a(r1, r12.f30175a) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0264, code lost:
        if (m22556a(r1, r12.f30177c) == false) goto L_0x0276;
     */
    public final void onHandleIntent(Intent intent) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SharedPreferences a = m22553a(this);
        boolean z2 = false;
        if (intent.hasExtra("boot") || a.getLong("ds__last_process__", 0) > elapsedRealtime || elapsedRealtime - a.getLong("ds__last_reset__", 0) > cdev.f180623a.mo6606a().mo77374g()) {
            a.edit().remove("ds__next_alarm__").putLong("ds__last_reset__", elapsedRealtime).apply();
            z = true;
        } else {
            z = false;
        }
        if (!cdev.f180623a.mo6606a().mo77371d()) {
            m22562c();
            return;
        }
        if (a.contains("ds__downloads_json__")) {
            try {
                SharedPreferences a2 = m22553a(this);
                SharedPreferences.Editor edit = a2.edit();
                JSONArray jSONArray = new JSONArray(a2.getString("ds__downloads_json__", "[]"));
                int i = 0;
                while (i < jSONArray.length()) {
                    DownloadDetails downloadDetails = new DownloadDetails(jSONArray.getJSONObject(i));
                    boolean z3 = a2.getBoolean(String.valueOf(downloadDetails.f30175a).concat("__enabled__"), z2);
                    if (ryd.m34647d(this, downloadDetails.f30175a) == null) {
                        ryd.m34635a(this, downloadDetails, z3);
                    }
                    edit.remove(downloadDetails.f30175a).remove(String.valueOf(downloadDetails.f30175a).concat("__enabled__")).remove(String.valueOf(downloadDetails.f30175a).concat("__sha1__")).remove(String.valueOf(downloadDetails.f30175a).concat("__dest__")).remove(String.valueOf(downloadDetails.f30175a).concat("__failed__"));
                    i++;
                    z2 = false;
                }
                edit.apply();
            } catch (JSONException e) {
                bnsl bnsl = (bnsl) f30183d.mo68387b();
                bnsl.mo68432a("com.google.android.gms.common.download.DownloadIntentOperation", "onHandleIntent", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to migrate from SharedPreferences.");
            } catch (Throwable th) {
                a.edit().remove("ds__downloads_json__").apply();
                throw th;
            }
            a.edit().remove("ds__downloads_json__").apply();
        }
        if (!ssk.m36235a(this)) {
            mo17781a(1800000);
            return;
        }
        synchronized (f30184e) {
            if (!f30187h) {
                f30187h = true;
                a.edit().putLong("ds__last_process__", elapsedRealtime).apply();
            }
        }
    }

    /* renamed from: a */
    private static Status m22554a(Context context, int i) {
        if (i == 7000) {
            return new Status(7000, context.getString(C0126R.string.download_msg_pending), null);
        }
        if (i == 7001) {
            return new Status(7001, context.getString(C0126R.string.download_msg_in_progress), null);
        }
        switch (i) {
            case 7010:
                return new Status(0);
            case 7011:
                return new Status(13, context.getString(C0126R.string.download_msg_error_invalid), null);
            case 7012:
                return new Status(7002, context.getString(C0126R.string.download_msg_not_allowed_space), null);
            default:
                return new Status(i);
        }
    }

    /* renamed from: c */
    public static boolean m22563c(Context context, DownloadDetails downloadDetails) {
        return m22558a(context, downloadDetails, null, null);
    }

    /* renamed from: c */
    public static boolean m22564c(Context context, String str) {
        boolean c;
        synchronized (f30185f) {
            c = ryd.m34646c(context, str);
        }
        return c;
    }

    /* renamed from: b */
    static boolean m22561b(Context context, DownloadDetails downloadDetails) {
        File a = rye.m34650a(context, downloadDetails);
        if (!a.exists()) {
            return false;
        }
        if (downloadDetails.f30178d.equals(m22555a(a))) {
            return true;
        }
        if (!a.getAbsolutePath().startsWith(context.getCacheDir().getAbsolutePath())) {
            return false;
        }
        a.delete();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo17782b() {
        asfa asfa = this.f30189b;
        if (asfa == null) {
            asfb asfb = this.f30188a;
            if (asfb != null) {
                asfb.mo49120c();
            }
        } else {
            asfa.mo49109a();
            this.f30189b = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0046 A[SYNTHETIC, Splitter:B:35:0x0046] */
    /* renamed from: a */
    static synchronized String m22555a(File file) {
        String str;
        synchronized (DownloadIntentOperation.class) {
            MessageDigest b = spn.m35868b("SHA1");
            if (b == null) {
                return "";
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        b.update(bArr, 0, read);
                    }
                    str = srv.m36160a(b.digest());
                    try {
                        fileInputStream2.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    fileInputStream = fileInputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                str = "";
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                    }
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    static boolean m22556a(Context context, long j) {
        StatFs statFs;
        if (!m22553a(context).getBoolean("ds__storage_low__", false)) {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                statFs = new StatFs(cacheDir.getAbsolutePath());
            } else {
                statFs = null;
            }
            if (statFs == null || Math.max((double) ((((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize())) - j), 0.0d) <= Math.min(Math.max((double) (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())), 1.0d) * cdev.f180623a.mo6606a().mo77373f(), (double) cdev.f180623a.mo6606a().mo77368a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m22557a(Context context, DownloadDetails downloadDetails) {
        int b;
        if ((downloadDetails.f30179e != null && !ryd.m34646c(context, downloadDetails.f30175a)) || (b = stu.m36316b()) < downloadDetails.f30180f || b > downloadDetails.f30181g || !f30186g.matcher(downloadDetails.f30175a).matches()) {
            return false;
        }
        if (cdev.f180623a.mo6606a().mo77372e() && !downloadDetails.f30176b.startsWith("https")) {
            return false;
        }
        String str = downloadDetails.f30179e;
        if (str == null || !str.contains("..")) {
            return true;
        }
        return false;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ryd.a(android.content.Context, com.google.android.gms.common.download.DownloadDetails, boolean):android.net.Uri
     arg types: [android.content.Context, com.google.android.gms.common.download.DownloadDetails, int]
     candidates:
      ryd.a(android.content.Context, java.lang.String, long):void
      ryd.a(android.content.Context, com.google.android.gms.common.download.DownloadDetails, boolean):android.net.Uri */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        return true;
     */
    /* renamed from: a */
    public static boolean m22558a(Context context, DownloadDetails downloadDetails, String str, String str2) {
        sdo.m34966a(downloadDetails, "DownloadDetails required");
        synchronized (f30185f) {
            DownloadDetails d = ryd.m34647d(context, downloadDetails.f30175a);
            if (d != null) {
                if (!(!d.equals(downloadDetails))) {
                    Uri a = ryd.m34636a(downloadDetails.f30175a);
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("enabled", (Integer) 1);
                    context.getContentResolver().update(a, contentValues, null, null);
                    if (!m22559a(context, downloadDetails.f30175a)) {
                        if (!(str == null || str2 == null)) {
                            Uri a2 = ryd.m34636a(downloadDetails.f30175a);
                            ContentValues contentValues2 = new ContentValues(2);
                            contentValues2.put("notificationTitle", str);
                            contentValues2.put("notificationDescription", str2);
                            context.getContentResolver().update(a2, contentValues2, null, null);
                            context.startService(rye.m34649a(context));
                        }
                    }
                } else {
                    ryd.m34645b(context, downloadDetails, true);
                }
            } else if (ryd.m34635a(context, downloadDetails, true) == null) {
                return false;
            }
            context.startService(rye.m34649a(context));
        }
    }

    /* renamed from: a */
    public static boolean m22559a(Context context, String str) {
        synchronized (f30185f) {
            DownloadDetails d = ryd.m34647d(context, str);
            if (d == null) {
                return false;
            }
            boolean b = m22561b(context, d);
            return b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo17779a(Cursor cursor, long j) {
        DownloadDetails d;
        DownloadDetails a = ryd.m34637a(this, j);
        if (a != null) {
            return a.f30175a;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        if (string == null || !f30186g.matcher(string).matches() || (d = ryd.m34647d(this, string)) == null) {
            return null;
        }
        return d.f30175a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo17780a() {
        asfb asfb = this.f30188a;
        if (asfb != null) {
            if (asfb.mo49124e()) {
                return;
            }
        }
        asfb asfb2 = new asfb(this, 1, "GmsDownloadIntentOp", null, "com.google.android.gms");
        this.f30188a = asfb2;
        asfb2.mo49115a(false);
        if (!cdev.f180623a.mo6606a().mo77377j()) {
            this.f30188a.mo49111a(60000);
        } else {
            this.f30189b = this.f30188a.mo49116b("DownloadIntentOperation", 60000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17781a(long j) {
        if (j < 60000) {
            j = 60000;
        }
        SharedPreferences a = m22553a(this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        long j3 = a.getLong("ds__next_alarm__", 0);
        if (j3 < elapsedRealtime || (j3 > elapsedRealtime && j3 > j2)) {
            new skc(this).mo25675a(getClass().getSimpleName(), 3, j2, PendingIntent.getService(this, 0, rye.m34649a(this), 134217728), "com.google.android.gms");
            a.edit().putLong("ds__next_alarm__", j2).apply();
        }
    }
}
