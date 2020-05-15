package com.google.android.gms.appstate.provider;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppStateChimeraContentProvider extends sgo {

    /* renamed from: b */
    private static final UriMatcher f9806b = new UriMatcher(-1);

    /* renamed from: c */
    private static final String[] f9807c = {"_id"};

    /* renamed from: d */
    private static final bju f9808d;

    /* renamed from: e */
    private static final bju f9809e;

    /* renamed from: f */
    private static final String f9810f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    static {
        boolean z;
        gab[] values = gab.values();
        for (gab gab : values) {
            f9806b.addURI("com.google.android.gms.appstate", gab.f17782g, gab.ordinal());
        }
        boolean z2 = true;
        bjt a = bju.m3232a();
        a.mo3204a("_id", "client_contexts._id");
        a.mo3205a(gad.f17754a);
        f9808d = a.mo3203a();
        bjt a2 = bju.m3232a();
        a2.mo3204a("_id", "app_states._id");
        a2.mo3205a(gac.f17753a);
        a2.mo3205a(gad.f17754a);
        f9809e = a2.mo3203a();
        sgs sgs = new sgs();
        if (sgs.f44437a == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Cannot add multiple base tables!");
        sdo.m34959a((Object) "app_states");
        sgs.f44437a = "app_states";
        ArrayList arrayList = sgs.f44438b;
        StringBuilder sb = new StringBuilder(62);
        sb.append(" JOIN client_contexts ON client_context_id=client_contexts._id");
        arrayList.add(sb.toString());
        if (sgs.f44437a == null) {
            z2 = false;
        }
        sdo.m34970a(z2);
        StringBuilder sb2 = new StringBuilder(sgs.f44437a);
        ArrayList arrayList2 = sgs.f44438b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            sb2.append((String) arrayList2.get(i));
        }
        f9810f = sb2.toString();
    }

    /* renamed from: a */
    private static gab m6227a(Uri uri) {
        int match = f9806b.match(uri);
        sdo.m34972a(match >= 0, "Unrecognized URI: %s", uri);
        return ((gab[]) gab.class.getEnumConstants())[match];
    }

    /* renamed from: b */
    private static final long m6228b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() >= 2) {
            return (long) Integer.parseInt(pathSegments.get(1));
        }
        throw new IllegalArgumentException("Given URI is malformed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AssetFileDescriptor mo7300a(Uri uri, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7304b() {
        return "app_state.db";
    }

    public final String getType(Uri uri) {
        gab gab = gab.CLIENT_CONTEXTS;
        int ordinal = m6227a(uri).ordinal();
        if (ordinal == 0) {
            return "vnd.android.cursor.dir/vnd.google.android.appstate.client_contexts";
        }
        if (ordinal == 1) {
            return "vnd.android.cursor.item/vnd.google.android.appstate.client_context";
        }
        if (ordinal == 2) {
            return "vnd.android.cursor.dir/vnd.google.android.appstate.states";
        }
        if (ordinal == 3 || ordinal == 4) {
            return "vnd.android.cursor.item/vnd.google.android.appstate.state";
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Unknown URI: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7298a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues.size() == 0) {
            return 0;
        }
        gab gab = gab.CLIENT_CONTEXTS;
        int ordinal = m6227a(uri).ordinal();
        if (ordinal == 0) {
            sdo.m34959a(contentValues.get("package_name"));
            sdo.m34959a(contentValues.get("package_uid"));
            sdo.m34959a(contentValues.get("account_name"));
            return sQLiteDatabase.update("client_contexts", contentValues, str, strArr);
        } else if (ordinal == 1) {
            sdo.m34959a(contentValues.get("package_name"));
            sdo.m34959a(contentValues.get("package_uid"));
            sdo.m34959a(contentValues.get("account_name"));
            return sgo.m35213a(sQLiteDatabase, uri, "client_contexts", "_id", contentValues);
        } else if (ordinal == 2) {
            sdo.m34968a("app_id", contentValues);
            sdo.m34968a("key", contentValues);
            sgp sgp = new sgp(uri, str, strArr);
            sgp.mo25503a("client_context_id", m6228b(uri));
            return sQLiteDatabase.update("app_states", contentValues, sgp.mo25501a(), sgp.f44432a);
        } else if (ordinal == 3) {
            sdo.m34968a("app_id", contentValues);
            sdo.m34968a("key", contentValues);
            return sgo.m35213a(sQLiteDatabase, uri, "app_states", "_id", contentValues);
        } else if (ordinal == 4) {
            sdo.m34968a("app_id", contentValues);
            sdo.m34968a("key", contentValues);
            sgp sgp2 = new sgp(uri, str, strArr);
            sgp2.mo25505b("app_id");
            sgp2.mo25504a("state_key", "key");
            sgp2.mo25503a("client_context_id", m6228b(uri));
            return sQLiteDatabase.update("app_states", contentValues, sgp2.mo25501a(), sgp2.f44432a);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Invalid update URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ SQLiteOpenHelper mo7305c() {
        return gaf.m12845a(getContext());
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7299a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        String str2;
        gab gab = gab.CLIENT_CONTEXTS;
        int ordinal = m6227a(uri).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            Cursor query = query(uri, new String[]{"_id"}, str, strArr, null);
            int i = 0;
            while (query.moveToNext()) {
                try {
                    String[] strArr2 = {String.valueOf(query.getLong(0))};
                    sQLiteDatabase.delete("app_states", "client_context_id=?", strArr2);
                    i += sQLiteDatabase.delete("client_contexts", "_id=?", strArr2);
                } finally {
                    query.close();
                }
            }
            return i;
        } else if (ordinal == 2) {
            sgp sgp = new sgp(uri, str, strArr);
            sgp.mo25503a("client_context_id", m6228b(uri));
            return sQLiteDatabase.delete("app_states", sgp.mo25501a(), sgp.f44432a);
        } else if (ordinal == 3) {
            return sQLiteDatabase.delete("app_states", "_id=?", new String[]{String.valueOf(ContentUris.parseId(uri))});
        } else if (ordinal == 4) {
            sgp sgp2 = new sgp(uri, str, strArr);
            sgp2.mo25505b("app_id");
            sgp2.mo25504a("state_key", "key");
            sgp2.mo25503a("client_context_id", m6228b(uri));
            return sQLiteDatabase.delete("app_states", sgp2.mo25501a(), sgp2.f44432a);
        } else if (ordinal == 5) {
            String lastPathSegment = uri.getLastPathSegment();
            ArrayList arrayList = new ArrayList();
            Cursor query2 = query(gad.f17784b, f9807c, "account_name=?", new String[]{lastPathSegment}, null);
            while (query2.moveToNext()) {
                try {
                    arrayList.add(Long.valueOf(query2.getLong(0)));
                } catch (Throwable th) {
                    query2.close();
                    throw th;
                }
            }
            query2.close();
            Object[] array = arrayList.toArray();
            int length = array.length;
            sgr sgr = new sgr("client_context_id IN ", length);
            for (int i2 = 0; i2 < length; i2++) {
                StringBuilder sb = sgr.f44435a;
                if (i2 != 0) {
                    str2 = ",?";
                } else {
                    str2 = "?";
                }
                sb.append(str2);
                sgr.f44436b[i2] = String.valueOf(array[i2]);
            }
            return sQLiteDatabase.delete("app_states", String.valueOf(sgr.f44435a.toString()).concat(")"), sgr.f44436b);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb2.append("Invalid delete URI: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Cursor mo7301a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sgp sgp = new sgp(uri, str, strArr2);
        gab gab = gab.CLIENT_CONTEXTS;
        int ordinal = m6227a(uri).ordinal();
        if (ordinal == 0) {
            sQLiteQueryBuilder.setTables("client_contexts");
            sQLiteQueryBuilder.setProjectionMap(f9808d);
        } else if (ordinal == 1) {
            sgp.mo25502a("client_contexts._id");
            sQLiteQueryBuilder.setTables("client_contexts");
            sQLiteQueryBuilder.setProjectionMap(f9808d);
        } else if (ordinal == 2) {
            sgp.mo25503a("client_context_id", m6228b(uri));
            sQLiteQueryBuilder.setTables(f9810f);
            sQLiteQueryBuilder.setProjectionMap(f9809e);
        } else if (ordinal == 3) {
            sgp.mo25502a("app_states._id");
            sQLiteQueryBuilder.setTables(f9810f);
            sQLiteQueryBuilder.setProjectionMap(f9809e);
        } else if (ordinal == 4) {
            sgp.mo25503a("client_context_id", m6228b(uri));
            sgp.mo25505b("app_id");
            sgp.mo25504a("state_key", "key");
            sQLiteQueryBuilder.setTables(f9810f);
            sQLiteQueryBuilder.setProjectionMap(f9809e);
        } else if (ordinal == 5) {
            sgp.mo25505b("account_name");
            sQLiteQueryBuilder.setTables(f9810f);
            sQLiteQueryBuilder.setProjectionMap(f9809e);
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid query URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        Cursor query = sQLiteQueryBuilder.query(sQLiteDatabase, strArr, sgp.mo25501a(), sgp.f44432a, null, null, str2, null);
        if (query != null) {
            query.setNotificationUri(getContext().getContentResolver(), gae.f17785a);
        }
        return query;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo7302a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        boolean z;
        gab gab = gab.CLIENT_CONTEXTS;
        int ordinal = m6227a(uri).ordinal();
        if (ordinal == 0) {
            String asString = contentValues.getAsString("package_name");
            sdo.m34959a((Object) asString);
            int intValue = contentValues.getAsInteger("package_uid").intValue();
            if (intValue > 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            String asString2 = contentValues.getAsString("account_name");
            sdo.m34959a((Object) asString2);
            sgp sgp = new sgp(uri, null, null);
            sgp.mo25506b("package_name", asString);
            sgp.mo25503a("package_uid", (long) intValue);
            sgp.mo25506b("account_name", asString2);
            return mo25494a(sQLiteDatabase, uri, uri, "client_contexts", contentValues, sgp.mo25501a(), sgp.f44432a);
        } else if (ordinal == 2 || ordinal == 4) {
            String asString3 = contentValues.getAsString("app_id");
            sdo.m34959a((Object) asString3);
            sdo.m34970a(contentValues.containsKey("key"));
            String valueOf = String.valueOf(contentValues.getAsInteger("key"));
            long b = m6228b(uri);
            sgp sgp2 = new sgp(uri, null, null);
            sgp2.mo25506b("app_id", asString3);
            sgp2.mo25506b("key", valueOf);
            sgp2.mo25503a("client_context_id", b);
            return mo25494a(sQLiteDatabase, uri, uri, "app_states", contentValues, sgp2.mo25501a(), sgp2.f44432a);
        } else {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb.append("Invalid insert URI: ");
            sb.append(valueOf2);
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
        getContext().getContentResolver().notifyChange(gae.f17785a, (ContentObserver) null, false);
    }
}
