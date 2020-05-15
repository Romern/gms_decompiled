package p000;

import android.content.Context;
import android.database.Cursor;

/* renamed from: azgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f99279a;

    public azgl(Context context) {
        this.f99279a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azan.a(java.lang.String, boolean, boolean):void
     arg types: [java.lang.String, boolean, int]
     candidates:
      azan.a(android.app.Notification$Builder, android.graphics.Bitmap, int):void
      azan.a(aznz, boolean, java.lang.String):void
      azan.a(java.lang.String, boolean, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd A[SYNTHETIC, Splitter:B:26:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce A[Catch:{ all -> 0x00cb, all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    public final void run() {
        long j;
        boolean z;
        azan a = azan.m85141a(this.f99279a);
        azox.m85982b();
        Cursor cursor = null;
        try {
            Cursor query = azcl.m85289a(a.f98857a).getReadableDatabase().query("conversations", new String[]{"conversation_id"}, "blocked = 0", null, null, null, "last_active_timestamp ASC");
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        new Object[1][0] = string;
                        Cursor query2 = azcl.m85289a(a.f98857a).getReadableDatabase().query("conversations", new String[]{"last_dismissed_message", "last_dismissed_in_notification"}, "conversation_id = ?", new String[]{string}, null, null, null, null);
                        long j2 = -1;
                        if (query2 != null) {
                            if (query2.moveToFirst()) {
                                j2 = query2.getLong(0);
                                j = query2.getLong(1);
                            } else {
                                j = -1;
                            }
                            query2.close();
                        } else {
                            j = -1;
                        }
                        long max = Math.max(j2, j);
                        Cursor query3 = azcl.m85289a(a.f98857a).getReadableDatabase().query("messages", new String[]{"_id"}, "conversation_id = ? AND status BETWEEN 30 AND 39 AND _id > ?", new String[]{string, Long.toString(max)}, null, null, null);
                        if (query3 != null) {
                            try {
                                if (query3.getCount() > 0) {
                                    z = true;
                                    if (query3 != null) {
                                        query3.close();
                                    }
                                    a.mo54539a(string, z, false);
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = query3;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        z = false;
                        if (query3 != null) {
                        }
                        a.mo54539a(string, z, false);
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
