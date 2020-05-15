package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: lnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lnt extends Fragment {

    /* renamed from: a */
    private static final srn f26468a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final lqe f26469b = new lqe();

    /* renamed from: c */
    private View f26470c;

    /* renamed from: a */
    private static String m19453a(List list) {
        return (String) list.stream().map(lnr.f26466a).map(lns.f26467a).collect(Collectors.joining(" "));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.autofill_recyclerview_activity, viewGroup, false);
        this.f26470c = inflate;
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f26470c.findViewById(16908301).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f26470c.findViewById(16908298);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.f26469b);
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        bmxv c = kwe.m18646a((Context) null).mo14892c(arguments.getInt("position"));
        bngs bngs = new bngs();
        if (c.mo66813a()) {
            kwq kwq = ((kwh) c.mo66814b()).f25263a;
            if (kwq == null) {
                kwq = kwq.f25305l;
            }
            kwp kwp = kwq.f25317k;
            if (kwp == null) {
                kwp = kwp.f25301c;
            }
            kwr kwr = kwp.f25303a;
            if (kwr == null) {
                kwr = kwr.f25318d;
            }
            lqg f = lql.m19524f();
            int i = kwr.f25322c;
            StringBuilder sb = new StringBuilder(20);
            sb.append("Form ID: ");
            sb.append(i);
            f.mo15376b(sb.toString());
            String valueOf = String.valueOf(kwr.f25321b);
            f.mo15374a(valueOf.length() == 0 ? new String("Form Domain: ") : "Form Domain: ".concat(valueOf));
            bngs.mo67668c(f.mo15372a());
            bxwc bxwc = kwr.f25320a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                kwj kwj = (kwj) bxwc.get(i2);
                String a = m19453a(kwj.f25270a);
                lqg f2 = lql.m19524f();
                int i3 = kwj.f25273d;
                StringBuilder sb2 = new StringBuilder(21);
                sb2.append("Field ID: ");
                sb2.append(i3);
                f2.mo15376b(sb2.toString());
                lbc a2 = lbc.m18872a(kwj.f25274e);
                if (a2 == null) {
                    a2 = lbc.UNRECOGNIZED;
                }
                String name = a2.name();
                int i4 = kwj.f25272c;
                int i5 = kwj.f25271b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 102 + String.valueOf(name).length());
                sb3.append("Field Data Type: ");
                sb3.append(a);
                sb3.append("\nDetection Method: ");
                sb3.append(name);
                sb3.append("\nField Hash Algorithm Version: ");
                sb3.append(i4);
                sb3.append("\nField hash: ");
                sb3.append(i5);
                f2.mo15374a(sb3.toString());
                bngs.mo67668c(f2.mo15372a());
            }
            lqg f3 = lql.m19524f();
            f3.mo15376b("-----------------------------------------------");
            bngs.mo67668c(f3.mo15372a());
            try {
                kwq kwq2 = ((kwh) c.mo66814b()).f25263a;
                if (kwq2 == null) {
                    kwq2 = kwq.f25305l;
                }
                kwp kwp2 = kwq2.f25317k;
                if (kwp2 == null) {
                    kwp2 = kwp.f25301c;
                }
                for (bxte bxte : kwp2.f25304b) {
                    if (bxte.f164765a.equals("PREDICTION_PROCESSOR_TRACE")) {
                        kwn kwn = (kwn) GeneratedMessageLite.m124007a(kwn.f25290e, bxte.f164766b);
                        lqg f4 = lql.m19524f();
                        f4.mo15376b("Prediction Processor Trace");
                        lbc a3 = lbc.m18872a(kwn.f25292a);
                        if (a3 == null) {
                            a3 = lbc.UNRECOGNIZED;
                        }
                        String name2 = a3.name();
                        boolean z = kwn.f25293b;
                        boolean z2 = kwn.f25294c;
                        boolean z3 = kwn.f25295d;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(name2).length() + 121);
                        sb4.append("Detection Method: ");
                        sb4.append(name2);
                        sb4.append("\nHas Input Fingerprints: ");
                        sb4.append(z);
                        sb4.append("\nHas Prediction Data For App: ");
                        sb4.append(z2);
                        sb4.append("\nHas Prediction Data For Window: ");
                        sb4.append(z3);
                        f4.mo15374a(sb4.toString());
                        bngs.mo67668c(f4.mo15372a());
                    } else if (bxte.f164765a.equals("PROCESSOR_LABELED_FIELD_TRACE")) {
                        kwo kwo = (kwo) GeneratedMessageLite.m124007a(kwo.f25296d, bxte.f164766b);
                        lqg f5 = lql.m19524f();
                        f5.mo15376b("Processor Labeled Node Trace");
                        int i6 = kwo.f25299b;
                        lbc a4 = lbc.m18872a(kwo.f25298a);
                        if (a4 == null) {
                            a4 = lbc.UNRECOGNIZED;
                        }
                        String name3 = a4.name();
                        String a5 = m19453a(kwo.f25300c);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(name3).length() + 52 + String.valueOf(a5).length());
                        sb5.append("Node Id: ");
                        sb5.append(i6);
                        sb5.append("\nDetection Method: ");
                        sb5.append(name3);
                        sb5.append("\nData Types: ");
                        sb5.append(a5);
                        f5.mo15374a(sb5.toString());
                        bngs.mo67668c(f5.mo15372a());
                    } else if (bxte.f164765a.equals("POST_PROCESSOR_IGNORED_FIELD_TRACE_TYPE_URL")) {
                        kwl kwl = (kwl) GeneratedMessageLite.m124007a(kwl.f25280c, bxte.f164766b);
                        lqg f6 = lql.m19524f();
                        f6.mo15376b("Post Processor Ignored Field Trace");
                        int i7 = kwl.f25283b;
                        String str = kwl.f25282a;
                        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 42);
                        sb6.append("Node Id: ");
                        sb6.append(i7);
                        sb6.append("\nPost Processor Name: ");
                        sb6.append(str);
                        f6.mo15374a(sb6.toString());
                        bngs.mo67668c(f6.mo15372a());
                    } else if (bxte.f164765a.equals("POST_PROCESSOR_MODIFIED_TYPES_TRACES_TYPE_URL")) {
                        kwm kwm = (kwm) GeneratedMessageLite.m124007a(kwm.f25284e, bxte.f164766b);
                        lqg f7 = lql.m19524f();
                        f7.mo15376b("Post Processor Modified Types Trace");
                        int i8 = kwm.f25287b;
                        String str2 = kwm.f25286a;
                        String a6 = m19453a(kwm.f25288c);
                        String a7 = m19453a(kwm.f25289d);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(str2).length() + 71 + String.valueOf(a6).length() + String.valueOf(a7).length());
                        sb7.append("Node Id: ");
                        sb7.append(i8);
                        sb7.append("\nPost Processor Name: ");
                        sb7.append(str2);
                        sb7.append("\nOriginal Types: ");
                        sb7.append(a6);
                        sb7.append("\nNew Types: ");
                        sb7.append(a7);
                        f7.mo15374a(sb7.toString());
                        bngs.mo67668c(f7.mo15372a());
                    }
                }
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) f26468a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Invalid Protocol Buffer Exception, Detection Fragment.");
            }
        } else {
            ((bnsl) f26468a.mo68387b()).mo68405a("No instrumentation session.");
        }
        this.f26469b.mo15371a(bngs.mo67664a());
    }
}
