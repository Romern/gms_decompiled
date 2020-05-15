package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.Locale;

/* renamed from: hnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hnb implements hkz {

    /* renamed from: a */
    private final Context f20055a;

    public hnb(Context context) {
        this.f20055a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final bqgg mo12600a(acyr acyr, HintRequest hintRequest) {
        if (!hintRequest.f10116d) {
            return bqga.m112775a((Object) bngx.m109376e());
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f20055a.getSystemService("phone");
        String str = null;
        if (telephonyManager != null) {
            String line1Number = telephonyManager.getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    simCountryIso = Locale.getDefault().getCountry();
                }
                str = hec.m14257a(line1Number, simCountryIso);
            }
        }
        if (str != null) {
            return bqga.m112775a((Object) bngx.m109356a(new gvl(str).mo12267a()));
        }
        return bqga.m112775a((Object) bngx.m109376e());
    }
}
