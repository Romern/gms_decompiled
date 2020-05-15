package p000;

import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;

/* renamed from: guu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class guu extends gus {

    /* renamed from: d */
    public final int f19046d;

    public guu(int i, guk guk, String str, int i2) {
        super(i, guk, str);
        this.f19046d = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AuthenticatorTransferInfo mo12250a() {
        int i;
        try {
            int i2 = this.f19046d;
            if (i2 == 1) {
                i = 5;
            } else if (i2 == 2) {
                i = 6;
            } else if (i2 == 3) {
                i = 7;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Invalid completion status:");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            gtz gtz = new gtz();
            gtz.mo12221a(this.f19045c);
            gtz.mo12220a(i);
            return gtz.mo12219a();
        } catch (IllegalArgumentException e) {
            mo6503a(new Status(20502));
            return null;
        }
    }
}
