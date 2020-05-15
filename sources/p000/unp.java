package p000;

import android.database.Cursor;
import android.database.DatabaseUtils;

/* renamed from: unp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class unp extends uob {

    /* renamed from: a */
    public final unt f48332a;

    public unp(int i, unt unt, uoa uoa) {
        super(i, uoa);
        this.f48332a = unt;
    }

    /* renamed from: a */
    public static String m38990a(Object obj) {
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return DatabaseUtils.sqlEscapeString(obj.toString());
    }

    /* renamed from: b */
    public final Long mo27705b(Cursor cursor) {
        sdo.m34970a(mo27753g());
        mo27709b(1);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(mo27700a());
        if (!cursor.isNull(columnIndexOrThrow)) {
            return Long.valueOf(cursor.getLong(columnIndexOrThrow));
        }
        return null;
    }

    /* renamed from: c */
    public final long mo27710c(Cursor cursor) {
        Long b = mo27705b(cursor);
        if (b != null) {
            return b.longValue();
        }
        return 0;
    }

    /* renamed from: d */
    public final Boolean mo27713d(Cursor cursor) {
        Long b = mo27705b(cursor);
        if (b == null) {
            return null;
        }
        return Boolean.valueOf(b.longValue() != 0);
    }

    /* renamed from: e */
    public final uog mo27716e() {
        mo27754h();
        return uoh.m39067b(mo27700a());
    }

    /* renamed from: f */
    public final uog mo27719f() {
        return mo27704a(true);
    }

    public final String toString() {
        String valueOf = String.valueOf(!mo27753g() ? ((unx) this.f48376b).toString() : "[not present]");
        return valueOf.length() == 0 ? new String("DatabaseField:") : "DatabaseField:".concat(valueOf);
    }

    /* renamed from: b */
    public final String mo27706b() {
        String b = this.f48332a.mo27735b();
        String a = mo27700a();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(a).length());
        sb.append(b);
        sb.append('.');
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: c */
    public final uog mo27711c() {
        return mo27704a(false);
    }

    /* renamed from: e */
    public final uog mo27717e(long j) {
        mo27709b(1);
        return uoh.m39061a(mo27700a(), j);
    }

    /* renamed from: f */
    public final boolean mo27720f(Cursor cursor) {
        Boolean d = mo27713d(cursor);
        if (d != null) {
            return d.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public static String m38991a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }

    /* renamed from: b */
    public final uog mo27707b(long j) {
        mo27709b(1);
        return uoh.m39076d(mo27700a(), j);
    }

    /* renamed from: c */
    public final uog mo27712c(long j) {
        mo27709b(1);
        return uoh.m39078e(mo27700a(), j);
    }

    /* renamed from: d */
    public final uog mo27714d() {
        mo27754h();
        return uoh.m39073c(mo27700a());
    }

    /* renamed from: e */
    public final boolean mo27718e(Cursor cursor) {
        return mo27713d(cursor).booleanValue();
    }

    /* renamed from: a */
    public final String mo27700a() {
        mo27754h();
        return ((unx) this.f48376b).f48357a;
    }

    /* renamed from: b */
    public final uog mo27708b(String str) {
        mo27709b(2);
        return uoh.m39062a(mo27700a(), str);
    }

    /* renamed from: d */
    public final uog mo27715d(long j) {
        mo27709b(1);
        return uoh.m39080f(mo27700a(), j);
    }

    /* renamed from: a */
    public final String mo27701a(int i) {
        return ((unx) mo27750c(i)).f48357a;
    }

    /* renamed from: a */
    public final String mo27702a(Cursor cursor) {
        sdo.m34970a(mo27753g());
        mo27709b(2);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(mo27700a());
        if (!cursor.isNull(columnIndexOrThrow)) {
            return cursor.getString(columnIndexOrThrow);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo27709b(int i) {
        mo27754h();
        if (i != ((unx) this.f48376b).f48365i) {
            String valueOf = String.valueOf(this);
            String a = unw.m39036a(i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + a.length());
            sb.append(valueOf);
            sb.append(" is not a ");
            sb.append(a);
            sb.append(" field");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: a */
    public final uog mo27703a(long j) {
        mo27709b(1);
        return uoh.m39074c(mo27700a(), j);
    }

    /* renamed from: a */
    public final uog mo27704a(boolean z) {
        String str;
        mo27754h();
        mo27709b(1);
        if (!z) {
            str = "=0";
        } else {
            str = "!=0";
        }
        String valueOf = String.valueOf(mo27700a());
        return uoh.m39060a(str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
    }
}
