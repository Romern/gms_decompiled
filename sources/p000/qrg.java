package p000;

import android.content.ContentValues;

/* renamed from: qrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrg extends qrf {
    public qrg(String str, qun qun) {
        super(2, str, qun);
    }

    /* renamed from: a */
    public final bmxv mo24218a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", this.f41993b);
        contentValues.put("idx_origin", ((qun) this.f41994c).f42168c);
        contentValues.put("idx_signon_realm", ((qun) this.f41994c).f42167b);
        contentValues.put("idx_username", ((qun) this.f41994c).f42170e);
        return bmxv.m108566b(contentValues);
    }
}
