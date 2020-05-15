package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: beqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqf {

    /* renamed from: a */
    public static final bnrt f112033a = bnrt.m110178a("beqf");

    /* renamed from: b */
    public final Context f112034b;

    /* renamed from: c */
    public final bqgj f112035c;

    /* renamed from: d */
    public final AtomicReference f112036d = new AtomicReference();

    /* renamed from: e */
    public boolean f112037e;

    public beqf(Context context, bqgj bqgj) {
        this.f112034b = context;
        this.f112035c = bqgj;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* renamed from: a */
    public final /* synthetic */ C1245ok mo60928a() {
        byfy byfy;
        InputStream inputStream;
        String str;
        C1245ok okVar;
        IOException e;
        InputStream inputStream2 = null;
        try {
            inputStream = this.f112034b.getResources().openRawResource(C0126R.raw.monogram_data_pb);
            try {
                byfy = (byfy) ((bxxk) byfy.f166081b.mo74142c(7)).mo73656a(inputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            try {
                bnrq bnrq = (bnrq) f112033a.mo68387b();
                bnrq.mo68437a(e);
                bnrq.mo68432a("beqf", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Error reading config, using defaults.");
                byfy = byfy.f166081b;
                boax.m111029a(inputStream);
                Map unmodifiableMap = Collections.unmodifiableMap(byfy.f166083a);
                C1245ok okVar2 = new C1245ok(unmodifiableMap.size());
                while (r0.hasNext()) {
                }
                return okVar2;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                boax.m111029a(inputStream2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            boax.m111029a(inputStream2);
            throw th;
        }
        boax.m111029a(inputStream);
        Map unmodifiableMap2 = Collections.unmodifiableMap(byfy.f166083a);
        C1245ok okVar22 = new C1245ok(unmodifiableMap2.size());
        for (Map.Entry entry : unmodifiableMap2.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!((String) entry.getValue()).isEmpty()) {
                str = (String) entry.getValue();
            } else {
                str = str2;
            }
            char[] charArray = str2.toCharArray();
            beqe beqe = null;
            for (char c : charArray) {
                if (beqe != null) {
                    if (beqe.f112032b == null) {
                        beqe.f112032b = new C1245ok();
                    }
                    okVar = beqe.f112032b;
                } else {
                    okVar = okVar22;
                }
                Character valueOf = Character.valueOf(c);
                beqe beqe2 = (beqe) okVar.get(valueOf);
                if (beqe2 == null) {
                    beqe2 = new beqe();
                    okVar.put(valueOf, beqe2);
                }
                beqe = beqe2;
            }
            beqe.f112031a = str;
        }
        return okVar22;
    }
}
