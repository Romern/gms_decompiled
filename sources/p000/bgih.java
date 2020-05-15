package p000;

import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionEvent;
import com.android.location.provider.ActivityRecognitionProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bgih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgih implements ActivityRecognitionProvider.Sink {

    /* renamed from: a */
    public final List f116504a = new ArrayList();

    /* renamed from: b */
    public long f116505b = 0;

    /* renamed from: c */
    final /* synthetic */ bgii f116506c;

    public bgih(bgii bgii) {
        this.f116506c = bgii;
    }

    /* renamed from: a */
    public final void mo62853a(ActivityRecognitionEvent activityRecognitionEvent) {
        bgmt bgmt = new bgmt(activityRecognitionEvent.getTimestampNs(), ((Integer) bgii.f116507b.get(activityRecognitionEvent.getActivity())).intValue(), ((Integer) bgii.f116508c.get(Integer.valueOf(activityRecognitionEvent.getEventType()))).intValue());
        List list = this.f116504a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bgmq bgmq = (bgmq) list.get(i);
            bgmq.mo60978b(bevp.HARDWARE_TALA.f112768am);
            bgmq.mo60969a(Collections.singletonList(bgmt));
        }
    }

    public final void onActivityChanged(ActivityChangedEvent activityChangedEvent) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityChangedEvent[");
        boolean z = true;
        for (ActivityRecognitionEvent activityRecognitionEvent : activityChangedEvent.getActivityRecognitionEvents()) {
            if (!z) {
                sb.append(", ");
            }
            int eventType = activityRecognitionEvent.getEventType();
            if (eventType != 0) {
                str = eventType != 1 ? eventType != 2 ? Integer.toString(eventType) : "EXIT" : "ENTER";
            } else {
                str = "FLUSH_COMPLETE";
            }
            sb.append(str);
            sb.append(' ');
            sb.append(activityRecognitionEvent.getActivity());
            sb.append(" @");
            sb.append(activityRecognitionEvent.getTimestampNs());
            z = false;
        }
        sb.append(']');
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() == 0) {
            new String("onActivityChanged ");
        } else {
            "onActivityChanged ".concat(valueOf);
        }
        this.f116506c.f116511a.mo62921a((Runnable) new bgig(this, activityChangedEvent));
    }
}
