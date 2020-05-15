package p000;

import com.felicanetworks.mfc.Block;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.Data;
import com.felicanetworks.mfc.Felica;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* renamed from: cijr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijr implements brgm {

    /* renamed from: a */
    final /* synthetic */ brep f190455a;

    public cijr(brep brep) {
        this.f190455a = brep;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        int i;
        Integer num = cijs.f190456a;
        srn srn = atgf.f90279a;
        cijy cijy = new cijy(felica);
        BlockList blockList = new BlockList();
        for (int i2 : cijy.f190486a) {
            blockList.add(0, new Block(13839, i2));
        }
        Data[] read = cijy.f190492b.read(blockList);
        ArrayList arrayList = new ArrayList();
        byte[] a = cijy.m150498a(read);
        int length = (a.length + 1) / 16;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 16;
            String valueOf = String.valueOf(cijy.m150496a(cijy.m150497a(a, i4 + 11, 2)));
            long longValue = Integer.decode(valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf)).longValue();
            String valueOf2 = String.valueOf(cijy.m150496a(cijy.m150497a(a, i4 + 13, 3)));
            BigDecimal bigDecimal = new BigDecimal(Integer.decode(valueOf2.length() == 0 ? new String("0x") : "0x".concat(valueOf2)).intValue());
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"));
            instance.clear();
            instance.set(Integer.parseInt(cijy.m150496a(cijy.m150497a(a, i4, 2))), Integer.parseInt(cijy.m150496a(cijy.m150497a(a, i4 + 2, 1))) - 1, Integer.parseInt(cijy.m150496a(cijy.m150497a(a, i4 + 3, 1))), 0, 0, 0);
            long timeInMillis = instance.getTimeInMillis();
            String substring = cijy.m150496a(cijy.m150497a(a, i4 + 4, 1)).substring(0, 1);
            if (cijy.f190488d.containsKey(substring)) {
                i = ((Integer) cijy.f190488d.get(substring)).intValue();
            } else {
                i = 0;
            }
            arrayList.add(new ciju(longValue, bigDecimal, cijy.f190487c, timeInMillis, i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo69521a(bret bret) {
        Integer num = cijs.f190456a;
        new Object[1][0] = bret.name();
        this.f190455a.mo49931a(new bres(bret));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        List<breq> list = (List) obj;
        Integer num = cijs.f190456a;
        for (breq breq : list) {
            String obj2 = breq != null ? breq.toString() : null;
            StringBuilder sb = new StringBuilder(String.valueOf(obj2).length() + 54);
            sb.append("readTransactionHistory onSuccess (transactionInfo = ");
            sb.append(obj2);
            sb.append(").");
            sb.toString();
        }
        this.f190455a.mo49932a(list);
    }
}
