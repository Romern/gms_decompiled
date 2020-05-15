package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class acnr {

    /* renamed from: a */
    protected final Cursor f60277a;

    /* renamed from: b */
    public long f60278b;

    /* renamed from: c */
    private final Map f60279c = new HashMap();

    /* renamed from: d */
    private final int f60280d;

    /* renamed from: e */
    private final int f60281e = this.f60277a.getColumnIndex("data_id");

    /* renamed from: f */
    private final int f60282f = this.f60277a.getColumnIndex("type");

    /* renamed from: g */
    private final int f60283g = this.f60277a.getColumnIndex("label");

    /* renamed from: h */
    private final int f60284h = this.f60277a.getColumnIndex("score");

    /* renamed from: i */
    private long f60285i = -1;

    public acnr(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        Cursor query = sQLiteDatabase.query(str2, strArr, str, null, null, null, "contact_id");
        this.f60277a = query;
        this.f60280d = query.getColumnIndex("contact_id");
    }

    /* renamed from: b */
    private final void m49530b() {
        long j = this.f60277a.getLong(this.f60281e);
        this.f60279c.put(Long.valueOf(j), mo32925a(this.f60285i, j, this.f60277a.getInt(this.f60282f), this.f60277a.getString(this.f60283g), this.f60277a.getInt(this.f60284h)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ContentValues mo32925a(long j, long j2, int i, String str, int i2);

    /* renamed from: a */
    public final Map mo32926a(Long l) {
        if (l == null || this.f60285i > l.longValue()) {
            return Collections.emptyMap();
        }
        if (this.f60285i < l.longValue()) {
            this.f60279c.clear();
        }
        while (this.f60285i < l.longValue() && this.f60277a.moveToNext()) {
            this.f60278b += acov.m49640a(this.f60277a);
            long j = this.f60277a.getLong(this.f60280d);
            this.f60285i = j;
            if (j >= l.longValue()) {
                m49530b();
            }
        }
        if (this.f60285i != l.longValue()) {
            return Collections.emptyMap();
        }
        while (this.f60285i == l.longValue() && this.f60277a.moveToNext()) {
            this.f60278b += acov.m49640a(this.f60277a);
            long j2 = this.f60277a.getLong(this.f60280d);
            if (j2 == this.f60285i) {
                m49530b();
            } else {
                HashMap hashMap = new HashMap(this.f60279c);
                this.f60279c.clear();
                this.f60285i = j2;
                m49530b();
                return hashMap;
            }
        }
        return new HashMap(this.f60279c);
    }

    /* renamed from: a */
    public final void mo32927a() {
        acnv.m49555d("Closing data iterator (read %s). ", acov.m49641a(this.f60278b));
        this.f60277a.close();
    }
}
