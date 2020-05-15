package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: alpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class alpv extends alpp {

    /* renamed from: a */
    private final String f74043a;

    protected alpv(String str) {
        this.f74043a = str;
    }

    /* renamed from: a */
    public final void mo40634a(alqk alqk, Cursor cursor) {
        String b = m61487b(cursor, this.f74043a);
        if (!TextUtils.isEmpty(b)) {
            mo40636a(alqk, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40636a(alqk alqk, String str);

    /* renamed from: a */
    public final void mo40635a(Collection collection) {
        collection.add(this.f74043a);
    }
}
