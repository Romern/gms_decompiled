package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: uje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uje extends uny {

    /* renamed from: a */
    public final uif f47757a;

    /* renamed from: b */
    public final String f47758b;

    /* renamed from: c */
    public final String f47759c;

    /* renamed from: d */
    public String f47760d;

    /* renamed from: e */
    public final ula f47761e = ula.m38906c(ujg.GENOA_VALUE, ujg.ACTION_ID);

    public uje(uno uno, Cursor cursor) {
        super(uno, ujh.f47771a, ujh.f47771a.f48341a.mo27705b(cursor).longValue());
        this.f47759c = ujg.NAME.f47770h.mo27702a(cursor);
        this.f47757a = uif.m38672a(ujg.ENTRY_ID.f47770h.mo27705b(cursor).longValue());
        this.f47758b = ujg.SDK_APP_ID.f47770h.mo27702a(cursor);
        this.f47760d = ujg.VALUE.f47770h.mo27702a(cursor);
        this.f47761e.mo27686b(cursor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(ujg.ENTRY_ID.f47770h.mo27700a(), this.f47757a.f47676a);
        contentValues.put(ujg.NAME.f47770h.mo27700a(), this.f47759c);
        contentValues.put(ujg.SDK_APP_ID.f47770h.mo27700a(), this.f47758b);
        contentValues.put(ujg.VALUE.f47770h.mo27700a(), this.f47760d);
        this.f47761e.mo27685b(contentValues);
    }

    /* renamed from: a */
    public final void mo27516a(String str) {
        if (!sdg.m34949a(this.f47760d, str)) {
            this.f47760d = str;
        }
    }

    public uje(uno uno, uif uif, String str, String str2) {
        super(uno, ujh.f47771a, -1);
        sdo.m34959a(uif);
        sdo.m34959a((Object) str);
        this.f47757a = uif;
        this.f47759c = str;
        this.f47758b = str2;
        this.f47760d = null;
    }
}
