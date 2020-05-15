package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.util.Log;

/* renamed from: biev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biev extends aeaa {

    /* renamed from: a */
    final /* synthetic */ biew f120413a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public biev(biew biew) {
        super("places");
        this.f120413a = biew;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f120413a.f120415c = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof bido) {
            this.f120413a.f120415c = (bidp) ((bido) iBinder).f120315a.get();
            this.f120413a.f120414b.countDown();
        } else if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "onServiceConnected returned unexpected binder object. Most likely cause is multiple instances of the com.google.android.gms.persistent process");
        }
    }
}
