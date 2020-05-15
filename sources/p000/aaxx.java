package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: aaxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxx implements Closeable {

    /* renamed from: a */
    private static final String[] f56802a = {"child_ids", "is_feeling_lucky"};

    /* renamed from: b */
    private static final String[] f56803b = {"id", "prediction_id", "reporting_id", "type", "title", "snippet", "url", "api_url", "intent_url", "setting_action_definition", "navigation_action_url", "etag", "visited_time"};

    /* renamed from: c */
    private static final String[] f56804c = {"id", "type", "title", "snippet", "url", "api_url", "intent_url", "setting_action_definition", "navigation_action_url", "etag", "visited_time"};

    /* renamed from: d */
    private static final String[] f56805d = {"id", "snippet", "title", "url", "type", "etag", "is_in_dark_mode"};
    @Deprecated

    /* renamed from: e */
    private final aaxw f56806e;

    /* renamed from: f */
    private Context f56807f;

    public aaxx(Context context) {
        this.f56806e = new aaxw(context);
        if (aaya.m47229b(ceiw.m136958b())) {
            this.f56807f = context;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af A[Catch:{ all -> 0x00a8 }] */
    /* renamed from: a */
    private final synchronized aasm m47204a(String str, String[] strArr) {
        Throwable th;
        aasm a;
        SQLiteDatabase a2 = mo31882a();
        Cursor cursor = null;
        if (a2.isOpen()) {
            try {
                Cursor query = a2.query("help_responses", f56805d, str, strArr, null, null, null);
                try {
                    if (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndex("snippet"));
                        if (!TextUtils.isEmpty(string)) {
                            int columnIndex = query.getColumnIndex("title");
                            int columnIndex2 = query.getColumnIndex("url");
                            int columnIndex3 = query.getColumnIndex("type");
                            int columnIndex4 = query.getColumnIndex("etag");
                            String string2 = query.getString(query.getColumnIndex("id"));
                            int i = query.getInt(columnIndex3);
                            if (i == 2) {
                                a = aasm.m46889a(string2, query.getString(columnIndex), query.getString(columnIndex2), string, query.getString(columnIndex4), true);
                                if (query != null) {
                                    query.close();
                                }
                            } else if (i != 14) {
                                Log.e("gH_HelpResponseDatabase", "Found leaf content with not supported type.");
                                if (query != null) {
                                    query.close();
                                }
                            } else {
                                a = aasm.m46886a(string2, query.getString(columnIndex), query.getString(columnIndex2), string, query.getString(columnIndex4));
                                if (query != null) {
                                    query.close();
                                }
                            }
                        } else if (query != null) {
                            query.close();
                        }
                    } else if (query != null) {
                        query.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static final ContentValues m47205c(aasm aasm, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", aasm.f56492b);
        if (m47206e()) {
            contentValues.put("prediction_id", aasm.f56493c);
            contentValues.put("reporting_id", aasm.f56494d);
        }
        contentValues.put("app_package_name", str);
        contentValues.put("type", Integer.valueOf(aasm.f56495e));
        contentValues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
        int i = aasm.f56495e;
        if (i != 0) {
            if (i != 1) {
                if (!(i == 2 || i == 7)) {
                    if (i == 8) {
                        contentValues.put("title", aasm.f56496f);
                        contentValues.put("snippet", aasm.mo31735r());
                        contentValues.put("url", aasm.f56497g);
                        contentValues.put("intent_url", aasm.f56499i);
                    } else if (i != 9) {
                        if (i != 11) {
                            if (i == 12) {
                                contentValues.put("title", aasm.f56496f);
                                contentValues.put("snippet", aasm.mo31735r());
                                contentValues.put("url", aasm.f56497g);
                                contentValues.put("setting_action_definition", aasm.mo31740v().mo73642k());
                            } else if (i != 22) {
                                switch (i) {
                                    case 14:
                                        break;
                                    case 15:
                                    case 16:
                                        break;
                                    default:
                                        String valueOf = String.valueOf(aasm);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                                        sb.append("The type of HelpResponse is not supported: ");
                                        sb.append(valueOf);
                                        throw new IllegalStateException(sb.toString());
                                }
                            } else {
                                contentValues.put("title", aasm.f56496f);
                                contentValues.put("snippet", aasm.mo31735r());
                                contentValues.put("url", aasm.f56497g);
                                contentValues.put("navigation_action_url", aasm.f56501k);
                            }
                        }
                    }
                }
                contentValues.put("title", aasm.f56496f);
                contentValues.put("snippet", aasm.mo31735r());
                contentValues.put("url", aasm.f56497g);
                contentValues.put("etag", aasm.f56504n);
                contentValues.put("is_in_dark_mode", Boolean.valueOf(aasm.f56503m));
            }
            contentValues.put("title", aasm.f56496f);
            contentValues.put("snippet", aasm.mo31735r());
            contentValues.put("url", aasm.f56497g);
            contentValues.put("api_url", aasm.f56498h);
            contentValues.put("etag", aasm.f56504n);
            contentValues.put("visited_time", Long.valueOf(aasm.f56505o));
        } else {
            contentValues.put("child_ids", TextUtils.join(",", aasm.f56511u));
            contentValues.put("is_feeling_lucky", Boolean.valueOf(aasm.f56502l));
        }
        return contentValues;
    }

    /* renamed from: e */
    public static boolean m47206e() {
        return aaya.m47228a(cefh.f182598a.mo6606a().mo79075a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SQLiteDatabase mo31890b() {
        try {
            return mo31894c().getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("gH_HelpResponseDatabase", "Error opening Help Response database.", e);
            return null;
        }
    }

    public final synchronized void close() {
        aart.m46807a(mo31894c());
    }

    /* renamed from: d */
    public final synchronized boolean mo31896d() {
        boolean z;
        SQLiteDatabase a = mo31882a();
        if (a.isOpen()) {
            Cursor rawQuery = a.rawQuery("SELECT * FROM help_responses", null);
            boolean moveToFirst = rawQuery.moveToFirst();
            rawQuery.close();
            z = !moveToFirst;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized void mo31891b(aasm aasm, String str) {
        SQLiteDatabase b;
        if (aasm.f56512v && (b = mo31890b()) != null && b.isOpen() && !b.isReadOnly()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("etag", aasm.f56504n);
            b.update("help_responses", contentValues, "id=? AND app_package_name=?", new String[]{aasm.f56492b, str});
        }
    }

    /* renamed from: b */
    public final synchronized void mo31892b(String str) {
        SQLiteDatabase b = mo31890b();
        if (b != null && b.isOpen() && !b.isReadOnly()) {
            b.delete("help_responses", "app_package_name=?", new String[]{str});
        }
    }

    /* renamed from: b */
    public final synchronized void mo31893b(String str, String str2) {
        SQLiteDatabase b = mo31890b();
        if (b != null && b.isOpen() && !b.isReadOnly()) {
            b.delete("help_responses", "id=? AND app_package_name=?", new String[]{str, str2});
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final aaxw mo31894c() {
        return aaya.m47229b(ceiw.m136958b()) ? aaxw.m47201a(this.f56807f) : this.f56806e;
    }

    /* renamed from: a */
    public final synchronized aasm mo31879a(String str, String str2, boolean z) {
        String[] strArr;
        strArr = new String[3];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = !z ? "0" : "1";
        return m47204a("id=? AND app_package_name=? AND is_in_dark_mode=?", strArr);
    }

    /* renamed from: a */
    public final synchronized aasm mo31880a(String str, boolean z) {
        String[] strArr;
        strArr = new String[3];
        strArr[0] = str;
        strArr[1] = Integer.toString(2);
        strArr[2] = !z ? "0" : "1";
        return m47204a("url=? AND type=? AND is_in_dark_mode=?", strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8 A[Catch:{ all -> 0x00a2 }] */
    /* renamed from: a */
    public final synchronized abey mo31881a(Context context, String str, int i, String str2) {
        Cursor cursor;
        abey c;
        boolean z;
        SQLiteDatabase a = mo31882a();
        if (a.isOpen()) {
            try {
                cursor = a.query("help_responses", f56802a, "id=? AND app_package_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndex("child_ids"));
                        if (!TextUtils.isEmpty(string)) {
                            if (cursor.getInt(cursor.getColumnIndex("is_feeling_lucky")) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C1223np npVar = new C1223np();
                            aasm a2 = aasm.m46890a(str, z);
                            npVar.put(str, a2);
                            String[] split = string.split(",");
                            Map a3 = mo31885a(split, str2);
                            for (String str3 : split) {
                                aasm aasm = (aasm) a3.get(str3);
                                if (aasm != null) {
                                    a2.mo31716a(aasm);
                                    npVar.put(aasm.f56492b, aasm);
                                }
                            }
                            if (npVar.f26809h > 1) {
                                c = new abey(str, npVar, i);
                                if (cursor != null) {
                                    cursor.close();
                                }
                            } else {
                                c = abey.m47592c(i, context);
                                if (cursor != null) {
                                    cursor.close();
                                }
                            }
                        } else {
                            c = abey.m47592c(i, context);
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    } else {
                        c = abey.m47592c(i, context);
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            return abey.m47592c(i, context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteDatabase mo31882a() {
        return mo31894c().getReadableDatabase();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: a */
    public final String mo31883a(String str) {
        Throwable th;
        SQLiteDatabase a = mo31882a();
        Cursor cursor = null;
        if (!a.isOpen()) {
            return null;
        }
        try {
            String[] strArr = {str};
            Cursor query = a.query("help_responses", new String[]{"etag"}, "url=? AND etag IS NOT NULL", strArr, null, null, null);
            try {
                int columnIndex = query.getColumnIndex("etag");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    if (!TextUtils.isEmpty(string)) {
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized Map mo31884a(List list, String str) {
        return mo31885a((String[]) list.toArray(new String[list.size()]), str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02f8, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ff A[SYNTHETIC, Splitter:B:122:0x02ff] */
    /* renamed from: a */
    public final synchronized Map mo31885a(String[] strArr, String str) {
        Cursor cursor;
        int columnIndex;
        int i;
        int columnIndex2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        SQLiteDatabase a = mo31882a();
        if (a.isOpen()) {
            try {
                String join = TextUtils.join("\",\"", strArr);
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 33);
                sb.append("app_package_name=? AND id IN (\"");
                sb.append(join);
                sb.append("\")");
                cursor = a.query("help_responses", !m47206e() ? f56804c : f56803b, sb.toString(), new String[]{str}, null, null, null);
                try {
                    columnIndex = cursor.getColumnIndex("id");
                    int i7 = -1;
                    int columnIndex3 = m47206e() ? cursor.getColumnIndex("prediction_id") : -1;
                    if (m47206e()) {
                        i7 = cursor.getColumnIndex("reporting_id");
                    }
                    columnIndex2 = cursor.getColumnIndex("type");
                    int columnIndex4 = cursor.getColumnIndex("title");
                    int columnIndex5 = cursor.getColumnIndex("snippet");
                    int columnIndex6 = cursor.getColumnIndex("url");
                    int columnIndex7 = cursor.getColumnIndex("api_url");
                    int columnIndex8 = cursor.getColumnIndex("etag");
                    int columnIndex9 = cursor.getColumnIndex("visited_time");
                    C1223np npVar = new C1223np();
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(columnIndex);
                        String string2 = !m47206e() ? "" : cursor.getString(columnIndex3);
                        String string3 = !m47206e() ? "" : cursor.getString(i);
                        int i8 = cursor.getInt(columnIndex2);
                        i2 = columnIndex;
                        String string4 = cursor.getString(columnIndex4);
                        i3 = i;
                        String string5 = cursor.getString(columnIndex5);
                        i4 = columnIndex3;
                        String string6 = cursor.getString(columnIndex6);
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(string6)) {
                            columnIndex = i2;
                            i = i3;
                            i5 = i4;
                        } else {
                            i6 = columnIndex2;
                            if (i8 == 1) {
                                String str2 = string3;
                                String string7 = cursor.getString(columnIndex7);
                                if (!TextUtils.isEmpty(string7)) {
                                    aasm a2 = aasm.m46888a(string, string4, string5, string6, string7, cursor.getString(columnIndex8), cursor.getLong(columnIndex9));
                                    if (m47206e()) {
                                        a2.f56493c = string2;
                                        a2.f56494d = str2;
                                    }
                                    npVar.put(a2.f56492b, a2);
                                    columnIndex = i2;
                                    i = i3;
                                    i5 = i4;
                                    columnIndex2 = i6;
                                } else {
                                    columnIndex = i2;
                                    i = i3;
                                    i5 = i4;
                                    columnIndex2 = i6;
                                }
                            } else if (i8 == 22) {
                                String str3 = string3;
                                aasm b = aasm.m46899b(string4, string5, cursor.getString(cursor.getColumnIndex("navigation_action_url")), string6);
                                if (m47206e()) {
                                    b.f56493c = string2;
                                    b.f56494d = str3;
                                }
                                npVar.put(b.f56492b, b);
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else if (i8 == 7) {
                                String str4 = string3;
                                aasm a3 = aasm.m46884a(string4, string5, string6);
                                if (m47206e()) {
                                    a3.f56493c = string2;
                                    a3.f56494d = str4;
                                }
                                npVar.put(a3.f56492b, a3);
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else if (i8 == 8) {
                                String str5 = string3;
                                String string8 = cursor.getString(cursor.getColumnIndex("intent_url"));
                                String string9 = cursor.getString(columnIndex7);
                                if (!TextUtils.isEmpty(string9)) {
                                    string6 = string9;
                                }
                                aasm a4 = aasm.m46885a(string4, string5, string8, string6);
                                if (m47206e()) {
                                    a4.f56493c = string2;
                                    a4.f56494d = str5;
                                }
                                npVar.put(a4.f56492b, a4);
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else if (i8 == 9) {
                                String str6 = string3;
                                aasm b2 = aasm.m46898b(string4, string5, string6);
                                if (m47206e()) {
                                    b2.f56493c = string2;
                                    b2.f56494d = str6;
                                }
                                npVar.put(b2.f56492b, b2);
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else if (i8 == 11) {
                                String str7 = string3;
                                String string10 = cursor.getString(columnIndex7);
                                if (!TextUtils.isEmpty(string10)) {
                                    aasm b3 = aasm.m46901b(string, string4, string5, string6, string10, cursor.getString(columnIndex8), cursor.getLong(columnIndex9));
                                    if (m47206e()) {
                                        b3.f56493c = string2;
                                        b3.f56494d = str7;
                                    }
                                    npVar.put(b3.f56492b, b3);
                                    columnIndex = i2;
                                    i = i3;
                                    i5 = i4;
                                    columnIndex2 = i6;
                                } else {
                                    columnIndex = i2;
                                    i = i3;
                                    i5 = i4;
                                    columnIndex2 = i6;
                                }
                            } else if (i8 == 12) {
                                String str8 = string3;
                                aasm a5 = aasm.m46881a(string4, string5, (bzpb) bxvk.m124016a(bzpb.f170891d, cursor.getBlob(cursor.getColumnIndex("setting_action_definition")), bxus.m123744c()), string6);
                                if (m47206e()) {
                                    a5.f56493c = string2;
                                    a5.f56494d = str8;
                                }
                                npVar.put(a5.f56492b, a5);
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else if (i8 == 15) {
                                String str9 = string3;
                                aasm b4 = aasm.m46900b(string, string4, string6, string5, cursor.getString(columnIndex8));
                                if (m47206e()) {
                                    b4.f56493c = string2;
                                    b4.f56494d = str9;
                                }
                                npVar.put(b4.f56492b, b4);
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else if (i8 != 16) {
                                columnIndex = i2;
                                i = i3;
                                i5 = i4;
                                columnIndex2 = i6;
                            } else {
                                String string11 = cursor.getString(columnIndex7);
                                if (!TextUtils.isEmpty(string11)) {
                                    String str10 = string3;
                                    aasm c = aasm.m46902c(string, string4, string5, string6, string11, cursor.getString(columnIndex8), cursor.getLong(columnIndex9));
                                    if (m47206e()) {
                                        c.f56493c = string2;
                                        c.f56494d = str10;
                                    }
                                    npVar.put(c.f56492b, c);
                                    columnIndex = i2;
                                    i = i3;
                                    i5 = i4;
                                    columnIndex2 = i6;
                                } else {
                                    columnIndex = i2;
                                    i = i3;
                                    i5 = i4;
                                    columnIndex2 = i6;
                                }
                            }
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (bxwf e) {
                    Log.e("gH_HelpResponseDatabase", "Failed to parse AndroidSettingDefinition proto", e);
                    columnIndex = i2;
                    i = i3;
                    i5 = i4;
                    columnIndex2 = i6;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } else {
            return Collections.emptyMap();
        }
    }

    /* renamed from: a */
    public final synchronized void mo31886a(long j) {
        SQLiteDatabase b = mo31890b();
        if (b != null && b.isOpen() && !b.isReadOnly()) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(38);
            sb.append("saved_timestamp < ");
            sb.append(currentTimeMillis - j);
            b.delete("help_responses", sb.toString(), null);
        }
    }

    /* renamed from: a */
    public final synchronized void mo31887a(aasm aasm, String str) {
        SQLiteDatabase b;
        if (aasm.f56512v && (b = mo31890b()) != null && b.isOpen() && !b.isReadOnly()) {
            b.replace("help_responses", null, m47205c(aasm, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo31888a(abey abey, String str) {
        SQLiteDatabase b = mo31890b();
        if (b != null && b.isOpen() && !b.isReadOnly()) {
            b.beginTransaction();
            try {
                for (Map.Entry entry : abey.f57323b.entrySet()) {
                    aasm aasm = (aasm) entry.getValue();
                    if (!aasm.f56510t) {
                        b.replace("help_responses", null, m47205c(aasm, str));
                    }
                }
                b.setTransactionSuccessful();
            } finally {
                b.endTransaction();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[SYNTHETIC, Splitter:B:32:0x0066] */
    /* renamed from: a */
    public final synchronized void mo31889a(String str, String str2) {
        Cursor cursor;
        String[] split;
        SQLiteDatabase b = mo31890b();
        if (b != null && b.isOpen() && !b.isReadOnly()) {
            try {
                cursor = b.query("help_responses", f56802a, "id=? AND app_package_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndex("child_ids"));
                        if (!TextUtils.isEmpty(string)) {
                            mo31893b(str, str2);
                            for (String str3 : string.split(",")) {
                                mo31893b(str3, str2);
                            }
                        }
                    }
                    cursor.close();
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        }
    }
}
