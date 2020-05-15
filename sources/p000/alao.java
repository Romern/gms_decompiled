package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: alao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alao implements albx {

    /* renamed from: a */
    private static final String f73226a = alao.class.getSimpleName();

    /* renamed from: b */
    private final ContentResolver f73227b;

    /* renamed from: c */
    private final Uri f73228c;

    public alao(ContentResolver contentResolver, Uri uri) {
        this.f73227b = contentResolver;
        this.f73228c = uri;
    }

    /* renamed from: a */
    public final InputStream mo40054a() {
        try {
            return this.f73227b.openInputStream(this.f73228c);
        } catch (FileNotFoundException e) {
            String str = f73226a;
            String valueOf = String.valueOf(this.f73228c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("unable to open ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
            return null;
        }
    }
}
