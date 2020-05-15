package p000;

import android.content.Context;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.Collections;
import java.util.List;

/* renamed from: bgyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyv {

    /* renamed from: a */
    public final bgye f118134a;

    /* renamed from: b */
    private final rfz f118135b;

    /* renamed from: c */
    private final List f118136c;

    private bgyv(rfz rfz, bgye bgye, List list) {
        this.f118135b = rfz;
        this.f118134a = bgye;
        this.f118136c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static bgyv m100430a(Context context) {
        bgzo.m100459a(context);
        return new bgyv(rfz.m33557a(context), bgye.m100307a(context), bgzo.m100458a(chcs.f188354a.mo6606a().mo85089ay()));
    }

    /* renamed from: b */
    public final int mo63450b(AccountConfig accountConfig, String str) {
        int a = mo63449a(accountConfig, str);
        if (a == 0) {
            return !accountConfig.mo70913h() ? 7 : 0;
        }
        return a;
    }

    /* renamed from: a */
    public final int mo63449a(AccountConfig accountConfig, String str) {
        if (!accountConfig.f150893d) {
            return 3;
        }
        if (str == null) {
            return 4;
        }
        if (!this.f118136c.contains(str) || !this.f118135b.mo24610b(str)) {
            return 5;
        }
        if (str.equals("com.google.android.gms")) {
            if (!this.f118134a.mo63354a().f150915b.f150909a) {
                return 14;
            }
            if (!this.f118134a.mo63354a().f150915b.f150911c) {
                return 13;
            }
        }
        if (accountConfig.mo70915i()) {
            return accountConfig.f150908s == 2 ? 10 : 0;
        }
        return 7;
    }
}
