package p000;

import android.os.RemoteException;

/* renamed from: ajan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajan extends buqn {

    /* renamed from: a */
    final /* synthetic */ ajao f70257a;

    /* renamed from: b */
    final /* synthetic */ ajap f70258b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajan(ajap ajap, String str, ajao ajao) {
        super(str);
        this.f70258b = ajap;
        this.f70257a = ajao;
    }

    public final void run() {
        ajco ajco = (ajco) this.f70258b.f70263c.mo38408c(this.f70257a);
        if (ajco != null) {
            try {
                srn srn = ahfq.f67120a;
                ajco.mo38491a();
            } catch (RemoteException e) {
            }
            this.f70258b.f70263c.mo38407b(this.f70257a);
            this.f70258b.f70264d.remove(this.f70257a);
        }
        this.f70258b.mo38398a();
    }
}
