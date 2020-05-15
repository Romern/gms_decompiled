package p000;

import android.os.Bundle;
import java.io.IOException;

/* renamed from: abos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abos extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public abos(Bundle bundle) {
        super(r3.length() == 0 ? new String("Blocked by rule: ") : "Blocked by rule: ".concat(r3));
        String valueOf = String.valueOf(bundle.getString("name"));
    }
}
