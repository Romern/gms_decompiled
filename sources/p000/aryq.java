package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;

/* renamed from: aryq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aryq {

    /* renamed from: d */
    private static final sek f88476d = ascp.m73787a("DiscoveryChimeraActivity");

    /* renamed from: a */
    public final ConnectionRequest f88477a;

    /* renamed from: b */
    public final int f88478b;

    /* renamed from: c */
    public final aqzm f88479c;

    private aryq(int i, ConnectionRequest connectionRequest, aqzm aqzm) {
        this.f88477a = connectionRequest;
        this.f88478b = i;
        this.f88479c = aqzm;
    }

    /* renamed from: b */
    public static byte[] m73691b(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_for_fastpair_code");
        if (byteArrayExtra != null && byteArrayExtra.length > 0) {
            return byteArrayExtra;
        }
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES");
        if (byteArrayExtra2 != null) {
            return aizv.m58305a(byteArrayExtra2).mo38346a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo48945a() {
        return this.f88477a != null;
    }

    /* renamed from: a */
    public static aryq m73690a(Intent intent) {
        int i;
        Uri data;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            i = !stringExtra.startsWith("android-app://com.google.android.googlequicksearchbox") ? !stringExtra.startsWith("gcore-settings") ? !stringExtra.startsWith("fastpair") ? cgpg.m146449c() ? !stringExtra.startsWith("agsa") ? 0 : 6 : 0 : 5 : 3 : 2;
        } else if (!intent2.hasExtra("com.google.android.gms.nearby.messages.ble.EXTRA_BLE_RECORD_BYTES")) {
            Uri data2 = intent.getData();
            if (!cgpg.m146449c()) {
                i = 0;
            } else {
                if (data2 != null) {
                    String host = data2.getHost();
                    if (TextUtils.equals(host, "qr")) {
                        i = 8;
                    } else if (TextUtils.equals(host, "pair")) {
                        i = 7;
                    }
                }
                i = 0;
            }
        } else {
            i = 5;
        }
        f88476d.mo25412b("TriggerType = %d", Integer.valueOf(i));
        ConnectionRequest connectionRequest = null;
        if (cgpg.m146449c()) {
            if (i == 5) {
                int i2 = Build.VERSION.SDK_INT;
                byte[] b = m73691b(intent);
                if (b != null && b.length > 0) {
                    f88476d.mo25412b("Fastpair code: (%s)", Arrays.toString(b));
                    connectionRequest = new ConnectionRequest(null, null, null, b, null, 5);
                }
            } else if (i == 6) {
                Uri uri = (Uri) intent2.getParcelableExtra("deeplink");
                if (uri != null) {
                    f88476d.mo25412b("Uri: (%s)", uri);
                    String lastPathSegment = uri.getLastPathSegment();
                    String queryParameter = uri.getQueryParameter("key");
                    if (!TextUtils.isEmpty(lastPathSegment)) {
                        connectionRequest = new ConnectionRequest(null, null, lastPathSegment, null, queryParameter, i);
                    }
                }
            } else if ((i == 7 || i == 8) && (data = intent.getData()) != null) {
                f88476d.mo25412b("Uri: (%s)", data);
                String lastPathSegment2 = data.getLastPathSegment();
                String stringExtra2 = intent2.getStringExtra("key");
                if (!TextUtils.isEmpty(lastPathSegment2)) {
                    connectionRequest = new ConnectionRequest(null, null, lastPathSegment2, null, stringExtra2, i);
                }
            }
        }
        return new aryq(i, connectionRequest, intent2.hasExtra("device_type") ? aqzm.m72294a(intent2.getStringExtra("device_type")) : aqzm.UNKNOWN);
    }
}
