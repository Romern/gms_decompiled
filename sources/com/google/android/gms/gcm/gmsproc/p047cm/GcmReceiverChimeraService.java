package com.google.android.gms.gcm.gmsproc.p047cm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.gcm.gmsproc.cm.GcmReceiverChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends TracingIntentService {

    /* renamed from: a */
    private aaoh f32831a;

    /* renamed from: b */
    private aaoi f32832b;

    /* renamed from: com.google.android.gms.gcm.gmsproc.cm.GcmReceiverChimeraService$MessageTriggeredService */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class MessageTriggeredService extends aaoj {
    }

    public GcmReceiverChimeraService() {
        super("GCM");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        byte[] bArr;
        if (intent != null && intent.getExtras() != null) {
            String stringExtra = intent.getStringExtra("google.c.cm.cat");
            String stringExtra2 = intent.getStringExtra("google.c.cm.lt_start");
            String stringExtra3 = intent.getStringExtra("google.c.cm.lt_end");
            long a = this.f32831a.mo17174a(stringExtra2);
            long a2 = this.f32831a.mo17174a(stringExtra3);
            if (stringExtra == null || a == 0 || a2 == 0) {
                Log.e("GCM", "Discarded message with device-time due to lack of required fields");
            } else if (a2 < System.currentTimeMillis()) {
                Log.w("GCM", "Message with device-time received past its expiry time.");
            } else if (a <= System.currentTimeMillis()) {
                this.f32832b.mo17177a(intent.getExtras());
            } else {
                aaoh aaoh = this.f32831a;
                Bundle extras = intent.getExtras();
                synchronized (aaoh.class) {
                    LevelDb b = aaoh.mo17176b();
                    if (b != null) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder(String.valueOf(stringExtra2).length() + 22 + String.valueOf(stringExtra3).length());
                            sb.append(stringExtra2);
                            sb.append("@");
                            sb.append(stringExtra3);
                            sb.append("@");
                            sb.append(currentTimeMillis);
                            bArr = sb.toString().getBytes("UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            bArr = new byte[0];
                        }
                        try {
                            blmo blmo = (blmo) blmp.f126864r.mo74144da();
                            if (blmo.f164950c) {
                                blmo.mo74035c();
                                blmo.f164950c = false;
                            }
                            blmp blmp = (blmp) blmo.f164949b;
                            ".".getClass();
                            int i = blmp.f126866a | 16;
                            blmp.f126866a = i;
                            blmp.f126870e = ".";
                            ".".getClass();
                            blmp.f126866a = i | 4;
                            blmp.f126868c = ".";
                            for (String str : extras.keySet()) {
                                Object obj = extras.get(str);
                                if (obj instanceof String) {
                                    bxvd da = blmi.f126842d.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    blmi blmi = (blmi) da.f164949b;
                                    str.getClass();
                                    int i2 = blmi.f126844a | 1;
                                    blmi.f126844a = i2;
                                    blmi.f126845b = str;
                                    String str2 = (String) obj;
                                    str2.getClass();
                                    blmi.f126844a = i2 | 2;
                                    blmi.f126846c = str2;
                                    blmo.mo66684a(da);
                                }
                            }
                            b.put(bArr, ((blmp) blmo.mo74062i()).mo73642k());
                        } catch (LevelDbException e2) {
                            Log.e("GCM", "Failed to persist device-time message", e2);
                        }
                    }
                }
                this.f32831a.mo17175a();
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.f32832b = new aaoi(this, aeat.m51532a(this));
        this.f32831a = new aaoh(this, new aaoi(this, aeat.m51532a(this)));
    }

    public final void onDestroy() {
        super.onDestroy();
        aaoh.m21756c();
    }
}
