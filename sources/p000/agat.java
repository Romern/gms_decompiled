package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: agat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agat {

    /* renamed from: a */
    private final List f65095a = new LinkedList();

    /* renamed from: b */
    private final List f65096b = new LinkedList();

    /* renamed from: c */
    private agbd f65097c;

    /* renamed from: d */
    private agbu f65098d;

    /* renamed from: e */
    private agal f65099e;

    /* renamed from: f */
    private agal f65100f;

    /* renamed from: g */
    private long f65101g;

    public agat(long j) {
        this.f65101g = j;
    }

    /* renamed from: a */
    public final synchronized List mo35156a() {
        return new LinkedList(this.f65096b);
    }

    /* renamed from: b */
    public final synchronized List mo35162b() {
        LinkedList linkedList;
        String str;
        linkedList = null;
        for (agar agar : this.f65096b) {
            if (agar.mo35154a()) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (agar.mo35154a()) {
                    str = agar.f65092c[0];
                } else {
                    str = null;
                }
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public final synchronized agbd mo35164c() {
        return this.f65097c;
    }

    /* renamed from: d */
    public final synchronized agbu mo35165d() {
        return this.f65098d;
    }

    /* renamed from: e */
    public final synchronized agal mo35166e() {
        return this.f65099e;
    }

    /* renamed from: f */
    public final synchronized boolean mo35167f() {
        return this.f65099e != null;
    }

    /* renamed from: g */
    public final synchronized agal mo35168g() {
        return this.f65100f;
    }

    /* renamed from: h */
    public final synchronized boolean mo35169h() {
        return this.f65100f != null;
    }

    /* renamed from: i */
    public final synchronized boolean mo35170i() {
        boolean z;
        z = true;
        if (this.f65096b.isEmpty() || this.f65097c == null || this.f65098d == null || (this.f65099e == null && this.f65100f == null)) {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return null;
     */
    /* renamed from: j */
    public final synchronized String mo35171j() {
        String[] strArr;
        if (!this.f65096b.isEmpty() && (strArr = ((agar) this.f65096b.get(0)).f65091a) != null && strArr.length > 0) {
            return strArr[0];
        }
    }

    /* renamed from: k */
    public final synchronized boolean mo35172k() {
        boolean z;
        if (mo35171j() != null) {
            Iterator it = this.f65095a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                agas agas = (agas) it.next();
                if (agas instanceof agar) {
                    if (((agar) agas).mo35154a()) {
                        continue;
                    }
                }
                if (agas.f65094e == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo35157a(agal agal) {
        agal agal2 = this.f65099e;
        if (agal2 != null) {
            this.f65095a.remove(agal2);
        }
        if (!(agal == null || agal.f65078b == null)) {
            this.f65099e = agal;
            this.f65095a.add(agal);
        }
    }

    /* renamed from: a */
    public final synchronized void mo35158a(agbd agbd) {
        agbd agbd2 = this.f65097c;
        if (agbd2 != null) {
            this.f65095a.remove(agbd2);
        }
        this.f65097c = agbd;
        if (agbd != null) {
            this.f65095a.add(agbd);
        }
    }

    /* renamed from: b */
    public final synchronized void mo35163b(agal agal) {
        agal agal2 = this.f65100f;
        if (agal2 != null) {
            this.f65095a.remove(agal2);
        }
        if (!(agal == null || agal.f65077a == null)) {
            this.f65100f = agal;
            this.f65095a.add(agal);
        }
    }

    /* renamed from: a */
    public final synchronized void mo35159a(agbu agbu) {
        agbu agbu2 = this.f65098d;
        if (agbu2 != null) {
            this.f65095a.remove(agbu2);
        }
        this.f65098d = agbu;
        if (agbu != null) {
            this.f65095a.add(agbu);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo35160a(agar agar) {
        boolean z;
        if (!this.f65096b.contains(agar)) {
            this.f65096b.add(agar);
            this.f65095a.add(agar);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        return r3;
     */
    /* renamed from: a */
    public final synchronized boolean mo35161a(agat agat) {
        this.f65101g = agat.f65101g;
        boolean z = false;
        boolean z2 = false;
        for (agar agar : agat.mo35156a()) {
            if (mo35160a(agar)) {
                z2 = true;
            }
        }
        agbd c = agat.mo35164c();
        if (c != null) {
            mo35158a(c);
            z2 = true;
        }
        agbu d = agat.mo35165d();
        if (d != null) {
            mo35159a(d);
            z2 = true;
        }
        agal e = agat.mo35166e();
        if (e != null) {
            if (e.f65078b != null) {
                mo35157a(e);
                z2 = true;
            }
        }
        agal g = agat.mo35168g();
        if (!(g == null || g.f65077a == null)) {
            mo35163b(g);
            z2 = true;
        }
        agbd agbd = this.f65097c;
        if (agbd != null) {
            agal agal = this.f65099e;
            if (agal != null && !Arrays.equals(agbd.f65115b, agal.f65092c)) {
                z = true;
            }
            agal agal2 = this.f65100f;
            if (agal2 == null || Arrays.equals(this.f65097c.f65115b, agal2.f65092c)) {
                if (!z) {
                }
            }
            mo35157a((agal) null);
            mo35163b(null);
            return true;
        }
    }
}
