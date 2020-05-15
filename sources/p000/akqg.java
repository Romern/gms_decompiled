package p000;

import android.hardware.Camera;
import java.util.Comparator;

/* renamed from: akqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqg implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        int i = size2.height - size.height;
        return i == 0 ? size.width - size2.width : i;
    }
}
