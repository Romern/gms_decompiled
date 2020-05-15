package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: axif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axif {

    /* renamed from: a */
    public final Context f95982a;

    /* renamed from: b */
    public final ExecutorService f95983b = snp.m35702a(9);

    /* renamed from: c */
    public final int f95984c;

    public axif(Context context, int i) {
        this.f95982a = context;
        this.f95984c = i;
    }

    /* renamed from: a */
    public final void mo53159a() {
        this.f95983b.shutdown();
    }

    /* renamed from: a */
    public final void mo53160a(int i, long j, String str, boolean z, Account account, axls axls, axls axls2) {
        this.f95983b.execute(new axig(this.f95982a, i, j, str, z, this.f95984c, account, axls, axls2));
    }
}
