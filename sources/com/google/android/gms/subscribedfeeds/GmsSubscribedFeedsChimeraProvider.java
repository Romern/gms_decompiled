package com.google.android.gms.subscribedfeeds;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsSubscribedFeedsChimeraProvider extends ContentProvider {

    /* renamed from: a */
    private static final Map f108302a;

    /* renamed from: b */
    private UriMatcher f108303b;

    /* renamed from: c */
    private srp f108304c;

    /* renamed from: d */
    private ContentResolver f108305d;

    /* renamed from: e */
    private final ScheduledExecutorService f108306e = adzl.f62962b.mo25877a(1, 1);

    /* renamed from: f */
    private ashi f108307f;

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
    private static ContentValues m93000a(ContentValues contentValues) {
        ContentValues contentValues2 = new ContentValues(contentValues);
        contentValues2.put("_sync_dirty", (Integer) 1);
        return contentValues2;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        try {
            if (m93005a(3)) {
                if (cgvi.m147139d()) {
                    return this.f108305d.delete(m93002a(uri), str, strArr);
                }
                if (this.f108304c != null) {
                    int delete = this.f108304c.getWritableDatabase().delete("feeds", m93003a(uri, str, "Delete"), strArr);
                    m93004a(uri, (long) delete);
                    return delete;
                }
                Log.e("GmsSubscribedFeeds", "Cannot Open database.");
            }
            return 0;
        } catch (SQLiteException | UnsupportedOperationException e) {
            Log.e("GmsSubscribedFeeds", "Could not perform the delete operation: ", e);
            return 0;
        }
    }

    public final String getType(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("GetType: Uri: ");
        sb.append(valueOf);
        Log.i("GmsSubscribedFeeds", sb.toString());
        int match = m93001a().match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/com.google.android.gms.subscribedfeeds.feeds";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/com.google.android.gms.subscribedfeeds.feeds";
        }
        Log.e("GmsSubscribedFeeds", "Unknown URL.");
        return "";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        try {
            if (m93005a(1)) {
                if (cgvi.m147139d()) {
                    return this.f108305d.insert(m93002a(uri), contentValues);
                }
                srp srp = this.f108304c;
                if (srp != null) {
                    SQLiteDatabase writableDatabase = srp.getWritableDatabase();
                    int match = m93001a().match(uri);
                    if (match == 1) {
                        long insert = writableDatabase.insert("feeds", "feed", m93000a(contentValues));
                        Uri uri2 = asht.f88994a;
                        if (insert > 0) {
                            Uri withAppendedPath = Uri.withAppendedPath(uri2, String.valueOf(insert));
                            m93004a(withAppendedPath, insert);
                            return withAppendedPath;
                        }
                        return null;
                    } else if (match != 3) {
                        String valueOf = String.valueOf(uri);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Insert not permitted for URL: ");
                        sb.append(valueOf);
                        throw new UnsupportedOperationException(sb.toString());
                    } else {
                        throw new UnsupportedOperationException("_deleted_feeds table is only used by the old sync adapter during the sync operation and cannot be queried or updated from the external clients.");
                    }
                } else {
                    Log.e("GmsSubscribedFeeds", "Cannot Open database.");
                }
            }
            return null;
        } catch (SQLiteException | UnsupportedOperationException e) {
            Log.e("GmsSubscribedFeeds", "Could not perform the insert operation: ", e);
        }
    }

    public final boolean onCreate() {
        this.f108305d = getContext().getContentResolver();
        try {
            this.f108304c = new asht(getContext().createPackageContext("com.google.android.gsf", 0), "subscribedfeeds.db");
        } catch (Exception e) {
            Log.e("GmsSubscribedFeeds", "Can't find package: com.google.android.gsf", e);
        }
        if (!cgvi.f187809a.mo6606a().mo84537d()) {
            return true;
        }
        ashi a = ashi.m74130a(this.f108306e, new beof(getContext(), "STREAMZ_SUBSCRIBEDFEEDS"));
        this.f108307f = a;
        a.mo49156a(cgvi.m147140e());
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        try {
            if (!m93005a(4)) {
                return null;
            }
            if (cgvi.m147139d()) {
                return this.f108305d.query(m93002a(uri), strArr, str, strArr2, str2);
            }
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            int match = m93001a().match(uri);
            if (match == 1) {
                str3 = null;
            } else if (match == 2) {
                String valueOf = String.valueOf(uri.getPathSegments().get(1));
                sQLiteQueryBuilder.appendWhere(valueOf.length() == 0 ? new String("feeds._id=") : "feeds._id=".concat(valueOf));
                str3 = null;
            } else if (match == 3) {
                throw new UnsupportedOperationException("_deleted_feeds table is only used by the old sync adapter during the sync operation and cannot be queried or updated from the external clients.");
            } else if (match == 4) {
                sQLiteQueryBuilder.setDistinct(true);
                sQLiteQueryBuilder.setProjectionMap(f108302a);
                str3 = "_sync_account_type,_sync_account";
            } else {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                sb.append("Unrecognised url: ");
                sb.append(valueOf2);
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.f108304c != null) {
                sQLiteQueryBuilder.setTables("feeds");
                return sQLiteQueryBuilder.query(this.f108304c.getReadableDatabase(), strArr, str, strArr2, str3, null, str2);
            }
            Log.e("GmsSubscribedFeeds", "Cannot Open database.");
            return null;
        } catch (SQLiteException | UnsupportedOperationException e) {
            Log.e("GmsSubscribedFeeds", "Could not process the query: ", e);
            return null;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            if (m93005a(2)) {
                if (cgvi.m147139d()) {
                    return this.f108305d.update(m93002a(uri), contentValues, str, strArr);
                }
                if (this.f108304c != null) {
                    int update = this.f108304c.getWritableDatabase().update("feeds", m93000a(contentValues), m93003a(uri, str, "Update"), strArr);
                    m93004a(uri, (long) update);
                    return update;
                }
                Log.e("GmsSubscribedFeeds", "Cannot Open database.");
            }
            return 0;
        } catch (SQLiteException | UnsupportedOperationException e) {
            Log.e("GmsSubscribedFeeds", "Could not perform the update operation: ", e);
            return 0;
        }
    }

    static {
        Map b = sqw.m36043b(3, false);
        b.put("_count", "COUNT(*) AS _count");
        b.put("_sync_account", "_sync_account");
        b.put("_sync_account_type", "_sync_account_type");
        f108302a = Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    private final UriMatcher m93001a() {
        if (this.f108303b == null) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            this.f108303b = uriMatcher;
            uriMatcher.addURI("com.google.android.gms.subscribedfeeds", "feeds", 1);
            this.f108303b.addURI("com.google.android.gms.subscribedfeeds", "feeds/#", 2);
            this.f108303b.addURI("com.google.android.gms.subscribedfeeds", "deleted_feeds", 3);
            this.f108303b.addURI("com.google.android.gms.subscribedfeeds", "accounts", 4);
        }
        return this.f108303b;
    }

    /* renamed from: a */
    private static Uri m93002a(Uri uri) {
        return uri.buildUpon().authority("subscribedfeeds").build();
    }

    /* renamed from: a */
    private final String m93003a(Uri uri, String str, String str2) {
        int match = m93001a().match(uri);
        if (match == 1) {
            return str;
        }
        if (match == 2) {
            String valueOf = String.valueOf(uri.getPathSegments().get(1));
            String str3 = valueOf.length() == 0 ? new String("_id=") : "_id=".concat(valueOf);
            if (str == null || str.isEmpty()) {
                return str3;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 7 + str.length());
            sb.append(str3);
            sb.append(" AND (");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(str2.length() + 24 + String.valueOf(valueOf2).length());
        sb2.append(str2);
        sb2.append(" not permitted for URL: ");
        sb2.append(valueOf2);
        throw new UnsupportedOperationException(sb2.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentResolver.notifyChange(android.net.Uri, android.database.ContentObserver, boolean):void}
     arg types: [android.net.Uri, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.content.ContentResolver.notifyChange(android.net.Uri, android.database.ContentObserver, int):void}
      ClspMth{android.content.ContentResolver.notifyChange(android.net.Uri, android.database.ContentObserver, boolean):void} */
    /* renamed from: a */
    private final void m93004a(Uri uri, long j) {
        if (j > 0) {
            this.f108305d.notifyChange(uri, (ContentObserver) null, true);
        }
    }

    /* renamed from: a */
    private final boolean m93005a(int i) {
        long j;
        String str;
        if (i != 4) {
            if (Binder.getCallingUid() != Process.myUid()) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    rfz.m33557a(getContext()).mo24605a(getCallingPackage());
                } catch (SecurityException e) {
                    Log.e("GmsSubscribedFeeds", "Signature check failed. The calling package is not google signed.", e);
                    return false;
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            if (Binder.getCallingUid() != Process.myUid()) {
                int i4 = i - 1;
                if (i4 == 0 || i4 == 1) {
                    j = cgvi.f187809a.mo6606a().mo84535b();
                } else {
                    j = cgvi.f187809a.mo6606a().mo84534a();
                }
                if (j > 0) {
                    try {
                        if (((long) getContext().getPackageManager().getApplicationInfo(getCallingPackage(), 0).targetSdkVersion) >= j) {
                            ashi ashi = this.f108307f;
                            if (ashi != null) {
                                if (i != 1) {
                                    str = i != 2 ? "DELETE" : "UPDATE";
                                } else {
                                    str = "INSERT";
                                }
                                ((beon) ashi.f88972c.mo6606a()).mo60861b(str);
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                }
            }
        }
        return true;
    }
}
