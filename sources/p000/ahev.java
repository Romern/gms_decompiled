package p000;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: ahev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahev extends aeaa {

    /* renamed from: a */
    final /* synthetic */ ahfe f67082a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahev(ahfe ahfe, String str) {
        super(str);
        this.f67082a = ahfe;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        int i = ahfe.f67099f;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        int i = ahfe.f67099f;
        ahfe ahfe = this.f67082a;
        ahfe.f67102b = new ahct(ahfe.f67103c, buyd.m120747a(iBinder), this.f67082a.f67101a);
        this.f67082a.f67104d.countDown();
    }
}
