package com.google.android.gms.plus.provider;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlusChimeraContentProvider extends sgo implements OnAccountsUpdateListener {

    /* renamed from: d */
    private static UriMatcher f82603d;

    /* renamed from: b */
    public aoal f82604b;

    /* renamed from: c */
    public File f82605c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f82603d = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.plus.action", "frames", 2);
        f82603d.addURI("com.google.android.gms.plus.action", "frames/#", 3);
        f82603d.addURI("com.google.android.gms.plus.action", "analytics", 4);
        f82603d.addURI("com.google.android.gms.plus", "images", 5);
        f82603d.addURI("com.google.android.gms.plus", "avatars/*", 6);
        f82603d.addURI("com.google.android.gms.plus.action", "profiles", 7);
    }

    /* renamed from: b */
    public final ContentValues mo46636b(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        if (str == null || (query = sQLiteDatabase.query("plus_accounts", new String[]{"account_name", "profile_image_url"}, "account_name=?", new String[]{str}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                ContentValues contentValues = new ContentValues(2);
                DatabaseUtils.cursorRowToContentValues(query, contentValues);
                return contentValues;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7304b() {
        return "plus.db";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final SQLiteOpenHelper mo7305c() {
        return this.f82604b;
    }

    public final String getType(Uri uri) {
        switch (f82603d.match(uri)) {
            case 2:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.actions";
            case 3:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.action";
            case 4:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.analytics";
            case 5:
            case 6:
                return "vnd.android.cursor.item/vnd.google.android.gms.image";
            case 7:
                return "vnd.android.cursor.dir/vnd.google.android.gms.plus.profiles";
            default:
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unknown content URI: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        new aoaj(getContext().getContentResolver()).execute(accountArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void
     arg types: [com.google.android.gms.plus.provider.PlusChimeraContentProvider, ?[OBJECT, ARRAY], int]
     candidates:
      adyd.a(android.accounts.Account, java.util.ArrayList, java.lang.String[]):android.content.Intent
      adyd.a(android.accounts.Account, java.lang.String[], android.accounts.AccountManagerCallback):android.accounts.AccountManagerFuture
      adyd.a(android.accounts.Account, java.lang.String, int):boolean
      adyd.a(android.accounts.Account, java.lang.String, android.os.Bundle):boolean
      adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void */
    public final boolean onCreate() {
        Context context = getContext();
        adyd.m51363a(context).mo33912a((OnAccountsUpdateListener) this, (Handler) null, true);
        this.f82605c = new File(context.getCacheDir(), "avatars");
        this.f82604b = new aoal(getContext(), "plus.db");
        return true;
    }

    /* renamed from: a */
    private final ContentValues m68544a(Uri uri) {
        String str;
        sdo.checkIfNull(uri, "URI must not be null.");
        if ("com.google.android.gms.plus".equals(uri.getAuthority())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                str = pathSegments.get(1);
            } else {
                str = null;
            }
            if (str != null) {
                return mo46636b(str, this.f82604b.getReadableDatabase());
            }
            return null;
        }
        throw new IllegalArgumentException("URI is not a +1 URI.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7298a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Unknown URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7299a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        int match = f82603d.match(uri);
        if (match == 3) {
            return sQLiteDatabase.delete("offline_frames", "_id=?", new String[]{Long.toString(ContentUris.parseId(uri))});
        } else if (match == 4) {
            return sQLiteDatabase.delete("offline_logs", str, strArr);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122 A[Catch:{ all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0148 A[SYNTHETIC, Splitter:B:55:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158 A[SYNTHETIC, Splitter:B:64:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015f  */
    /* renamed from: a */
    public final AssetFileDescriptor mo7300a(Uri uri, String str) {
        byte[] bArr;
        File file;
        FileOutputStream fileOutputStream;
        int match = f82603d.match(uri);
        File file2 = null;
        r3 = null;
        FileOutputStream fileOutputStream2 = null;
        if (match == 5) {
            anry a = anry.m65083a();
            synchronized (a.f77565c) {
                bArr = (byte[]) a.f77565c.mo15546a(uri);
            }
            if (bArr != null) {
                try {
                    file = File.createTempFile("img", null, getContext().getCacheDir());
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = null;
                    try {
                        if (Log.isLoggable("PlusContentProvider", 5)) {
                        }
                        if (fileOutputStream != null) {
                        }
                        if (file2 != null) {
                        }
                        return super.openAssetFile(uri, str);
                    } catch (Throwable th) {
                        th = th;
                        file = file2;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e2) {
                            }
                        }
                        if (file != null) {
                            file.delete();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file = null;
                    if (fileOutputStream2 != null) {
                    }
                    if (file != null) {
                    }
                    throw th;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArr);
                        AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0, file.length());
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                        if (file != null) {
                            file.delete();
                        }
                        return assetFileDescriptor;
                    } catch (IOException e4) {
                        e = e4;
                        file2 = file;
                        if (Log.isLoggable("PlusContentProvider", 5)) {
                        }
                        if (fileOutputStream != null) {
                        }
                        if (file2 != null) {
                        }
                        return super.openAssetFile(uri, str);
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                        }
                        if (file != null) {
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream = null;
                    file2 = file;
                    if (Log.isLoggable("PlusContentProvider", 5)) {
                        String valueOf = String.valueOf(uri);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                        sb.append("Failed to create temp image file for ");
                        sb.append(valueOf);
                        Log.w("PlusContentProvider", sb.toString(), e);
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                    return super.openAssetFile(uri, str);
                } catch (Throwable th4) {
                    th = th4;
                    if (fileOutputStream2 != null) {
                    }
                    if (file != null) {
                    }
                    throw th;
                }
            }
            return super.openAssetFile(uri, str);
        } else if (match != 6) {
            return super.openAssetFile(uri, str);
        } else {
            if ("r".equals(str)) {
                ContentValues a2 = m68544a(uri);
                if (a2 != null) {
                    String asString = a2.getAsString("account_name");
                    if (asString != null) {
                        File file3 = new File(this.f82605c, asString);
                        return new AssetFileDescriptor(ParcelFileDescriptor.open(file3, 268435456), 0, file3.length());
                    }
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
                    sb2.append("No account: ");
                    sb2.append(valueOf2);
                    throw new FileNotFoundException(sb2.toString());
                }
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 15);
                sb3.append("No image data: ");
                sb3.append(valueOf3);
                throw new FileNotFoundException(sb3.toString());
            }
            String uri2 = uri.toString();
            StringBuilder sb4 = new StringBuilder(String.valueOf(uri2).length() + 30 + String.valueOf(str).length());
            sb4.append("Failed to open '");
            sb4.append(uri2);
            sb4.append("' with mode '");
            sb4.append(str);
            sb4.append("'");
            Log.e("PlusContentProvider", sb4.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final Cursor mo7301a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ContentValues a;
        int i;
        String[] strArr3 = strArr;
        int match = f82603d.match(uri);
        if (match == 2) {
            Cursor query = sQLiteDatabase.query("offline_frames", strArr, str, strArr2, null, null, str2);
            query.setNotificationUri(getContext().getContentResolver(), anub.f77731a);
            return query;
        } else if (match == 4) {
            Cursor query2 = sQLiteDatabase.query("offline_logs", strArr, str, strArr2, null, null, str2);
            query2.setNotificationUri(getContext().getContentResolver(), anua.f77730a);
            return query2;
        } else if (match == 5) {
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            if (strArr3.length == 2 && "url".equals(strArr3[0]) && "local".equals(strArr3[1])) {
                String queryParameter = uri.getQueryParameter("url");
                String queryParameter2 = uri.getQueryParameter("bounding_box");
                if (queryParameter2 != null) {
                    rzh rzh = new rzh(queryParameter);
                    rzh.mo25266a(Integer.parseInt(queryParameter2));
                    queryParameter = rzh.mo25265a();
                }
                matrixCursor.addRow(new Object[]{queryParameter, 0});
            }
            return matrixCursor;
        } else if (match == 6) {
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            if (strArr3.length == 2 && strArr3[0] == "url" && strArr3[1] == "local" && (a = m68544a(uri)) != null) {
                String asString = a.getAsString("profile_image_url");
                String asString2 = a.getAsString("account_name");
                if (asString2 != null) {
                    File file = new File(this.f82605c, asString2);
                    if (file.exists()) {
                        i = System.currentTimeMillis() - file.lastModified() > 21600000 ? 2 : 1;
                        matrixCursor2.addRow(new Object[]{asString, Integer.valueOf(i)});
                    }
                }
                i = 0;
                matrixCursor2.addRow(new Object[]{asString, Integer.valueOf(i)});
            }
            return matrixCursor2;
        } else if (match == 7) {
            Cursor query3 = sQLiteDatabase.query("plus_profiles", strArr, str, strArr2, null, null, str2);
            query3.setNotificationUri(getContext().getContentResolver(), anub.f77731a);
            return query3;
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo7302a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        int match = f82603d.match(uri);
        if (match == 2) {
            return ContentUris.withAppendedId(uri, sQLiteDatabase.insertOrThrow("offline_frames", null, contentValues));
        }
        if (match == 4) {
            return ContentUris.withAppendedId(uri, sQLiteDatabase.insertOrThrow("offline_logs", null, contentValues));
        }
        if (match == 5) {
            anry a = anry.m65083a();
            byte[] asByteArray = contentValues.getAsByteArray("image_data");
            synchronized (a.f77565c) {
                a.f77565c.mo15547a(uri, asByteArray);
            }
            return uri;
        } else if (match == 6) {
            ContentValues a2 = m68544a(uri);
            if (a2 != null) {
                String asString = a2.getAsString("account_name");
                if (asString != null) {
                    File file = new File(this.f82605c, asString);
                    if (file.exists()) {
                        Log.e("PlusContentProvider", "Unexpected cache file found...removing.");
                        file.delete();
                    }
                }
                try {
                    if (!this.f82605c.exists()) {
                        this.f82605c.mkdir();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f82605c, asString));
                    fileOutputStream.write(contentValues.getAsByteArray("image_data"));
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    Log.e("PlusContentProvider", e.getLocalizedMessage());
                } catch (IOException e2) {
                    Log.e("PlusContentProvider", e2.getLocalizedMessage());
                }
            }
            return uri;
        } else if (match == 7) {
            return ContentUris.withAppendedId(uri, sQLiteDatabase.insertOrThrow("plus_profiles", null, contentValues));
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
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
        getContext().getContentResolver().notifyChange(anud.f77732a, (ContentObserver) null, true);
    }

    /* renamed from: a */
    public final void mo46635a(String str, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {str};
        sQLiteDatabase.delete("plus_accounts", "account_name=?", strArr);
        sQLiteDatabase.delete("plus_profiles", "accountName=?", strArr);
        sQLiteDatabase.delete("offline_frames", "accountName=?", strArr);
        sQLiteDatabase.delete("offline_logs", "accountName=?", strArr);
        File file = new File(this.f82605c, str);
        if (file.exists()) {
            file.delete();
        }
    }
}
