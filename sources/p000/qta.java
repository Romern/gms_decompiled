package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qta {

    /* renamed from: a */
    public static final qty f42076a = new quc((bxxk) quk.f42153e.mo74142c(7), "encryption_key");

    /* renamed from: b */
    public static final qty f42077b = new quc((bxxk) bstx.f147072d.mo74142c(7), "metadata");

    /* renamed from: c */
    public static final qty f42078c = new qtz("is_metadata_stale", true);

    /* renamed from: d */
    public static final qty f42079d = new qua("affiliation_expiration_timestamp_millis", 0L);

    /* renamed from: e */
    public static final qty f42080e = new qua("affiliation_version", 0L);

    /* renamed from: f */
    public static final qty f42081f = new qua("earliest_sync_time_millis", 0L);

    /* renamed from: g */
    public static final qty f42082g = new qua("sync_delay_on_server_error_millis", -1L);

    /* renamed from: h */
    public static final qty f42083h = new qub("last_synced_times_millis");

    /* renamed from: i */
    public static final imn f42084i = new qsy();

    /* renamed from: n */
    private static final String f42085n = ("SELECT value FROM account_data WHERE account=? AND key=?");

    /* renamed from: j */
    public final acyn f42086j;

    /* renamed from: k */
    public final qth f42087k;

    /* renamed from: l */
    public final Object f42088l = new Object();

    /* renamed from: m */
    public final Map f42089m = new HashMap();

    public qta(Context context) {
        this.f42086j = new acyn(context);
        this.f42087k = qth.m32851a(context);
    }

    /* renamed from: a */
    private final Map m32824a(acyr acyr) {
        synchronized (this.f42088l) {
            Map map = (Map) this.f42089m.get(acyr.f61090d);
            if (map != null) {
                return map;
            }
            qsz qsz = new qsz();
            this.f42089m.put(acyr.f61090d, qsz);
            return qsz;
        }
    }

    /* renamed from: b */
    public static qty m32827b(int i) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("is_sync_data_stale.");
        sb.append(i);
        return new qtz(sb.toString(), true);
    }

    /* renamed from: c */
    public static qty m32828c(int i) {
        StringBuilder sb = new StringBuilder(25);
        sb.append("index_version.");
        sb.append(i);
        return new qua(sb.toString(), -1L);
    }

    /* renamed from: d */
    public static qty m32829d(int i) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("subscribers.");
        sb.append(i);
        return new que(sb.toString());
    }

    /* renamed from: a */
    public static qty m32825a(int i) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("is_sync_data_initialized.");
        sb.append(i);
        return new qtz(sb.toString(), false);
    }

    /* renamed from: a */
    public static qty m32826a(String str) {
        String valueOf = String.valueOf(str);
        return new qud(valueOf.length() == 0 ? new String("private_topic_name.") : "private_topic_name.".concat(valueOf), "");
    }

    /* renamed from: a */
    public final Object mo24253a(acyr acyr, qty qty) {
        Object obj;
        SQLiteDatabase a = this.f42087k.mo24263a();
        synchronized (this.f42088l) {
            Map a2 = m32824a(acyr);
            Object obj2 = a2.get(qty.f42132a);
            if (obj2 != null) {
                return obj2;
            }
            Cursor rawQuery = a.rawQuery(f42085n, new String[]{acyr.f61090d, qty.f42132a});
            try {
                rawQuery.moveToFirst();
                byte[] bArr = null;
                while (!rawQuery.isAfterLast()) {
                    bArr = qto.m32873a(rawQuery, "value");
                    rawQuery.moveToNext();
                }
                bmxv c = bmxv.m108567c(bArr);
                if (c.mo66813a()) {
                    obj = qty.mo24279a((byte[]) c.mo66814b());
                } else {
                    obj = qty.f42133b;
                }
                a2.put(qty.f42132a, obj);
                return obj;
            } finally {
                rawQuery.close();
            }
        }
    }

    /* renamed from: a */
    public final void mo24254a(acyr acyr, qty qty, Object obj) {
        bmxv a = qty.mo24278a(obj);
        SQLiteDatabase a2 = this.f42087k.mo24263a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", acyr.f61090d);
        contentValues.put("key", qty.f42132a);
        contentValues.put("value", (byte[]) a.mo66815c());
        synchronized (this.f42088l) {
            qto.m32871a(a2, "account_data", contentValues);
            m32824a(acyr).put(qty.f42132a, obj);
        }
    }

    /* renamed from: a */
    public final void mo24255a(acyr acyr, qty... qtyArr) {
        SQLiteDatabase a = this.f42087k.mo24263a();
        ArrayList arrayList = new ArrayList();
        for (qty qty : qtyArr) {
            arrayList.add(qty.f42132a);
        }
        synchronized (this.f42088l) {
            String a2 = bmxr.m108543a(',').mo66874a((Iterable) Collections.nCopies(arrayList.size(), "?"));
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 23);
            sb.append("account=? AND key IN (");
            sb.append(a2);
            sb.append(")");
            a.delete("account_data", sb.toString(), (String[]) sqc.m35962a((Object[][]) new String[][]{new String[]{acyr.f61090d}, (String[]) arrayList.toArray(new String[0])}));
            Map a3 = m32824a(acyr);
            for (qty qty2 : qtyArr) {
                a3.remove(qty2.f42132a);
            }
        }
    }
}
