package p000;

import android.content.Context;

/* renamed from: nat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nat implements nan {

    /* renamed from: a */
    private static final lvn f35149a = new lvn("UserAwareEnabler");

    /* renamed from: a */
    public final void mo20412a(Context context, mbz mbz) {
        if (!cckt.m130240c() || mcl.m24877a()) {
            mo20414b(context, mbz);
            return;
        }
        f35149a.mo25412b("User not 0, disabling components", new Object[0]);
        mo20413a(mbz);
    }

    /* renamed from: a */
    public abstract void mo20413a(mbz mbz);

    /* renamed from: b */
    public abstract void mo20414b(Context context, mbz mbz);
}
