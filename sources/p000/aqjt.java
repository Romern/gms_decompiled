package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: aqjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqjt extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f86235a;

    /* renamed from: b */
    final /* synthetic */ Account f86236b;

    /* renamed from: c */
    final /* synthetic */ aucf f86237c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqjt(Context context, Account account, aucf aucf) {
        super(9);
        this.f86235a = context;
        this.f86236b = account;
        this.f86237c = aucf;
    }

    public final void run() {
        try {
            this.f86237c.mo50391a(gik.m13218f(this.f86235a, this.f86236b.name));
        } catch (gid | IOException e) {
            aqjw.f86247a.mo25417e("Error getting account ID", e, new Object[0]);
            this.f86237c.mo50390a(e);
        }
    }
}
