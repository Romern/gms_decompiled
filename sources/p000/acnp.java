package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acnp extends acmq {

    /* renamed from: a */
    public final Cursor f60261a;

    /* renamed from: b */
    public long f60262b;

    /* renamed from: c */
    private final int f60263c;

    /* renamed from: d */
    private final int f60264d = this.f60261a.getColumnIndex("lookup_key");

    /* renamed from: e */
    private final int f60265e = this.f60261a.getColumnIndex("score");

    /* renamed from: f */
    private final int f60266f = this.f60261a.getColumnIndex("icon_uri");

    /* renamed from: g */
    private final int f60267g = this.f60261a.getColumnIndex("display_name");

    /* renamed from: h */
    private final int f60268h = this.f60261a.getColumnIndex("given_names");

    /* renamed from: i */
    private final int f60269i = this.f60261a.getColumnIndex("emails");

    /* renamed from: j */
    private final int f60270j = this.f60261a.getColumnIndex("nickname");

    /* renamed from: k */
    private final int f60271k = this.f60261a.getColumnIndex("note");

    /* renamed from: l */
    private final int f60272l = this.f60261a.getColumnIndex("organization");

    /* renamed from: m */
    private final int f60273m = this.f60261a.getColumnIndex("phone_numbers");

    /* renamed from: n */
    private final int f60274n = this.f60261a.getColumnIndex("postal_address");

    /* renamed from: o */
    private final int f60275o = this.f60261a.getColumnIndex("phonetic_name");

    public acnp(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("contacts", acmj.f60156a, str, null, null, null, "contact_id");
        this.f60261a = query;
        this.f60263c = query.getColumnIndex("contact_id");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo32890d() {
        try {
            if (!this.f60261a.moveToNext()) {
                return null;
            }
            this.f60262b += acov.m49640a(this.f60261a);
            return acms.m49464a(this.f60261a.getLong(this.f60263c), this.f60261a.getString(this.f60264d), this.f60261a.getString(this.f60266f), this.f60261a.getString(this.f60267g), this.f60261a.getString(this.f60268h), this.f60261a.getLong(this.f60265e), this.f60261a.getString(this.f60269i), this.f60261a.getString(this.f60270j), this.f60261a.getString(this.f60271k), this.f60261a.getString(this.f60272l), this.f60261a.getString(this.f60273m), this.f60261a.getString(this.f60274n), this.f60261a.getString(this.f60275o));
        } catch (IllegalStateException e) {
            acnv.m49556e("Cursor improperly initialized. Return null.");
            return null;
        }
    }
}
