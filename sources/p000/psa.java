package p000;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;

/* renamed from: psa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class psa extends LruCache {

    /* renamed from: a */
    final /* synthetic */ psd f40126a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public psa(psd psd) {
        super(20);
        this.f40126a = psd;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj2;
        MediaQueueItem mediaQueueItem2 = (MediaQueueItem) obj3;
        if (z) {
            this.f40126a.f40134g.add(num);
        }
    }
}
