package p000;

/* renamed from: bkoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkoy implements bkou {

    /* renamed from: a */
    final /* synthetic */ bkoz f125038a;

    public bkoy(bkoz bkoz) {
        this.f125038a = bkoz;
    }

    /* renamed from: a */
    public final void mo66151a() {
        bkoz bkoz = this.f125038a;
        bknc bknc = bkoz.f125041c;
        if (bknc != null) {
            int i = bkoz.f125039a;
            String sb = bkoz.f125040b.toString();
            if (i == 200) {
                try {
                    if (bknc.f124917a != null) {
                        try {
                            if (sb.startsWith(")]}'\n")) {
                                sb = sb.substring(5);
                            }
                            bknc.f124918b.mo28448a(bknc.f124917a.mo66345a(new bkxi(sb)));
                        } catch (bkqc e) {
                            bknc.f124918b.mo28447a(new bknn(500, e));
                        }
                    } else {
                        bknc.f124918b.mo28448a((Object) null);
                    }
                } catch (RuntimeException e2) {
                    bknc.f124918b.mo28447a(new bknn(0, e2));
                }
            } else if (i != 204) {
                bknc.f124918b.mo28447a(new bknn(i));
                bknc.f124919c.mo66135a(i);
            } else {
                bknc.f124918b.mo28448a((Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo66152a(bkos bkos) {
    }

    /* renamed from: a */
    public final void mo66153a(bkot bkot) {
        this.f125038a.f125039a = bkot.f125034b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.CharSequence, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    public final void mo66154a(CharSequence charSequence, int i, int i2) {
        synchronized (this.f125038a.f125040b) {
            this.f125038a.f125040b.append(charSequence, i, i2);
        }
    }
}
