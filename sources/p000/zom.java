package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/* renamed from: zom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zom implements ytv {

    /* renamed from: a */
    final /* synthetic */ zon f55608a;

    public zom(zon zon) {
        this.f55608a = zon;
    }

    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        bqgg bqgg;
        caae caae;
        long j;
        long j2;
        long j3;
        zgh zgh;
        zgh zgh2;
        zgf zgf;
        zdb zdb;
        String str;
        List<zgg> list;
        int i2 = i;
        ytt ytt2 = ytt;
        if (i2 == 0) {
            zon zon = this.f55608a;
            DataSourcesRequest dataSourcesRequest = (DataSourcesRequest) obj;
            String str2 = ytt2.f54617a;
            zba zba = dataSourcesRequest.f32238d;
            try {
                bngx a = ywb.m44928a(dataSourcesRequest.f32235a);
                HashSet hashSet = new HashSet();
                bnre i3 = a.listIterator();
                while (i3.hasNext()) {
                    bnre i4 = zon.f55612g.mo19161b((caah) i3.next()).listIterator();
                    while (i4.hasNext()) {
                        caae caae2 = (caae) i4.next();
                        if (dataSourcesRequest.mo19017a(yvx.m44926a(caae2))) {
                            hashSet.add(caae2);
                        }
                    }
                }
                if (dataSourcesRequest.f32237c) {
                    bnrd a2 = zon.f55611f.mo31336a().iterator();
                    while (a2.hasNext()) {
                        caae caae3 = (caae) a2.next();
                        if (dataSourcesRequest.mo19017a(yvx.m44926a(caae3))) {
                            hashSet.add(caae3);
                        }
                    }
                }
                List<caae> b = zon.f55610e.mo30726b(str2, hashSet);
                bngs b2 = bngx.m109371b(b.size());
                for (caae caae4 : b) {
                    b2.mo67668c(yvx.m44927a(caae4, str2));
                }
                zba.mo30897a(new DataSourcesResult(b2.mo67664a(), Status.f30107a));
                return true;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) zon.f55609d.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Error finding data sources.");
                zba.mo30897a(DataSourcesResult.m23716a(new Status(5008)));
                return true;
            }
        } else if (i2 == 1) {
            zon zon2 = this.f55608a;
            SensorRegistrationRequest sensorRegistrationRequest = (SensorRegistrationRequest) obj;
            zcl zcl = sensorRegistrationRequest.f32284k;
            String str3 = ytt2.f54617a;
            caae a3 = yvx.m44925a(sensorRegistrationRequest.f32274a);
            caah a4 = ywb.m44930a(sensorRegistrationRequest.mo19062a());
            if (a4 == null) {
                bqgg = bqga.m112775a(Status.f30107a);
            } else {
                if (a3 == null) {
                    caae b3 = zon2.f55611f.mo31339b(a4);
                    if (b3 == null) {
                        ((bnsl) zon.f55609d.mo68388c()).mo68420a("No live data sources available for %s. Returning success.  Will start recording once data source is live", sensorRegistrationRequest);
                        bqgg = bqga.m112775a(new Status(-5000));
                    } else {
                        caae = b3;
                    }
                } else {
                    try {
                        caae = zon2.f55611f.mo30458a(a3, str3);
                    } catch (IOException e2) {
                        bnsl bnsl2 = (bnsl) zon.f55609d.mo68387b();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68405a("Error registering sensor.");
                        bqgg = bqga.m112775a(new Status(5008));
                    }
                }
                ysl ysl = zon2.f55610e;
                caah caah = caae.f172330f;
                if (caah == null) {
                    caah = caah.f172333d;
                }
                if (!ysl.mo30723a(str3, caah.f172336b, 1)) {
                    ((bnsl) zon.f55609d.mo68387b()).mo68424a("App: %s does not have access to data source: %s", str3, caae.f172326b);
                    bqgg = bqga.m112775a(ysl.f54548e);
                } else {
                    bngx a5 = bngx.m109356a(new ClientIdentity(ytt2.f54618b, ytt2.f54617a));
                    yxh yxh = sensorRegistrationRequest.f32276c;
                    if (yxh != null) {
                        zon2.f55616k.register(yxh, str3);
                    }
                    long j4 = sensorRegistrationRequest.f32277d;
                    long j5 = sensorRegistrationRequest.f32280g;
                    if (j4 < 0) {
                        long a6 = zon2.f55613h.mo30788a(caae, a4);
                        j2 = a6;
                        j = a6 / 2;
                    } else {
                        j2 = j4;
                        j = j5;
                    }
                    if (j2 == -1) {
                        ((bnsl) zon.f55609d.mo68388c()).mo68420a("The requested data source [%s] is disabled. Registration request will succeed, but no events will be delivered.", caae.f172326b);
                        bqgg = bqga.m112775a(new Status(-5000));
                    } else {
                        long j6 = sensorRegistrationRequest.f32282i;
                        if (j6 > 0) {
                            j3 = j6;
                        } else {
                            j3 = Long.MAX_VALUE;
                        }
                        zgf zgf2 = zon2.f55612g;
                        zdc zdc = zon2.f55615j;
                        zdf a7 = zdf.m45311a(sensorRegistrationRequest);
                        yxh yxh2 = sensorRegistrationRequest.f32276c;
                        if (yxh2 == null) {
                            PendingIntent pendingIntent = sensorRegistrationRequest.f32279f;
                            zgf = zgf2;
                            zgh2 = zgh;
                            zdb zdb2 = new zdb(zdc, zdc.f54932a, pendingIntent, a7, ytt, zdc.f54935d, pendingIntent);
                            zdc.f54934c.mo30953a(pendingIntent, zdb2);
                            zdb = zdb2;
                        } else {
                            zgh2 = zgh;
                            zgf = zgf2;
                            zdc zdc2 = zdc;
                            DataSource dataSource = sensorRegistrationRequest.f32274a;
                            if (dataSource == null) {
                                str = sensorRegistrationRequest.f32275b.mo18916a();
                            } else {
                                str = dataSource.mo18911a();
                            }
                            zcz zcz = new zcz(str3, yxh2, str);
                            zda zda = new zda(zdc2, zdc2.f54932a, zcz, a7, ytt, zdc2.f54935d, zcz);
                            zdc2.f54933b.mo30953a(zcz, zda);
                            zdb = zda;
                        }
                        bqgg = bqdx.m112673a(zgf.mo19155a(new zgh(caae, zdb, j2, j, sensorRegistrationRequest.f32278e, sensorRegistrationRequest.f32281h, a5, j3)), new zoj(), bqfb.INSTANCE);
                    }
                }
            }
            if (sensorRegistrationRequest.f32276c == null) {
                bqga.m112781a(bqgg, new zoi(zon2), bqfb.INSTANCE);
            }
            bqga.m112781a(bqgg, new yum(zcl), bqfb.INSTANCE);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            zon zon3 = this.f55608a;
            SensorUnregistrationRequest sensorUnregistrationRequest = (SensorUnregistrationRequest) obj;
            yxh yxh3 = sensorUnregistrationRequest.f32285a;
            if (yxh3 != null) {
                zon3.f55616k.unregister(yxh3);
            }
            zdc zdc3 = zon3.f55615j;
            yxh yxh4 = sensorUnregistrationRequest.f32285a;
            if (yxh4 == null) {
                list = zdc3.f54934c.mo30952a(sensorUnregistrationRequest.f32286b);
            } else {
                list = zdc3.mo30944a(yxh4);
            }
            for (zgg zgg : list) {
                if (!zon3.f55612g.mo19160a(zgg)) {
                    ((bnsl) zon.f55609d.mo68388c()).mo68424a("Could not unregister %s with sensor adapter %s", zgg, zon3.f55612g);
                }
            }
            if (!zon3.mo31245d()) {
                zon3.mo31247f();
            }
            sensorUnregistrationRequest.f32287c.mo30933a(Status.f30107a);
            return true;
        }
    }
}
