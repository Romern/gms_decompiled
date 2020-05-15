package com.google.android.gms.auth.account.mdm;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.entity.ByteArrayEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {

    /* renamed from: a */
    public static final sek f10014a = ght.m13171a("account_mdm", "GcmReceiverChimeraService");

    /* renamed from: b */
    Handler f10015b;

    /* renamed from: c */
    private HandlerThread f10016c;

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    public static final Map m6303a(String str) {
        HashMap hashMap = new HashMap();
        String valueOf = String.valueOf(str);
        hashMap.put("Authorization", valueOf.length() == 0 ? new String("GoogleDMToken token=") : "GoogleDMToken token=".concat(valueOf));
        hashMap.put("Content-type", "application/x-protobuffer");
        hashMap.put("Accept-Encoding", "gzip");
        return hashMap;
    }

    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("dm-account-wipe", 10);
        this.f10016c = handlerThread;
        handlerThread.start();
        this.f10015b = new adzt(this.f10016c.getLooper());
        super.onCreate();
    }

    public final void onDestroy() {
        HandlerThread handlerThread = this.f10016c;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        String stringExtra;
        if (intent != null && gnv.m13497G() && (stringExtra = intent.getStringExtra("action")) != null && stringExtra.equals("account_wipe")) {
            String stringExtra2 = intent.getStringExtra("action_token");
            String stringExtra3 = intent.getStringExtra("email");
            if (bmxx.m108577a(stringExtra2) || bmxx.m108577a(stringExtra3)) {
                f10014a.mo25412b("Received account wipe intent with invalid token or email", new Object[0]);
                return;
            }
            long a = spn.m35843a(getApplicationContext());
            String l = Long.toString(a);
            bxvd da = bzyw.f171931d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzyw bzyw = (bzyw) da.f164949b;
            l.getClass();
            int i = bzyw.f171933a | 1;
            bzyw.f171933a = i;
            bzyw.f171934b = l;
            stringExtra3.getClass();
            bzyw.f171933a = i | 2;
            bzyw.f171935c = stringExtra3;
            bzyw bzyw2 = (bzyw) da.mo74062i();
            bxvd da2 = bzyx.f171936d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzyx bzyx = (bzyx) da2.f164949b;
            stringExtra2.getClass();
            bzyx.f171938a |= 1;
            bzyx.f171939b = stringExtra2;
            bxvd da3 = bzyv.f171926d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bzyv bzyv = (bzyv) da3.f164949b;
            bzyv.f171929b = 1;
            bzyv.f171928a |= 1;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzyx bzyx2 = (bzyx) da2.f164949b;
            bzyv bzyv2 = (bzyv) da3.mo74062i();
            bzyv2.getClass();
            bzyx2.f171940c = bzyv2;
            bzyx2.f171938a |= 2;
            bzyx bzyx3 = (bzyx) da2.mo74062i();
            bxvd da4 = bzyz.f171945e.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bzyz bzyz = (bzyz) da4.f164949b;
            bzyw2.getClass();
            bzyz.f171948b = bzyw2;
            int i2 = bzyz.f171947a | 1;
            bzyz.f171947a = i2;
            bzyx3.getClass();
            bzyz.f171949c = bzyx3;
            bzyz.f171947a = i2 | 2;
            this.f10015b.post(new grl(this, new ByteArrayEntity(((bzyz) da4.mo74062i()).mo73642k()), stringExtra2, stringExtra3, a));
        }
    }
}
