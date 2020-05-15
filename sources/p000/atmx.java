package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/* renamed from: atmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmx {

    /* renamed from: a */
    public static final srn f90520a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final void mo50047a(Context context) {
        List<btpn> a = aska.m74264a(context);
        HashSet<String> hashSet = new HashSet();
        for (btpn btpn : a) {
            bxwc bxwc = btpn.f149869b;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                btpm btpm = (btpm) bxwc.get(i);
                if (!btpm.f149864c.isEmpty()) {
                    hashSet.add(btpm.f149864c);
                }
            }
        }
        hashSet.size();
        HashSet hashSet2 = new HashSet();
        for (String str : hashSet) {
            File a2 = asjo.m74246a(context, str);
            hashSet2.add(a2.toString());
            if (!a2.exists()) {
                try {
                    asmd.m74375a(str, a2, context);
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) f90520a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("atmx", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to download lottie file for url: %s", str);
                }
            }
        }
        asmd.m74374a(asjo.m74245a(context), hashSet2);
    }
}
