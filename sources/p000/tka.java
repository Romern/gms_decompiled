package p000;

import java.util.Arrays;

/* renamed from: tka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tka implements tnd {

    /* renamed from: a */
    public final bxeu f46221a;

    public tka(bxeu bxeu) {
        sdo.m34959a(bxeu);
        this.f46221a = bxeu;
    }

    /* renamed from: a */
    private static bxeu m37116a(int i, long j, long j2) {
        bxvd da = bxeu.f163125e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxeu bxeu = (bxeu) da.f164949b;
        bxeu.f163128b = i;
        int i2 = bxeu.f163127a | 1;
        bxeu.f163127a = i2;
        int i3 = i2 | 2;
        bxeu.f163127a = i3;
        bxeu.f163129c = j;
        bxeu.f163127a = i3 | 4;
        bxeu.f163130d = j2;
        return (bxeu) da.mo74062i();
    }

    /* renamed from: b */
    public static tka m37119b(long j) {
        return new tka(m37116a(2, j, Long.MAX_VALUE));
    }

    /* renamed from: c */
    static bxeu m37120c(long j) {
        return m37116a(1, j, j);
    }

    /* renamed from: c */
    public final long mo18096c() {
        return this.f46221a.f163129c;
    }

    /* renamed from: d */
    public final long mo18097d() {
        return this.f46221a.f163130d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tka) {
            tka tka = (tka) obj;
            return mo26615a() == tka.mo26615a() && mo18096c() == tka.mo18096c() && mo18097d() == tka.mo18097d();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26615a()), Long.valueOf(mo18096c()), Long.valueOf(mo18097d())});
    }

    public final String toString() {
        int a = mo26615a();
        if (a == 1) {
            String num = Integer.toString(mo26615a());
            long c = mo18096c();
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 22);
            sb.append(num);
            sb.append("(");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        } else if (a == 2) {
            String num2 = Integer.toString(mo26615a());
            long c2 = mo18096c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(num2).length() + 22);
            sb2.append(num2);
            sb2.append("(");
            sb2.append(c2);
            sb2.append(")");
            return sb2.toString();
        } else if (a != 3) {
            int a2 = mo26615a();
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("unknown type=");
            sb3.append(a2);
            return sb3.toString();
        } else {
            String num3 = Integer.toString(mo26615a());
            long c3 = mo18096c();
            long d = mo18097d();
            StringBuilder sb4 = new StringBuilder(String.valueOf(num3).length() + 44);
            sb4.append(num3);
            sb4.append("(");
            sb4.append(c3);
            sb4.append(", ");
            sb4.append(d);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* renamed from: b */
    public final boolean mo26616b() {
        int a = bxet.m122640a(this.f46221a.f163128b);
        return a != 0 && a == 2;
    }

    /* renamed from: a */
    public static tka m37117a(long j) {
        return new tka(m37120c(j));
    }

    /* renamed from: a */
    public static tka m37118a(long j, long j2) {
        return new tka(m37116a(3, j, j2));
    }

    /* renamed from: a */
    public final int mo26615a() {
        int a = bxet.m122640a(this.f46221a.f163128b);
        if (a == 0) {
            return 3;
        }
        return a;
    }
}
