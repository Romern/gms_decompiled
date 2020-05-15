package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: vap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vap {

    /* renamed from: a */
    final /* synthetic */ Context f48857a;

    /* renamed from: b */
    final /* synthetic */ String f48858b;

    public vap(Context context, String str) {
        this.f48857a = context;
        this.f48858b = str;
    }

    /* renamed from: a */
    public final void mo28172a(boolean z) {
        Account a = voo.m40937a(this.f48857a, this.f48858b);
        if (a != null) {
            if (z) {
                vbg.m39921a(a, this.f48857a);
            }
            vbg.m39922a(this.f48857a, a, z);
        }
    }
}
