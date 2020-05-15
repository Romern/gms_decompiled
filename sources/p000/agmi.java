package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* renamed from: agmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agmi implements agif {

    /* renamed from: a */
    final /* synthetic */ agmn f65934a;

    public agmi(agmn agmn) {
        this.f65934a = agmn;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0140, code lost:
        if (r10 == 429) goto L_0x0142;
     */
    /* renamed from: a */
    public final void mo35445a(String str, int i, Throwable th, byte[] bArr, Map map) {
        agdl h;
        agdl h2;
        agmn agmn = this.f65934a;
        agmn.mo35694r();
        agmn.mo35695s();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (SQLiteException e) {
                h.mo35497E().f65564c.mo35436a("Error incrementing retry count. error", e);
            } catch (Throwable th2) {
                agmn.f65959m = false;
                agmn.mo35700x();
                throw th2;
            }
        }
        List<Long> list = agmn.f65960n;
        agmn.f65960n = null;
        if ((i == 200 || i == 204) && th == null) {
            try {
                agmn.mo35681e().f65619d.mo35459a(agmn.mo35691o().mo20505a());
                agmn.mo35681e().f65620e.mo35459a(0);
                agmn.mo35699w();
                agmn.mo35497E().f65572k.mo35437a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                agmn.mo35684h().mo35352b();
                try {
                    for (Long l : list) {
                        try {
                            h2 = agmn.mo35684h();
                            long longValue = l.longValue();
                            h2.mo35241h();
                            h2.mo35659q();
                            if (h2.mo35360e().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            h2.mo35497E().f65564c.mo35436a("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            List list2 = agmn.f65961o;
                            if (list2 == null || !list2.contains(l)) {
                                throw e3;
                            }
                        }
                    }
                    agmn.mo35684h().mo35355c();
                    agmn.mo35684h().mo35358d();
                    agmn.f65961o = null;
                    if (agmn.mo35683g().mo35448c() && agmn.mo35698v()) {
                        agmn.mo35697u();
                    } else {
                        agmn.f65962p = -1;
                        agmn.mo35699w();
                    }
                    agmn.f65955i = 0;
                } catch (Throwable th3) {
                    agmn.mo35684h().mo35358d();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                agmn.mo35497E().f65564c.mo35436a("Database error while trying to delete uploaded bundles", e4);
                agmn.f65955i = agmn.mo35691o().mo20506b();
                agmn.mo35497E().f65572k.mo35436a("Disable upload, time", Long.valueOf(agmn.f65955i));
            }
        } else {
            agmn.mo35497E().f65572k.mo35437a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            agmn.mo35681e().f65620e.mo35459a(agmn.mo35691o().mo20505a());
            if (i == 503) {
            }
            agmn.mo35681e().f65621f.mo35459a(agmn.mo35691o().mo20505a());
            h = agmn.mo35684h();
            h.mo35241h();
            h.mo35659q();
            sdo.m34959a(list);
            sdo.m34961a(list.size());
            if (h.mo35365l()) {
                String join = TextUtils.join(",", list);
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                sb.append("(");
                sb.append(join);
                sb.append(")");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
                sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
                sb3.append(sb2);
                sb3.append(" AND retry_count =  2147483647 LIMIT 1");
                if (h.mo35334a(sb3.toString(), (String[]) null) > 0) {
                    h.mo35497E().f65567f.mo35435a("The number of upload retries exceeds the limit. Will remain unchanged.");
                }
                SQLiteDatabase e5 = h.mo35360e();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < ");
                sb4.append(Integer.MAX_VALUE);
                sb4.append(")");
                e5.execSQL(sb4.toString());
            }
            agmn.mo35699w();
        }
        agmn.f65959m = false;
        agmn.mo35700x();
    }
}
