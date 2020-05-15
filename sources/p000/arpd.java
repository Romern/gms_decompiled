package p000;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: arpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpd implements arom {
    /* renamed from: a */
    public final Fragment mo48708a(int i, Bundle bundle) {
        if (i == 1) {
            arws arws = new arws();
            if (bundle != null) {
                Bundle arguments = arws.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putAll(bundle);
                arws.setArguments(arguments);
            }
            return arws;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unknown fragment state: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
}
