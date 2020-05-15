package p000;

import android.database.Cursor;

/* renamed from: uid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uid implements uhx {

    /* renamed from: a */
    public static final uid f47674a = new uid();

    private uid() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        int i = unc.f48297c;
        String a = une.CONTENT_HASH.f48305d.mo27702a(cursor);
        long longValue = une.ENTRY_ID.f48305d.mo27705b(cursor).longValue();
        long longValue2 = une.VERSION.f48305d.mo27705b(cursor).longValue();
        return new unc(uno, unf.f48306a.f48341a.mo27705b(cursor).longValue(), a, ukk.m38862a(longValue), longValue2);
    }
}
