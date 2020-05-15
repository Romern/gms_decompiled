package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: bpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpm extends bph implements Serializable, bpc {

    /* renamed from: b */
    private byte[] f5316b;

    /* renamed from: c */
    private List f5317c;

    /* renamed from: d */
    private final Boolean f5318d;

    public bpm(bpo bpo) {
        super(bpo);
        this.f5318d = Boolean.valueOf(bpo.mo3378b());
        if (bpo.mo3378b()) {
            this.f5317c = new ArrayList();
        }
    }

    /* renamed from: a */
    private static final void m3446a(OutputStream outputStream, int i) {
        byte[] bArr;
        if (i <= 127) {
            bArr = new byte[]{(byte) i};
        } else if (i <= 255) {
            bArr = new byte[]{-127, (byte) i};
        } else if (i <= 65535) {
            bArr = new byte[]{-126, (byte) ((i >> 8) & 255), (byte) (i & 255)};
        } else if (i > 16777215) {
            bArr = new byte[]{-124, (byte) (i >> 24), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
        } else {
            bArr = new byte[]{-125, (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
        }
        outputStream.write(bArr);
    }

    /* renamed from: b */
    public final int mo3354b(bpc bpc) {
        bpo bpo = this.f5308a;
        bpo a = bpc.mo3349a();
        int i = 0;
        if (!bpo.equals(a)) {
            if (bpo.mo3378b()) {
                bpc bpc2 = null;
                for (bpc bpc3 : this.f5317c) {
                    if (bpc3.mo3349a().equals(a)) {
                        i += bpc3.mo3354b(bpc);
                        bpc2 = bpc3;
                    }
                }
                if (bpc2 == null) {
                    mo3351a(bpc.mo3357d());
                    return 1;
                }
            }
            return i;
        } else if (bpo.mo3378b()) {
            Iterator it = bpc.iterator();
            while (it.hasNext()) {
                i = mo3354b((bpc) it.next());
            }
            return i;
        } else {
            mo3353a(bpc.mo3355b());
            return 1;
        }
    }

    /* renamed from: c */
    public final int mo3356c() {
        byte[] b = mo3355b();
        this.f5316b = b;
        if (b != null) {
            return b.length;
        }
        return 0;
    }

    /* renamed from: d */
    public final bpc mo3357d() {
        bpo bpo = this.f5308a;
        if (bpo.mo3378b()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo3352a(byteArrayOutputStream);
            return new bpn().mo3375a(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        }
        bpm bpm = new bpm(new bpo(bpo.f5320a));
        bpm.mo3353a(mo3355b());
        return bpm;
    }

    /* renamed from: e */
    public final byte[] mo3358e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo3352a(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            bpc bpc = (bpc) obj;
            if (this.f5308a.equals(bpc.mo3349a())) {
                return Arrays.equals(mo3355b(), bpc.mo3355b());
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5308a.hashCode() + Arrays.hashCode(mo3355b());
    }

    public final Iterator iterator() {
        if (this.f5318d.booleanValue()) {
            List list = this.f5317c;
            return list.subList(0, list.size()).iterator();
        }
        throw new IllegalStateException("The instance is a simple TLV object");
    }

    public final String toString() {
        return cbm.m3893a(mo3358e());
    }

    /* renamed from: a */
    public final Iterator mo3350a(bpo bpo) {
        if (this.f5318d.booleanValue()) {
            return new bpi(iterator(), bpo);
        }
        throw new IllegalArgumentException("Instance is not a constructed TLV object.");
    }

    /* renamed from: a */
    public final void mo3351a(bpc bpc) {
        if (!this.f5308a.mo3378b()) {
            throw new IllegalArgumentException("The instance is a 'simple' TLV object, hence it can't accept any component");
        } else if (bpc != null) {
            bpm bpm = (bpm) bpc;
            this.f5317c.add(bpc);
        } else {
            throw new IllegalArgumentException("The provided component is null");
        }
    }

    /* renamed from: b */
    public final byte[] mo3355b() {
        try {
            if (this.f5308a.mo3378b()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (bpc bpc : this.f5317c) {
                    bpc.mo3352a(byteArrayOutputStream);
                }
                this.f5316b = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            }
            byte[] bArr = this.f5316b;
            if (bArr != null) {
                return (byte[]) bArr.clone();
            }
            return null;
        } catch (Exception e) {
            throw new bpd("Error occurred", e);
        }
    }

    /* renamed from: a */
    public final void mo3352a(OutputStream outputStream) {
        int i;
        try {
            outputStream.write(this.f5308a.mo3377a());
            if (this.f5318d.booleanValue()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (bpc bpc : this.f5317c) {
                    bpc.mo3352a(byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f5316b = byteArray;
                m3446a(outputStream, byteArray.length);
                outputStream.write(this.f5316b);
                return;
            }
            byte[] bArr = this.f5316b;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            m3446a(outputStream, i);
            if (i > 0) {
                outputStream.write(this.f5316b);
            }
        } catch (Exception e) {
            throw new bpd("Error occurred during writing to the given steam", e);
        }
    }

    /* renamed from: a */
    public final void mo3353a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (!this.f5308a.mo3378b()) {
            this.f5316b = (byte[]) bArr.clone();
            return;
        }
        this.f5317c = new bpn().mo3376b(new ByteArrayInputStream(bArr));
    }
}
