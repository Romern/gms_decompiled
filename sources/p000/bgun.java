package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.ulr.ApiExperimentTokens;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: bgun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgun {

    /* renamed from: a */
    public final String f117584a;

    /* renamed from: b */
    private ApiExperimentTokens f117585b = null;

    /* renamed from: c */
    private long f117586c = 0;

    /* renamed from: d */
    private boolean f117587d = false;

    public bgun(String str) {
        this.f117584a = str;
    }

    /* renamed from: a */
    private static ArrayList m99998a(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(length);
        for (byte[] bArr2 : bArr) {
            if (!(bArr2 == null || bArr2.length == 0)) {
                arrayList.add(Base64.encodeToString(bArr2, 10));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final void m99999b() {
        this.f117586c = SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(chcs.f188354a.mo6606a().mo85090az());
    }

    /* renamed from: a */
    public final synchronized void mo63217a() {
        if (!this.f117587d) {
            this.f117586c = 0;
            this.f117587d = true;
            return;
        }
        this.f117587d = false;
    }

    /* renamed from: a */
    public final synchronized ApiExperimentTokens mo63216a(Context context) {
        if (SystemClock.elapsedRealtime() > this.f117586c) {
            String str = this.f117584a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f117586c;
            StringBuilder sb = new StringBuilder(str.length() + 48);
            sb.append("get(");
            sb.append(str);
            sb.append("): ");
            sb.append(elapsedRealtime);
            sb.append(">");
            sb.append(j);
            sb.toString();
            mo63219b(context);
        }
        return this.f117585b;
    }

    /* renamed from: b */
    public final synchronized void mo63219b(Context context) {
        m99999b();
        new bgum(this, context).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo63218a(ExperimentTokens experimentTokens) {
        String str;
        ApiExperimentTokens apiExperimentTokens = null;
        if (experimentTokens != null) {
            try {
                ArrayList a = m99998a(experimentTokens.f82095i);
                ArrayList a2 = m99998a(experimentTokens.f82092f);
                byte[] bArr = experimentTokens.f82089c;
                if (bArr == null || bArr.length == 0) {
                    str = null;
                } else {
                    str = Base64.encodeToString(bArr, 10);
                }
                apiExperimentTokens = new ApiExperimentTokens(a, a2, str, m99998a(experimentTokens.f82090d), m99998a(experimentTokens.f82093g), m99998a(experimentTokens.f82091e));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f117585b = apiExperimentTokens;
        m99999b();
        this.f117587d = false;
        String str2 = this.f117584a;
        String valueOf = String.valueOf(this.f117585b);
        StringBuilder sb = new StringBuilder(str2.length() + 23 + String.valueOf(valueOf).length());
        sb.append("ApiExperimentTokens(");
        sb.append(str2);
        sb.append("): ");
        sb.append(valueOf);
        sb.toString();
    }
}
