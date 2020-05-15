package com.google.android.libraries.bluetooth.fastpair;

import android.bluetooth.BluetoothDevice;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_Event extends Event {

    /* renamed from: a */
    private final bvjc f111042a;

    /* renamed from: b */
    private final long f111043b;

    /* renamed from: c */
    private final Short f111044c;

    /* renamed from: d */
    private final BluetoothDevice f111045d;

    /* renamed from: e */
    private final Exception f111046e;

    public AutoValue_Event(bvjc bvjc, long j, Short sh, BluetoothDevice bluetoothDevice, Exception exc) {
        this.f111042a = bvjc;
        this.f111043b = j;
        this.f111044c = sh;
        this.f111045d = bluetoothDevice;
        this.f111046e = exc;
    }

    /* renamed from: a */
    public final bvjc mo60332a() {
        return this.f111042a;
    }

    /* renamed from: b */
    public final long mo60333b() {
        return this.f111043b;
    }

    /* renamed from: c */
    public final Short mo60334c() {
        return this.f111044c;
    }

    /* renamed from: d */
    public final BluetoothDevice mo60335d() {
        return this.f111045d;
    }

    /* renamed from: e */
    public final Exception mo60336e() {
        return this.f111046e;
    }

    public final boolean equals(Object obj) {
        Short sh;
        BluetoothDevice bluetoothDevice;
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return this.f111042a.equals(event.mo60332a()) && this.f111043b == event.mo60333b() && ((sh = this.f111044c) == null ? event.mo60334c() == null : sh.equals(event.mo60334c())) && ((bluetoothDevice = this.f111045d) == null ? event.mo60335d() == null : bluetoothDevice.equals(event.mo60335d())) && ((exc = this.f111046e) == null ? event.mo60336e() == null : exc.equals(event.mo60336e()));
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.f111042a.hashCode();
        long j = this.f111043b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Short sh = this.f111044c;
        int i4 = 0;
        if (sh != null) {
            i = sh.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 ^ i) * 1000003;
        BluetoothDevice bluetoothDevice = this.f111045d;
        if (bluetoothDevice != null) {
            i2 = bluetoothDevice.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 ^ i2) * 1000003;
        Exception exc = this.f111046e;
        if (exc != null) {
            i4 = exc.hashCode();
        }
        return i6 ^ i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111042a);
        long j = this.f111043b;
        String valueOf2 = String.valueOf(this.f111044c);
        String valueOf3 = String.valueOf(this.f111045d);
        String valueOf4 = String.valueOf(this.f111046e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Event{eventCode=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", profile=");
        sb.append(valueOf2);
        sb.append(", bluetoothDevice=");
        sb.append(valueOf3);
        sb.append(", exception=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
