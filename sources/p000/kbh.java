package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: kbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kbh implements kbe {

    /* renamed from: a */
    public static final srn f23691a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final SharedPreferences f23692b;

    /* renamed from: c */
    private final Account f23693c;

    /* renamed from: d */
    private final kfe f23694d;

    public kbh(SharedPreferences sharedPreferences, kfe kfe, Account account) {
        this.f23692b = sharedPreferences;
        this.f23694d = kfe;
        this.f23693c = account;
    }

    /* renamed from: d */
    private final bqgg m17588d() {
        return bqdx.m112673a(this.f23694d.mo14442a((Bundle) null), new kbf(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bmxv mo14344a() {
        return bmxv.m108566b(this.f23693c);
    }

    /* renamed from: b */
    public final bqgg mo14345b() {
        long j = this.f23692b.getLong("billing_customer_number", 0);
        if (j == 0) {
            return m17588d();
        }
        m17588d();
        return bqga.m112775a(bmxv.m108566b(Long.valueOf(j)));
    }

    /* renamed from: c */
    public final bqgg mo14346c() {
        return bqdx.m112673a(this.f23694d.mo14442a((Bundle) null), new kbg(), bqfb.INSTANCE);
    }
}
