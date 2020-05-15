package p000;

import android.content.Context;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aexq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexq {
    /* renamed from: a */
    public static final String m52657a(Context context, int i) {
        if (i == 7 || i == 6) {
            return context.getString(C0126R.string.location_sharing_general_error_alert);
        }
        if (i == 5) {
            return context.getString(C0126R.string.location_sharing_no_network_alert);
        }
        return null;
    }

    /* renamed from: a */
    public static void m52658a(Context context) {
        Toast.makeText(context, (int) C0126R.string.location_sharing_save_error, 0).show();
    }
}
