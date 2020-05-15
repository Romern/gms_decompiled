package p000;

import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: zmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmi extends rzu {

    /* renamed from: a */
    public static final srn f55459a = zvt.m46581a();

    /* renamed from: j */
    private static final bnic f55460j = bnic.m109490a("android.permission-group.SENSORS", "android.permission-group.LOCATION");

    /* renamed from: b */
    public final zmb f55461b;

    /* renamed from: h */
    public final yzs f55462h;

    /* renamed from: i */
    public final Executor f55463i;

    public zmi(zmb zmb, yzs yzs, Executor executor) {
        super(zmb, zmb.mo19167a(), new int[0]);
        this.f55461b = zmb;
        this.f55462h = yzs;
        this.f55463i = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return f55460j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        int callingUid = Binder.getCallingUid();
        int callingPid = Binder.getCallingPid();
        zmb zmb = this.f55461b;
        zmb.f55436d.post(new zmf(this, getServiceRequest, str, callingUid, callingPid, sbj));
    }

    /* renamed from: a */
    public final boolean mo31257a(zuu zuu, String str, long j) {
        SharedPreferences sharedPreferences = this.f43904d.getSharedPreferences("fitness_account_service_manager", 0);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(".lastChecked");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 10);
        sb3.append(str);
        sb3.append(".supported");
        String sb4 = sb3.toString();
        long a = this.f55462h.mo30869a().mo20505a();
        boolean a2 = zuu.mo30708a(TimeUnit.SECONDS.toMillis(j));
        sharedPreferences.edit().putLong(sb2, a).putBoolean(sb4, a2).apply();
        return a2;
    }
}
