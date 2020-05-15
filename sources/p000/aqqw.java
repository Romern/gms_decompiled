package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.List;

/* renamed from: aqqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqw {

    /* renamed from: a */
    public bzhe f86625a;

    /* renamed from: b */
    public bzhs f86626b;

    /* renamed from: c */
    public bzih f86627c;

    /* renamed from: d */
    public bzij f86628d;

    /* renamed from: e */
    public bzil f86629e;

    /* renamed from: f */
    public bzjd f86630f;

    /* renamed from: g */
    public bzjh f86631g;

    /* renamed from: h */
    public bzjl f86632h;

    /* renamed from: i */
    public bzjo f86633i;

    /* renamed from: j */
    public bzjq f86634j;

    /* renamed from: k */
    public bzjt f86635k;

    public aqqw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bzhk bzhk = (bzhk) it.next();
            int i = bzhk.f170061a;
            if ((i & 16) != 0) {
                bzhe bzhe = bzhk.f170066f;
                this.f86625a = bzhe == null ? bzhe.f170031k : bzhe;
            } else if ((65536 & i) != 0) {
                bzhs bzhs = bzhk.f170072l;
                this.f86626b = bzhs == null ? bzhs.f170113e : bzhs;
            } else if ((131072 & i) == 0) {
                if ((i & 128) != 0) {
                    bzih bzih = bzhk.f170067g;
                    this.f86627c = bzih == null ? bzih.f170179b : bzih;
                } else if ((i & 8) == 0) {
                    if ((32768 & i) != 0) {
                        bzij bzij = bzhk.f170071k;
                        this.f86628d = bzij == null ? bzij.f170187k : bzij;
                    } else if ((i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                        bzil bzil = bzhk.f170070j;
                        this.f86629e = bzil == null ? bzil.f170202f : bzil;
                    } else if ((i & 2) != 0) {
                        bzjd bzjd = bzhk.f170063c;
                        this.f86630f = bzjd == null ? bzjd.f170276b : bzjd;
                    } else if (!cgof.m146336b() && (bzhk.f170061a & 4) != 0) {
                        bzjh bzjh = bzhk.f170064d;
                        this.f86631g = bzjh == null ? bzjh.f170284c : bzjh;
                    } else if (!cgoi.m146341b() && (bzhk.f170061a & 1) != 0) {
                        bzjl bzjl = bzhk.f170062b;
                        this.f86632h = bzjl == null ? bzjl.f170304b : bzjl;
                    } else {
                        int i2 = bzhk.f170061a;
                        if ((262144 & i2) != 0) {
                            bzjo bzjo = bzhk.f170074n;
                            this.f86633i = bzjo == null ? bzjo.f170318e : bzjo;
                        } else if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            bzjq bzjq = bzhk.f170068h;
                            this.f86634j = bzjq == null ? bzjq.f170326c : bzjq;
                        } else if ((i2 & 1024) != 0) {
                            bzjt bzjt = bzhk.f170069i;
                            this.f86635k = bzjt == null ? bzjt.f170345c : bzjt;
                        }
                    }
                }
            } else if (bzhk.f170073m == null) {
                bzhx bzhx = bzhx.f170132a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo48085a() {
        return this.f86625a != null;
    }

    /* renamed from: b */
    public final boolean mo48086b() {
        return this.f86627c != null;
    }

    /* renamed from: c */
    public final boolean mo48087c() {
        return this.f86628d != null;
    }

    /* renamed from: d */
    public final boolean mo48088d() {
        return this.f86631g != null;
    }

    /* renamed from: e */
    public final boolean mo48089e() {
        return this.f86632h != null;
    }

    /* renamed from: f */
    public final boolean mo48090f() {
        return this.f86633i != null;
    }
}
