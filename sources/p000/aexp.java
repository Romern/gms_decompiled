package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: aexp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexp {
    /* renamed from: a */
    public static bzmf m52655a(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String valueOf = String.valueOf(str);
        String string = defaultSharedPreferences.getString(valueOf.length() == 0 ? new String("zookie:") : "zookie:".concat(valueOf), null);
        if (string == null) {
            return bzmf.f170609b;
        }
        bxvd da = bzmf.f170609b.mo74144da();
        bxvd da2 = bzmq.f170630f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzmq bzmq = (bzmq) da2.f164949b;
        bzmq.f170635d = 1;
        int i = bzmq.f170632a | 4;
        bzmq.f170632a = i;
        string.getClass();
        bzmq.f170632a = i | 2;
        bzmq.f170634c = string;
        bzmq bzmq2 = (bzmq) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzmf bzmf = (bzmf) da.f164949b;
        bzmq2.getClass();
        if (!bzmf.f170611a.mo73666a()) {
            bzmf.f170611a = bxvk.m124021a(bzmf.f170611a);
        }
        bzmf.f170611a.add(bzmq2);
        return (bzmf) da.mo74062i();
    }

    /* renamed from: a */
    public static void m52656a(Context context, String str, bzmb bzmb) {
        if (bzmb != null && (bzmb.f170602a & 1) != 0) {
            bzmq bzmq = bzmb.f170603b;
            if (bzmq == null) {
                bzmq = bzmq.f170630f;
            }
            if (!bzmq.f170634c.isEmpty()) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                String valueOf = String.valueOf(str);
                String str2 = valueOf.length() == 0 ? new String("zookie:") : "zookie:".concat(valueOf);
                bzmq bzmq2 = bzmb.f170603b;
                if (bzmq2 == null) {
                    bzmq2 = bzmq.f170630f;
                }
                edit.putString(str2, bzmq2.f170634c);
                edit.commit();
            }
        }
    }
}
