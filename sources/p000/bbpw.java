package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bbpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbpw {

    /* renamed from: a */
    private static bbpw f103040a;

    /* renamed from: b */
    private final bbqt f103041b;

    /* renamed from: c */
    private final Set f103042c = new HashSet();

    /* renamed from: d */
    private final bbqe f103043d;

    private bbpw(Context context) {
        this.f103041b = bbqt.m88417a(context);
        this.f103043d = bbqe.m88387a(context);
    }

    /* renamed from: a */
    public static synchronized bbpw m88374a(Context context) {
        bbpw bbpw;
        synchronized (bbpw.class) {
            if (f103040a == null) {
                f103040a = new bbpw(context);
            }
            bbpw = f103040a;
        }
        return bbpw;
    }

    @SafeVarargs
    /* renamed from: a */
    private static bmxv m88375a(Object... objArr) {
        return bmxv.m108566b(bngx.m109370a(objArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0271  */
    /* renamed from: a */
    public final synchronized List mo56349a() {
        bngx a;
        bmxv bmxv;
        boolean z;
        bmxv bmxv2;
        synchronized (this) {
            bngx a2 = bngx.m109367a(Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC), 193, 194, 195, Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR), 196, 198, Integer.valueOf((int) ErrorInfo.TYPE_SDU_UNKNOWN), 197, Integer.valueOf((int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR), 202, 203, 204);
            bngs bngs = new bngs();
            bnre i = a2.listIterator();
            while (i.hasNext()) {
                Integer num = (Integer) i.next();
                int intValue = num.intValue();
                bbqt bbqt = this.f103041b;
                switch (intValue) {
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC /*192*/:
                        bmxv = m88375a(new bdyx[0]);
                        break;
                    case 193:
                        bmxv = m88375a(bbqt.f103150as);
                        break;
                    case 194:
                        bmxv = m88375a(bbqt.f103094P, bbqt.f103096R);
                        break;
                    case 195:
                    case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                        bmxv = m88375a(bbqt.f103152au);
                        break;
                    case 196:
                        bmxv = m88375a(bbqt.f103122aQ);
                        break;
                    case 197:
                        bmxv = m88375a(bbqt.f103125aT, bbqt.f103126aU);
                        break;
                    case 198:
                        bmxv = m88375a(bbqt.f103101W);
                        break;
                    case ErrorInfo.TYPE_SDU_UNKNOWN:
                        bmxv = m88375a(bbqt.f103098T, bbqt.f103097S);
                        break;
                    case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        bmxv = m88375a(bbqt.f103094P, bbqt.f103096R, bbqt.f103125aT, bbqt.f103126aU);
                        break;
                    case 202:
                        bmxv = m88375a(bbqt.f103136ae, bbqt.f103135ad, bbqt.f103125aT, bbqt.f103126aU);
                        break;
                    case 203:
                        bmxv = m88375a(bbqt.f103122aQ, bbqt.f103123aR);
                        break;
                    case 204:
                        bmxv = m88375a(bbqt.f103113aH, bbqt.f103114aI);
                        break;
                    default:
                        bmxv = bmvz.f131120a;
                        break;
                }
                if (bmxv.mo66813a()) {
                    bnre i2 = ((bngx) bmxv.mo66814b()).listIterator();
                    while (true) {
                        if (!i2.hasNext()) {
                            z = true;
                        } else if (!((Boolean) ((bdyx) i2.next()).mo58455c()).booleanValue()) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                switch (intValue) {
                    case 194:
                        if (this.f103043d.mo56366j()) {
                            if (!this.f103043d.mo56367k()) {
                                break;
                            }
                            switch (intValue) {
                                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC /*192*/:
                                case 193:
                                case 194:
                                case 197:
                                case ErrorInfo.TYPE_SDU_UNKNOWN:
                                case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                                case 202:
                                case 204:
                                    bmxv2 = m88375a(new Integer[0]);
                                    break;
                                case 195:
                                case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                                    bmxv2 = m88375a(1);
                                    break;
                                case 196:
                                case 198:
                                case 203:
                                    bmxv2 = m88375a(2);
                                    break;
                                default:
                                    bmxv2 = bmvz.f131120a;
                                    break;
                            }
                            if (bmxv2.mo66813a() && this.f103042c.containsAll((Collection) bmxv2.mo66814b())) {
                                bngs.mo67668c(num);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 195:
                    case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                        z = this.f103043d.mo56368l();
                        if (!z) {
                            break;
                        }
                        switch (intValue) {
                        }
                        bngs.mo67668c(num);
                        break;
                    case 196:
                        z = this.f103043d.mo56369m();
                        if (!z) {
                        }
                        switch (intValue) {
                        }
                        bngs.mo67668c(num);
                        break;
                    case 197:
                        if (this.f103043d.mo56364h()) {
                            if (!this.f103043d.mo56365i()) {
                                break;
                            }
                            switch (intValue) {
                            }
                            bngs.mo67668c(num);
                            break;
                        } else {
                            break;
                        }
                    case 198:
                        bbqe bbqe = this.f103043d;
                        z = bbqe.mo56357a(24, bbqe.f103062a.f103101W);
                        if (!z) {
                        }
                        switch (intValue) {
                        }
                        bngs.mo67668c(num);
                        break;
                    case ErrorInfo.TYPE_SDU_UNKNOWN:
                        if (this.f103043d.mo56361e()) {
                            if (!this.f103043d.mo56360d()) {
                                break;
                            }
                            switch (intValue) {
                            }
                            bngs.mo67668c(num);
                            break;
                        } else {
                            break;
                        }
                    case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        if (this.f103043d.mo56366j() && this.f103043d.mo56367k() && this.f103043d.mo56364h()) {
                            if (!this.f103043d.mo56365i()) {
                                break;
                            }
                            switch (intValue) {
                            }
                            bngs.mo67668c(num);
                            break;
                        }
                        break;
                    case 202:
                        if (this.f103043d.mo56365i() && this.f103043d.mo56364h() && this.f103043d.mo56363g()) {
                            if (!this.f103043d.mo56362f()) {
                                break;
                            }
                            switch (intValue) {
                            }
                            bngs.mo67668c(num);
                            break;
                        }
                        break;
                    case 203:
                        if (!this.f103043d.mo56369m()) {
                            break;
                        } else {
                            bbqe bbqe2 = this.f103043d;
                            if (!bbqe2.mo56357a(9, bbqe2.f103062a.f103123aR)) {
                                break;
                            }
                            switch (intValue) {
                            }
                            bngs.mo67668c(num);
                            break;
                        }
                    case 204:
                        if (this.f103043d.mo56356a()) {
                            if (!this.f103043d.mo56358b()) {
                                break;
                            }
                            switch (intValue) {
                            }
                            bngs.mo67668c(num);
                            break;
                        } else {
                            break;
                        }
                    default:
                        if (!z) {
                        }
                        switch (intValue) {
                        }
                        bngs.mo67668c(num);
                        break;
                }
            }
            a = bngs.mo67664a();
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo56350a(bngx bngx) {
        this.f103042c.addAll(bngx);
    }
}
