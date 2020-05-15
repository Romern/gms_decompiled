package p000;

import android.database.Cursor;

/* renamed from: uib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uib implements uhx {

    /* renamed from: a */
    public static final uib f47672a = new uib();

    private uib() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        int i = ulz.f48173d;
        String a = umb.CONTENT_HASH.f48190k.mo27702a(cursor);
        String a2 = umb.BASE_CONTENT_HASH.f48190k.mo27702a(cursor);
        Long b = umb.ACTION_ID.f48190k.mo27705b(cursor);
        long longValue = umb.ENTRY_ID.f48190k.mo27705b(cursor).longValue();
        String a3 = umb.UPLOAD_URI.f48190k.mo27702a(cursor);
        return new ulz(uno, umc.f48191a.f48341a.mo27705b(cursor).longValue(), a, a2, b, ukk.m38862a(longValue), a3);
    }
}
