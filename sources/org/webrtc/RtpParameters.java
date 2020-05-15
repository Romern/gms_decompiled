package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RtpParameters {

    /* renamed from: a */
    public final String f191998a;

    /* renamed from: b */
    public DegradationPreference f191999b;

    /* renamed from: c */
    public final List f192000c;

    /* renamed from: d */
    public final List f192001d;

    /* renamed from: e */
    private final Rtcp f192002e;

    /* renamed from: f */
    private final List f192003f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Codec {

        /* renamed from: a */
        public int f192004a;

        /* renamed from: b */
        public String f192005b;

        /* renamed from: c */
        MediaStreamTrack.MediaType f192006c;

        /* renamed from: d */
        public Integer f192007d;

        /* renamed from: e */
        public Integer f192008e;

        /* renamed from: f */
        public Map f192009f;

        Codec(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map map) {
            this.f192004a = i;
            this.f192005b = str;
            this.f192006c = mediaType;
            this.f192007d = num;
            this.f192008e = num2;
            this.f192009f = map;
        }

        /* access modifiers changed from: package-private */
        public Integer getClockRate() {
            return this.f192007d;
        }

        /* access modifiers changed from: package-private */
        public MediaStreamTrack.MediaType getKind() {
            return this.f192006c;
        }

        /* access modifiers changed from: package-private */
        public String getName() {
            return this.f192005b;
        }

        /* access modifiers changed from: package-private */
        public Integer getNumChannels() {
            return this.f192008e;
        }

        /* access modifiers changed from: package-private */
        public Map getParameters() {
            return this.f192009f;
        }

        /* access modifiers changed from: package-private */
        public int getPayloadType() {
            return this.f192004a;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        static DegradationPreference fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Encoding {

        /* renamed from: a */
        public String f192015a;

        /* renamed from: b */
        public boolean f192016b;

        /* renamed from: c */
        public double f192017c;

        /* renamed from: d */
        public int f192018d;

        /* renamed from: e */
        public Integer f192019e;

        /* renamed from: f */
        public Integer f192020f;

        /* renamed from: g */
        public Integer f192021g;

        /* renamed from: h */
        public Integer f192022h;

        /* renamed from: i */
        public Double f192023i;

        /* renamed from: j */
        public Long f192024j;

        Encoding(String str, boolean z, double d, int i, Integer num, Integer num2, Integer num3, Integer num4, Double d2, Long l) {
            this.f192015a = str;
            this.f192016b = z;
            this.f192017c = d;
            this.f192018d = i;
            this.f192019e = num;
            this.f192020f = num2;
            this.f192021g = num3;
            this.f192022h = num4;
            this.f192023i = d2;
            this.f192024j = l;
        }

        /* access modifiers changed from: package-private */
        public boolean getActive() {
            return this.f192016b;
        }

        /* access modifiers changed from: package-private */
        public double getBitratePriority() {
            return this.f192017c;
        }

        /* access modifiers changed from: package-private */
        public Integer getMaxBitrateBps() {
            return this.f192019e;
        }

        /* access modifiers changed from: package-private */
        public Integer getMaxFramerate() {
            return this.f192021g;
        }

        /* access modifiers changed from: package-private */
        public Integer getMinBitrateBps() {
            return this.f192020f;
        }

        /* access modifiers changed from: package-private */
        public int getNetworkPriority() {
            return this.f192018d;
        }

        /* access modifiers changed from: package-private */
        public Integer getNumTemporalLayers() {
            return this.f192022h;
        }

        /* access modifiers changed from: package-private */
        public String getRid() {
            return this.f192015a;
        }

        /* access modifiers changed from: package-private */
        public Double getScaleResolutionDownBy() {
            return this.f192023i;
        }

        /* access modifiers changed from: package-private */
        public Long getSsrc() {
            return this.f192024j;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class HeaderExtension {

        /* renamed from: a */
        private final String f192025a;

        /* renamed from: b */
        private final int f192026b;

        /* renamed from: c */
        private final boolean f192027c;

        HeaderExtension(String str, int i, boolean z) {
            this.f192025a = str;
            this.f192026b = i;
            this.f192027c = z;
        }

        public boolean getEncrypted() {
            return this.f192027c;
        }

        public int getId() {
            return this.f192026b;
        }

        public String getUri() {
            return this.f192025a;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Rtcp {

        /* renamed from: a */
        private final String f192028a;

        /* renamed from: b */
        private final boolean f192029b;

        Rtcp(String str, boolean z) {
            this.f192028a = str;
            this.f192029b = z;
        }

        public String getCname() {
            return this.f192028a;
        }

        public boolean getReducedSize() {
            return this.f192029b;
        }
    }

    RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List list, List list2, List list3) {
        this.f191998a = str;
        this.f191999b = degradationPreference;
        this.f192002e = rtcp;
        this.f192003f = list;
        this.f192000c = list2;
        this.f192001d = list3;
    }

    /* access modifiers changed from: package-private */
    public List getCodecs() {
        return this.f192001d;
    }

    /* access modifiers changed from: package-private */
    public DegradationPreference getDegradationPreference() {
        return this.f191999b;
    }

    /* access modifiers changed from: package-private */
    public List getEncodings() {
        return this.f192000c;
    }

    public List getHeaderExtensions() {
        return this.f192003f;
    }

    public Rtcp getRtcp() {
        return this.f192002e;
    }

    /* access modifiers changed from: package-private */
    public String getTransactionId() {
        return this.f191998a;
    }
}
