package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: bgiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgiz {

    /* renamed from: a */
    public final bexr f116578a;

    /* renamed from: b */
    private final Context f116579b;

    /* renamed from: c */
    private final aki f116580c;

    /* renamed from: d */
    private final bgiy f116581d = new bgiy(this);

    public bgiz(bexr bexr, Context context) {
        this.f116578a = bexr;
        this.f116579b = context;
        this.f116580c = aki.m919a(context);
    }

    /* renamed from: b */
    private final PendingIntent m99043b() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f116579b, "com.google.android.location.internal.PendingIntentCallbackService"));
        intent.setPackage(this.f116579b.getPackageName());
        intent.setAction("com.google.android.location.internal.action.AR_TRANSITION_RESULT");
        return PendingIntent.getService(this.f116579b, 0, intent, 134217728);
    }

    /* renamed from: a */
    public final void mo62875a() {
        bxbi bxbi = new bxbi(this.f116579b.getPackageName());
        PendingIntent b = m99043b();
        bxbi.mo73555b(b);
        if (bxbi.mo73549a(this.f116579b) == null) {
            b.cancel();
        }
    }

    /* renamed from: a */
    public final void mo62876a(long j) {
        aefy aefy = new aefy();
        aefy.mo34115a(j);
        aefy.f63346c = true;
        aefy.f63348e = "ActivityTransitionApi:AR";
        ActivityRecognitionRequest a = aefy.mo34113a();
        bxbi bxbi = new bxbi(this.f116579b.getPackageName());
        bxbi.mo73554a(true);
        bxbi.mo73553a(a, m99043b());
        if (bxbi.mo73549a(this.f116579b) != null) {
            StringBuilder sb = new StringBuilder(76);
            sb.append("Enable RealActivityRecognitionServiceClient at interval ");
            sb.append(j);
            sb.toString();
            String a2 = bvpm.m121348a("com.google.android.location.internal.action.AR_TRANSITION_RESULT");
            if (a2 != null) {
                this.f116580c.mo873a(this.f116581d, new IntentFilter(a2));
            }
        }
    }
}
