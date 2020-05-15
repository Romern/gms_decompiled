package p000;

import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionEvent;
import java.util.List;

/* renamed from: bgig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgig implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActivityChangedEvent f116502a;

    /* renamed from: b */
    final /* synthetic */ bgih f116503b;

    public bgig(bgih bgih, ActivityChangedEvent activityChangedEvent) {
        this.f116503b = bgih;
        this.f116502a = activityChangedEvent;
    }

    public final void run() {
        bgih bgih;
        if (!this.f116503b.f116504a.isEmpty()) {
            for (ActivityRecognitionEvent activityRecognitionEvent : this.f116502a.getActivityRecognitionEvents()) {
                if (activityRecognitionEvent.getEventType() == 0) {
                    List list = this.f116503b.f116504a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((bgmq) list.get(i)).mo61003s();
                    }
                } else {
                    if (!"android.activity_recognition.tilting".equals(activityRecognitionEvent.getActivity())) {
                        long timestampNs = activityRecognitionEvent.getTimestampNs();
                        bgih bgih2 = this.f116503b;
                        if (timestampNs >= bgih2.f116505b) {
                            bgih2.f116505b = activityRecognitionEvent.getTimestampNs();
                            bgih = this.f116503b;
                        }
                    } else {
                        bgih = this.f116503b;
                    }
                    bgih.mo62853a(activityRecognitionEvent);
                }
            }
        }
    }
}
