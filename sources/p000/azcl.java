package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: azcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcl extends srp {

    /* renamed from: b */
    public static final String[] f98981b = {"CREATE TABLE appData(_id INTEGER PRIMARY KEY AUTOINCREMENT, pid TEXT UNIQUE, sid TEXT UNIQUE NOT NULL, name TEXT, locale TEXT, icon BLOB, nicon BLOB, nicon_color TEXT, blocked INTEGER DEFAULT 0, last_sync INTEGER DEFAULT 0, status INTEGER DEFAULT 0, install_url TEXT, first_time_notification_clicked INTEGER DEFAULT 0, first_time_reply_sent INTEGER DEFAULT 0, last_conversation_install_clicked TEXT, background_image BLOB, onboarding_message TEXT, offboarding_message TEXT, app_ui_config BLOB, app_theme BLOB, app_string_tag_mapping BLOB, non_image_app_metadata_version TEXT, image_app_metadata_version TEXT, default_user_id TEXT DEFAULT NULL, default_user_type INTEGER DEFAULT 0, default_user_app_id TEXT DEFAULT NULL, FOREIGN KEY(default_user_id, default_user_type, default_user_app_id) REFERENCES user(id, type, app_id) ON DELETE SET DEFAULT );", "CREATE TABLE appString(_id INTEGER PRIMARY KEY AUTOINCREMENT, app_id TEXT NOT NULL, string_id INTEGER, string_value TEXT, FOREIGN KEY (app_id) REFERENCES appData(sid) ON DELETE CASCADE );", "CREATE TABLE conversations(_id INTEGER PRIMARY KEY AUTOINCREMENT, conversation_id TEXT UNIQUE, display_name TEXT, participants BLOB, last_read_message INTEGER DEFAULT -1, last_dismissed_message INTEGER DEFAULT -1, last_active_timestamp INTEGER DEFAULT CURRENT_TIMESTAMP, blocked INTEGER DEFAULT 0, last_dismissed_in_notification INTEGER DEFAULT -1, last_notified INTEGER DEFAULT -1, outgoing_message_properties BLOB, sender_properties BLOB);", "CREATE TABLE messages(_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id TEXT UNIQUE, sender_id TEXT, sender_id_display TEXT, sender_id_type INTEGER DEFAULT 0, conversation_id TEXT, status INTEGER DEFAULT 0, timestamp_ms INTEGER DEFAULT 0, server_timestamp_ms INTEGER DEFAULT 0, content_type TEXT, message_type TEXT, content BLOB, sender_profile_id INTEGER DEFAULT -1, exported_data BLOB, error_code INTEGER DEFAULT 0, message_properties BLOB, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE );", "CREATE TABLE profile ( _id INTEGER PRIMARY KEY AUTOINCREMENT, entity_id TEXT NOT NULL, entity_type INTEGER DEFAULT 0, app_id TEXT NOT NULL, display_id TEXT, profile_name TEXT, last_sync_timestamp INTEGER DEFAULT 0, status INTEGER DEFAULT 0, thumbnail BLOB, blocked INTEGER DEFAULT 0, data BLOB,  FOREIGN KEY (app_id) REFERENCES appData(sid),  UNIQUE ( entity_id, entity_type, app_id )  );", "CREATE TABLE conversationParticipants(_id INTEGER PRIMARY KEY AUTOINCREMENT, conv_id TEXT, participant_type INTEGER DEFAULT 0, participant_id TEXT,  UNIQUE ( conv_id, participant_type, participant_id ) );", "CREATE TABLE media(message_id TEXT UNIQUE, media_id BLOB, download_manager_id INTEGER UNIQUE, downloaded_file_uri TEXT, downloaded_status INTEGER DEFAULT 0, last_modified_timestamp_ms INTEGER DEFAULT CURRENT_TIMESTAMP, encrypted INTEGER DEFAULT 0);", "CREATE TABLE mediaUpload(message_id TEXT UNIQUE, media_id BLOB, local_file_uri TEXT, upload_status INTEGER DEFAULT 0, last_modified_timestamp_ms INTEGER DEFAULT CURRENT_TIMESTAMP);", "CREATE TABLE sticker(download_uri TEXT UNIQUE, download_status INTEGER DEFAULT 0, storage_uri TEXT );", "CREATE TABLE sharedPreference (key TEXT, type INTEGER, value TEXT, UNIQUE (key) ON CONFLICT REPLACE );", "CREATE TABLE smartReply(_id INTEGER PRIMARY KEY AUTOINCREMENT, conversation_id TEXT NOT NULL, message_id TEXT UNIQUE NOT NULL, reply BLOB, FOREIGN KEY (message_id) REFERENCES messages(message_id) ON DELETE CASCADE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE );", azbu.f98925c, "CREATE TABLE registration (server_registration_id TEXT PRIMARY KEY, auth_token BLOB, auth_token_expiration_timestamp_ms INTEGER, gcm_token TEXT, id_key_public BLOB, id_key_private BLOB, id_key_type INTEGER, capabilities TEXT, status INTEGER, txn_timestamp_us INTEGER, last_token_refresh_timestamp_us INTEGER, account_type INTEGER default 0, deletion_policy BLOB);", "CREATE TABLE user (id TEXT, type INTEGER, app_id TEXT, display_id TEXT, registration_id TEXT, is_primary_device INTEGER DEFAULT 0,  UNIQUE (id, type, app_id) ON CONFLICT REPLACE FOREIGN KEY(registration_id) REFERENCES registration(server_registration_id));", "CREATE TABLE preloadedFiles (web_download_url TEXT PRIMARY KEY, downloaded_file_uri TEXT, local_file_uri TEXT, download_manager_id INTEGER, download_status INTEGER, download_timestamp_ms INTEGER, last_accessed_timestamp_ms INTEGER, app_id TEXT);"};

    /* renamed from: c */
    private static final String[] f98982c = {"name"};

    /* renamed from: d */
    private static final Object f98983d = new Object();

    /* renamed from: e */
    private static azcl f98984e;

    /* renamed from: f */
    private static final String f98985f;

    /* renamed from: g */
    private static final String[] f98986g = {"CREATE INDEX index_appData_sort ON appData(sid);", "CREATE INDEX index_appString_sort ON appString(app_id, string_id);", "CREATE INDEX index_messages_sort ON messages(conversation_id, status, server_timestamp_ms);", "CREATE INDEX index_conversations_sort ON conversations(conversation_id);", "CREATE INDEX index_profile_sort ON profile(app_id, entity_type, entity_id);", "CREATE INDEX index_conversationParticipants_sort ON conversationParticipants(conv_id,participant_type,participant_id);", "CREATE INDEX index_media_sort ON media(message_id);", "CREATE INDEX index_media_download_id_sort ON media(download_manager_id);", "CREATE INDEX index_mediaUpload_sort ON mediaUpload(message_id);", "CREATE INDEX index_sticker_sort ON sticker(download_uri);", "CREATE INDEX index_smartReply_sort ON smartReply(conversation_id, message_id);", "CREATE INDEX index_tachystickreachability_sort ON tachystickreachability(id, id_type);", "CREATE INDEX index_tachystickreachability_package_sort ON tachystickreachability (last_sync_package);"};

    /* renamed from: h */
    private static final String[] f98987h = {"CREATE TRIGGER update_message_state_trigger AFTER UPDATE OF status ON messages FOR EACH ROW WHEN NEW.status != OLD.status BEGIN UPDATE conversations SET last_active_timestamp = CURRENT_TIMESTAMP WHERE conversation_id = OLD.conversation_id; END;", "CREATE TRIGGER insert_message_trigger AFTER INSERT ON messages FOR EACH ROW WHEN EXISTS ( SELECT _id FROM conversations WHERE conversation_id == NEW.conversation_id) BEGIN UPDATE conversations SET last_active_timestamp = CURRENT_TIMESTAMP WHERE conversation_id = NEW.conversation_id; END;", "CREATE TRIGGER insert_first_message_trigger AFTER INSERT ON messages FOR EACH ROW WHEN NOT EXISTS ( SELECT _id FROM conversations WHERE conversation_id == NEW.conversation_id) BEGIN INSERT INTO conversations(conversation_id, blocked) VALUES(NEW.conversation_id, 0); END;", "CREATE TRIGGER block_conversation_trigger UPDATE OF blocked ON conversations FOR EACH ROW WHEN NEW.blocked == 1 BEGIN DELETE FROM messages WHERE conversation_id == old.conversation_id; END;", "CREATE TRIGGER update_app_sync_status_trigger AFTER UPDATE OF status ON appData BEGIN UPDATE appData SET status=OLD.status & (CASE NEW.status WHEN 0 THEN 0 ELSE ~0 END)&(CASE NEW.status&15 WHEN 0 THEN ~0 ELSE ~15 END)&(CASE NEW.status&3840 WHEN 0 THEN ~0 ELSE ~3840 END) | NEW.status WHERE _id = OLD._id; END;", "CREATE TRIGGER update_default_user_trigger AFTER DELETE ON user BEGIN UPDATE appData SET default_user_id = Null, default_user_type = 0, default_user_app_id = Null  WHERE default_user_id = OLD.id AND default_user_type = OLD.type AND default_user_app_id = OLD.app_id; END;"};

    /* renamed from: i */
    private static final String[] f98988i = {f98985f};

    /* renamed from: a */
    public final Context f98989a;

    static {
        String a = m85290a("messages", "_id");
        String a2 = m85290a("messages", "message_id");
        String a3 = m85290a("messages", "timestamp_ms");
        String a4 = m85290a("messages", "status");
        String a5 = m85290a("messages", "content");
        String a6 = m85290a("messages", "content_type");
        String a7 = m85290a("messages", "message_type");
        String a8 = m85290a("messages", "server_timestamp_ms");
        String a9 = m85290a("messages", "conversation_id");
        String a10 = m85290a("messages", "sender_profile_id");
        String a11 = m85290a("messages", "message_properties");
        String a12 = m85290a("profile", "entity_id");
        String a13 = m85290a("profile", "entity_type");
        String a14 = m85290a("profile", "app_id");
        String a15 = m85290a("profile", "display_id");
        String a16 = m85290a("profile", "profile_name");
        String a17 = m85290a("messages", "sender_profile_id");
        String a18 = m85290a("profile", "_id");
        String a19 = m85290a("messages", "error_code");
        int length = String.valueOf(a).length() + 364 + String.valueOf(a2).length() + String.valueOf(a3).length() + String.valueOf(a4).length() + String.valueOf(a5).length() + String.valueOf(a6).length() + String.valueOf(a7).length();
        int length2 = String.valueOf(a8).length();
        int length3 = String.valueOf(a9).length();
        int length4 = String.valueOf(a10).length();
        int length5 = String.valueOf(a11).length();
        int length6 = String.valueOf(a12).length();
        int length7 = String.valueOf(a13).length();
        int length8 = String.valueOf(a14).length();
        int length9 = String.valueOf(a15).length();
        int length10 = String.valueOf(a16).length();
        int length11 = String.valueOf(a17).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(a18).length() + String.valueOf(a19).length());
        sb.append("CREATE VIEW message_list_view AS  SELECT ");
        sb.append(a);
        sb.append(" AS _id, ");
        sb.append(a2);
        sb.append(" AS message_id, ");
        sb.append(a3);
        sb.append(" AS timestamp_ms, ");
        sb.append(a4);
        sb.append(" AS status, ");
        sb.append(a5);
        sb.append(" AS content, ");
        sb.append(a6);
        sb.append(" AS content_type, ");
        sb.append(a7);
        sb.append(" AS message_type, ");
        sb.append(a8);
        sb.append(" AS server_timestamp_ms, ");
        sb.append(a9);
        sb.append(" AS conversation_id, ");
        sb.append(a10);
        sb.append(" AS sender_profile_id, ");
        sb.append(a11);
        sb.append(" AS message_properties, ");
        sb.append(a12);
        sb.append(" AS entity_id, ");
        sb.append(a13);
        sb.append(" AS entity_type, ");
        sb.append(a14);
        sb.append(" AS app_id, ");
        sb.append(a15);
        sb.append(" AS display_id,");
        sb.append(a16);
        sb.append(" AS profile_name FROM messages LEFT JOIN profile ON ");
        sb.append(a17);
        sb.append(" = ");
        sb.append(a18);
        sb.append(" WHERE ");
        sb.append(a19);
        sb.append(" = 0;");
        f98985f = sb.toString();
    }

    /* renamed from: a */
    private static ContentValues m85288a(cbbn cbbn, String str) {
        int i;
        cbbu cbbu;
        cbbx cbbx;
        cbbq cbbq;
        cbbq cbbq2;
        cbbq cbbq3;
        cbbq cbbq4;
        cbbq cbbq5;
        cbmf cbmf;
        cbbq cbbq6;
        cbbq cbbq7;
        cbbq cbbq8;
        cbbq cbbq9;
        ContentValues contentValues = new ContentValues();
        String str2 = "application/unkown";
        if (cbbn == null || cbbn.f176596a.size() <= 0) {
            contentValues.put("message_type", str2);
            contentValues.putNull("content_type");
            contentValues.putNull("content");
            return contentValues;
        }
        bxvd da = bxte.f164763c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.FireballMessage".getClass();
        ((bxte) da.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.FireballMessage";
        bxtx aL = cbbn.mo73639aL();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aL.getClass();
        ((bxte) da.f164949b).f164766b = aL;
        contentValues.put("exported_data", ((bxte) da.mo74062i()).mo73642k());
        cbbt cbbt = (cbbt) cbbn.f176596a.get(0);
        int i2 = cbbt.f176617c;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 2;
        }
        if (i == 0) {
            i = 1;
        }
        int i3 = i - 2;
        if (i3 == 2) {
            str2 = "application/botresponse-unsupported";
        } else if (i3 != 3) {
            if (i3 == 4) {
                if (cbbt.f176615a == 4) {
                    cbbq = (cbbq) cbbt.f176616b;
                } else {
                    cbbq = cbbq.f176602h;
                }
                if (cbbq.f176604a == 50) {
                    if (cbbt.f176615a == 4) {
                        cbbq2 = (cbbq) cbbt.f176616b;
                    } else {
                        cbbq2 = cbbq.f176602h;
                    }
                    if (!cbbq2.f176606c.isEmpty()) {
                        if (cbbt.f176615a == 4) {
                            cbbq3 = (cbbq) cbbt.f176616b;
                        } else {
                            cbbq3 = cbbq.f176602h;
                        }
                        if (!cbbq3.f176608e.mo73779j()) {
                            bxvd da2 = cbil.f177257h.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((cbil) da2.f164949b).f177261c = cbik.m127887a(4);
                            bxvd da3 = cbin.f177270f.mo74144da();
                            if (cbbt.f176615a != 4) {
                                cbbq4 = cbbq.f176602h;
                            } else {
                                cbbq4 = (cbbq) cbbt.f176616b;
                            }
                            String str3 = cbbq4.f176606c;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            str3.getClass();
                            ((cbin) da3.f164949b).f177274c = str3;
                            if (cbbt.f176615a == 4) {
                                cbbq5 = (cbbq) cbbt.f176616b;
                            } else {
                                cbbq5 = cbbq.f176602h;
                            }
                            if (cbbq5.f176604a == 50) {
                                cbmf = (cbmf) cbbq5.f176605b;
                            } else {
                                cbmf = cbmf.f177611d;
                            }
                            bxtx aL2 = cbmf.mo73639aL();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            cbin cbin = (cbin) da3.f164949b;
                            aL2.getClass();
                            cbin.f177272a = 5;
                            cbin.f177273b = aL2;
                            bxvd da4 = cbio.f177277c.mo74144da();
                            if (cbbt.f176615a != 4) {
                                cbbq6 = cbbq.f176602h;
                            } else {
                                cbbq6 = (cbbq) cbbt.f176616b;
                            }
                            int i4 = cbbq6.f176607d;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            ((cbio) da4.f164949b).f177280b = i4;
                            bxvd da5 = cbhy.f177214d.mo74144da();
                            if (cbbt.f176615a != 4) {
                                cbbq7 = cbbq.f176602h;
                            } else {
                                cbbq7 = (cbbq) cbbt.f176616b;
                            }
                            bxtx bxtx = cbbq7.f176608e;
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            cbhy cbhy = (cbhy) da5.f164949b;
                            bxtx.getClass();
                            cbhy.f177216a = 1;
                            cbhy.f177217b = bxtx;
                            if (cbbt.f176615a != 4) {
                                cbbq8 = cbbq.f176602h;
                            } else {
                                cbbq8 = (cbbq) cbbt.f176616b;
                            }
                            String str4 = cbbq8.f176609f;
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            str4.getClass();
                            ((cbhy) da5.f164949b).f177218c = str4;
                            cbhy cbhy2 = (cbhy) da5.mo74062i();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            cbhy2.getClass();
                            ((cbio) da4.f164949b).f177279a = cbhy2;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            cbio cbio = (cbio) da4.mo74062i();
                            cbio.getClass();
                            ((cbin) da3.f164949b).f177275d = cbio;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cbil cbil = (cbil) da2.f164949b;
                            cbin cbin2 = (cbin) da3.mo74062i();
                            cbin2.getClass();
                            cbil.f177260b = cbin2;
                            cbil.f177259a = 2;
                            if (cbbt.f176615a == 4) {
                                cbbq9 = (cbbq) cbbt.f176616b;
                            } else {
                                cbbq9 = cbbq.f176602h;
                            }
                            contentValues.put("message_type", cbbq9.f176606c);
                            contentValues.put("content_type", "proto/MatchstickMessageContent");
                            contentValues.put("content", ((cbil) da2.mo74062i()).mo73642k());
                            return contentValues;
                        }
                    }
                }
            } else if (i3 == 5) {
                str2 = "application/sticker";
            } else if (i3 == 6) {
                str2 = "application/location";
            }
        } else if (cbbt.f176615a == 3) {
            String str5 = ((cbbx) cbbt.f176616b).f176627a;
            if (azoy.m85992h(str) && (cbbu = cbbn.f176597b) != null) {
                cbma cbma = cbbu.f176620a;
                if (cbma == null) {
                    cbma = cbma.f177591f;
                }
                if (!cbma.f177594b.isEmpty()) {
                    Object[] objArr = new Object[2];
                    cbbu cbbu2 = cbbn.f176597b;
                    if (cbbu2 == null) {
                        cbbu2 = cbbu.f176618b;
                    }
                    cbma cbma2 = cbbu2.f176620a;
                    if (cbma2 == null) {
                        cbma2 = cbma.f177591f;
                    }
                    objArr[0] = cbma2.f177594b;
                    if (cbbt.f176615a == 3) {
                        cbbx = (cbbx) cbbt.f176616b;
                    } else {
                        cbbx = cbbx.f176625b;
                    }
                    objArr[1] = cbbx.f176627a;
                    str5 = String.format("@%s %s", objArr);
                }
            }
            contentValues.put("message_type", "text/plain");
            contentValues.put("content_type", "text/plain");
            contentValues.put("content", str5.getBytes());
            return contentValues;
        }
        contentValues.put("message_type", str2);
        contentValues.putNull("content_type");
        contentValues.putNull("content");
        return contentValues;
    }

    /* renamed from: d */
    protected static void m85293d(SQLiteDatabase sQLiteDatabase) {
        new Object[1][0] = 55;
        String[] strArr = f98981b;
        for (String str : strArr) {
            new Object[1][0] = str;
            sQLiteDatabase.execSQL(str);
        }
        String[] strArr2 = f98986g;
        for (String str2 : strArr2) {
            new Object[1][0] = str2;
            sQLiteDatabase.execSQL(str2);
        }
        String[] strArr3 = f98987h;
        for (String str3 : strArr3) {
            new Object[1][0] = str3;
            sQLiteDatabase.execSQL(str3);
        }
        String[] strArr4 = f98988i;
        for (String str4 : strArr4) {
            new Object[1][0] = str4;
            sQLiteDatabase.execSQL(str4);
        }
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5 A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* renamed from: e */
    private static void m85294e(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        sQLiteDatabase.beginTransaction();
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"_id", "content"}, "content_type = ?", new String[]{"proto/InboxMessage"}, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        long j = query.getLong(0);
                        cbkj cbkj = (cbkj) azol.m85935a((bxxk) cbkj.f177405k.mo74142c(7), query.getBlob(1));
                        bxvd bxvd = (bxvd) cbkj.mo74142c(5);
                        bxvd.mo73625a((bxvk) cbkj);
                        if (bxvd != null) {
                            cbkj cbkj2 = (cbkj) bxvd.f164949b;
                            if (cbkj2.f177407a != 101) {
                                int b = cbki.m127938b(cbkj2.f177410d);
                                if (b != 0) {
                                    if (b != 4) {
                                    }
                                }
                            }
                            if (((cbkj) bxvd.f164949b).f177411e.mo73779j()) {
                                cbkj cbkj3 = (cbkj) bxvd.f164949b;
                                if (cbkj3.f177407a == 101) {
                                    bxtx aL = ((cbbn) cbkj3.f177408b).mo73639aL();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    cbkj cbkj4 = (cbkj) bxvd.f164949b;
                                    aL.getClass();
                                    cbkj4.f177411e = aL;
                                    cbkj4.f177410d = cbki.m127937a(4);
                                    z = true;
                                    if (((cbkj) bxvd.f164949b).f177407a != 101) {
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        cbkj cbkj5 = (cbkj) bxvd.f164949b;
                                        if (cbkj5.f177407a == 101) {
                                            cbkj5.f177407a = 0;
                                            cbkj5.f177408b = null;
                                        }
                                    } else if (!z) {
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("content", ((cbkj) bxvd.mo74062i()).mo73642k());
                                    sQLiteDatabase.update("messages", contentValues, "_id = ?", new String[]{Long.toString(j)});
                                }
                            }
                            z = false;
                            if (((cbkj) bxvd.f164949b).f177407a != 101) {
                            }
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("content", ((cbkj) bxvd.mo74062i()).mo73642k());
                            sQLiteDatabase.update("messages", contentValues2, "_id = ?", new String[]{Long.toString(j)});
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                        }
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (query != null) {
                query.close();
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:63:0x0021 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:61:0x0021 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: boolean} */
    /* JADX WARN: Type inference failed for: r10v0, assign insn: 0x000a: CONST  (r10v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int], assign insn: PHI: (r10v1 ?) = (r10v0 ?), (r10v2 ?) binds: [B:3:0x001f, B:61:0x0021] */
    /* JADX WARN: Type inference failed for: r10v2, assign insn: PHI: (r10v2 ?) = (r10v4 ?), (r10v1 ?), (r10v1 ?) binds: [B:65:0x0021, B:63:0x0021, B:64:0x0021] */
    /* JADX WARN: Type inference failed for: r10v4, assign insn: 0x024d: CONST  (r10v4 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r10v6, assign insn: 0x021b: CONST  (r10v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0129 A[Catch:{ all -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0263  */
    /* renamed from: f */
    private static void m85295f(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        sQLiteDatabase.beginTransaction();
        int i = 2;
        try {
            ? r10 = 0;
            int i2 = 1;
            cursor = sQLiteDatabase.query("appData", new String[]{"_id", "sid"}, null, null, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        int i3 = cursor.getInt(r10);
                        String string = cursor.getString(i2);
                        int hashCode = string.hashCode();
                        int i4 = -1;
                        if (hashCode != 2236) {
                            if (hashCode == 1361271766 && string.equals("1004514487972")) {
                                i4 = 1;
                                if (i4 == 0) {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    concurrentHashMap.put(1, 7064373674314338926L);
                                    concurrentHashMap.put(2, 2377493249668834486L);
                                    concurrentHashMap.put(3, 1436462095987182377L);
                                    concurrentHashMap.put(5, 5858840796215681730L);
                                    concurrentHashMap.put(6, 4735724179842516218L);
                                    concurrentHashMap.put(7, 6105613083217578357L);
                                    concurrentHashMap.put(8, 8567852936206622755L);
                                    concurrentHashMap.put(9, 2869097586388473721L);
                                    cbhn[] cbhnArr = new cbhn[8];
                                    int i5 = 0;
                                    for (Integer num : concurrentHashMap.keySet()) {
                                        int intValue = num.intValue();
                                        bxvd da = cbhn.f177154c.mo74144da();
                                        int b = cbic.m127878b(intValue);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = r10;
                                        }
                                        ((cbhn) da.f164949b).f177156a = cbic.m127877a(b);
                                        int i6 = i5;
                                        long longValue = ((Long) concurrentHashMap.get(Integer.valueOf(intValue))).longValue();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((cbhn) da.f164949b).f177157b = longValue;
                                        cbhnArr[i6] = (cbhn) da.mo74062i();
                                        i5 = i6 + 1;
                                        r10 = 0;
                                    }
                                    cbho cbho = (cbho) cbhp.f177158b.mo74144da();
                                    cbho.mo75233a(Arrays.asList(cbhnArr));
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("app_string_tag_mapping", ((cbhp) cbho.mo74062i()).mo73642k());
                                    sQLiteDatabase2.update("appData", contentValues, "_id = ?", new String[]{Long.toString((long) i3)});
                                    i = 2;
                                    r10 = 0;
                                    i2 = 1;
                                } else if (i4 == i2) {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap2.put(Integer.valueOf(i2), 6759083362047057783L);
                                    concurrentHashMap2.put(Integer.valueOf(i), 9078051912058337008L);
                                    concurrentHashMap2.put(3, 2842762475205803193L);
                                    cbhn[] cbhnArr2 = new cbhn[3];
                                    int i7 = 0;
                                    for (Integer num2 : concurrentHashMap2.keySet()) {
                                        int intValue2 = num2.intValue();
                                        bxvd da2 = cbhn.f177154c.mo74144da();
                                        int b2 = cbic.m127878b(intValue2);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = r10;
                                        }
                                        ((cbhn) da2.f164949b).f177156a = cbic.m127877a(b2);
                                        int i8 = i7;
                                        long longValue2 = ((Long) concurrentHashMap2.get(Integer.valueOf(intValue2))).longValue();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = r10;
                                        }
                                        ((cbhn) da2.f164949b).f177157b = longValue2;
                                        cbhnArr2[i8] = (cbhn) da2.mo74062i();
                                        i7 = i8 + 1;
                                    }
                                    cbho cbho2 = (cbho) cbhp.f177158b.mo74144da();
                                    cbho2.mo75233a(Arrays.asList(cbhnArr2));
                                    ContentValues contentValues2 = new ContentValues();
                                    contentValues2.put("app_string_tag_mapping", ((cbhp) cbho2.mo74062i()).mo73642k());
                                    String[] strArr = new String[1];
                                    strArr[r10] = Long.toString((long) i3);
                                    sQLiteDatabase2.update("appData", contentValues2, "_id = ?", strArr);
                                    i = 2;
                                    i2 = 1;
                                }
                            }
                        } else if (string.equals("FB")) {
                            i4 = 0;
                            if (i4 == 0) {
                            }
                        }
                        if (i4 == 0) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            if (cursor != null) {
                cursor.close();
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    /* renamed from: c */
    public final void mo54633c(SQLiteDatabase sQLiteDatabase) {
        String string;
        String string2;
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=off;");
        azcm.m85303a(sQLiteDatabase, this.f98989a);
        Cursor query = sQLiteDatabase.query("sqlite_master", f98982c, "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    string2 = query.getString(0);
                    String valueOf = String.valueOf(string2);
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP VIEW IF EXISTS ") : "DROP VIEW IF EXISTS ".concat(valueOf));
                } catch (SQLiteException e) {
                    azoj.m85933c("DB", "View drop failure : %s", string2);
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        Cursor query2 = sQLiteDatabase.query("sqlite_master", f98982c, "type='table'", null, null, null, null);
        if (query2 != null) {
            while (query2.moveToNext()) {
                try {
                    string = query2.getString(0);
                    if (!string.startsWith("android_") && !string.startsWith("sqlite_")) {
                        String valueOf2 = String.valueOf(string);
                        sQLiteDatabase.execSQL(valueOf2.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf2));
                    }
                } catch (SQLiteException e2) {
                    azoj.m85933c("DB", "Table drop failure : %s", string);
                } catch (Throwable th2) {
                    query2.close();
                    throw th2;
                }
            }
            query2.close();
        }
        m85293d(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    public final SQLiteDatabase getReadableDatabase() {
        Executor executor = azox.f99803a;
        m85291a();
        return super.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        Executor executor = azox.f99803a;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            azoj.m85931a("DB", e, "Failed to open database", new Object[0]);
            azph.m85998a(this.f98989a).mo55125a(1609);
            if (e instanceof SQLiteDatabaseCorruptException) {
                new Object[1][0] = getDatabaseName();
                azph.m85998a(this.f98989a).mo55125a(128);
                this.f98989a.deleteDatabase(getDatabaseName());
                sQLiteDatabase = super.getWritableDatabase();
            } else {
                throw e;
            }
        }
        m85291a();
        return sQLiteDatabase;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mo54633c(sQLiteDatabase);
    }

    /* JADX WARN: Type inference failed for: r10v0, assign insn: 0x0013: CONST  (r10v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int], assign insn: PHI: (r10v1 ?) = (r10v0 ?), (r10v2 ?) binds: [B:6:0x002e, B:416:0x0e21] */
    /* JADX WARN: Type inference failed for: r10v2, assign insn: 0x0e28: CONST  (r10v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
     arg types: [java.lang.String, long]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void} */
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
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0761  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0a69  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0ccc  */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Integer num;
        int i3;
        Cursor cursor;
        Throwable th;
        Cursor cursor2;
        String str;
        String str2;
        int i4;
        Cursor cursor3;
        Throwable th2;
        Integer num2;
        Cursor cursor4;
        Throwable th3;
        cbbn cbbn;
        cbkj cbkj;
        Cursor cursor5;
        Throwable th4;
        int i5;
        int i6;
        Cursor cursor6;
        Throwable th5;
        Cursor cursor7;
        String str3;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i7 = i;
        int i8 = i2;
        char c = 2;
        ? r10 = 0;
        int i9 = 1;
        int i10 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        if (i7 <= 11 && i8 <= 11) {
            mo54633c(sQLiteDatabase);
            return;
        }
        int i11 = i7 + 1;
        while (i11 <= i8) {
            Integer num3 = i10;
            String str4 = "status";
            String str5 = "PRAGMA foreign_keys=ON;";
            String str6 = "profile";
            String str7 = "DROP TABLE temp;";
            String str8 = "conversation_id";
            String str9 = "messages";
            switch (i11) {
                case 12:
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase2.execSQL("ALTER TABLE conversations ADD COLUMN last_dismissed_in_notification INTEGER DEFAULT -1");
                    break;
                case 13:
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase2.execSQL("UPDATE messages SET server_timestamp_ms = server_timestamp_ms * 1000  WHERE server_timestamp_ms != 0");
                    break;
                case 14:
                    i3 = i11;
                    String str10 = str5;
                    String str11 = str9;
                    num = num3;
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.execSQL("PRAGMA foreign_keys=OFF;");
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS profile;");
                        sQLiteDatabase2.execSQL("CREATE TABLE profile ( _id INTEGER PRIMARY KEY AUTOINCREMENT, entity_id TEXT NOT NULL, entity_type INTEGER DEFAULT 0, app_id INTEGER DEFAULT -1, display_id TEXT, profile_name TEXT, last_sync_timestamp INTEGER DEFAULT 0, status INTEGER DEFAULT 0, UNIQUE ( entity_id, entity_type, app_id ));");
                        String a = m85290a(str11, "sender_id");
                        String a2 = m85290a(str11, "sender_id_type");
                        String a3 = m85290a(str11, "sender_id_display");
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 247 + String.valueOf(a2).length() + String.valueOf(a3).length());
                        sb.append("INSERT INTO profile ( entity_id, entity_type, app_id, display_id, status )  SELECT ");
                        sb.append(a);
                        sb.append(" AS id,  (CASE ");
                        sb.append(a2);
                        sb.append(" WHEN ");
                        sb.append(1);
                        sb.append(" THEN ");
                        sb.append(1);
                        sb.append(" WHEN ");
                        sb.append(3);
                        sb.append(" THEN ");
                        sb.append(3);
                        sb.append(" WHEN ");
                        sb.append(2);
                        sb.append(" THEN ");
                        sb.append(2);
                        sb.append(" ELSE ");
                        sb.append(0);
                        sb.append(" END)  AS type, ");
                        sb.append(-2L);
                        sb.append(" AS app_id, ");
                        sb.append(a3);
                        sb.append(" AS display_id, ");
                        sb.append(0);
                        sb.append(" As status  from ");
                        sb.append(str11);
                        sb.append(" GROUP BY id, type, app_id; ");
                        sQLiteDatabase2.execSQL(sb.toString());
                        sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN sender_profile_id INTEGER DEFAULT -1");
                        sQLiteDatabase2.execSQL("UPDATE messages SET sender_profile_id = (SELECT _id FROM profile WHERE sender_id = entity_id AND sender_id_type = entity_type)  WHERE status BETWEEN 1 AND 19");
                        sQLiteDatabase2.execSQL("UPDATE messages SET sender_profile_id = -2 WHERE (status BETWEEN 30 AND 39) OR (status BETWEEN 20 AND 29)");
                        sQLiteDatabase2.execSQL("CREATE VIEW message_list_view AS  SELECT messages._id AS _id, messages.message_id AS message_id, messages.timestamp_ms AS timestamp_ms, messages.status AS status, messages.content AS content, messages.content_type AS content_type, messages.message_type AS message_type,messages.server_timestamp_ms AS server_timestamp_ms, messages.conversation_id AS conversation_id, messages.sender_profile_id AS sender_profile_id, profile.entity_id AS entity_id, profile.entity_type AS entity_type, profile.app_id AS app_id, profile.display_id AS display_id,profile.profile_name AS profile_name FROM messages LEFT JOIN profile ON messages.sender_profile_id = profile._id ");
                        sQLiteDatabase2.execSQL(str10);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        break;
                    } catch (Throwable th6) {
                        Throwable th7 = th6;
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th7;
                    }
                case 15:
                    i3 = i11;
                    num = num3;
                    m85294e(sQLiteDatabase);
                    break;
                case 16:
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase2.execSQL("DROP INDEX index_messages_sort");
                    sQLiteDatabase2.execSQL("CREATE INDEX index_messages_sort ON messages(conversation_id, status, server_timestamp_ms);");
                    break;
                case 17:
                    String str12 = "CREATE INDEX index_appData_sort ON appData(sid);";
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS appData;");
                        sQLiteDatabase2.execSQL("CREATE TABLE appData(_id INTEGER PRIMARY KEY AUTOINCREMENT, pid TEXT UNIQUE, sid TEXT UNIQUE NOT NULL, name TEXT, locale TEXT, icon_uri TEXT, nicon_uri TEXT, blocked INTEGER DEFAULT 0, last_sync INTEGER DEFAULT 0, status INTEGER DEFAULT 0, install_url TEXT, first_time_notification_clicked INTEGER DEFAULT 0, first_time_reply_sent INTEGER DEFAULT 0, last_conversation_install_clicked TEXT)");
                        sQLiteDatabase2.execSQL(str12);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        break;
                    } catch (Throwable th8) {
                        Throwable th9 = th8;
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th9;
                    }
                case 18:
                    i3 = i11;
                    String str13 = str9;
                    int i12 = 1;
                    num = num3;
                    Pattern compile = Pattern.compile("^(oneone|group)\\:([\\w\\+\\-]+)$");
                    sQLiteDatabase.beginTransaction();
                    try {
                        azcm.m85303a(sQLiteDatabase2, this.f98989a);
                        sQLiteDatabase2.execSQL("drop index if exists index_conversations_sort");
                        String str14 = str8;
                        Pattern pattern = compile;
                        cursor2 = null;
                        String str15 = str13;
                        try {
                            cursor = sQLiteDatabase.query("conversations", new String[]{"_id", str8}, null, null, null, null, null);
                        } catch (Throwable th10) {
                            th = th10;
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabase2.execSQL("CREATE INDEX index_conversations_sort ON conversations(conversation_id);");
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            throw th;
                        }
                        try {
                            if (!cursor.moveToFirst()) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                sQLiteDatabase2.execSQL("CREATE INDEX index_conversations_sort ON conversations(conversation_id);");
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                break;
                            } else {
                                while (true) {
                                    long j = cursor.getLong(0);
                                    String string = cursor.getString(i12);
                                    Matcher matcher = pattern.matcher(string);
                                    if (matcher.find()) {
                                        if (!matcher.group(i12).equals("group")) {
                                            i4 = 1;
                                        } else {
                                            i4 = 2;
                                        }
                                        Object group = matcher.group(2);
                                        Integer valueOf = Integer.valueOf(i4);
                                        String format = String.format("%s:%s:%s:%s", "FB", valueOf, valueOf, group);
                                        ContentValues contentValues = new ContentValues();
                                        str = str14;
                                        contentValues.put(str, format);
                                        sQLiteDatabase2.update("conversations", contentValues, "_id = ?", new String[]{Long.toString(j)});
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put(str, format);
                                        String[] strArr = {string};
                                        str2 = str15;
                                        sQLiteDatabase2.update(str2, contentValues2, "conversation_id = ?", strArr);
                                    } else {
                                        str = str14;
                                        str2 = str15;
                                    }
                                    if (!cursor.moveToNext()) {
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase2.execSQL("CREATE INDEX index_conversations_sort ON conversations(conversation_id);");
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        MessagingService.m94560d(new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS"), this.f98989a);
                                        break;
                                    } else {
                                        str15 = str2;
                                        str14 = str;
                                        i12 = 1;
                                    }
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            if (cursor != null) {
                            }
                            sQLiteDatabase2.execSQL("CREATE INDEX index_conversations_sort ON conversations(conversation_id);");
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            throw th;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        cursor2 = null;
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                        }
                        sQLiteDatabase2.execSQL("CREATE INDEX index_conversations_sort ON conversations(conversation_id);");
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                case 19:
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase2.execSQL("CREATE INDEX index_profile_sort ON profile(app_id, entity_type, entity_id);");
                    break;
                case 20:
                    i3 = i11;
                    String str16 = "CREATE TRIGGER update_app_sync_status_trigger AFTER UPDATE OF status ON appData BEGIN UPDATE appData SET status=OLD.status & (CASE NEW.status WHEN 0 THEN 0 ELSE ~0 END)&(CASE NEW.status&15 WHEN 0 THEN ~0 ELSE ~15 END)&(CASE NEW.status&3840 WHEN 0 THEN ~0 ELSE ~3840 END) | NEW.status WHERE _id = OLD._id; END;";
                    num = num3;
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.execSQL("UPDATE appData SET status = status + 1 + 256");
                        sQLiteDatabase2.execSQL(str16);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        break;
                    } catch (Throwable th13) {
                        Throwable th14 = th13;
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th14;
                    }
                case 21:
                    num = num3;
                    i3 = i11;
                    sQLiteDatabase2.execSQL("PRAGMA foreign_keys=OFF;");
                    sQLiteDatabase2.execSQL("DROP INDEX IF EXISTS index_appData_sort;");
                    sQLiteDatabase2.execSQL("DROP TRIGGER IF EXISTS update_app_sync_status_trigger;");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData RENAME TO temp;");
                    sQLiteDatabase2.execSQL("CREATE TABLE appData(_id INTEGER PRIMARY KEY AUTOINCREMENT, pid TEXT UNIQUE, sid TEXT UNIQUE NOT NULL, name TEXT, locale TEXT, icon BLOB, nicon BLOB, nicon_color TEXT, blocked INTEGER DEFAULT 0, last_sync INTEGER DEFAULT 0, status INTEGER DEFAULT 0, install_url TEXT, first_time_notification_clicked INTEGER DEFAULT 0, first_time_reply_sent INTEGER DEFAULT 0, last_conversation_install_clicked TEXT)");
                    sQLiteDatabase2.execSQL("INSERT INTO appData ( pid,sid,name,blocked,last_sync,status,install_url,first_time_notification_clicked,first_time_reply_sent,last_conversation_install_clicked )  SELECT pid,sid,name,blocked,last_sync,status,install_url,first_time_notification_clicked,first_time_reply_sent,last_conversation_install_clicked FROM temp;");
                    sQLiteDatabase2.execSQL("UPDATE appData SET status=1;");
                    sQLiteDatabase2.execSQL(str7);
                    sQLiteDatabase2.execSQL("CREATE INDEX index_appData_sort ON appData(sid);");
                    sQLiteDatabase2.execSQL("CREATE TRIGGER update_app_sync_status_trigger AFTER UPDATE OF status ON appData BEGIN UPDATE appData SET status=OLD.status & (CASE NEW.status WHEN 0 THEN 0 ELSE ~0 END)&(CASE NEW.status&15 WHEN 0 THEN ~0 ELSE ~15 END)&(CASE NEW.status&3840 WHEN 0 THEN ~0 ELSE ~3840 END) | NEW.status WHERE _id = OLD._id; END;");
                    sQLiteDatabase2.execSQL(str5);
                    break;
                case 22:
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase2.execSQL("ALTER TABLE profile ADD COLUMN thumbnail BLOB");
                    break;
                case 23:
                    i3 = i11;
                    num = num3;
                    String str17 = str6;
                    sQLiteDatabase.beginTransaction();
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS conversationParticipants;");
                    sQLiteDatabase2.execSQL("CREATE TABLE conversationParticipants(_id INTEGER PRIMARY KEY AUTOINCREMENT, conv_id TEXT, participant_type INTEGER DEFAULT 0, participant_id TEXT,  UNIQUE ( conv_id, participant_type, participant_id ) );");
                    sQLiteDatabase2.execSQL("CREATE INDEX index_conversationParticipants_sort ON conversationParticipants(conv_id,participant_type,participant_id);");
                    String str18 = str4;
                    Cursor query = sQLiteDatabase.query("conversations", new String[]{str8, "participants"}, null, null, null, null, null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            aznz a4 = aznz.m85891a(query.getString(0));
                            if (a4 != null && a4.mo55104b()) {
                                ContentValues contentValues3 = new ContentValues();
                                contentValues3.put("app_id", (Long) -2L);
                                contentValues3.put("entity_id", a4.f99777d);
                                contentValues3.put("entity_type", Integer.valueOf(a4.f99776c));
                                contentValues3.put(str18, (Integer) 0);
                                sQLiteDatabase2.insert(str17, null, contentValues3);
                                cbmx cbmx = (cbmx) azol.m85935a((bxxk) cbmx.f177692e.mo74142c(7), query.getBlob(1));
                                if (!(cbmx == null || cbmx.f177696c.size() == 0)) {
                                    bxwc bxwc = cbmx.f177696c;
                                    int size = bxwc.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        cbma cbma = (cbma) bxwc.get(i13);
                                        azcm.m85304a(sQLiteDatabase2, a4.f99774a, cbma.f177594b, LocalEntityId.m94547a(cbma));
                                    }
                                }
                            }
                        }
                        query.close();
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    break;
                case 24:
                    i3 = i11;
                    num = num3;
                    sQLiteDatabase2.execSQL("ALTER TABLE conversations ADD COLUMN last_notified INTEGER DEFAULT -1");
                    sQLiteDatabase2.execSQL(" UPDATE conversations SET last_notified=last_dismissed_message");
                    break;
                case 25:
                    Integer num4 = num3;
                    String str19 = str7;
                    i3 = i11;
                    String str20 = str5;
                    sQLiteDatabase2.execSQL("PRAGMA foreign_keys=OFF;");
                    sQLiteDatabase2.execSQL("DROP INDEX index_media_sort");
                    sQLiteDatabase2.execSQL("DROP INDEX index_media_download_id_sort");
                    sQLiteDatabase2.execSQL("ALTER TABLE media RENAME TO temp");
                    sQLiteDatabase2.execSQL("CREATE TABLE media(message_id TEXT UNIQUE, media_id BLOB, download_manager_id INTEGER UNIQUE, downloaded_file_uri TEXT, downloaded_status INTEGER DEFAULT 0, last_modified_timestamp_ms INTEGER DEFAULT CURRENT_TIMESTAMP)");
                    sQLiteDatabase.beginTransaction();
                    try {
                        num = num4;
                        String str21 = str19;
                        String str22 = str20;
                        cursor3 = sQLiteDatabase.query("temp", new String[]{"media_id", "download_manager_id", "downloaded_file_uri", "downloaded_status", "message_id", "last_modified_timestamp_ms"}, null, null, null, null, null);
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    do {
                                        String string2 = cursor3.getString(0);
                                        bxvd da = cbmf.f177611d.mo74144da();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        cbmf cbmf = (cbmf) da.f164949b;
                                        string2.getClass();
                                        cbmf.f177613a = string2;
                                        cbmf.f177614b = cipi.m150693a(3);
                                        byte[] k = ((cbmf) da.mo74062i()).mo73642k();
                                        ContentValues contentValues4 = new ContentValues();
                                        contentValues4.put("media_id", k);
                                        contentValues4.put("download_manager_id", Integer.valueOf(cursor3.getInt(1)));
                                        contentValues4.put("downloaded_file_uri", cursor3.getString(2));
                                        contentValues4.put("downloaded_status", Integer.valueOf(cursor3.getInt(3)));
                                        contentValues4.put("message_id", cursor3.getString(4));
                                        contentValues4.put("last_modified_timestamp_ms", Integer.valueOf(cursor3.getInt(5)));
                                        if (sQLiteDatabase2.insert("media", null, contentValues4) == -1) {
                                            azoj.m85933c("DB", "failed to insert media content for messageId : %s", cursor3.getString(4));
                                        }
                                    } while (cursor3.moveToNext());
                                }
                            } catch (Throwable th15) {
                                th2 = th15;
                                if (cursor3 != null) {
                                }
                                throw th2;
                            }
                        }
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        sQLiteDatabase2.execSQL(str21);
                        sQLiteDatabase2.execSQL("CREATE INDEX index_media_sort ON media(message_id);");
                        sQLiteDatabase2.execSQL("CREATE INDEX index_media_download_id_sort ON media(download_manager_id);");
                        sQLiteDatabase2.execSQL(str22);
                        break;
                    } catch (Throwable th16) {
                        th2 = th16;
                        cursor3 = null;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th2;
                    }
                case 26:
                    i3 = i11;
                    Integer num5 = num3;
                    sQLiteDatabase2.execSQL("PRAGMA foreign_keys=OFF");
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.execSQL("DROP INDEX index_profile_sort");
                        sQLiteDatabase2.execSQL("DROP VIEW message_list_view");
                        sQLiteDatabase2.execSQL("ALTER TABLE profile RENAME TO tmp_profile");
                        sQLiteDatabase2.execSQL("CREATE TABLE profile ( _id INTEGER PRIMARY KEY AUTOINCREMENT, entity_id TEXT NOT NULL, entity_type INTEGER DEFAULT 0, app_id TEXT NOT NULL, display_id TEXT, profile_name TEXT, last_sync_timestamp INTEGER DEFAULT 0, status INTEGER DEFAULT 0, thumbnail BLOB,  FOREIGN KEY (app_id) REFERENCES appData(sid),  UNIQUE ( entity_id, entity_type, app_id )  )");
                        sQLiteDatabase2.execSQL("INSERT INTO profile SELECT * FROM tmp_profile");
                        sQLiteDatabase2.execSQL("DROP TABLE tmp_profile");
                        azcm.m85308c(sQLiteDatabase2, "FB");
                        sQLiteDatabase2.execSQL("UPDATE profile SET app_id='FB'");
                        sQLiteDatabase2.execSQL("CREATE INDEX index_profile_sort ON profile(app_id, entity_type, entity_id);");
                        sQLiteDatabase2.execSQL("CREATE VIEW message_list_view AS  SELECT messages._id AS _id, messages.message_id AS message_id, messages.timestamp_ms AS timestamp_ms, messages.status AS status, messages.content AS content, messages.content_type AS content_type, messages.message_type AS message_type,messages.server_timestamp_ms AS server_timestamp_ms, messages.conversation_id AS conversation_id, messages.sender_profile_id AS sender_profile_id, profile.entity_id AS entity_id, profile.entity_type AS entity_type, profile.app_id AS app_id, profile.display_id AS display_id,profile.profile_name AS profile_name FROM messages LEFT JOIN profile ON messages.sender_profile_id = profile._id ");
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        sQLiteDatabase2.execSQL("PRAGMA foreign_keys=ON");
                        num = num5;
                        break;
                    } catch (Throwable th17) {
                        Throwable th18 = th17;
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th18;
                    }
                case 27:
                    String str23 = "appData";
                    i3 = i11;
                    Integer num6 = num3;
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN theme_color TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN incoming_message_font_color TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN outgoing_message_background_color TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN outgoing_message_font_color TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN background_image BLOB");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN onboarding_message TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN offboarding_message TEXT");
                    ContentValues contentValues5 = new ContentValues();
                    contentValues5.put(str4, num6);
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.update(str23, contentValues5, null, null);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        num = num6;
                        break;
                    } catch (Throwable th19) {
                        Throwable th20 = th19;
                        sQLiteDatabase.endTransaction();
                        throw th20;
                    }
                case 28:
                    i3 = i11;
                    Integer num7 = num3;
                    String str24 = str9;
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.delete(str24, "STATUS  BETWEEN 20 AND 29", null);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        num = num7;
                        break;
                    } catch (Throwable th21) {
                        Throwable th22 = th21;
                        sQLiteDatabase.endTransaction();
                        throw th22;
                    }
                case 29:
                    String str25 = "appData";
                    i3 = i11;
                    Integer num8 = num3;
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN tombstone_message_background_color TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN tombstone_message_font_color TEXT");
                    ContentValues contentValues6 = new ContentValues();
                    contentValues6.put(str4, num8);
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.update(str25, contentValues6, null, null);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        num = num8;
                        break;
                    } catch (Throwable th23) {
                        Throwable th24 = th23;
                        sQLiteDatabase.endTransaction();
                        throw th24;
                    }
                case 30:
                    i3 = i11;
                    Integer num9 = num3;
                    String str26 = str6;
                    sQLiteDatabase2.execSQL("ALTER TABLE profile ADD COLUMN blocked INTEGER DEFAULT 0");
                    Cursor query2 = sQLiteDatabase.query("conversations", new String[]{str8}, "blocked = ?", new String[]{Integer.toString(1)}, null, null, null, null);
                    if (query2 == null) {
                        num = num9;
                        break;
                    } else {
                        if (query2.moveToFirst()) {
                            while (true) {
                                aznz a5 = aznz.m85891a(query2.getString(0));
                                if (a5 == null) {
                                    num2 = num9;
                                } else if (!a5.mo55105c()) {
                                    num2 = num9;
                                } else if (a5.mo55108f()) {
                                    LocalEntityId localEntityId = a5.f99781h;
                                    ContentValues contentValues7 = new ContentValues();
                                    num2 = num9;
                                    contentValues7.put("blocked", num2);
                                    sQLiteDatabase2.update(str26, contentValues7, "entity_id = ? AND entity_type = ? AND app_id = ?", azdj.m85401a(localEntityId));
                                } else {
                                    num2 = num9;
                                }
                                if (query2.moveToNext()) {
                                    num9 = num2;
                                }
                            }
                        } else {
                            num2 = num9;
                        }
                        query2.close();
                        num = num2;
                        break;
                    }
                case 31:
                    i3 = i11;
                    Integer num10 = num3;
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS sticker;");
                        sQLiteDatabase2.execSQL("CREATE TABLE sticker(download_uri TEXT UNIQUE, download_status INTEGER DEFAULT 0, storage_uri TEXT );");
                        sQLiteDatabase2.execSQL("CREATE INDEX index_sticker_sort ON sticker(download_uri);");
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        num = num10;
                        break;
                    } catch (Throwable th25) {
                        Throwable th26 = th25;
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th26;
                    }
                case 32:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN exported_data BLOB ");
                    num = num3;
                    break;
                case 33:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN app_ui_config BLOB ");
                    num = num3;
                    break;
                case 34:
                    i3 = i11;
                    Integer num11 = num3;
                    sQLiteDatabase.beginTransaction();
                    try {
                        String[] strArr2 = new String[4];
                        strArr2[r10] = "_id";
                        strArr2[1] = "content_type";
                        strArr2[2] = "message_type";
                        strArr2[3] = "content";
                        String str27 = str9;
                        cursor4 = sQLiteDatabase.query("message_list_view", strArr2, null, null, null, null, null);
                        while (cursor4.moveToNext()) {
                            try {
                                String string3 = cursor4.getString(1);
                                String string4 = cursor4.getString(2);
                                if (!"proto/GroupProfileInfo".equals(string3)) {
                                    if (!"proto/MatchstickMessageContent".equals(string3)) {
                                        if (!"text/plain".equals(string3)) {
                                            if (!"proto/FireballMessage".equals(string3)) {
                                                if ("proto/InboxMessage".equals(string3) && (cbkj = (cbkj) azol.m85935a((bxxk) cbkj.f177405k.mo74142c(7), cursor4.getBlob(3))) != null) {
                                                    int b = cbki.m127938b(cbkj.f177410d);
                                                    if (b == 0) {
                                                        cbbn = null;
                                                    } else if (b == 4 && !cbkj.f177411e.mo73779j()) {
                                                        cbbn = (cbbn) azol.m85935a((bxxk) cbbn.f176594c.mo74142c(7), cbkj.f177411e.mo73780k());
                                                    }
                                                }
                                                cbbn = null;
                                            } else {
                                                cbbn = (cbbn) azol.m85935a((bxxk) cbbn.f176594c.mo74142c(7), cursor4.getBlob(3));
                                            }
                                            String str28 = str27;
                                            sQLiteDatabase2.update(str28, m85288a(cbbn, string4), "_id = ?", new String[]{Long.toString(cursor4.getLong(0))});
                                            str27 = str28;
                                        }
                                    }
                                }
                            } catch (Throwable th27) {
                                th3 = th27;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                throw th3;
                            }
                        }
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        num = num11;
                        break;
                    } catch (Throwable th28) {
                        th3 = th28;
                        cursor4 = null;
                        if (cursor4 != null) {
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        throw th3;
                    }
                case 35:
                    i3 = i11;
                    Integer num12 = num3;
                    azdl a6 = azdl.m85412a(this.f98989a);
                    byte[] l = a6.mo54790l();
                    byte[] k2 = a6.mo54789k();
                    if (k2 != null && l != null) {
                        if (!a6.mo54733G()) {
                            if (azbw.m85224a(this.f98989a, k2, l) != null) {
                                num = num12;
                                break;
                            } else {
                                a6.mo54749b((int) r10);
                                num = num12;
                                break;
                            }
                        } else {
                            num = num12;
                            break;
                        }
                    } else {
                        num = num12;
                        break;
                    }
                case 36:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("ALTER TABLE media ADD COLUMN encrypted INTEGER DEFAULT 0");
                    num = num3;
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN error_code INTEGER DEFAULT 0 ");
                    sQLiteDatabase2.execSQL("DROP VIEW IF EXISTS message_list_view");
                    sQLiteDatabase2.execSQL("CREATE VIEW message_list_view AS  SELECT messages._id AS _id, messages.message_id AS message_id, messages.timestamp_ms AS timestamp_ms, messages.status AS status, messages.content AS content, messages.content_type AS content_type, messages.message_type AS message_type, messages.server_timestamp_ms AS server_timestamp_ms, messages.conversation_id AS conversation_id, messages.sender_profile_id AS sender_profile_id, profile.entity_id AS entity_id, profile.entity_type AS entity_type, profile.app_id AS app_id, profile.display_id AS display_id,profile.profile_name AS profile_name FROM messages LEFT JOIN profile ON messages.sender_profile_id = profile._id WHERE messages.error_code = 0");
                    num = num3;
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS appString;");
                    sQLiteDatabase2.execSQL("CREATE TABLE appString(_id INTEGER PRIMARY KEY AUTOINCREMENT, app_id TEXT NOT NULL, string_id INTEGER, string_value TEXT, FOREIGN KEY (app_id) REFERENCES appData(sid) ON DELETE CASCADE );");
                    sQLiteDatabase2.execSQL("CREATE INDEX index_appString_sort ON appString(app_id, string_id);");
                    num = num3;
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    i3 = i11;
                    Integer num13 = num3;
                    sQLiteDatabase.beginTransaction();
                    HashSet hashSet = new HashSet();
                    hashSet.add(BuildConfig.FLAVOR_client);
                    hashSet.add("googlecustomer");
                    hashSet.add("googlebusiness");
                    hashSet.add("googlecustomerdev");
                    hashSet.add("googlebusinessdev");
                    try {
                        sQLiteDatabase2.execSQL("ALTER TABLE profile ADD COLUMN data BLOB ");
                        String[] strArr3 = new String[4];
                        strArr3[r10] = "_id";
                        strArr3[i9] = "entity_id";
                        strArr3[2] = "profile_name";
                        strArr3[3] = "thumbnail";
                        String[] strArr4 = new String[i9];
                        strArr4[r10] = Integer.toString(3);
                        Integer num14 = num13;
                        String str29 = str6;
                        HashSet hashSet2 = hashSet;
                        cursor5 = sQLiteDatabase.query("profile", strArr3, "entity_type = ? ", strArr4, null, null, null);
                        while (cursor5.moveToNext()) {
                            try {
                                bxvd da2 = cbgn.f177050e.mo74144da();
                                bxvd da3 = cbgm.f177046c.mo74144da();
                                String string5 = cursor5.getString(2);
                                if (!TextUtils.isEmpty(string5)) {
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = r10;
                                    }
                                    string5.getClass();
                                    ((cbgn) da2.f164949b).f177054c = string5;
                                }
                                byte[] blob = cursor5.getBlob(3);
                                if (azpi.m86080b(blob)) {
                                    i5 = 1;
                                } else {
                                    bxvd da4 = cbhy.f177214d.mo74144da();
                                    bxtx a7 = bxtx.m123261a(blob);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = r10;
                                    }
                                    cbhy cbhy = (cbhy) da4.f164949b;
                                    a7.getClass();
                                    i5 = 1;
                                    cbhy.f177216a = 1;
                                    cbhy.f177217b = a7;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = r10;
                                    }
                                    cbhy cbhy2 = (cbhy) da4.mo74062i();
                                    cbhy2.getClass();
                                    ((cbgn) da2.f164949b).f177055d = cbhy2;
                                }
                                HashSet hashSet3 = hashSet2;
                                if (!hashSet3.contains(cursor5.getString(i5))) {
                                    i6 = 3;
                                } else {
                                    i6 = 2;
                                }
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = r10;
                                }
                                ((cbgm) da3.f164949b).f177048a = cbgl.m127832a(i6);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = r10;
                                }
                                cbgn cbgn = (cbgn) da2.f164949b;
                                cbgm cbgm = (cbgm) da3.mo74062i();
                                cbgm.getClass();
                                cbgn.f177053b = cbgm;
                                cbgn.f177052a = 5;
                                ContentValues contentValues8 = new ContentValues();
                                contentValues8.put("data", ((cbgn) da2.mo74062i()).mo73642k());
                                String[] strArr5 = new String[i5];
                                strArr5[r10] = Long.toString(cursor5.getLong(r10));
                                sQLiteDatabase2.update(str29, contentValues8, "_id = ? ", strArr5);
                                hashSet2 = hashSet3;
                            } catch (Throwable th29) {
                                th4 = th29;
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                throw th4;
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor5 == null) {
                            num = num14;
                            break;
                        } else {
                            cursor5.close();
                            num = num14;
                            break;
                        }
                    } catch (Throwable th30) {
                        th4 = th30;
                        cursor5 = null;
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor5 != null) {
                        }
                        throw th4;
                    }
                case FelicaException.TYPE_PUSH_FAILED:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS smartReply;");
                    sQLiteDatabase2.execSQL("CREATE TABLE smartReply(_id INTEGER PRIMARY KEY AUTOINCREMENT, conversation_id TEXT NOT NULL, message_id TEXT UNIQUE NOT NULL, reply BLOB, FOREIGN KEY (message_id) REFERENCES messages(message_id) ON DELETE CASCADE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE );");
                    sQLiteDatabase2.execSQL("CREATE INDEX index_smartReply_sort ON smartReply(conversation_id, message_id);");
                    num = num3;
                    break;
                case 41:
                    i3 = i11;
                    sQLiteDatabase2.execSQL("ALTER TABLE conversations ADD COLUMN outgoing_message_properties BLOB ");
                    num = num3;
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    String str30 = "appData";
                    i3 = i11;
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN app_theme BLOB");
                    ContentValues contentValues9 = new ContentValues();
                    Integer num15 = num3;
                    contentValues9.put(str4, num15);
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.update(str30, contentValues9, null, null);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        num = num15;
                        break;
                    } catch (Throwable th31) {
                        Throwable th32 = th31;
                        sQLiteDatabase.endTransaction();
                        throw th32;
                    }
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    sQLiteDatabase2.execSQL("PRAGMA foreign_keys=OFF;");
                    sQLiteDatabase2.execSQL("DROP INDEX IF EXISTS index_appData_sort;");
                    sQLiteDatabase2.execSQL("DROP TRIGGER IF EXISTS update_app_sync_status_trigger;");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData RENAME TO temp;");
                    sQLiteDatabase2.execSQL("CREATE TABLE appData(_id INTEGER PRIMARY KEY AUTOINCREMENT, pid TEXT UNIQUE, sid TEXT UNIQUE NOT NULL, name TEXT, locale TEXT, icon BLOB, nicon BLOB, nicon_color TEXT, blocked INTEGER DEFAULT 0, last_sync INTEGER DEFAULT 0, status INTEGER DEFAULT 0, install_url TEXT, first_time_notification_clicked INTEGER DEFAULT 0, first_time_reply_sent INTEGER DEFAULT 0, last_conversation_install_clicked TEXT, background_image BLOB, onboarding_message TEXT, offboarding_message TEXT, app_ui_config BLOB, app_theme BLOB)");
                    sQLiteDatabase2.execSQL("INSERT INTO appData ( pid,sid,name,locale,icon,nicon,nicon_color,blocked,last_sync,status,background_image,onboarding_message,offboarding_message,install_url,first_time_notification_clicked,first_time_reply_sent,last_conversation_install_clicked,app_ui_config,app_theme )  SELECT pid,sid,name,locale,icon,nicon,nicon_color,blocked,last_sync,status,background_image,onboarding_message,offboarding_message,install_url,first_time_notification_clicked,first_time_reply_sent,last_conversation_install_clicked,app_ui_config,app_theme FROM temp;");
                    sQLiteDatabase.beginTransaction();
                    try {
                        String[] strArr6 = new String[8];
                        strArr6[r10] = "_id";
                        strArr6[i9] = "theme_color";
                        strArr6[c] = "incoming_message_font_color";
                        strArr6[3] = "outgoing_message_background_color";
                        strArr6[4] = "outgoing_message_font_color";
                        strArr6[5] = "tombstone_message_background_color";
                        strArr6[6] = "tombstone_message_font_color";
                        strArr6[7] = "app_theme";
                        String str31 = "appData";
                        String str32 = str7;
                        int i14 = 7;
                        String str33 = "CREATE INDEX index_appData_sort ON appData(sid);";
                        i3 = i11;
                        String str34 = "CREATE TRIGGER update_app_sync_status_trigger AFTER UPDATE OF status ON appData BEGIN UPDATE appData SET status=OLD.status & (CASE NEW.status WHEN 0 THEN 0 ELSE ~0 END)&(CASE NEW.status&15 WHEN 0 THEN ~0 ELSE ~15 END)&(CASE NEW.status&3840 WHEN 0 THEN ~0 ELSE ~3840 END) | NEW.status WHERE _id = OLD._id; END;";
                        Integer num16 = num3;
                        String str35 = str5;
                        try {
                            cursor6 = sQLiteDatabase.query("temp", strArr6, null, null, null, null, null);
                            if (cursor6 != null) {
                                while (cursor6.moveToNext()) {
                                    try {
                                        long j2 = cursor6.getLong(r10);
                                        bxvd da5 = cbhr.f177167i.mo74144da();
                                        if (azol.m85935a((bxxk) cbhr.f177167i.mo74142c(i14), cursor6.getBlob(i14)) != null) {
                                            cbhr cbhr = (cbhr) azol.m85935a((bxxk) cbhr.f177167i.mo74142c(i14), cursor6.getBlob(i14));
                                            bxvd bxvd = (bxvd) cbhr.mo74142c(5);
                                            bxvd.mo73625a((bxvk) cbhr);
                                            da5 = bxvd;
                                        }
                                        if (cursor6.getString(1) != null) {
                                            String string6 = cursor6.getString(1);
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = r10;
                                            }
                                            string6.getClass();
                                            ((cbhr) da5.f164949b).f177169a = string6;
                                        }
                                        if (cursor6.getString(2) != null) {
                                            String string7 = cursor6.getString(2);
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = r10;
                                            }
                                            string7.getClass();
                                            ((cbhr) da5.f164949b).f177170b = string7;
                                        }
                                        if (cursor6.getString(3) != null) {
                                            String string8 = cursor6.getString(3);
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = r10;
                                            }
                                            string8.getClass();
                                            ((cbhr) da5.f164949b).f177171c = string8;
                                        }
                                        if (cursor6.getString(4) != null) {
                                            String string9 = cursor6.getString(4);
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = r10;
                                            }
                                            string9.getClass();
                                            ((cbhr) da5.f164949b).f177172d = string9;
                                        }
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = r10;
                                        }
                                        ((cbhr) da5.f164949b).f177173e = null;
                                        if (cursor6.getString(5) != null) {
                                            String string10 = cursor6.getString(5);
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = r10;
                                            }
                                            string10.getClass();
                                            ((cbhr) da5.f164949b).f177174f = string10;
                                        }
                                        if (cursor6.getString(6) != null) {
                                            String string11 = cursor6.getString(6);
                                            if (da5.f164950c) {
                                                da5.mo74035c();
                                                da5.f164950c = r10;
                                            }
                                            string11.getClass();
                                            ((cbhr) da5.f164949b).f177175g = string11;
                                        }
                                        ContentValues contentValues10 = new ContentValues();
                                        contentValues10.put("app_theme", ((cbhr) da5.mo74062i()).mo73642k());
                                        String[] strArr7 = new String[1];
                                        strArr7[r10] = Long.toString(j2);
                                        sQLiteDatabase2.update(str31, contentValues10, "_id = ?", strArr7);
                                        str31 = str31;
                                        i14 = 7;
                                    } catch (Throwable th33) {
                                        th5 = th33;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        sQLiteDatabase.endTransaction();
                                        throw th5;
                                    }
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            if (cursor6 != null) {
                                cursor6.close();
                            }
                            sQLiteDatabase.endTransaction();
                            sQLiteDatabase2.execSQL("UPDATE appData SET status=1;");
                            sQLiteDatabase2.execSQL(str32);
                            sQLiteDatabase2.execSQL(str33);
                            sQLiteDatabase2.execSQL(str34);
                            sQLiteDatabase2.execSQL(str35);
                            num = num16;
                            break;
                        } catch (Throwable th34) {
                            th = th34;
                            cursor7 = null;
                            th5 = th;
                            cursor6 = cursor7;
                            if (cursor6 != null) {
                            }
                            sQLiteDatabase.endTransaction();
                            throw th5;
                        }
                    } catch (Throwable th35) {
                        th = th35;
                        cursor7 = null;
                        th5 = th;
                        cursor6 = cursor7;
                        if (cursor6 != null) {
                        }
                        sQLiteDatabase.endTransaction();
                        throw th5;
                    }
                case FelicaException.TYPE_RESET_FAILED:
                    sQLiteDatabase2.execSQL("ALTER TABLE conversations ADD COLUMN sender_properties BLOB ");
                    i3 = i11;
                    num = num3;
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN app_string_tag_mapping BLOB");
                    m85295f(sQLiteDatabase);
                    i3 = i11;
                    num = num3;
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS tachystickreachability;");
                    sQLiteDatabase2.execSQL(azbu.f98923a);
                    sQLiteDatabase2.execSQL("CREATE INDEX index_tachystickreachability_sort ON tachystickreachability(id, id_type);");
                    i3 = i11;
                    num = num3;
                    break;
                case 47:
                    sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN message_properties BLOB");
                    sQLiteDatabase2.execSQL("DROP VIEW IF EXISTS message_list_view");
                    sQLiteDatabase2.execSQL(f98985f);
                    i3 = i11;
                    num = num3;
                    break;
                case 48:
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS mediaUpload");
                    sQLiteDatabase2.execSQL("CREATE TABLE mediaUpload(message_id TEXT UNIQUE, media_id BLOB, local_file_uri TEXT, upload_status INTEGER DEFAULT 0, last_modified_timestamp_ms INTEGER DEFAULT CURRENT_TIMESTAMP);");
                    sQLiteDatabase2.execSQL("CREATE INDEX index_mediaUpload_sort ON mediaUpload(message_id);");
                    i3 = i11;
                    num = num3;
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS registration");
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS user");
                    sQLiteDatabase2.execSQL("CREATE TABLE registration (server_registration_id TEXT PRIMARY KEY, auth_token BLOB, auth_token_expiration_timestamp_ms INTEGER, gcm_token TEXT, id_key_public BLOB, id_key_private BLOB, id_key_type INTEGER, capabilities TEXT, status INTEGER, txn_timestamp_us INTEGER, last_token_refresh_timestamp_us INTEGER, account_type INTEGER default 0, deletion_policy BLOB);");
                    sQLiteDatabase2.execSQL("CREATE TABLE user (id TEXT, type INTEGER, app_id TEXT, display_id TEXT, registration_id TEXT, is_primary_device INTEGER DEFAULT 0,  UNIQUE (id, type, app_id) ON CONFLICT REPLACE FOREIGN KEY(registration_id) REFERENCES registration(server_registration_id));");
                    i3 = i11;
                    num = num3;
                    break;
                case 50:
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS registration");
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS user");
                    sQLiteDatabase2.execSQL("CREATE TABLE registration (server_registration_id TEXT PRIMARY KEY, auth_token BLOB, auth_token_expiration_timestamp_ms INTEGER, gcm_token TEXT, id_key_public BLOB, id_key_private BLOB, id_key_type INTEGER, capabilities TEXT, status INTEGER, txn_timestamp_us INTEGER, last_token_refresh_timestamp_us INTEGER, account_type INTEGER default 0, deletion_policy BLOB);");
                    sQLiteDatabase2.execSQL("CREATE TABLE user (id TEXT, type INTEGER, app_id TEXT, display_id TEXT, registration_id TEXT, is_primary_device INTEGER DEFAULT 0,  UNIQUE (id, type, app_id) ON CONFLICT REPLACE FOREIGN KEY(registration_id) REFERENCES registration(server_registration_id));");
                    azdl a8 = azdl.m85412a(this.f98989a);
                    if (!a8.mo54770e() && !a8.mo54802x()) {
                        i3 = i11;
                        num = num3;
                        break;
                    } else {
                        if (a8.mo54770e()) {
                            String valueOf2 = String.valueOf(a8.mo54738a());
                            str3 = valueOf2.length() == 0 ? new String(":1:") : ":1:".concat(valueOf2);
                        } else {
                            str3 = ":8:anonymous";
                        }
                        azon.m85936a();
                        azon.m85937a(sQLiteDatabase2, "", str3, this.f98989a);
                        i3 = i11;
                        num = num3;
                        break;
                    }
                case 51:
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN non_image_app_metadata_version TEXT");
                    sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN image_app_metadata_version TEXT");
                    i3 = i11;
                    num = num3;
                    break;
                case 52:
                    for (String str36 : azbu.f98926d) {
                        sQLiteDatabase2.execSQL(str36);
                    }
                    i3 = i11;
                    num = num3;
                    break;
                case 53:
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS preloadedFiles");
                    sQLiteDatabase2.execSQL("CREATE TABLE preloadedFiles (web_download_url TEXT PRIMARY KEY, downloaded_file_uri TEXT, local_file_uri TEXT, download_manager_id INTEGER, download_status INTEGER, download_timestamp_ms INTEGER, last_accessed_timestamp_ms INTEGER, app_id TEXT);");
                    sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS sharedPreference");
                    sQLiteDatabase2.execSQL("CREATE TABLE sharedPreference (key TEXT, type INTEGER, value TEXT, UNIQUE (key) ON CONFLICT REPLACE );");
                    i3 = i11;
                    num = num3;
                    break;
                case 54:
                    sQLiteDatabase2.execSQL("PRAGMA foreign_keys=off");
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN default_user_id TEXT DEFAULT NULL");
                        sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN default_user_type INTEGER DEFAULT 0");
                        sQLiteDatabase2.execSQL("ALTER TABLE appData ADD COLUMN default_user_app_id TEXT DEFAULT NULL");
                        sQLiteDatabase2.execSQL("ALTER TABLE appData RENAME TO temp");
                        sQLiteDatabase2.execSQL("CREATE TABLE appData(_id INTEGER PRIMARY KEY AUTOINCREMENT, pid TEXT UNIQUE, sid TEXT UNIQUE NOT NULL, name TEXT, locale TEXT, icon BLOB, nicon BLOB, nicon_color TEXT, blocked INTEGER DEFAULT 0, last_sync INTEGER DEFAULT 0, status INTEGER DEFAULT 0, install_url TEXT, first_time_notification_clicked INTEGER DEFAULT 0, first_time_reply_sent INTEGER DEFAULT 0, last_conversation_install_clicked TEXT, background_image BLOB, onboarding_message TEXT, offboarding_message TEXT, app_ui_config BLOB, app_theme BLOB, app_string_tag_mapping BLOB, non_image_app_metadata_version TEXT, image_app_metadata_version TEXT, default_user_id TEXT DEFAULT NULL, default_user_type INTEGER DEFAULT 0, default_user_app_id TEXT DEFAULT NULL, FOREIGN KEY(default_user_id, default_user_type, default_user_app_id) REFERENCES user(id, type, app_id) ON DELETE SET DEFAULT );");
                        sQLiteDatabase2.execSQL("INSERT INTO appData SELECT * FROM temp");
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS temp");
                        sQLiteDatabase2.execSQL("CREATE INDEX index_appData_sort ON appData(sid);");
                        sQLiteDatabase2.execSQL("CREATE TRIGGER update_app_sync_status_trigger AFTER UPDATE OF status ON appData BEGIN UPDATE appData SET status=OLD.status & (CASE NEW.status WHEN 0 THEN 0 ELSE ~0 END)&(CASE NEW.status&15 WHEN 0 THEN ~0 ELSE ~15 END)&(CASE NEW.status&3840 WHEN 0 THEN ~0 ELSE ~3840 END) | NEW.status WHERE _id = OLD._id; END;");
                        sQLiteDatabase2.execSQL("CREATE TRIGGER update_default_user_trigger AFTER DELETE ON user BEGIN UPDATE appData SET default_user_id = Null, default_user_type = 0, default_user_app_id = Null  WHERE default_user_id = OLD.id AND default_user_type = OLD.type AND default_user_app_id = OLD.app_id; END;");
                        sQLiteDatabase.setTransactionSuccessful();
                    } catch (SQLiteException e) {
                        m85292a(e);
                    } catch (Throwable th36) {
                        Throwable th37 = th36;
                        sQLiteDatabase.endTransaction();
                        throw th37;
                    }
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase2.execSQL("PRAGMA foreign_keys=on");
                    i3 = i11;
                    num = num3;
                    break;
                case 55:
                    try {
                        sQLiteDatabase2.execSQL("ALTER TABLE user ADD COLUMN is_primary_device INTEGER DEFAULT 0");
                        i3 = i11;
                        num = num3;
                        break;
                    } catch (SQLiteException e2) {
                        m85292a(e2);
                        i3 = i11;
                        num = num3;
                        break;
                    }
                default:
                    i3 = i11;
                    num = num3;
                    break;
            }
            i11 = i3 + 1;
            i8 = i2;
            i10 = num;
            i9 = 1;
            r10 = 0;
            c = 2;
        }
    }

    private azcl(Context context, String str) {
        super(context, str, str, 55);
        this.f98989a = context;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA secure_delete=ON;", null);
        if (rawQuery != null) {
            try {
                rawQuery.getCount();
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
    }

    /* renamed from: a */
    public static azcl m85289a(Context context) {
        azcl azcl;
        synchronized (f98983d) {
            if (f98984e == null) {
                f98984e = new azcl(context.getApplicationContext(), "matchstickv9.db");
            }
            azcl = f98984e;
        }
        return azcl;
    }

    /* renamed from: a */
    public static String m85290a(String str, String str2) {
        return String.format("%s.%s", str, str2);
    }

    /* renamed from: a */
    private final void m85291a() {
        String[] databaseList;
        String string;
        if ("matchstickv9.db".equals(getDatabaseName()) && (databaseList = this.f98989a.databaseList()) != null) {
            for (String str : databaseList) {
                if ("matchstick.db".equals(str)) {
                    azdl a = azdl.m85412a(this.f98989a);
                    if (a.f99088a.getBoolean("V9_DB_COPY_DONE", false)) {
                        this.f98989a.deleteDatabase("matchstick.db");
                        return;
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        new azcl(this.f98989a, "matchstick.db").getWritableDatabase().close();
                        String valueOf = String.valueOf(this.f98989a.getDatabasePath("matchstick.db"));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        sb.append("ATTACH DATABASE [");
                        sb.append(valueOf);
                        sb.append("] AS oldDatabase");
                        writableDatabase.execSQL(sb.toString());
                        writableDatabase.execSQL("PRAGMA foreign_keys=OFF;");
                        writableDatabase.beginTransaction();
                        Cursor query = writableDatabase.query("oldDatabase.sqlite_master", f98982c, "type='table'", null, null, null, null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                try {
                                    string = query.getString(0);
                                    if (!string.startsWith("android_") && !string.startsWith("sqlite_")) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 39 + String.valueOf(string).length());
                                        sb2.append("INSERT INTO ");
                                        sb2.append(string);
                                        sb2.append(" SELECT * FROM oldDatabase.");
                                        sb2.append(string);
                                        writableDatabase.execSQL(sb2.toString());
                                    }
                                } catch (SQLiteException e) {
                                    azoj.m85933c("DB", "Table copy failure : %s", string);
                                } catch (Throwable th) {
                                    query.close();
                                    throw th;
                                }
                            }
                            query.close();
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        writableDatabase.execSQL("PRAGMA foreign_keys=ON;");
                        writableDatabase.execSQL("DETACH DATABASE oldDatabase");
                    } catch (Exception e2) {
                    }
                    SharedPreferences.Editor edit = a.f99088a.edit();
                    edit.putBoolean("V9_DB_COPY_DONE", true);
                    edit.apply();
                    this.f98989a.deleteDatabase("matchstick.db");
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m85292a(SQLiteException sQLiteException) {
        Throwable th = sQLiteException;
        while (th != null) {
            if (!th.getMessage().contains("duplicate column name")) {
                th = th.getCause();
            } else {
                return;
            }
        }
        throw sQLiteException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        m85293d(sQLiteDatabase);
    }
}
