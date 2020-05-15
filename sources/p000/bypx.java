package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

/* renamed from: bypx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bypx implements Comparable {
    /* renamed from: a */
    static int m125078a(byte b) {
        return (b >> 5) & 7;
    }

    /* renamed from: b */
    public static bypu m125086b(List list) {
        return m125084a((bypt[]) list.toArray(new bypt[list.size()]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo74416a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo74417a(byqc byqc);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo74418b();

    /* renamed from: c */
    public final byte[] mo74444c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byqc byqc = new byqc(byteArrayOutputStream);
        mo74417a(byqc);
        try {
            byqc.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new bypr("Error closing the CborWriter", e);
        }
    }

    /* renamed from: d */
    public final bypp mo74445d() {
        return (bypp) mo74443a(bypp.class);
    }

    /* renamed from: e */
    public final byps mo74446e() {
        return (byps) mo74443a(byps.class);
    }

    /* renamed from: f */
    public final bypu mo74447f() {
        return (bypu) mo74443a(bypu.class);
    }

    /* renamed from: g */
    public final bypv mo74448g() {
        return (bypv) mo74443a(bypv.class);
    }

    /* renamed from: a */
    public static bypn m125079a(List list) {
        return new bypn(bngx.m109368a((Collection) list));
    }

    /* renamed from: b */
    public static bypx m125087b(byte... bArr) {
        bypy bypy = new bypy(Arrays.copyOf((byte[]) bmxy.m108581a(bArr), bArr.length));
        bypx a = bypy.mo74449a();
        bmxy.m108581a(bypy.f167365b);
        try {
            bypy.f167365b.close();
            if (bypy.f167364a.available() <= 0) {
                return a;
            }
            throw new bypq("Didn't use all bytes from provided data in parsing CborValue");
        } catch (IOException e) {
            throw new bypq("Error in closing the CborReader", e);
        }
    }

    /* renamed from: a */
    public static bypn m125080a(bypx... bypxArr) {
        return new bypn(bngx.m109370a((Object[]) bypxArr));
    }

    /* renamed from: a */
    public static bypo m125081a(boolean z) {
        return new bypo(z);
    }

    /* renamed from: a */
    public static bypp m125082a(byte... bArr) {
        return new bypp(ByteString.m123261a(bArr));
    }

    /* renamed from: a */
    public static byps m125083a(long j) {
        return new byps(j);
    }

    /* renamed from: a */
    public static bypu m125084a(bypt... byptArr) {
        TreeMap treeMap = new TreeMap();
        int length = byptArr.length;
        int i = 0;
        while (i < length) {
            bypt bypt = byptArr[i];
            if (!treeMap.containsKey(bypt.f167359a)) {
                treeMap.put(bypt.f167359a, bypt.f167360b);
                i++;
            } else {
                throw new bypm("Attempted to add duplicate key to canonical CBOR Map.");
            }
        }
        return new bypu(bnim.m109536b(treeMap));
    }

    /* renamed from: a */
    public static bypv m125085a(String str) {
        return new bypv(str);
    }

    /* renamed from: a */
    public final bypx mo74443a(Class cls) {
        if (cls.isInstance(this)) {
            return (bypx) cls.cast(this);
        }
        String name = cls.getName();
        String name2 = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 27 + String.valueOf(name2).length());
        sb.append("Expected a ");
        sb.append(name);
        sb.append(" value, but got ");
        sb.append(name2);
        throw new bypw(sb.toString());
    }
}
