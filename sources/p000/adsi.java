package p000;

import android.database.Cursor;

/* renamed from: adsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adsi {

    /* renamed from: a */
    static final String[] f62620a = {"_ID", "MEDIA_TYPE"};

    /* renamed from: c */
    public static final /* synthetic */ int f62621c = 0;

    /* renamed from: b */
    public final srp f62622b;

    public adsi(srp srp) {
        sdo.m34959a(srp);
        this.f62622b = srp;
    }

    /* renamed from: a */
    public final Cursor mo33758a() {
        return this.f62622b.getReadableDatabase().query(false, "IntermediateStore", f62620a, null, null, null, null, "_ID DESC", null);
    }
}
