package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new addn();

    /* renamed from: a */
    Messenger f79132a;

    public MessengerCompat(IBinder iBinder) {
        int i = Build.VERSION.SDK_INT;
        this.f79132a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo43432a() {
        Messenger messenger = this.f79132a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return mo43432a().equals(((MessengerCompat) obj).mo43432a());
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return mo43432a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f79132a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo43433a(Message message) {
        Messenger messenger = this.f79132a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        throw null;
    }
}
