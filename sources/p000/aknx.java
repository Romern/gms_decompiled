package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: aknx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknx {

    /* renamed from: a */
    private static final srn f72333a = srn.m36127a(sgj.GUNS);

    /* renamed from: a */
    public static boolean m60108a(Context context, blcp blcp) {
        Intent intent;
        if (!akoc.m60119a(blcp)) {
            ((bnsl) f72333a.mo68387b()).mo68420a("IntentPayload is not valid. %s", blcp);
            intent = null;
        } else {
            intent = new Intent().setClassName(context.getApplicationContext(), blcp.f125960b).setAction(blcp.f125961c);
            bxwc bxwc = blcp.f125963e;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                blcr blcr = (blcr) bxwc.get(i);
                if (!TextUtils.isEmpty(blcr.f125971a)) {
                    intent.putExtra(blcr.f125971a, blcr.f125972b);
                }
            }
            if ((blcp.f125959a & 8) != 0) {
                intent.setFlags(blcp.f125964f);
            }
        }
        if (intent != null) {
            try {
                int a = blcu.m107028a(blcp.f125962d);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 1) {
                    context.startActivity(intent);
                    return true;
                } else if (i2 == 2) {
                    context.startService(intent);
                    return true;
                } else if (i2 != 3) {
                    ((bnsl) f72333a.mo68387b()).mo68405a("Unexpected intent type.");
                    return false;
                } else {
                    context.sendBroadcast(intent);
                    return true;
                }
            } catch (ActivityNotFoundException | IllegalStateException | SecurityException e) {
                bnsl bnsl = (bnsl) f72333a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to launch intent target.");
                return false;
            }
        } else {
            ((bnsl) f72333a.mo68387b()).mo68405a("Failed to create intent target from payload.");
            return false;
        }
    }
}
