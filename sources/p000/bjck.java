package p000;

import com.google.android.ulr.ApiExperiment;

/* renamed from: bjck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjck {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static bvwi m103194a(ApiExperiment apiExperiment) {
        char c;
        if (apiExperiment == null) {
            return null;
        }
        bxvd da = bvwi.f157931f.mo74144da();
        if (apiExperiment.mo71512c() != null) {
            int intValue = apiExperiment.mo71512c().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwi bvwi = (bvwi) da.f164949b;
            bvwi.f157933a |= 1;
            bvwi.f157934b = intValue;
        }
        char c2 = 65535;
        if (apiExperiment.mo71514e() != null) {
            String e = apiExperiment.mo71514e();
            switch (e.hashCode()) {
                case -85337091:
                    if (e.equals("experiment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 399755261:
                    if (e.equals("EXPERIMENT")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 951543133:
                    if (e.equals("control")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1669525821:
                    if (e.equals("CONTROL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwi bvwi2 = (bvwi) da.f164949b;
                bvwi2.f157935c = 0;
                bvwi2.f157933a |= 2;
            } else if (c == 2 || c == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwi bvwi3 = (bvwi) da.f164949b;
                bvwi3.f157935c = 1;
                bvwi3.f157933a |= 2;
            } else {
                String valueOf = String.valueOf(apiExperiment.mo71514e());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiExperiment.type ") : "Json2LiteBadEnum userlocation.ApiExperiment.type ".concat(valueOf));
            }
        }
        if (apiExperiment.mo71511b() != null) {
            String b = apiExperiment.mo71511b();
            switch (b.hashCode()) {
                case -85337091:
                    if (b.equals("experiment")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 399755261:
                    if (b.equals("EXPERIMENT")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 951543133:
                    if (b.equals("control")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1669525821:
                    if (b.equals("CONTROL")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0 || c2 == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwi bvwi4 = (bvwi) da.f164949b;
                bvwi4.f157936d = 0;
                bvwi4.f157933a |= 4;
            } else if (c2 == 2 || c2 == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvwi bvwi5 = (bvwi) da.f164949b;
                bvwi5.f157936d = 1;
                bvwi5.f157933a |= 4;
            } else {
                String valueOf2 = String.valueOf(apiExperiment.mo71511b());
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Json2LiteBadEnum userlocation.ApiExperiment.group ") : "Json2LiteBadEnum userlocation.ApiExperiment.group ".concat(valueOf2));
            }
        }
        if (apiExperiment.mo71513d() != null) {
            int intValue2 = apiExperiment.mo71513d().intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwi bvwi6 = (bvwi) da.f164949b;
            bvwi6.f157933a |= 8;
            bvwi6.f157937e = intValue2;
        }
        return (bvwi) da.mo74062i();
    }
}
