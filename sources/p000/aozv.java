package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: aozv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aozv extends aozp {

    /* renamed from: a */
    private final String f83960a;

    protected aozv(String str) {
        this.f83960a = str;
    }

    /* renamed from: a */
    public final void mo47042a(apaw apaw, Cursor cursor) {
        String b = m69912b(cursor, this.f83960a);
        if (!TextUtils.isEmpty(b)) {
            mo47044a(apaw, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47044a(apaw apaw, String str);

    /* renamed from: a */
    public final void mo47043a(Collection collection) {
        collection.add(this.f83960a);
    }
}
