package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: auhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhb extends aaab {

    /* renamed from: a */
    private final rnt f91803a;

    /* renamed from: b */
    private final byte[] f91804b;

    public auhb(rnt rnt, byte[] bArr) {
        super(226, "AddAdrRecord");
        this.f91803a = rnt;
        this.f91804b = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            auez auez = (auez) GeneratedMessageLite.m124016a(auez.f91620d, this.f91804b, bxus.m123743b());
            bqga.m112781a(auhp.m77075a(context).mo60777a(new augz(auez), snp.m35704b(10)), new auha(this), bqfb.INSTANCE);
        } catch (bxwf e) {
            throw new aaaj(39000, null, null, e);
        }
    }

    /* renamed from: b */
    public final void mo50521b(Status status) {
        try {
            this.f91803a.mo11797a(status);
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f91803a.mo11797a(status);
    }
}
