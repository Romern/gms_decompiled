package p000;

import android.database.Cursor;
import android.util.Log;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: alqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alqc implements Iterator, alqb {

    /* renamed from: a */
    private Object f74054a;

    /* renamed from: b */
    private final Cursor f74055b;

    /* renamed from: c */
    private final alpy f74056c;

    /* renamed from: d */
    private final alqk f74057d;

    /* renamed from: e */
    private final int f74058e;

    /* renamed from: f */
    private final int f74059f;

    /* renamed from: g */
    private final int f74060g;

    /* renamed from: h */
    private final int f74061h;

    /* renamed from: i */
    private final int f74062i;

    /* renamed from: j */
    private final int f74063j;

    /* renamed from: k */
    private final int f74064k;

    /* renamed from: l */
    private final int f74065l;

    /* renamed from: m */
    private long f74066m;

    /* renamed from: n */
    private boolean f74067n;

    alqc() {
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
    private final void m61506c() {
        if (this.f74054a == null) {
            alqa alqa = null;
            while (alqa == null) {
                boolean z = false;
                try {
                    if (!this.f74055b.moveToNext()) {
                        break;
                    }
                    int i = alqm.f74102a;
                    long j = this.f74055b.getLong(this.f74058e);
                    long j2 = this.f74066m;
                    if (j != j2) {
                        if (j2 != -1) {
                            alqa = this.f74057d.mo40649b();
                            this.f74057d.mo40648a();
                        }
                        this.f74066m = j;
                        alqk alqk = this.f74057d;
                        alqk.f74101f = j;
                        alqk.f74096a.f74084h = j;
                        alqk.f74096a.f74085i = this.f74055b.getLong(this.f74059f);
                        this.f74057d.f74096a.f74086j = this.f74055b.getString(this.f74065l);
                        this.f74057d.f74096a.f74087k = this.f74055b.getString(this.f74060g);
                        this.f74057d.f74096a.f74088l = this.f74055b.getString(this.f74061h);
                        this.f74057d.f74096a.f74089m = this.f74055b.getString(this.f74062i);
                        long j3 = this.f74055b.getLong(this.f74063j);
                        alqk alqk2 = this.f74057d;
                        alqk2.f74096a.f74090n = 1 + j3;
                        alqk2.f74097b.f74092a = j3;
                        alqk2.f74097b.f74093b = this.f74055b.getLong(this.f74064k);
                    }
                    alpy alpy = this.f74056c;
                    alqk alqk3 = this.f74057d;
                    if (alpy.f74046c != null) {
                        z = true;
                    }
                    sdo.m34971a(z, (Object) "Cursor must be set");
                    alpp alpp = (alpp) alpy.f74044a.get(alpy.f74046c.getString(alpy.f74047d));
                    if (alpp != null) {
                        alpp.mo40634a(alqk3, alpy.f74046c);
                    }
                } catch (IllegalStateException e) {
                    Log.e("ContactsProviderHelper", "moveToNext threw an exception", e);
                    this.f74067n = false;
                }
            }
            if (alqa == null && this.f74055b.isAfterLast() && this.f74066m != -1) {
                alqa = this.f74057d.mo40649b();
                this.f74057d.mo40648a();
                this.f74066m = -1;
            }
            this.f74054a = alqa;
        }
    }

    /* renamed from: a */
    public final void mo40640a() {
        this.f74055b.close();
    }

    /* renamed from: b */
    public final boolean mo40641b() {
        return this.f74067n;
    }

    public final boolean hasNext() {
        m61506c();
        return this.f74054a != null;
    }

    public final Object next() {
        m61506c();
        Object obj = this.f74054a;
        if (obj != null) {
            this.f74054a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public alqc(Cursor cursor, alpy alpy) {
        sdo.m34959a(cursor);
        this.f74055b = cursor;
        this.f74056c = alpy;
        alpy.f74046c = cursor;
        alpy.f74047d = cursor.getColumnIndex("mimetype");
        this.f74057d = new alqk();
        this.f74058e = cursor.getColumnIndex("contact_id");
        this.f74059f = cursor.getColumnIndex("raw_contact_id");
        this.f74065l = cursor.getColumnIndex("lookup");
        this.f74060g = cursor.getColumnIndex("photo_thumb_uri");
        this.f74061h = cursor.getColumnIndex("display_name");
        this.f74062i = cursor.getColumnIndex("phonetic_name");
        this.f74063j = cursor.getColumnIndex("times_contacted");
        this.f74064k = cursor.getColumnIndex("last_time_contacted");
        this.f74066m = -1;
        this.f74067n = true;
    }
}
