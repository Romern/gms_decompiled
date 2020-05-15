package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: bhcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcc {
    /* renamed from: a */
    public static final int m100622a(Context context) {
        int i = 2;
        int i2 = 0;
        if (cevw.m138328m()) {
            rjx a = aeqc.m52384a(context);
            Account[] accountArr = bfkd.m97106a(context).f114281b;
            int length = accountArr.length;
            while (i2 < length) {
                try {
                    if (((ReportingState) aucu.m76782a(a.mo24736c(accountArr[i2]))).f79600a) {
                        return 2;
                    }
                    i2++;
                } catch (InterruptedException | ExecutionException e) {
                }
            }
            return 1;
        }
        rjy rjy = new rjy(context);
        rjy.mo24779a(aeqc.f63620a);
        rkb b = rjy.mo24784b();
        b.mo24785a(1500, TimeUnit.MILLISECONDS);
        if (!b.mo24805i()) {
            return 0;
        }
        Account[] accountArr2 = bfkd.m97106a(context).f114281b;
        int length2 = accountArr2.length;
        while (true) {
            if (i2 >= length2) {
                i = 1;
                break;
            }
            aeqo aeqo = (aeqo) b.mo24787a((rle) new aeqb(b, accountArr2[i2])).mo9456a(1500, TimeUnit.MILLISECONDS);
            if (aeqo.f63633a.mo17710c()) {
                Status status = aeqo.f63633a;
                if (status.f30115i == 0) {
                    if (aepw.m52375a(aeqo.f63634b.mo43730a())) {
                        break;
                    }
                } else {
                    String valueOf = String.valueOf(status);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                    sb.append("Illegal to call this method when status is failure: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            i2++;
        }
        b.mo24803g();
        return i;
    }
}
