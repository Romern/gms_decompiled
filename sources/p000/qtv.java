package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qtv {

    /* renamed from: a */
    public static final String f42123a = ("account=?");

    /* renamed from: b */
    public static final String f42124b = ("account=? AND type=?");

    /* renamed from: c */
    public static final String f42125c = ("is_dirty=1 AND account=? AND type=?");

    /* renamed from: d */
    public static final String f42126d = ("SELECT COUNT(*) FROM sync_entities WHERE " + f42125c);

    /* renamed from: e */
    public static final imo f42127e = new qtu();

    /* renamed from: h */
    private static final String f42128h = ("is_deleted_locally!=1 AND account=? AND type=?");

    /* renamed from: f */
    public final acyn f42129f;

    /* renamed from: g */
    public final qth f42130g;

    public qtv(Context context) {
        this.f42129f = new acyn(context);
        this.f42130g = qth.m32851a(context);
    }

    /* renamed from: a */
    public static ContentValues m32885a(acyr acyr, qtq qtq) {
        byte[] bArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", acyr.f61090d);
        contentValues.put("type", Integer.valueOf(qtq.f42113b));
        contentValues.put("id", qtq.f42114c);
        contentValues.put("value", qtq.f42115d.getKey());
        contentValues.put("is_dirty", Boolean.valueOf(qtq.f42117f));
        if (!qtq.f42116e.mo73779j()) {
            bArr = qtq.f42116e.getKey();
        } else {
            bArr = null;
        }
        contentValues.put("version", bArr);
        contentValues.put("is_deleted_locally", Boolean.valueOf(qtq.f42118g));
        return contentValues;
    }

    /* renamed from: b */
    public final List mo24277b(acyr acyr, int i) {
        return mo24273a(acyr, i, f42128h);
    }

    /* renamed from: a */
    public static qtq m32886a(Cursor cursor) {
        ByteString bxtx;
        byte[] a = qto.m32873a(cursor, "version");
        qtp qtp = new qtp();
        qtp.mo24268a(qto.m32875c(cursor, "type"));
        qtp.f42106a = qto.m32876d(cursor, "id");
        qtp.f42107b = bxtx.m123261a(qto.m32873a(cursor, "value"));
        qtp.f42109d = qto.m32874b(cursor, "is_dirty");
        if (a != null) {
            bxtx = bxtx.m123261a(a);
        } else {
            bxtx = bxtx.f164797b;
        }
        qtp.f42108c = bxtx;
        qtp.f42110e = qto.m32874b(cursor, "is_deleted_locally");
        return qtp.mo24267a();
    }

    /* renamed from: a */
    public final List mo24272a(acyr acyr, int i) {
        return mo24273a(acyr, i, f42124b);
    }

    /* renamed from: a */
    public final List mo24273a(acyr acyr, int i, String str) {
        Cursor query = this.f42130g.mo24263a().query("sync_entities", null, str, new String[]{acyr.f61090d, String.valueOf(i)}, null, null, null);
        try {
            ArrayList arrayList = new ArrayList();
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList.add(m32886a(query));
                query.moveToNext();
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public final List mo24274a(acyr acyr, int i, List list) {
        SQLiteDatabase a = this.f42130g.mo24263a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(acyr.f61090d);
        arrayList.add(String.valueOf(i));
        arrayList.addAll(list);
        Cursor query = a.query("sync_entities", null, String.format("%s=? AND %s=? AND %s IN (%s)", "account", "type", "id", bmxr.m108543a(',').mo66874a((Iterable) Collections.nCopies(list.size(), "?"))), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            ArrayList arrayList2 = new ArrayList();
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList2.add(m32886a(query));
                query.moveToNext();
            }
            return arrayList2;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public final void mo24275a(acyr acyr, List list) {
        SQLiteDatabase a = this.f42130g.mo24263a();
        a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qto.m32871a(a, "sync_entities", m32885a(acyr, (qtq) it.next()));
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public final void mo24276a(acyr acyr, qtq... qtqArr) {
        mo24275a(acyr, bngx.m109370a((Object[]) qtqArr));
    }
}
