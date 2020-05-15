package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: fkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fkd implements Callable {

    /* renamed from: a */
    final /* synthetic */ fnl f16771a;

    /* renamed from: b */
    final /* synthetic */ fkh f16772b;

    public fkd(fkh fkh, fnl fnl) {
        this.f16772b = fkh;
        this.f16771a = fnl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0105, code lost:
        if (r8 != null) goto L_0x0117;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015f A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0167 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017f A[Catch:{ SQLiteException -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0189 A[Catch:{ SQLiteException -> 0x018f }] */
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        long insert;
        List list;
        Cursor cursor;
        flb flb = this.f16772b.f16778a;
        fnl fnl = this.f16771a;
        sdo.m34959a(fnl);
        fje.m11804a();
        flb.mo10954t();
        flb.mo10943h();
        flb.mo10929b("Storing hit", fnl);
        try {
            fkv fkv = flb.f16836b;
            sdo.m34959a(fnl);
            fje.m11804a();
            fkv.mo10954t();
            sdo.m34959a(fnl);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : fnl.f16956a.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2)) {
                    builder.appendQueryParameter(str2, (String) entry.getValue());
                }
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            if (encodedQuery.length() > 8192) {
                fkv.mo10941g().mo11027a(fnl, "Hit length exceeds the maximum allowed size");
            } else {
                fkv.mo10943h();
                int intValue = ((Integer) fni.f16927e.mo11021a()).intValue();
                long v = fkv.mo10985v();
                if (v > ((long) (intValue - 1))) {
                    long j = (v - ((long) intValue)) + 1;
                    fje.m11804a();
                    fkv.mo10954t();
                    if (j > 0) {
                        SQLiteDatabase w = fkv.mo10986w();
                        list = new ArrayList();
                        try {
                            cursor = w.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                            try {
                                if (cursor.moveToFirst()) {
                                    do {
                                        list.add(Long.valueOf(cursor.getLong(0)));
                                    } while (cursor.moveToNext());
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                try {
                                    fkv.mo10934d("Error selecting hit ids", e);
                                    if (cursor == null) {
                                        fkv.mo10934d("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                                        fkv.mo10980a(list);
                                        SQLiteDatabase w2 = fkv.mo10986w();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("hit_string", encodedQuery);
                                        contentValues.put("hit_time", Long.valueOf(fnl.f16959d));
                                        contentValues.put("hit_app_id", Integer.valueOf(fnl.f16960e));
                                        if (fnl.f16961f) {
                                        }
                                        contentValues.put("hit_url", str);
                                        insert = w2.insert("hits2", null, contentValues);
                                        if (insert == -1) {
                                        }
                                        flb.mo10994c();
                                        return null;
                                    }
                                    cursor.close();
                                    fkv.mo10934d("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                                    fkv.mo10980a(list);
                                    SQLiteDatabase w22 = fkv.mo10986w();
                                    ContentValues contentValues2 = new ContentValues();
                                    contentValues2.put("hit_string", encodedQuery);
                                    contentValues2.put("hit_time", Long.valueOf(fnl.f16959d));
                                    contentValues2.put("hit_app_id", Integer.valueOf(fnl.f16960e));
                                    if (fnl.f16961f) {
                                    }
                                    contentValues2.put("hit_url", str);
                                    insert = w22.insert("hits2", null, contentValues2);
                                    if (insert == -1) {
                                    }
                                    flb.mo10994c();
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursor = null;
                            fkv.mo10934d("Error selecting hit ids", e);
                            if (cursor == null) {
                            }
                            cursor.close();
                            fkv.mo10934d("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                            fkv.mo10980a(list);
                            SQLiteDatabase w222 = fkv.mo10986w();
                            ContentValues contentValues22 = new ContentValues();
                            contentValues22.put("hit_string", encodedQuery);
                            contentValues22.put("hit_time", Long.valueOf(fnl.f16959d));
                            contentValues22.put("hit_app_id", Integer.valueOf(fnl.f16960e));
                            if (fnl.f16961f) {
                            }
                            contentValues22.put("hit_url", str);
                            insert = w222.insert("hits2", null, contentValues22);
                            if (insert == -1) {
                            }
                            flb.mo10994c();
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } else {
                        list = Collections.emptyList();
                    }
                    fkv.mo10934d("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                    fkv.mo10980a(list);
                }
                SQLiteDatabase w2222 = fkv.mo10986w();
                ContentValues contentValues222 = new ContentValues();
                contentValues222.put("hit_string", encodedQuery);
                contentValues222.put("hit_time", Long.valueOf(fnl.f16959d));
                contentValues222.put("hit_app_id", Integer.valueOf(fnl.f16960e));
                if (fnl.f16961f) {
                    fkv.mo10943h();
                    str = flh.m11939i();
                } else {
                    fkv.mo10943h();
                    str = flh.m11937g();
                }
                contentValues222.put("hit_url", str);
                try {
                    insert = w2222.insert("hits2", null, contentValues222);
                    if (insert == -1) {
                        fkv.mo10930b("Hit saved to database. db-id, hit", Long.valueOf(insert), fnl);
                    } else {
                        fkv.mo10942g("Failed to insert a hit (got -1)");
                    }
                } catch (SQLiteException e3) {
                    fkv.mo10938e("Error storing a hit", e3);
                }
            }
            flb.mo10994c();
        } catch (SQLiteException e4) {
            flb.mo10938e("Storing hit failed to save hit to the database", e4);
            flb.mo10941g().mo11027a(fnl, "store: failed to insert in database");
        }
        return null;
    }
}
