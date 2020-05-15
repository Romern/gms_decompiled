package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/* renamed from: almc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almc implements ComponentCallbacks2 {

    /* renamed from: b */
    private static almc f73674b;

    /* renamed from: a */
    allx f73675a;

    /* renamed from: c */
    private final Context f73676c;

    public almc(Context context) {
        this.f73676c = context;
    }

    /* renamed from: a */
    public static synchronized almc m61252a(Context context) {
        almc almc;
        synchronized (almc.class) {
            if (f73674b == null) {
                almc almc2 = new almc(context.getApplicationContext());
                f73674b = almc2;
                context.registerComponentCallbacks(almc2);
            }
            almc = f73674b;
        }
        return almc;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 5 || i == 10 || i == 15 || i == 60 || i == 80) {
            synchronized (this) {
                this.f73675a = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized allx mo40497a() {
        if (this.f73675a == null) {
            InputStream openRawResource = this.f73676c.getResources().openRawResource(C0126R.raw.third_party_account_categories);
            try {
                allx allx = (allx) GeneratedMessageLite.m124011a(allx.f73647d, openRawResource, bxus.m123744c());
                if (openRawResource != null) {
                    openRawResource.close();
                }
                this.f73675a = allx;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return this.f73675a;
        throw th;
    }

    /* renamed from: a */
    public final almg mo40498a(Set set) {
        try {
            allx b = cfum.m143091b();
            bxvd bxvd = (bxvd) b.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) b);
            bxvd.mo73625a((GeneratedMessageLite) mo40497a());
            bxvd a = allx.f73647d.mo74141a((allx) bxvd.mo74062i());
            for (int size = ((allx) a.f164949b).f73649a.size() - 1; size >= 0; size--) {
                almb a2 = almb.m61249a(((allw) ((allx) a.f164949b).f73649a.get(size)).f73645g);
                if (a2 == null) {
                    a2 = almb.UNKNOWN;
                }
                if (!set.contains(a2)) {
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    allx allx = (allx) a.f164949b;
                    if (!allx.f73649a.mo73666a()) {
                        allx.f73649a = GeneratedMessageLite.m124021a(allx.f73649a);
                    }
                    allx.f73649a.remove(size);
                }
            }
            return new almg((allx) a.mo74062i());
        } catch (IOException e) {
            Log.e("AccountTypeClassifierFactory", "Failed to load embedded categories config", e);
            return new almg(cfum.m143091b());
        }
    }
}
