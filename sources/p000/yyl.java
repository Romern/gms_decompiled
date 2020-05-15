package p000;

/* renamed from: yyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyl {
    /* renamed from: a */
    public static caah m45026a(cadq cadq) {
        boolean z;
        bmxy.m108589a(cadq.mo74619n(), "Only self-contained instances are supported");
        if ((cadq.mo74620o().f172325a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Data set missing data type");
        caah caah = cadq.mo74620o().f172330f;
        return caah == null ? caah.f172333d : caah;
    }

    /* renamed from: b */
    public static cado m45033b(caae caae) {
        cado cado = (cado) cadp.f172710f.mo74144da();
        if (cado.f164950c) {
            cado.mo74035c();
            cado.f164950c = false;
        }
        cadp cadp = (cadp) cado.f164949b;
        caae.getClass();
        cadp.f172713b = caae;
        cadp.f172712a |= 2;
        return cado;
    }

    /* renamed from: a */
    public static cado m45027a(cadp cadp, caae caae) {
        cado b = m45033b(caae);
        if ((cadp.f172712a & 4) != 0) {
            boolean z = cadp.f172716e;
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            cadp cadp2 = (cadp) b.f164949b;
            cadp cadp3 = cadp.f172710f;
            cadp2.f172712a |= 4;
            cadp2.f172716e = z;
        }
        return b;
    }

    /* renamed from: a */
    public static cadp m45028a(caae caae) {
        return (cadp) m45033b(caae).mo74062i();
    }

    /* renamed from: a */
    public static cadp m45029a(cadp cadp, bzzz bzzz) {
        caae caae = cadp.f172713b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        yyc c = yyd.m44993c(caae);
        c.mo30855a(bzzz);
        caae a = c.mo30854a();
        cado cado = (cado) cadp.f172710f.mo74144da();
        if (cado.f164950c) {
            cado.mo74035c();
            cado.f164950c = false;
        }
        cadp cadp2 = (cadp) cado.f164949b;
        a.getClass();
        cadp2.f172713b = a;
        cadp2.f172712a |= 2;
        bxwc bxwc = cadp.f172714c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            cadn cadn = (cadn) bxwc.get(i);
            bxvd bxvd = (bxvd) cadn.mo74142c(5);
            bxvd.mo73625a((bxvk) cadn);
            cadm cadm = (cadm) bxvd;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn2 = (cadn) cadm.f164949b;
            cadn cadn3 = cadn.f172699j;
            a.getClass();
            cadn2.f172705e = a;
            cadn2.f172701a |= 4;
            cado.mo74616a((cadn) cadm.mo74062i());
        }
        return (cadp) cado.mo74062i();
    }

    /* renamed from: a */
    public static String m45030a(cadp cadp) {
        Object[] objArr = new Object[2];
        caae caae = cadp.f172713b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        objArr[0] = yyd.m44990b(caae);
        objArr[1] = yyk.m45016a(cadp.f172714c);
        return String.format("DataSet{%s %s}", objArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: yyl.a(cadq, cadn):void
     arg types: [cado, cadn]
     candidates:
      yyl.a(cadp, caae):cado
      yyl.a(cadp, bzzz):cadp
      yyl.a(cado, cadn):void
      yyl.a(cadq, cadn):void */
    /* renamed from: a */
    public static void m45031a(cado cado, cadn cadn) {
        m45032a((cadq) cado, cadn);
        cado.mo74616a(cadn);
    }

    /* renamed from: a */
    public static void m45032a(cadq cadq, cadn cadn) {
        boolean z;
        caae caae = cadn.f172705e;
        if (caae == null) {
            caae = caae.f172323i;
        }
        String str = caae.f172326b;
        caae caae2 = ((cadp) ((cado) cadq).f164949b).f172713b;
        if (caae2 == null) {
            caae2 = caae.f172323i;
        }
        boolean equals = str.equals(caae2.f172326b);
        String str2 = caae.f172326b;
        caae caae3 = cadn.f172705e;
        if (caae3 == null) {
            caae3 = caae.f172323i;
        }
        bmxy.m108597a(equals, "Conflicting data sources found %s vs %s", str2, caae3.f172326b);
        boolean z2 = true;
        if (bzzn.m126363a(yyk.m45008a(cadn), m45026a(cadq))) {
            if (cadn.f172702b != 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108596a(z, "Data point does not have the timestamp set: %s", cadn);
            if (cadn.f172703c > cadn.f172702b) {
                z2 = false;
            }
            bmxy.m108596a(z2, "Data point with start time greater than end time found: %s", cadn);
            return;
        }
        throw new IllegalArgumentException(String.format("Conflicting data types found %s vs %s", bzzn.m126362a(yyk.m45008a(cadn)), bzzn.m126362a(m45026a(cadq))));
    }
}
