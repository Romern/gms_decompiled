package p000;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bdvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvs {

    /* renamed from: a */
    private final ayte f106512a;

    /* renamed from: b */
    private final bmzi f106513b;

    /* renamed from: c */
    private final Map f106514c = new HashMap();

    /* renamed from: d */
    private final Map f106515d = new HashMap();

    /* renamed from: e */
    private final bdrl f106516e;

    /* renamed from: f */
    private final int f106517f;

    public bdvs(int i, ayte ayte, bdrl bdrl, bmzi bmzi) {
        this.f106517f = i;
        this.f106512a = ayte;
        this.f106516e = bdrl;
        this.f106513b = bmzi;
    }

    /* renamed from: a */
    public final bdro mo58398a(bdqu bdqu, Account account) {
        bdro bdro;
        bmxw a = bmxw.m108574a(bdqu, account);
        synchronized (this.f106514c) {
            bdro = (bdro) this.f106514c.get(a);
            if (bdro == null) {
                long longValue = ((Long) this.f106513b.mo6606a()).longValue();
                bdro bdro2 = new bdro(bdqu, this.f106517f, new bdrm(this.f106516e, account), batx.m87539a(this.f106512a, account.toString(), bqcn.m112585b(longValue)), false);
                this.f106514c.put(a, bdro2);
                bdro = bdro2;
            }
        }
        return bdro;
    }

    /* renamed from: a */
    public final bdro mo58399a(bdqu bdqu, Account account, boolean z) {
        bdro bdro;
        bmxw a = bmxw.m108574a(bdqu, account);
        synchronized (this.f106515d) {
            bdro = (bdro) this.f106515d.get(a);
            if (bdro == null) {
                bdro = bdro.m91337a(bdqu, this.f106517f, this.f106516e, account, batx.m87541b(this.f106512a, account.toString(), bqcn.m112585b(((Long) this.f106513b.mo6606a()).longValue())), z);
                this.f106515d.put(a, bdro);
            }
        }
        return bdro;
    }
}
