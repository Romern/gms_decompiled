package p000;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: albb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albb {

    /* renamed from: a */
    private final alca f73245a = new alca();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized Bitmap mo40076a(int i, int i2) {
        LinkedList linkedList = (LinkedList) this.f73245a.mo40105a(i, i2);
        if (linkedList != null) {
            while (!linkedList.isEmpty()) {
                Bitmap bitmap = (Bitmap) ((SoftReference) linkedList.pop()).get();
                if (bitmap != null) {
                    return bitmap;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo40077a(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            LinkedList linkedList = (LinkedList) this.f73245a.mo40105a(width, height);
            if (linkedList == null) {
                linkedList = new LinkedList();
                alca alca = this.f73245a;
                SparseArray sparseArray = (SparseArray) alca.f73385a.get(height);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    alca.f73385a.put(height, sparseArray);
                }
                sparseArray.put(width, linkedList);
            }
            linkedList.add(new SoftReference(bitmap));
        }
    }
}
