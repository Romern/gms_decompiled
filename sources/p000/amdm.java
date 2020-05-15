package p000;

import android.content.Context;

/* renamed from: amdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdm {

    /* renamed from: c */
    private static amdm f74746c;

    /* renamed from: a */
    public final Context f74747a;

    /* renamed from: b */
    public final anbt f74748b;

    private amdm(Context context) {
        this.f74747a = context;
        this.f74748b = anbt.m63940a(context);
    }

    /* renamed from: a */
    public static synchronized amdm m62661a(Context context) {
        amdm amdm;
        synchronized (amdm.class) {
            if (f74746c == null) {
                f74746c = new amdm(context);
            }
            amdm = f74746c;
        }
        return amdm;
    }

    /* renamed from: a */
    public static String m62662a(long j, boolean z) {
        String valueOf = String.valueOf(j);
        String str = !z ? "" : "-PAGE";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8 + str.length());
        sb.append("DEFAULT-");
        sb.append(valueOf);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final anci mo41123a(int i, boolean z) {
        String str;
        alsj a = alsj.m61651a(this.f74747a);
        long b = a.mo40688b(z);
        long a2 = ancm.m64005a(this.f74747a).mo20505a() / 1000;
        if (!z) {
            str = cgbe.f186279a.mo6606a().mo83250G();
        } else {
            str = cgbe.f186279a.mo6606a().mo83252I();
        }
        String a3 = ancc.m63969a(str);
        String a4 = m62662a(b, z);
        if (a2 - b >= cgbe.f186279a.mo6606a().mo83251H() || !this.f74748b.mo41671a(a4, (String) null, a3)) {
            String a5 = m62662a(a2, z);
            mo41124a(a5, null, str, true);
            if (this.f74748b.mo41671a(a5, (String) null, a3) && !a4.equals(a5)) {
                this.f74748b.mo41669a(a4, null);
                sdo.m34973b((String) null);
                a.f74200a.edit().putLong(alsj.m61654a(z), a2).commit();
                a4 = a5;
            }
        }
        return this.f74748b.mo41667a(a4, (String) null, ancc.m63969a(str), i);
    }

    /* renamed from: a */
    public final void mo41124a(String str, String str2, String str3, boolean z) {
        if (!this.f74748b.mo41671a(str, str2, ancc.m63969a(str3))) {
            almy a = almy.m61373a(this.f74747a);
            bmxy.m108581a(str3);
            byte[] a2 = a.mo40601a(anbt.m63942a(str3, z, a.f73813a), true);
            if (a2 != null && a2 != alot.f73983c && a2 != alot.f73984d) {
                this.f74748b.mo41670a(str, str2, ancc.m63969a(str3), a2);
            }
        }
    }
}
