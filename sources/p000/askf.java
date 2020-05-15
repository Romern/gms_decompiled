package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.Arrays;

/* renamed from: askf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askf {

    /* renamed from: a */
    public final String f89123a;

    /* renamed from: b */
    public final String f89124b;

    /* renamed from: c */
    public final String f89125c;

    /* renamed from: d */
    public final Context f89126d;

    /* renamed from: e */
    public final String f89127e;

    public askf(AccountInfo accountInfo, String str, Context context) {
        this(accountInfo.f108325a, accountInfo.f108326b, str, context, null);
    }

    /* renamed from: a */
    public final AccountInfo mo49209a() {
        return new AccountInfo(this.f89123a, this.f89124b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof askf) {
            askf askf = (askf) obj;
            return sdg.m34949a(this.f89123a, askf.f89123a) && sdg.m34949a(this.f89124b, askf.f89124b) && sdg.m34949a(this.f89125c, askf.f89125c) && sdg.m34949a(this.f89126d, askf.f89126d) && sdg.m34949a(this.f89127e, askf.f89127e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f89123a, this.f89124b, this.f89125c, this.f89126d, this.f89127e});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("accountId", this.f89123a);
        a.mo25396a("accountName", this.f89124b);
        a.mo25396a("environment", this.f89125c);
        a.mo25396a("context", this.f89126d);
        a.mo25396a("referer", this.f89127e);
        return a.toString();
    }

    public askf(AccountInfo accountInfo, String str, Context context, String str2) {
        this(accountInfo.f108325a, accountInfo.f108326b, str, context, str2);
    }

    public askf(String str, String str2, String str3, Context context) {
        this(str, str2, str3, context, null);
    }

    public askf(String str, String str2, String str3, Context context, String str4) {
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        sdo.m34959a((Object) str3);
        sdo.m34959a(context);
        this.f89123a = str;
        this.f89124b = str2;
        this.f89125c = str3;
        this.f89126d = context;
        this.f89127e = str4;
    }
}
