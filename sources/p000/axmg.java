package p000;

import android.content.Context;
import android.util.Log;
import java.util.Currency;
import java.util.Locale;

/* renamed from: axmg */
final /* synthetic */ class axmg implements bmxj {

    /* renamed from: a */
    static final bmxj f96181a = new axmg();

    private axmg() {
    }

    public final Object apply(Object obj) {
        String string = axmp.m82728a((Context) obj).getString("currencycode", null);
        if (string != null) {
            return string;
        }
        String str = (String) axmc.f96176b.mo58455c();
        if (chlh.m148921b() && bmwb.m108443a("us", str)) {
            return "USD";
        }
        if (chlh.m148921b() && bmwb.m108443a("gb", str)) {
            return "GBP";
        }
        try {
            return Currency.getInstance(Locale.getDefault()).getCurrencyCode();
        } catch (Exception e) {
            String valueOf = String.valueOf(Locale.getDefault());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed getting currency from default locale ");
            sb.append(valueOf);
            Log.e("WalletP2P", sb.toString(), e);
            return "USD";
        }
    }
}
