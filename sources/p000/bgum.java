package p000;

import android.content.Context;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.concurrent.ExecutionException;

/* renamed from: bgum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgum extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f117582a;

    /* renamed from: b */
    final /* synthetic */ bgun f117583b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgum(bgun bgun, Context context) {
        super(10);
        this.f117583b = bgun;
        this.f117582a = context;
    }

    public final void run() {
        String str = this.f117583b.f117584a;
        if (str.length() == 0) {
            new String("Updating experiment tokens for ");
        } else {
            "Updating experiment tokens for ".concat(str);
        }
        try {
            this.f117583b.mo63218a((ExperimentTokens) aucu.m76782a(anef.m64089a(this.f117582a).mo41765o(this.f117583b.f117584a)));
        } catch (InterruptedException | ExecutionException e) {
            String str2 = this.f117583b.f117584a;
            bgur.m100025c("GCoreUlr", str2.length() == 0 ? new String("Failed to get experiment tokens for ") : "Failed to get experiment tokens for ".concat(str2));
            this.f117583b.mo63217a();
        }
    }
}
