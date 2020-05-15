package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: bgzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzd extends soa {

    /* renamed from: a */
    final /* synthetic */ aucf f118151a;

    /* renamed from: b */
    final /* synthetic */ Context f118152b;

    /* renamed from: c */
    final /* synthetic */ Account f118153c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgzd(aucf aucf, Context context, Account account) {
        super(9);
        this.f118151a = aucf;
        this.f118152b = context;
        this.f118153c = account;
    }

    public final void run() {
        try {
            this.f118151a.mo50391a(gik.m13218f(this.f118152b, this.f118153c.name));
        } catch (gid | IOException e) {
            this.f118151a.mo50391a((Object) null);
        }
    }
}
