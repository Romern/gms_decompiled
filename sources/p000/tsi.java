package p000;

import android.accounts.Account;
import com.google.android.chimera.Activity;

/* renamed from: tsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsi implements C0056bn {

    /* renamed from: a */
    private final trs f46586a;

    /* renamed from: b */
    private final tqr f46587b;

    /* renamed from: c */
    private final trx f46588c;

    private tsi(Activity activity, Account account) {
        qqf a = qqg.m32654a();
        a.f41945a = account;
        qqa a2 = qqb.m32645a(activity, a.mo24204a());
        qqf a3 = qqg.m32654a();
        a3.f41945a = account;
        this.f46586a = new trs(a2, qqb.m32649e(activity, a3.mo24204a()), activity.getPackageName());
        qqf a4 = qqg.m32654a();
        a4.f41945a = account;
        this.f46587b = new tqr(qqb.m32648d(activity, a4.mo24204a()));
        qqf a5 = qqg.m32654a();
        a5.f41945a = account;
        this.f46588c = new trx(qqb.m32646b(activity, a5.mo24204a()), activity.getPackageName());
    }

    /* renamed from: a */
    public static tsi m37432a(Activity activity, String str) {
        tsi tsi = (tsi) tuz.m37509a(activity).mo26821a(tsi.class);
        if (tsi != null) {
            return tsi;
        }
        tsi tsi2 = new tsi(activity, new Account(str, "com.google"));
        tuz.m37509a(activity).mo26822a(tsi2.getClass(), tsi2);
        return tsi2;
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        if (cls.isAssignableFrom(tsf.class)) {
            return (C0053bl) cls.cast(new tsf(this.f46586a));
        }
        if (cls.isAssignableFrom(trz.class)) {
            return (C0053bl) cls.cast(new trz(this.f46586a));
        }
        if (cls.isAssignableFrom(tsc.class)) {
            return (C0053bl) cls.cast(new tsc(this.f46586a));
        }
        if (cls.isAssignableFrom(tsa.class)) {
            return (C0053bl) cls.cast(new tsa(this.f46586a));
        }
        if (cls.isAssignableFrom(tsb.class)) {
            return (C0053bl) cls.cast(new tsb(this.f46587b));
        }
        if (cls.isAssignableFrom(tsh.class)) {
            return (C0053bl) cls.cast(new tsh(this.f46588c));
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("ViewModel provider cannot create an instance of ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
