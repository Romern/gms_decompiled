package p000;

/* renamed from: aibw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aibw extends buqn {

    /* renamed from: a */
    final /* synthetic */ aics f68642a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibw(aics aics, String str) {
        super(str);
        this.f68642a = aics;
    }

    public final void run() {
        for (ahyz ahyz : this.f68642a.f68705b.mo37050d()) {
            if (ahyz.f68440o) {
                this.f68642a.mo37400a(ahyz, "android.bluetooth.device.action.ACL_DISCONNECTED");
            }
        }
    }
}
