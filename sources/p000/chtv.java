package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: chtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chtv {

    /* renamed from: a */
    public final chtu f189149a;

    /* renamed from: b */
    public final String f189150b;

    /* renamed from: c */
    public final String f189151c;

    /* renamed from: d */
    public final chtt f189152d;

    /* renamed from: e */
    public final chtt f189153e;

    /* renamed from: f */
    private final boolean f189154f;

    public chtv(chtu chtu, String str, chtt chtt, chtt chtt2, boolean z) {
        String str2;
        new AtomicReferenceArray(2);
        bmxy.m108582a(chtu, "type");
        this.f189149a = chtu;
        bmxy.m108582a(str, "fullMethodName");
        this.f189150b = str;
        bmxy.m108582a(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
        } else {
            str2 = null;
        }
        this.f189151c = str2;
        bmxy.m108582a(chtt, "requestMarshaller");
        this.f189152d = chtt;
        bmxy.m108582a(chtt2, "responseMarshaller");
        this.f189153e = chtt2;
        this.f189154f = z;
    }

    /* renamed from: a */
    public static chts m149565a() {
        chts chts = new chts();
        chts.f189138a = null;
        chts.f189139b = null;
        return chts;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxt.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      bmxt.a(java.lang.String, double):void
      bmxt.a(java.lang.String, int):void
      bmxt.a(java.lang.String, long):void
      bmxt.a(java.lang.String, java.lang.Object):void
      bmxt.a(java.lang.String, boolean):void */
    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("fullMethodName", this.f189150b);
        a.mo66885a("type", this.f189149a);
        a.mo66886a("idempotent", false);
        a.mo66886a("safe", false);
        a.mo66886a("sampledToLocalTracing", this.f189154f);
        a.mo66885a("requestMarshaller", this.f189152d);
        a.mo66885a("responseMarshaller", this.f189153e);
        a.mo66885a("schemaDescriptor", (Object) null);
        a.mo66880a();
        return a.toString();
    }

    @Deprecated
    /* renamed from: a */
    public static chtv m149566a(chtu chtu, String str, chtt chtt, chtt chtt2) {
        return new chtv(chtu, str, chtt, chtt2, false);
    }

    /* renamed from: a */
    public static String m149567a(String str, String str2) {
        bmxy.m108582a(str, "fullServiceName");
        bmxy.m108582a(str2, "methodName");
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
