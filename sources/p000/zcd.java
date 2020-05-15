package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import java.util.List;

/* renamed from: zcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zcd extends dck implements IInterface {

    /* renamed from: a */
    private final zbw f54913a;

    /* renamed from: b */
    private final zcc f54914b;

    /* renamed from: c */
    private final zbq f54915c;

    /* renamed from: d */
    private final zbz f54916d;

    /* renamed from: e */
    private final zbh f54917e;

    /* renamed from: f */
    private final zbk f54918f;

    /* renamed from: g */
    private final zbt f54919g;

    public zcd() {
        super("com.google.android.gms.fitness.internal.IGoogleFitnessService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        zba zba;
        zcj zcj;
        zcl zcl;
        zcl zcl2;
        zcl zcl3;
        zce zce;
        zcl zcl4;
        zax zax;
        IBinder iBinder;
        zcl zcl5;
        zch zch;
        IBinder iBinder2;
        zcl zcl6;
        zci zci;
        zbb zbb;
        zbb zbb2;
        zcl zcl7;
        zcl zcl8;
        zcl zcl9;
        zcl zcl10;
        zcj zcj2;
        zcl zcl11;
        zcl zcl12;
        zcl zcl13;
        zcl zcl14;
        zcv zcv;
        zcm zcm;
        Parcel parcel3 = parcel;
        switch (i) {
            case 1:
                DataSourcesRequest dataSourcesRequest = (DataSourcesRequest) dcl.m8163a(parcel3, DataSourcesRequest.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    zba = queryLocalInterface instanceof zba ? (zba) queryLocalInterface : new zay(readStrongBinder);
                } else {
                    zba = null;
                }
                parcel.readString();
                this.f54916d.mo30920a(new DataSourcesRequest(dataSourcesRequest, zba));
                return true;
            case 2:
                SensorRegistrationRequest sensorRegistrationRequest = (SensorRegistrationRequest) dcl.m8163a(parcel3, SensorRegistrationRequest.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcj = queryLocalInterface2 instanceof zcl ? (zcl) queryLocalInterface2 : new zcj(readStrongBinder2);
                } else {
                    zcj = null;
                }
                parcel.readString();
                this.f54916d.mo30921a(new SensorRegistrationRequest(sensorRegistrationRequest.f32274a, sensorRegistrationRequest.f32275b, sensorRegistrationRequest.f32276c, sensorRegistrationRequest.f32279f, sensorRegistrationRequest.f32277d, sensorRegistrationRequest.f32280g, sensorRegistrationRequest.f32278e, sensorRegistrationRequest.f32281h, sensorRegistrationRequest.f32283j, sensorRegistrationRequest.f32282i, zcj));
                return true;
            case 3:
                SensorUnregistrationRequest sensorUnregistrationRequest = (SensorUnregistrationRequest) dcl.m8163a(parcel3, SensorUnregistrationRequest.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl = queryLocalInterface3 instanceof zcl ? (zcl) queryLocalInterface3 : new zcj(readStrongBinder3);
                } else {
                    zcl = null;
                }
                parcel.readString();
                this.f54916d.mo30922a(new SensorUnregistrationRequest(sensorUnregistrationRequest.f32285a, sensorUnregistrationRequest.f32286b, zcl));
                return true;
            case 4:
                SubscribeRequest subscribeRequest = (SubscribeRequest) dcl.m8163a(parcel3, SubscribeRequest.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl2 = queryLocalInterface4 instanceof zcl ? (zcl) queryLocalInterface4 : new zcj(readStrongBinder4);
                } else {
                    zcl2 = null;
                }
                parcel.readString();
                this.f54913a.mo30918a(new SubscribeRequest(subscribeRequest.f32317a, subscribeRequest.f32318b, zcl2));
                return true;
            case 5:
                UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) dcl.m8163a(parcel3, UnsubscribeRequest.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl3 = queryLocalInterface5 instanceof zcl ? (zcl) queryLocalInterface5 : new zcj(readStrongBinder5);
                } else {
                    zcl3 = null;
                }
                parcel.readString();
                this.f54913a.mo30919a(new UnsubscribeRequest(unsubscribeRequest.f32322a, unsubscribeRequest.f32323b, zcl3));
                return true;
            case 6:
                ListSubscriptionsRequest listSubscriptionsRequest = (ListSubscriptionsRequest) dcl.m8163a(parcel3, ListSubscriptionsRequest.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
                    zce = queryLocalInterface6 instanceof zce ? (zce) queryLocalInterface6 : new zce(readStrongBinder6);
                } else {
                    zce = null;
                }
                parcel.readString();
                this.f54913a.mo30917a(new ListSubscriptionsRequest(listSubscriptionsRequest.f32265a, zce));
                return true;
            case 7:
                DataInsertRequest dataInsertRequest = (DataInsertRequest) dcl.m8163a(parcel3, DataInsertRequest.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl4 = queryLocalInterface7 instanceof zcl ? (zcl) queryLocalInterface7 : new zcj(readStrongBinder7);
                } else {
                    zcl4 = null;
                }
                parcel.readString();
                this.f54915c.mo30911a(new DataInsertRequest(dataInsertRequest.f32212a, zcl4, dataInsertRequest.f32214c));
                return true;
            case 8:
                DataReadRequest dataReadRequest = (DataReadRequest) dcl.m8163a(parcel3, DataReadRequest.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
                    zax = queryLocalInterface8 instanceof zax ? (zax) queryLocalInterface8 : new zax(readStrongBinder8);
                } else {
                    zax = null;
                }
                parcel.readString();
                zbq zbq = this.f54915c;
                List list = dataReadRequest.f32215a;
                List list2 = dataReadRequest.f32216b;
                long j = dataReadRequest.f32217c;
                long j2 = dataReadRequest.f32218d;
                List list3 = dataReadRequest.f32219e;
                List list4 = dataReadRequest.f32220f;
                int i2 = dataReadRequest.f32221g;
                zax zax2 = zax;
                long j3 = dataReadRequest.f32222h;
                DataSource dataSource = dataReadRequest.f32223i;
                zbq zbq2 = zbq;
                int i3 = dataReadRequest.f32224j;
                boolean z = dataReadRequest.f32225k;
                boolean z2 = dataReadRequest.f32226l;
                List list5 = dataReadRequest.f32227m;
                List list6 = dataReadRequest.f32228n;
                if (zax2 != null) {
                    iBinder = zax2.f12819a;
                } else {
                    iBinder = null;
                }
                zbq2.mo30912a(new DataReadRequest(list, list2, j, j2, list3, list4, i2, j3, dataSource, i3, z, z2, iBinder, list5, list6));
                return true;
            case 9:
                SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) dcl.m8163a(parcel3, SessionInsertRequest.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl5 = queryLocalInterface9 instanceof zcl ? (zcl) queryLocalInterface9 : new zcj(readStrongBinder9);
                } else {
                    zcl5 = null;
                }
                parcel.readString();
                this.f54914b.mo30923a(new SessionInsertRequest(sessionInsertRequest.f32288a, sessionInsertRequest.f32289b, sessionInsertRequest.f32290c, zcl5));
                return true;
            case 10:
                SessionReadRequest sessionReadRequest = (SessionReadRequest) dcl.m8163a(parcel3, SessionReadRequest.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
                    zch = queryLocalInterface10 instanceof zch ? (zch) queryLocalInterface10 : new zch(readStrongBinder10);
                } else {
                    zch = null;
                }
                parcel.readString();
                zcc zcc = this.f54914b;
                String str = sessionReadRequest.f32292a;
                String str2 = sessionReadRequest.f32293b;
                long j4 = sessionReadRequest.f32294c;
                long j5 = sessionReadRequest.f32295d;
                List list7 = sessionReadRequest.f32296e;
                List list8 = sessionReadRequest.f32297f;
                boolean z3 = sessionReadRequest.f32298g;
                boolean z4 = sessionReadRequest.f32299h;
                List list9 = sessionReadRequest.f32300i;
                if (zch != null) {
                    iBinder2 = zch.f12819a;
                } else {
                    iBinder2 = null;
                }
                zcc.mo30924a(new SessionReadRequest(str, str2, j4, j5, list7, list8, z3, z4, list9, iBinder2));
                return true;
            case 11:
                SessionStartRequest sessionStartRequest = (SessionStartRequest) dcl.m8163a(parcel3, SessionStartRequest.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl6 = queryLocalInterface11 instanceof zcl ? (zcl) queryLocalInterface11 : new zcj(readStrongBinder11);
                } else {
                    zcl6 = null;
                }
                parcel.readString();
                this.f54914b.mo30926a(new SessionStartRequest(sessionStartRequest.f32304a, zcl6));
                return true;
            case 12:
                SessionStopRequest sessionStopRequest = (SessionStopRequest) dcl.m8163a(parcel3, SessionStopRequest.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
                    zci = queryLocalInterface12 instanceof zci ? (zci) queryLocalInterface12 : new zci(readStrongBinder12);
                } else {
                    zci = null;
                }
                parcel.readString();
                this.f54914b.mo30927a(new SessionStopRequest(sessionStopRequest.f32306a, sessionStopRequest.f32307b, zci));
                return true;
            case 13:
                DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) dcl.m8163a(parcel3, DataTypeCreateRequest.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
                    zbb = queryLocalInterface13 instanceof zbb ? (zbb) queryLocalInterface13 : new zbb(readStrongBinder13);
                } else {
                    zbb = null;
                }
                parcel.readString();
                this.f54918f.mo30907a(new DataTypeCreateRequest(dataTypeCreateRequest, zbb));
                return true;
            case 14:
                DataTypeReadRequest dataTypeReadRequest = (DataTypeReadRequest) dcl.m8163a(parcel3, DataTypeReadRequest.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
                    zbb2 = queryLocalInterface14 instanceof zbb ? (zbb) queryLocalInterface14 : new zbb(readStrongBinder14);
                } else {
                    zbb2 = null;
                }
                parcel.readString();
                this.f54918f.mo30908a(new DataTypeReadRequest(dataTypeReadRequest.f32242a, zbb2));
                return true;
            case 15:
                StartBleScanRequest startBleScanRequest = (StartBleScanRequest) dcl.m8163a(parcel3, StartBleScanRequest.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl7 = queryLocalInterface15 instanceof zcl ? (zcl) queryLocalInterface15 : new zcj(readStrongBinder15);
                } else {
                    zcl7 = null;
                }
                parcel.readString();
                this.f54917e.mo30904a(new StartBleScanRequest(startBleScanRequest, zcl7));
                return true;
            case 16:
                StopBleScanRequest stopBleScanRequest = (StopBleScanRequest) dcl.m8163a(parcel3, StopBleScanRequest.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl8 = queryLocalInterface16 instanceof zcl ? (zcl) queryLocalInterface16 : new zcj(readStrongBinder16);
                } else {
                    zcl8 = null;
                }
                parcel.readString();
                this.f54917e.mo30905a(new StopBleScanRequest(stopBleScanRequest.f32316b, zcl8));
                return true;
            case 17:
                ClaimBleDeviceRequest claimBleDeviceRequest = (ClaimBleDeviceRequest) dcl.m8163a(parcel3, ClaimBleDeviceRequest.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl9 = queryLocalInterface17 instanceof zcl ? (zcl) queryLocalInterface17 : new zcj(readStrongBinder17);
                } else {
                    zcl9 = null;
                }
                parcel.readString();
                this.f54917e.mo30902a(new ClaimBleDeviceRequest(claimBleDeviceRequest.f32196a, claimBleDeviceRequest.f32197b, zcl9));
                return true;
            case 18:
                UnclaimBleDeviceRequest unclaimBleDeviceRequest = (UnclaimBleDeviceRequest) dcl.m8163a(parcel3, UnclaimBleDeviceRequest.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl10 = queryLocalInterface18 instanceof zcl ? (zcl) queryLocalInterface18 : new zcj(readStrongBinder18);
                } else {
                    zcl10 = null;
                }
                parcel.readString();
                this.f54917e.mo30906a(new UnclaimBleDeviceRequest(unclaimBleDeviceRequest.f32320a, zcl10));
                return true;
            case 19:
                DataDeleteRequest dataDeleteRequest = (DataDeleteRequest) dcl.m8163a(parcel3, DataDeleteRequest.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcj2 = queryLocalInterface19 instanceof zcl ? (zcl) queryLocalInterface19 : new zcj(readStrongBinder19);
                } else {
                    zcj2 = null;
                }
                parcel.readString();
                this.f54915c.mo30910a(new DataDeleteRequest(dataDeleteRequest.f32202a, dataDeleteRequest.f32203b, dataDeleteRequest.f32204c, dataDeleteRequest.f32205d, dataDeleteRequest.f32206e, dataDeleteRequest.f32207f, dataDeleteRequest.f32208g, dataDeleteRequest.f32210i, dataDeleteRequest.f32211j, zcj2));
                parcel2.writeNoException();
                return true;
            case 20:
                SessionRegistrationRequest sessionRegistrationRequest = (SessionRegistrationRequest) dcl.m8163a(parcel3, SessionRegistrationRequest.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl11 = queryLocalInterface20 instanceof zcl ? (zcl) queryLocalInterface20 : new zcj(readStrongBinder20);
                } else {
                    zcl11 = null;
                }
                parcel.readString();
                this.f54914b.mo30925a(new SessionRegistrationRequest(sessionRegistrationRequest.f32302a, zcl11));
                return true;
            case 21:
                SessionUnregistrationRequest sessionUnregistrationRequest = (SessionUnregistrationRequest) dcl.m8163a(parcel3, SessionUnregistrationRequest.CREATOR);
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl12 = queryLocalInterface21 instanceof zcl ? (zcl) queryLocalInterface21 : new zcj(readStrongBinder21);
                } else {
                    zcl12 = null;
                }
                parcel.readString();
                this.f54914b.mo30928a(new SessionUnregistrationRequest(sessionUnregistrationRequest.f32309a, zcl12));
                return true;
            case 22:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl13 = queryLocalInterface22 instanceof zcl ? (zcl) queryLocalInterface22 : new zcj(readStrongBinder22);
                } else {
                    zcl13 = null;
                }
                parcel.readString();
                this.f54918f.mo30909a(new DisableFitRequest(zcl13));
                return true;
            case 23:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
                    zcl14 = queryLocalInterface23 instanceof zcl ? (zcl) queryLocalInterface23 : new zcj(readStrongBinder23);
                } else {
                    zcl14 = null;
                }
                parcel.readString();
                this.f54919g.mo30914a(new DeleteAllUserDataRequest(zcl14));
                return true;
            case 24:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
                    zcv = queryLocalInterface24 instanceof zcv ? (zcv) queryLocalInterface24 : new zct(readStrongBinder24);
                } else {
                    zcv = null;
                }
                parcel.readString();
                this.f54917e.mo30903a(new ListClaimedBleDevicesRequest(zcv));
                return true;
            case 25:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    zcm = queryLocalInterface25 instanceof zcm ? (zcm) queryLocalInterface25 : new zcm(readStrongBinder25);
                } else {
                    zcm = null;
                }
                parcel.readString();
                this.f54915c.mo30913a(new GetSyncInfoRequest(zcm));
                return true;
            default:
                return false;
        }
    }

    public zcd(zoc zoc, ytt ytt) {
        super("com.google.android.gms.fitness.internal.IGoogleFitnessService");
        this.f54913a = (zbw) zoc.f55582d.mo31232a(ytt);
        this.f54914b = (zcc) zoc.f55583e.mo31232a(ytt);
        this.f54915c = (zbq) zoc.f55584f.mo31232a(ytt);
        this.f54916d = (zbz) zoc.f55585g.mo31232a(ytt);
        this.f54917e = (zbh) zoc.f55586h.mo31232a(ytt);
        this.f54918f = (zbk) zoc.f55587i.mo31232a(ytt);
        this.f54919g = (zbt) zoc.f55588j.mo31232a(ytt);
    }
}
