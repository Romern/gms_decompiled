package p000;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONObject;

/* renamed from: pgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgl {

    /* renamed from: a */
    private final MediaQueueItem f39083a;

    public pgl(MediaInfo mediaInfo) {
        this.f39083a = new MediaQueueItem(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
    }

    /* renamed from: a */
    public final MediaQueueItem mo23047a() {
        MediaQueueItem mediaQueueItem = this.f39083a;
        if (mediaQueueItem.f29800a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(mediaQueueItem.f29803d) && mediaQueueItem.f29803d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(mediaQueueItem.f29804e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (!Double.isNaN(mediaQueueItem.f29805f) && mediaQueueItem.f29805f >= 0.0d) {
            return this.f39083a;
        } else {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public pgl(JSONObject jSONObject) {
        this.f39083a = new MediaQueueItem(jSONObject);
    }
}
