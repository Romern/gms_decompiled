package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import java.util.concurrent.TimeUnit;

/* renamed from: atxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxx {
    /* renamed from: a */
    public static void m76527a(Context context, boolean z) {
        m76532e(context).edit().putBoolean("device_had_token", z).apply();
    }

    /* renamed from: b */
    public static boolean m76529b(Context context) {
        if (!asjw.m74256a(context) || spn.m35859a()) {
            return true;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        return r3;
     */
    /* renamed from: c */
    public static synchronized boolean m76530c(Context context) {
        synchronized (atxx.class) {
            if (m76532e(context).contains("device_had_token")) {
                boolean d = m76531d(context);
                return d;
            }
            asmj asmj = (asmj) rjx.m33696b(context).mo24769w().mo9456a(15, TimeUnit.SECONDS);
            boolean z = false;
            if (asmj.mo7183bo().mo17710c()) {
                if (asmj.mo49241b().f108369a.length > 0) {
                    z = true;
                }
                m76527a(context, z);
            }
        }
    }

    /* renamed from: d */
    public static boolean m76531d(Context context) {
        return m76532e(context).getBoolean("device_had_token", false);
    }

    /* renamed from: e */
    public static SharedPreferences m76532e(Context context) {
        return context.getSharedPreferences("com.google.android.gms.tapandpay.settings.TapAndPaySettingsStorage", 0);
    }

    /* renamed from: f */
    public static CardEmulation m76533f(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            try {
                return CardEmulation.getInstance(defaultAdapter);
            } catch (UnsupportedOperationException e) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public static int m76534g(Context context) {
        if (!asjw.m74256a(context)) {
            return 5;
        }
        if (spn.m35859a()) {
            return 2;
        }
        NfcManager nfcManager = (NfcManager) context.getSystemService("nfc");
        if (nfcManager == null) {
            return 6;
        }
        NfcAdapter defaultAdapter = nfcManager.getDefaultAdapter();
        if (defaultAdapter == null) {
            return 7;
        }
        try {
            CardEmulation instance = CardEmulation.getInstance(defaultAdapter);
            if (instance == null) {
                return 9;
            }
            try {
                if (!instance.isDefaultServiceForCategory(new ComponentName(context, "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment")) {
                    return 4;
                }
                return 2;
            } catch (NullPointerException e) {
                return 7;
            }
        } catch (UnsupportedOperationException e2) {
            return 8;
        }
    }

    /* renamed from: a */
    public static boolean m76528a(Context context) {
        boolean z = true;
        if (asjw.m74256a(context) && !spn.m35859a()) {
            CardEmulation f = m76533f(context);
            z = false;
            if (f != null) {
                try {
                    return f.isDefaultServiceForCategory(new ComponentName(context, "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment");
                } catch (NullPointerException e) {
                }
            }
        }
        return z;
    }
}
