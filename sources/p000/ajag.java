package p000;

import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: ajag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajag implements Comparable {

    /* renamed from: a */
    public final String f70231a;

    /* renamed from: b */
    public final String f70232b;

    /* renamed from: c */
    public final Map f70233c;

    /* renamed from: d */
    public final Map f70234d;

    /* renamed from: e */
    public final LinkedHashMap f70235e;

    /* renamed from: f */
    final long f70236f;

    /* renamed from: g */
    public double f70237g = Double.NaN;

    /* renamed from: h */
    public byys f70238h;

    /* renamed from: i */
    public byte[] f70239i;

    public ajag(long j, String str) {
        this.f70236f = j;
        this.f70232b = str;
        this.f70231a = UUID.randomUUID().toString();
        this.f70233c = new HashMap();
        this.f70234d = new HashMap();
        this.f70235e = new LinkedHashMap(1);
    }

    /* renamed from: a */
    public static final int m58331a(Object obj, BleSignalImpl bleSignalImpl, Map map, int i) {
        if (!map.containsKey(obj)) {
            map.put(obj, bleSignalImpl);
            return i | 16;
        }
        BleSignalImpl bleSignalImpl2 = (BleSignalImpl) map.get(obj);
        ahfo ahfo = ajai.f70240a;
        if (bleSignalImpl2 != null && bleSignalImpl != null && bleSignalImpl2.f80721c == bleSignalImpl.f80721c && ((long) Math.abs(bleSignalImpl2.f80720b - bleSignalImpl.f80720b)) < cfop.f185115a.mo6606a().mo82213Q()) {
            return 0;
        }
        map.put(obj, bleSignalImpl);
        return 16;
    }

    /* renamed from: b */
    public final Set mo38371b() {
        return Collections.unmodifiableSet(this.f70233c.keySet());
    }

    /* renamed from: c */
    public final Set mo38372c() {
        return Collections.unmodifiableSet(this.f70234d.keySet());
    }

    /* renamed from: d */
    public final Set mo38374d() {
        return Collections.unmodifiableSet(this.f70235e.keySet());
    }

    /* renamed from: e */
    public final Map mo38375e() {
        return Collections.unmodifiableMap(this.f70233c);
    }

    /* renamed from: f */
    public final Map mo38376f() {
        return Collections.unmodifiableMap(this.f70234d);
    }

    /* renamed from: g */
    public final Map mo38377g() {
        return Collections.unmodifiableMap(this.f70235e);
    }

    /* renamed from: h */
    public final aizv mo38378h() {
        return (aizv) bnjr.m109621c(this.f70235e.keySet().iterator(), (Object) null);
    }

    /* renamed from: i */
    public final byys mo38379i() {
        if (this.f70238h == null) {
            UUID fromString = UUID.fromString(this.f70231a);
            this.f70238h = aizs.m58300a(3, ByteBuffer.wrap(new byte[16]).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).array());
        }
        return this.f70238h;
    }

    public final String toString() {
        String str;
        String str2;
        Object[] objArr = new Object[7];
        objArr[0] = this.f70231a;
        Map map = this.f70233c;
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (Map.Entry entry : map.entrySet()) {
                sb.append(aizs.m58301a((byys) entry.getKey()));
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append("}");
            str = sb.toString();
        } else {
            str = "{}";
        }
        objArr[1] = str;
        objArr[2] = this.f70234d;
        objArr[3] = this.f70235e;
        objArr[4] = Long.valueOf(this.f70236f);
        objArr[5] = Double.valueOf(this.f70237g);
        byte[] bArr = this.f70239i;
        if (bArr != null) {
            str2 = srv.m36164d(bArr);
        } else {
            str2 = null;
        }
        objArr[6] = str2;
        return String.format("Device{handle=%s, beaconIdToBleSignal=%s, urlToBleSignal=%s, bleRecordToBleSignal=%s, foundMillis=%s, distanceEstimate=%s, telemetry=%s}", objArr);
    }

    public ajag(ajag ajag) {
        this.f70231a = ajag.f70231a;
        this.f70232b = ajag.f70232b;
        this.f70236f = ajag.f70236f;
        this.f70233c = new HashMap(ajag.f70233c);
        this.f70234d = new HashMap(ajag.f70234d);
        this.f70235e = new LinkedHashMap(ajag.f70235e);
        this.f70237g = ajag.f70237g;
        this.f70239i = ajag.f70239i;
    }

    /* renamed from: a */
    public final int compareTo(ajag ajag) {
        return Double.compare(this.f70237g, ajag.f70237g);
    }

    /* renamed from: a */
    public final BleSignalImpl mo38367a(byys byys) {
        return (BleSignalImpl) this.f70233c.get(byys);
    }

    /* renamed from: a */
    public final BleSignalImpl mo38368a(Object obj) {
        if (obj instanceof byys) {
            return mo38367a((byys) obj);
        }
        if (obj instanceof String) {
            return mo38369a((String) obj);
        }
        return null;
    }

    /* renamed from: a */
    public final BleSignalImpl mo38369a(String str) {
        return (BleSignalImpl) this.f70234d.get(str);
    }

    /* renamed from: a */
    public final boolean mo38370a() {
        return !Double.isNaN(this.f70237g);
    }
}
