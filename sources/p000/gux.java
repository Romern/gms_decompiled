package p000;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;

/* renamed from: gux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gux extends gus {

    /* renamed from: d */
    public final PendingIntent f19048d;

    public gux(int i, guk guk, String str, PendingIntent pendingIntent) {
        super(i, guk, str);
        this.f19048d = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AuthenticatorTransferInfo mo12250a() {
        gtz gtz = new gtz();
        gtz.mo12221a(this.f19045c);
        gtz.mo12220a(4);
        gtz.f19017d = this.f19048d;
        gtz.f19019f.add(5);
        return gtz.mo12219a();
    }
}
