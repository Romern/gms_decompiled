package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import java.util.List;

/* renamed from: bjuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjuq {

    /* renamed from: d */
    private static final List f123361d = bngx.m109357a((Object) 15000, (Object) 15001);

    /* renamed from: a */
    protected final Context f123362a;

    /* renamed from: b */
    protected final bjux f123363b;

    /* renamed from: c */
    protected final bjux f123364c = new bjus(this.f123363b);

    public bjuq(Context context, rjx rjx, bjyy bjyy) {
        this.f123362a = context;
        this.f123363b = new bjux(rjx);
    }

    /* renamed from: a */
    public final asmk mo65545a(Object obj, RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest, int i, String str) {
        asmk a;
        boolean z;
        String str2;
        String str3;
        String str4;
        RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest2 = retrieveInAppPaymentCredentialRequest;
        int i2 = i;
        if (mo52692b(obj)) {
            int i3 = bjvd.m104685a().get(1) + 5;
            if (i2 == 2) {
                str4 = "370295136149943";
                str3 = "JnPYbs6FkC1tiVLREAABoAAAkgA=";
                str2 = null;
            } else if (i2 != 4) {
                str4 = "5204240250197840";
                str3 = "ALnt+yWSJdXBACMLLWMNGgADFA==";
                str2 = null;
            } else {
                str3 = "AgAAAAAABk4DWZ4C28yUQAAAAAA=";
                str2 = "07";
                str4 = "4895370012003478";
            }
            return new bjup(new RetrieveInAppPaymentCredentialResponse(str4, Base64.decode(str3, 2), 12, i3, str2));
        }
        int i4 = 0;
        do {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a = mo52690a(obj).mo65553a(retrieveInAppPaymentCredentialRequest2);
            mo52691a(2, retrieveInAppPaymentCredentialRequest2.f108420a, str, elapsedRealtime, a, i, obj);
            i4++;
            int intValue = ((Integer) awie.f94409e.mo58455c()).intValue() + 1;
            z = !a.mo7183bo().mo17710c() && !f123361d.contains(Integer.valueOf(a.mo7183bo().f30115i));
            if (i4 >= intValue) {
                break;
            }
        } while (z);
        return a;
    }

    /* renamed from: b */
    public final rjr mo65548b(Object obj, Account account, String str) {
        String str2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        rjr a = mo52690a(obj).mo65554a();
        if (account != null) {
            str2 = account.name;
        } else {
            str2 = null;
        }
        mo52691a(5, str2, str, elapsedRealtime, a, 0, obj);
        return a;
    }

    /* renamed from: c */
    public final asmi mo65549c(Object obj, Account account, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        asmi a = mo52690a(obj).mo65552a(account.name);
        mo52691a(3, account.name, str, elapsedRealtime, a, 0, obj);
        return a;
    }

    /* renamed from: d */
    public final void mo65550d(Object obj, Account account, String str) {
        String str2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Status b = mo52690a(obj).mo65556b();
        if (account != null) {
            str2 = account.name;
        } else {
            str2 = null;
        }
        mo52691a(6, str2, str, elapsedRealtime, b, 0, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo52692b(Object obj) {
        throw new IllegalStateException("useTestModeCredentials should be overridden by child class.");
    }

    /* renamed from: a */
    public bjux mo52690a(Object obj) {
        throw new IllegalStateException("getCaller should be overridden by child class.");
    }

    /* renamed from: a */
    public final Status mo65546a(Object obj, Account account, String str) {
        String str2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Status c = mo52690a(obj).mo65557c();
        if (account != null) {
            str2 = account.name;
        } else {
            str2 = null;
        }
        mo52691a(7, str2, str, elapsedRealtime, c, 0, obj);
        return c;
    }

    /* renamed from: a */
    public final rjr mo65547a(Object obj, Account account, String str, String str2) {
        String str3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (account != null) {
            str3 = account.name;
        } else {
            str3 = null;
        }
        rjr a = mo52690a(obj).mo65555a(str3, str2);
        mo52691a(1, str3, str, elapsedRealtime, a, 0, obj);
        return a;
    }

    /* renamed from: a */
    public void mo52691a(int i, String str, String str2, long j, rkk rkk, int i2, Object obj) {
        throw new UnsupportedOperationException("logResult should be implemented by child class.");
    }
}
