package com.felicanetworks.mfc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.IFSCEventListener;
import com.felicanetworks.mfc.IFelica;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface IFSC extends IInterface {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class Stub extends Binder implements IFSC {
        private static final String DESCRIPTOR = "com.felicanetworks.mfc.IFSC";
        static final int TRANSACTION_notifyError = 4;
        static final int TRANSACTION_notifyResult = 3;
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_stop = 2;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        class Proxy implements IFSC {
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

            public void notifyError(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void notifyResult(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo start(String str, DeviceList deviceList, IFSCEventListener iFSCEventListener, IFelica iFelica) {
                IBinder iBinder;
                IBinder iBinder2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (deviceList != null) {
                        obtain.writeInt(1);
                        deviceList.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    FelicaResultInfo felicaResultInfo = null;
                    if (iFSCEventListener != null) {
                        iBinder = iFSCEventListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (iFelica != null) {
                        iBinder2 = iFelica.asBinder();
                    } else {
                        iBinder2 = null;
                    }
                    obtain.writeStrongBinder(iBinder2);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFSC asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFSC)) {
                return new Proxy(iBinder);
            }
            return (IFSC) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            DeviceList deviceList;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    deviceList = (DeviceList) DeviceList.CREATOR.createFromParcel(parcel);
                } else {
                    deviceList = null;
                }
                FelicaResultInfo start = start(readString, deviceList, IFSCEventListener.Stub.asInterface(parcel.readStrongBinder()), IFelica.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (start != null) {
                    parcel2.writeInt(1);
                    start.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                stop();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                notifyResult(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                notifyError(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void notifyError(String str);

    void notifyResult(byte[] bArr);

    FelicaResultInfo start(String str, DeviceList deviceList, IFSCEventListener iFSCEventListener, IFelica iFelica);

    void stop();
}
