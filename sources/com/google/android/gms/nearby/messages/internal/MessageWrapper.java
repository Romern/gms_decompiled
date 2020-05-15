package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageWrapper extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajcr();

    /* renamed from: a */
    final int f80741a;

    /* renamed from: b */
    public final Message f80742b;

    public MessageWrapper(int i, Message message) {
        this.f80741a = i;
        sdo.m34959a(message);
        this.f80742b = message;
    }

    /* renamed from: a */
    public static final MessageWrapper m67407a(Message message) {
        return new MessageWrapper(1, message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageWrapper) {
            return sdg.m34949a(this.f80742b, ((MessageWrapper) obj).f80742b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80742b});
    }

    public final String toString() {
        String message = this.f80742b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 24);
        sb.append("MessageWrapper{message=");
        sb.append(message);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f80742b, i, false);
        see.m35063b(parcel, 1000, this.f80741a);
        see.m35062b(parcel, a);
    }
}
