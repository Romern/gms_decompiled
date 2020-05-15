package p000;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azon {

    /* renamed from: a */
    private static azon f99795a;

    private azon() {
    }

    /* renamed from: a */
    public static synchronized void m85936a() {
        synchronized (azon.class) {
            if (f99795a == null) {
                f99795a = new azon();
            }
        }
    }

    /* renamed from: a */
    public static final void m85937a(SQLiteDatabase sQLiteDatabase, String str, String str2, Context context) {
        Intent intent;
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sQLiteDatabase.beginTransaction();
        try {
            azcm.m85303a(sQLiteDatabase, context);
            sQLiteDatabase.execSQL("drop index if exists index_conversations_sort");
            sQLiteDatabase.execSQL("drop index if exists index_smartReply_sort");
            sQLiteDatabase.execSQL("drop index if exists index_conversationParticipants_sort");
            StringBuilder sb = new StringBuilder(str.length() + 74 + String.valueOf(str2).length());
            sb.append("UPDATE conversations SET conversation_id = trim(conversation_id, \"");
            sb.append(str);
            sb.append("\") || \"");
            sb.append(str2);
            sb.append("\"");
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder(str.length() + 69 + String.valueOf(str2).length());
            sb2.append("UPDATE messages SET conversation_id = trim(conversation_id, \"");
            sb2.append(str);
            sb2.append("\") || \"");
            sb2.append(str2);
            sb2.append("\"");
            sQLiteDatabase.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder(str.length() + 71 + String.valueOf(str2).length());
            sb3.append("UPDATE smartReply SET conversation_id = trim(conversation_id, \"");
            sb3.append(str);
            sb3.append("\") || \"");
            sb3.append(str2);
            sb3.append("\"");
            sQLiteDatabase.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder(str.length() + 69 + String.valueOf(str2).length());
            sb4.append("UPDATE conversationParticipants SET conv_id = trim(conv_id, \"");
            sb4.append(str);
            sb4.append("\") || \"");
            sb4.append(str2);
            sb4.append("\"");
            sQLiteDatabase.execSQL(sb4.toString());
            sQLiteDatabase.execSQL("CREATE INDEX index_conversations_sort ON conversations(conversation_id);");
            sQLiteDatabase.execSQL("CREATE INDEX index_conversationParticipants_sort ON conversationParticipants(conv_id,participant_type,participant_id);");
            sQLiteDatabase.execSQL("CREATE INDEX index_smartReply_sort ON smartReply(conversation_id, message_id);");
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
            intent = new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS");
        } catch (SQLiteException e) {
            azoj.m85931a("migrationUtil", e, "failed to update conversaiton ID", new Object[0]);
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
            intent = new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS");
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
            MessagingService.m94560d(new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS"), context);
            throw th;
        }
        MessagingService.m94560d(intent, context);
    }
}
