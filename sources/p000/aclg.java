package p000;

import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.Map;

/* renamed from: aclg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aclg extends ContentProvider {

    /* renamed from: a */
    private ftw f60084a;

    /* renamed from: b */
    private final UriMatcher f60085b = new UriMatcher(-1);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Cursor mo32837a(Uri uri, String[] strArr);

    /* renamed from: a */
    public abstract String mo32835a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ftv mo32836b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo32838c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract ftw mo32839d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo32840e();

    public final String getType(Uri uri) {
        if (this.f60085b.match(uri) == -1) {
            return mo32840e();
        }
        fqk.m12176a(getContext());
        return "vnd.android.cursor.dir/vnd.goodle.appdatasearch";
    }

    public final boolean onCreate() {
        boolean c = mo32838c();
        ftw d = mo32839d();
        this.f60084a = d;
        int length = d.f17229b.length;
        String[] strArr = new String[length];
        int i = 0;
        while (true) {
            ftz[] ftzArr = d.f17229b;
            if (i >= ftzArr.length) {
                break;
            }
            strArr[i] = ftzArr[i].f17242a;
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            this.f60085b.addURI(this.f60084a.f17228a, mo32835a(strArr[i2]), i2);
        }
        return c;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return query(uri, strArr, str, strArr2, str2, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        SQLiteDatabase sQLiteDatabase;
        Cursor query;
        Uri uri2 = uri;
        int match = this.f60085b.match(uri2);
        if (match == -1) {
            return mo32837a(uri2, strArr2);
        }
        fqk.m12176a(getContext());
        fsz a = fsz.m12266a(strArr2);
        ftz ftz = this.f60084a.f17229b[match];
        ftv b = mo32836b();
        if (b == null) {
            b = null;
        } else if (!this.f60084a.equals(b.f17227c)) {
            throw new IllegalStateException("Content provider spec in db does not match content provider's");
        }
        if (b == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Could not get appdatasearch database for uri ");
            sb.append(valueOf);
            Log.e(".AppDataSearchProvider", sb.toString());
            return null;
        }
        if (a.mo11276c()) {
            SQLiteDatabase b2 = b.mo11318b();
            if (b2 == null) {
                return null;
            }
            b2.beginTransaction();
            try {
                SQLiteDatabase sQLiteDatabase2 = b2;
                try {
                    query = b2.query("incarnation_appdatasearch", new String[]{"seqno_table_complete"}, "corpus_name = ?", new String[]{ftz.f17242a}, null, null, null);
                    if (query != null) {
                        if (query.moveToNext()) {
                            int i = query.getInt(query.getColumnIndex("seqno_table_complete"));
                            query.close();
                            if (i == 1) {
                                sQLiteDatabase2.endTransaction();
                            }
                        } else {
                            query.close();
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    try {
                        ftv.m12379a(sQLiteDatabase, ftz);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabase2;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = b2;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        if (a.mo11274a()) {
            ftv ftv = b;
            long j = a.f17206a;
            long j2 = a.f17207b;
            String str3 = ftz.f17245d;
            String a2 = ftu.m12368a(ftz);
            long j3 = j2;
            String a3 = ftv.m12378a(str3, ftz.f17247f);
            String str4 = " LIMIT ";
            StringBuilder sb2 = new StringBuilder(1024);
            sb2.append("SELECT ");
            sb2.append(ftv.m12378a(a2, "seqno"));
            sb2.append(" AS seqno, CASE WHEN ");
            sb2.append(ftv.m12378a(a2, "action_type"));
            sb2.append(" = '0' AND ");
            sb2.append(a3);
            sb2.append(" IS NOT NULL THEN 'add' ELSE 'del' END AS action,");
            sb2.append(ftv.m12378a(a2, "uri"));
            sb2.append(" AS uri,");
            sb2.append(ftz.f17249h);
            sb2.append(" AS doc_score,");
            sb2.append(ftz.f17250i);
            sb2.append(" AS created_timestamp");
            for (Map.Entry entry : ftz.f17251j.entrySet()) {
                String a4 = fsy.m12264a((String) entry.getKey());
                sb2.append(",");
                sb2.append(ftv.m12378a(str3, (String) entry.getValue()));
                sb2.append(" AS ");
                sb2.append(a4);
            }
            sb2.append(" FROM (SELECT * FROM [");
            sb2.append(a2);
            sb2.append("] WHERE ");
            sb2.append(ftv.m12378a(a2, "tag"));
            sb2.append(" IS NULL) AS ");
            sb2.append(a2);
            sb2.append(" LEFT OUTER JOIN [");
            sb2.append(str3);
            sb2.append("] ON ");
            sb2.append(ftv.m12378a(a2, "uri"));
            sb2.append(" = ");
            sb2.append(a3);
            sb2.append(" WHERE ");
            sb2.append(ftv.m12378a(a2, "seqno"));
            sb2.append(" > ");
            sb2.append(j);
            if (!ftz.f17252k) {
                sb2.append(" GROUP BY ");
                sb2.append(ftv.m12378a(a2, "seqno"));
            }
            sb2.append(" ORDER BY ");
            sb2.append(ftv.m12378a(a2, "seqno"));
            sb2.append(str4);
            sb2.append(j3);
            SQLiteDatabase c = ftv.mo11320c();
            if (c != null) {
                return ftv.m12377a(c.rawQuery(sb2.toString(), null), ftz, c);
            }
            return null;
        } else if (!a.mo11275b()) {
            return null;
        } else {
            long j4 = a.f17206a;
            long j5 = a.f17207b;
            if (ftz.f17246e == null) {
                return ftv.m12377a(new MatrixCursor((String[]) fsy.f17203a.toArray(new String[fsy.f17203a.size()])), ftz, b.mo11320c());
            }
            String a5 = ftu.m12368a(ftz);
            ftz ftz2 = ftz;
            becj a6 = becj.m91776a();
            a6.mo58556a("SELECT ");
            a6.mo58556a(ftv.m12378a(a5, "seqno"));
            a6.mo58556a(" AS ");
            a6.mo58556a("seqno");
            a6.mo58556a(", CASE WHEN ");
            a6.mo58556a(ftv.m12378a(a5, "action_type"));
            a6.mo58556a(" = '");
            bmxy.m108591a(true, "value must be non-negative: %s", 0);
            a6.mo58556a("0");
            a6.mo58556a("' THEN '");
            a6.mo58556a("add");
            a6.mo58556a("' ELSE '");
            a6.mo58556a("del");
            a6.mo58556a("' END AS ");
            a6.mo58556a("action");
            a6.mo58556a(",");
            a6.mo58556a(ftv.m12378a(a5, "uri"));
            a6.mo58556a(" AS ");
            a6.mo58556a("uri");
            a6.mo58556a(",");
            a6.mo58556a(ftv.m12378a(a5, "tag"));
            a6.mo58556a(" AS ");
            a6.mo58556a("tag");
            a6.mo58556a(" FROM [");
            a6.mo58556a(a5);
            a6.mo58556a("] WHERE (");
            a6.mo58556a(ftv.m12378a(a5, "tag"));
            a6.mo58556a(" IS NOT NULL ");
            a6.mo58556a(" AND ");
            a6.mo58556a(ftv.m12378a(a5, "seqno"));
            a6.mo58556a(" > ");
            a6.mo58556a(beck.m91779a(j4));
            a6.mo58556a(") ORDER BY ");
            a6.mo58556a(ftv.m12378a(a5, "seqno"));
            a6.mo58556a(" LIMIT ");
            a6.mo58556a(beck.m91779a(j5));
            beci b3 = a6.mo58557b();
            SQLiteDatabase c2 = b.mo11320c();
            if (c2 == null) {
                return null;
            }
            return ftv.m12377a(c2.rawQuery(((bech) b3).f106902a, null), ftz2, c2);
        }
    }
}
