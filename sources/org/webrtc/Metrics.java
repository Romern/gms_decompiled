package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Metrics {

    /* renamed from: a */
    public final Map f191860a = new HashMap();

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class HistogramInfo {

        /* renamed from: a */
        public final Map f191861a = new HashMap();

        public HistogramInfo(int i, int i2, int i3) {
        }

        public void addSample(int i, int i2) {
            this.f191861a.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    Metrics() {
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.f191860a.put(str, histogramInfo);
    }
}
