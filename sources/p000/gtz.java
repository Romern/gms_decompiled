package p000;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import java.util.Set;

/* renamed from: gtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtz {

    /* renamed from: a */
    public String f19014a;

    /* renamed from: b */
    public int f19015b;

    /* renamed from: c */
    public byte[] f19016c;

    /* renamed from: d */
    public PendingIntent f19017d;

    /* renamed from: e */
    public DeviceMetaData f19018e;

    /* renamed from: f */
    public final Set f19019f = new C1225nr(5);

    /* renamed from: a */
    public final AuthenticatorTransferInfo mo12219a() {
        int i = this.f19015b;
        if (i == 4) {
            if (this.f19017d == null) {
                throw new IllegalStateException("Status has type CHALLENGE_REQUIRED but no Pending intent specified");
            }
        } else if (i == 3 && this.f19016c == null) {
            throw new IllegalStateException("Status has type IN_PROCESS_SEND_DATA but no transfer bytes specified");
        }
        return new AuthenticatorTransferInfo(new C1225nr(this.f19019f), 1, this.f19014a, this.f19015b, this.f19016c, this.f19017d, this.f19018e);
    }

    /* renamed from: a */
    public final void mo12220a(int i) {
        this.f19015b = i;
        this.f19019f.add(3);
    }

    /* renamed from: a */
    public final void mo12221a(String str) {
        this.f19014a = str;
        this.f19019f.add(2);
    }
}
