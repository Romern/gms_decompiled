package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceSyncV2FeatureIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11165a = jsy.m17256a("DeviceSyncV2FeatureIntentOperation");

    /* renamed from: b */
    private final jpd f11166b;

    public DeviceSyncV2FeatureIntentOperation() {
        this.f11166b = new jpd();
    }

    public final void onHandleIntent(Intent intent) {
        String name;
        if ("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE".equals(intent.getAction()) && cchu.m129749e()) {
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (!soz.m35791a(this, account)) {
                f11165a.mo25418e("Invalid account: %s", stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("feature_name");
            bsni[] values = bsni.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    f11165a.mo25416d("Couldn't retrieve feature name from hashed value", new Object[0]);
                    name = bsni.UNKNOWN_FEATURE.name();
                    break;
                }
                bsni bsni = values[i];
                long d = bnzi.m110902d().mo68721a(bsni.name(), Charset.forName("UTF-8")).mo68742d();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(d);
                if (boan.f132471e.mo68783a().mo68794a(allocate.array()).equals(stringExtra2)) {
                    name = bsni.name();
                    break;
                }
                i++;
            }
            this.f11166b.mo13970a(this, account, name);
        }
    }

    DeviceSyncV2FeatureIntentOperation(Context context, jpd jpd) {
        attachBaseContext(context);
        this.f11166b = jpd;
    }
}
