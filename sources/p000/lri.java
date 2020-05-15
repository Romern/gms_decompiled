package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: lri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class lri implements rjh, rjj {

    /* renamed from: a */
    public final String f26634a;

    /* renamed from: b */
    public final int f26635b;

    /* renamed from: c */
    public final String f26636c;

    /* renamed from: d */
    public final String f26637d;

    /* renamed from: e */
    public final int f26638e;

    /* renamed from: f */
    public final Account f26639f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public lri(String str, int i, String str2, String str3, int i2, Account account) {
        sdo.checkIfNull((Object) str, (Object) "moduleId must not be null");
        this.f26634a = str;
        this.f26635b = i;
        this.f26636c = str2;
        this.f26637d = str3;
        this.f26638e = i2;
        this.f26639f = account;
    }

    /* renamed from: a */
    public static lri m19582a(String str, Account account) {
        sdo.m34977c(str);
        return new lri(str, 1, null, null, -1, account);
    }

    /* renamed from: b */
    public static lri m19583b(String str, Account account) {
        sdo.m34977c(str);
        return new lri(str, 0, null, null, -1, account);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lri lri = (lri) obj;
            return this.f26635b == lri.f26635b && this.f26638e == lri.f26638e && sdg.m34949a(this.f26634a, lri.f26634a) && sdg.m34949a(this.f26636c, lri.f26636c) && sdg.m34949a(this.f26637d, lri.f26637d) && sdg.m34949a(this.f26639f, lri.f26639f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26634a, Integer.valueOf(this.f26635b), this.f26636c, this.f26637d, Integer.valueOf(this.f26638e), this.f26639f});
    }
}
