package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: acmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class acmf extends aclz {

    /* renamed from: a */
    private final String f60151a;

    protected acmf(String str) {
        this.f60151a = str;
    }

    /* renamed from: a */
    public final void mo32878a(acmz acmz, Cursor cursor) {
        String b = m49434b(cursor, this.f60151a);
        if (!TextUtils.isEmpty(b)) {
            mo32880a(acmz, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32880a(acmz acmz, String str);

    /* renamed from: a */
    public final void mo32879a(Collection collection) {
        collection.add(this.f60151a);
    }
}
