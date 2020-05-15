package p000;

import android.content.Context;

/* renamed from: mah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mah {

    /* renamed from: a */
    private static final lvn f33328a = new lvn("SwitchTransportTaskFactory");

    /* renamed from: b */
    private final Context f33329b;

    /* renamed from: c */
    private final lvp f33330c;

    /* renamed from: d */
    private final man f33331d;

    public mah(Context context, man man) {
        lvp lvp = new lvp(context);
        this.f33329b = context;
        this.f33330c = lvp;
        this.f33331d = man;
    }

    /* renamed from: a */
    public final mag mo19803a(maf maf, String str, String str2) {
        mce.m24864d();
        f33328a.mo25409a("Using Post-O selectBackupTransport API", new Object[0]);
        bxvd bxvd = ((met) this.f33331d).f33543l;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mtb mtb = (mtb) bxvd.f164949b;
        mtb mtb2 = mtb.f34626o;
        mtb.f34628a |= 8;
        mtb.f34634g = true;
        return new maj(this.f33329b, this.f33330c, maf, str, str2);
    }
}
