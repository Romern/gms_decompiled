package p000;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azce extends LruCache {
    public azce(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap;
        LocalEntityId localEntityId = (LocalEntityId) obj;
        azcf azcf = (azcf) obj2;
        if (azcf == null || (bitmap = azcf.f98968a) == null) {
            return localEntityId.toString().length();
        }
        new Object[1][0] = Integer.valueOf(bitmap.getByteCount());
        return localEntityId.toString().length() + azcf.f98968a.getByteCount();
    }
}
