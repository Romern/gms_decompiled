package p000;

import android.database.DatabaseUtils;
import android.os.Bundle;
import java.util.TreeSet;

/* renamed from: hma */
final /* synthetic */ class hma implements bqeh {

    /* renamed from: a */
    private final hmc f20010a;

    /* renamed from: b */
    private final String f20011b;

    /* renamed from: c */
    private final qqa f20012c;

    public hma(hmc hmc, String str, qqa qqa) {
        this.f20010a = hmc;
        this.f20011b = str;
        this.f20012c = qqa;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hmc hmc = this.f20010a;
        String str = this.f20011b;
        qqa qqa = this.f20012c;
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add(str);
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            bxwc bxwc = ((byts) i.next()).f167715a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                treeSet.add(((bytw) bxwc.get(i2)).f167728b);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : treeSet) {
            if (sb.length() > 0) {
                sb.append(" OR ");
            }
            sb.append("idx_signon_realm = ");
            DatabaseUtils.appendEscapedSQLString(sb, str2);
        }
        Bundle bundle = new Bundle();
        bundle.putString("where_string", sb.toString());
        return qqk.m32658a(qqa, hmc.f20016b, new hlq(qqa, bundle));
    }
}
