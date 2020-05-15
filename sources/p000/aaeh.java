package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.video.VideoCapabilities;

/* renamed from: aaeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaeh extends dck implements IInterface {

    /* renamed from: a */
    public final rlf f28000a;

    /* renamed from: a */
    public void mo16776a() {
    }

    public aaeh(rlf rlf) {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
        sdo.m34966a(rlf, "Holder must not be null");
        this.f28000a = rlf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 6001) {
            parcel.readString();
        } else if (i == 6002) {
            parcel.readString();
        } else if (i == 12011) {
            DataHolder dataHolder = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
        } else if (i == 12012) {
            parcel.readInt();
            parcel.readString();
        } else if (i == 13001) {
            DataHolder dataHolder2 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
        } else if (i == 13002) {
            parcel.readInt();
        } else if (i == 19001) {
            parcel.readInt();
            VideoCapabilities videoCapabilities = (VideoCapabilities) dcl.m8163a(parcel, VideoCapabilities.CREATOR);
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    break;
                case 5002:
                    DataHolder dataHolder3 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5003:
                    parcel.readInt();
                    parcel.readString();
                    break;
                case 5004:
                    DataHolder dataHolder4 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5005:
                    DataHolder dataHolder5 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    DataHolder dataHolder6 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5006:
                    DataHolder dataHolder7 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5007:
                    DataHolder dataHolder8 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5008:
                    DataHolder dataHolder9 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5009:
                    DataHolder dataHolder10 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5010:
                    DataHolder dataHolder11 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                case 5011:
                    DataHolder dataHolder12 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                    break;
                default:
                    switch (i) {
                        case 5016:
                            mo16776a();
                            break;
                        case 5017:
                            DataHolder dataHolder13 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5018:
                            DataHolder dataHolder14 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5019:
                            DataHolder dataHolder15 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            break;
                        case 5021:
                            DataHolder dataHolder16 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5022:
                            DataHolder dataHolder17 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5023:
                            DataHolder dataHolder18 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5024:
                            DataHolder dataHolder19 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5025:
                            DataHolder dataHolder20 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5026:
                            DataHolder dataHolder21 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5027:
                            DataHolder dataHolder22 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5028:
                            DataHolder dataHolder23 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5029:
                            DataHolder dataHolder24 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5030:
                            DataHolder dataHolder25 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5031:
                            DataHolder dataHolder26 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5032:
                            RealTimeMessage realTimeMessage = (RealTimeMessage) dcl.m8163a(parcel, RealTimeMessage.CREATOR);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            dcl.m8167a(parcel);
                            break;
                        case 5035:
                            DataHolder dataHolder27 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5036:
                            parcel.readInt();
                            break;
                        case 5037:
                            DataHolder dataHolder28 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5038:
                            DataHolder dataHolder29 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5039:
                            DataHolder dataHolder30 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 5040:
                            parcel.readInt();
                            break;
                        case 9001:
                            DataHolder dataHolder31 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 11001:
                            parcel.readInt();
                            Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                            break;
                        case 12001:
                            DataHolder dataHolder32 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 14001:
                            DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                            break;
                        case 15001:
                            DataHolder dataHolder33 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 17002:
                            parcel.readInt();
                            break;
                        case 19008:
                            parcel.readInt();
                            break;
                        case 19009:
                            parcel.readInt();
                            break;
                        case 19010:
                            parcel.readInt();
                            break;
                        case 20001:
                            DataHolder dataHolder34 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20002:
                            DataHolder dataHolder35 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20003:
                            DataHolder dataHolder36 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20004:
                            DataHolder dataHolder37 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20005:
                            DataHolder dataHolder38 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20006:
                            DataHolder dataHolder39 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20007:
                            DataHolder dataHolder40 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20008:
                            DataHolder dataHolder41 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20009:
                            DataHolder dataHolder42 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                            break;
                        case 20012:
                            Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                            break;
                        case 20019:
                            parcel.readInt();
                            break;
                        case 20020:
                            parcel.readInt();
                            Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                            break;
                        case 23001:
                            parcel.readInt();
                            break;
                        case 23002:
                            parcel.readInt();
                            break;
                        case 23003:
                            parcel.readInt();
                            break;
                        case 23004:
                            parcel.readInt();
                            break;
                        case 23005:
                            parcel.readInt();
                            break;
                        case 24002:
                            dcl.m8167a(parcel);
                            break;
                        default:
                            switch (i) {
                                case 8001:
                                    DataHolder dataHolder43 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                                    break;
                                case 8003:
                                    DataHolder dataHolder44 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8004:
                                    DataHolder dataHolder45 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8005:
                                    DataHolder dataHolder46 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8006:
                                    DataHolder dataHolder47 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    break;
                                case 8008:
                                    DataHolder dataHolder48 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    break;
                                case 8010:
                                    parcel.readString();
                                    break;
                                default:
                                    switch (i) {
                                        case 10001:
                                            DataHolder dataHolder49 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            break;
                                        case 10003:
                                            DataHolder dataHolder50 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                            break;
                                        case 10004:
                                            DataHolder dataHolder51 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            Bundle bundle4 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                                            break;
                                        case 10006:
                                            DataHolder dataHolder52 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                            break;
                                        default:
                                            switch (i) {
                                                case 12004:
                                                    DataHolder dataHolder53 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                    Contents contents = (Contents) dcl.m8163a(parcel, Contents.CREATOR);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder54 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                    break;
                                                case 12006:
                                                    DataHolder dataHolder55 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                    break;
                                                case 12007:
                                                    DataHolder dataHolder56 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                    break;
                                                case 12008:
                                                    DataHolder dataHolder57 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 12014:
                                                            DataHolder dataHolder58 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            Bundle bundle5 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                                                            break;
                                                        case 12016:
                                                            DataHolder dataHolder59 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder60 = (DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR);
                                                            parcel.readString();
                                                            Contents contents2 = (Contents) dcl.m8163a(parcel, Contents.CREATOR);
                                                            Contents contents3 = (Contents) dcl.m8163a(parcel, Contents.CREATOR);
                                                            Contents contents4 = (Contents) dcl.m8163a(parcel, Contents.CREATOR);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            parcel.readInt();
            dcl.m8167a(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
