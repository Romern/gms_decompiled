package p000;

import android.content.Context;

/* renamed from: lvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvm {

    /* renamed from: a */
    public static final lvn f33050a = new lvn("InternalPeopleServiceGrpcClient");

    /* renamed from: b */
    public final lvl f33051b;

    /* renamed from: c */
    public final Context f33052c;

    public lvm(Context context) {
        sdo.m34959a(context);
        this.f33052c = context;
        this.f33051b = new lvl(new shl(context, "people-pa.googleapis.com", 443, context.getApplicationInfo().uid, 1029));
    }
}
