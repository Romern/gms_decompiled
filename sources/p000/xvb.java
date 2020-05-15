package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;

/* renamed from: xvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvb extends aaab {

    /* renamed from: a */
    private final rnt f53211a;

    /* renamed from: b */
    private final int f53212b;

    /* renamed from: c */
    private final byte[] f53213c;

    /* renamed from: d */
    private final byte[] f53214d;

    public xvb(rnt rnt, int i, byte[] bArr, byte[] bArr2) {
        super(180, "StartCableAuthenticatorOperation");
        this.f53211a = rnt;
        this.f53212b = i;
        this.f53213c = bArr;
        this.f53214d = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Intent a = CableAuthenticatorChimeraService.m23548a(context);
        a.putExtra("cable_feature", this.f53212b);
        a.putExtra("cable_client_info", this.f53213c);
        a.putExtra("cable_session_data", this.f53214d);
        context.startService(a);
        this.f53211a.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53211a.mo11797a(status);
    }
}
