package p000;

import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: busl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busl {
    /* renamed from: a */
    public static String m120387a(TrueWirelessHeadset trueWirelessHeadset, bmzi bmzi, bmzi bmzi2, bmzi bmzi3) {
        StringBuilder sb = new StringBuilder();
        if (TrueWirelessHeadset.m94499a(trueWirelessHeadset.mo60347b().mo60341b())) {
            sb.append((String) bmzi.mo6606a());
            sb.append(' ');
        }
        if (TrueWirelessHeadset.m94499a(trueWirelessHeadset.mo60349d().mo60341b())) {
            sb.append((String) bmzi2.mo6606a());
            sb.append(' ');
        }
        if (TrueWirelessHeadset.m94499a(trueWirelessHeadset.mo60348c().mo60341b())) {
            sb.append((String) bmzi3.mo6606a());
        }
        return sb.toString();
    }
}
