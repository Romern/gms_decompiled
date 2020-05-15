package p000;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;

/* renamed from: dvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvz {

    /* renamed from: a */
    public final bxcw f14238a;

    /* renamed from: b */
    public final int f14239b;

    /* renamed from: c */
    public final doh f14240c;

    public dvz(bxcw bxcw, int i, doh doh) {
        sdo.m34959a(bxcw);
        this.f14238a = bxcw;
        this.f14239b = i;
        this.f14240c = doh;
    }

    /* renamed from: a */
    public static dvz m9584a(ContextManagerClientInfo contextManagerClientInfo, String str) {
        bxvd da = bxcw.f162994e.mo74144da();
        String str2 = contextManagerClientInfo.f30683g;
        if (str2 == null) {
            str2 = contextManagerClientInfo.f30678b;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcw bxcw = (bxcw) da.f164949b;
        str2.getClass();
        int i = bxcw.f162996a | 1;
        bxcw.f162996a = i;
        bxcw.f162997b = str2;
        String str3 = contextManagerClientInfo.f30684h;
        if (str3 == null) {
            str3 = contextManagerClientInfo.f30680d;
        }
        str3.getClass();
        int i2 = i | 2;
        bxcw.f162996a = i2;
        bxcw.f162998c = str3;
        str.getClass();
        bxcw.f162996a = i2 | 4;
        bxcw.f162999d = str;
        bxcw bxcw2 = (bxcw) da.mo74062i();
        int i3 = contextManagerClientInfo.f30685i;
        if (i3 == -1) {
            i3 = contextManagerClientInfo.f30679c;
        }
        return new dvz(bxcw2, i3, contextManagerClientInfo.mo18066a());
    }

    /* renamed from: a */
    public final String mo9738a() {
        return this.f14238a.f162997b;
    }

    /* renamed from: b */
    public final String mo9739b() {
        return this.f14238a.f162998c;
    }

    /* renamed from: c */
    public final String mo9740c() {
        return this.f14238a.f162999d;
    }

    public final boolean equals(Object obj) {
        dvz dvz;
        if (this == obj) {
            return true;
        }
        if (obj instanceof dvz) {
            dvz = (dvz) obj;
        } else if (!(obj instanceof dwa)) {
            return false;
        } else {
            dvz = ((dwa) obj).f14242b;
        }
        return TextUtils.equals(mo9738a(), dvz.mo9738a()) && this.f14240c.equals(dvz.f14240c) && TextUtils.equals(mo9739b(), dvz.mo9739b()) && TextUtils.equals(mo9740c(), dvz.mo9740c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo9738a(), this.f14240c, mo9739b(), mo9740c()});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25395a(mo9738a());
        a.mo25395a(Integer.valueOf(this.f14239b));
        a.mo25395a(this.f14240c);
        a.mo25395a(mo9739b());
        a.mo25395a(mo9740c());
        return a.toString();
    }
}
