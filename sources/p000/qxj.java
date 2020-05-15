package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: qxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxj implements qwq {

    /* renamed from: a */
    final byte[] f42365a;

    /* renamed from: b */
    final Integer f42366b;

    /* renamed from: c */
    final /* synthetic */ qxq f42367c;

    public qxj(qxq qxq, byte[] bArr, Integer num) {
        this.f42367c = qxq;
        this.f42365a = bArr;
        this.f42366b = num;
    }

    /* renamed from: a */
    public final byte[] mo14930a() {
        return mo24362b().serializeToBytes();
    }

    /* renamed from: b */
    public final cahe mo24362b() {
        ArrayList arrayList = new ArrayList(this.f42367c.f42389j.size());
        for (qxc qxc : this.f42367c.f42389j.values()) {
            if (qxc.f42357c.mo15643d(this.f42366b.intValue()) >= 0) {
                arrayList.add(qxc);
            }
        }
        bxvd da = cahe.f174537e.mo74144da();
        long j = this.f42367c.f42388i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cahe cahe = (cahe) da.f164949b;
        cahe.f174539a |= 1;
        cahe.f174540b = j;
        byte[] bArr = this.f42365a;
        if (bArr.length != 0) {
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cahe cahe2 = (cahe) da.f164949b;
            a.getClass();
            cahe2.f174539a |= 4;
            cahe2.f174542d = a;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qxc qxc2 = (qxc) arrayList.get(i);
            C1230nw nwVar = (C1230nw) qxc2.f42357c.mo15646f(this.f42366b.intValue());
            bxvd da2 = cahd.f174532d.mo74144da();
            long a2 = qxq.m33053a(qxc2.f42355a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cahd cahd = (cahd) da2.f164949b;
            cahd.f174534a = 1;
            cahd.f174535b = Long.valueOf(a2);
            nwVar.mo15537b();
            ArrayList arrayList2 = new ArrayList(nwVar.mo15537b());
            for (int i2 = 0; i2 < nwVar.mo15537b(); i2++) {
                bxvd da3 = cahc.f174527d.mo74144da();
                long a3 = nwVar.mo15533a(i2);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cahc cahc = (cahc) da3.f164949b;
                cahc.f174529a |= 1;
                cahc.f174530b = a3;
                long j2 = ((long[]) nwVar.mo15538b(i2))[0];
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cahc cahc2 = (cahc) da3.f164949b;
                cahc2.f174529a |= 2;
                cahc2.f174531c = j2;
                arrayList2.add((cahc) da3.mo74062i());
            }
            Collections.sort(arrayList2, qxi.f42364a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cahd cahd2 = (cahd) da2.f164949b;
            cahd2.mo74642c();
            bxsy.m123078a(arrayList2, cahd2.f174536c);
            cahd cahd3 = (cahd) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cahe cahe3 = (cahe) da.f164949b;
            cahd3.getClass();
            cahe3.mo74643c();
            cahe3.f174541c.add(cahd3);
        }
        return (cahe) da.mo74062i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qxj) {
            return mo24362b().equals(((qxj) obj).mo24362b());
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return mo24362b().toString();
    }
}
