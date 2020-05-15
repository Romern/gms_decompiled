package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: am */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0015am extends C0008af {

    /* renamed from: a */
    private final C1009g f897a = new C1009g();

    /* renamed from: b */
    private C0007ae f898b;

    /* renamed from: c */
    private final WeakReference f899c;

    /* renamed from: d */
    private int f900d = 0;

    /* renamed from: e */
    private boolean f901e = false;

    /* renamed from: f */
    private boolean f902f = false;

    /* renamed from: g */
    private final ArrayList f903g = new ArrayList();

    public C0015am(C0013ak akVar) {
        this.f899c = new WeakReference(akVar);
        this.f898b = C0007ae.INITIALIZED;
    }

    /* renamed from: a */
    static C0007ae m1063a(C0007ae aeVar, C0007ae aeVar2) {
        return (aeVar2 == null || aeVar2.compareTo(aeVar) >= 0) ? aeVar : aeVar2;
    }

    /* renamed from: b */
    static C0007ae m1064b(C0005ad adVar) {
        C0007ae aeVar = C0007ae.DESTROYED;
        C0005ad adVar2 = C0005ad.ON_CREATE;
        int ordinal = adVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return C0007ae.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return C0007ae.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + adVar);
                    }
                }
            }
            return C0007ae.STARTED;
        }
        return C0007ae.CREATED;
    }

    /* renamed from: c */
    private static C0005ad m1067c(C0007ae aeVar) {
        C0007ae aeVar2 = C0007ae.DESTROYED;
        C0005ad adVar = C0005ad.ON_CREATE;
        int ordinal = aeVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return C0005ad.ON_CREATE;
        }
        if (ordinal == 2) {
            return C0005ad.ON_START;
        }
        if (ordinal == 3) {
            return C0005ad.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + aeVar);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final C0007ae mo556a() {
        return this.f898b;
    }

    /* renamed from: b */
    private final void m1065b() {
        ArrayList arrayList = this.f903g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: a */
    public final void mo1023a(C0005ad adVar) {
        mo1024a(m1064b(adVar));
    }

    /* renamed from: b */
    private final void m1066b(C0007ae aeVar) {
        this.f903g.add(aeVar);
    }

    /* renamed from: c */
    private final C0007ae m1068c(C0012aj ajVar) {
        C1097j jVar;
        C0007ae aeVar;
        C1009g gVar = this.f897a;
        C0007ae aeVar2 = null;
        if (gVar.mo11577c(ajVar)) {
            jVar = ((C1097j) gVar.f17755a.get(ajVar)).f22017d;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            aeVar = ((C0014al) jVar.f22015b).f810a;
        } else {
            aeVar = null;
        }
        if (!this.f903g.isEmpty()) {
            ArrayList arrayList = this.f903g;
            aeVar2 = (C0007ae) arrayList.get(arrayList.size() - 1);
        }
        return m1063a(m1063a(this.f898b, aeVar), aeVar2);
    }

    /* renamed from: a */
    public final void mo1024a(C0007ae aeVar) {
        if (this.f898b != aeVar) {
            this.f898b = aeVar;
            if (this.f901e || this.f900d != 0) {
                this.f902f = true;
                return;
            }
            this.f901e = true;
            m1069c();
            this.f901e = false;
        }
    }

    /* renamed from: a */
    public final void mo557a(C0012aj ajVar) {
        C0007ae aeVar;
        Object obj;
        C0013ak akVar;
        boolean z;
        if (this.f898b != C0007ae.DESTROYED) {
            aeVar = C0007ae.INITIALIZED;
        } else {
            aeVar = C0007ae.DESTROYED;
        }
        C0014al alVar = new C0014al(ajVar, aeVar);
        C1009g gVar = this.f897a;
        C1097j a = gVar.mo11575a(ajVar);
        if (a == null) {
            gVar.f17755a.put(ajVar, gVar.mo15483b(ajVar, alVar));
            obj = null;
        } else {
            obj = a.f22015b;
        }
        if (((C0014al) obj) == null && (akVar = (C0013ak) this.f899c.get()) != null) {
            if (this.f900d != 0 || this.f901e) {
                z = true;
            } else {
                z = false;
            }
            C0007ae c = m1068c(ajVar);
            this.f900d++;
            while (alVar.f810a.compareTo((Enum) c) < 0 && this.f897a.mo11577c(ajVar)) {
                m1066b(alVar.f810a);
                alVar.mo952a(akVar, m1067c(alVar.f810a));
                m1065b();
                c = m1068c(ajVar);
            }
            if (!z) {
                m1069c();
            }
            this.f900d--;
        }
    }

    /* renamed from: b */
    public final void mo558b(C0012aj ajVar) {
        this.f897a.mo11576b(ajVar);
    }

    /* renamed from: c */
    private final void m1069c() {
        C0007ae aeVar;
        C0007ae aeVar2;
        C0005ad adVar;
        C0013ak akVar = (C0013ak) this.f899c.get();
        if (akVar != null) {
            while (true) {
                C1009g gVar = this.f897a;
                if (gVar.f26714e == 0 || ((aeVar = ((C0014al) gVar.f26711b.f22015b).f810a) == (aeVar2 = ((C0014al) gVar.f26712c.f22015b).f810a) && this.f898b == aeVar2)) {
                    this.f902f = false;
                } else {
                    this.f902f = false;
                    if (this.f898b.compareTo((Enum) aeVar) < 0) {
                        C1009g gVar2 = this.f897a;
                        C1067i iVar = new C1067i(gVar2.f26712c, gVar2.f26711b);
                        gVar2.f26713d.put(iVar, false);
                        while (iVar.hasNext() && !this.f902f) {
                            Map.Entry entry = (Map.Entry) iVar.next();
                            C0014al alVar = (C0014al) entry.getValue();
                            while (alVar.f810a.compareTo((Enum) this.f898b) > 0 && !this.f902f && this.f897a.mo11577c(entry.getKey())) {
                                C0007ae aeVar3 = alVar.f810a;
                                C0007ae aeVar4 = C0007ae.DESTROYED;
                                C0005ad adVar2 = C0005ad.ON_CREATE;
                                int ordinal = aeVar3.ordinal();
                                if (ordinal == 0) {
                                    throw new IllegalArgumentException();
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        adVar = C0005ad.ON_DESTROY;
                                    } else if (ordinal == 3) {
                                        adVar = C0005ad.ON_STOP;
                                    } else if (ordinal == 4) {
                                        adVar = C0005ad.ON_PAUSE;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected state value " + aeVar3);
                                    }
                                    m1066b(m1064b(adVar));
                                    alVar.mo952a(akVar, adVar);
                                    m1065b();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    C1097j jVar = this.f897a.f26712c;
                    if (!this.f902f && jVar != null && this.f898b.compareTo((Enum) ((C0014al) jVar.f22015b).f810a) > 0) {
                        C1124k a = this.f897a.mo15482a();
                        while (a.hasNext() && !this.f902f) {
                            C1097j jVar2 = (C1097j) a.next();
                            C0014al alVar2 = (C0014al) jVar2.f22015b;
                            while (alVar2.f810a.compareTo((Enum) this.f898b) < 0 && !this.f902f && this.f897a.mo11577c(jVar2.f22014a)) {
                                m1066b(alVar2.f810a);
                                alVar2.mo952a(akVar, m1067c(alVar2.f810a));
                                m1065b();
                            }
                        }
                    }
                }
            }
            this.f902f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
}
