package p000;

import android.location.Location;
import android.os.Build;
import java.util.Collections;

/* renamed from: bfqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfqq extends adzy {

    /* renamed from: a */
    final /* synthetic */ bfqs f114905a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfqq(bfqs bfqs, String str, String str2) {
        super(str, str2);
        this.f114905a = bfqs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9927a(Location location) {
        int i = Build.VERSION.SDK_INT;
        if (!"network".equals(location.getProvider())) {
            this.f114905a.mo62156b(Collections.singletonList(location));
        }
    }
}
