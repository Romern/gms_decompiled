package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: abgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgc implements aatc {

    /* renamed from: a */
    static final String[] f57386a = {"_id", "suggest_intent_query"};

    /* renamed from: b */
    private final abgb f57387b;

    /* renamed from: c */
    private final String f57388c;

    public abgc(Context context, String str) {
        this.f57387b = new abgb(context);
        this.f57388c = str;
    }

    /* renamed from: d */
    private final SQLiteDatabase m47648d() {
        return this.f57387b.getReadableDatabase();
    }

    /* renamed from: a */
    public final synchronized Cursor mo31762a() {
        SQLiteDatabase d = m47648d();
        if (!d.isOpen()) {
            return new aarv();
        }
        String str = this.f57388c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("app_package_name=\"");
        sb.append(str);
        sb.append("\"");
        return d.query("suggestions", f57386a, sb.toString(), null, null, null, "date DESC", ceeg.m136408m());
    }

    /* renamed from: b */
    public final synchronized void mo31765b() {
        SQLiteDatabase c = mo32080c();
        if (c != null && c.isOpen() && !c.isReadOnly()) {
            String str = this.f57388c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
            sb.append("app_package_name=\"");
            sb.append(str);
            sb.append("\"");
            c.delete("suggestions", sb.toString(), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final SQLiteDatabase mo32080c() {
        try {
            return this.f57387b.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("gH_SearchQueryHDb", "Error opening Autocomplete database.", e);
            return null;
        }
    }

    public final synchronized void close() {
        aart.m46807a(this.f57387b);
    }

    /* renamed from: a */
    public final synchronized Cursor mo31763a(String str) {
        SQLiteDatabase d = m47648d();
        if (!d.isOpen()) {
            return new aarv();
        }
        String str2 = this.f57388c;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51);
        sb.append("app_package_name=\"");
        sb.append(str2);
        sb.append("\" AND suggest_intent_query LIKE ?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
        sb3.append("%");
        sb3.append(str);
        sb3.append("%");
        String sb4 = sb3.toString();
        return d.query("suggestions", f57386a, sb2, new String[]{sb4}, null, null, "date DESC", ceeg.m136408m());
    }

    /* renamed from: a */
    public final synchronized void mo31764a(abfo abfo, long j) {
        SQLiteDatabase c = mo32080c();
        if (c != null && c.isOpen() && !c.isReadOnly()) {
            String str = abfo.f57352c;
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_package_name", this.f57388c);
            contentValues.put("suggest_intent_query", str);
            contentValues.put("date", Long.valueOf(j));
            c.insert("suggestions", "suggest_intent_query", contentValues);
        }
    }
}
