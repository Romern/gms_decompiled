package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.Felica;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.CustomVariable;
import com.google.android.gms.config.internal.FetchConfigIpcRequest;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: swz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swz extends dck implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ ConfigChimeraService f45324a;

    public swz() {
        super("com.google.android.gms.config.internal.IConfigService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c4  */
    /* renamed from: a */
    public final void mo26218a(swy swy, FetchConfigIpcRequest fetchConfigIpcRequest) {
        long j;
        swk swk;
        swk swk2;
        swj swj;
        Map map;
        List list;
        DataHolder dataHolder;
        Map map2;
        List list2;
        HashMap hashMap;
        DataHolder dataHolder2;
        swk swk3;
        long j2;
        boolean contains;
        long j3;
        int c;
        swy swy2 = swy;
        FetchConfigIpcRequest fetchConfigIpcRequest2 = fetchConfigIpcRequest;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        ConfigChimeraService configChimeraService = this.f45324a;
        asfb asfb = new asfb(configChimeraService, 1, "Config Fetch", "com.google.android.gms", fetchConfigIpcRequest2.f30448a);
        if (configChimeraService.f30433b == null) {
            configChimeraService.mo17950a();
            if (configChimeraService.f30433b == null) {
                configChimeraService.mo17953a(swy2, 6503);
                configChimeraService.mo17951a(asfb);
                j = clearCallingIdentity;
                Binder.restoreCallingIdentity(j);
            }
        }
        if (!configChimeraService.mo17954a(callingUid, fetchConfigIpcRequest2.f30448a)) {
            configChimeraService.mo17953a(swy2, 6500);
            configChimeraService.mo17951a(asfb);
            j = clearCallingIdentity;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            swo swo = new swo(configChimeraService, fetchConfigIpcRequest2.f30448a, fetchConfigIpcRequest2.f30451d);
            synchronized (configChimeraService.f30432a) {
                swk = (swk) configChimeraService.f30434c.get(fetchConfigIpcRequest2.f30448a);
            }
            if (swk == null) {
                swk3 = swk;
                j2 = clearCallingIdentity;
            } else if (swk.mo26203c()) {
                long j4 = fetchConfigIpcRequest2.f30449b;
                long convert = TimeUnit.MILLISECONDS.convert(j4, TimeUnit.SECONDS);
                if (j4 != Long.MAX_VALUE) {
                    List list3 = swk.f45287d;
                    long j5 = -1;
                    long longValue = (list3 == null || list3.isEmpty()) ? -1 : ((Long) swk.f45287d.get(0)).longValue();
                    if (longValue == -1 || convert < currentTimeMillis - longValue) {
                        String str = fetchConfigIpcRequest2.f30448a;
                        synchronized (configChimeraService.f30437f) {
                            contains = configChimeraService.f30438g.contains(str);
                        }
                        if (!contains) {
                            String str2 = fetchConfigIpcRequest2.f30448a;
                            if (swk.mo26203c()) {
                                List list4 = swk.f45287d;
                                if (list4 == null) {
                                    swk2 = swk;
                                } else if (!list4.isEmpty()) {
                                    List list5 = swk.f45288e;
                                    if (list5 != null && !list5.isEmpty() && ((Long) swk.f45287d.get(0)).longValue() <= ((Long) swk.f45288e.get(0)).longValue()) {
                                        swk2 = swk;
                                    } else {
                                        int b = configChimeraService.mo17956b(str2);
                                        if (swk.f45287d.size() >= b) {
                                            swk2 = swk;
                                            long convert2 = TimeUnit.MILLISECONDS.convert((long) configChimeraService.mo17949a(str2, "throttling_success_interval_seconds", 3600, 300, 86400), TimeUnit.SECONDS);
                                            int i = b;
                                            if (convert2 > currentTimeMillis - swk2.mo26199a(i)) {
                                                j = clearCallingIdentity;
                                                j3 = swk2.mo26199a(i) + convert2;
                                                if (j3 > 0) {
                                                    swj = swj.FETCH_NOT_THROTTLED;
                                                } else if (!Arrays.equals(swk2.f45285b, swo.m36531a(swo))) {
                                                    swj = swj.FETCH_NOT_THROTTLED;
                                                } else {
                                                    swj swj2 = swj.FETCH_THROTTLED;
                                                    swj2.f45283g = j3;
                                                    swj = swj2;
                                                }
                                            }
                                        } else {
                                            swk2 = swk;
                                        }
                                        j = clearCallingIdentity;
                                        j3 = -1;
                                        if (j3 > 0) {
                                        }
                                    }
                                } else {
                                    swk2 = swk;
                                }
                                if (swk2.f45288e != null && swk2.f45288e.size() >= (c = configChimeraService.mo17960c(str2))) {
                                    j = clearCallingIdentity;
                                    long convert3 = TimeUnit.MILLISECONDS.convert((long) configChimeraService.mo17949a(str2, "throttling_failure_interval_seconds", 3600, 300, 86400), TimeUnit.SECONDS);
                                    if (convert3 > currentTimeMillis - swk2.mo26201b(c)) {
                                        j5 = swk2.mo26201b(c) + convert3;
                                    }
                                    j3 = j5;
                                    if (j3 > 0) {
                                    }
                                }
                            } else {
                                swk2 = swk;
                            }
                            j = clearCallingIdentity;
                            j3 = j5;
                            if (j3 > 0) {
                            }
                        } else {
                            swk2 = swk;
                            j = clearCallingIdentity;
                            swj = swj.FETCH_ANOTHER_TASK_INFLIGHT;
                        }
                        if (swj != swj.FETCH_ANOTHER_TASK_INFLIGHT) {
                            synchronized (configChimeraService.f30432a) {
                                map2 = (Map) configChimeraService.f30433b.get(fetchConfigIpcRequest2.f30448a);
                                list2 = (List) configChimeraService.f30436e.get(fetchConfigIpcRequest2.f30448a);
                            }
                            DataHolder dataHolder3 = fetchConfigIpcRequest2.f30450c;
                            HashMap hashMap2 = new HashMap();
                            if (dataHolder3 != null) {
                                for (CustomVariable customVariable : new rts(dataHolder3, CustomVariable.CREATOR)) {
                                    hashMap2.put(customVariable.f30446a, customVariable.f30447b);
                                }
                                DataHolder dataHolder4 = fetchConfigIpcRequest2.f30450c;
                                if (dataHolder4 != null && !dataHolder4.mo17768b()) {
                                    fetchConfigIpcRequest2.f30450c.close();
                                }
                            }
                            byte[] a = configChimeraService.mo17955a(fetchConfigIpcRequest2.f30448a, hashMap2);
                            if (!swj.f45281e) {
                                boolean z = swj.f45282f;
                                boolean z2 = !Arrays.equals(a, swk2.f45286c);
                                int i2 = map2 == null ? 6503 : !z ? z2 ? -6508 : -6506 : z2 ? 6507 : 6502;
                                if (map2 != null) {
                                    dataHolder2 = configChimeraService.mo17958b(map2);
                                } else {
                                    dataHolder2 = null;
                                }
                                DataHolder b2 = configChimeraService.mo17957b(list2);
                                FetchConfigIpcResponse fetchConfigIpcResponse = new FetchConfigIpcResponse(i2, dataHolder2, -1, null);
                                if (i2 == 6502 || i2 == 6507) {
                                    fetchConfigIpcResponse = new FetchConfigIpcResponse(i2, dataHolder2, swj.f45283g, b2);
                                }
                                swy2.mo26197a(Status.f30107a, fetchConfigIpcResponse);
                                if (dataHolder2 != null && !dataHolder2.mo17768b()) {
                                    dataHolder2.close();
                                }
                                if (b2 != null && !b2.mo17768b()) {
                                    b2.close();
                                }
                                configChimeraService.mo17951a(asfb);
                            } else {
                                long j6 = fetchConfigIpcRequest2.f30449b;
                                int i3 = j6 < 2147483647L ? (int) j6 : Integer.MAX_VALUE;
                                String str3 = fetchConfigIpcRequest2.f30448a;
                                List list6 = fetchConfigIpcRequest2.f30454g;
                                String str4 = fetchConfigIpcRequest2.f30452e;
                                String str5 = fetchConfigIpcRequest2.f30453f;
                                int i4 = fetchConfigIpcRequest2.f30455h;
                                List list7 = fetchConfigIpcRequest2.f30456i;
                                int i5 = fetchConfigIpcRequest2.f30457j;
                                int i6 = fetchConfigIpcRequest2.f30458k;
                                swp swp = new swp();
                                swp.f45302b = str3;
                                swp.f45301a = configChimeraService;
                                swp.f45305e = hashMap2;
                                swp.f45304d = swo;
                                swo swo2 = swo;
                                swp swp2 = swp;
                                swp2.f45306f = configChimeraService.mo17949a(str3, "http_connection_timeout_millis", (int) Felica.MAX_TIMEOUT, 30000, 1800000);
                                swp2.f45307g = configChimeraService.mo17949a(str3, "http_read_timeout_millis", (int) Felica.MAX_TIMEOUT, 30000, 1800000);
                                swp2.f45308h = list6;
                                swp2.f45309i = str4;
                                swp2.f45310j = str5;
                                swp2.f45311k = i4;
                                swp2.f45312l = list7;
                                swp2.f45313m = i3;
                                swp2.f45314n = i5;
                                swp2.f45315o = i6;
                                synchronized (configChimeraService.f30432a) {
                                    if (configChimeraService.f30434c.get(str3) == null || ((swk) configChimeraService.f30434c.get(str3)).f45284a == null) {
                                        hashMap = null;
                                    } else {
                                        hashMap = new HashMap(((swk) configChimeraService.f30434c.get(str3)).f45284a);
                                    }
                                }
                                swp2.f45303c = hashMap;
                                new swm().execute(new swq(configChimeraService, swp2, str3, currentTimeMillis, swy, swo2, a, asfb));
                            }
                        } else {
                            synchronized (configChimeraService.f30432a) {
                                map = (Map) configChimeraService.f30433b.get(fetchConfigIpcRequest2.f30448a);
                                list = (List) configChimeraService.f30436e.get(fetchConfigIpcRequest2.f30448a);
                            }
                            if (map != null) {
                                dataHolder = configChimeraService.mo17958b(map);
                            } else {
                                dataHolder = null;
                            }
                            DataHolder b3 = configChimeraService.mo17957b(list);
                            swy.mo26197a(Status.f30107a, new FetchConfigIpcResponse(6501, dataHolder, b3));
                            if (dataHolder != null && !dataHolder.mo17768b()) {
                                dataHolder.close();
                            }
                            if (b3 != null && !b3.mo17768b()) {
                                b3.close();
                            }
                            configChimeraService.mo17951a(asfb);
                        }
                    }
                }
                swj = swj.CACHE;
                swk2 = swk;
                j = clearCallingIdentity;
                if (swj != swj.FETCH_ANOTHER_TASK_INFLIGHT) {
                }
            } else {
                swk3 = swk;
                j2 = clearCallingIdentity;
            }
            swj = swj.FETCH_NOT_THROTTLED;
            if (swj != swj.FETCH_ANOTHER_TASK_INFLIGHT) {
            }
        }
        Binder.restoreCallingIdentity(j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public swz(ConfigChimeraService configChimeraService) {
        super("com.google.android.gms.config.internal.IConfigService");
        this.f45324a = configChimeraService;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        swy swy;
        swy swy2;
        swy swy3;
        swy swy4 = null;
        if (i == 4) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                if (queryLocalInterface instanceof swy) {
                    swy = (swy) queryLocalInterface;
                    String readString = parcel.readString();
                    mo26218a(new swf(this, swy, Binder.getCallingUid(), readString, parcel.readString()), new FetchConfigIpcRequest(readString));
                } else {
                    swy4 = new sww(readStrongBinder);
                }
            }
            swy = swy4;
            String readString2 = parcel.readString();
            mo26218a(new swf(this, swy, Binder.getCallingUid(), readString2, parcel.readString()), new FetchConfigIpcRequest(readString2));
        } else if (i == 5) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                if (queryLocalInterface2 instanceof swy) {
                    swy2 = (swy) queryLocalInterface2;
                    String readString3 = parcel.readString();
                    mo26218a(new swh(this, swy2, Binder.getCallingUid(), readString3, parcel.readString()), new FetchConfigIpcRequest(readString3));
                } else {
                    swy4 = new sww(readStrongBinder2);
                }
            }
            swy2 = swy4;
            String readString32 = parcel.readString();
            mo26218a(new swh(this, swy2, Binder.getCallingUid(), readString32, parcel.readString()), new FetchConfigIpcRequest(readString32));
        } else if (i == 6) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                if (queryLocalInterface3 instanceof swy) {
                    swy3 = (swy) queryLocalInterface3;
                    String readString4 = parcel.readString();
                    mo26218a(new swg(this, swy3, Binder.getCallingUid(), readString4, dcl.m8168b(parcel)), new FetchConfigIpcRequest(readString4));
                } else {
                    swy4 = new sww(readStrongBinder3);
                }
            }
            swy3 = swy4;
            String readString42 = parcel.readString();
            mo26218a(new swg(this, swy3, Binder.getCallingUid(), readString42, dcl.m8168b(parcel)), new FetchConfigIpcRequest(readString42));
        } else if (i != 8) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.config.internal.IConfigCallbacks");
                if (queryLocalInterface4 instanceof swy) {
                    swy4 = (swy) queryLocalInterface4;
                } else {
                    swy4 = new sww(readStrongBinder4);
                }
            }
            mo26218a(swy4, (FetchConfigIpcRequest) dcl.m8163a(parcel, FetchConfigIpcRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
