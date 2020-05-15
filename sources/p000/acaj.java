package p000;

import android.content.ContentProviderClient;
import android.database.Cursor;

/* renamed from: acaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acaj {

    /* renamed from: a */
    final ContentProviderClient f59104a;

    /* renamed from: b */
    final Cursor f59105b;

    public acaj(ContentProviderClient contentProviderClient, Cursor cursor) {
        this.f59104a = contentProviderClient;
        this.f59105b = cursor;
    }

    /* renamed from: a */
    public final int mo32580a(String str) {
        try {
            return this.f59105b.getColumnIndex(str);
        } catch (Throwable th) {
            throw new acai(th);
        }
    }

    /* renamed from: a */
    public final long mo32581a(int i) {
        try {
            return this.f59105b.getLong(i);
        } catch (Throwable th) {
            throw new acai(th);
        }
    }
}
