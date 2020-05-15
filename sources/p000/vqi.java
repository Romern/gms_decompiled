package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.drivingmode.DrivingModeLocationSetupNotificationIntentOperation;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;

/* renamed from: vqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vqi extends IntentOperation {

    /* renamed from: a */
    private vrb f49794a;

    /* renamed from: a */
    private static final Intent m41049a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(vqx.m41080a());
        return intent;
    }

    public final void onCreate() {
        vuk.m41322a();
        vuk.m41321a(getApplicationContext());
        vuk.m41322a();
        this.f49794a = vuk.m41326e(getApplicationContext());
    }

    public void onHandleIntent(Intent intent) {
        vqf vqf;
        bpdh bpdh;
        int i;
        int i2;
        int i3;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Received callback intent! ");
        sb.append(valueOf);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (ccra.m131311c() && "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION".equals(intent.getAction()) && ActivityTransitionResult.m66829a(intent)) {
            if (ActivityTransitionResult.m66829a(intent)) {
                ActivityTransitionResult b = ActivityTransitionResult.m66830b(intent);
                if (ccra.m131313e()) {
                    i = intent.getIntExtra("AR_AUDIO_FUSION_RESULT", -1);
                } else {
                    i = -1;
                }
                Log.i("CAR.DRIVINGMODE", String.format("handling ActivityTransitionResult: result = %s; carResult = %d", b, Integer.valueOf(i)));
                if (i == 0) {
                    i2 = 2;
                } else {
                    i2 = (i != 1 || !ccra.m131315g()) ? 1 : 3;
                }
                if (!ccra.m131313e() || !ccra.m131315g()) {
                    bmxy.m108589a(!b.f79314a.isEmpty(), "Transition result is empty");
                    ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) bnjd.m109595d(b.f79314a);
                    if (!ccra.m131310b() || activityTransitionEvent.f79307a != 3) {
                        if (ccul.f179984a.mo6606a().mo76845j() && (((i3 = activityTransitionEvent.f79307a) == 8 || i3 == 7) && activityTransitionEvent.f79308b == 0)) {
                            Log.i("CAR.DRIVINGMODE", String.format("Received walking/running entry transition. Exiting vehicle %s", b));
                            vqf = vqf.m41045a(3);
                        } else if (i2 != 1) {
                            String a = vqg.m41047a(i2);
                            StringBuilder sb2 = new StringBuilder(a.length() + 50);
                            sb2.append("Received car fusion result with transition type = ");
                            sb2.append(a);
                            Log.i("CAR.DRIVINGMODE", sb2.toString());
                            vqf = vqf.m41046b(i2);
                        } else if (activityTransitionEvent.f79307a != 0) {
                            Log.i("CAR.DRIVINGMODE", String.format("Insignificant non vehicle related transition result = %s", b));
                            vqf = vqf.m41045a(1);
                        } else {
                            int i4 = activityTransitionEvent.f79308b;
                            if (i4 == 0) {
                                vqf = vqf.m41045a(2);
                            } else if (i4 != 1) {
                                vqf = vqf.m41045a(1);
                            } else {
                                vqf = vqf.m41045a(3);
                            }
                        }
                    } else if (activityTransitionEvent.f79308b != 0) {
                        vqf = vqf.m41045a(5);
                    } else {
                        vqf = vqf.m41045a(4);
                    }
                } else {
                    vqf = vqf.m41046b(i2);
                }
            } else {
                vqf = vqf.m41045a(1);
            }
            String valueOf2 = String.valueOf(vqf);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb3.append("Handling transition ");
            sb3.append(valueOf2);
            Log.i("CAR.DRIVINGMODE", sb3.toString());
            int i5 = vqf.f49790b - 1;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            return;
                        }
                    }
                }
                if (!vqf.f49789a) {
                    bpdh = bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECTED;
                } else {
                    bpdh = bpdh.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_DISCONNECTED;
                }
                this.f49794a.mo28758a(bpdi.DRIVING_MODE, bpdh);
                startService(m41049a("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END"));
                startService(IntentOperation.getStartIntent(getApplicationContext(), DrivingModeLocationSetupNotificationIntentOperation.class, "com.google.android.drivingmode.SEND_SETUP_NOTIFICATION"));
                return;
            }
            this.f49794a.mo28758a(bpdi.DRIVING_MODE, !vqf.f49789a ? bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_CONNECTED : bpdh.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_CONNECTED);
            startService(m41049a("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START"));
        }
    }
}
