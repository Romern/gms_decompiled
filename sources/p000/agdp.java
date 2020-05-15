package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Build;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: agdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agdp extends agjv {

    /* renamed from: a */
    public Boolean f65318a;

    /* renamed from: b */
    public Boolean f65319b;

    /* renamed from: c */
    public long f65320c;

    /* renamed from: d */
    private long f65321d;

    /* renamed from: e */
    private String f65322e;

    /* renamed from: f */
    private AccountManager f65323f;

    public agdp(agje agje) {
        super(agje);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35371a() {
        Calendar instance = Calendar.getInstance();
        this.f65321d = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f65322e = sb.toString();
        return false;
    }

    /* renamed from: b */
    public final String mo35372b() {
        mo35544k();
        return Build.MODEL;
    }

    /* renamed from: c */
    public final String mo35373c() {
        mo35544k();
        return Build.VERSION.RELEASE;
    }

    /* renamed from: d */
    public final long mo35374d() {
        mo35544k();
        return this.f65321d;
    }

    /* renamed from: e */
    public final String mo35375e() {
        mo35544k();
        return this.f65322e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo35376f() {
        mo35241h();
        long a = mo35534A().mo20505a();
        if (a - this.f65320c > 86400000) {
            this.f65319b = null;
        }
        Boolean bool = this.f65319b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C1133kh.m17835a(mo35542z(), "android.permission.GET_ACCOUNTS") != 0) {
            mo35497E().f65568g.mo35435a("Permission error checking for dasher/unicorn accounts");
            this.f65320c = a;
            this.f65319b = false;
            return false;
        }
        if (this.f65323f == null) {
            this.f65323f = AccountManager.get(mo35542z());
        }
        try {
            Account[] result = this.f65323f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            if (result != null) {
                if (result.length > 0) {
                    this.f65319b = true;
                    this.f65320c = a;
                    return true;
                }
            }
            Account[] result2 = this.f65323f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null) {
                if (result2.length > 0) {
                    this.f65319b = true;
                    this.f65320c = a;
                    return true;
                }
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            mo35497E().f65565d.mo35436a("Exception checking account types", e);
        }
        this.f65320c = a;
        this.f65319b = false;
        return false;
    }
}
