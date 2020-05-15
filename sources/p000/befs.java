package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: befs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befs {

    /* renamed from: a */
    public static final befs f111514a = new befs();

    private befs() {
    }

    /* renamed from: a */
    public static final File m94980a(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new begt("Scheme must be 'file'");
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new begt("Did not expect uri to have query");
        } else if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        } else {
            throw new begt("Did not expect uri to have authority");
        }
    }
}
