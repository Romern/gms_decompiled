package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: unk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class unk extends uny {

    /* renamed from: a */
    public String f48318a;

    /* renamed from: b */
    public String f48319b;

    /* renamed from: c */
    public String f48320c;

    /* renamed from: d */
    public boolean f48321d;

    /* renamed from: e */
    public String f48322e;

    public unk(uno uno, long j, String str, String str2, String str3, boolean z, String str4) {
        super(uno, unn.f48330a, j);
        sdo.m34959a((Object) str);
        this.f48318a = str;
        this.f48319b = str2;
        this.f48320c = str3;
        this.f48321d = z;
        this.f48322e = str4;
    }

    /* renamed from: a */
    public static unk m38984a(uno uno, Cursor cursor) {
        return new unk(uno, unn.f48330a.f48341a.mo27705b(cursor).longValue(), unm.PERMISSIONS_ID.f48329f.mo27702a(cursor), unm.DISPLAY_NAME.f48329f.mo27702a(cursor), unm.PICTURE_URL.f48329f.mo27702a(cursor), unm.IS_AUTHENTICATED_USER.f48329f.mo27718e(cursor), unm.EMAIL_ADDRESS.f48329f.mo27702a(cursor));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        contentValues.put(unm.PERMISSIONS_ID.f48329f.mo27700a(), this.f48318a);
        contentValues.put(unm.DISPLAY_NAME.f48329f.mo27700a(), this.f48319b);
        contentValues.put(unm.PICTURE_URL.f48329f.mo27700a(), this.f48320c);
        contentValues.put(unm.IS_AUTHENTICATED_USER.f48329f.mo27700a(), Boolean.valueOf(this.f48321d));
        contentValues.put(unm.EMAIL_ADDRESS.f48329f.mo27700a(), this.f48322e);
    }
}
