package p000;

import android.content.ComponentName;
import android.content.SyncResult;
import android.os.IBinder;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: vcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vcb extends aeaa {

    /* renamed from: a */
    final /* synthetic */ String f49003a;

    /* renamed from: b */
    final /* synthetic */ int f49004b;

    /* renamed from: c */
    final /* synthetic */ List f49005c;

    /* renamed from: d */
    final /* synthetic */ vcg f49006d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vcb(vcg vcg, String str, String str2, int i, List list) {
        super(str);
        this.f49006d = vcg;
        this.f49003a = str2;
        this.f49004b = i;
        this.f49005c = list;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f49006d.mo28220a(this.f49003a, 2, null);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        try {
            ((soc) this.f49006d.f49017c).submit(new vca(this, (vbm) iBinder, this));
        } catch (RejectedExecutionException e) {
            this.f49006d.mo28223a(this.f49003a, 0, 2, (SyncResult) null);
        } catch (RuntimeException e2) {
            throw new AssertionError(e2);
        }
    }
}
