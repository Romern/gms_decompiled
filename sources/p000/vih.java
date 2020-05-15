package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* renamed from: vih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum vih implements vpj {
    KEY(r1),
    VALUE(r1);
    

    /* renamed from: c */
    public final unp f49329c;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("key", 2);
        unu.mo27740a(new unp[0]);
        unu.mo27741b();
        b.mo27747a(1, unu);
        uoa b2 = uoa.m39042b();
        b2.mo27747a(1, new unu("value", 2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uoa.a(int, unt):unp
     arg types: [int, vii]
     candidates:
      uoa.a(int, java.lang.Object):void
      uoa.a(int, unu):void
      uoa.a(int, unt):unp */
    private vih(uoa uoa) {
        this.f49329c = uoa.mo27745a(6, (unt) vii.f49330d);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f49329c;
    }
}
