package p000;

import com.google.android.gms.location.FloorChangeEvent;
import com.google.android.gms.location.SleepSegmentEvent;

/* renamed from: berf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berf {
    /* renamed from: a */
    public static void m95533a(bfor bfor, int i) {
        bfor.mo62047a(new bfop(bfos.ACTIVITY_INSUFFICIENT_SAMPLES, bfor.mo62055b(), "%2$d", i));
    }

    /* renamed from: a */
    public static void m95534a(bfor bfor, FloorChangeEvent floorChangeEvent) {
        bfor.mo62047a(new bfoq(bfos.FLOOR_CHANGE_DETECTED, bfor.mo62055b(), null, floorChangeEvent, floorChangeEvent.f79334a, floorChangeEvent.f79335b, Float.floatToRawIntBits(floorChangeEvent.f79340g)));
    }

    /* renamed from: a */
    public static void m95535a(bfor bfor, SleepSegmentEvent sleepSegmentEvent, int i) {
        bfor.mo62047a(new bfoq(bfos.SLEEP_SEGMENT_FAILURE, bfor.mo62055b(), null, sleepSegmentEvent, i, -1, -1));
    }
}
