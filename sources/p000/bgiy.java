package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: bgiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgiy extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bgiz f116577a;

    public bgiy(bgiz bgiz) {
        this.f116577a = bgiz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bext.a(com.google.android.gms.location.ActivityRecognitionResult, boolean):void
     arg types: [com.google.android.gms.location.ActivityRecognitionResult, int]
     candidates:
      bext.a(java.util.List, java.util.List):java.util.List
      bext.a(java.util.List, int[]):void
      bgmq.a(java.util.List, int[]):void
      bext.a(com.google.android.gms.location.ActivityRecognitionResult, boolean):void */
    public final void onReceive(Context context, Intent intent) {
        ActivityRecognitionResult b = ActivityRecognitionResult.m66821b(intent);
        bexr bexr = this.f116577a.f116578a;
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Received the activity result = ");
        sb.append(valueOf);
        sb.toString();
        if (bext.f112975b.f112980g == null) {
            String valueOf2 = String.valueOf(b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 63);
            sb2.append("Current transition request is null but received an AR result = ");
            sb2.append(valueOf2);
            sb2.toString();
        } else if (cesh.m138175g()) {
            bext.f112975b.mo61240a(b, false);
            bext bext = bext.f112975b;
            if (cesh.f183401a.mo6606a().enableAdaptiveWifiSampling() && bext.f112981h) {
                bgiz bgiz = bext.f112982i;
                bgmk bgmk = bext.f112976c;
                if (System.currentTimeMillis() - bext.f112978e > cesh.f183401a.mo6606a().minContinuousTimeIntervalWithConnectedWifi() && bext.f112977d && !bext.mo61242a()) {
                    bext.f112982i.mo62875a();
                    long d = cese.m138155d();
                    bext.f112979f = d;
                    bext.f112982i.mo62876a(d);
                } else if (!bext.f112977d && bext.mo61242a()) {
                    bext.f112982i.mo62875a();
                    long k = cese.m138162k();
                    bext.f112979f = k;
                    bext.f112982i.mo62876a(k);
                }
            }
        }
    }
}
