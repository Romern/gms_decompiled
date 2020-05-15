package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* renamed from: jtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtq {

    /* renamed from: a */
    private final rtj f23196a;

    public jtq(Context context) {
        this.f23196a = new rtj(context.getApplicationContext(), "com.google.android.gms.auth.proximity.BeaconSeedsV2", true);
    }

    /* renamed from: b */
    private static String m17304b(long j) {
        StringBuilder sb = new StringBuilder(28);
        sb.append("interval");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo14079a(List list) {
        SharedPreferences.Editor edit = this.f23196a.edit();
        edit.clear();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jto jto = (jto) list.get(i);
                edit.putString(m17304b(jto.f23189b), sqd.m35972d(jto.f23188a.getKey()));
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public final byte[] mo14080a(long j) {
        return sqd.m35971c(this.f23196a.getString(m17304b(j), null));
    }
}
