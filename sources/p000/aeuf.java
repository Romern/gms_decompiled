package p000;

import android.content.Context;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aeuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeuf extends aeub {

    /* renamed from: a */
    private static final String[] f63821a = cfaz.m138554c().split(",");

    /* renamed from: d */
    private static final long f63822d;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        String[] strArr = f63821a;
        f63822d = timeUnit.toMillis(Long.parseLong(strArr[strArr.length - 1]));
    }

    public aeuf(String str, Context context) {
        super(str, context);
    }

    /* renamed from: a */
    public static ArrayList m52559a(String str, Context context, List list, SharingCondition sharingCondition, int i, boolean z) {
        String str2 = str;
        Context context2 = context;
        int i2 = i;
        boolean z2 = z;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = list.size();
        boolean z3 = false;
        int i3 = 0;
        while (i3 < size) {
            ShareTarget shareTarget = (ShareTarget) list.get(i3);
            String c = shareTarget.mo43774c();
            bxvd da = bzlz.f170594d.mo74144da();
            bzly a = aexx.m52667a(shareTarget);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z3;
            }
            bzlz bzlz = (bzlz) da.f164949b;
            a.getClass();
            bzlz.f170597b = a;
            int i4 = bzlz.f170596a | 1;
            bzlz.f170596a = i4;
            if (c != null) {
                c.getClass();
                bzlz.f170596a = i4 | 2;
                bzlz.f170598c = c;
            }
            if (sharingCondition.mo43781c() != 1 || shareTarget.mo43775d()) {
                arrayList2.add((bzlz) da.mo74062i());
            } else {
                arrayList3.add((bzlz) da.mo74062i());
            }
            i3++;
            z3 = false;
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(new aeuf(str2, context2).m52560a(arrayList2, sharingCondition, z2, i2));
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(new aeuf(str2, context2).m52560a(arrayList3, SharingCondition.m67019a(f63822d), z2, i2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final ArrayList m52560a(List list, SharingCondition sharingCondition, boolean z, int i) {
        bzni bzni;
        int a;
        bznd bznd = (bznd) bznf.f170700h.mo74144da();
        bzmf a2 = aexp.m52655a(this.f63812c, this.f63811b);
        if (bznd.f164950c) {
            bznd.mo74035c();
            bznd.f164950c = false;
        }
        bznf bznf = (bznf) bznd.f164949b;
        a2.getClass();
        bznf.f170707f = a2;
        int i2 = bznf.f170702a | 8;
        bznf.f170702a = i2;
        if (!z) {
            bznf.f170706e = 2;
            bznf.f170702a = i2 | 4;
        } else {
            bznf.f170706e = 4;
            bznf.f170702a = i2 | 4;
        }
        if (!bznf.f170704c.mo73666a()) {
            bznf.f170704c = bxvk.m124021a(bznf.f170704c);
        }
        bxsy.m123078a(list, bznf.f170704c);
        bznd.mo74550a(aexx.m52666a(sharingCondition));
        bxvd da = bzme.f170605c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzme bzme = (bzme) da.f164949b;
        bzme.f170608b = i - 1;
        bzme.f170607a |= 1;
        if (bznd.f164950c) {
            bznd.mo74035c();
            bznd.f164950c = false;
        }
        bznf bznf2 = (bznf) bznd.f164949b;
        bzme bzme2 = (bzme) da.mo74062i();
        bzme2.getClass();
        bznf2.f170708g = bzme2;
        bznf2.f170702a |= 16;
        try {
            bzni = (bzni) mo34565a((bznf) bznd.mo74062i(), bzni.f170710d, "updateshares");
        } catch (Exception e) {
            bqye.m113758a(e);
            bzni = null;
        }
        if (bzni == null || (a = bznh.m125955a(bzni.f170712a)) == 0 || a != 2) {
            return new ArrayList();
        }
        Context context = this.f63812c;
        String str = this.f63811b;
        bzmb bzmb = bzni.f170714c;
        if (bzmb == null) {
            bzmb = bzmb.f170600c;
        }
        aexp.m52656a(context, str, bzmb);
        if (bzni.f170713b.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = bzni.f170713b;
        int size = bxwc.size();
        for (int i3 = 0; i3 < size; i3++) {
            bzlx bzlx = (bzlx) bxwc.get(i3);
            Context context2 = this.f63812c;
            bxvd bxvd = (bxvd) bzlx.mo74142c(5);
            bxvd.mo73625a((bxvk) bzlx);
            LocationShare a3 = aexx.m52668a(context2, bxvd, null);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }
}
