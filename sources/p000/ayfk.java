package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.selector.NativeOsCompat;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ayfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfk implements ayfj {

    /* renamed from: d */
    private static final byte[] f97480d = {42};

    /* renamed from: a */
    public final Map f97481a = new HashMap();

    /* renamed from: b */
    public final ParcelFileDescriptor[] f97482b;

    /* renamed from: c */
    public boolean f97483c;

    /* renamed from: e */
    private final ayfh f97484e = ayfg.f97473a;

    /* renamed from: f */
    private final Object f97485f = new Object();

    public ayfk() {
        try {
            this.f97482b = ParcelFileDescriptor.createPipe();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    private static final void m83915a(int i) {
        if (i == 0) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public static ayfl m83917c(ParcelFileDescriptor parcelFileDescriptor) {
        ayfl ayfl = new ayfl();
        ayfl.f97486a = parcelFileDescriptor;
        ayfl.f97487b = 1;
        return ayfl;
    }

    /* renamed from: d */
    private final void m83918d() {
        try {
            mo53619b(this.f97482b[1], f97480d, 0, 1);
        } catch (ayff e) {
            throw new IllegalStateException(e);
        } catch (EOFException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: a */
    public final void mo53616a(ParcelFileDescriptor parcelFileDescriptor) {
        throw null;
    }

    /* renamed from: a */
    public final void mo53617a(ParcelFileDescriptor parcelFileDescriptor, ayfi ayfi) {
        throw null;
    }

    /* renamed from: b */
    public final int mo53619b(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr, int i, int i2) {
        m83916a(bArr.length, i, i2);
        if (i2 == 0) {
            return 0;
        }
        try {
            sdo.m34959a(parcelFileDescriptor);
            sdo.m34959a(bArr);
            int nativeWrite = NativeOsCompat.nativeWrite(parcelFileDescriptor.getFd(), bArr, i, i2);
            NativeOsCompat.m94431a(nativeWrite, "write");
            m83915a(nativeWrite);
            return nativeWrite;
        } catch (ayff e) {
            int i3 = e.f97472a;
            ayfh ayfh = this.f97484e;
            if (i3 == ayfh.f97474a) {
                return 0;
            }
            if (i3 == ayfh.f97475b) {
                throw new EOFException();
            }
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo53621b(ParcelFileDescriptor parcelFileDescriptor) {
        throw null;
    }

    public final void close() {
        synchronized (this.f97485f) {
            this.f97483c = true;
            boax.m111028a(this.f97482b[0]);
            boax.m111028a(this.f97482b[1]);
        }
    }

    /* renamed from: a */
    private static void m83916a(int i, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException(String.format("length=%s; regionStart=%s; regionLength=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    /* renamed from: c */
    public final void mo53976c() {
        do {
            try {
            } catch (ayff e) {
                throw new IllegalStateException(e);
            } catch (EOFException e2) {
                throw new IllegalStateException(e2);
            }
        } while (mo53615a(this.f97482b[0], new byte[1], 0, 1) != 0);
    }

    /* renamed from: a */
    public final int mo53615a(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr, int i, int i2) {
        m83916a(bArr.length, i, i2);
        if (i2 == 0) {
            return 0;
        }
        try {
            sdo.m34959a(parcelFileDescriptor);
            sdo.m34959a(bArr);
            int nativeRead = NativeOsCompat.nativeRead(parcelFileDescriptor.getFd(), bArr, i, i2);
            NativeOsCompat.m94431a(nativeRead, "read");
            m83915a(nativeRead);
            return nativeRead;
        } catch (ayff e) {
            if (e.f97472a == this.f97484e.f97474a) {
                return 0;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo53620b() {
        synchronized (this.f97485f) {
            if (!this.f97483c) {
                m83918d();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53618a() {
        if (!this.f97483c) {
            for (ayfi ayfi : this.f97481a.values()) {
                if (ayfi != ayfi.NONE) {
                    return true;
                }
            }
        }
        return false;
    }
}
