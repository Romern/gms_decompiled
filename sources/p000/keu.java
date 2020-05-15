package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: keu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class keu {

    /* renamed from: a */
    public final beoa f23952a;

    /* renamed from: b */
    public final AtomicBoolean f23953b = new AtomicBoolean();

    /* renamed from: c */
    private final Executor f23954c;

    public keu(Context context, Executor executor, ayte ayte) {
        benx benx;
        benv benv = new benv();
        benv.f111905d = false;
        if (context != null) {
            benv.f111902a = context;
            benv.f111904c = ayte;
            benv.f111903b = "autofill_cached_data_source_data";
            String str = benv.f111902a == null ? " context" : "";
            str = benv.f111903b == null ? str.concat(" domain") : str;
            str = benv.f111904c == null ? String.valueOf(str).concat(" clock") : str;
            str = benv.f111905d == null ? String.valueOf(str).concat(" useLegacyDataStore") : str;
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            bent bent = new bent(benv.f111902a, benv.f111903b, benv.f111904c, benv.f111905d.booleanValue());
            Context context2 = bent.f111892a;
            String str2 = bent.f111893b;
            ayte ayte2 = bent.f111894c;
            if (bent.f111895d) {
                benx = new benz(context2, ayte2, str2);
            } else {
                benx = new beob(context2, ayte2, str2);
            }
            this.f23952a = new beoa(ayte2, benx);
            this.f23954c = executor;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public final void mo14434a() {
        this.f23954c.execute(new ket(this));
    }
}
