package com.google.android.gms.fitness.service.recording;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientIdentity;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitRecordingChimeraBroker extends zme {
    static {
        zvt.m46581a();
    }

    public FitRecordingChimeraBroker() {
        super("com.google.android.gms.fitness.service.recording.FitRecordingBroker");
    }

    /* renamed from: a */
    public static void m23782a(Context context, Intent intent) {
        Intent intent2 = new Intent("com.google.android.gms.fitness.PACKAGE_CHANGED");
        intent2.setClassName(context, "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
        intent2.putExtra("PACKAGE_NAME", yub.m44845b(intent));
        context.startService(intent2);
    }

    public final boolean handleMessage(Message message) {
        int i;
        if (message.what <= 2) {
            return super.handleMessage(message);
        }
        Intent intent = (Intent) message.obj;
        if (message.what == 5) {
            for (String str : this.f55434b.mo30715b()) {
                zoh zoh = (zoh) mo31240b(str);
                String stringExtra = intent.getStringExtra("PACKAGE_NAME");
                if (cdyu.m135392j() && yub.m44843a(zoh.f55428a, stringExtra)) {
                    bnsl bnsl = (bnsl) zoh.f55595d.mo68390d();
                    bnsl.mo68432a("zoh", "c", 564, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Package %s enabled.  Potentially restarting recording", stringExtra);
                    zds zds = zoh.f55600i;
                    if (!zds.f54973b.mo31400b()) {
                        ((bnsl) zds.f54972a.mo68388c()).mo68420a("Skipping FitRecordingApi init of %s since Fit DB doesn't exist", stringExtra);
                        i = MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
                    } else {
                        try {
                            bnic b = zds.f54973b.mo31399b(stringExtra);
                            if (!b.isEmpty()) {
                                bngx a = zds.mo30963a(stringExtra, b);
                                int size = a.size();
                                bnre i2 = a.listIterator();
                                int i3 = 0;
                                while (i2.hasNext()) {
                                    if (zds.mo30964a(stringExtra, (yqe) i2.next())) {
                                        i3++;
                                    }
                                }
                                ((bnsl) zds.f54972a.mo68390d()).mo68425a("FitRecording initialized for %s.  Recreated %d subscriptions out of %d.", stringExtra, Integer.valueOf(i3), Integer.valueOf(size));
                                i = zds.m45343a(i3, size);
                            } else {
                                i = MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
                            }
                        } catch (IOException e) {
                            bnsl bnsl2 = (bnsl) zds.f54972a.mo68387b();
                            bnsl2.mo68437a(e);
                            bnsl2.mo68424a("Error recreating subscriptions for %s %s", zds.f54974c, stringExtra);
                            i = 10;
                        }
                    }
                    if (zoh.mo31245d()) {
                        zoh.mo31246e();
                    }
                    if (i != 159) {
                        ytq a2 = zoh.f55602k.mo30767a(zoh.f55428a);
                        a2.mo30762a(zoh.f55429b);
                        a2.mo30755a(1048);
                        a2.mo30765d(i);
                        a2.mo30754a();
                    }
                }
            }
        } else {
            String stringExtra2 = intent.getStringExtra("ACCOUNT_NAME");
            String stringExtra3 = intent.getStringExtra("DEVICE_ADDRESS");
            zoh zoh2 = (zoh) mo31240b(stringExtra2);
            if (message.what == 3) {
                try {
                    bnrd a3 = zoh2.f55596e.mo31396a().iterator();
                    while (a3.hasNext()) {
                        yqe yqe = (yqe) a3.next();
                        String str2 = yqe.f54380a;
                        bmxv a4 = zoh2.f55601j.mo30958a(str2);
                        if (!a4.mo66813a()) {
                            zoh2.f55596e.mo31397a(str2);
                        } else if (zoh2.f55601j.mo30960b(str2)) {
                            if (yqe.f54384e == 1) {
                                bnrd a5 = zoh2.f55598g.mo31337a(yqe).iterator();
                                while (a5.hasNext()) {
                                    yqe yqe2 = (yqe) a5.next();
                                    caae caae = yqe2.f54381b.f172720b;
                                    if (caae == null) {
                                        caae = caae.f172323i;
                                    }
                                    if ((caae.f172325a & 32) != 0) {
                                        caaq caaq = caae.f172331g;
                                        if (caaq == null) {
                                            caaq = caaq.f172356h;
                                        }
                                        if (caaq.f172359b.equals(stringExtra3)) {
                                            zoh2.f55597f.mo30969a(yqe2, (ClientIdentity) a4.mo66814b());
                                            zoh2.mo31246e();
                                        }
                                    }
                                }
                            }
                        } else if (!cdyu.m135392j()) {
                            zoh2.f55596e.mo31397a(str2);
                        }
                    }
                } catch (IOException e2) {
                    bnsl bnsl3 = (bnsl) zoh.f55595d.mo68388c();
                    bnsl3.mo68437a(e2);
                    bnsl3.mo68432a("zoh", "d", 621, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to recreate device registrations for %s", stringExtra3);
                }
            } else if (message.what != 4) {
                String valueOf = String.valueOf(message);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Unexpected message ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!mo31251c()) {
            stopSelf();
        }
        return true;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (m23784a(intent, "com.google.android.gms.fitness.INITIALIZE")) {
            mo31253e();
            return 1;
        } else if (m23784a(intent, "com.google.android.gms.fitness.BLE_DEVICE_CLAIMED")) {
            mo31249a(3, intent);
            return 1;
        } else if (m23784a(intent, "com.google.android.gms.fitness.BLE_DEVICE_UNCLAIMED")) {
            mo31249a(4, intent);
            return 1;
        } else if (!m23784a(intent, "com.google.android.gms.fitness.PACKAGE_CHANGED")) {
            return super.onStartCommand(intent, i, i2);
        } else {
            mo31249a(5, intent);
            return 1;
        }
    }

    /* renamed from: a */
    public static void m23783a(Context context, String str, String str2) {
        Intent intent = new Intent("com.google.android.gms.fitness.BLE_DEVICE_CLAIMED", (Uri) null);
        intent.setClassName(context, "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
        intent.putExtra("ACCOUNT_NAME", str);
        intent.putExtra("DEVICE_ADDRESS", str2);
        context.startService(intent);
    }

    /* renamed from: a */
    private static boolean m23784a(Intent intent, String str) {
        return intent != null && intent.getAction().equals(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19167a() {
        return zap.f54895a.mo3214a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zlz mo19168a(String str) {
        return new zoh(this, str, this.f55438f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19169a(Intent intent) {
        return "com.google.android.gms.fitness.RecordingApi".equals(intent.getAction());
    }
}
