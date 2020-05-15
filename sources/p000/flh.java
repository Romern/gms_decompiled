package p000;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: flh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class flh {

    /* renamed from: a */
    private final fkm f16851a;

    /* renamed from: b */
    private volatile Boolean f16852b;

    /* renamed from: c */
    private String f16853c;

    /* renamed from: d */
    private Set f16854d;

    protected flh(fkm fkm) {
        sdo.m34959a(fkm);
        this.f16851a = fkm;
    }

    /* renamed from: c */
    public static final long m11933c() {
        return ((Long) fni.f16930h.mo11021a()).longValue();
    }

    /* renamed from: d */
    public static final long m11934d() {
        return ((Long) fni.f16929g.mo11021a()).longValue();
    }

    /* renamed from: e */
    public static final int m11935e() {
        return ((Integer) fni.f16933k.mo11021a()).intValue();
    }

    /* renamed from: f */
    public static final int m11936f() {
        return ((Integer) fni.f16932j.mo11021a()).intValue();
    }

    /* renamed from: g */
    public static final String m11937g() {
        return (String) fni.f16935m.mo11021a();
    }

    /* renamed from: h */
    public static final String m11938h() {
        return (String) fni.f16936n.mo11021a();
    }

    /* renamed from: i */
    public static final String m11939i() {
        return (String) fni.f16934l.mo11021a();
    }

    /* renamed from: a */
    public final boolean mo11005a() {
        if (this.f16852b == null) {
            synchronized (this) {
                if (this.f16852b == null) {
                    ApplicationInfo applicationInfo = this.f16851a.f16785a.getApplicationInfo();
                    String a = ssy.m36271a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f16852b = Boolean.valueOf(z);
                    }
                    if ((this.f16852b == null || !this.f16852b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f16852b = Boolean.TRUE;
                    }
                    if (this.f16852b == null) {
                        this.f16852b = Boolean.TRUE;
                        this.f16851a.mo10957a().mo10942g("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f16852b.booleanValue();
    }

    /* renamed from: b */
    public final Set mo11006b() {
        String str;
        String str2 = (String) fni.f16944v.mo11021a();
        if (this.f16854d == null || (str = this.f16853c) == null || !str.equals(str2)) {
            String[] split = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException e) {
                }
            }
            this.f16853c = str2;
            this.f16854d = hashSet;
        }
        return this.f16854d;
    }
}
