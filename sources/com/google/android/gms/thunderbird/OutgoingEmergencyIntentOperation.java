package com.google.android.gms.thunderbird;

import android.content.ComponentName;
import android.content.Intent;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OutgoingEmergencyIntentOperation extends IntentOperation {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    public final void onHandleIntent(Intent intent) {
        char c;
        boolean z;
        String str;
        String stringExtra;
        ComponentName startService;
        Intent intent2 = intent;
        if (cgyq.f188062a.mo6606a().mo84758b() && auhf.m77066a(this) && intent.getAction() != null) {
            String action = intent.getAction();
            boolean z2 = false;
            switch (action.hashCode()) {
                case 230586868:
                    if (action.equals("thunderbird.intent.action.MOCK_NEW_OUTGOING_CALL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 423096035:
                    if (action.equals("thunderbird.intent.action.MOCK_NEW_OUTGOING_SMS")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1456663068:
                    if (action.equals("thunderbird.intent.action.NEW_OUTGOING_SMS")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1901012141:
                    if (action.equals("android.intent.action.NEW_OUTGOING_CALL")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                z2 = true;
            } else if (c != 1) {
                if (c == 2) {
                    z2 = true;
                } else if (c != 3) {
                    String valueOf = String.valueOf(intent.getAction());
                    Log.e("Thunderbird", valueOf.length() == 0 ? new String("unknown emergency intent action: ") : "unknown emergency intent action: ".concat(valueOf));
                    return;
                }
                str = "SMS";
                z = z2;
                stringExtra = intent2.getStringExtra("android.intent.extra.PHONE_NUMBER");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Log.e("Thunderbird", "received empty phone number");
                    return;
                } else if (!auho.m77071a(stringExtra)) {
                    String b = auho.m77073b(stringExtra);
                    if (TextUtils.isEmpty(b)) {
                        Log.e("Thunderbird", "empty normalized phone number");
                        return;
                    }
                    EmergencyInfo emergencyInfo = new EmergencyInfo(new ActivationInfo(b, str, z, System.currentTimeMillis(), SystemClock.elapsedRealtime(), (Location) intent2.getParcelableExtra("thunderbird.intent.extra.EXTRA_GROUND_TRUTH_LOCATION")), DeviceState.m93365a(this));
                    if (!bnjd.m109598e(aufz.m77007a().mo50503a(this, emergencyInfo))) {
                        if (Log.isLoggable("Thunderbird", 4)) {
                            String valueOf2 = String.valueOf(emergencyInfo);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                            sb.append("forwarding to emergency location service: ");
                            sb.append(valueOf2);
                            Log.i("Thunderbird", sb.toString());
                        }
                        synchronized (EmergencyLocationChimeraService.f109049a) {
                            if (EmergencyLocationChimeraService.f109050b == null) {
                                EmergencyLocationChimeraService.f109050b = new asfb(getApplicationContext(), 1, "Thunderbird", "StartEmergencyLocationService", "com.google.android.gms", "com.google.android.gms.thunderbird");
                                EmergencyLocationChimeraService.f109050b.mo49115a(true);
                            }
                            EmergencyLocationChimeraService.f109050b.mo49117b();
                            try {
                                Intent intent3 = new Intent();
                                intent3.setComponent(new ComponentName(this, "com.google.android.gms.thunderbird.EmergencyLocationService"));
                                sef.m35071a(emergencyInfo, intent3, "thunderbird.intent.extra.EMERGENCY_INFO");
                                intent3.putExtra("thunderbird.intent.extra.IS_WAKEFUL", true);
                                startService = startService(intent3);
                                if (startService == null) {
                                }
                            } finally {
                                EmergencyLocationChimeraService.m93346a(this);
                            }
                        }
                        if (startService == null) {
                            auho.m77069a(this, new IllegalStateException("EmergencyLocationChimeraService not found"));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (auho.m77070a()) {
                    String valueOf3 = String.valueOf(stringExtra);
                    Log.d("Thunderbird", valueOf3.length() == 0 ? new String("sip address cannot be emergency number: ") : "sip address cannot be emergency number: ".concat(valueOf3));
                    return;
                } else {
                    return;
                }
            }
            str = "CALL";
            z = z2;
            stringExtra = intent2.getStringExtra("android.intent.extra.PHONE_NUMBER");
            if (!TextUtils.isEmpty(stringExtra)) {
            }
        }
    }
}
