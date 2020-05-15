package com.google.android.gms.car.senderprotocol;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoValue_Channel_FlattenedChannel extends Channel$FlattenedChannel {

    /* renamed from: a */
    private final int f29504a;

    /* renamed from: b */
    private final int f29505b;

    /* renamed from: c */
    private final int f29506c;

    /* renamed from: d */
    private final olk f29507d;

    public AutoValue_Channel_FlattenedChannel(int i, int i2, int i3, olk olk) {
        this.f29504a = i;
        this.f29505b = i2;
        this.f29506c = i3;
        if (olk != null) {
            this.f29507d = olk;
            return;
        }
        throw new NullPointerException("Null qoSPriority");
    }

    /* renamed from: a */
    public final int mo17384a() {
        return this.f29504a;
    }

    /* renamed from: b */
    public final int mo17385b() {
        return this.f29505b;
    }

    /* renamed from: c */
    public final int mo17386c() {
        return this.f29506c;
    }

    /* renamed from: d */
    public final olk mo17387d() {
        return this.f29507d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Channel$FlattenedChannel) {
            Channel$FlattenedChannel channel$FlattenedChannel = (Channel$FlattenedChannel) obj;
            return this.f29504a == channel$FlattenedChannel.mo17384a() && this.f29505b == channel$FlattenedChannel.mo17385b() && this.f29506c == channel$FlattenedChannel.mo17386c() && this.f29507d.equals(channel$FlattenedChannel.mo17387d());
        }
    }

    public final int hashCode() {
        return ((((((this.f29504a ^ 1000003) * 1000003) ^ this.f29505b) * 1000003) ^ this.f29506c) * 1000003) ^ this.f29507d.hashCode();
    }

    public final String toString() {
        int i = this.f29504a;
        int i2 = this.f29505b;
        int i3 = this.f29506c;
        String valueOf = String.valueOf(this.f29507d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
        sb.append("FlattenedChannel{channelNumber=");
        sb.append(i);
        sb.append(", channelPriority=");
        sb.append(i2);
        sb.append(", channelState=");
        sb.append(i3);
        sb.append(", qoSPriority=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
