package p000;

import android.graphics.Bitmap;
import com.android.volley.Response;

/* renamed from: bway */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bway extends C1231nx {
    public bway(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo15551b(Object obj, Object obj2) {
        String str = (String) obj;
        Object obj3 = ((Response) obj2).result;
        if (obj3 instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj3;
            return bitmap.getRowBytes() * bitmap.getHeight();
        } else if (obj3 instanceof String) {
            return ((String) obj3).getBytes().length;
        } else {
            if (obj3 instanceof byte[]) {
                return ((byte[]) obj3).length;
            }
            String valueOf = String.valueOf(obj3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("LruCache does not have a sizeOf implementation for: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }
}
