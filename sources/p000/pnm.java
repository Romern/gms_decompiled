package p000;

import com.google.android.gms.cast.CastDevice;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: pnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnm {

    /* renamed from: a */
    public CastDevice f39844a;

    /* renamed from: b */
    public final Set f39845b = new HashSet();

    /* renamed from: c */
    public pnn f39846c;

    /* renamed from: d */
    public pnq f39847d;

    /* renamed from: e */
    public pnk f39848e;

    /* renamed from: f */
    public long f39849f;

    /* renamed from: g */
    public long f39850g;

    /* renamed from: h */
    public final Set f39851h = new HashSet();

    /* renamed from: i */
    public final Set f39852i = new HashSet();

    /* renamed from: j */
    public String f39853j;

    /* renamed from: k */
    public final List f39854k = new ArrayList();

    /* renamed from: l */
    public bsib f39855l;

    public pnm(CastDevice castDevice) {
        this.f39844a = castDevice;
    }

    /* renamed from: a */
    public static long m30923a(bsib bsib) {
        try {
            bxtx bxtx = bsib.f144657b;
            if (bxtx.mo73779j()) {
                return 0;
            }
            ByteBuffer allocate = ByteBuffer.allocate(64);
            bxtx.mo73758a(allocate);
            allocate.flip();
            return allocate.getLong();
        } catch (BufferOverflowException | ReadOnlyBufferException e) {
            return 0;
        }
    }

    /* renamed from: a */
    public final boolean mo23500a(long j, long j2) {
        return j - this.f39849f > j2;
    }

    public final String toString() {
        byte[] bArr;
        String str;
        if (this.f39844a.mo17497b()) {
            bArr = qat.m31759a(this.f39844a.f29715c);
        } else {
            CastDevice castDevice = this.f39844a;
            byte[] bArr2 = castDevice.f29726n;
            if (bArr2 == null) {
                if (castDevice.mo17498c()) {
                    byte[] address = this.f39844a.f29715c.getAddress();
                    bArr2 = new byte[]{address[14], address[15]};
                } else {
                    bArr = null;
                }
            }
            bArr = bArr2;
        }
        if (bArr == null) {
            str = "Unknown";
        } else if (this.f39844a.mo17498c()) {
            str = String.format(Locale.US, "[%02X%02X]", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]));
        } else {
            str = String.format(Locale.US, "[%d.%d]", Integer.valueOf(bArr[0] & 255), Integer.valueOf(bArr[1] & 255));
        }
        return String.format(Locale.US, "CastDeviceInfo: Device ID-%s, hotspot BSSID-%s, IP fragment-%s", this.f39844a.mo17494a(), this.f39844a.f29725m, str);
    }

    /* renamed from: a */
    public final pnq mo23497a() {
        pnq pnq = this.f39847d;
        if (pnq != null) {
            String str = pnq.f39867c;
            if (str != null) {
                pnq.f39867c = str.replace(":", "");
            }
            if (!this.f39847d.f39865a.isEmpty()) {
                Iterator it = this.f39847d.f39865a.iterator();
                HashSet hashSet = new HashSet();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2.contains(":")) {
                        it.remove();
                        hashSet.add(str2.replace(":", ""));
                    }
                }
                this.f39847d.f39865a.addAll(hashSet);
            }
        }
        return this.f39847d;
    }

    /* renamed from: a */
    public final void mo23498a(Set set, Set set2) {
        if (set != null) {
            this.f39845b.clear();
            this.f39845b.addAll(set);
        } else if (set2 != null) {
            this.f39845b.removeAll(set2);
        }
        if (set2 != null) {
            this.f39851h.clear();
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!ptk.m31238b(str)) {
                    this.f39851h.add(str);
                }
            }
        } else if (set != null) {
            this.f39851h.removeAll(set);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23499a(poe poe) {
        if (this.f39854k.contains(poe)) {
            this.f39854k.remove(poe);
            if (poe.f39905c.contains(this)) {
                poe.f39905c.remove(this);
                mo23499a(poe);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo23501a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!this.f39845b.contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
