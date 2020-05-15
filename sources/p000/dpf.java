package p000;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: dpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dpf {

    /* renamed from: a */
    private final qws f13736a = new qws(dwq.m9662f(), "CONTEXT_MANAGER", null);

    /* renamed from: a */
    public static bxge m9010a(ContextDataFilterImpl contextDataFilterImpl) {
        if (contextDataFilterImpl != null) {
            return m9012a(contextDataFilterImpl.mo18054d());
        }
        return null;
    }

    /* renamed from: b */
    public static bxvd m9019b() {
        bxvd da = tjk.f46190i.mo74144da();
        bxvd da2 = bxhn.f163432e.mo74144da();
        int d = dwq.m9660d();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxhn bxhn = (bxhn) da2.f164949b;
        bxhn.f163434a |= 1;
        bxhn.f163435b = d;
        String b = cdhu.m133457b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxhn bxhn2 = (bxhn) da2.f164949b;
        b.getClass();
        bxhn2.f163434a |= 2;
        bxhn2.f163436c = b;
        int size = dwq.m9681y().f13685a.size();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxhn bxhn3 = (bxhn) da2.f164949b;
        bxhn3.f163434a |= 4;
        bxhn3.f163437d = size;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        tjk tjk = (tjk) da.f164949b;
        bxhn bxhn4 = (bxhn) da2.mo74062i();
        bxhn4.getClass();
        tjk.f46196e = bxhn4;
        tjk.f46192a |= 8;
        return da;
    }

    /* renamed from: a */
    public static bxge m9011a(WriteBatchImpl writeBatchImpl) {
        ArrayList arrayList = new ArrayList(writeBatchImpl.f30703a.size());
        ArrayList arrayList2 = writeBatchImpl.f30703a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((ContextData) arrayList2.get(i)).mo18018g()));
        }
        return m9012a(arrayList);
    }

    /* renamed from: a */
    private static bxge m9012a(Collection collection) {
        if (collection == null) {
            return null;
        }
        bxgd bxgd = (bxgd) bxge.f163238b.mo74144da();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bxgd.mo73574a(tiq.m37051b(((Integer) it.next()).intValue()));
        }
        return (bxge) bxgd.mo74062i();
    }

    /* renamed from: a */
    public static bxgf m9013a(ContextFenceStub contextFenceStub) {
        if (contextFenceStub == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet();
        contextFenceStub.mo18033b(hashSet);
        bxvd da = bxgf.f163241b.mo74144da();
        for (Integer num : hashSet) {
            bxcl a = bxcl.m122571a(num.intValue());
            if (a == null) {
                a = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxgf bxgf = (bxgf) da.f164949b;
            a.getClass();
            if (!bxgf.f163243a.mo73666a()) {
                bxgf.f163243a = GeneratedMessageLite.m124019a(bxgf.f163243a);
            }
            bxgf.f163243a.mo74153d(a.f162810z);
        }
        return (bxgf) da.mo74062i();
    }

    /* renamed from: a */
    public static bxgo m9014a(FenceQueryRequestImpl fenceQueryRequestImpl) {
        if (fenceQueryRequestImpl == null) {
            return null;
        }
        bxvd da = bxgo.f163275c.mo74144da();
        bxgn bxgn = (bxgn) bmxu.m108565a(bxgn.m122690a(fenceQueryRequestImpl.f30650a.f30651a), bxgn.UNKNOWN_QUERY_FENCE_OPERATION_TYPE);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgo bxgo = (bxgo) da.f164949b;
        bxgo.f163278b = bxgn.f163274d;
        bxgo.f163277a |= 1;
        return (bxgo) da.mo74062i();
    }

    /* renamed from: a */
    public static bxgv m9015a(UpdateFenceOperation updateFenceOperation) {
        bxgh bxgh = null;
        if (updateFenceOperation == null) {
            return null;
        }
        ContextFenceRegistrationStub contextFenceRegistrationStub = updateFenceOperation.f30663b;
        if (contextFenceRegistrationStub != null) {
            bxgf a = m9013a(contextFenceRegistrationStub.f30626b);
            bxvd da = bxgh.f163248e.mo74144da();
            String str = contextFenceRegistrationStub.f30625a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxgh bxgh2 = (bxgh) da.f164949b;
            str.getClass();
            int i = bxgh2.f163250a | 1;
            bxgh2.f163250a = i;
            bxgh2.f163251b = str;
            long j = contextFenceRegistrationStub.f30627c;
            int i2 = i | 4;
            bxgh2.f163250a = i2;
            bxgh2.f163253d = j;
            if (a != null) {
                a.getClass();
                bxgh2.f163252c = a;
                bxgh2.f163250a = i2 | 2;
            }
            bxgh = (bxgh) da.mo74062i();
        }
        bxvd da2 = bxgv.f163310f.mo74144da();
        bxgu bxgu = (bxgu) bmxu.m108565a(bxgu.m122699a(updateFenceOperation.f30662a), bxgu.UNKNOWN_FENCE_OPERATION_TYPE);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxgv bxgv = (bxgv) da2.f164949b;
        bxgv.f163313b = bxgu.f163309j;
        int i3 = bxgv.f163312a | 1;
        bxgv.f163312a = i3;
        long j2 = updateFenceOperation.f30668g;
        int i4 = i3 | 4;
        bxgv.f163312a = i4;
        bxgv.f163315d = j2;
        long j3 = updateFenceOperation.f30669h;
        int i5 = i4 | 8;
        bxgv.f163312a = i5;
        bxgv.f163316e = j3;
        if (bxgh != null) {
            bxgh.getClass();
            bxgv.f163314c = bxgh;
            bxgv.f163312a = i5 | 2;
        }
        return (bxgv) da2.mo74062i();
    }

    /* renamed from: a */
    private static bxhm m9016a(ContextManagerClientInfo contextManagerClientInfo) {
        if (contextManagerClientInfo == null) {
            return null;
        }
        bxvd da = bxhm.f163422i.mo74144da();
        String str = contextManagerClientInfo.f30678b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhm bxhm = (bxhm) da.f164949b;
        str.getClass();
        int i = bxhm.f163424a | 1;
        bxhm.f163424a = i;
        bxhm.f163425b = str;
        String str2 = contextManagerClientInfo.f30680d;
        str2.getClass();
        int i2 = 2;
        bxhm.f163424a = i | 2;
        bxhm.f163426c = str2;
        if (contextManagerClientInfo.mo18066a() != null) {
            if (contextManagerClientInfo.mo18066a().mo9338b()) {
                i2 = 3;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxhm bxhm2 = (bxhm) da.f164949b;
            bxhm2.f163427d = i2 - 1;
            bxhm2.f163424a |= 4;
        }
        int i3 = contextManagerClientInfo.f30681e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhm bxhm3 = (bxhm) da.f164949b;
        int i4 = bxhm3.f163424a | 8;
        bxhm3.f163424a = i4;
        bxhm3.f163428e = i3;
        int i5 = contextManagerClientInfo.f30682f;
        bxhm3.f163424a = i4 | 16;
        bxhm3.f163429f = i5;
        if (!TextUtils.isEmpty(contextManagerClientInfo.f30683g)) {
            String str3 = contextManagerClientInfo.f30683g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxhm bxhm4 = (bxhm) da.f164949b;
            str3.getClass();
            bxhm4.f163424a |= 32;
            bxhm4.f163430g = str3;
        }
        if (!TextUtils.isEmpty(contextManagerClientInfo.f30684h)) {
            String str4 = contextManagerClientInfo.f30684h;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxhm bxhm5 = (bxhm) da.f164949b;
            str4.getClass();
            bxhm5.f163424a |= 64;
            bxhm5.f163431h = str4;
        }
        return (bxhm) da.mo74062i();
    }

    /* renamed from: a */
    public static bxvd m9017a(int i, bxcl bxcl) {
        bxvd da = bxic.f163497g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxic bxic = (bxic) da.f164949b;
        bxic.f163500b = i - 1;
        int i2 = bxic.f163499a | 1;
        bxic.f163499a = i2;
        bxic.f163502d = bxcl.f162810z;
        bxic.f163499a = i2 | 4;
        long a = dwq.m9665i().mo20505a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxic bxic2 = (bxic) da.f164949b;
        bxic2.f163499a |= 2;
        bxic2.f163501c = a;
        return da;
    }

    /* renamed from: a */
    public static bxvd m9018a(ContextManagerClientInfo contextManagerClientInfo, int i, int i2) {
        bxvd da = bxgc.f163222o.mo74144da();
        if (m9016a(contextManagerClientInfo) != null) {
            bxhm a = m9016a(contextManagerClientInfo);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxgc bxgc = (bxgc) da.f164949b;
            a.getClass();
            bxgc.f163225b = a;
            bxgc.f163224a |= 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgc bxgc2 = (bxgc) da.f164949b;
        bxgc2.f163226c = i - 1;
        int i3 = bxgc2.f163224a | 2;
        bxgc2.f163224a = i3;
        bxgc2.f163224a = i3 | 4;
        bxgc2.f163227d = i2;
        return da;
    }

    /* renamed from: a */
    public final void mo9372a() {
        bxvd a = m9017a(2, bxcl.PLACE_FENCE);
        bxvd da = bxhy.f163486c.mo74144da();
        bxie b = dvc.m9496b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhy bxhy = (bxhy) da.f164949b;
        b.getClass();
        bxhy.f163489b = b;
        bxhy.f163488a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxic bxic = (bxic) a.f164949b;
        bxhy bxhy2 = (bxhy) da.mo74062i();
        bxic bxic2 = bxic.f163497g;
        bxhy2.getClass();
        bxic.f163503e = bxhy2;
        bxic.f163499a |= 8;
        mo9375a((bxic) a.mo74062i());
    }

    /* renamed from: a */
    public final void mo9373a(int i) {
        bxvd da = bxin.f163538c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxin bxin = (bxin) da.f164949b;
        bxin.f163541b = i - 1;
        bxin.f163540a |= 1;
        bxin bxin2 = (bxin) da.mo74062i();
        bxvd b = m9019b();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        tjk tjk = (tjk) b.f164949b;
        tjk tjk2 = tjk.f46190i;
        bxin2.getClass();
        tjk.f46198g = bxin2;
        tjk.f46192a |= 32;
        mo9376a((tjk) b.mo74062i(), 6);
    }

    /* renamed from: a */
    public final void mo9374a(bxgc bxgc) {
        if (bxgc != null) {
            bxvd b = m9019b();
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            tjk tjk = (tjk) b.f164949b;
            tjk tjk2 = tjk.f46190i;
            bxgc.getClass();
            tjk.f46195d = bxgc;
            tjk.f46192a |= 4;
            mo9376a((tjk) b.mo74062i(), 4);
        }
    }

    /* renamed from: a */
    public final void mo9375a(bxic bxic) {
        if (bxic != null) {
            bxvd b = m9019b();
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            tjk tjk = (tjk) b.f164949b;
            tjk tjk2 = tjk.f46190i;
            bxic.getClass();
            tjk.f46194c = bxic;
            tjk.f46192a |= 2;
            mo9376a((tjk) b.mo74062i(), 3);
        }
    }

    /* renamed from: a */
    public final void mo9376a(tjk tjk, int i) {
        int i2;
        if (tjk != null) {
            new Object[1][0] = tjk;
            qwo a = this.f13736a.mo24335a(tjk.serializeToBytes());
            if (!cdhu.f180921a.mo6606a().mo77626a()) {
                i2 = i - 1;
            } else {
                i2 = 7;
            }
            a.mo24328b(i2);
            a.mo24327b();
        }
    }
}
