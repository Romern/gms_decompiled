package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: adrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adrf {

    /* renamed from: d */
    private static final Long f62543d = Long.valueOf(ceqm.f183265a.mo6606a().mo79595H());

    /* renamed from: a */
    protected final brhj f62544a;

    /* renamed from: b */
    protected final Executor f62545b;

    /* renamed from: c */
    public final adsi f62546c;

    public adrf(brhj brhj, Executor executor, adsi adsi) {
        this.f62544a = brhj;
        this.f62545b = executor;
        this.f62546c = adsi;
    }

    /* renamed from: a */
    private final void m51047a(Map map, List list, adqt adqt) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Long l : map.keySet()) {
            adsg adsg = (adsg) map.get(l);
            brhy a = mo33735a(adsg);
            if (a != null) {
                arrayList.add(a);
                arrayList2.add(new adsh(adsg.f62616g, adsg.f62617h));
            }
        }
        if (!arrayList.isEmpty()) {
            aucb a2 = this.f62544a.mo32869a((brhy[]) arrayList.toArray(new brhy[0]));
            adqt.mo33732d(arrayList.size());
            bqgy c = bqgy.m112818c();
            a2.mo50380a(this.f62545b, new adra(this, adqt, arrayList2, c));
            a2.mo50379a(this.f62545b, new adrb(adqt, c));
            list.add(c);
        }
        map.clear();
    }

    /* renamed from: a */
    public abstract bqgg mo33734a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract brhy mo33735a(adsg adsg);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo33736b() {
        return true;
    }

    /* renamed from: a */
    public final bqgg mo33737a(adrr adrr, adqt adqt) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (adrr.mo33750a()) {
            adsg b = adrr.mo33751b();
            if (b != null && b.mo33756b().booleanValue() && b.mo33757c().booleanValue()) {
                hashMap.put(b.f62616g, b);
                i++;
                if (((long) hashMap.size()) >= f62543d.longValue() || !adrr.mo33750a() || i >= Integer.MAX_VALUE) {
                    m51047a(hashMap, arrayList, adqt);
                }
                if (i >= Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!hashMap.isEmpty()) {
            m51047a(hashMap, arrayList, adqt);
        }
        adrr.close();
        return bqdx.m112673a(bqga.m112774a((Iterable) arrayList), new adre(adqt), this.f62545b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo33738a(aucb aucb, Integer num) {
        bqgy c = bqgy.m112818c();
        aucb.mo50380a(this.f62545b, new adrc(this, c, num));
        aucb.mo50379a(this.f62545b, new adrd(c));
        return c;
    }
}
