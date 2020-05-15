package p000;

import android.os.RemoteException;

/* renamed from: ajam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajam extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f70255a;

    /* renamed from: b */
    final /* synthetic */ ajap f70256b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajam(ajap ajap, String str, String str2) {
        super(str);
        this.f70256b = ajap;
        this.f70255a = str2;
    }

    public final void run() {
        ajck ajck = (ajck) this.f70256b.f70261a.mo38408c(this.f70255a);
        if (ajck != null) {
            try {
                srn srn = ahfq.f67120a;
                ajck.mo38489a();
            } catch (RemoteException e) {
            }
            this.f70256b.f70261a.mo38407b(this.f70255a);
            this.f70256b.f70262b.remove(this.f70255a);
        }
        this.f70256b.mo38398a();
    }
}
