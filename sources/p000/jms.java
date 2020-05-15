package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.proximity.WireMessageParams;

/* renamed from: jms */
final /* synthetic */ class jms implements roo {

    /* renamed from: a */
    private final WireMessageParams f22834a;

    public jms(WireMessageParams wireMessageParams) {
        this.f22834a = wireMessageParams;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        WireMessageParams wireMessageParams = this.f22834a;
        jsv jsv = (jsv) obj;
        int i = jmx.f22842c;
        try {
            ((jsp) jsv.mo25289B()).mo13881a(wireMessageParams);
            ((aucf) obj2).mo50391a((Object) null);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
