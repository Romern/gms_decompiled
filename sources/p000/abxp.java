package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxp {

    /* renamed from: b */
    private static abxp f58690b;

    /* renamed from: a */
    public final abxo f58691a;

    /* renamed from: c */
    private rtj f58692c = null;

    /* renamed from: d */
    private final Context f58693d;

    public abxp(Context context) {
        this.f58691a = new abxo(context);
        this.f58693d = context;
    }

    /* renamed from: a */
    public static synchronized abxp m48475a(Context context) {
        abxp abxp;
        synchronized (abxp.class) {
            if (f58690b == null) {
                f58690b = new abxp(context);
            }
            abxp = f58690b;
        }
        return abxp;
    }

    /* renamed from: c */
    private final synchronized boolean m48478c() {
        rtj d = m48479d();
        if (d == null) {
            return false;
        }
        return d.getBoolean("LoggingEnabled", false);
    }

    /* renamed from: d */
    private final rtj m48479d() {
        if (this.f58692c == null) {
            try {
                this.f58692c = new rtj(this.f58693d, "3pErrorCachePreferences", true);
            } catch (Exception e) {
                absg.m48189a(e, "Something went wrong in the initialization of SharedPreferences");
            }
        }
        return this.f58692c;
    }

    /* renamed from: b */
    public final boolean mo32419b() {
        return ((Boolean) abzt.f58906au.mo58455c()).booleanValue() && m48478c();
    }

    /* renamed from: a */
    private final void m48476a(String str, String str2) {
        this.f58691a.getWritableDatabase().delete(str2, "[package]=?", new String[]{str});
    }

    /* renamed from: a */
    private final void m48477a(byte[] bArr, String str, String str2) {
        SQLiteDatabase writableDatabase = this.f58691a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("package", str);
            contentValues.put("data", bArr);
            writableDatabase.insertOrThrow(str2, null, contentValues);
            StringBuilder sb = new StringBuilder(str2.length() + 97);
            sb.append("[package]=? AND [id] NOT IN ( SELECT [id] FROM [");
            sb.append(str2);
            sb.append("] WHERE [");
            sb.append("package");
            sb.append("]=? ORDER BY [");
            sb.append("id");
            sb.append("] DESC LIMIT ");
            sb.append(100);
            sb.append(")");
            writableDatabase.delete(str2, sb.toString(), new String[]{str, str});
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public final List mo32412a(String str, String str2, Parcelable.Creator creator) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        StringBuilder sb = new StringBuilder(str2.length() + 58);
        sb.append("SELECT [data] FROM [");
        sb.append(str2);
        sb.append("] WHERE [package]=? ORDER BY [id] DESC");
        Cursor rawQuery = this.f58691a.getReadableDatabase().rawQuery(sb.toString(), new String[]{str});
        try {
            int columnIndex = rawQuery.getColumnIndex("data");
            while (rawQuery.moveToNext()) {
                byte[] blob = rawQuery.getBlob(columnIndex);
                i += blob.length;
                if (i > 524288) {
                    break;
                }
                try {
                    arrayList.add((AbstractSafeParcelable) sef.m35069a(blob, creator));
                } catch (Throwable th) {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo32413a(String str) {
        if (((Boolean) abzt.f58905at.mo58455c()).booleanValue()) {
            m48476a(str, "errors");
        }
        if (((Boolean) abzt.f58908aw.mo58455c()).booleanValue()) {
            m48476a(str, "user_actions");
        }
    }

    /* renamed from: a */
    public final void mo32414a(String str, int i) {
        SQLiteDatabase writableDatabase = this.f58691a.getWritableDatabase();
        StringBuilder sb = new StringBuilder(49);
        sb.append("[timestamp]<=(strftime('%s','now') - ");
        sb.append(i);
        sb.append(")");
        writableDatabase.delete(str, sb.toString(), null);
    }

    /* renamed from: a */
    public final void mo32415a(String str, bpzo bpzo, bpzq bpzq, String str2, Thing thing, ActionImpl actionImpl) {
        if (mo32418a()) {
            AppIndexingErrorInfo appIndexingErrorInfo = new AppIndexingErrorInfo();
            appIndexingErrorInfo.f107345a = str;
            appIndexingErrorInfo.f107346b = bpzo.mo3214a();
            appIndexingErrorInfo.f107347c = bpzq.mo3214a();
            appIndexingErrorInfo.f107348d = str2;
            appIndexingErrorInfo.f107349e = System.currentTimeMillis();
            appIndexingErrorInfo.f107350f = thing;
            appIndexingErrorInfo.f107351g = actionImpl;
            m48477a(sef.m35074a(appIndexingErrorInfo), str, "errors");
        }
    }

    /* renamed from: a */
    public final void mo32416a(String str, ActionImpl actionImpl) {
        if (mo32419b()) {
            AppIndexingUserActionInfo appIndexingUserActionInfo = new AppIndexingUserActionInfo();
            appIndexingUserActionInfo.f107352a = str;
            appIndexingUserActionInfo.f107353b = System.currentTimeMillis();
            appIndexingUserActionInfo.f107354c = actionImpl;
            m48477a(sef.m35074a(appIndexingUserActionInfo), str, "user_actions");
        }
    }

    /* renamed from: a */
    public final synchronized void mo32417a(boolean z) {
        rtj d;
        if (((Boolean) abzt.f58903ar.mo58455c()).booleanValue() && (d = m48479d()) != null) {
            SharedPreferences.Editor edit = d.edit();
            edit.putBoolean("LoggingEnabled", z);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo32418a() {
        return ((Boolean) abzt.f58903ar.mo58455c()).booleanValue() && m48478c();
    }
}
