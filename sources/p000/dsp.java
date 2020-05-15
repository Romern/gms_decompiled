package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem;
import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: dsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsp extends drx {

    /* renamed from: c */
    private final tmo f13952c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13953d;

    /* renamed from: e */
    private final FenceUpdateRequestImpl f13954e;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0130 A[SYNTHETIC] */
    public dsp(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        super("UpdateFenceRegistrationOperation");
        ContextFenceStub contextFenceStub;
        this.f13952c = tmo;
        this.f13953d = contextManagerClientInfo;
        ArrayList arrayList = fenceUpdateRequestImpl.f30661a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            int i2 = updateFenceOperation.f30662a;
            switch (i2) {
                case 1:
                case 2:
                case 8:
                    ContextFenceStub contextFenceStub2 = updateFenceOperation.f30663b.f30626b;
                    if (contextFenceStub2.mo18036d() == 6) {
                        int a = bxeb.m122619a(contextFenceStub2.mo18038f().f46237a.f163081b);
                        if ((a == 0 ? 1 : a) - 1 == 4) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(contextFenceStub2);
                            bxvd da = bxen.f163109e.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxen bxen = (bxen) da.f164949b;
                            bxen.f163112b = 1;
                            bxen.f163111a |= 1;
                            bxen.m122633a(bxen);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxen bxen2 = (bxen) da.f164949b;
                            bxen2.f163114d = 2;
                            bxen2.f163111a = 4 | bxen2.f163111a;
                            tlf tlf = new tlf((bxen) da.mo74062i());
                            sdo.m34959a(tlf);
                            bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
                            bxcl bxcl = bxcl.SCREEN_FENCE;
                            if (bxcj.f164950c) {
                                bxcj.mo74035c();
                                bxcj.f164950c = false;
                            }
                            bxcm bxcm = (bxcm) bxcj.f164949b;
                            bxcm.f162815b = bxcl.f162810z;
                            int i3 = bxcm.f162814a | 1;
                            bxcm.f162814a = i3;
                            bxen bxen3 = tlf.f46238a;
                            bxen3.getClass();
                            bxcm.f162821h = bxen3;
                            bxcm.f162814a = i3 | 32;
                            arrayList2.add(new ContextFenceStub((bxcm) bxcj.mo74062i()));
                            sdo.m34959a(arrayList2);
                            sdo.m34974b(!arrayList2.isEmpty());
                            bxcj bxcj2 = (bxcj) bxcm.f162813z.mo74144da();
                            bxcl bxcl2 = bxcl.AND;
                            if (bxcj2.f164950c) {
                                bxcj2.mo74035c();
                                bxcj2.f164950c = false;
                            }
                            bxcm bxcm2 = (bxcm) bxcj2.f164949b;
                            bxcm2.f162815b = bxcl2.f162810z;
                            bxcm2.f162814a = 1 | bxcm2.f162814a;
                            bxcj2.mo73563a(ContextFenceStub.m22864a(arrayList2));
                            contextFenceStub = new ContextFenceStub((bxcm) bxcj2.mo74062i());
                            if (contextFenceStub != contextFenceStub2) {
                                break;
                            } else {
                                updateFenceOperation.f30663b.f30626b = contextFenceStub;
                                break;
                            }
                        }
                    }
                    contextFenceStub = contextFenceStub2;
                    if (contextFenceStub != contextFenceStub2) {
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    new Object[1][0] = Integer.valueOf(i2);
                    break;
                default:
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dsp", "a", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[UpdateFenceRegistrationOperation] Unrecognized UpdateFenceOperation Type %s", updateFenceOperation.f30662a);
                    break;
            }
        }
        this.f13954e = fenceUpdateRequestImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0127 A[SYNTHETIC] */
    /* renamed from: a */
    private static FenceUpdateRequestImpl m9238a(FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        ContextFenceStub contextFenceStub;
        ArrayList arrayList = fenceUpdateRequestImpl.f30661a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            int i2 = updateFenceOperation.f30662a;
            switch (i2) {
                case 1:
                case 2:
                case 8:
                    ContextFenceStub contextFenceStub2 = updateFenceOperation.f30663b.f30626b;
                    if (contextFenceStub2.mo18036d() == 6) {
                        int a = bxeb.m122619a(contextFenceStub2.mo18038f().f46237a.f163081b);
                        if (a == 0) {
                            a = 1;
                        }
                        if (a - 1 == 4) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(contextFenceStub2);
                            bxvd da = bxen.f163109e.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxen bxen = (bxen) da.f164949b;
                            bxen.f163112b = 1;
                            bxen.f163111a |= 1;
                            bxen.m122633a(bxen);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxen bxen2 = (bxen) da.f164949b;
                            bxen2.f163114d = 2;
                            bxen2.f163111a = 4 | bxen2.f163111a;
                            tlf tlf = new tlf((bxen) da.mo74062i());
                            sdo.m34959a(tlf);
                            bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
                            bxcl bxcl = bxcl.SCREEN_FENCE;
                            if (bxcj.f164950c) {
                                bxcj.mo74035c();
                                bxcj.f164950c = false;
                            }
                            bxcm bxcm = (bxcm) bxcj.f164949b;
                            bxcm.f162815b = bxcl.f162810z;
                            int i3 = bxcm.f162814a | 1;
                            bxcm.f162814a = i3;
                            bxen bxen3 = tlf.f46238a;
                            bxen3.getClass();
                            bxcm.f162821h = bxen3;
                            bxcm.f162814a = i3 | 32;
                            arrayList2.add(new ContextFenceStub((bxcm) bxcj.mo74062i()));
                            sdo.m34959a(arrayList2);
                            sdo.m34974b(!arrayList2.isEmpty());
                            bxcj bxcj2 = (bxcj) bxcm.f162813z.mo74144da();
                            bxcl bxcl2 = bxcl.AND;
                            if (bxcj2.f164950c) {
                                bxcj2.mo74035c();
                                bxcj2.f164950c = false;
                            }
                            bxcm bxcm2 = (bxcm) bxcj2.f164949b;
                            bxcm2.f162815b = bxcl2.f162810z;
                            bxcm2.f162814a = 1 | bxcm2.f162814a;
                            bxcj2.mo73563a(ContextFenceStub.m22864a(arrayList2));
                            contextFenceStub = new ContextFenceStub((bxcm) bxcj2.mo74062i());
                            if (contextFenceStub != contextFenceStub2) {
                                break;
                            } else {
                                updateFenceOperation.f30663b.f30626b = contextFenceStub;
                                break;
                            }
                        }
                    }
                    contextFenceStub = contextFenceStub2;
                    if (contextFenceStub != contextFenceStub2) {
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    new Object[1][0] = Integer.valueOf(i2);
                    break;
                default:
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dsp", "a", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[UpdateFenceRegistrationOperation] Unrecognized UpdateFenceOperation Type %s", updateFenceOperation.f30662a);
                    break;
            }
        }
        return fenceUpdateRequestImpl;
    }

    /* renamed from: b */
    private final void m9239b(Set set) {
        ArrayList arrayList = this.f13954e.f30661a;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            int i2 = updateFenceOperation.f30662a;
            if (i2 == 1 || i2 == 2) {
                dus dus = new dus(updateFenceOperation.f30663b.f30626b.mo18035c());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                if (dus.mo9676u()) {
                    arrayList2.add(updateFenceOperation);
                }
            }
        }
        if (sqw.m36041a((Collection) arrayList2)) {
            set.remove(6);
            mo9532a(set);
        } else if (this.f13953d.mo18066a().mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dsp", "b", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[UpdateFenceRegistrationOperation] Cannot use Places Alias Fences with anonymous accounts.");
            mo9531a(7504);
        } else {
            Context f = dwq.m9662f();
            aemh aemh = new aemh();
            ContextManagerClientInfo contextManagerClientInfo = this.f13953d;
            aemh.f63515a = contextManagerClientInfo.f30678b;
            aemh.f63516b = contextManagerClientInfo.f30680d;
            aemh.f63518d = contextManagerClientInfo.f30677a;
            aema.m52142b(f, aemh.mo34328a()).mo34287a().mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("UpdateFenceRegistrationOperation_getStandardAliases")), new dso(this, "[UpdateFenceRegistrationOperation] get standard aliases", new Object[0], arrayList2, set));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        if (!this.f13953d.mo18067b()) {
            mo9531a(7504);
            return;
        }
        if (this.f13953d.mo18070e()) {
            dtl E = dwq.m9648E();
            ContextManagerClientInfo contextManagerClientInfo = this.f13953d;
            FenceUpdateRequestImpl fenceUpdateRequestImpl = this.f13954e;
            int aq = (int) cdgp.f180782a.mo6606a().mo77572aq();
            dtb a = dtd.m9275a(contextManagerClientInfo, fenceUpdateRequestImpl, E.f13991b);
            List a2 = E.f13991b.mo9570a(contextManagerClientInfo);
            if ((a2 != null ? a2.size() : 0) + (a.f13974a.size() - a.f13975b.size()) > aq) {
                mo9531a(7515);
                return;
            }
        }
        HashSet<Integer> hashSet = new HashSet();
        ArrayList arrayList = this.f13954e.f30661a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            int i2 = updateFenceOperation.f30662a;
            if (i2 == 1 || i2 == 2 || i2 == 8) {
                ContextFenceStub contextFenceStub = updateFenceOperation.f30663b.f30626b;
                contextFenceStub.mo18039g();
                contextFenceStub.mo18032a((Set) hashSet);
            }
        }
        hashSet.remove(-1);
        if (hashSet.remove(-3)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dsp", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[UpdateFenceRegistrationOperation] UpdateFenceRegistrationOperation: Predictive fence not supported.");
            mo9531a(7514);
            return;
        }
        ContextManagerClientInfo contextManagerClientInfo2 = this.f13953d;
        if (!hashSet.isEmpty() && !contextManagerClientInfo2.mo18068c() && !contextManagerClientInfo2.mo18069d() && contextManagerClientInfo2.f30682f != -1) {
            for (Integer num : hashSet) {
                if (!dqz.f13849a.contains(Integer.valueOf(num.intValue()))) {
                    mo9531a(7514);
                    return;
                }
            }
        }
        if (!hashSet.isEmpty()) {
            dxo t = dwq.m9676t();
            for (Integer num2 : hashSet) {
                int a3 = t.mo9834a(num2.intValue());
                if (a3 != 0) {
                    mo9531a(dxq.m9767a(a3));
                    return;
                }
            }
            if (!dwq.m9680x().mo9354a(hashSet, this.f13953d, true)) {
                mo9531a(7503);
                return;
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = this.f13954e.f30661a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            UpdateFenceOperation updateFenceOperation2 = (UpdateFenceOperation) arrayList2.get(i3);
            int i4 = updateFenceOperation2.f30662a;
            if (i4 == 1 || i4 == 2 || i4 == 8) {
                updateFenceOperation2.f30663b.f30626b.mo18033b(hashSet2);
            }
        }
        mo9532a(hashSet2);
    }

    /* renamed from: a */
    public final void mo9531a(int i) {
        drn.m9163a(this.f13952c, i);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13953d;
        FenceUpdateRequestImpl fenceUpdateRequestImpl = this.f13954e;
        bxvd a = dpf.m9018a(contextManagerClientInfo, 8, i);
        bxvd da = bxgw.f163317b.mo74144da();
        ArrayList arrayList = fenceUpdateRequestImpl.f30661a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i2);
            if (dpf.m9015a(updateFenceOperation) != null) {
                bxgv a2 = dpf.m9015a(updateFenceOperation);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxgw bxgw = (bxgw) da.f164949b;
                a2.getClass();
                if (!bxgw.f163319a.mo73666a()) {
                    bxgw.f163319a = bxvk.m124021a(bxgw.f163319a);
                }
                bxgw.f163319a.add(a2);
            }
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgw bxgw2 = (bxgw) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxgw2.getClass();
        bxgc.f163234k = bxgw2;
        bxgc.f163224a |= 512;
        G.mo9374a((bxgc) a.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnot.b(java.lang.Object, java.lang.Iterable):void
     arg types: [java.lang.String, java.util.HashSet]
     candidates:
      bnmu.b(java.lang.Object, java.lang.Object):boolean
      bnot.b(java.lang.Object, java.lang.Iterable):void */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0a56  */
    /* renamed from: a */
    public final void mo9532a(Set set) {
        dtj dtj;
        boolean z;
        boolean z2;
        boolean z3;
        Iterator it;
        boolean z4;
        boolean z5;
        dtj dtj2;
        boolean z6;
        String str;
        char c;
        int i;
        HashSet<dwa> hashSet;
        int i2;
        int i3;
        dtc dtc;
        boolean z7;
        FenceUpdateRequestImpl fenceUpdateRequestImpl;
        ContextManagerClientInfo contextManagerClientInfo;
        FenceUpdateRequestImpl fenceUpdateRequestImpl2;
        ContextManagerClientInfo contextManagerClientInfo2;
        boolean z8;
        dtc dtc2;
        boolean z9;
        HashMap hashMap;
        Iterator it2;
        char c2;
        int i4;
        NearbyAlertFilter nearbyAlertFilter;
        long j;
        String str2;
        int i5;
        List list;
        boolean z10;
        Set a;
        Set set2 = set;
        Iterator it3 = set.iterator();
        while (true) {
            String str3 = "b";
            ArrayList arrayList = null;
            int i6 = 1;
            char c3 = 0;
            if (it3.hasNext()) {
                int intValue = ((Integer) it3.next()).intValue();
                if (intValue == 0) {
                    break;
                } else if (intValue == 6) {
                    ArrayList arrayList2 = this.f13954e.f30661a;
                    int size = arrayList2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList2.get(i7);
                        int i8 = updateFenceOperation.f30662a;
                        if (i8 == 1 || i8 == 2) {
                            dus dus = new dus(updateFenceOperation.f30663b.f30626b.mo18035c());
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (dus.mo9676u()) {
                                arrayList.add(updateFenceOperation);
                            }
                        }
                    }
                    if (sqw.m36041a((Collection) arrayList)) {
                        set2.remove(6);
                        mo9532a(set);
                        return;
                    } else if (this.f13953d.mo18066a().mo9338b()) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                        bnsl.mo68432a("dsp", str3, (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("[UpdateFenceRegistrationOperation] Cannot use Places Alias Fences with anonymous accounts.");
                        mo9531a(7504);
                        return;
                    } else {
                        Context f = dwq.m9662f();
                        aemh aemh = new aemh();
                        ContextManagerClientInfo contextManagerClientInfo3 = this.f13953d;
                        aemh.f63515a = contextManagerClientInfo3.f30678b;
                        aemh.f63516b = contextManagerClientInfo3.f30680d;
                        aemh.f63518d = contextManagerClientInfo3.f30677a;
                        aema.m52142b(f, aemh.mo34328a()).mo34287a().mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("UpdateFenceRegistrationOperation_getStandardAliases")), new dso(this, "[UpdateFenceRegistrationOperation] get standard aliases", new Object[0], arrayList, set));
                        return;
                    }
                } else if (intValue == 23) {
                    int i9 = Build.VERSION.SDK_INT;
                    aucb b = ecn.m10110a().mo9962b();
                    b.mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("ShushGestureSensor_check_shush_availability")), new ecj());
                    b.mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("UpdateFenceRegistrationOperation_check_shush_availability")), new dsn(this, set2));
                    return;
                } else if (intValue == 24 && !cdim.f180951a.mo6606a().mo77650a()) {
                    break;
                }
            } else {
                FenceUpdateRequestImpl fenceUpdateRequestImpl3 = this.f13954e;
                ArrayList arrayList3 = new ArrayList(fenceUpdateRequestImpl3.f30661a.size());
                ArrayList arrayList4 = fenceUpdateRequestImpl3.f30661a;
                int size2 = arrayList4.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    UpdateFenceOperation updateFenceOperation2 = (UpdateFenceOperation) arrayList4.get(i10);
                    if (updateFenceOperation2.f30662a != 8) {
                        arrayList3.add(updateFenceOperation2);
                    }
                }
                FenceUpdateRequestImpl fenceUpdateRequestImpl4 = !arrayList3.isEmpty() ? new FenceUpdateRequestImpl(arrayList3) : null;
                if (fenceUpdateRequestImpl4 != null) {
                    dtl E = dwq.m9648E();
                    ContextManagerClientInfo contextManagerClientInfo4 = this.f13953d;
                    E.mo9565e();
                    Object[] objArr = {contextManagerClientInfo4, fenceUpdateRequestImpl4};
                    dtb a2 = dtd.m9275a(contextManagerClientInfo4, fenceUpdateRequestImpl4, E.f13991b);
                    Object[] objArr2 = {Integer.valueOf(a2.f13975b.size()), Integer.valueOf(a2.f13974a.size())};
                    List list2 = a2.f13975b;
                    int size3 = list2.size();
                    int i11 = 0;
                    boolean z11 = false;
                    while (i11 < size3) {
                        dtc dtc3 = (dtc) list2.get(i11);
                        Object[] objArr3 = new Object[i6];
                        String str4 = dtc3.f13976a.f14122e;
                        objArr3[c3] = str4;
                        Set c4 = E.f13991b.mo9578c(str4);
                        duu d = E.f13991b.mo9581d(str4);
                        if (d != null) {
                            d.mo9680a(arrayList);
                            E.mo9560a(arrayList, c4);
                            ego ego = d.f14126i;
                            if (!(ego == null || (a = dtl.m9293a(ego)) == null)) {
                                E.mo9561a(a);
                            }
                            PlaceFenceHelper placeFenceHelper = E.f13994e;
                            Iterator it4 = d.f14119b.mo9668n().iterator();
                            while (it4.hasNext()) {
                                dvd dvd = (dvd) it4.next();
                                if (PlaceFenceHelper.m4877a(dvd)) {
                                    Iterator it5 = it4;
                                    List a3 = dug.m9367a(dvd);
                                    if (a3.isEmpty()) {
                                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                                        bnsl2.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", str3, 509, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68420a("[PlaceFenceHelper] NearbyAlert record not found for %s", dvd);
                                        it4 = it5;
                                        list2 = list2;
                                        size3 = size3;
                                    } else {
                                        List list3 = list2;
                                        int i12 = size3;
                                        int size4 = a3.size();
                                        int i13 = 0;
                                        boolean z12 = false;
                                        while (i13 < size4) {
                                            String str5 = str3;
                                            List list4 = a3;
                                            duh duh = (duh) placeFenceHelper.f7706b.get((dug) a3.get(i13));
                                            if (duh != null) {
                                                duh.f14039a.remove(dvd);
                                                z12 |= !duh.mo9613a();
                                            }
                                            i13++;
                                            a3 = list4;
                                            str3 = str5;
                                        }
                                        String str6 = str3;
                                        if (z12) {
                                            placeFenceHelper.mo6261a();
                                            it4 = it5;
                                            list2 = list3;
                                            size3 = i12;
                                            str3 = str6;
                                        } else {
                                            it4 = it5;
                                            list2 = list3;
                                            size3 = i12;
                                            str3 = str6;
                                        }
                                    }
                                }
                            }
                            str2 = str3;
                            list = list2;
                            i5 = size3;
                            dwq.m9646C().mo10104a(dwq.m9665i().mo20505a(), d.f14118a, 12);
                            z10 = true;
                        } else {
                            str2 = str3;
                            list = list2;
                            i5 = size3;
                            z10 = false;
                        }
                        new Object[1][0] = Boolean.valueOf(z10);
                        z11 |= drj.m9148a(dtc3.f13977b.f13873b);
                        i11++;
                        list2 = list;
                        size3 = i5;
                        str3 = str2;
                        arrayList = null;
                        i6 = 1;
                        c3 = 0;
                    }
                    List list5 = a2.f13974a;
                    int size5 = list5.size();
                    int i14 = 0;
                    boolean z13 = false;
                    while (i14 < size5) {
                        dtc dtc4 = (dtc) list5.get(i14);
                        egr C = dwq.m9646C();
                        duu duu = dtc4.f13976a;
                        C.mo10104a(duu.f14133p, duu.f14118a, 11);
                        duu duu2 = dtc4.f13976a;
                        dri dri = dtc4.f13977b;
                        dus dus2 = duu2.f14119b;
                        String str7 = duu2.f14122e;
                        dto dto = E.f13991b;
                        List list6 = list5;
                        drk drk = (drk) dto.f14001d.get(dri);
                        if (drk == null) {
                            drk = new drk(dri);
                            i2 = size5;
                            new Object[1][0] = drk;
                            dto.f14001d.put(dri, drk);
                        } else {
                            i2 = size5;
                        }
                        ego ego2 = new ego();
                        dua.m9358a(dus2, ego2, drk, contextManagerClientInfo4);
                        if (!ego2.mo10099a()) {
                            i3 = i14;
                            long a4 = dwq.m9665i().mo20505a();
                            for (int i15 = 0; i15 < ego2.size(); i15++) {
                                for (dwa dwa : (Set) ego2.valueAt(i15)) {
                                    dwa.mo9745a(a4);
                                    ego2 = ego2;
                                }
                            }
                        } else {
                            i3 = i14;
                            ego2 = null;
                        }
                        if (ego2 == null) {
                            fenceUpdateRequestImpl2 = fenceUpdateRequestImpl4;
                            contextManagerClientInfo2 = contextManagerClientInfo4;
                            z8 = z13;
                            dtc2 = dtc4;
                        } else if (!ego2.mo10099a()) {
                            Set c5 = E.f13991b.mo9578c(str7);
                            duu d2 = E.f13991b.mo9581d(str7);
                            if (d2 != null) {
                                d2.mo9680a((List) null);
                            }
                            duu2.f14126i = ego2;
                            duu2.f14127j = new SparseBooleanArray(duu2.f14126i.size());
                            for (int i16 = 0; i16 < duu2.f14126i.size(); i16++) {
                                duu2.f14127j.put(duu2.f14126i.keyAt(i16), false);
                            }
                            dto dto2 = E.f13991b;
                            new Object[1][0] = dto2.f14001d.keySet();
                            drk drk2 = (drk) dto2.f14001d.get(dri);
                            if (drk2 != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            sdo.m34970a(z9);
                            dto2.mo9572a(duu2);
                            dto2.f14004g.put(duu2.f14119b, duu2);
                            drk drk3 = (drk) dto2.f13998a.remove(duu2.f14122e);
                            if (drk3 != null) {
                                duu.m9453a(duu2, 3);
                                drk3.mo9488a(duu2.f14122e);
                                if (drk3.mo9494e()) {
                                    dto2.f14001d.remove(drk3.f13876a);
                                }
                            }
                            drk2.f13877b.put(duu2.f14122e, duu2);
                            duu2.mo9681b(0);
                            Object[] objArr4 = {drk2.f13876a, drk2.f13877b};
                            dto2.f13998a.put(duu2.f14122e, drk2);
                            duu.m9453a(duu2, 2);
                            dus dus3 = duu2.f14119b;
                            if (dus3.f14098h == null) {
                                dus3.f14098h = dus3.mo9662a(bxcl.LOCATION_FENCE);
                            }
                            List list7 = !dus3.f14098h.isEmpty() ? dus3.f14098h : null;
                            if (list7 == null || list7.isEmpty()) {
                                fenceUpdateRequestImpl = fenceUpdateRequestImpl4;
                                contextManagerClientInfo = contextManagerClientInfo4;
                                z7 = z13;
                                dtc = dtc4;
                                hashMap = null;
                            } else {
                                if (sqw.m36041a((Collection) dus3.mo9667m())) {
                                    j = cdgp.f180782a.mo6606a().mo77556aa();
                                } else {
                                    j = cdgp.f180782a.mo6606a().mo77558ac();
                                }
                                Long valueOf = Long.valueOf(j);
                                HashMap hashMap2 = new HashMap();
                                int size6 = list7.size();
                                contextManagerClientInfo = contextManagerClientInfo4;
                                int i17 = 0;
                                while (i17 < size6) {
                                    duy duy = (duy) list7.get(i17);
                                    aehf aehf = new aehf();
                                    aehf.mo34146a(ayuo.m84847b(duy.mo9685a()), ayuo.m84847b(duy.mo9688j()), Math.max(1.0f, (float) duy.mo9690l()));
                                    aehf.mo34147b();
                                    aehf.f63391d = valueOf.intValue();
                                    aehf.f63388a = UUID.randomUUID().toString();
                                    aehf.f63389b = 3;
                                    hashMap2.put(duy, aehf.mo34145a());
                                    i17++;
                                    size6 = size6;
                                    list7 = list7;
                                    fenceUpdateRequestImpl4 = fenceUpdateRequestImpl4;
                                    z13 = z13;
                                    dtc4 = dtc4;
                                }
                                fenceUpdateRequestImpl = fenceUpdateRequestImpl4;
                                z7 = z13;
                                dtc = dtc4;
                                hashMap = hashMap2;
                            }
                            if (hashMap != null) {
                                HashSet hashSet2 = new HashSet();
                                hashSet2.addAll(hashMap.values());
                                dto2.f13999b.mo67363b((Object) duu2.f14122e, (Iterable) hashSet2);
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    dto2.f14000c.put(((ParcelableGeofence) entry.getValue()).f79438a, (duy) entry.getKey());
                                }
                            }
                            if (dri.f13873b == 2) {
                                dtx dtx = dto2.f14002e;
                                PendingIntent pendingIntent = dri.f13875d;
                                boolean z14 = dri.f13872a.f30686j == Process.myPid();
                                if (dtx.f14019f != null) {
                                    String b2 = dtx.mo9600b(pendingIntent);
                                    if (b2 == null) {
                                        b2 = UUID.randomUUID().toString();
                                        dtx.f14019f.mo25062a(new FencePendingIntentCache$FencePendingIntentItem(b2, pendingIntent));
                                        srn srn = dss.f13961a;
                                    }
                                    dtt dtt = (dtt) dtx.f14016c.get(pendingIntent);
                                    if (dtt == null) {
                                        dtt = new dtt(pendingIntent, b2);
                                        dtx.f14016c.put(pendingIntent, dtt);
                                        dtx.f14017d.put(b2, dtt);
                                    }
                                    dtx.f14018e.put(duu2.f14122e, dtt);
                                    bxvd da = tnp.f46311j.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    tnp tnp = (tnp) da.f164949b;
                                    b2.getClass();
                                    int i18 = tnp.f46313a | 1;
                                    tnp.f46313a = i18;
                                    tnp.f46314b = b2;
                                    String str8 = duu2.f14123f;
                                    str8.getClass();
                                    int i19 = i18 | 2;
                                    tnp.f46313a = i19;
                                    tnp.f46315c = str8;
                                    String str9 = duu2.f14124g;
                                    str9.getClass();
                                    int i20 = i19 | 4;
                                    tnp.f46313a = i20;
                                    tnp.f46316d = str9;
                                    String str10 = duu2.f14125h;
                                    str10.getClass();
                                    int i21 = i20 | 8;
                                    tnp.f46313a = i21;
                                    tnp.f46317e = str10;
                                    String str11 = duu2.f14118a;
                                    str11.getClass();
                                    int i22 = i21 | 16;
                                    tnp.f46313a = i22;
                                    tnp.f46318f = str11;
                                    bxcm bxcm = (bxcm) duu2.f14119b.f14076c;
                                    bxcm.getClass();
                                    tnp.f46319g = bxcm;
                                    int i23 = i22 | 32;
                                    tnp.f46313a = i23;
                                    long j2 = duu2.f14120c;
                                    int i24 = i23 | 64;
                                    tnp.f46313a = i24;
                                    tnp.f46320h = j2;
                                    tnp.f46313a = i24 | 128;
                                    tnp.f46321i = z14;
                                    dtt.mo9587a(duu2.f14122e, (tnp) da.mo74062i());
                                    srn srn2 = dss.f13961a;
                                } else {
                                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                                    bnsl3.mo68432a("dtx", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68420a("[FencePendingIntentCache]Could not add registration=%s. Cache is null.", duu2);
                                }
                            }
                            E.mo9560a(E.f13991b.mo9578c(duu2.f14122e), c5);
                            PlaceFenceHelper placeFenceHelper2 = E.f13994e;
                            Iterator it6 = duu2.f14119b.mo9668n().iterator();
                            while (it6.hasNext()) {
                                dvd dvd2 = (dvd) it6.next();
                                if (PlaceFenceHelper.m4877a(dvd2)) {
                                    List a5 = dug.m9367a(dvd2);
                                    int size7 = a5.size();
                                    int i25 = 0;
                                    while (i25 < size7) {
                                        dug dug = (dug) a5.get(i25);
                                        if (placeFenceHelper2.f7706b.containsKey(dug)) {
                                            ((duh) placeFenceHelper2.f7706b.get(dug)).mo9612a(dvd2);
                                            it2 = it6;
                                            i4 = 1;
                                            c2 = 0;
                                        } else {
                                            Intent intent = new Intent("android.gms.contextmanager.NEARBY_ALERTS");
                                            intent.setPackage("com.google.android.gms");
                                            int i26 = dug.f14037a;
                                            if (i26 == 1) {
                                                it2 = it6;
                                                String str12 = (String) dug.f14038b;
                                                intent.putExtra("extraPlaceChain", str12);
                                                if (!TextUtils.isEmpty(str12)) {
                                                    nearbyAlertFilter = new NearbyAlertFilter(null, null, str12, false);
                                                } else {
                                                    throw new IllegalArgumentException("NearbyAlertFilters must contain a non empty chain name to match results with.");
                                                }
                                            } else if (i26 != 2) {
                                                int intValue2 = ((Integer) dug.f14038b).intValue();
                                                intent.putExtra("extraPlaceType", intValue2);
                                                nearbyAlertFilter = NearbyAlertFilter.m66907c(Collections.singletonList(Integer.valueOf(intValue2)));
                                                it2 = it6;
                                            } else {
                                                String str13 = (String) dug.f14038b;
                                                if (!placeFenceHelper2.f7708d) {
                                                    intent.putExtra("extraPlaceId", str13);
                                                    nearbyAlertFilter = NearbyAlertFilter.m66906b(Collections.singletonList(str13));
                                                    it2 = it6;
                                                } else {
                                                    new Object[1][0] = str13;
                                                    it2 = it6;
                                                    aema.m52142b(dwq.m9662f(), placeFenceHelper2.f7707c).mo34288a(str13).mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("request_geofence")), new due(placeFenceHelper2, "[PlaceFenceHelper] get place by id %s", new Object[]{str13}, str13, dvd2, dug));
                                                    i4 = 1;
                                                    c2 = 0;
                                                }
                                            }
                                            Context context = placeFenceHelper2.f7705a;
                                            int i27 = placeFenceHelper2.f7709e;
                                            placeFenceHelper2.f7709e = i27 + 1;
                                            PendingIntent broadcast = PendingIntent.getBroadcast(context, i27, intent, 134217728);
                                            NearbyAlertRequest a6 = NearbyAlertRequest.m66910a(nearbyAlertFilter, 0);
                                            duh duh2 = new duh(broadcast, 0);
                                            duh2.mo9612a(dvd2);
                                            placeFenceHelper2.f7706b.put(dug, duh2);
                                            i4 = 1;
                                            c2 = 0;
                                            aema.m52141a(dwq.m9662f(), placeFenceHelper2.f7707c).mo34299a(a6, broadcast).mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("PlaceFenceHelper_addPlaceFence")), new dud(placeFenceHelper2, "[PlaceFenceHelper] addPlaceFence for NearbyAlert %s", new Object[]{nearbyAlertFilter}, dug));
                                        }
                                        new Object[i4][c2] = dvd2;
                                        i25++;
                                        it6 = it2;
                                    }
                                }
                            }
                            continue;
                            z13 = z7 | drj.m9148a(dtc.f13977b.f13873b);
                            i14 = i3 + 1;
                            list5 = list6;
                            size5 = i2;
                            contextManagerClientInfo4 = contextManagerClientInfo;
                            fenceUpdateRequestImpl4 = fenceUpdateRequestImpl;
                        } else {
                            fenceUpdateRequestImpl2 = fenceUpdateRequestImpl4;
                            contextManagerClientInfo2 = contextManagerClientInfo4;
                            z8 = z13;
                            dtc2 = dtc4;
                        }
                        new Object[1][0] = duu2;
                        z13 = z7 | drj.m9148a(dtc.f13977b.f13873b);
                        i14 = i3 + 1;
                        list5 = list6;
                        size5 = i2;
                        contextManagerClientInfo4 = contextManagerClientInfo;
                        fenceUpdateRequestImpl4 = fenceUpdateRequestImpl;
                    }
                    FenceUpdateRequestImpl fenceUpdateRequestImpl5 = fenceUpdateRequestImpl4;
                    ContextManagerClientInfo contextManagerClientInfo5 = contextManagerClientInfo4;
                    boolean z15 = z11 | z13;
                    new Object[1][0] = Boolean.valueOf(z15);
                    HashSet hashSet3 = new HashSet();
                    HashSet hashSet4 = new HashSet();
                    ArrayList arrayList5 = fenceUpdateRequestImpl5.f30661a;
                    int size8 = arrayList5.size();
                    for (int i28 = 0; i28 < size8; i28++) {
                        UpdateFenceOperation updateFenceOperation3 = (UpdateFenceOperation) arrayList5.get(i28);
                        int i29 = updateFenceOperation3.f30662a;
                        if (i29 == 6) {
                            dti a7 = dti.m9284a(updateFenceOperation3);
                            hashSet4.remove(a7);
                            hashSet3.remove(a7);
                            hashSet3.add(a7);
                        } else if (i29 != 7) {
                            new Object[1][0] = Integer.valueOf(i29);
                        } else {
                            dti a8 = dti.m9284a(updateFenceOperation3);
                            hashSet3.remove(a8);
                            hashSet4.remove(a8);
                            hashSet4.add(a8);
                        }
                    }
                    if (dss.m9250a(2)) {
                        Iterator it7 = hashSet3.iterator();
                        while (it7.hasNext()) {
                            Object[] objArr5 = {(dti) it7.next()};
                        }
                        Iterator it8 = hashSet4.iterator();
                        while (it8.hasNext()) {
                            Object[] objArr6 = {(dti) it8.next()};
                        }
                    }
                    if (hashSet3.size() > 0 || hashSet4.size() > 0) {
                        dtj = new dtj(hashSet3, hashSet4);
                    } else {
                        dtj = null;
                    }
                    if (dtj != null) {
                        Iterator it9 = dtj.f13987a.iterator();
                        boolean z16 = false;
                        while (it9.hasNext()) {
                            dti dti = (dti) it9.next();
                            ContextManagerClientInfo contextManagerClientInfo6 = contextManagerClientInfo5;
                            String a9 = duu.m9451a(contextManagerClientInfo6, dti.f13984a);
                            duu b3 = E.f13991b.mo9575b(a9);
                            drk a10 = E.f13991b.mo9568a(a9);
                            if (b3 == null) {
                                z5 = z15;
                                it = it9;
                                z4 = z16;
                                str = a9;
                                dtj2 = dtj;
                                i = 1;
                                c = 0;
                            } else if (a10 != null) {
                                dus dus4 = b3.f14119b;
                                long j3 = dti.f13985b;
                                long j4 = dti.f13986c;
                                HashSet hashSet5 = new HashSet();
                                dus4.mo9663a(hashSet5);
                                HashSet hashSet6 = new HashSet();
                                long min = Math.min(j4, cdgp.m133214w());
                                long a11 = dwq.m9665i().mo20505a();
                                Iterator it10 = hashSet5.iterator();
                                while (it10.hasNext()) {
                                    int intValue3 = ((Integer) it10.next()).intValue();
                                    Iterator it11 = it9;
                                    Iterator it12 = it10;
                                    String uuid = UUID.randomUUID().toString();
                                    boolean z17 = z15;
                                    bxco b4 = tiq.m37051b(intValue3);
                                    dtj dtj3 = dtj;
                                    boolean z18 = z16;
                                    bxvd da2 = bxda.f163011d.mo74144da();
                                    String str14 = a9;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bxda bxda = (bxda) da2.f164949b;
                                    dtl dtl = E;
                                    bxda.f163014b = 1;
                                    duu duu3 = b3;
                                    int i30 = bxda.f163013a | 1;
                                    bxda.f163013a = i30;
                                    bxda.f163013a = i30 | 2;
                                    bxda.f163015c = min;
                                    dvy dvy = new dvy(uuid, b4, new dwj((bxda) da2.mo74062i()), contextManagerClientInfo6);
                                    bxvd da3 = bxdf.f163018j.mo74144da();
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bxdf bxdf = (bxdf) da3.f164949b;
                                    bxdf.f163021b = 6;
                                    int i31 = bxdf.f163020a | 1;
                                    bxdf.f163020a = i31;
                                    bxdf.f163020a = i31 | 64;
                                    bxdf.f163027h = j3;
                                    dvy.mo9737a(new dwk((bxdf) da3.mo74062i()));
                                    dwa a12 = dvy.mo9734a();
                                    a12.mo9745a(a11);
                                    hashSet6.add(a12);
                                    it9 = it11;
                                    dtj = dtj3;
                                    z15 = z17;
                                    it10 = it12;
                                    a9 = str14;
                                    z16 = z18;
                                    E = dtl;
                                    b3 = duu3;
                                }
                                z5 = z15;
                                dtl dtl2 = E;
                                it = it9;
                                z4 = z16;
                                String str15 = a9;
                                duu duu4 = b3;
                                dtj2 = dtj;
                                if (!hashSet6.isEmpty()) {
                                    hashSet = hashSet6;
                                } else {
                                    hashSet = null;
                                }
                                if (hashSet == null) {
                                    E = dtl2;
                                } else if (!hashSet.isEmpty()) {
                                    E = dtl2;
                                    E.f13991b.mo9574a(duu4.mo9678a());
                                    for (dwa dwa2 : hashSet) {
                                        duu duu5 = duu4;
                                        if (duu5.f14126i.mo10098a(dwa2.mo9747b().f162973bD, dwa2) == 2) {
                                            duu5.f14127j.put(dwa2.mo9747b().f162973bD, false);
                                            duu4 = duu5;
                                        } else {
                                            duu4 = duu5;
                                        }
                                    }
                                    E.f13991b.mo9572a(duu4);
                                    z6 = true;
                                    z16 = z4 | z6;
                                    it9 = it;
                                    contextManagerClientInfo5 = contextManagerClientInfo6;
                                    dtj = dtj2;
                                    z15 = z5;
                                } else {
                                    E = dtl2;
                                }
                                z6 = false;
                                new Object[1][0] = str15;
                                z16 = z4 | z6;
                                it9 = it;
                                contextManagerClientInfo5 = contextManagerClientInfo6;
                                dtj = dtj2;
                                z15 = z5;
                            } else {
                                z5 = z15;
                                it = it9;
                                z4 = z16;
                                str = a9;
                                dtj2 = dtj;
                                i = 1;
                                c = 0;
                            }
                            new Object[i][c] = str;
                            z6 = false;
                            z16 = z4 | z6;
                            it9 = it;
                            contextManagerClientInfo5 = contextManagerClientInfo6;
                            dtj = dtj2;
                            z15 = z5;
                        }
                        z = z15;
                        ContextManagerClientInfo contextManagerClientInfo7 = contextManagerClientInfo5;
                        for (dti dti2 : dtj.f13988b) {
                            String a13 = duu.m9451a(contextManagerClientInfo7, dti2.f13984a);
                            duu b5 = E.f13991b.mo9575b(a13);
                            if (b5 == null) {
                                new Object[1][0] = a13;
                                z3 = false;
                            } else {
                                Set a14 = b5.mo9678a();
                                if (a14 != null && !a14.isEmpty()) {
                                    E.f13991b.mo9574a(a14);
                                    dwq.m9674r().mo9733b(a14);
                                    z3 = true;
                                } else {
                                    new Object[1][0] = a13;
                                    z3 = false;
                                }
                            }
                            z16 |= z3;
                        }
                        if (z16) {
                            z2 = true;
                            if (z || z2) {
                                E.f13991b.mo9579c();
                            }
                            E.f13992c.mo9516a(dqy.m9123a("Fence scheduler operation."));
                        }
                    } else {
                        z = z15;
                    }
                    z2 = false;
                    if (z || z2) {
                    }
                    E.f13992c.mo9516a(dqy.m9123a("Fence scheduler operation."));
                }
                mo9531a(0);
                return;
            }
        }
        bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
        bnsl4.mo68432a("dsp", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("[UpdateFenceRegistrationOperation] Invalid fence type provided");
        mo9531a(7514);
    }
}
