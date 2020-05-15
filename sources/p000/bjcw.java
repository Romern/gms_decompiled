package p000;

import com.google.android.ulr.SemanticPlace;
import com.google.android.ulr.SemanticPlaceGConceptInstanceProto;
import java.util.ArrayList;

/* renamed from: bjcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcw {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static byfi m103205a(SemanticPlace semanticPlace) {
        String str;
        char c;
        String str2;
        char c2;
        bxvd da = byfi.f166018g.mo74144da();
        if (semanticPlace.getFeatureId() != null) {
            byel a = bjcp.m103199a(semanticPlace.getFeatureId());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfi byfi = (byfi) da.f164949b;
            a.getClass();
            byfi.f166021b = a;
            byfi.f166020a |= 1;
        }
        char c3 = 65535;
        if (semanticPlace.getGconceptInstances() != null) {
            ArrayList gconceptInstances = semanticPlace.getGconceptInstances();
            int size = gconceptInstances.size();
            for (int i = 0; i < size; i++) {
                SemanticPlaceGConceptInstanceProto semanticPlaceGConceptInstanceProto = (SemanticPlaceGConceptInstanceProto) gconceptInstances.get(i);
                if (semanticPlaceGConceptInstanceProto != null) {
                    bxvd da2 = byff.f166011d.mo74144da();
                    if (semanticPlaceGConceptInstanceProto.mo71705b() != null) {
                        String b = semanticPlaceGConceptInstanceProto.mo71705b();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        byff byff = (byff) da2.f164949b;
                        b.getClass();
                        byff.f166013a |= 1;
                        byff.f166014b = b;
                    }
                    if (semanticPlaceGConceptInstanceProto.mo71706c() != null) {
                        String c4 = semanticPlaceGConceptInstanceProto.mo71706c();
                        switch (c4.hashCode()) {
                            case -1849003440:
                                if (c4.equals("NON_PRIMARY")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -314765822:
                                if (c4.equals("primary")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 403216866:
                                if (c4.equals("PRIMARY")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 879864437:
                                if (c4.equals("nonPrimary")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0 || c2 == 1) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            byff byff2 = (byff) da2.f164949b;
                            byff2.f166015c = 0;
                            byff2.f166013a |= 2;
                        } else if (c2 == 2 || c2 == 3) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            byff byff3 = (byff) da2.f164949b;
                            byff3.f166015c = 1000;
                            byff3.f166013a |= 2;
                        } else {
                            String valueOf = String.valueOf(semanticPlaceGConceptInstanceProto.mo71706c());
                            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Json2LiteBadEnum location.unified.SemanticPlace.GConceptInstanceProto.prominence ") : "Json2LiteBadEnum location.unified.SemanticPlace.GConceptInstanceProto.prominence ".concat(valueOf));
                        }
                    }
                    byff byff4 = (byff) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi2 = (byfi) da.f164949b;
                    byff4.getClass();
                    if (!byfi2.f166022c.mo73666a()) {
                        byfi2.f166022c = GeneratedMessageLite.m124021a(byfi2.f166022c);
                    }
                    byfi2.f166022c.add(byff4);
                }
            }
        }
        if (semanticPlace.mo71701c() != null) {
            float floatValue = semanticPlace.mo71701c().floatValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfi byfi3 = (byfi) da.f164949b;
            byfi3.f166020a |= 2;
            byfi3.f166023d = floatValue;
        }
        if (semanticPlace.mo71700b() != null) {
            String b2 = semanticPlace.mo71700b();
            switch (b2.hashCode()) {
                case -1921560249:
                    if (b2.equals("HIGH_CONFIDENCE")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -747047476:
                    if (b2.equals("highConfidence")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -740571906:
                    if (b2.equals("lowConfidence")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -723799947:
                    if (b2.equals("LOW_CONFIDENCE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -132740673:
                    if (b2.equals("UNKNOWN_CONFIDENCE")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 121213556:
                    if (b2.equals("unknownConfidence")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 517782495:
                    if (b2.equals("mediumConfidence")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1729417620:
                    if (b2.equals("MEDIUM_CONFIDENCE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi4 = (byfi) da.f164949b;
                    byfi4.f166024e = 0;
                    byfi4.f166020a |= 4;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi5 = (byfi) da.f164949b;
                    byfi5.f166024e = 1;
                    byfi5.f166020a |= 4;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi6 = (byfi) da.f164949b;
                    byfi6.f166024e = 2;
                    byfi6.f166020a |= 4;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi7 = (byfi) da.f164949b;
                    byfi7.f166024e = 3;
                    byfi7.f166020a |= 4;
                    break;
                default:
                    String valueOf2 = String.valueOf(semanticPlace.mo71700b());
                    if (valueOf2.length() == 0) {
                        str2 = new String("Json2LiteBadEnum location.unified.SemanticPlace.confidence ");
                    } else {
                        str2 = "Json2LiteBadEnum location.unified.SemanticPlace.confidence ".concat(valueOf2);
                    }
                    throw new IllegalArgumentException(str2);
            }
        }
        if (semanticPlace.mo71702d() != null) {
            String d = semanticPlace.mo71702d();
            switch (d.hashCode()) {
                case -2101128988:
                    if (d.equals("happyHour")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -1174121573:
                    if (d.equals("HULK_REAL_TIME")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case -284840886:
                    if (d.equals("unknown")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -174817277:
                    if (d.equals("HAPPY_HOUR")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 81560823:
                    if (d.equals("hulkRealTime")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 433141802:
                    if (d.equals("UNKNOWN")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 1281444928:
                    if (d.equals("androidContext")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 1640131487:
                    if (d.equals("ANDROID_CONTEXT")) {
                        c3 = 6;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi8 = (byfi) da.f164949b;
                    byfi8.f166025f = 0;
                    byfi8.f166020a |= 8;
                    break;
                case 2:
                case 3:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi9 = (byfi) da.f164949b;
                    byfi9.f166025f = 1;
                    byfi9.f166020a |= 8;
                    break;
                case 4:
                case 5:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi10 = (byfi) da.f164949b;
                    byfi10.f166025f = 2;
                    byfi10.f166020a |= 8;
                    break;
                case 6:
                case 7:
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfi byfi11 = (byfi) da.f164949b;
                    byfi11.f166025f = 3;
                    byfi11.f166020a |= 8;
                    break;
                default:
                    String valueOf3 = String.valueOf(semanticPlace.mo71702d());
                    if (valueOf3.length() == 0) {
                        str = new String("Json2LiteBadEnum location.unified.SemanticPlace.source ");
                    } else {
                        str = "Json2LiteBadEnum location.unified.SemanticPlace.source ".concat(valueOf3);
                    }
                    throw new IllegalArgumentException(str);
            }
        }
        return (byfi) da.mo74062i();
    }
}
