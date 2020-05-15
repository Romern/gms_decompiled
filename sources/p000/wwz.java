package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: wwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwz extends aayk {

    /* renamed from: a */
    private final String f51523a;

    /* renamed from: l */
    private final byte[] f51524l;

    /* renamed from: m */
    private final boolean f51525m;

    public wwz(Context context, HelpConfig helpConfig, bqgj bqgj, String str, byte[] bArr, boolean z) {
        super(context, helpConfig, bqgj);
        this.f51523a = str;
        this.f51524l = bArr;
        this.f51525m = z;
    }

    /* renamed from: a */
    public static wwz m42431a(Context context, HelpConfig helpConfig, bqgj bqgj, String str, byte[] bArr, boolean z) {
        return new wwz(context, helpConfig, bqgj, str, bArr, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return this.f51523a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo29521c() {
        return this.f51525m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo29522d() {
        return this.f51524l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo29523e() {
        return (int) cdtr.f181715a.mo6606a().mo78294A();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3073);
    }

    /* renamed from: a */
    public static boolean m42432a(wwz wwz) {
        try {
            aays k = wwz.mo31910k();
            if (!k.mo31912a()) {
                int i = k.f56842a;
                StringBuilder sb = new StringBuilder(70);
                sb.append("Got non-success HTTP status code from submitting feedback: ");
                sb.append(i);
                Log.e("gF_feedbackSubmissionR", sb.toString());
            }
            return k.mo31912a();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gF_feedbackSubmissionR", "Submitting feedback report failed.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(cdtu.f181751a.mo6606a().mo78329a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29519a(Map map) {
        super.mo29519a(map);
        map.put("User-Agent", String.format("%s (%s %s)", "AndroidGoogleFeedback/1.1", Build.DEVICE, Build.ID));
        map.put("Content-Type", "application/x-protobuf");
    }
}
