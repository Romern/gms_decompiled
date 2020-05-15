package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: dsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsl extends drx {

    /* renamed from: c */
    public final ContextManagerClientInfo f13940c;

    /* renamed from: d */
    private final tmo f13941d;

    /* renamed from: e */
    private final drc f13942e;

    /* renamed from: f */
    private final boolean f13943f = cdgp.f180782a.mo6606a().mo77529U();

    public dsl(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, drc drc) {
        super("RegisterContextListenerOperation");
        this.f13941d = tmo;
        this.f13940c = contextManagerClientInfo;
        this.f13942e = drc;
    }

    /* renamed from: a */
    private final void m9230a(int i) {
        int i2;
        drn.m9163a(this.f13941d, i);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13940c;
        drc drc = this.f13942e;
        ContextDataFilterImpl contextDataFilterImpl = drc.f13853b;
        if (drc.f13852a == null) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        bxvd a = dpf.m9018a(contextManagerClientInfo, 6, i);
        bxge a2 = dpf.m9010a(contextDataFilterImpl);
        bxvd da = bxgr.f163289d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgr bxgr = (bxgr) da.f164949b;
        bxgr.f163293c = i2 - 1;
        int i3 = bxgr.f163291a | 2;
        bxgr.f163291a = i3;
        if (a2 != null) {
            a2.getClass();
            bxgr.f163292b = a2;
            bxgr.f163291a = i3 | 1;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgr bxgr2 = (bxgr) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxgr2.getClass();
        bxgc.f163232i = bxgr2;
        bxgc.f163224a |= 128;
        G.mo9374a((bxgc) a.mo74062i());
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9517b(int i) {
        ArrayList arrayList;
        Set set;
        HashSet hashSet;
        ContextManagerClientInfo contextManagerClientInfo;
        dtl dtl;
        tiw tiw;
        int i2;
        ContextManagerClientInfo contextManagerClientInfo2;
        ArrayList arrayList2;
        dtl dtl2;
        tjb tjb;
        tiy tiy;
        if (!rjs.m33679e(i)) {
            m9230a(i);
            return;
        }
        dvx r = dwq.m9674r();
        drc drc = this.f13942e;
        ContextDataFilterImpl contextDataFilterImpl = drc.f13853b;
        ContextManagerClientInfo contextManagerClientInfo3 = this.f13940c;
        HashSet d = contextDataFilterImpl.mo18054d();
        if (d == null || d.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(d.size());
            Iterator it = d.iterator();
            while (it.hasNext()) {
                dvy dvy = new dvy(UUID.randomUUID().toString(), tiq.m37051b(((Integer) it.next()).intValue()), dwj.m9630a(), contextManagerClientInfo3);
                dvy.mo9736a(dvq.m9548a());
                dvy.mo9735a(drc, contextDataFilterImpl);
                arrayList.add(dvy.mo9734a());
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            doh a = this.f13940c.mo18066a();
            drc drc2 = this.f13942e;
            dwf dwf = (dwf) r.f14223a.get(a);
            if (dwf != null) {
                set = dwf.mo9767a(drc2);
            } else {
                set = null;
            }
            if (set == null || set.isEmpty()) {
                hashSet = null;
            } else {
                hashSet = new HashSet(set);
            }
            r.mo9726a(arrayList);
            r.mo9733b(hashSet);
            boolean z = false;
            m9230a(0);
            if (this.f13942e.f13852a != null) {
                dtl E = dwq.m9648E();
                ContextManagerClientInfo contextManagerClientInfo4 = this.f13940c;
                drc drc3 = this.f13942e;
                PendingIntent pendingIntent = drc3.f13852a;
                ContextDataFilterImpl contextDataFilterImpl2 = drc3.f13853b;
                if (contextDataFilterImpl2 != null) {
                    bxvd da = tiw.f46154e.mo74144da();
                    if (contextDataFilterImpl2.mo18052b()) {
                        ArrayList arrayList3 = contextDataFilterImpl2.f30670a;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            ContextDataFilterImpl.Inclusion inclusion = (ContextDataFilterImpl.Inclusion) arrayList3.get(i3);
                            bxvd da2 = tiv.f46147f.mo74144da();
                            int i4 = inclusion.f30673a;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = z;
                            }
                            tiv tiv = (tiv) da2.f164949b;
                            int i5 = tiv.f46149a | 1;
                            tiv.f46149a = i5;
                            tiv.f46150b = i4;
                            int i6 = inclusion.f30674b;
                            tiv.f46149a = i5 | 2;
                            tiv.f46151c = i6;
                            TimeFilterImpl timeFilterImpl = inclusion.f30675c;
                            if (timeFilterImpl != null) {
                                bxvd da3 = tjb.f46179c.mo74144da();
                                ArrayList arrayList4 = timeFilterImpl.f30699a;
                                if (arrayList4 == null) {
                                    dtl2 = E;
                                    contextManagerClientInfo2 = contextManagerClientInfo4;
                                    arrayList2 = arrayList3;
                                    i2 = size;
                                } else {
                                    if (arrayList4.size() > 0) {
                                        int size2 = arrayList4.size();
                                        for (int i7 = z; i7 < size2; i7++) {
                                            int i8 = size2;
                                            TimeFilterImpl.Interval interval = (TimeFilterImpl.Interval) arrayList4.get(i7);
                                            ArrayList arrayList5 = arrayList3;
                                            bxvd da4 = tja.f46174d.mo74144da();
                                            dtl dtl3 = E;
                                            ContextManagerClientInfo contextManagerClientInfo5 = contextManagerClientInfo4;
                                            long j = interval.f30701a;
                                            int i9 = size;
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            tja tja = (tja) da4.f164949b;
                                            ArrayList arrayList6 = arrayList4;
                                            int i10 = tja.f46176a | 1;
                                            tja.f46176a = i10;
                                            tja.f46177b = j;
                                            long j2 = interval.f30702b;
                                            tja.f46176a = i10 | 2;
                                            tja.f46178c = j2;
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            tjb tjb2 = (tjb) da3.f164949b;
                                            tja tja2 = (tja) da4.mo74062i();
                                            tja2.getClass();
                                            if (!tjb2.f46181a.mo73666a()) {
                                                tjb2.f46181a = bxvk.m124021a(tjb2.f46181a);
                                            }
                                            tjb2.f46181a.add(tja2);
                                            E = dtl3;
                                            size2 = i8;
                                            arrayList3 = arrayList5;
                                            contextManagerClientInfo4 = contextManagerClientInfo5;
                                            size = i9;
                                            arrayList4 = arrayList6;
                                        }
                                    }
                                    dtl2 = E;
                                    contextManagerClientInfo2 = contextManagerClientInfo4;
                                    arrayList2 = arrayList3;
                                    i2 = size;
                                }
                                int[] iArr = timeFilterImpl.f30700b;
                                if (iArr != null && iArr.length > 0) {
                                    List b = bqcn.m112586b(iArr);
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    tjb tjb3 = (tjb) da3.f164949b;
                                    if (!tjb3.f46182b.mo73666a()) {
                                        tjb3.f46182b = bxvk.m124019a(tjb3.f46182b);
                                    }
                                    bxsy.m123078a(b, tjb3.f46182b);
                                }
                                tjb = (tjb) da3.mo74062i();
                            } else {
                                dtl2 = E;
                                contextManagerClientInfo2 = contextManagerClientInfo4;
                                arrayList2 = arrayList3;
                                i2 = size;
                                tjb = null;
                            }
                            if (tjb != null) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                tiv tiv2 = (tiv) da2.f164949b;
                                tjb.getClass();
                                tiv2.f46152d = tjb;
                                tiv2.f46149a |= 4;
                            }
                            KeyFilterImpl keyFilterImpl = inclusion.f30676d;
                            if (keyFilterImpl != null) {
                                ArrayList arrayList7 = keyFilterImpl.f30692a;
                                bxvd da5 = tiy.f46165b.mo74144da();
                                if (arrayList7 != null && arrayList7.size() > 0) {
                                    int size3 = arrayList7.size();
                                    for (int i11 = 0; i11 < size3; i11++) {
                                        KeyFilterImpl.Inclusion inclusion2 = (KeyFilterImpl.Inclusion) arrayList7.get(i11);
                                        bxvd da6 = tix.f46160d.mo74144da();
                                        String[] strArr = inclusion2.f30693a;
                                        if (strArr != null) {
                                            List asList = Arrays.asList(strArr);
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            tix tix = (tix) da6.f164949b;
                                            if (!tix.f46162a.mo73666a()) {
                                                tix.f46162a = bxvk.m124021a(tix.f46162a);
                                            }
                                            bxsy.m123078a(asList, tix.f46162a);
                                        }
                                        String[] strArr2 = inclusion2.f30694b;
                                        if (strArr2 != null) {
                                            List asList2 = Arrays.asList(strArr2);
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            tix tix2 = (tix) da6.f164949b;
                                            if (!tix2.f46163b.mo73666a()) {
                                                tix2.f46163b = bxvk.m124021a(tix2.f46163b);
                                            }
                                            bxsy.m123078a(asList2, tix2.f46163b);
                                        }
                                        String[] strArr3 = inclusion2.f30695c;
                                        if (strArr3 != null) {
                                            List asList3 = Arrays.asList(strArr3);
                                            if (da6.f164950c) {
                                                da6.mo74035c();
                                                da6.f164950c = false;
                                            }
                                            tix tix3 = (tix) da6.f164949b;
                                            if (!tix3.f46164c.mo73666a()) {
                                                tix3.f46164c = bxvk.m124021a(tix3.f46164c);
                                            }
                                            bxsy.m123078a(asList3, tix3.f46164c);
                                        }
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        tiy tiy2 = (tiy) da5.f164949b;
                                        tix tix4 = (tix) da6.mo74062i();
                                        tix4.getClass();
                                        if (!tiy2.f46167a.mo73666a()) {
                                            tiy2.f46167a = bxvk.m124021a(tiy2.f46167a);
                                        }
                                        tiy2.f46167a.add(tix4);
                                    }
                                }
                                tiy = (tiy) da5.mo74062i();
                            } else {
                                tiy = null;
                            }
                            if (tiy != null) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                tiv tiv3 = (tiv) da2.f164949b;
                                tiy.getClass();
                                tiv3.f46153e = tiy;
                                tiv3.f46149a |= 8;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            tiw tiw2 = (tiw) da.f164949b;
                            tiv tiv4 = (tiv) da2.mo74062i();
                            tiv4.getClass();
                            if (!tiw2.f46157b.mo73666a()) {
                                tiw2.f46157b = bxvk.m124021a(tiw2.f46157b);
                            }
                            tiw2.f46157b.add(tiv4);
                            i3++;
                            E = dtl2;
                            arrayList3 = arrayList2;
                            contextManagerClientInfo4 = contextManagerClientInfo2;
                            size = i2;
                            z = false;
                        }
                    }
                    dtl = E;
                    contextManagerClientInfo = contextManagerClientInfo4;
                    if (contextDataFilterImpl2.mo18053c()) {
                        ArrayList arrayList8 = contextDataFilterImpl2.f30671b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        tiw tiw3 = (tiw) da.f164949b;
                        if (!tiw3.f46158c.mo73666a()) {
                            tiw3.f46158c = bxvk.m124021a(tiw3.f46158c);
                        }
                        bxsy.m123078a(arrayList8, tiw3.f46158c);
                    }
                    QueryFilterParameters queryFilterParameters = contextDataFilterImpl2.f30672c;
                    if (queryFilterParameters != null) {
                        bxvd da7 = tiz.f46168e.mo74144da();
                        int i12 = queryFilterParameters.f30696a;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        tiz tiz = (tiz) da7.f164949b;
                        int i13 = tiz.f46170a | 1;
                        tiz.f46170a = i13;
                        tiz.f46171b = i12;
                        int i14 = queryFilterParameters.f30697b;
                        tiz.f46170a = i13 | 2;
                        tiz.f46172c = i14;
                        int[] iArr2 = queryFilterParameters.f30698c;
                        if (iArr2 != null) {
                            List b2 = bqcn.m112586b(iArr2);
                            if (da7.f164950c) {
                                da7.mo74035c();
                                da7.f164950c = false;
                            }
                            tiz tiz2 = (tiz) da7.f164949b;
                            if (!tiz2.f46173d.mo73666a()) {
                                tiz2.f46173d = bxvk.m124019a(tiz2.f46173d);
                            }
                            bxsy.m123078a(b2, tiz2.f46173d);
                        }
                        tiz tiz3 = (tiz) da7.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        tiw tiw4 = (tiw) da.f164949b;
                        tiz3.getClass();
                        tiw4.f46159d = tiz3;
                        tiw4.f46156a |= 1;
                    }
                    tiw = (tiw) da.mo74062i();
                } else {
                    dtl = E;
                    contextManagerClientInfo = contextManagerClientInfo4;
                    tiw = null;
                }
                dtl.mo9565e();
                dtx dtx = dtl.f13991b.f14002e;
                if (dtx.f14019f != null) {
                    String b3 = dtx.mo9600b(pendingIntent);
                    if (b3 == null) {
                        b3 = UUID.randomUUID().toString();
                        dtx.f14019f.mo25062a(new FencePendingIntentCache$FencePendingIntentItem(b3, pendingIntent));
                        srn srn = dss.f13961a;
                    }
                    dtt dtt = (dtt) dtx.f14016c.get(pendingIntent);
                    if (dtt == null) {
                        dtt = new dtt(pendingIntent, b3);
                        dtx.f14016c.put(pendingIntent, dtt);
                        dtx.f14017d.put(b3, dtt);
                    }
                    bxvd da8 = tnq.f46322h.mo74144da();
                    if (b3 != null) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        tnq tnq = (tnq) da8.f164949b;
                        b3.getClass();
                        tnq.f46324a |= 1;
                        tnq.f46325b = b3;
                    }
                    ContextManagerClientInfo contextManagerClientInfo6 = contextManagerClientInfo;
                    String str = contextManagerClientInfo6.f30678b;
                    if (str != null) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        tnq tnq2 = (tnq) da8.f164949b;
                        str.getClass();
                        tnq2.f46324a |= 2;
                        tnq2.f46326c = str;
                    }
                    String str2 = contextManagerClientInfo6.f30677a;
                    if (str2 != null) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        tnq tnq3 = (tnq) da8.f164949b;
                        str2.getClass();
                        tnq3.f46324a |= 4;
                        tnq3.f46327d = str2;
                    }
                    String str3 = contextManagerClientInfo6.f30680d;
                    if (str3 != null) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        tnq tnq4 = (tnq) da8.f164949b;
                        str3.getClass();
                        tnq4.f46324a |= 8;
                        tnq4.f46328e = str3;
                    }
                    if (tiw != null) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        tnq tnq5 = (tnq) da8.f164949b;
                        tiw.getClass();
                        tnq5.f46329f = tiw;
                        tnq5.f46324a |= 16;
                    }
                    dtt.f14012d = (tnq) da8.mo74062i();
                    srn srn2 = dss.f13961a;
                } else {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dtx", "a", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("[FencePendingIntentCache]Could not add data filter=%s. Cache is null.", tiw);
                }
                dwq.m9648E().mo9564d();
                return;
            }
            return;
        }
        m9230a(7501);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        aucb aucb;
        dom x = dwq.m9680x();
        dxo t = dwq.m9676t();
        if (this.f13940c.mo18067b()) {
            ContextDataFilterImpl contextDataFilterImpl = this.f13942e.f13853b;
            if (contextDataFilterImpl == null || contextDataFilterImpl.mo18054d() == null) {
                dwq.m9674r().mo9722a(this.f13940c.mo18066a(), this.f13942e);
                m9230a(0);
                return;
            }
            Iterator it = contextDataFilterImpl.mo18054d().iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    int a = t.mo9834a(intValue);
                    if (a != 0) {
                        m9230a(dxq.m9767a(a));
                        return;
                    }
                    z2 |= intValue == 18;
                    if (intValue != 74) {
                        z3 = false;
                    }
                    z |= z3;
                } else {
                    boolean z4 = this.f13943f & z;
                    if (!x.mo9353a(contextDataFilterImpl.mo18054d(), this.f13940c)) {
                        m9230a(7503);
                        return;
                    }
                    aucb a2 = aucu.m76778a((Object) true);
                    if (z4 && !this.f13940c.mo18066a().mo9338b()) {
                        ContextManagerClientInfo contextManagerClientInfo = this.f13940c;
                        dxy H = dwq.m9651H();
                        new Object[1][0] = contextManagerClientInfo.mo18066a();
                        if (contextManagerClientInfo.mo18066a().mo9338b()) {
                            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                            bnsl.mo68432a("dxy", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("[StandardPlaceAliasManager] Cannot use Places Alias Fences with anonymous accounts.");
                            aucb = aucu.m76778a(Collections.emptyMap());
                        } else {
                            Context f = dwq.m9662f();
                            aemh aemh = new aemh();
                            aemh.f63515a = contextManagerClientInfo.f30678b;
                            aemh.f63516b = contextManagerClientInfo.f30680d;
                            aemh.f63518d = contextManagerClientInfo.f30677a;
                            aucb = aema.m52142b(f, aemh.mo34328a()).mo34287a().mo50383b(dwq.m9667k().mo9432a(dqy.m9123a("StandardPlaceAliasManager_getStandardAliases")), new dxw());
                        }
                        a2 = aucb.mo50382b(new dxv()).mo50382b(new dxu(H, contextManagerClientInfo));
                        a2.mo50371a(new dsi(this, "[RegisterContextListenerOperation] fetchAliases for %s", this.f13940c));
                    }
                    if (z2 && !this.f13940c.mo18066a().mo9338b()) {
                        a2 = a2.mo50383b(dwq.m9667k().mo9432a(dqy.m9123a("RegisterContextListenerOperation_checkPPAccess")), new dsk(this));
                        a2.mo50371a(new dsj(this, "[RegisterContextListenerOperation] checkPersonalizedPlacesAccess for %s", this.f13940c));
                    }
                    mo9515a(a2);
                    return;
                }
            }
        } else {
            m9230a(7504);
        }
    }
}
