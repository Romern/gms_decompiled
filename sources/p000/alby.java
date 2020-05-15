package p000;

import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: alby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alby implements albx {

    /* renamed from: a */
    final /* synthetic */ String f73373a;

    public alby(String str) {
        this.f73373a = str;
    }

    /* renamed from: a */
    public final InputStream mo40054a() {
        try {
            return new FileInputStream(this.f73373a);
        } catch (FileNotFoundException e) {
            String str = this.f73373a;
            Log.e("PanoMetadata", str.length() == 0 ? new String("Could not read file: ") : "Could not read file: ".concat(str), e);
            return null;
        }
    }
}
