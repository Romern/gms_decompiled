package p000;

import android.content.ComponentName;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import com.google.android.chimera.Activity;

/* renamed from: asuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asuw {
    /* renamed from: a */
    public static final void m74877a(Activity activity) {
        NfcAdapter defaultAdapter;
        if (asjw.m74256a(activity) && (defaultAdapter = NfcAdapter.getDefaultAdapter(activity)) != null) {
            CardEmulation instance = CardEmulation.getInstance(defaultAdapter);
            ComponentName componentName = new ComponentName(activity, "com.google.android.gms.tapandpay.hce.service.TpHceService");
            if (m74878a(instance, componentName)) {
                instance.setPreferredService(activity.getContainerActivity(), componentName);
            }
        }
    }

    /* renamed from: b */
    public static final void m74879b(Activity activity) {
        NfcAdapter defaultAdapter;
        if (asjw.m74256a(activity) && (defaultAdapter = NfcAdapter.getDefaultAdapter(activity)) != null) {
            CardEmulation instance = CardEmulation.getInstance(defaultAdapter);
            if (m74878a(instance, new ComponentName(activity, "com.google.android.gms.tapandpay.hce.service.TpHceService"))) {
                instance.unsetPreferredService(activity.getContainerActivity());
            }
        }
    }

    /* renamed from: a */
    private static final boolean m74878a(CardEmulation cardEmulation, ComponentName componentName) {
        return !cardEmulation.isDefaultServiceForCategory(componentName, "payment") && cardEmulation.categoryAllowsForegroundPreference("payment");
    }
}
