package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bypu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypu extends bypx {

    /* renamed from: a */
    public final bnim f167361a;

    /* renamed from: b */
    private final int f167362b;

    public bypu(bnim bnim) {
        bmxy.m108581a(bnim);
        this.f167361a = bnim;
        bnrd a = bnim.entrySet().iterator();
        int i = 0;
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            int a2 = ((bypx) entry.getKey()).mo74416a();
            i = i < a2 ? a2 : i;
            int a3 = ((bypx) entry.getValue()).mo74416a();
            if (i < a3) {
                i = a3;
            }
        }
        int i2 = i + 1;
        this.f167362b = i2;
        if (i2 > 4) {
            throw new bypm("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo74416a() {
        return this.f167362b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo74418b() {
        return m125078a((byte) -96);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        bypx bypx = (bypx) obj;
        if (mo74418b() != bypx.mo74418b()) {
            return mo74418b() - bypx.mo74418b();
        }
        bypu bypu = (bypu) bypx;
        if (this.f167361a.size() != bypu.f167361a.size()) {
            return this.f167361a.size() - bypu.f167361a.size();
        }
        bnrd a = this.f167361a.entrySet().iterator();
        bnrd a2 = bypu.f167361a.entrySet().iterator();
        do {
            if (!a.hasNext() && !a2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) a.next();
            Map.Entry entry2 = (Map.Entry) a2.next();
            int compareTo2 = ((bypx) entry.getKey()).compareTo((bypx) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((bypx) entry.getValue()).compareTo((bypx) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return bnmt.m109811d(this.f167361a, ((bypu) obj).f167361a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo74418b()), this.f167361a});
    }

    public final String toString() {
        if (this.f167361a.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bnrd a = this.f167361a.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            linkedHashMap.put(((bypx) entry.getKey()).toString().replace("\n", "\n  "), ((bypx) entry.getValue()).toString().replace("\n", "\n  "));
        }
        bmxq b = bmxr.m108544a(",\n  ").mo66879b(" : ");
        StringBuilder sb = new StringBuilder("{\n  ");
        b.mo66872a(sb, linkedHashMap.entrySet());
        sb.append("\n}");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74417a(byqc byqc) {
        try {
            long size = (long) this.f167361a.size();
            if (size >= 0) {
                byqc.f167375a.mo74461b();
                byqc.mo74465a((byte) -96, size);
                if (size > 0) {
                    byqc.f167375a.mo74462b(size + size);
                }
                bnrd a = this.f167361a.entrySet().iterator();
                while (a.hasNext()) {
                    Map.Entry entry = (Map.Entry) a.next();
                    ((bypx) entry.getKey()).mo74417a(byqc);
                    ((bypx) entry.getValue()).mo74417a(byqc);
                }
                return;
            }
            throw new IllegalArgumentException("map length must be non-negative");
        } catch (IOException e) {
            throw new bypr("Error while encoding CborMap", e);
        }
    }
}
