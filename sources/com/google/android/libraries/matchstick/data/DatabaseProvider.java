package com.google.android.libraries.matchstick.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DatabaseProvider extends ContentProvider {

    /* renamed from: a */
    private static final UriMatcher f111073a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f111073a = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.matchstick.dataprovider", "sharedPreference", 32);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages", 1);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "conversations", 2);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "conversationParticipants/*", 9);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "media", 3);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "mediaUpload", 21);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "preloadedFiles", 34);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "sticker", 11);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "smartReply/*", 16);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "profile/conversation/*", 15);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "conversation_updated_participants_path/*", 17);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "profile", 8);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "appData/*", 6);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "appData", 7);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "appString/*", 14);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages/draft/*", 13);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages/conversation_history/*", 10);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages/conversation_history/*/*", 12);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "registration/auth_token_path/*/*/*", 22);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages/conversation_history/*/*/*", 23);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages/last_message_id/*", 28);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "messages/conversation_info/*/*", 27);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "profile/profile/*", 29);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "profile/profile/*/*/*", 30);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "media/media_path_download_manager_id/*", 5);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "preloadedFiles/file_path_download_manager_id/*", 33);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "conversation_block_status_path/*", 20);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "user/email_user/*/*/*", 24);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "registration/registration_info/*/*/*", 25);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "user/user_ids/*", 26);
        f111073a.addURI("com.google.android.gms.matchstick.dataprovider", "user", 31);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* renamed from: a */
    public static int m94514a(ContentResolver contentResolver, String str) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = contentResolver.query(m94544h("media"), new String[]{"downloaded_status"}, "message_id = ? ", new String[]{str}, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i = cursor.getInt(0);
                        cursor.close();
                        return i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static Uri m94532b(aznz aznz) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("conversation_updated_participants_path").appendPath(aznz.f99774a).build();
    }

    /* renamed from: c */
    public static Uri m94537c(LocalEntityId localEntityId) {
        return m94544h(String.format("%s/%s/%s/%s/%s", "user", "email_user", localEntityId.f111074a, Integer.toString(localEntityId.f111075b), localEntityId.f111076c));
    }

    /* renamed from: d */
    public static Uri m94540d(String str) {
        return m94544h(String.format("%s/%s/%s", "preloadedFiles", "file_path_download_manager_id", str));
    }

    /* renamed from: e */
    public static Uri m94541e(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("appData").appendPath(str).build();
    }

    /* renamed from: f */
    public static Uri m94542f(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("appString").appendPath(str).build();
    }

    /* renamed from: g */
    public static Uri m94543g(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("smartReply").appendPath(str).build();
    }

    /* renamed from: h */
    public static Uri m94544h(String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.gms.matchstick.dataprovider");
        builder.appendEncodedPath(str);
        return builder.build();
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        int i = -1;
        if (uri == null || f111073a.match(uri) != 10) {
            try {
                SQLiteDatabase writableDatabase = azcl.m85289a(getContext()).getWritableDatabase();
                String a = m94523a(uri);
                writableDatabase.beginTransaction();
                try {
                    int delete = writableDatabase.delete(a, str, strArr);
                    writableDatabase.setTransactionSuccessful();
                    return delete;
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLiteException e) {
                azoj.m85933c("DatabaseProvider", "DB is not available for writing.", new Object[0]);
                return -1;
            }
        } else {
            String lastPathSegment = uri.getLastPathSegment();
            azcm a2 = azcm.m85300a(getContext());
            if (!a2.mo54658b()) {
                azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            } else {
                a2.f98996b.beginTransaction();
                try {
                    a2.f98996b.delete("messages", "conversation_id == ? ", new String[]{lastPathSegment});
                    a2.f98996b.delete("conversationParticipants", "conv_id == ? ", new String[]{lastPathSegment});
                    i = a2.f98996b.delete("conversations", "conversation_id == ? ", new String[]{lastPathSegment});
                    a2.f98996b.setTransactionSuccessful();
                } finally {
                    a2.f98996b.endTransaction();
                }
            }
            return i;
        }
    }

    public final String getType(Uri uri) {
        String a = m94523a(uri);
        return a.length() == 0 ? new String("vnd.android.cursor.dir/vnd.com.google.android.gms.matchstick.dataprovider.") : "vnd.android.cursor.dir/vnd.com.google.android.gms.matchstick.dataprovider.".concat(a);
    }

    /* JADX INFO: finally extract failed */
    public final Uri insert(Uri uri, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = azcl.m85289a(getContext()).getWritableDatabase();
            String a = m94523a(uri);
            writableDatabase.beginTransaction();
            try {
                Long valueOf = Long.valueOf(writableDatabase.insert(a, null, contentValues));
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (valueOf.longValue() != -1) {
                    return ContentUris.withAppendedId(uri, valueOf.longValue());
                }
                return null;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException e) {
            azoj.m85933c("DatabaseProvider", "DB is not available for writing.", new Object[0]);
            return null;
        }
    }

    public final boolean onCreate() {
        return true;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        Cursor cursor;
        SQLiteDatabase a;
        Cursor a2;
        azcm a3;
        azcm a4;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        SQLiteDatabase a5;
        azcm a6;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor3;
        azcm a7;
        azcm a8;
        azcm a9;
        String str5;
        Uri uri2 = uri;
        String[] strArr3 = strArr;
        try {
            SQLiteDatabase a10 = m94515a();
            if (uri2 != null) {
                Object[] objArr = {uri.getAuthority(), uri.getPath()};
                String str6 = "";
                switch (f111073a.match(uri2)) {
                    case 1:
                        str4 = "messages";
                        str3 = str4;
                        a10.beginTransaction();
                        Cursor query = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query;
                    case 2:
                        str4 = "conversations";
                        str3 = str4;
                        a10.beginTransaction();
                        Cursor query2 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query2;
                    case 3:
                        str4 = "media";
                        str3 = str4;
                        a10.beginTransaction();
                        Cursor query22 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query22;
                    case 4:
                    case 5:
                    case 18:
                    case 19:
                    case 33:
                    default:
                        azoj.m85933c("DatabaseProvider", "invalid uri error.", new Object[0]);
                        throw new IllegalArgumentException("Invalid content URI");
                    case 6:
                        cursor = azcd.m85252a(getContext()).mo54598a(uri.getLastPathSegment(), strArr3);
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 7:
                        return azcd.m85252a(getContext()).mo54599a(strArr3);
                    case 8:
                        str3 = "profile";
                        a10.beginTransaction();
                        Cursor query222 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query222;
                    case 9:
                        return azcm.m85307b(m94515a(), uri.getLastPathSegment());
                    case 10:
                        String lastPathSegment = uri.getLastPathSegment();
                        azcm a11 = azcm.m85300a(getContext());
                        a = m94515a();
                        azox.m85982b();
                        a.beginTransaction();
                        boolean H = azdl.m85412a(a11.f98995a).mo54734H();
                        String[] strArr4 = azdc.f99044a;
                        if (H) {
                            StringBuilder sb = new StringBuilder(40);
                            sb.append(" AND timestamp_ms > ");
                            sb.append(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7));
                            str6 = sb.toString();
                        }
                        String valueOf = String.valueOf(str6);
                        cursor = a.query("message_list_view", strArr4, valueOf.length() == 0 ? new String("conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39 OR status BETWEEN 20 AND 29)") : "conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39 OR status BETWEEN 20 AND 29)".concat(valueOf), new String[]{lastPathSegment}, null, null, "server_timestamp_ms ASC", null);
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 11:
                        str3 = "sticker";
                        a10.beginTransaction();
                        Cursor query2222 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query2222;
                    case 12:
                        return azcm.m85300a(getContext()).mo54639a(m94515a(), uri.getPathSegments().get(2), uri.getPathSegments().get(3));
                    case 13:
                        String lastPathSegment2 = uri.getLastPathSegment();
                        azcm a12 = azcm.m85300a(getContext());
                        if (!a12.mo54651a()) {
                            a12.f98996b = azcl.m85289a(a12.f98995a).getReadableDatabase();
                        }
                        return a12.f98996b.query("message_list_view", azdc.f99044a, "status = ? AND conversation_id = ?", new String[]{Integer.toString(40), lastPathSegment2}, null, null, null);
                    case 14:
                        if (!cfeo.m138876g()) {
                            return azcd.m85252a(getContext()).mo54620l(uri.getLastPathSegment());
                        }
                        cursor = azcd.m85252a(getContext()).mo54620l(uri.getLastPathSegment());
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 15:
                        String str7 = uri.getPathSegments().get(2);
                        azdj a13 = azdj.m85399a(getContext());
                        new Object[1][0] = str7;
                        aznz a14 = aznz.m85891a(str7);
                        SQLiteDatabase readableDatabase = a13.f99085a.getReadableDatabase();
                        if (a14.mo55105c()) {
                            a2 = azdj.m85397a(readableDatabase, azcm.m85302a(readableDatabase, a14), azdh.f99074a);
                        } else if (a14.mo55104b()) {
                            a2 = azdj.m85397a(readableDatabase, a14.f99781h, azdh.f99074a);
                        } else {
                            a2 = null;
                        }
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 16:
                        String lastPathSegment3 = uri.getLastPathSegment();
                        a3 = azcm.m85300a(getContext());
                        if (!a3.mo54651a()) {
                            a3.f98996b = azcl.m85289a(a3.f98995a).getReadableDatabase();
                        }
                        a3.f98996b.beginTransaction();
                        List a15 = a3.mo54646a(lastPathSegment3, 1);
                        String str8 = "invalid_msg_id";
                        if (a15 != null && !a15.isEmpty()) {
                            str8 = (String) a15.get(0);
                        }
                        cursor = a3.f98996b.query("smartReply", new String[]{"conversation_id", "message_id", "reply"}, "conversation_id= ? AND message_id= ?", new String[]{lastPathSegment3, str8}, null, null, null, null);
                        a3.f98996b.setTransactionSuccessful();
                        a3.f98996b.endTransaction();
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 17:
                        String lastPathSegment4 = uri.getLastPathSegment();
                        azcm a16 = azcm.m85300a(getContext());
                        int bh = (int) cfeo.f183719a.mo6606a().mo81027bh();
                        new Object[1][0] = azcm.f98990c;
                        aznz a17 = aznz.m85891a(lastPathSegment4);
                        if (a17 != null) {
                            cursor = a16.f98996b.rawQuery(azcm.f98990c, new String[]{lastPathSegment4, a17.f99775b, Long.toString(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis() - TimeUnit.SECONDS.toMillis((long) bh)))});
                        } else {
                            azoj.m85933c("DatabaseOperations", "ConversationId is invalid.", new Object[0]);
                            cursor = null;
                        }
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 20:
                        cursor = azcm.m85300a(getContext()).mo54671h(uri.getLastPathSegment());
                        if (cursor != null) {
                            cursor.setNotificationUri(getContext().getContentResolver(), uri2);
                        }
                        return cursor;
                    case 21:
                        str3 = "mediaUpload";
                        a10.beginTransaction();
                        Cursor query22222 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query22222;
                    case 22:
                        a4 = azcm.m85300a(getContext());
                        LocalEntityId localEntityId = new LocalEntityId(uri.getPathSegments().get(2), Integer.parseInt(uri.getPathSegments().get(3)), uri.getPathSegments().get(4));
                        if (!a4.mo54651a()) {
                            a4.f98996b = azcl.m85289a(a4.f98995a).getReadableDatabase();
                        }
                        byte[] a18 = a4.mo54654a(localEntityId);
                        if (a18 == null) {
                            String valueOf2 = String.valueOf(localEntityId);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                            sb2.append("Failed to get registration ID for user ");
                            sb2.append(valueOf2);
                            azoj.m85933c("DatabaseOperations", sb2.toString(), new Object[0]);
                            azph.m85998a(a4.f98995a).mo55170c(1108, 49);
                            return null;
                        }
                        a4.f98996b.beginTransaction();
                        try {
                            cursor2 = a4.f98996b.query("registration", new String[]{"server_registration_id", "auth_token", "auth_token_expiration_timestamp_ms", "account_type"}, "server_registration_id = ? ", new String[]{azpi.m86066a(a18)}, null, null, null);
                            try {
                                a4.f98996b.setTransactionSuccessful();
                                sQLiteDatabase = a4.f98996b;
                            } catch (SQLiteException e) {
                                azoj.m85933c("DatabaseOperations", "Failed to get token", new Object[0]);
                                sQLiteDatabase = a4.f98996b;
                                sQLiteDatabase.endTransaction();
                                return cursor2;
                            }
                        } catch (SQLiteException e2) {
                            cursor2 = null;
                            azoj.m85933c("DatabaseOperations", "Failed to get token", new Object[0]);
                            sQLiteDatabase = a4.f98996b;
                            sQLiteDatabase.endTransaction();
                            return cursor2;
                        }
                        sQLiteDatabase.endTransaction();
                        return cursor2;
                    case 23:
                        String str9 = uri.getPathSegments().get(2);
                        String str10 = uri.getPathSegments().get(3);
                        String str11 = uri.getPathSegments().get(4);
                        azox.m85982b();
                        a5 = m94515a();
                        a5.beginTransaction();
                        boolean H2 = azdl.m85412a(getContext()).mo54734H();
                        String[] strArr5 = azdc.f99044a;
                        if (H2) {
                            StringBuilder sb3 = new StringBuilder(40);
                            sb3.append(" AND timestamp_ms > ");
                            sb3.append(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(7));
                            str6 = sb3.toString();
                        }
                        String valueOf3 = String.valueOf(str6);
                        Cursor query3 = a5.query("message_list_view", strArr5, valueOf3.length() == 0 ? new String("conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39 OR status BETWEEN 20 AND 29) AND timestamp_ms >= ?") : "conversation_id = ? AND (status BETWEEN 1 AND 19 OR status BETWEEN 30 AND 39 OR status BETWEEN 20 AND 29) AND timestamp_ms >= ?".concat(valueOf3), new String[]{str9, str10}, null, null, "timestamp_ms ASC", str11);
                        a5.setTransactionSuccessful();
                        a5.endTransaction();
                        return query3;
                    case 24:
                        a6 = azcm.m85300a(getContext());
                        LocalEntityId localEntityId2 = new LocalEntityId(uri.getPathSegments().get(2), Integer.parseInt(uri.getPathSegments().get(3)), uri.getPathSegments().get(4));
                        if (localEntityId2.f111075b == 1) {
                            if (!a6.mo54651a()) {
                                a6.f98996b = azcl.m85289a(a6.f98995a).getReadableDatabase();
                            }
                            if (a6.mo54654a(localEntityId2) != null) {
                                byte[] a19 = a6.mo54654a(localEntityId2);
                                if (a19 == null) {
                                    azoj.m85933c("DatabaseOperations", "registrationId not available for %s.", localEntityId2.toString());
                                    return null;
                                }
                                String a20 = azpi.m86066a(a19);
                                a6.f98996b.beginTransaction();
                                try {
                                    cursor3 = a6.f98996b.query("user", new String[]{"id"}, "type = ? AND registration_id = ?", new String[]{Integer.toString(7), a20}, null, null, null);
                                    try {
                                        a6.f98996b.setTransactionSuccessful();
                                        sQLiteDatabase2 = a6.f98996b;
                                    } catch (SQLiteException e3) {
                                        azoj.m85933c("DatabaseOperations", "Failed to get email user", new Object[0]);
                                        sQLiteDatabase2 = a6.f98996b;
                                        sQLiteDatabase2.endTransaction();
                                        return cursor3;
                                    }
                                } catch (SQLiteException e4) {
                                    cursor3 = null;
                                    azoj.m85933c("DatabaseOperations", "Failed to get email user", new Object[0]);
                                    sQLiteDatabase2 = a6.f98996b;
                                    sQLiteDatabase2.endTransaction();
                                    return cursor3;
                                }
                                sQLiteDatabase2.endTransaction();
                                return cursor3;
                            }
                        }
                        return null;
                    case 25:
                        azcm a21 = azcm.m85300a(getContext());
                        LocalEntityId localEntityId3 = new LocalEntityId(uri.getPathSegments().get(2), Integer.parseInt(uri.getPathSegments().get(3)), uri.getPathSegments().get(4));
                        if (!a21.mo54651a()) {
                            a21.f98996b = azcl.m85289a(a21.f98995a).getReadableDatabase();
                        }
                        return a21.mo54640a(a21.mo54654a(localEntityId3));
                    case 26:
                        return azcm.m85300a(getContext()).mo54672i(uri.getPathSegments().get(2));
                    case 27:
                        String str12 = uri.getPathSegments().get(2);
                        String str13 = uri.getPathSegments().get(3);
                        a7 = azcm.m85300a(getContext());
                        if (!a7.mo54651a()) {
                            a7.f98996b = azcl.m85289a(a7.f98995a).getReadableDatabase();
                        }
                        a7.f98996b.beginTransaction();
                        Cursor query4 = a7.f98996b.query(true, "message_list_view", new String[]{"conversation_id", "display_id", "profile_name", "sender_profile_id"}, "app_id = ?  AND entity_id = ? ", new String[]{str12, str13}, null, null, "conversation_id", null);
                        a7.f98996b.setTransactionSuccessful();
                        a7.f98996b.endTransaction();
                        return query4;
                    case 28:
                        return azcm.m85300a(getContext()).mo54655b(uri.getPathSegments().get(2), 1);
                    case 29:
                        int parseInt = Integer.parseInt(uri.getPathSegments().get(2));
                        a8 = azcm.m85300a(getContext());
                        long j = (long) parseInt;
                        if (!a8.mo54651a()) {
                            a8.f98996b = azcl.m85289a(a8.f98995a).getReadableDatabase();
                        }
                        a8.f98996b.beginTransaction();
                        Cursor query5 = a8.f98996b.query("profile", azdh.f99074a, "_id = ?", new String[]{String.valueOf(j)}, null, null, null, null);
                        a8.f98996b.setTransactionSuccessful();
                        a8.f98996b.endTransaction();
                        return query5;
                    case 30:
                        String str14 = uri.getPathSegments().get(3);
                        int parseInt2 = Integer.parseInt(uri.getPathSegments().get(4));
                        a9 = azcm.m85300a(getContext());
                        LocalEntityId localEntityId4 = new LocalEntityId(str14, parseInt2, uri.getPathSegments().get(2));
                        if (!a9.mo54651a()) {
                            a9.f98996b = azcl.m85289a(a9.f98995a).getReadableDatabase();
                        }
                        a9.f98996b.beginTransaction();
                        Cursor query6 = a9.f98996b.query("profile", azdh.f99074a, "entity_id = ? AND entity_type = ? AND app_id = ?", new String[]{localEntityId4.f111074a, String.valueOf(localEntityId4.f111075b), localEntityId4.f111076c}, null, null, null, null);
                        a9.f98996b.setTransactionSuccessful();
                        a9.f98996b.endTransaction();
                        return query6;
                    case 31:
                        str5 = "user";
                        str3 = str5;
                        a10.beginTransaction();
                        Cursor query222222 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query222222;
                    case 32:
                        str5 = "sharedPreference";
                        str3 = str5;
                        a10.beginTransaction();
                        Cursor query2222222 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query2222222;
                    case 34:
                        str3 = "preloadedFiles";
                        a10.beginTransaction();
                        Cursor query22222222 = a10.query(str3, strArr, str, strArr2, null, null, str2);
                        a10.setTransactionSuccessful();
                        a10.endTransaction();
                        return query22222222;
                }
            } else {
                throw new IllegalArgumentException("Invalid content URI");
            }
        } catch (IllegalArgumentException e5) {
            new Object[1][0] = e5;
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            a9.f98996b.endTransaction();
            throw th2;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = azcl.m85289a(getContext()).getWritableDatabase();
            String a = m94523a(uri);
            writableDatabase.beginTransaction();
            try {
                int update = writableDatabase.update(a, contentValues, str, strArr);
                writableDatabase.setTransactionSuccessful();
                return update;
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            azoj.m85933c("DatabaseProvider", "DB is not available for writing.", new Object[0]);
            return -1;
        }
    }

    /* renamed from: b */
    public static Uri m94533b(LocalEntityId localEntityId) {
        return m94544h(String.format("%s/%s/%s/%s/%s", "registration", "registration_info", localEntityId.f111074a, Integer.toString(localEntityId.f111075b), localEntityId.f111076c));
    }

    /* renamed from: c */
    public static Uri m94538c(String str) {
        return m94544h(String.format("%s/%s/%s", "media", "media_path_download_manager_id", str));
    }

    /* renamed from: b */
    public static Uri m94534b(String str) {
        return m94544h(String.format("%s/%s/%s", "messages", "conversation_history", str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* renamed from: c */
    public static String m94539c(ContentResolver contentResolver, String str) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(m94544h("media"), new String[]{"downloaded_file_uri"}, "message_id = ? AND downloaded_status = ?", new String[]{str, Integer.toString(2)}, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(0);
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final SQLiteDatabase m94515a() {
        return azcl.m85289a(getContext()).getReadableDatabase();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* renamed from: b */
    public static azda m94535b(ContentResolver contentResolver, long j) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(m94544h("media"), azcz.f99025a, "download_manager_id = ? ", new String[]{Long.toString(j)}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        azda a = azda.m85384a(query);
                        query.close();
                        return a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static Uri m94516a(long j) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("profile").appendPath(Long.toString(j)).build();
    }

    /* renamed from: a */
    public static Uri m94517a(aznz aznz) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("profile").appendPath("conversation").appendPath(aznz.f99774a).build();
    }

    /* renamed from: a */
    public static Uri m94518a(LocalEntityId localEntityId) {
        return m94544h(String.format("%s/%s/%s/%s/%s", "registration", "auth_token_path", localEntityId.f111074a, Integer.toString(localEntityId.f111075b), localEntityId.f111076c));
    }

    /* renamed from: a */
    public static Uri m94519a(String str) {
        return m94544h(String.format("%s/%s/%s", "messages", "draft", str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* renamed from: b */
    public static azda m94536b(ContentResolver contentResolver, String str) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(m94544h("media"), azcz.f99025a, "message_id = ? ", new String[]{str}, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        azda a = azda.m85384a(query);
                        query.close();
                        return a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static Uri m94520a(byte[] bArr) {
        return m94544h(String.format("%s/%s/%s", "user", "user_ids", azpi.m86066a(bArr)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    public static azdf m94521a(ContentResolver contentResolver, long j) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(m94544h("preloadedFiles"), azde.f99063a, "download_manager_id = ?", new String[]{String.valueOf(j)}, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        azdf a = azdf.m85394a(query);
                        query.close();
                        return a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: a */
    public static azdi m94522a(ContentResolver contentResolver, LocalEntityId localEntityId) {
        Throwable th;
        azox.m85982b();
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("profile").build(), azdh.f99074a, "entity_id = ? AND entity_type = ? AND app_id = ?", azdj.m85401a(localEntityId), null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        azdi a = azdi.m85395a(query);
                        query.close();
                        return a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static String m94523a(Uri uri) {
        if (uri != null) {
            int match = f111073a.match(uri);
            if (match == 1) {
                return "messages";
            }
            if (match == 2) {
                return "conversations";
            }
            if (match == 3) {
                return "media";
            }
            if (match == 11) {
                return "sticker";
            }
            if (match == 13) {
                return "messages";
            }
            if (match == 16) {
                return "smartReply";
            }
            if (match == 21) {
                return "mediaUpload";
            }
            if (match == 34) {
                return "preloadedFiles";
            }
            switch (match) {
                case 6:
                case 7:
                    return "appData";
                case 8:
                    return "profile";
                case 9:
                    return "conversationParticipants";
                default:
                    throw new IllegalArgumentException("Invalid content URI");
            }
        } else {
            throw new IllegalArgumentException("Invalid content URI");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* renamed from: a */
    public static List m94524a(ContentResolver contentResolver) {
        Cursor cursor;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = contentResolver.query(m94544h("conversations"), new String[]{"conversation_id"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        do {
                            arrayList.add(cursor.getString(0));
                        } while (cursor.moveToNext());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* renamed from: a */
    public static List m94525a(ContentResolver contentResolver, aznz aznz) {
        Cursor cursor;
        azox.m85982b();
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (!aznz.mo55108f() || !aznz.mo55105c()) {
            try {
                cursor = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("conversationParticipants").appendPath(aznz.f99774a).build(), null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            do {
                                arrayList.add(new LocalEntityId(cursor.getString(0), LocalEntityId.m94546a(cursor.getInt(1)), aznz.f99775b));
                            } while (cursor.moveToNext());
                            if (cursor != null) {
                                cursor.close();
                            }
                            return bngx.m109368a((Collection) arrayList);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                azoj.m85933c("DatabaseProvider", "No participants found for conversation id:%s", aznz.f99774a);
                if (cursor != null) {
                }
                return bngx.m109368a((Collection) arrayList);
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            if (aznz.f99781h == null) {
                z = false;
            }
            bmxy.m108588a(z);
            return Collections.singletonList(aznz.f99781h);
        }
    }

    /* renamed from: a */
    public static void m94526a(ContentResolver contentResolver, long j, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("downloaded_status", Integer.valueOf(i));
        contentValues.put("last_modified_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        if (i == 2) {
            contentValues.put("downloaded_file_uri", str);
        }
        if (contentResolver.update(m94544h("media"), contentValues, "download_manager_id = ? ", new String[]{Long.toString(j)}) <= 0) {
            Object[] objArr = {Long.valueOf(j), str};
        } else {
            new Object[1][0] = str;
        }
    }

    /* renamed from: a */
    public static void m94527a(ContentResolver contentResolver, long j, int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("download_status", Integer.valueOf(i));
        contentValues.put("download_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        if (i == 2) {
            contentValues.put("local_file_uri", str);
            contentValues.put("downloaded_file_uri", str2);
        }
        if (contentResolver.update(m94544h("preloadedFiles"), contentValues, "download_manager_id = ? ", new String[]{Long.toString(j)}) <= 0) {
            Object[] objArr = {Long.valueOf(j), str};
        } else {
            Object[] objArr2 = {str, str2};
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
    public static void m94528a(ContentResolver contentResolver, String str, long j, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("download_manager_id", Long.valueOf(j));
        contentValues.put("downloaded_status", (Integer) 1);
        contentValues.put("downloaded_file_uri", str2);
        contentValues.put("last_modified_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        if (contentResolver.update(m94544h("media"), contentValues, "message_id = ? ", new String[]{str}) > 0) {
            new Object[1][0] = str;
        } else {
            new Object[1][0] = str;
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
    public static void m94529a(ContentResolver contentResolver, String str, String str2, long j) {
        new Object[1][0] = str2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("web_download_url", str2);
        contentValues.put("download_manager_id", Long.valueOf(j));
        contentValues.put("download_status", (Integer) 1);
        contentResolver.insert(m94544h("preloadedFiles"), contentValues);
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
    public static void m94530a(ContentResolver contentResolver, byte[] bArr, long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_id", bArr);
        Long valueOf = Long.valueOf(j);
        contentValues.put("download_manager_id", valueOf);
        contentValues.put("message_id", str);
        contentValues.put("downloaded_status", (Integer) 1);
        contentValues.put("encrypted", (Boolean) false);
        if (contentResolver.insert(m94544h("media"), contentValues) == null) {
            Object[] objArr = {bArr, str};
        } else {
            Object[] objArr2 = {bArr, valueOf};
        }
    }

    /* renamed from: a */
    public static boolean m94531a(ContentResolver contentResolver, String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        Boolean valueOf = Boolean.valueOf(z);
        contentValues.put("blocked", valueOf);
        int update = contentResolver.update(m94544h("conversations"), contentValues, "conversation_id = ? ", new String[]{str});
        contentResolver.notifyChange(new Uri.Builder().scheme("content").authority("com.google.android.gms.matchstick.dataprovider").appendPath("conversation_block_status_path").appendPath(str).build(), null);
        Object[] objArr = {str, valueOf};
        return update > 0;
    }
}
