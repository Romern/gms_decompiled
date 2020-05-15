package p000;

import android.content.ComponentName;

/* renamed from: aeco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeco implements bmxz {

    /* renamed from: a */
    public final int f63159a;

    /* renamed from: b */
    public final int f63160b;

    /* renamed from: c */
    private final int f63161c;

    /* renamed from: d */
    private final String f63162d;

    /* renamed from: e */
    private final String f63163e;

    /* renamed from: f */
    private final String f63164f;

    public aeco(aecn aecn) {
        this.f63161c = aecn.f63153a;
        this.f63162d = aecn.f63156d;
        this.f63163e = aecn.f63157e;
        this.f63164f = aecn.f63158f;
        this.f63159a = aecn.f63155c;
        this.f63160b = aecn.f63154b;
    }

    /* renamed from: a */
    public static aeco m51639a(int i) {
        aecn aecn = new aecn();
        aecn.mo34039a(i);
        return aecn.mo34038a();
    }

    /* renamed from: b */
    private final boolean m51643b(int i) {
        return (i & this.f63161c) == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aeco) {
            aeco aeco = (aeco) obj;
            if (this.f63161c != aeco.f63161c || this.f63159a != aeco.f63159a || this.f63160b != aeco.f63160b || !sdg.m34949a(this.f63162d, aeco.f63162d) || !sdg.m34949a(this.f63163e, aeco.f63163e) || !sdg.m34949a(this.f63164f, aeco.f63164f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: a */
    public static aeco m51640a(int i, ComponentName componentName) {
        aecn aecn = new aecn();
        aecn.mo34039a(i);
        aecn.mo34041b(componentName.getPackageName());
        aecn.mo34040a(componentName.getClassName());
        return aecn.mo34038a();
    }

    /* renamed from: a */
    public static aeco m51641a(int i, ComponentName componentName, String str) {
        aecn aecn = new aecn();
        aecn.mo34039a(i);
        aecn.mo34042c(str);
        aecn.mo34041b(componentName.getPackageName());
        aecn.mo34040a(componentName.getClassName());
        return aecn.mo34038a();
    }

    /* renamed from: a */
    private static boolean m51642a(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    /* renamed from: a */
    public final boolean mo6527a(aecl aecl) {
        if ((m51643b(16) || this.f63159a == ((int) aecl.f63144b)) && ((m51643b(1) || m51642a(this.f63162d, aecl.f63145c)) && ((m51643b(2) || m51642a(this.f63163e, aecl.f63146d)) && (m51643b(4) || m51642a(this.f63164f, aecl.f63147e))))) {
            if (m51643b(8)) {
                return true;
            }
            int i = this.f63160b;
            int i2 = aecl.f63143a;
            return (i & i2) == i2;
        }
    }
}
