package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rea {

    /* renamed from: a */
    public final List f42779a = new ArrayList();

    /* renamed from: b */
    public final List f42780b = new ArrayList();

    /* renamed from: c */
    public final List f42781c = new ArrayList();

    /* renamed from: d */
    private long f42782d = 0;

    public rea(Context context) {
        if (cdej.f180585a.mo6606a().mo77357x()) {
            aoob a = aonx.m66186a(context);
            roz b = rpa.m34196b();
            b.f43472a = aooa.f78602a;
            b.f43473b = new Feature[]{aonv.f78596a};
            try {
                this.f42782d = ((Long) aucu.m76783a(a.mo24701a(b.mo24977a()), cddj.f180527a.mo6606a().mo77289c(), TimeUnit.MILLISECONDS)).longValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("BatchedLogRequestWrap", "Failed to get last time zwieback is reset.", e);
            }
        }
    }

    /* renamed from: a */
    public final rdg mo24538a(int i) {
        return (rdg) this.f42779a.get(i);
    }

    /* renamed from: b */
    public final int mo24541b() {
        return this.f42780b.size();
    }

    /* renamed from: c */
    public final long mo24542c() {
        if (!this.f42780b.isEmpty()) {
            return ((cagn) this.f42780b.get(0)).f174471c;
        }
        return 0;
    }

    /* renamed from: d */
    public final Set mo24543d() {
        HashSet hashSet = new HashSet();
        List list = this.f42780b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cagn cagn = (cagn) list.get(i);
            String str = cagn.f174474f;
            if (str.isEmpty()) {
                cagl a = cagl.m126606a(cagn.f174473e);
                if (a == null) {
                    a = cagl.UNKNOWN;
                }
                str = a.toString();
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    /* renamed from: f */
    public final void mo24545f() {
        String str;
        List list = this.f42780b;
        int size = list.size();
        String str2 = "";
        for (int i = 0; i < size; i++) {
            cagn cagn = (cagn) list.get(i);
            String valueOf = String.valueOf(str2);
            if (cagn.f174474f.isEmpty()) {
                cagl a = cagl.m126606a(cagn.f174473e);
                if (a == null) {
                    a = cagl.UNKNOWN;
                }
                str = Integer.toString(a.f174465yP);
            } else {
                str = cagn.f174474f;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            sb.append(",");
            str2 = sb.toString();
        }
        Object[] objArr = {Integer.valueOf(this.f42780b.size()), str2};
    }

    /* renamed from: a */
    public final void mo24539a(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f42780b) {
            for (cagn cagn : this.f42780b) {
                bxvd bxvd = (bxvd) cagn.mo74142c(5);
                bxvd.mo73625a((bxvk) cagn);
                bxvf bxvf = (bxvf) bxvd;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                cagn cagn2 = (cagn) bxvf.f164949b;
                cagn cagn3 = cagn.f174467q;
                int i = cagn2.f174469a | 2;
                cagn2.f174469a = i;
                cagn2.f174471c = j;
                cagn2.f174469a = i | 1;
                cagn2.f174470b = j2;
                arrayList.add((cagn) bxvf.mo74062i());
            }
            this.f42780b.clear();
            this.f42780b.addAll(arrayList);
        }
    }

    /* renamed from: e */
    public final byte[] mo24544e() {
        bxvd da = cafz.f173060e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cafz cafz = (cafz) da.f164949b;
        int i = cafz.f173062a | 1;
        cafz.f173062a = i;
        cafz.f173064c = true;
        long j = this.f42782d;
        if (j != 0) {
            cafz.f173062a = i | 4;
            cafz.f173065d = j;
        }
        List list = this.f42780b;
        if (!cafz.f173063b.mo73666a()) {
            cafz.f173063b = bxvk.m124021a(cafz.f173063b);
        }
        bxsy.m123078a(list, cafz.f173063b);
        return ((cafz) da.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    public final boolean mo24540a() {
        return this.f42780b.isEmpty();
    }
}
