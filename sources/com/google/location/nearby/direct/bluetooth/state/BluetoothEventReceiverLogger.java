package com.google.location.nearby.direct.bluetooth.state;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothEventReceiverLogger extends aacn {

    /* renamed from: a */
    public static final Set f191761a = new HashSet();

    /* renamed from: b */
    private static final String[] f191762b = {"com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.adapter.action.SCAN_MODE_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.DISCOVERY_STARTED", "android.bluetooth.adapter.action.DISCOVERY_FINISHED", "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED"};

    /* renamed from: c */
    private final BroadcastReceiver f191763c;

    public BluetoothEventReceiverLogger(BroadcastReceiver broadcastReceiver) {
        super("nearby");
        sdo.m34959a(broadcastReceiver);
        this.f191763c = broadcastReceiver;
        f191761a.addAll(Arrays.asList(f191762b));
    }

    /* renamed from: a */
    private static void m151162a(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN: ");
            sb.append(i);
            sb.toString();
        }
    }

    /* renamed from: b */
    private static void m151163b(int i) {
        if (i != 20 && i != 21 && i != 23) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN: ");
            sb.append(i);
            sb.toString();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char c;
        if (intent != null) {
            String action = intent.getAction();
            if (f191761a.contains(action)) {
                Bundle extras = intent.getExtras();
                switch (action.hashCode()) {
                    case -1780914469:
                        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1530327060:
                        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -737417248:
                        if (action.equals("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -206700896:
                        if (action.equals("android.bluetooth.adapter.action.SCAN_MODE_CHANGED")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 6759640:
                        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1123270207:
                        if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1260591598:
                        if (action.equals("android.bluetooth.adapter.action.LOCAL_NAME_CHANGED")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        srn srn = bvcm.f155598a;
                        break;
                    case 1:
                        extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_STATE");
                        extras.getInt("android.bluetooth.adapter.extra.STATE");
                        srn srn2 = bvcm.f155598a;
                        break;
                    case 2:
                        int i = extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE");
                        int i2 = extras.getInt("android.bluetooth.adapter.extra.CONNECTION_STATE");
                        srn srn3 = bvcm.f155598a;
                        m151162a(i);
                        m151162a(i2);
                        break;
                    case 3:
                        srn srn4 = bvcm.f155598a;
                        break;
                    case 4:
                        srn srn5 = bvcm.f155598a;
                        break;
                    case 5:
                        srn srn6 = bvcm.f155598a;
                        extras.getString("android.bluetooth.adapter.extra.LOCAL_NAME");
                        break;
                    case 6:
                        int i3 = extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE");
                        int i4 = extras.getInt("android.bluetooth.adapter.extra.SCAN_MODE");
                        srn srn7 = bvcm.f155598a;
                        m151163b(i3);
                        m151163b(i4);
                        break;
                }
                this.f191763c.onReceive(context, intent);
                return;
            }
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68432a("com.google.location.nearby.direct.bluetooth.state.BluetoothEventReceiverLogger", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BluetoothEvent: Invalid bluetooth action: %s", action);
        }
    }
}
