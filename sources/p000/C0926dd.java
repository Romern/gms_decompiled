package p000;

import android.content.Context;

/* renamed from: dd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0926dd {

    /* renamed from: a */
    final Context f12907a;

    /* renamed from: b */
    public String f12908b;

    /* renamed from: c */
    public C0925dc f12909c;

    public C0926dd(Context context) {
        this.f12907a = context;
    }

    /* renamed from: a */
    public final C0927de mo8535a() {
        C0925dc dcVar = this.f12909c;
        if (dcVar != null) {
            Context context = this.f12907a;
            if (context != null) {
                return new C0927de(context, this.f12908b, dcVar);
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
