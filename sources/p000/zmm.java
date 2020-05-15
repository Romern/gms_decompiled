package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: zmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zmm implements ytv {

    /* renamed from: a */
    final /* synthetic */ zmn f55469a;

    public zmm(zmn zmn) {
        this.f55469a = zmn;
    }

    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        bqgg bqgg;
        Status status;
        Context context;
        ytp ytp;
        String str;
        if (i == 0) {
            zmn zmn = this.f55469a;
            StartBleScanRequest startBleScanRequest = (StartBleScanRequest) obj;
            zcl zcl = startBleScanRequest.f32313c;
            if (!zmn.m45765c(ytt)) {
                zcl.mo30933a(Status.f30107a);
            } else {
                Status b = zmn.mo31258b();
                ytp ytp2 = zmn.f55476i;
                Context context2 = zmn.f55428a;
                String str2 = zmn.f55429b;
                bxvd da = bpgr.f137526x.mo74144da();
                String str3 = ytt.f54617a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr = (bpgr) da.f164949b;
                str3.getClass();
                int i2 = bpgr.f137528a | 1;
                bpgr.f137528a = i2;
                bpgr.f137529b = str3;
                int i3 = b.f30115i;
                bpgr.f137528a = 2 | i2;
                bpgr.f137530c = i3;
                bpfz bpfz = bpfz.f137465a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr2 = (bpgr) da.f164949b;
                bpfz.getClass();
                bpgr2.f137546s = bpfz;
                bpgr2.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                ytp2.mo30769a(context2, str2, (bpgr) da.mo74062i());
                if (!b.mo17710c()) {
                    zcl.mo30933a(b);
                } else {
                    zmn.f55473f.mo31118a(startBleScanRequest);
                    zcl.mo30933a(Status.f30107a);
                }
            }
            return true;
        } else if (i == 1) {
            zmn zmn2 = this.f55469a;
            StopBleScanRequest stopBleScanRequest = (StopBleScanRequest) obj;
            zcl zcl2 = stopBleScanRequest.f32315a;
            if (!zmn.m45765c(ytt)) {
                zcl2.mo30933a(Status.f30107a);
            } else {
                Status b2 = zmn2.mo31258b();
                ytp ytp3 = zmn2.f55476i;
                Context context3 = zmn2.f55428a;
                String str4 = zmn2.f55429b;
                bxvd da2 = bpgr.f137526x.mo74144da();
                String str5 = ytt.f54617a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgr bpgr3 = (bpgr) da2.f164949b;
                str5.getClass();
                int i4 = bpgr3.f137528a | 1;
                bpgr3.f137528a = i4;
                bpgr3.f137529b = str5;
                int i5 = b2.f30115i;
                bpgr3.f137528a = 2 | i4;
                bpgr3.f137530c = i5;
                bpga bpga = bpga.f137467a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgr bpgr4 = (bpgr) da2.f164949b;
                bpga.getClass();
                bpgr4.f137547t = bpga;
                bpgr4.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                ytp3.mo30769a(context3, str4, (bpgr) da2.mo74062i());
                if (b2.mo17710c()) {
                    zmn2.f55473f.mo31119a(stopBleScanRequest.f32316b);
                    zcl2.mo30933a(Status.f30107a);
                } else {
                    zcl2.mo30933a(b2);
                }
            }
            return true;
        } else if (i == 2) {
            zmn zmn3 = this.f55469a;
            ClaimBleDeviceRequest claimBleDeviceRequest = (ClaimBleDeviceRequest) obj;
            zcl zcl3 = claimBleDeviceRequest.f32198c;
            if (!zmn.m45765c(ytt)) {
                zcl3.mo30933a(new Status(5024));
            } else {
                Status b3 = zmn3.mo31258b();
                ytp ytp4 = zmn3.f55476i;
                Context context4 = zmn3.f55428a;
                String str6 = zmn3.f55429b;
                bxvd da3 = bpgr.f137526x.mo74144da();
                String str7 = ytt.f54617a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpgr bpgr5 = (bpgr) da3.f164949b;
                str7.getClass();
                bpgr5.f137528a |= 1;
                bpgr5.f137529b = str7;
                bpfx bpfx = bpfx.f137459a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpgr bpgr6 = (bpgr) da3.f164949b;
                bpfx.getClass();
                bpgr6.f137548u = bpfx;
                bpgr6.f137528a |= 1048576;
                ytp4.mo30769a(context4, str6, (bpgr) da3.mo74062i());
                if (b3.mo17710c()) {
                    String str8 = claimBleDeviceRequest.f32196a;
                    BleDevice bleDevice = claimBleDeviceRequest.f32197b;
                    if (bleDevice == null) {
                        bqgg = zmn3.f55473f.mo31117a(str8);
                    } else {
                        bqgg = bqga.m112775a(yya.m44975a(bleDevice.f31981a, bleDevice.f31982b, bnic.m109495a((Collection) bleDevice.f31983c), ywb.m44929a((Collection) bleDevice.f31984d)));
                    }
                    bqga.m112781a(bqdx.m112673a(bqdx.m112674a(bqgg, new zmj(zmn3, str8), zmn3.f55472e), bmxm.m108539a(Status.f30107a), bqfb.INSTANCE), new yum(zcl3), bqfb.INSTANCE);
                } else {
                    zcl3.mo30933a(b3);
                }
            }
            return true;
        } else if (i == 3) {
            zmn zmn4 = this.f55469a;
            UnclaimBleDeviceRequest unclaimBleDeviceRequest = (UnclaimBleDeviceRequest) obj;
            String str9 = ytt.f54617a;
            zcl zcl4 = unclaimBleDeviceRequest.f32321b;
            if (!zmn.m45765c(ytt)) {
                zcl4.mo30933a(new Status(5024));
            } else {
                Status b4 = zmn4.mo31258b();
                ytp ytp5 = zmn4.f55476i;
                Context context5 = zmn4.f55428a;
                String str10 = zmn4.f55429b;
                bxvd da4 = bpgr.f137526x.mo74144da();
                String str11 = ytt.f54617a;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgr bpgr7 = (bpgr) da4.f164949b;
                str11.getClass();
                bpgr7.f137528a |= 1;
                bpgr7.f137529b = str11;
                bpgb bpgb = bpgb.f137469a;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgr bpgr8 = (bpgr) da4.f164949b;
                bpgb.getClass();
                bpgr8.f137549v = bpgb;
                bpgr8.f137528a |= 2097152;
                ytp5.mo30769a(context5, str10, (bpgr) da4.mo74062i());
                if (!b4.mo17710c()) {
                    zcl4.mo30933a(b4);
                } else {
                    try {
                        bnre i6 = zmn4.f55474g.mo31340a().listIterator();
                        while (true) {
                            if (!i6.hasNext()) {
                                status = new Status(-5002);
                                break;
                            }
                            String str12 = ((yqq) i6.next()).f54423a.f172631b;
                            if (yxw.m44962a(str12, unclaimBleDeviceRequest.f32320a, str9)) {
                                zmn4.f55474g.mo31343b(str12);
                                if (zmn4.f55475h.mo66813a()) {
                                    ((yqk) zmn4.f55475h.mo66814b()).mo30670a(str12);
                                }
                                status = Status.f30107a;
                            }
                        }
                        zcl4.mo30933a(status);
                    } catch (IOException e) {
                        bnsl bnsl = (bnsl) zmn.f55470d.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68405a("Error unclaiming BLE device.");
                        zcl4.mo30933a(new Status(5008));
                    }
                }
            }
            return true;
        } else if (i != 4) {
            return false;
        } else {
            zmn zmn5 = this.f55469a;
            zcv zcv = ((ListClaimedBleDevicesRequest) obj).f32264a;
            if (!zmn.m45765c(ytt)) {
                zcv.mo30934a(new BleDevicesResult(bngx.m109376e(), Status.f30107a));
            } else {
                bxvd da5 = bpgr.f137526x.mo74144da();
                String str13 = ytt.f54617a;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bpgr bpgr9 = (bpgr) da5.f164949b;
                str13.getClass();
                bpgr9.f137528a |= 1;
                bpgr9.f137529b = str13;
                try {
                    bngx a = zmn5.f55474g.mo31340a();
                    ArrayList<cacv> arrayList = new ArrayList(a.size());
                    bnre i7 = a.listIterator();
                    while (i7.hasNext()) {
                        arrayList.add(((yqq) i7.next()).f54423a);
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    for (cacv cacv : arrayList) {
                        arrayList2.add(yvv.m44921a(cacv));
                    }
                    BleDevicesResult bleDevicesResult = new BleDevicesResult(arrayList2, Status.f30107a);
                    zcv.mo30934a(bleDevicesResult);
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr10 = (bpgr) da5.f164949b;
                    bpgr10.f137528a |= 2;
                    bpgr10.f137530c = 0;
                    bxvd da6 = bpfy.f137461c.mo74144da();
                    int size = bleDevicesResult.f32325a.size();
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bpfy bpfy = (bpfy) da6.f164949b;
                    bpfy.f137463a |= 1;
                    bpfy.f137464b = size;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr11 = (bpgr) da5.f164949b;
                    bpfy bpfy2 = (bpfy) da6.mo74062i();
                    bpfy2.getClass();
                    bpgr11.f137550w = bpfy2;
                    bpgr11.f137528a |= 4194304;
                    ytp = zmn5.f55476i;
                    context = zmn5.f55428a;
                    str = zmn5.f55429b;
                } catch (IOException e2) {
                    bnsl bnsl2 = (bnsl) zmn.f55470d.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68405a("Error listing BLE devices.");
                    zcv.mo30934a(BleDevicesResult.m23710a(new Status(5008)));
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr12 = (bpgr) da5.f164949b;
                    bpgr12.f137528a = 2 | bpgr12.f137528a;
                    bpgr12.f137530c = 5008;
                    bpfy bpfy3 = bpfy.f137461c;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bpgr bpgr13 = (bpgr) da5.f164949b;
                    bpfy3.getClass();
                    bpgr13.f137550w = bpfy3;
                    bpgr13.f137528a |= 4194304;
                    ytp = zmn5.f55476i;
                    context = zmn5.f55428a;
                    str = zmn5.f55429b;
                } catch (Throwable th) {
                    zmn5.f55476i.mo30769a(zmn5.f55428a, zmn5.f55429b, (bpgr) da5.mo74062i());
                    throw th;
                }
                ytp.mo30769a(context, str, (bpgr) da5.mo74062i());
            }
            return true;
        }
    }
}
