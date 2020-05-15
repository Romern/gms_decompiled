package p000;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: tju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tju {

    /* renamed from: a */
    public final bxdj f46219a;

    public tju(bxdj bxdj) {
        sdo.m34959a(bxdj);
        this.f46219a = bxdj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* renamed from: a */
    public static tju m37104a(String str, String str2, String str3) {
        boolean z;
        bxvd da = bxdj.f163036e.mo74144da();
        boolean z2 = !TextUtils.isEmpty(str3);
        boolean[] zArr = {!TextUtils.isEmpty(str), !TextUtils.isEmpty(str2), z2};
        if (!zArr[0]) {
            if (zArr[1]) {
                z = true;
            } else if (!z2) {
                z = false;
            }
            sdo.m34974b(z);
            if (zArr[0]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxdj bxdj = (bxdj) da.f164949b;
                str.getClass();
                bxdj.f163038a |= 1;
                bxdj.f163039b = str;
            }
            if (zArr[1]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxdj bxdj2 = (bxdj) da.f164949b;
                str2.getClass();
                bxdj2.f163038a |= 2;
                bxdj2.f163040c = str2;
            }
            if (zArr[2]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxdj bxdj3 = (bxdj) da.f164949b;
                str3.getClass();
                bxdj3.f163038a |= 4;
                bxdj3.f163041d = str3;
            }
            return new tju((bxdj) da.mo74062i());
        }
        z = true;
        sdo.m34974b(z);
        if (zArr[0]) {
        }
        if (zArr[1]) {
        }
        if (zArr[2]) {
        }
        return new tju((bxdj) da.mo74062i());
    }

    /* renamed from: b */
    public final String mo26605b() {
        if (mo26604a()) {
            return this.f46219a.f163039b;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo26606c() {
        return !TextUtils.isEmpty(this.f46219a.f163040c);
    }

    /* renamed from: d */
    public final String mo26607d() {
        if (mo26606c()) {
            return this.f46219a.f163040c;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo26608e() {
        return !TextUtils.isEmpty(this.f46219a.f163041d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tju) {
            tju tju = (tju) obj;
            return TextUtils.equals(mo26605b(), tju.mo26605b()) && TextUtils.equals(mo26607d(), tju.mo26607d()) && TextUtils.equals(mo26610f(), tju.mo26610f());
        }
    }

    /* renamed from: f */
    public final String mo26610f() {
        if (mo26608e()) {
            return this.f46219a.f163041d;
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo26605b(), mo26607d(), mo26610f()});
    }

    /* renamed from: a */
    public final boolean mo26604a() {
        return !TextUtils.isEmpty(this.f46219a.f163039b);
    }
}
