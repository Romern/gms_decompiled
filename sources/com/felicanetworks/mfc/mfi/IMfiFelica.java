package com.felicanetworks.mfc.mfi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.BlockDataList;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.DeviceList;
import com.felicanetworks.mfc.FelicaResultInfo;
import com.felicanetworks.mfc.FelicaResultInfoBlockCountInformationArray;
import com.felicanetworks.mfc.FelicaResultInfoBoolean;
import com.felicanetworks.mfc.FelicaResultInfoByteArray;
import com.felicanetworks.mfc.FelicaResultInfoDataArray;
import com.felicanetworks.mfc.FelicaResultInfoInt;
import com.felicanetworks.mfc.FelicaResultInfoIntArray;
import com.felicanetworks.mfc.FelicaResultInfoKeyInformationArray;
import com.felicanetworks.mfc.FelicaResultInfoNodeInformation;
import com.felicanetworks.mfc.IFSCEventListener;
import com.felicanetworks.mfc.IFelicaEventListener;
import com.felicanetworks.mfc.IFelicaPushAppNotificationListener;
import com.felicanetworks.mfc.PrivacySettingData;
import com.felicanetworks.mfc.PushSegmentParcelableWrapper;
import com.felicanetworks.mfc.mfi.ICardAdditionalInfoListEventCallback;
import com.felicanetworks.mfc.mfi.ICardDeleteEventCallback;
import com.felicanetworks.mfc.mfi.ICardDisableEventCallback;
import com.felicanetworks.mfc.mfi.ICardEnableEventCallback;
import com.felicanetworks.mfc.mfi.ICardIssueEventCallback;
import com.felicanetworks.mfc.mfi.ICardListEventCallback;
import com.felicanetworks.mfc.mfi.ILoginEventCallback;
import com.felicanetworks.mfc.mfi.ILogoutEventCallback;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface IMfiFelica extends IInterface {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class Stub extends Binder implements IMfiFelica {
        private static final String DESCRIPTOR = "com.felicanetworks.mfc.mfi.IMfiFelica";
        static final int TRANSACTION_activateFelica = 1;
        static final int TRANSACTION_cancelCardOperation = 43;
        static final int TRANSACTION_cancelOffline = 29;
        static final int TRANSACTION_checkOnlineAccess = 26;
        static final int TRANSACTION_clearMfiAccount = 34;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_delete = 42;
        static final int TRANSACTION_disable = 41;
        static final int TRANSACTION_enable = 40;
        static final int TRANSACTION_executeFelicaCommand = 30;
        static final int TRANSACTION_getBlockCountInformation = 3;
        static final int TRANSACTION_getCardAdditionalInfoList = 38;
        static final int TRANSACTION_getCardList = 37;
        static final int TRANSACTION_getContainerId = 4;
        static final int TRANSACTION_getContainerIssueInformation = 5;
        static final int TRANSACTION_getCurrentAccountHash = 33;
        static final int TRANSACTION_getICCode = 6;
        static final int TRANSACTION_getIDm = 7;
        static final int TRANSACTION_getInterface = 8;
        static final int TRANSACTION_getKeyVersion = 9;
        static final int TRANSACTION_getKeyVersionV2 = 31;
        static final int TRANSACTION_getNodeInformation = 10;
        static final int TRANSACTION_getPrivacyNodeInformation = 11;
        static final int TRANSACTION_getRFSState = 12;
        static final int TRANSACTION_getSeInfomation = 35;
        static final int TRANSACTION_getSelectTimeout = 28;
        static final int TRANSACTION_getSystemCode = 13;
        static final int TRANSACTION_getSystemCodeList = 14;
        static final int TRANSACTION_inactivateFelica = 15;
        static final int TRANSACTION_issueCard = 39;
        static final int TRANSACTION_login = 32;
        static final int TRANSACTION_logout = 36;
        static final int TRANSACTION_notifyError = 47;
        static final int TRANSACTION_notifyResult = 46;
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
        static final int TRANSACTION_start = 44;
        static final int TRANSACTION_stop = 45;
        static final int TRANSACTION_write = 23;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        class Proxy implements IMfiFelica {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public FelicaResultInfo activateFelica(String str, IFelicaEventListener iFelicaEventListener) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
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

            public FelicaResultInfo cancelCardOperation() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(43, obtain, obtain2, 0);
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

            public FelicaResultInfo clearMfiAccount() {
                FelicaResultInfo felicaResultInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(34, obtain, obtain2, 0);
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

            public FelicaResultInfo delete(CardInfo cardInfo, String str, ICardDeleteEventCallback iCardDeleteEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (cardInfo != null) {
                        obtain.writeInt(1);
                        cardInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iCardDeleteEventCallback != null) {
                        iBinder = iCardDeleteEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(42, obtain, obtain2, 0);
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

            public FelicaResultInfo disable(CardInfo cardInfo, ICardDisableEventCallback iCardDisableEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (cardInfo != null) {
                        obtain.writeInt(1);
                        cardInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    FelicaResultInfo felicaResultInfo = null;
                    if (iCardDisableEventCallback != null) {
                        iBinder = iCardDisableEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_disable, obtain, obtain2, 0);
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

            public FelicaResultInfo enable(CardInfo cardInfo, ICardEnableEventCallback iCardEnableEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (cardInfo != null) {
                        obtain.writeInt(1);
                        cardInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    FelicaResultInfo felicaResultInfo = null;
                    if (iCardEnableEventCallback != null) {
                        iBinder = iCardEnableEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(40, obtain, obtain2, 0);
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

            public FelicaResultInfo getCardAdditionalInfoList(ICardAdditionalInfoListEventCallback iCardAdditionalInfoListEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iCardAdditionalInfoListEventCallback != null) {
                        iBinder = iCardAdditionalInfoListEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(38, obtain, obtain2, 0);
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

            public FelicaResultInfo getCardList(ICardListEventCallback iCardListEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iCardListEventCallback != null) {
                        iBinder = iCardListEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(37, obtain, obtain2, 0);
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

            public FelicaResultInfoString getCurrentAccountHash() {
                FelicaResultInfoString felicaResultInfoString;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoString = (FelicaResultInfoString) FelicaResultInfoString.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoString = null;
                    }
                    return felicaResultInfoString;
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

            public FelicaResultInfoSeInfo getSeInfomation() {
                FelicaResultInfoSeInfo felicaResultInfoSeInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        felicaResultInfoSeInfo = (FelicaResultInfoSeInfo) FelicaResultInfoSeInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        felicaResultInfoSeInfo = null;
                    }
                    return felicaResultInfoSeInfo;
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

            public FelicaResultInfo issueCard(String str, ICardIssueEventCallback iCardIssueEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iCardIssueEventCallback != null) {
                        iBinder = iCardIssueEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(39, obtain, obtain2, 0);
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

            public FelicaResultInfo login(String str, String str2, ILoginEventCallback iLoginEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iLoginEventCallback != null) {
                        iBinder = iLoginEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(32, obtain, obtain2, 0);
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

            public FelicaResultInfo logout(boolean z, ILogoutEventCallback iLogoutEventCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    FelicaResultInfo felicaResultInfo = null;
                    if (iLogoutEventCallback != null) {
                        iBinder = iLogoutEventCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(36, obtain, obtain2, 0);
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

            public void notifyError(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(47, obtain, obtain2, 0);
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
                    this.mRemote.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
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

            public FelicaResultInfo start(String str, DeviceList deviceList, IFSCEventListener iFSCEventListener, IMfiFelica iMfiFelica) {
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
                    if (iMfiFelica != null) {
                        iBinder2 = iMfiFelica.asBinder();
                    } else {
                        iBinder2 = null;
                    }
                    obtain.writeStrongBinder(iBinder2);
                    this.mRemote.transact(44, obtain, obtain2, 0);
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
                    this.mRemote.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
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

        public static IMfiFelica asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMfiFelica)) {
                return new Proxy(iBinder);
            }
            return (IMfiFelica) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z;
            if (i != 1598968902) {
                PushSegmentParcelableWrapper pushSegmentParcelableWrapper = null;
                DeviceList deviceList = null;
                CardInfo cardInfo = null;
                CardInfo cardInfo2 = null;
                CardInfo cardInfo3 = null;
                BlockDataList blockDataList = null;
                BlockList blockList = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo activateFelica = activateFelica(parcel.readString(), IFelicaEventListener.Stub.asInterface(parcel.readStrongBinder()));
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
                    case 32:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo login = login(parcel.readString(), parcel.readString(), ILoginEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (login != null) {
                            parcel2.writeInt(1);
                            login.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 33:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoString currentAccountHash = getCurrentAccountHash();
                        parcel2.writeNoException();
                        if (currentAccountHash != null) {
                            parcel2.writeInt(1);
                            currentAccountHash.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 34:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo clearMfiAccount = clearMfiAccount();
                        parcel2.writeNoException();
                        if (clearMfiAccount != null) {
                            parcel2.writeInt(1);
                            clearMfiAccount.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 35:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfoSeInfo seInfomation = getSeInfomation();
                        parcel2.writeNoException();
                        if (seInfomation != null) {
                            parcel2.writeInt(1);
                            seInfomation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 36:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        FelicaResultInfo logout = logout(z, ILogoutEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (logout != null) {
                            parcel2.writeInt(1);
                            logout.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 37:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo cardList = getCardList(ICardListEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (cardList != null) {
                            parcel2.writeInt(1);
                            cardList.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 38:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo cardAdditionalInfoList = getCardAdditionalInfoList(ICardAdditionalInfoListEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (cardAdditionalInfoList != null) {
                            parcel2.writeInt(1);
                            cardAdditionalInfoList.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 39:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo issueCard = issueCard(parcel.readString(), ICardIssueEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (issueCard != null) {
                            parcel2.writeInt(1);
                            issueCard.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 40:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            cardInfo3 = (CardInfo) CardInfo.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfo enable = enable(cardInfo3, ICardEnableEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (enable != null) {
                            parcel2.writeInt(1);
                            enable.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case TRANSACTION_disable /*41*/:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            cardInfo2 = (CardInfo) CardInfo.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfo disable = disable(cardInfo2, ICardDisableEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (disable != null) {
                            parcel2.writeInt(1);
                            disable.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 42:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            cardInfo = (CardInfo) CardInfo.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfo delete = delete(cardInfo, parcel.readString(), ICardDeleteEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (delete != null) {
                            parcel2.writeInt(1);
                            delete.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 43:
                        parcel.enforceInterface(DESCRIPTOR);
                        FelicaResultInfo cancelCardOperation = cancelCardOperation();
                        parcel2.writeNoException();
                        if (cancelCardOperation != null) {
                            parcel2.writeInt(1);
                            cancelCardOperation.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 44:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            deviceList = (DeviceList) DeviceList.CREATOR.createFromParcel(parcel);
                        }
                        FelicaResultInfo start = start(readString, deviceList, IFSCEventListener.Stub.asInterface(parcel.readStrongBinder()), asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (start != null) {
                            parcel2.writeInt(1);
                            start.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 45:
                        parcel.enforceInterface(DESCRIPTOR);
                        stop();
                        parcel2.writeNoException();
                        return true;
                    case 46:
                        parcel.enforceInterface(DESCRIPTOR);
                        notifyResult(parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface(DESCRIPTOR);
                        notifyError(parcel.readString());
                        parcel2.writeNoException();
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

    FelicaResultInfo activateFelica(String str, IFelicaEventListener iFelicaEventListener);

    FelicaResultInfo cancelCardOperation();

    FelicaResultInfo cancelOffline();

    FelicaResultInfo checkOnlineAccess();

    FelicaResultInfo clearMfiAccount();

    FelicaResultInfo close();

    FelicaResultInfo delete(CardInfo cardInfo, String str, ICardDeleteEventCallback iCardDeleteEventCallback);

    FelicaResultInfo disable(CardInfo cardInfo, ICardDisableEventCallback iCardDisableEventCallback);

    FelicaResultInfo enable(CardInfo cardInfo, ICardEnableEventCallback iCardEnableEventCallback);

    FelicaResultInfoByteArray executeFelicaCommand(byte[] bArr, int i, int i2);

    FelicaResultInfoBlockCountInformationArray getBlockCountInformation(int[] iArr, int i, int i2);

    FelicaResultInfo getCardAdditionalInfoList(ICardAdditionalInfoListEventCallback iCardAdditionalInfoListEventCallback);

    FelicaResultInfo getCardList(ICardListEventCallback iCardListEventCallback);

    FelicaResultInfoByteArray getContainerId(int i, int i2);

    FelicaResultInfoByteArray getContainerIssueInformation(int i, int i2);

    FelicaResultInfoString getCurrentAccountHash();

    FelicaResultInfoByteArray getICCode();

    FelicaResultInfoByteArray getIDm();

    FelicaResultInfoInt getInterface();

    FelicaResultInfoInt getKeyVersion(int i, int i2, int i3);

    FelicaResultInfoKeyInformationArray getKeyVersionV2(int[] iArr, int i, int i2);

    FelicaResultInfoNodeInformation getNodeInformation(int i, int i2, int i3);

    FelicaResultInfoNodeInformation getPrivacyNodeInformation(int i, int i2, int i3);

    FelicaResultInfoBoolean getRFSState();

    FelicaResultInfoSeInfo getSeInfomation();

    FelicaResultInfoInt getSelectTimeout();

    FelicaResultInfoInt getSystemCode();

    FelicaResultInfoIntArray getSystemCodeList(int i, int i2);

    FelicaResultInfo inactivateFelica();

    FelicaResultInfo issueCard(String str, ICardIssueEventCallback iCardIssueEventCallback);

    FelicaResultInfo login(String str, String str2, ILoginEventCallback iLoginEventCallback);

    FelicaResultInfo logout(boolean z, ILogoutEventCallback iLogoutEventCallback);

    void notifyError(String str);

    void notifyResult(byte[] bArr);

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

    FelicaResultInfo start(String str, DeviceList deviceList, IFSCEventListener iFSCEventListener, IMfiFelica iMfiFelica);

    void stop();

    FelicaResultInfo write(BlockDataList blockDataList, int i, int i2);
}
