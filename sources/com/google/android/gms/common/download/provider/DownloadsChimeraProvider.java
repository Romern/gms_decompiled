package com.google.android.gms.common.download.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.google.android.gms.common.download.DownloadIntentOperation;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadsChimeraProvider extends sgo {

    /* renamed from: b */
    private static final Map f30196b = new HashMap(13);

    /* renamed from: c */
    private static final UriMatcher f30197c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f30197c = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.download", "download", 100);
        f30197c.addURI("com.google.android.gms.download", "download/*", 101);
        String[] strArr = {"_id", "filename", "url", "sizeBytes", "sha1", "destination", "minVersion", "maxVersion", "notificationTitle", "notificationDescription", "enabled", "retries", "dm_id"};
        for (int i = 0; i < 13; i++) {
            String str = strArr[i];
            Map map = f30196b;
            String valueOf = String.valueOf(str);
            map.put(str, valueOf.length() == 0 ? new String("downloads.") : "downloads.".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7298a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int match = f30197c.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "filename=?";
            }
            return sQLiteDatabase.update("downloads", contentValues, str, strArr);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid Uri: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AssetFileDescriptor mo7300a(Uri uri, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7304b() {
        return "downloads.db";
    }

    public final String getType(Uri uri) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ SQLiteOpenHelper mo7305c() {
        Context context = getContext();
        if (ryq.f43859a == null) {
            synchronized (ryq.f43860b) {
                if (ryq.f43859a == null) {
                    int i = DownloadIntentOperation.f30182c;
                    ryq.f43859a = new ryq(context, "downloads.db");
                }
            }
        }
        return ryq.f43859a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7299a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        int match = f30197c.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "filename=?";
            }
            return sQLiteDatabase.delete("downloads", str, strArr);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid Uri: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final Cursor mo7301a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        String str3;
        int match = f30197c.match(uri);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setStrict(true);
        if (match == 100 || match == 101) {
            if (match == 101) {
                str3 = "filename=?";
                strArr3 = new String[]{uri.getLastPathSegment()};
            } else {
                str3 = str;
                strArr3 = strArr2;
            }
            sQLiteQueryBuilder.setTables("downloads");
            sQLiteQueryBuilder.setProjectionMap(f30196b);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str3, strArr3, null, null, str2);
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid Uri: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo7302a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        if (f30197c.match(uri) != 100) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid Uri: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (sQLiteDatabase.insert("downloads", null, contentValues) != -1) {
            return Uri.withAppendedPath(uri, contentValues.getAsString("filename"));
        } else {
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentResolver.notifyChange(android.net.Uri, android.database.ContentObserver, boolean):void}
     arg types: [android.net.Uri, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.content.ContentResolver.notifyChange(android.net.Uri, android.database.ContentObserver, int):void}
      ClspMth{android.content.ContentResolver.notifyChange(android.net.Uri, android.database.ContentObserver, boolean):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7303a() {
        getContext().getContentResolver().notifyChange(rys.f43862a, (ContentObserver) null, true);
    }
}
