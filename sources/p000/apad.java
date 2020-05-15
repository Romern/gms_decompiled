package p000;

import android.database.Cursor;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: apad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apad implements Iterator, apac {

    /* renamed from: a */
    private Object f83976a;

    /* renamed from: b */
    private final Cursor f83977b;

    /* renamed from: c */
    private final aozy f83978c;

    /* renamed from: d */
    private final apaw f83979d;

    /* renamed from: e */
    private final int f83980e;

    /* renamed from: f */
    private final int f83981f;

    /* renamed from: g */
    private final int f83982g;

    /* renamed from: h */
    private final int f83983h;

    /* renamed from: i */
    private final int f83984i;

    /* renamed from: j */
    private final int f83985j;

    /* renamed from: k */
    private final int f83986k;

    /* renamed from: l */
    private long f83987l;

    /* renamed from: m */
    private boolean f83988m;

    apad() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: c */
    private final void m69934c() {
        if (this.f83976a == null) {
            apab apab = null;
            while (apab == null) {
                boolean z = true;
                try {
                    if (!this.f83977b.moveToNext()) {
                        break;
                    }
                    aoyh aoyh = apay.f84079a;
                    long j = this.f83977b.getLong(this.f83980e);
                    long j2 = this.f83987l;
                    if (j != j2) {
                        if (j2 != -1) {
                            apab = this.f83979d.mo47065b();
                            this.f83979d.mo47064a();
                        }
                        this.f83987l = j;
                        apaw apaw = this.f83979d;
                        apaw.f84078f = j;
                        apaw.f84073a.f84062h = j;
                        apaw.f84073a.f84063i = this.f83977b.getString(this.f83986k);
                        this.f83979d.f84073a.f84064j = this.f83977b.getString(this.f83981f);
                        this.f83979d.f84073a.f84065k = this.f83977b.getString(this.f83982g);
                        this.f83979d.f84073a.f84066l = this.f83977b.getString(this.f83983h);
                        long j3 = this.f83977b.getLong(this.f83984i);
                        apaw apaw2 = this.f83979d;
                        apaw2.f84073a.f84067m = 1 + j3;
                        apaw2.f84074b.f84069a = j3;
                        apaw2.f84074b.f84070b = this.f83977b.getLong(this.f83985j);
                    }
                    aozy aozy = this.f83978c;
                    apaw apaw3 = this.f83979d;
                    if (aozy.f83964d == null) {
                        z = false;
                    }
                    sdo.m34971a(z, (Object) "Cursor must be set");
                    aozp aozp = (aozp) aozy.f83962b.get(aozy.f83964d.getString(aozy.f83965e));
                    if (aozp != null) {
                        aozp.mo47042a(apaw3, aozy.f83964d);
                    }
                } catch (IllegalStateException e) {
                    if (cgjy.m145760g()) {
                        apay.f84079a.mo46980a(e, "moveToNext threw an exception");
                    } else {
                        apay.f84079a.mo46987e("moveToNext threw an exception", e);
                    }
                    this.f83988m = false;
                }
            }
            if (apab == null && this.f83977b.isAfterLast() && this.f83987l != -1) {
                apab = this.f83979d.mo47065b();
                this.f83979d.mo47064a();
                this.f83987l = -1;
            }
            this.f83976a = apab;
        }
    }

    /* renamed from: a */
    public final void mo47049a() {
        this.f83977b.close();
    }

    /* renamed from: b */
    public final boolean mo47050b() {
        return this.f83988m;
    }

    public final boolean hasNext() {
        m69934c();
        return this.f83976a != null;
    }

    public final Object next() {
        m69934c();
        Object obj = this.f83976a;
        if (obj != null) {
            this.f83976a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public apad(Cursor cursor, aozy aozy) {
        sdo.m34959a(cursor);
        this.f83977b = cursor;
        this.f83978c = aozy;
        aozy.f83964d = cursor;
        aozy.f83965e = cursor.getColumnIndex("mimetype");
        this.f83979d = new apaw();
        this.f83980e = cursor.getColumnIndex("contact_id");
        this.f83986k = cursor.getColumnIndex("lookup");
        this.f83981f = cursor.getColumnIndex("photo_thumb_uri");
        this.f83982g = cursor.getColumnIndex("display_name");
        this.f83983h = cursor.getColumnIndex("phonetic_name");
        this.f83984i = cursor.getColumnIndex("times_contacted");
        this.f83985j = cursor.getColumnIndex("last_time_contacted");
        this.f83987l = -1;
        this.f83988m = true;
    }
}
