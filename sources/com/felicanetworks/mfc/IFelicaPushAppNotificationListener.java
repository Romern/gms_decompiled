package com.felicanetworks.mfc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface IFelicaPushAppNotificationListener extends IInterface {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class Stub extends Binder implements IFelicaPushAppNotificationListener {
        private static final String DESCRIPTOR = "com.felicanetworks.mfc.IFelicaPushAppNotificationListener";
        static final int TRANSACTION_pushAppNotified = 1;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        class Proxy implements IFelicaPushAppNotificationListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void pushAppNotified(PushNotifyAppSegment pushNotifyAppSegment) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pushNotifyAppSegment != null) {
                        obtain.writeInt(1);
                        pushNotifyAppSegment.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFelicaPushAppNotificationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFelicaPushAppNotificationListener)) {
                return new Proxy(iBinder);
            }
            return (IFelicaPushAppNotificationListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            PushNotifyAppSegment pushNotifyAppSegment;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    pushNotifyAppSegment = (PushNotifyAppSegment) PushNotifyAppSegment.CREATOR.createFromParcel(parcel);
                } else {
                    pushNotifyAppSegment = null;
                }
                pushAppNotified(pushNotifyAppSegment);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void pushAppNotified(PushNotifyAppSegment pushNotifyAppSegment);
}
