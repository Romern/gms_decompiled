package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.location.activity.ActivityRecognitionHelper$LastActivityReceiver;
import java.util.List;

/* renamed from: bern */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bern {

    /* renamed from: a */
    public final ssh f112223a;

    /* renamed from: b */
    public volatile ActivityRecognitionResult f112224b;

    /* renamed from: c */
    private final BroadcastReceiver f112225c = new ActivityRecognitionHelper$LastActivityReceiver(this);

    /* renamed from: d */
    private final Context f112226d;

    public bern(Context context) {
        this.f112226d = context;
        this.f112223a = ssh.m36213a(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.location.activity.ACTIVITY_RESULT");
        aki.m919a(this.f112226d).mo873a(this.f112225c, intentFilter);
    }

    /* renamed from: a */
    public static boolean m95589a(String str, String str2) {
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || str == null) {
            return false;
        }
        List list = null;
        if (str.equalsIgnoreCase("com.google.android.gms") && str2 != null) {
            if (!TextUtils.isEmpty(cesk.m138184g())) {
                list = bmyx.m108640a(';').mo66925c((CharSequence) cesk.m138184g());
            }
            if (list == null || !list.contains(str2)) {
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(cesk.m138183f())) {
            list = bmyx.m108640a(';').mo66925c((CharSequence) cesk.m138183f());
        }
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }
}
