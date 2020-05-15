package com.felicanetworks.mfc.mfi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ICardEnableEventCallback extends IInterface {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class Stub extends Binder implements ICardEnableEventCallback {
        private static final String DESCRIPTOR = "com.felicanetworks.mfc.mfi.ICardEnableEventCallback";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        class Proxy implements ICardEnableEventCallback {
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

            public void onError(int i, String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSuccess(CardInfo cardInfo, CardInfo cardInfo2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (cardInfo != null) {
                        obtain.writeInt(1);
                        cardInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (cardInfo2 != null) {
                        obtain.writeInt(1);
                        cardInfo2.writeToParcel(obtain, 0);
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

        public static ICardEnableEventCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICardEnableEventCallback)) {
                return new Proxy(iBinder);
            }
            return (ICardEnableEventCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            CardInfo cardInfo;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                CardInfo cardInfo2 = null;
                if (parcel.readInt() != 0) {
                    cardInfo = (CardInfo) CardInfo.CREATOR.createFromParcel(parcel);
                } else {
                    cardInfo = null;
                }
                if (parcel.readInt() != 0) {
                    cardInfo2 = (CardInfo) CardInfo.CREATOR.createFromParcel(parcel);
                }
                onSuccess(cardInfo, cardInfo2);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onError(parcel.readInt(), parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onError(int i, String str);

    void onSuccess(CardInfo cardInfo, CardInfo cardInfo2);
}
