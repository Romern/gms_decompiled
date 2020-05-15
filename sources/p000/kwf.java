package p000;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;

/* renamed from: kwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwf {

    /* renamed from: a */
    public static final srn f25254a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final befa f25255b;

    /* renamed from: c */
    public final Uri f25256c;

    public kwf(Context context) {
        this.f25255b = new befa(Collections.singletonList(beff.m94940a(context).mo60653a()));
        befh a = befi.m94962a(context);
        a.mo60662b();
        a.mo60660a("autofill");
        a.mo60663b("instrumentation/instrumentation.pb");
        this.f25256c = a.mo60657a();
    }

    /* renamed from: a */
    public final bmxv mo14895a() {
        try {
            return bmxv.m108566b((kwi) GeneratedMessageLite.m124014a(kwi.f25265b, (byte[]) this.f25255b.mo60643a(this.f25256c, behp.m95056a(), new beer[0])));
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f25254a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kwf", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load and read file.");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final void mo14896a(kwi kwi) {
        try {
            this.f25255b.mo60643a(this.f25256c, behv.m95070a(kwi.serializeToBytes()), new beer[0]);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f25254a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kwf", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to load and write file.");
        }
    }
}
