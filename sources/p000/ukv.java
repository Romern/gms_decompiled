package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Date;

/* renamed from: ukv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ukv extends ula {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27678a(Cursor cursor) {
        Long b = ((unp) this.f48062b.mo27461b()).mo27705b(cursor);
        if (b != null) {
            return new Date(b.longValue());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27679a(ContentValues contentValues) {
        Long l;
        String a = ((unp) this.f48062b.mo27461b()).mo27700a();
        Object obj = this.f48063c;
        if (obj != null) {
            l = Long.valueOf(((Date) obj).getTime());
        } else {
            l = null;
        }
        contentValues.put(a, l);
    }

    public ukv(vpj vpj, vpj vpj2) {
        super(vpj, vpj2);
    }
}
