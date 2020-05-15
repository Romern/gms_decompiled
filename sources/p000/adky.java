package p000;

import android.net.Uri;
import android.util.Base64;
import java.nio.ByteBuffer;

/* renamed from: adky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adky {

    /* renamed from: a */
    public static final Uri f62096a = Uri.parse("content://instantapp-dev-manager");

    /* renamed from: a */
    public static Uri m50780a(int[] iArr) {
        ByteBuffer allocate = ByteBuffer.allocate(iArr.length * 4);
        allocate.asIntBuffer().put(iArr);
        return f62096a.buildUpon().appendPath("resolveHashPrefixPhaseOne").appendQueryParameter("hashPrefixes", Base64.encodeToString(allocate.array(), 11)).build();
    }
}
