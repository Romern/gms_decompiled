package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Notification implements Parcelable {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum NotificationType implements Parcelable {
        MESSAGE_RECEIVED;
        
        public static final Parcelable.Creator CREATOR = new bctu();

        /* renamed from: b */
        public final int f111372b = 1;

        private NotificationType(String str) {
        }

        /* renamed from: a */
        public static bmxv m94872a(int i) {
            int i2 = i - 1;
            return (i2 < 0 || i2 >= values().length) ? bmvz.f131120a : bmxv.m108566b(values()[i2]);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f111372b);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class OneOfType implements Parcelable {
        public static final Parcelable.Creator CREATOR = new bctv();

        /* renamed from: a */
        public abstract MessageReceivedNotification mo60536a();

        /* renamed from: b */
        public abstract NotificationType mo60537b();

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(mo60537b(), i);
            NotificationType notificationType = NotificationType.MESSAGE_RECEIVED;
            if (mo60537b().ordinal() == 0) {
                parcel.writeParcelable(mo60536a(), i);
            }
        }
    }

    /* renamed from: g */
    public static bctt m94865g() {
        return new bctt();
    }

    /* renamed from: a */
    public abstract String mo60520a();

    /* renamed from: b */
    public abstract Long mo60521b();

    /* renamed from: c */
    public abstract NotificationMetadata mo60522c();

    /* renamed from: d */
    public abstract OneOfType mo60523d();

    /* renamed from: e */
    public final NotificationType mo60565e() {
        return mo60523d().mo60537b();
    }

    /* renamed from: f */
    public final MessageReceivedNotification mo60566f() {
        return mo60523d().mo60536a();
    }
}
