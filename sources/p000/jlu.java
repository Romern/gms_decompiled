package p000;

import android.os.Bundle;

/* renamed from: jlu */
final /* synthetic */ class jlu implements Runnable {

    /* renamed from: a */
    private final jma f22772a;

    /* renamed from: b */
    private final byte[] f22773b;

    /* renamed from: c */
    private final String f22774c;

    public jlu(jma jma, byte[] bArr, String str) {
        this.f22772a = jma;
        this.f22773b = bArr;
        this.f22774c = str;
    }

    public final void run() {
        jma jma = this.f22772a;
        byte[] bArr = this.f22773b;
        String str = this.f22774c;
        synchronized (jma.f22789c) {
            try {
                jnz a = jma.f22800n.mo13758a(bArr, str);
                rpr b = rpr.m34216b();
                String str2 = jma.f22793g;
                String str3 = jma.f22792f;
                String str4 = jma.f22791e;
                int i = jma.f22805s.get();
                Bundle a2 = jll.m16881a(b, str2);
                if (a2 != null) {
                    a2.putString("mt", "se");
                    a2.putString("fDi", str4);
                    a2.putString("sp", a.mo13925b());
                    a2.putString("ptn", jma.m16891a(str3));
                    a2.putString("sn", Integer.toString(i));
                    jll.m16884a(b, str3, str2, str4, a2);
                } else {
                    jll.m16885a(str2, "se");
                }
            } catch (jmm e) {
                jma.f22787a.mo25418e("Failed to encrypt message", new Object[0]);
                jma.mo13827g();
            }
            jma.f22805s.incrementAndGet();
        }
    }
}
