package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: maw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class maw extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f33370a;

    /* renamed from: b */
    final /* synthetic */ Account f33371b;

    /* renamed from: c */
    final /* synthetic */ aucf f33372c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public maw(Context context, Account account, aucf aucf) {
        super(9);
        this.f33370a = context;
        this.f33371b = account;
        this.f33372c = aucf;
    }

    public final void run() {
        try {
            this.f33372c.mo50391a(gik.m13218f(this.f33370a, this.f33371b.name));
        } catch (gid | IOException e) {
            this.f33372c.mo50391a((Object) null);
        }
    }
}
