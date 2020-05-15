package p000;

import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiSensorData;
import com.google.android.ulr.ApiUserData;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bguk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguk {

    /* renamed from: a */
    public final ArrayList f117572a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f117573b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f117574c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f117575d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f117576e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f117577f = new ArrayList();

    /* renamed from: g */
    private final sja f117578g = new sja();

    /* renamed from: h */
    private final sja f117579h = new sja();

    /* renamed from: i */
    private final sja f117580i = new sja();

    /* renamed from: a */
    public final void mo63208a(byte[] bArr, bgvm bgvm) {
        ApiSensorData apiSensorData;
        ApiMetadata apiMetadata;
        this.f117577f.add(bArr);
        if ((bgvm.f117688a & 1) != 0) {
            ArrayList arrayList = this.f117572a;
            bgvr bgvr = bgvm.f117689b;
            if (bgvr == null) {
                bgvr = bgvr.f117713u;
            }
            arrayList.add(bgvr);
        }
        if ((bgvm.f117688a & 2) != 0) {
            bgoq bgoq = bgvm.f117690c;
            if (bgoq == null) {
                bgoq = bgoq.f116946f;
            }
            this.f117573b.add(bgfb.m98742a(bgoq));
        }
        ApiUserData apiUserData = null;
        if ((bgvm.f117688a & 4) != 0) {
            String str = bgvm.f117691d;
            if (str != null) {
                try {
                    apiMetadata = new ApiMetadata();
                    this.f117578g.mo25626a(str, apiMetadata);
                } catch (siy e) {
                    bgur.m100009a("GCoreUlr", 41, "Error deserializing metadata", e);
                    apiMetadata = null;
                }
            } else {
                apiMetadata = null;
            }
            if (apiMetadata != null) {
                this.f117574c.add(apiMetadata);
            }
        }
        if ((bgvm.f117688a & 8) != 0) {
            String str2 = bgvm.f117692e;
            if (str2 != null) {
                try {
                    apiSensorData = new ApiSensorData();
                    this.f117579h.mo25626a(str2, apiSensorData);
                } catch (siy e2) {
                    bgur.m100009a("GCoreUlr", 41, "Error deserializing sensor data", e2);
                    apiSensorData = null;
                }
            } else {
                apiSensorData = null;
            }
            if (apiSensorData != null) {
                this.f117575d.add(apiSensorData);
            }
        }
        if ((bgvm.f117688a & 16) != 0) {
            String str3 = bgvm.f117693f;
            if (str3 != null) {
                try {
                    ApiUserData apiUserData2 = new ApiUserData();
                    this.f117580i.mo25626a(str3, apiUserData2);
                    apiUserData = apiUserData2;
                } catch (siy e3) {
                    bgur.m100009a("GCoreUlr", 41, "Error deserializing user data", e3);
                }
            }
            if (apiUserData != null) {
                this.f117576e.add(apiUserData);
            }
        }
    }

    public final String toString() {
        return String.format(Locale.US, "%d locations, %d activities, and %d metadata", Integer.valueOf(this.f117572a.size()), Integer.valueOf(this.f117573b.size()), Integer.valueOf(this.f117574c.size()));
    }
}
