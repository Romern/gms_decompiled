package p000;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.debug.DebugPokeChimeraService;

/* renamed from: ajav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajav extends aeaa {

    /* renamed from: a */
    final /* synthetic */ DebugPokeChimeraService f70285a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajav(DebugPokeChimeraService debugPokeChimeraService, String str) {
        super(str);
        this.f70285a = debugPokeChimeraService;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        srn srn = ahfq.f67120a;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        srn srn = ahfq.f67120a;
        this.f70285a.f80707a.countDown();
    }
}
