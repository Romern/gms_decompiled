package p000;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* renamed from: kwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwe {

    /* renamed from: g */
    private static kwe f25247g;

    /* renamed from: a */
    public final kwf f25248a;

    /* renamed from: b */
    public final Map f25249b = new HashMap();

    /* renamed from: c */
    public final bxvd f25250c = kwq.f25305l.mo74144da();

    /* renamed from: d */
    public final bxvd f25251d = kwi.f25265b.mo74144da();

    /* renamed from: e */
    public final bxvd f25252e = kwk.f25275d.mo74144da();

    /* renamed from: f */
    public final bxvd f25253f = kwp.f25301c.mo74144da();

    private kwe(Context context) {
        this.f25248a = new kwf(context);
    }

    /* renamed from: a */
    public static synchronized kwe m18646a(Context context) {
        kwe kwe;
        synchronized (kwe.class) {
            if (f25247g == null) {
                if (context != null) {
                    f25247g = new kwe(context);
                } else {
                    throw new RuntimeException("Invalid singleton creation");
                }
            }
            kwe = f25247g;
        }
        return kwe;
    }

    /* renamed from: b */
    public final void mo14890b(int i) {
        bxvd bxvd = this.f25250c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        ((kwq) bxvd.f164949b).f25312f = i;
    }

    /* renamed from: c */
    public final bmxv mo14892c(int i) {
        ArrayList a = mo14882a();
        return i < a.size() ? bmxv.m108566b((kwh) a.get(i)) : bmvz.f131120a;
    }

    /* renamed from: d */
    public final void mo14893d(int i) {
        bxvd bxvd = this.f25250c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        ((kwq) bxvd.f164949b).f25309c = i;
    }

    /* renamed from: e */
    public final void mo14894e(int i) {
        bxvd bxvd = this.f25252e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwk kwk = kwk.f25275d;
        ((kwk) bxvd.f164949b).f25277a = i;
    }

    /* renamed from: a */
    public final ArrayList mo14882a() {
        bmxv bmxv;
        kwf kwf = this.f25248a;
        try {
            bmxv = bmxv.m108566b((kwi) GeneratedMessageLite.m124014a(kwi.f25265b, (byte[]) kwf.f25255b.mo60643a(kwf.f25256c, behp.m95056a(), new beer[0])));
        } catch (IOException e) {
            bnsl bnsl = (bnsl) kwf.f25254a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kwf", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load and read file.");
            bmxv = bmvz.f131120a;
        }
        if (!bmxv.mo66813a()) {
            return new ArrayList();
        }
        return new ArrayList(((kwi) bmxv.mo66814b()).f25267a);
    }

    /* renamed from: b */
    public final void mo14891b(boolean z) {
        bxvd bxvd = this.f25250c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        ((kwq) bxvd.f164949b).f25311e = z;
    }

    /* renamed from: a */
    public final void mo14883a(int i) {
        bxvd bxvd = this.f25250c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        ((kwq) bxvd.f164949b).f25313g = i;
    }

    /* renamed from: a */
    public final void mo14884a(long j) {
        bxvd bxvd = this.f25250c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        ((kwq) bxvd.f164949b).f25310d = j;
    }

    /* renamed from: a */
    public final void mo14885a(String str) {
        bxvd bxvd = this.f25252e;
        bxvd da = kws.f25323b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((kws) da.f164949b).f25325a = str;
        kws kws = (kws) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwk kwk = kwk.f25275d;
        kws.getClass();
        ((kwk) bxvd.f164949b).f25279c = kws;
    }

    /* renamed from: a */
    public final void mo14886a(String str, int i) {
        bxvd bxvd = this.f25252e;
        bxvd da = kwg.f25257c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kwg kwg = (kwg) da.f164949b;
        str.getClass();
        kwg.f25259a = str;
        kwg.f25260b = i;
        kwg kwg2 = (kwg) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwk kwk = kwk.f25275d;
        kwg2.getClass();
        ((kwk) bxvd.f164949b).f25278b = kwg2;
    }

    /* renamed from: a */
    public final void mo14887a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kjt kjt = (kjt) list.get(i);
            if (kjt instanceof knl) {
                knl knl = (knl) kjt;
                bxvd bxvd = this.f25253f;
                bxvd da = bxte.f164763c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                "PREDICTION_PROCESSOR_TRACE".getClass();
                ((bxte) da.f164949b).f164765a = "PREDICTION_PROCESSOR_TRACE";
                bxvd da2 = kwn.f25290e.mo74144da();
                lbc a = knl.mo14701a();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((kwn) da2.f164949b).f25292a = a.mo3214a();
                boolean b = knl.mo14702b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((kwn) da2.f164949b).f25293b = b;
                boolean d = knl.mo14704d();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((kwn) da2.f164949b).f25295d = d;
                boolean c = knl.mo14703c();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((kwn) da2.f164949b).f25294c = c;
                ByteString aL = ((kwn) da2.mo74062i()).mo73639aL();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aL.getClass();
                ((bxte) da.f164949b).f164766b = aL;
                bxte bxte = (bxte) da.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                kwp kwp = (kwp) bxvd.f164949b;
                kwp kwp2 = kwp.f25301c;
                bxte.getClass();
                kwp.mo14898a();
                kwp.f25304b.add(bxte);
            } else if (kjt instanceof klv) {
                klv klv = (klv) kjt;
                ArrayList arrayList = new ArrayList();
                klv.mo14623c().stream().forEach(new kvz(arrayList));
                bxvd bxvd2 = this.f25253f;
                bxvd da3 = bxte.f164763c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                "PROCESSOR_LABELED_FIELD_TRACE".getClass();
                ((bxte) da3.f164949b).f164765a = "PROCESSOR_LABELED_FIELD_TRACE";
                bxvd da4 = kwo.f25296d.mo74144da();
                lbc a2 = klv.mo14621a();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((kwo) da4.f164949b).f25298a = a2.mo3214a();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                kwo kwo = (kwo) da4.f164949b;
                if (!kwo.f25300c.mo73666a()) {
                    kwo.f25300c = GeneratedMessageLite.m124019a(kwo.f25300c);
                }
                bxsy.m123078a(arrayList, kwo.f25300c);
                int intValue = ((Integer) this.f25249b.getOrDefault(klv.mo14622b().f24609h, -1)).intValue();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((kwo) da4.f164949b).f25299b = intValue;
                ByteString aL2 = ((kwo) da4.mo74062i()).mo73639aL();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                aL2.getClass();
                ((bxte) da3.f164949b).f164766b = aL2;
                bxvd2.mo74047e(da3);
                bxvd2.mo74062i();
            } else if (kjt instanceof klk) {
                klk klk = (klk) kjt;
                bxvd bxvd3 = this.f25253f;
                bxvd da5 = bxte.f164763c.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                "POST_PROCESSOR_IGNORED_FIELD_TRACE_TYPE_URL".getClass();
                ((bxte) da5.f164949b).f164765a = "POST_PROCESSOR_IGNORED_FIELD_TRACE_TYPE_URL";
                bxvd da6 = kwl.f25280c.mo74144da();
                String a3 = klk.mo14609a();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                a3.getClass();
                ((kwl) da6.f164949b).f25282a = a3;
                int intValue2 = ((Integer) this.f25249b.getOrDefault(klk.mo14610b().f24609h, -1)).intValue();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                ((kwl) da6.f164949b).f25283b = intValue2;
                ByteString aL3 = ((kwl) da6.mo74062i()).mo73639aL();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                aL3.getClass();
                ((bxte) da5.f164949b).f164766b = aL3;
                bxvd3.mo74047e(da5);
                bxvd3.mo74062i();
            } else if (kjt instanceof kll) {
                kll kll = (kll) kjt;
                List list2 = (List) kll.mo14616c().stream().map(kwa.f25242a).collect(Collectors.toList());
                List list3 = (List) kll.mo14617d().stream().map(kwb.f25243a).collect(Collectors.toList());
                bxvd bxvd4 = this.f25253f;
                bxvd da7 = bxte.f164763c.mo74144da();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                "POST_PROCESSOR_MODIFIED_TYPES_TRACES_TYPE_URL".getClass();
                ((bxte) da7.f164949b).f164765a = "POST_PROCESSOR_MODIFIED_TYPES_TRACES_TYPE_URL";
                bxvd da8 = kwm.f25284e.mo74144da();
                String a4 = kll.mo14614a();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                a4.getClass();
                ((kwm) da8.f164949b).f25286a = a4;
                int intValue3 = ((Integer) this.f25249b.getOrDefault(kll.mo14615b().f24609h, -1)).intValue();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                kwm kwm = (kwm) da8.f164949b;
                kwm.f25287b = intValue3;
                if (!kwm.f25288c.mo73666a()) {
                    kwm.f25288c = GeneratedMessageLite.m124019a(kwm.f25288c);
                }
                bxsy.m123078a(list2, kwm.f25288c);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                kwm kwm2 = (kwm) da8.f164949b;
                if (!kwm2.f25289d.mo73666a()) {
                    kwm2.f25289d = GeneratedMessageLite.m124019a(kwm2.f25289d);
                }
                bxsy.m123078a(list3, kwm2.f25289d);
                ByteString aL4 = ((kwm) da8.mo74062i()).mo73639aL();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                aL4.getClass();
                ((bxte) da7.f164949b).f164766b = aL4;
                bxvd4.mo74047e(da7);
                bxvd4.mo74062i();
            }
        }
    }

    /* renamed from: a */
    public final void mo14888a(kjp kjp) {
        bxvd da = kwr.f25318d.mo74144da();
        String str = kjp.f24264a.f23841b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kwr kwr = (kwr) da.f164949b;
        str.getClass();
        kwr.f25321b = str;
        kwr.f25322c = kjp.f24269f;
        kjp.f24265b.stream().forEach(new kwc(this, da));
        bxvd bxvd = this.f25253f;
        kwr kwr2 = (kwr) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwp kwp = kwp.f25301c;
        kwr2.getClass();
        ((kwp) bxvd.f164949b).f25303a = kwr2;
    }

    /* renamed from: a */
    public final void mo14889a(boolean z) {
        bxvd bxvd = this.f25250c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kwq kwq = kwq.f25305l;
        ((kwq) bxvd.f164949b).f25315i = z;
    }
}
