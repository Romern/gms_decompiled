package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: ige */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ige {

    /* renamed from: b */
    private static final sek f20912b = new sek("AuthTokenProvider");

    /* renamed from: a */
    private final Context f20913a;

    public ige(Context context) {
        this.f20913a = context;
    }

    /* renamed from: a */
    public final String mo12989a(Account account, int i) {
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < i2) {
            f20912b.mo25412b("getting auth token. Attempt %d", Integer.valueOf(i3));
            try {
                Context context = this.f20913a;
                String valueOf = String.valueOf(igi.m15411b());
                String a = gie.m13187a(context, account, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
                f20912b.mo25414c("successfully got auth token", new Object[0]);
                return a;
            } catch (IOException e) {
                f20912b.mo25415d("Retryable error when getting auth token", e, new Object[0]);
                i3++;
            }
        }
        sek sek = f20912b;
        StringBuilder sb = new StringBuilder(59);
        sb.append("Failed to retrieve an auth token after ");
        sb.append(i);
        sb.append(" attempts");
        sek.mo25416d(sb.toString(), new Object[0]);
        return null;
    }
}
