package p000;

import android.content.Context;

/* renamed from: ahva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahva extends buqn {

    /* renamed from: a */
    final /* synthetic */ Context f68134a;

    /* renamed from: b */
    final /* synthetic */ aacn f68135b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahva(String str, Context context, aacn aacn) {
        super(str);
        this.f68134a = context;
        this.f68135b = aacn;
    }

    public final void run() {
        try {
            this.f68134a.unregisterReceiver(this.f68135b);
        } catch (IllegalArgumentException e) {
            srn srn = ahsd.f67925a;
        }
    }
}
