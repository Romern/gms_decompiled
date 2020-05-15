package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: sbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbd implements sbg {

    /* renamed from: b */
    private static final Feature[] f43987b = new Feature[0];

    /* renamed from: a */
    private final Context f43988a;

    public sbd(Context context) {
        this.f43988a = context;
    }

    /* renamed from: a */
    public static int m34824a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: a */
    private static void m34825a(Feature[] featureArr, Set set) {
        if (featureArr != null) {
            for (Feature feature : featureArr) {
                set.add(feature.f30068a);
            }
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo25330a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        ConnectionResult connectionResult;
        byte[] protoBytes;
        Feature[] featureArr = getServiceRequest.f30235i;
        Feature[] featureArr2 = getServiceRequest.f30236j;
        int a = m34824a(featureArr) + m34824a(featureArr2);
        if (a == 0) {
            connectionInfo.f30224b = f43987b;
            return ConnectionResult.f30063a;
        }
        C1225nr nrVar = new C1225nr(a);
        m34825a(featureArr, nrVar);
        m34825a(featureArr2, nrVar);
        ModuleManager.FeatureList fetchFeatures = ModuleManager.get(this.f43988a).fetchFeatures((String[]) nrVar.toArray(new String[nrVar.f26758b]));
        Feature[] featureArr3 = null;
        int i = 0;
        if (!(fetchFeatures == null || (protoBytes = fetchFeatures.getProtoBytes()) == null)) {
            if (protoBytes.length != 0) {
                try {
                    bxwc bxwc = ((djf) GeneratedMessageLite.m124014a(djf.f13322b, protoBytes)).f13324a;
                    ArrayList arrayList = new ArrayList(bxwc.size());
                    int size = bxwc.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        djc djc = (djc) bxwc.get(i2);
                        if (!djc.f13312d) {
                            arrayList.add(new Feature(djc.f13310b, djc.f13311c));
                        }
                    }
                    featureArr3 = (Feature[]) arrayList.toArray(new Feature[0]);
                } catch (bxwf e) {
                    Log.e("FeatureCheckPreproc", e.getMessage());
                }
            } else {
                featureArr3 = new Feature[0];
            }
        }
        if (featureArr3 == null) {
            return new ConnectionResult(1);
        }
        if (featureArr != null) {
            int length = featureArr3.length;
            C1223np npVar = new C1223np(length);
            for (Feature feature : featureArr3) {
                npVar.put(feature.f30068a, feature);
            }
            int length2 = featureArr.length;
            boolean z = false;
            while (true) {
                if (i < length2) {
                    Feature feature2 = featureArr[i];
                    Feature feature3 = (Feature) npVar.get(feature2.f30068a);
                    if (feature3 == null) {
                        connectionResult = new ConnectionResult(1);
                        break;
                    }
                    if (feature3.mo17676a() < feature2.mo17676a()) {
                        z = true;
                    }
                    i++;
                } else if (z) {
                    connectionResult = new ConnectionResult(21);
                } else {
                    connectionResult = ConnectionResult.f30063a;
                }
            }
        } else {
            connectionResult = ConnectionResult.f30063a;
        }
        if (connectionResult.mo17671b()) {
            connectionInfo.f30224b = featureArr3;
        }
        return connectionResult;
    }
}
