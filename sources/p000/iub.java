package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: iub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iub extends aaab {

    /* renamed from: a */
    private final irz f21762a;

    /* renamed from: b */
    private final String f21763b;

    /* renamed from: c */
    private final Account f21764c;

    public iub(irz irz, String str, Account account) {
        super(129, "RetrieveDeviceSyncMetadataOperation");
        this.f21762a = irz;
        this.f21763b = str;
        this.f21764c = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        List list = null;
        if (ccfa.m129418b()) {
            iqd iqd = new iqd(context, new ipw(context), new ipq(context));
            Account account = this.f21764c;
            String str = this.f21763b;
            ipv a = iqd.f21545a.mo13238a();
            try {
                List a2 = a.mo13231a(str, account);
                if (a2 == null) {
                    sek sek = iqd.f21546b;
                    String valueOf = String.valueOf(str);
                    sek.mo25416d(valueOf.length() == 0 ? new String("No device metadata packets for key ") : "No device metadata packets for key ".concat(valueOf), new Object[0]);
                } else {
                    List b = a.mo13236b(str, account);
                    if (b == null) {
                        sek sek2 = iqd.f21546b;
                        String valueOf2 = String.valueOf(str);
                        sek2.mo25416d(valueOf2.length() == 0 ? new String("No device feature statuses for key ") : "No device feature statuses for key ".concat(valueOf2), new Object[0]);
                    } else {
                        a.close();
                        list = iqd.mo13257a(str, account, a2, b);
                    }
                }
                a.close();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        this.f21762a.mo13308a(list);
        return;
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21762a.mo13307a(status);
    }
}
