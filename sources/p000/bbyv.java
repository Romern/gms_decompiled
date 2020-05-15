package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

/* renamed from: bbyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyv extends SQLiteOpenHelper {

    /* renamed from: a */
    static final String[] f103770a = {"id", "conversation_type", "conversation_group_id", "conversation_group_app_name", "other_contact_row_id", "update_timestamp_us", "owner_row_id", "conversation_app_data", "conversation_properties"};

    /* renamed from: b */
    private final Context f103771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bbyv(Context context, long j) {
        super(context, String.format("lighter_messaging_%d.db", Long.valueOf(j)), (SQLiteDatabase.CursorFactory) null, 22);
        boolean z = true;
        z = j < 0 ? false : z;
        bboz.m88304a();
        bmxy.m108589a(z, "registrationId is invalid; ensure AccountContext is valid");
        this.f103771b = context;
    }

    /* renamed from: a */
    private static final void m88638a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(bcdx.f104022b);
        sQLiteDatabase.execSQL("CREATE INDEX messagesRENDERING_TYPE on messages(rendering_type)");
        sQLiteDatabase.execSQL("CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)");
    }

    /* renamed from: b */
    private static final void m88639b(SQLiteDatabase sQLiteDatabase) {
        bcbc.m88746a(sQLiteDatabase);
        m88638a(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m88638a(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 >= 19) {
            while (true) {
                i--;
                if (i < i2) {
                    return;
                }
                if (i == 19) {
                    bcbc.m88749a(sQLiteDatabase, "messages", bcdx.f104022b, bcdx.f104021a);
                    bcbc.m88749a(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", f103770a);
                    bcbc.m88749a(sQLiteDatabase, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)", bcdt.f104018a);
                    bcbc.m88749a(sQLiteDatabase, "participants", "CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)", bcea.f104024a);
                    bcbc.m88749a(sQLiteDatabase, "blocks", "CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)", bcdr.f104017a);
                    bcbc.m88749a(sQLiteDatabase, "notifications", "CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)", bcdz.f104023a);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                    sQLiteDatabase.execSQL("CREATE INDEX messagesRENDERING_TYPE on messages(rendering_type)");
                } else if (i == 20) {
                    bcbc.m88749a(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", f103770a);
                }
            }
        } else {
            m88639b(sQLiteDatabase);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Throwable th;
        Throwable th2;
        Random random;
        int i6;
        long j;
        String str;
        int i7;
        int i8;
        Random random2;
        String str2;
        String str3;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        String str4;
        String str5;
        bbyv bbyv = this;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i9 = i;
        if (i9 >= 11) {
            int i10 = 1;
            int i11 = i2;
            int i12 = i9 + 1;
            while (i3 <= i11) {
                switch (i3) {
                    case 12:
                        i5 = i3;
                        bcbc.m88747a(sQLiteDatabase2, "notifications");
                        sQLiteDatabase2.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY, notification_id TEXT UNIQUE NOT NULL, notification_type INTEGER NOT NULL, notification_metadata BLOB NOT NULL, notification_properties BLOB NOT NULL)");
                        break;
                    case 13:
                        i5 = i3;
                        sQLiteDatabase2.execSQL("ALTER TABLE notifications ADD COLUMN notification_timestamp_received_ms INTEGER NOT NULL default 0;");
                        break;
                    case 14:
                        i5 = i3;
                        bcbc.m88748a(sQLiteDatabase2, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL)");
                        bcbc.m88748a(sQLiteDatabase2, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,owner_row_id INT,FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
                        break;
                    case 15:
                        int intValue = ((Integer) bbqt.m88417a(bbyv.f103771b).f103178t.mo58455c()).intValue();
                        long longValue = ((Long) bbqt.m88417a(bbyv.f103771b).f103177s.mo58455c()).longValue();
                        Random random3 = new Random();
                        String[] strArr = new String[2];
                        strArr[0] = "id";
                        strArr[i4] = "conversation_properties";
                        int i13 = intValue;
                        String str6 = "contacts";
                        String str7 = "Messaging SqliteHelper";
                        String str8 = "Unable to serialize obejct";
                        Random random4 = random3;
                        String str9 = "conversations";
                        String str10 = "conversation_properties";
                        Cursor query = sQLiteDatabase.query("conversations", strArr, null, null, null, null, null);
                        while (true) {
                            try {
                                long j2 = -1;
                                if (!query.moveToNext()) {
                                    i5 = i3;
                                    int i14 = i13;
                                    String str11 = str7;
                                    String str12 = str8;
                                    if (query != null) {
                                        query.close();
                                    }
                                    String str13 = str11;
                                    String str14 = "contact_properties";
                                    Random random5 = new Random();
                                    int i15 = i14;
                                    Object obj = "last_sync_date";
                                    Object obj2 = "expiration_time_ms";
                                    Cursor query2 = sQLiteDatabase.query("contacts", new String[]{"id", "contact_properties"}, null, null, null, null, null);
                                    while (query2.moveToNext()) {
                                        try {
                                            HashMap b = bbqu.m88424b(query2.getBlob(1));
                                            Object obj3 = obj;
                                            long longValue2 = ((Long) b.get(obj3)).longValue();
                                            if (longValue2 != -1) {
                                                random = random5;
                                                i6 = i15;
                                                j = longValue2 + ((long) random.nextInt(i6)) + longValue;
                                            } else {
                                                random = random5;
                                                i6 = i15;
                                                j = -1;
                                            }
                                            b.put(obj2, Long.valueOf(j));
                                            b.remove(obj3);
                                            try {
                                                byte[] a = bbqu.m88422a((Serializable) b);
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put(str14, a);
                                                try {
                                                    String[] strArr2 = new String[1];
                                                    try {
                                                        strArr2[0] = String.valueOf(query2.getInt(0));
                                                        str = str6;
                                                        try {
                                                            sQLiteDatabase2.update(str, contentValues, "id = ?", strArr2);
                                                            obj = obj3;
                                                            i15 = i6;
                                                            random5 = random;
                                                            str6 = str;
                                                        } catch (IOException e) {
                                                            String str15 = str13;
                                                            bbos.m88294d(str15, str12);
                                                            obj = obj3;
                                                            str13 = str15;
                                                            i15 = i6;
                                                            random5 = random;
                                                            str6 = str;
                                                        }
                                                    } catch (IOException e2) {
                                                        str = str6;
                                                        String str152 = str13;
                                                        bbos.m88294d(str152, str12);
                                                        obj = obj3;
                                                        str13 = str152;
                                                        i15 = i6;
                                                        random5 = random;
                                                        str6 = str;
                                                    }
                                                } catch (IOException e3) {
                                                    str = str6;
                                                    String str1522 = str13;
                                                    bbos.m88294d(str1522, str12);
                                                    obj = obj3;
                                                    str13 = str1522;
                                                    i15 = i6;
                                                    random5 = random;
                                                    str6 = str;
                                                }
                                            } catch (IOException e4) {
                                                str = str6;
                                                String str15222 = str13;
                                                bbos.m88294d(str15222, str12);
                                                obj = obj3;
                                                str13 = str15222;
                                                i15 = i6;
                                                random5 = random;
                                                str6 = str;
                                            }
                                        } catch (Throwable th6) {
                                            bqye.m113761a(th2, th6);
                                            break;
                                        }
                                    }
                                    if (query2 == null) {
                                        break;
                                    } else {
                                        query2.close();
                                        break;
                                    }
                                } else {
                                    HashMap a2 = bcbx.m88780a(query.getBlob(i4));
                                    long longValue3 = ((Long) a2.get("last_sync_date")).longValue();
                                    if (longValue3 != -1) {
                                        i8 = i13;
                                        random2 = random4;
                                        i7 = i3;
                                        j2 = longValue3 + ((long) random2.nextInt(i8)) + longValue;
                                    } else {
                                        i7 = i3;
                                        i8 = i13;
                                        random2 = random4;
                                    }
                                    a2.put("expiration_time_ms", Long.valueOf(j2));
                                    a2.remove("last_sync_date");
                                    try {
                                        byte[] a3 = bbqu.m88422a((Serializable) a2);
                                        ContentValues contentValues2 = new ContentValues();
                                        str3 = str10;
                                        try {
                                            contentValues2.put(str3, a3);
                                            String[] strArr3 = new String[1];
                                            try {
                                                strArr3[0] = String.valueOf(query.getInt(0));
                                                str2 = str9;
                                                try {
                                                    sQLiteDatabase2.update(str2, contentValues2, "id = ?", strArr3);
                                                    str10 = str3;
                                                    random4 = random2;
                                                    str9 = str2;
                                                    i13 = i8;
                                                    i3 = i7;
                                                    i4 = 1;
                                                } catch (IOException e5) {
                                                    String str16 = str7;
                                                    String str17 = str8;
                                                    bbos.m88294d(str16, str17);
                                                    str7 = str16;
                                                    str10 = str3;
                                                    random4 = random2;
                                                    str9 = str2;
                                                    i13 = i8;
                                                    str8 = str17;
                                                    i3 = i7;
                                                    i4 = 1;
                                                }
                                            } catch (IOException e6) {
                                                str2 = str9;
                                                String str162 = str7;
                                                String str172 = str8;
                                                bbos.m88294d(str162, str172);
                                                str7 = str162;
                                                str10 = str3;
                                                random4 = random2;
                                                str9 = str2;
                                                i13 = i8;
                                                str8 = str172;
                                                i3 = i7;
                                                i4 = 1;
                                            }
                                        } catch (IOException e7) {
                                            str2 = str9;
                                            String str1622 = str7;
                                            String str1722 = str8;
                                            bbos.m88294d(str1622, str1722);
                                            str7 = str1622;
                                            str10 = str3;
                                            random4 = random2;
                                            str9 = str2;
                                            i13 = i8;
                                            str8 = str1722;
                                            i3 = i7;
                                            i4 = 1;
                                        }
                                    } catch (IOException e8) {
                                        str2 = str9;
                                        str3 = str10;
                                        String str16222 = str7;
                                        String str17222 = str8;
                                        bbos.m88294d(str16222, str17222);
                                        str7 = str16222;
                                        str10 = str3;
                                        random4 = random2;
                                        str9 = str2;
                                        i13 = i8;
                                        str8 = str17222;
                                        i3 = i7;
                                        i4 = 1;
                                    }
                                }
                            } catch (Throwable th7) {
                                bqye.m113761a(th, th7);
                                break;
                            }
                        }
                        break;
                    case 16:
                        sQLiteDatabase2.execSQL("ALTER TABLE blocks ADD COLUMN lighter_id_normalized_id TEXT;");
                        sQLiteDatabase2.execSQL("CREATE UNIQUE INDEX blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                        sQLiteDatabase2.execSQL("ALTER TABLE contacts ADD COLUMN lighter_id_normalized_id TEXT;");
                        int i16 = 2;
                        String str18 = "contacts";
                        Cursor query3 = sQLiteDatabase.query("blocks", null, null, null, null, null, null);
                        if (query3 != null) {
                            try {
                                if (query3.moveToFirst()) {
                                    while (true) {
                                        int i17 = query3.getInt(bcdq.m88851a(i4));
                                        String string = query3.getString(bcdq.m88851a(3));
                                        int i18 = query3.getInt(bcdq.m88851a(i16));
                                        ContentValues contentValues3 = new ContentValues();
                                        if (i18 == 2) {
                                            string = bboo.m88285a(string);
                                        }
                                        contentValues3.put("lighter_id_normalized_id", string);
                                        String[] strArr4 = new String[i4];
                                        strArr4[0] = Integer.toString(i17);
                                        sQLiteDatabase2.update("blocks", contentValues3, "id = ? ", strArr4);
                                        if (query3.moveToNext()) {
                                            i16 = 2;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                bqye.m113761a(th4, th8);
                                break;
                            }
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        int i19 = 2;
                        String str19 = "lighter_id_normalized_id";
                        Cursor query4 = sQLiteDatabase.query("contacts", null, null, null, null, null, null);
                        if (query4 != null) {
                            try {
                                if (query4.moveToFirst()) {
                                    while (true) {
                                        int i20 = query4.getInt(bcds.m88852a(i4));
                                        String string2 = query4.getString(bcds.m88852a(3));
                                        int i21 = query4.getInt(bcds.m88852a(i19));
                                        ContentValues contentValues4 = new ContentValues();
                                        if (i21 == 2) {
                                            string2 = bboo.m88285a(string2);
                                        }
                                        contentValues4.put(str19, string2);
                                        String[] strArr5 = new String[i4];
                                        strArr5[0] = Integer.toString(i20);
                                        String str20 = str18;
                                        sQLiteDatabase2.update(str20, contentValues4, "id = ? ", strArr5);
                                        if (query4.moveToNext()) {
                                            str18 = str20;
                                            i19 = 2;
                                        }
                                    }
                                }
                            } catch (Throwable th9) {
                                bqye.m113761a(th3, th9);
                                break;
                            }
                        }
                        if (query4 == null) {
                            i5 = i3;
                            break;
                        } else {
                            query4.close();
                            i5 = i3;
                            break;
                        }
                    case 17:
                        sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN needs_delivery_receipt INTEGER NOT NULL default 0;");
                        i5 = i3;
                        break;
                    case 18:
                        sQLiteDatabase2.execSQL("ALTER TABLE conversations ADD COLUMN conversation_app_data BLOB NOT NULL default 0;");
                        String[] strArr6 = new String[2];
                        strArr6[0] = "id";
                        strArr6[i4] = "conversation_properties";
                        String str21 = "conversation_properties";
                        String str22 = "conversations";
                        String str23 = "Messaging SqliteHelper";
                        String str24 = "Unable to serialize obejct";
                        Cursor query5 = sQLiteDatabase.query("conversations", strArr6, null, null, null, null, null);
                        while (query5.moveToNext()) {
                            try {
                                HashMap a4 = bcbx.m88780a(query5.getBlob(i4));
                                HashMap hashMap = (HashMap) a4.get("app_data");
                                a4.remove("app_data");
                                try {
                                    byte[] a5 = bbqu.m88422a((Serializable) a4);
                                    ContentValues contentValues5 = new ContentValues();
                                    str4 = str21;
                                    try {
                                        contentValues5.put(str4, a5);
                                        contentValues5.put("conversation_app_data", bcbx.m88782a(hashMap));
                                        String[] strArr7 = new String[i4];
                                        try {
                                            strArr7[0] = String.valueOf(query5.getInt(0));
                                            str5 = str22;
                                            try {
                                                sQLiteDatabase2.update(str5, contentValues5, "id = ?", strArr7);
                                                str22 = str5;
                                                str21 = str4;
                                            } catch (IOException e9) {
                                                String str25 = str23;
                                                String str26 = str24;
                                                bbos.m88294d(str25, str26);
                                                str23 = str25;
                                                str24 = str26;
                                                str22 = str5;
                                                str21 = str4;
                                            }
                                        } catch (IOException e10) {
                                            str5 = str22;
                                            String str252 = str23;
                                            String str262 = str24;
                                            bbos.m88294d(str252, str262);
                                            str23 = str252;
                                            str24 = str262;
                                            str22 = str5;
                                            str21 = str4;
                                        }
                                    } catch (IOException e11) {
                                        str5 = str22;
                                        String str2522 = str23;
                                        String str2622 = str24;
                                        bbos.m88294d(str2522, str2622);
                                        str23 = str2522;
                                        str24 = str2622;
                                        str22 = str5;
                                        str21 = str4;
                                    }
                                } catch (IOException e12) {
                                    str4 = str21;
                                    str5 = str22;
                                    String str25222 = str23;
                                    String str26222 = str24;
                                    bbos.m88294d(str25222, str26222);
                                    str23 = str25222;
                                    str24 = str26222;
                                    str22 = str5;
                                    str21 = str4;
                                }
                            } catch (Throwable th10) {
                                bqye.m113761a(th5, th10);
                                break;
                            }
                        }
                        if (query5 == null) {
                            i5 = i3;
                            break;
                        } else {
                            query5.close();
                            i5 = i3;
                            break;
                        }
                    case 19:
                        sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN capability INTEGER NOT NULL DEFAULT -1;");
                        i5 = i3;
                        break;
                    case 20:
                        int i22 = bctq.f104880a.f104888h;
                        StringBuilder sb = new StringBuilder(84);
                        sb.append("ALTER TABLE messages ADD COLUMN rendering_type INTEGER NOT NULL DEFAULT ");
                        sb.append(i22);
                        sb.append(";");
                        sQLiteDatabase2.execSQL(sb.toString());
                        sQLiteDatabase2.execSQL("CREATE INDEX messagesRENDERING_TYPE on messages(rendering_type)");
                        i5 = i3;
                        break;
                    case 21:
                        sQLiteDatabase2.execSQL("ALTER TABLE conversations ADD COLUMN last_deleted_timestamp_us INT NOT NULL DEFAULT 0;");
                        i5 = i3;
                        break;
                    case 22:
                        sQLiteDatabase2.execSQL("ALTER TABLE messages ADD COLUMN filterable_flags INTEGER NOT NULL DEFAULT 0;");
                        i5 = i3;
                        break;
                    default:
                        i5 = i3;
                        break;
                }
                i12 = i5 + 1;
                bbyv = this;
                i10 = 1;
            }
            return;
        }
        m88639b(sQLiteDatabase);
        return;
        throw th5;
        throw th4;
        throw th3;
        throw th;
        throw th2;
    }
}
