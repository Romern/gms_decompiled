package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import java.util.Map;

/* renamed from: aaqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaqz extends aara {

    /* renamed from: a */
    final /* synthetic */ Messenger f28965a;

    /* renamed from: b */
    final /* synthetic */ int f28966b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaqz(int i, aamh aamh, Bundle bundle, Map map, Messenger messenger, int i2) {
        super(i, aamh, bundle, map);
        this.f28965a = messenger;
        this.f28966b = i2;
    }

    /* renamed from: a */
    public final void mo17198a(Context context, Bundle bundle) {
        Intent a = mo17200a(bundle);
        Messenger messenger = this.f28965a;
        if (messenger == null || !m21848a(messenger, a)) {
            int i = this.f28966b;
            if (i == 0 || i == aajg.m21344d()) {
                context.sendOrderedBroadcast(a, null);
            } else {
                aajg.m21336a(context, i, a, null, null, null);
            }
        }
    }
}
