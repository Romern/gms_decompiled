package p000;

import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleFilter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfa {

    /* renamed from: d */
    private static final byte[] f35442d = {-16};

    /* renamed from: a */
    public boolean f35443a = false;

    /* renamed from: b */
    public boolean f35444b = false;

    /* renamed from: c */
    public boolean f35445c = false;

    /* renamed from: e */
    private final List f35446e = new ArrayList();

    /* renamed from: f */
    private boolean f35447f = false;

    /* renamed from: g */
    private boolean f35448g = false;

    /* renamed from: b */
    public static BleFilter m26072b() {
        byte[] bArr = nex.f35435a;
        byte[] bArr2 = nex.f35436b;
        neh neh = new neh();
        neh.mo20516a(76, bArr, bArr2);
        return neh.mo20515a();
    }

    /* renamed from: c */
    public static BleFilter m26073c() {
        neh neh = new neh();
        neh.mo20517a(nfb.f35449a);
        return neh.mo20515a();
    }

    /* renamed from: d */
    public static BleFilter m26074d() {
        neh neh = new neh();
        neh.mo20517a(nfb.f35449a);
        neh.mo20519a(nfb.f35449a, new byte[]{0}, f35442d);
        return neh.mo20515a();
    }

    /* renamed from: e */
    public static BleFilter m26075e() {
        neh neh = new neh();
        neh.mo20517a(nfb.f35449a);
        neh.mo20519a(nfb.f35449a, new byte[]{16}, f35442d);
        return neh.mo20515a();
    }

    /* renamed from: f */
    public static BleFilter m26076f() {
        neh neh = new neh();
        neh.mo20517a(nfb.f35449a);
        neh.mo20519a(nfb.f35449a, new byte[]{48}, f35442d);
        return neh.mo20515a();
    }

    /* renamed from: a */
    public final List mo20561a() {
        ArrayList arrayList = new ArrayList();
        if (!this.f35447f) {
            List list = this.f35446e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ParcelUuid parcelUuid = (ParcelUuid) list.get(i);
                byte[] bArr = nex.f35435a;
                byte[] bArr2 = new byte[18];
                bArr2[0] = 2;
                bArr2[1] = 21;
                if (parcelUuid != null) {
                    ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
                    wrap.putLong(parcelUuid.getUuid().getMostSignificantBits());
                    wrap.putLong(parcelUuid.getUuid().getLeastSignificantBits());
                    byte[] array = wrap.array();
                    for (int i2 = 0; i2 < 16; i2++) {
                        bArr2[i2 + 2] = array[i2];
                    }
                }
                byte[] bArr3 = new byte[18];
                bArr3[0] = -1;
                bArr3[1] = -1;
                if (parcelUuid != null) {
                    for (int i3 = 0; i3 < 16; i3++) {
                        bArr3[i3 + 2] = -1;
                    }
                }
                neh neh = new neh();
                neh.mo20516a(76, bArr2, bArr3);
                arrayList.add(neh.mo20515a());
            }
        } else {
            arrayList.add(m26072b());
        }
        if (!this.f35448g) {
            if (this.f35445c) {
                if (!this.f35443a || !this.f35444b) {
                    arrayList.add(m26076f());
                }
            }
            if (this.f35444b) {
                arrayList.add(m26075e());
            }
            if (this.f35443a) {
                arrayList.add(m26074d());
            }
            return arrayList;
        }
        arrayList.add(m26073c());
        return arrayList;
    }

    /* renamed from: g */
    public final void mo20562g() {
        this.f35448g = true;
    }

    /* renamed from: h */
    public final void mo20563h() {
        this.f35447f = true;
    }
}
