package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ijf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ijf {

    /* renamed from: a */
    rjx f21095a;

    /* renamed from: b */
    private final rkb f21096b;

    public ijf(Context context) {
        rjy rjy = new rjy(context);
        rjy.mo24779a(aula.f92018a);
        this.f21096b = rjy.mo24784b();
    }

    /* renamed from: a */
    public final ije mo13060a() {
        Context context = ((rmx) this.f21096b).f43323c;
        if (!cceo.m129401b()) {
            rjo rjo = aula.f92018a;
            if (!aurc.m77676a(((rmx) this.f21096b).f43323c)) {
                return new ije(false, false);
            }
            this.f21096b.mo24801e();
            try {
                return new ije(true, ((aups) aurc.m77675a(this.f21096b).mo9455a()).f92289b);
            } finally {
                this.f21096b.mo24803g();
            }
        } else {
            if (this.f21095a == null) {
                this.f21095a = aula.m77249a(context);
            }
            if (!rjx.m33698c(context)) {
                return new ije(false, false);
            }
            try {
                return new ije(true, ((aups) aucu.m76783a(this.f21095a.mo24669A(), 5, TimeUnit.SECONDS)).f92289b);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return new ije(true, false);
            }
        }
    }
}
