package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: ula */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ula {

    /* renamed from: a */
    public static final sbw f48061a = new sbw("GenoaValuesField", "");

    /* renamed from: b */
    final vpj f48062b;

    /* renamed from: c */
    protected Object f48063c = null;

    /* renamed from: d */
    private final vpj f48064d;

    /* renamed from: e */
    private Long f48065e = null;

    public ula(vpj vpj, vpj vpj2) {
        this.f48062b = vpj;
        this.f48064d = vpj2;
    }

    /* renamed from: a */
    static ula m38904a(vpj vpj, vpj vpj2) {
        return new uku(vpj, vpj2);
    }

    /* renamed from: b */
    static ula m38905b(vpj vpj, vpj vpj2) {
        return new ukv(vpj, vpj2);
    }

    /* renamed from: c */
    static ula m38906c(vpj vpj, vpj vpj2) {
        return new ukw(vpj, vpj2);
    }

    /* renamed from: d */
    static ula m38907d(vpj vpj, vpj vpj2) {
        return new ukx(vpj, vpj2);
    }

    /* renamed from: e */
    static ula m38908e(vpj vpj, vpj vpj2) {
        return new uky(vpj, vpj2);
    }

    /* renamed from: f */
    static ula m38909f(vpj vpj, vpj vpj2) {
        return new ukz(vpj, vpj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo27678a(Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27679a(ContentValues contentValues);

    /* renamed from: a */
    public final boolean mo27683a() {
        return this.f48065e != null;
    }

    /* renamed from: d */
    public final void mo27688d() {
        this.f48063c = null;
        this.f48065e = null;
    }

    /* renamed from: a */
    public final void mo27680a(long j) {
        sdo.m34970a(mo27683a());
        this.f48065e = Long.valueOf(j);
    }

    /* renamed from: b */
    public final Object mo27684b() {
        sdo.m34970a(mo27683a());
        return this.f48063c;
    }

    /* renamed from: c */
    public final long mo27687c() {
        sdo.m34970a(mo27683a());
        return this.f48065e.longValue();
    }

    /* renamed from: a */
    public final void mo27681a(Object obj) {
        sdo.m34970a(mo27683a());
        this.f48063c = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27685b(ContentValues contentValues) {
        contentValues.put(((unp) this.f48064d.mo27461b()).mo27700a(), this.f48065e);
        mo27679a(contentValues);
    }

    /* renamed from: a */
    public final void mo27682a(Object obj, long j) {
        this.f48063c = obj;
        this.f48065e = Long.valueOf(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo27686b(Cursor cursor) {
        this.f48063c = mo27678a(cursor);
        this.f48065e = ((unp) this.f48064d.mo27461b()).mo27705b(cursor);
    }
}
