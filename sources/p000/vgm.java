package p000;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

/* renamed from: vgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgm {
    /* renamed from: a */
    public static uvy m40389a(MetadataBundle metadataBundle) {
        Set c = metadataBundle.mo18274c();
        if (c.size() == 1) {
            return (uvy) c.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
