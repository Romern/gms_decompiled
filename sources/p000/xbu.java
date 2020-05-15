package p000;

import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;

/* renamed from: xbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbu implements aubw {

    /* renamed from: a */
    final /* synthetic */ aucb f51895a;

    public xbu(aucb aucb) {
        this.f51895a = aucb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        KeyInvalidationResult keyInvalidationResult = (KeyInvalidationResult) obj;
        int i = ((KeyInvalidationResult) this.f51895a.mo50386d()).f10540b.f30115i;
        Logger Logger = xbx.f51896c;
        String valueOf = String.valueOf(iov.m15809b(i));
        Logger.mo25412b(valueOf.length() == 0 ? new String("Result status of key invalidation is ") : "Result status of key invalidation is ".concat(valueOf), new Object[0]);
    }
}
