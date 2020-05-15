package p000;

/* renamed from: bxyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyn {
    /* renamed from: a */
    static bxyo m124416a(Object obj) {
        return ((GeneratedMessageLite) obj).f164960ah;
    }

    /* renamed from: c */
    static final void m124422c(Object obj) {
        m124416a(obj).mo74285b();
    }

    /* renamed from: b */
    static final /* bridge */ /* synthetic */ Object m124421b(Object obj) {
        bxyo a = m124416a(obj);
        if (a != bxyo.f165102a) {
            return a;
        }
        bxyo a2 = bxyo.m124424a();
        m124419a(obj, a2);
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m124419a(Object obj, bxyo bxyo) {
        ((GeneratedMessageLite) obj).f164960ah = bxyo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxyn.a(java.lang.Object, bxxp):boolean
     arg types: [bxyo, bxxp]
     candidates:
      bxyn.a(java.lang.Object, bxyo):void
      bxyn.a(java.lang.Object, java.lang.Object):void
      bxyn.a(java.lang.Object, bxxp):boolean */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* renamed from: a */
    public final boolean mo74282a(Object obj, bxxp bxxp) {
        int b = bxxp.mo73689b();
        int b2 = bxzh.m124563b(b);
        int a = bxzh.m124561a(b);
        if (a == 0) {
            ((bxyo) obj).mo74283a(bxzh.m124562a(b2, 0), Long.valueOf(bxxp.mo73702g()));
            return true;
        } else if (a == 1) {
            ((bxyo) obj).mo74283a(bxzh.m124562a(b2, 1), Long.valueOf(bxxp.mo73706i()));
            return true;
        } else if (a == 2) {
            ((bxyo) obj).mo74283a(bxzh.m124562a(b2, 2), bxxp.mo73716n());
            return true;
        } else if (a == 3) {
            int a2 = bxzh.m124562a(b2, 4);
            bxyo a3 = bxyo.m124424a();
            while (bxxp.mo73681a() != Integer.MAX_VALUE && mo74282a((Object) a3, bxxp)) {
                while (bxxp.mo73681a() != Integer.MAX_VALUE) {
                    while (bxxp.mo73681a() != Integer.MAX_VALUE) {
                    }
                }
            }
            if (a2 == bxxp.mo73689b()) {
                a3.mo74285b();
                ((bxyo) obj).mo74283a(bxzh.m124562a(b2, 3), a3);
                return true;
            }
            throw bxwf.m124092e();
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                ((bxyo) obj).mo74283a(bxzh.m124562a(b2, 5), Integer.valueOf(bxxp.mo73708j()));
                return true;
            }
            throw bxwf.m124093f();
        }
    }
}
