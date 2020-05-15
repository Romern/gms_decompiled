package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* renamed from: vin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum vin implements vpj {
    MUTATION(r1),
    SENT(r1);
    

    /* renamed from: c */
    private final unp f49343c;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("mutation", 2);
        unu.mo27741b();
        b.mo27747a(1, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("sent", 1);
        unu2.mo27741b();
        unu2.mo27738a((Object) 0);
        b2.mo27747a(1, unu2);
        b2.mo27748b(5);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uoa.a(int, unt):unp
     arg types: [int, vio]
     candidates:
      uoa.a(int, java.lang.Object):void
      uoa.a(int, unu):void
      uoa.a(int, unt):unp */
    private vin(uoa uoa) {
        this.f49343c = uoa.mo27745a(6, (unt) vio.f49344d);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f49343c;
    }
}
