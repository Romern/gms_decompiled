package p000;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* renamed from: qlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qlh extends IntentOperation {

    /* renamed from: a */
    public final String f41639a;

    protected qlh(String str) {
        this.f41639a = str;
    }

    /* renamed from: a */
    public abstract void mo18633a(Intent intent);

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (!"android.provider.Telephony.SECRET_CODE".equals(action)) {
            String valueOf = String.valueOf(action);
            Log.w("SecretCodeIO", valueOf.length() == 0 ? new String("Ignoring unexpected intent: ") : "Ignoring unexpected intent: ".concat(valueOf));
            return;
        }
        Uri data = intent.getData();
        String str = null;
        if (data != null && "android_secret_code".equals(data.getScheme())) {
            str = data.getHost();
        }
        if (str == null) {
            String valueOf2 = String.valueOf(data);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 39);
            sb.append("Ignoring malformed SECRET_CODE Intent: ");
            sb.append(valueOf2);
            Log.w("SecretCodeIO", sb.toString());
        } else if (this.f41639a.equals(str)) {
            mo18633a(intent);
        }
    }
}
