package com.felicanetworks.mfc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.IFelicaEventListener;
import com.felicanetworks.mfc.IFelicaPushAppNotificationListener;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface IFelica extends IInterface {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class Stub extends Binder implements IFelica {
        private static final String DESCRIPTOR = "com.felicanetworks.mfc.IFelica";
        static final int TRANSACTION_activateFelica = 1;
        static final int TRANSACTION_cancelOffline = 29;
        static final int TRANSACTION_checkOnlineAccess = 26;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_executeFelicaCommand = 30;
        static final int TRANSACTION_getBlockCountInformation = 3;
        static final int TRANSACTION_getContainerId = 4;
        static final int TRANSACTION_getContainerIssueInformation = 5;
        static final int TRANSACTION_getICCode = 6;
        static final int TRANSACTION_getIDm = 7;
        static final int TRANSACTION_getInterface = 8;
        static final int TRANSACTION_getKeyVersion = 9;
        static final int TRANSACTION_getKeyVersionV2 = 31;
        static final int TRANSACTION_getNodeInformation = 10;
        static final int TRANSACTION_getPrivacyNodeInformation = 11;
        static final int TRANSACTION_getRFSState = 12;
        static final int TRANSACTION_getSelectTimeout = 28;
        static final int TRANSACTION_getSystemCode = 13;
        static final int TRANSACTION_getSystemCodeList = 14;
        static final int TRANSACTION_inactivateFelica = 15;
        static final int TRANSACTION_open = 16;
        static final int TRANSACTION_push = 17;
        static final int TRANSACTION_read = 18;
        static final int TRANSACTION_reset = 19;
        static final int TRANSACTION_select = 20;
        static final int TRANSACTION_selectWithTarget = 21;
        static final int TRANSACTION_setNodeCodeSize = 25;
        static final int TRANSACTION_setPrivacy = 22;
        static final int TRANSACTION_setPushNotificationListener = 24;
        static final int TRANSACTION_setSelectTimeout = 27;
        static final int TRANSACTION_write = 23;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        class Proxy implements IFelica {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public FelicaResultInfo activateFelica(String[] strArr, IFelicaEventListener iFelicaEventListener) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iFelicaEventListener != null) {
                        iBinder = iFelicaEventListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            public IBinder asBinder() {
                return this.mRemote;
            }

            public FelicaResultInfo cancelOffline() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo checkOnlineAccess() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo close() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoByteArray executeFelicaCommand(byte[] bArr, int i, int i2) {
                FelicaResultInfoByteArray felicaResultInfoByteArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoByteArray = (FelicaResultInfoByteArray) FelicaResultInfoByteArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoByteArray = null;
                    }
                    return felicaResultInfoByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoBlockCountInformationArray getBlockCountInformation(int[] iArr, int i, int i2) {
                FelicaResultInfoBlockCountInformationArray felicaResultInfoBlockCountInformationArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoBlockCountInformationArray = (FelicaResultInfoBlockCountInformationArray) FelicaResultInfoBlockCountInformationArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoBlockCountInformationArray = null;
                    }
                    return felicaResultInfoBlockCountInformationArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoByteArray getContainerId(int i, int i2) {
                FelicaResultInfoByteArray felicaResultInfoByteArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoByteArray = (FelicaResultInfoByteArray) FelicaResultInfoByteArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoByteArray = null;
                    }
                    return felicaResultInfoByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoByteArray getContainerIssueInformation(int i, int i2) {
                FelicaResultInfoByteArray felicaResultInfoByteArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoByteArray = (FelicaResultInfoByteArray) FelicaResultInfoByteArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoByteArray = null;
                    }
                    return felicaResultInfoByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoByteArray getICCode() {
                FelicaResultInfoByteArray felicaResultInfoByteArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoByteArray = (FelicaResultInfoByteArray) FelicaResultInfoByteArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoByteArray = null;
                    }
                    return felicaResultInfoByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoByteArray getIDm() {
                FelicaResultInfoByteArray felicaResultInfoByteArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoByteArray = (FelicaResultInfoByteArray) FelicaResultInfoByteArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoByteArray = null;
                    }
                    return felicaResultInfoByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoInt getInterface() {
                FelicaResultInfoInt felicaResultInfoInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoInt = (FelicaResultInfoInt) FelicaResultInfoInt.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoInt = null;
                    }
                    return felicaResultInfoInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public FelicaResultInfoInt getKeyVersion(int i, int i2, int i3) {
                FelicaResultInfoInt felicaResultInfoInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoInt = (FelicaResultInfoInt) FelicaResultInfoInt.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoInt = null;
                    }
                    return felicaResultInfoInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoKeyInformationArray getKeyVersionV2(int[] iArr, int i, int i2) {
                FelicaResultInfoKeyInformationArray felicaResultInfoKeyInformationArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoKeyInformationArray = (FelicaResultInfoKeyInformationArray) FelicaResultInfoKeyInformationArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoKeyInformationArray = null;
                    }
                    return felicaResultInfoKeyInformationArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoNodeInformation getNodeInformation(int i, int i2, int i3) {
                FelicaResultInfoNodeInformation felicaResultInfoNodeInformation;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoNodeInformation = (FelicaResultInfoNodeInformation) FelicaResultInfoNodeInformation.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoNodeInformation = null;
                    }
                    return felicaResultInfoNodeInformation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoNodeInformation getPrivacyNodeInformation(int i, int i2, int i3) {
                FelicaResultInfoNodeInformation felicaResultInfoNodeInformation;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoNodeInformation = (FelicaResultInfoNodeInformation) FelicaResultInfoNodeInformation.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoNodeInformation = null;
                    }
                    return felicaResultInfoNodeInformation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoBoolean getRFSState() {
                FelicaResultInfoBoolean felicaResultInfoBoolean;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoBoolean = (FelicaResultInfoBoolean) FelicaResultInfoBoolean.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoBoolean = null;
                    }
                    return felicaResultInfoBoolean;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoInt getSelectTimeout() {
                FelicaResultInfoInt felicaResultInfoInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoInt = (FelicaResultInfoInt) FelicaResultInfoInt.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoInt = null;
                    }
                    return felicaResultInfoInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoInt getSystemCode() {
                FelicaResultInfoInt felicaResultInfoInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoInt = (FelicaResultInfoInt) FelicaResultInfoInt.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoInt = null;
                    }
                    return felicaResultInfoInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoIntArray getSystemCodeList(int i, int i2) {
                FelicaResultInfoIntArray felicaResultInfoIntArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoIntArray = (FelicaResultInfoIntArray) FelicaResultInfoIntArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoIntArray = null;
                    }
                    return felicaResultInfoIntArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo inactivateFelica() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo open() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo push(PushSegmentParcelableWrapper pushSegmentParcelableWrapper) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pushSegmentParcelableWrapper != null) {
                        obtain.writeInt(1);
                        pushSegmentParcelableWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfoDataArray read(BlockList blockList, int i, int i2) {
                FelicaResultInfoDataArray felicaResultInfoDataArray;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (blockList != null) {
                        obtain.writeInt(1);
                        blockList.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoDataArray = (FelicaResultInfoDataArray) FelicaResultInfoDataArray.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoDataArray = null;
                    }
                    return felicaResultInfoDataArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo reset() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo select(int i) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo selectWithTarget(int i, int i2) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo setNodeCodeSize(int i, int i2, int i3) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo setPrivacy(PrivacySettingData[] privacySettingDataArr, int i, int i2) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedArray(privacySettingDataArr, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo setPushNotificationListener(IFelicaPushAppNotificationListener iFelicaPushAppNotificationListener, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iFelicaPushAppNotificationListener != null) {
                        iBinder = iFelicaPushAppNotificationListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.mRemote.transact(24, obtain, obtain2, 0);
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

            public FelicaResultInfo setSelectTimeout(int i) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FelicaResultInfo write(BlockDataList blockDataList, int i, int i2) {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (blockDataList != null) {
                        obtain.writeInt(1);
                        blockDataList.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfo = (FelicaResultInfo) FelicaResultInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfo = null;
                    }
                    return felicaResultInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFelica asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFelica)) {
                return new Proxy(iBinder);
            }
            return (IFelica) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                PushSegmentParcelableWrapper pushSegmentParcelableWrapper = null;
                BlockDataList blockDataList = null;
                BlockList blockList = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo activateFelica = activateFelica(parcel.createStringArray(), IFelicaEventListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (activateFelica != null) {
                            parcel2.writeInt(1);
                            activateFelica.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo close = close();
                        parcel2.writeNoException();
                        if (close != null) {
                            parcel2.writeInt(1);
                            close.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoBlockCountInformationArray blockCountInformation = getBlockCountInformation(parcel.createIntArray(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (blockCountInformation != null) {
                            parcel2.writeInt(1);
                            blockCountInformation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoByteArray containerId = getContainerId(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (containerId != null) {
                            parcel2.writeInt(1);
                            containerId.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoByteArray containerIssueInformation = getContainerIssueInformation(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (containerIssueInformation != null) {
                            parcel2.writeInt(1);
                            containerIssueInformation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoByteArray iCCode = getICCode();
                        parcel2.writeNoException();
                        if (iCCode != null) {
                            parcel2.writeInt(1);
                            iCCode.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoByteArray iDm = getIDm();
                        parcel2.writeNoException();
                        if (iDm != null) {
                            parcel2.writeInt(1);
                            iDm.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoInt felicaResultInfoInt = getInterface();
                        parcel2.writeNoException();
                        if (felicaResultInfoInt != null) {
                            parcel2.writeInt(1);
                            felicaResultInfoInt.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoInt keyVersion = getKeyVersion(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (keyVersion != null) {
                            parcel2.writeInt(1);
                            keyVersion.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoNodeInformation nodeInformation = getNodeInformation(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (nodeInformation != null) {
                            parcel2.writeInt(1);
                            nodeInformation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoNodeInformation privacyNodeInformation = getPrivacyNodeInformation(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (privacyNodeInformation != null) {
                            parcel2.writeInt(1);
                            privacyNodeInformation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoBoolean rFSState = getRFSState();
                        parcel2.writeNoException();
                        if (rFSState != null) {
                            parcel2.writeInt(1);
                            rFSState.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoInt systemCode = getSystemCode();
                        parcel2.writeNoException();
                        if (systemCode != null) {
                            parcel2.writeInt(1);
                            systemCode.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoIntArray systemCodeList = getSystemCodeList(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (systemCodeList != null) {
                            parcel2.writeInt(1);
                            systemCodeList.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo inactivateFelica = inactivateFelica();
                        parcel2.writeNoException();
                        if (inactivateFelica != null) {
                            parcel2.writeInt(1);
                            inactivateFelica.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo open = open();
                        parcel2.writeNoException();
                        if (open != null) {
                            parcel2.writeInt(1);
                            open.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            pushSegmentParcelableWrapper = (PushSegmentParcelableWrapper) PushSegmentParcelableWrapper.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfo push = push(pushSegmentParcelableWrapper);
                        parcel2.writeNoException();
                        if (push != null) {
                            parcel2.writeInt(1);
                            push.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            blockList = (BlockList) BlockList.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfoDataArray read = read(blockList, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (read != null) {
                            parcel2.writeInt(1);
                            read.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo reset = reset();
                        parcel2.writeNoException();
                        if (reset != null) {
                            parcel2.writeInt(1);
                            reset.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo select = select(parcel.readInt());
                        parcel2.writeNoException();
                        if (select != null) {
                            parcel2.writeInt(1);
                            select.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo selectWithTarget = selectWithTarget(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (selectWithTarget != null) {
                            parcel2.writeInt(1);
                            selectWithTarget.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo privacy = setPrivacy((PrivacySettingData[]) parcel.createTypedArray(PrivacySettingData.CREATOR), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (privacy != null) {
                            parcel2.writeInt(1);
                            privacy.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            blockDataList = (BlockDataList) BlockDataList.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfo write = write(blockDataList, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (write != null) {
                            parcel2.writeInt(1);
                            write.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo pushNotificationListener = setPushNotificationListener(IFelicaPushAppNotificationListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        if (pushNotificationListener != null) {
                            parcel2.writeInt(1);
                            pushNotificationListener.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo nodeCodeSize = setNodeCodeSize(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (nodeCodeSize != null) {
                            parcel2.writeInt(1);
                            nodeCodeSize.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo checkOnlineAccess = checkOnlineAccess();
                        parcel2.writeNoException();
                        if (checkOnlineAccess != null) {
                            parcel2.writeInt(1);
                            checkOnlineAccess.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo selectTimeout = setSelectTimeout(parcel.readInt());
                        parcel2.writeNoException();
                        if (selectTimeout != null) {
                            parcel2.writeInt(1);
                            selectTimeout.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoInt selectTimeout2 = getSelectTimeout();
                        parcel2.writeNoException();
                        if (selectTimeout2 != null) {
                            parcel2.writeInt(1);
                            selectTimeout2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo cancelOffline = cancelOffline();
                        parcel2.writeNoException();
                        if (cancelOffline != null) {
                            parcel2.writeInt(1);
                            cancelOffline.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoByteArray executeFelicaCommand = executeFelicaCommand(parcel.createByteArray(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (executeFelicaCommand != null) {
                            parcel2.writeInt(1);
                            executeFelicaCommand.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoKeyInformationArray keyVersionV2 = getKeyVersionV2(parcel.createIntArray(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (keyVersionV2 != null) {
                            parcel2.writeInt(1);
                            keyVersionV2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    FelicaResultInfo activateFelica(String[] strArr, IFelicaEventListener iFelicaEventListener);

    FelicaResultInfo cancelOffline();

    FelicaResultInfo checkOnlineAccess();

    FelicaResultInfo close();

    FelicaResultInfoByteArray executeFelicaCommand(byte[] bArr, int i, int i2);

    FelicaResultInfoBlockCountInformationArray getBlockCountInformation(int[] iArr, int i, int i2);

    FelicaResultInfoByteArray getContainerId(int i, int i2);

    FelicaResultInfoByteArray getContainerIssueInformation(int i, int i2);

    FelicaResultInfoByteArray getICCode();

    FelicaResultInfoByteArray getIDm();

    FelicaResultInfoInt getInterface();

    FelicaResultInfoInt getKeyVersion(int i, int i2, int i3);

    FelicaResultInfoKeyInformationArray getKeyVersionV2(int[] iArr, int i, int i2);

    FelicaResultInfoNodeInformation getNodeInformation(int i, int i2, int i3);

    FelicaResultInfoNodeInformation getPrivacyNodeInformation(int i, int i2, int i3);

    FelicaResultInfoBoolean getRFSState();

    FelicaResultInfoInt getSelectTimeout();

    FelicaResultInfoInt getSystemCode();

    FelicaResultInfoIntArray getSystemCodeList(int i, int i2);

    FelicaResultInfo inactivateFelica();

    FelicaResultInfo open();

    FelicaResultInfo push(PushSegmentParcelableWrapper pushSegmentParcelableWrapper);

    FelicaResultInfoDataArray read(BlockList blockList, int i, int i2);

    FelicaResultInfo reset();

    FelicaResultInfo select(int i);

    FelicaResultInfo selectWithTarget(int i, int i2);

    FelicaResultInfo setNodeCodeSize(int i, int i2, int i3);

    FelicaResultInfo setPrivacy(PrivacySettingData[] privacySettingDataArr, int i, int i2);

    FelicaResultInfo setPushNotificationListener(IFelicaPushAppNotificationListener iFelicaPushAppNotificationListener, String str);

    FelicaResultInfo setSelectTimeout(int i);

    FelicaResultInfo write(BlockDataList blockDataList, int i, int i2);
}
