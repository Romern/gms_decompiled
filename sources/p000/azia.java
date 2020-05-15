package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: azia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azia extends azhy {
    public azia(Context context, azfx azfx) {
        super(context, azfx);
        this.f99454c = azou.m85976a(ciow.RESET);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo54938a() {
        return "reset";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0249, code lost:
        if (r0 >= 0) goto L_0x025c;
     */
    /* renamed from: b */
    public final cioy mo54941b() {
        SQLiteDatabase writableDatabase;
        aeat.m51532a(this.f99452a).mo33985a("com.google.android.gms.matchstick.task.ScheduledTaskService");
        azcw a = azcw.m85379a(this.f99452a);
        ArrayList arrayList = new ArrayList();
        Executor executor = azox.f99803a;
        SharedPreferences.Editor edit = azdl.m85412a(a.f99018a).f99088a.edit();
        edit.clear();
        edit.commit();
        azcv a2 = azcv.m85357a(a.f99018a);
        azcm a3 = azcm.m85300a(a2.f99016a);
        if (a3.mo54658b()) {
            a3.f98996b.beginTransaction();
            try {
                a3.f98996b.delete("user", "1", null);
                a3.f98996b.setTransactionSuccessful();
            } finally {
                a3.f98996b.endTransaction();
            }
        }
        azcm a4 = azcm.m85300a(a2.f99016a);
        if (a4.mo54658b()) {
            a4.f98996b.beginTransaction();
            try {
                a4.f98996b.delete("registration", "1", null);
                a4.f98996b.setTransactionSuccessful();
            } finally {
                a4.f98996b.endTransaction();
            }
        }
        azcd a5 = azcd.m85252a(a.f99018a);
        synchronized (a5.f98962b) {
            a5.f98963c.clear();
        }
        a5.f98964d.f98979a.mo15548a();
        try {
            SQLiteDatabase writableDatabase2 = a5.f98961a.getWritableDatabase();
            writableDatabase2.beginTransaction();
            try {
                writableDatabase2.delete("appString", "1", null);
                writableDatabase2.delete("appData", "1", null);
                writableDatabase2.setTransactionSuccessful();
            } finally {
                writableDatabase2.endTransaction();
            }
        } catch (SQLiteException e) {
            arrayList.add(azou.m85979a(3, ""));
        }
        azcj a6 = azcj.m85279a(a.f99018a);
        a6.f98978c.clear();
        a6.f98976a.evictAll();
        azcm a7 = azcm.m85300a(a.f99018a);
        if (!a7.mo54658b()) {
            azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            arrayList.add(azou.m85979a(4, ""));
        } else {
            if (!a7.mo54658b()) {
                azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            } else {
                a7.f98996b.beginTransaction();
                try {
                    a7.f98996b.delete("messages", "1", null);
                    a7.f98996b.delete("conversationParticipants", "1", null);
                    a7.f98996b.delete("conversations", "1", null);
                    a7.f98996b.setTransactionSuccessful();
                } finally {
                    a7.f98996b.endTransaction();
                }
            }
            if (!a7.mo54658b()) {
                azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[0]);
            } else {
                a7.f98996b.beginTransaction();
                try {
                    a7.f98996b.delete("smartReply", "1", null);
                    a7.f98996b.setTransactionSuccessful();
                } finally {
                    a7.f98996b.endTransaction();
                }
            }
            a7.mo54664d();
        }
        azcy a8 = azcy.m85381a(a.f99018a);
        if (!a8.mo54710b()) {
            azoj.m85933c("MsMediaManager", "Cannot delete media tables.", new Object[0]);
        } else {
            if (!a8.mo54709a()) {
                a8.f99024b = azcl.m85289a(a8.f99023a).getReadableDatabase();
            }
            String[] strArr = {"media", "mediaUpload", "sticker"};
            String[] strArr2 = {"downloaded_file_uri", "local_file_uri", "storage_uri"};
            boolean z = true;
            for (int i = 0; i < 3; i++) {
                Cursor query = a8.f99024b.query(strArr[i], new String[]{strArr2[i]}, null, null, null, null, null);
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex(strArr2[i]));
                    if (!TextUtils.isEmpty(string)) {
                        z &= azoc.m85904a(Uri.parse(string));
                    }
                }
                query.close();
            }
            if (z) {
                a8.f99024b.beginTransaction();
                try {
                    a8.f99024b.delete("media", "1", null);
                    a8.f99024b.delete("mediaUpload", "1", null);
                    a8.f99024b.delete("sticker", "1", null);
                    a8.f99024b.setTransactionSuccessful();
                    writableDatabase = azdj.m85399a(a.f99018a).f99085a.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        int delete = writableDatabase.delete("profile", "1", null);
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                } finally {
                    a8.f99024b.endTransaction();
                }
            }
        }
        arrayList.add(azou.m85979a(6, ""));
        try {
            writableDatabase = azdj.m85399a(a.f99018a).f99085a.getWritableDatabase();
            writableDatabase.beginTransaction();
            int delete2 = writableDatabase.delete("profile", "1", null);
            writableDatabase.setTransactionSuccessful();
        } catch (SQLiteException e2) {
        }
        arrayList.add(azou.m85979a(7, ""));
        if (!arrayList.isEmpty()) {
            return azou.m85977a(azou.m85978a(8, arrayList), "Remove client data error");
        }
        return null;
    }
}
