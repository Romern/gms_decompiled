package com.google.android.gms.stats.controlledevents;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.FutureTask;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ControlledEventsOperation extends IntentOperation {

    /* renamed from: a */
    private aacn f108285a = null;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59203a() {
        try {
            rpr.m34216b().unregisterReceiver(this.f108285a);
        } catch (IllegalArgumentException e) {
            asfj.m73952a("ControlledEventsReceiverFailureIllegalUnregister");
        }
        this.f108285a = null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        boolean z;
        String str;
        String str2;
        if (cgsi.m146848b()) {
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -579664806:
                    if (action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -402052697:
                    if (action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 871387742:
                    if (action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_BLE_SCAN")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2085626924:
                    if (action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                long longExtra = intent.getLongExtra("wakelock_duration", 0);
                boolean booleanExtra = intent.getBooleanExtra("wakelock_busy", false);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.f108285a = new ControlledEventsBroadcastReceiver(this);
                rpr.m34216b().registerReceiver(this.f108285a, intentFilter);
                if (booleanExtra) {
                    z = asfi.m73950a(new asfh(), longExtra);
                } else {
                    z = asfi.m73949a(longExtra);
                }
                if (this.f108285a != null) {
                    mo59203a();
                }
                if (!z) {
                    str = "ControlledEventsWakelockFailure";
                } else {
                    str = "ControlledEventsWakelockSuccess";
                }
                asfj.m73952a(str);
                asfk.m73957a(intent.getIntExtra("alarm_id_extra", -1));
            } else if (c == 1) {
                long longExtra2 = intent.getLongExtra("bluetooth_low_energy_scan_duration", 0);
                int i = Build.VERSION.SDK_INT;
                BluetoothAdapter adapter = ((BluetoothManager) rpr.m34216b().getSystemService("bluetooth")).getAdapter();
                if (adapter == null || !adapter.isEnabled()) {
                    asfj.m73952a("ControlledEventsBleScanFailureAdapter");
                    str2 = "ControlledEventsBleScanFailure";
                } else {
                    new FutureTask(new asfg(adapter, new asff(), longExtra2)).run();
                    str2 = "ControlledEventsBleScanSuccess";
                }
                asfj.m73952a(str2);
                asfk.m73957a(intent.getIntExtra("alarm_id_extra", -1));
            } else if (c == 2) {
                long longExtra3 = intent.getLongExtra("wakeup_duration", -1);
                int intExtra = intent.getIntExtra("wakeup_remaining_alarms", -1);
                int intExtra2 = intent.getIntExtra("wakeup_number_of_attempts", 0);
                if (intExtra >= 0) {
                    long j = (long) intExtra2;
                    if (j <= cgsi.m146849c()) {
                        boolean a = asfi.m73949a(longExtra3);
                        asfk.m73957a(intent.getIntExtra("alarm_id_extra", -1));
                        if (a) {
                            asfj.m73952a("ControlledEventsWakeupSuccess");
                            if (intExtra > 0) {
                                asfk.m73958a(intExtra - 1, intExtra2);
                                return;
                            }
                            return;
                        } else if (j < cgsi.m146849c()) {
                            asfj.m73952a("ControlledEventsWakeupTotalNumRetries");
                            asfk.m73958a(intExtra, intExtra2 + 1);
                            return;
                        } else {
                            asfj.m73952a("ControlledEventsWakeupFailureRetries");
                            asfj.m73953a("ControlledEventsWakeupFailureTotal", intExtra);
                            return;
                        }
                    }
                }
                asfk.m73957a(intent.getIntExtra("alarm_id_extra", -1));
                if (intExtra < 0) {
                    asfj.m73952a("ControlledEventsWakeupFailureOverscheduled");
                }
                if (((long) intExtra2) > cgsi.m146849c() && intExtra > 0) {
                    asfj.m73953a("ControlledEventsWakeupFailureTotal", intExtra);
                }
            } else if (c != 3) {
                asfj.m73952a("ControlledEventsOperationUnknownAction");
            } else {
                asfj.m73952a("ControlledEventsProcessCrashSuccess");
                asfk.m73957a(intent.getIntExtra("alarm_id_extra", -1));
            }
        }
    }
}
