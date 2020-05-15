package p000;

import android.util.Log;
import android.util.LruCache;
import java.io.IOException;

/* renamed from: rcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcp extends LruCache {

    /* renamed from: a */
    final /* synthetic */ rde f42649a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rcp(rde rde, int i) {
        super(i);
        this.f42649a = rde;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        rcx rcx = (rcx) obj2;
        rcx rcx2 = (rcx) obj3;
        try {
            rcx.f42680d.close();
            if (rcx.f42682f < cddx.m132738b()) {
                rde rde = this.f42649a;
                int i = rde.f42700a;
                rde.f42709g.put(num, new rda(rcx.f42678b.getName(), rcx.f42682f));
            }
        } catch (IOException e) {
            Log.e("FlatFileLogStore", "Error closing evicted outputstream", e);
        }
    }
}
