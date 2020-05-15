package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.payse.internal.GetSeCardsRequest;
import java.util.concurrent.Callable;

/* renamed from: awfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfp implements Callable {

    /* renamed from: a */
    private final awfq f94274a;

    /* renamed from: b */
    private final Account f94275b;

    /* renamed from: c */
    private final Context f94276c;

    public awfp(Context context, awfq awfq, Account account) {
        this.f94274a = awfq;
        this.f94275b = account;
        this.f94276c = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f94274a.mo65624a(this.f94276c, this.f94275b, new GetSeCardsRequest(this.f94275b)).f81693a;
    }
}
