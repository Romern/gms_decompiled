package p000;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: avf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avf extends avb {

    /* renamed from: f */
    private static final Charset f2366f = Charset.forName("UTF-16");

    /* renamed from: d */
    int f2367d = 0;

    /* renamed from: e */
    int f2368e = -1;

    /* renamed from: g */
    private final DataInputStream f2369g;

    /* renamed from: h */
    private final DataOutputStream f2370h;

    /* renamed from: i */
    private final DataInputStream f2371i;

    /* renamed from: j */
    private DataOutputStream f2372j;

    /* renamed from: k */
    private ave f2373k;

    /* renamed from: l */
    private boolean f2374l;

    /* renamed from: m */
    private int f2375m = -1;

    public avf(InputStream inputStream, OutputStream outputStream, C1245ok okVar, C1245ok okVar2, C1245ok okVar3) {
        super(okVar, okVar2, okVar3);
        DataInputStream dataInputStream;
        DataOutputStream dataOutputStream = null;
        if (inputStream != null) {
            dataInputStream = new DataInputStream(new avd(this, inputStream));
        } else {
            dataInputStream = null;
        }
        this.f2369g = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.f2370h = dataOutputStream;
        this.f2371i = this.f2369g;
        this.f2372j = dataOutputStream;
    }

    /* renamed from: a */
    public final boolean mo2685a() {
        return true;
    }

    /* renamed from: b */
    public final void mo2691b() {
        int i;
        ave ave = this.f2373k;
        if (ave != null) {
            try {
                if (ave.f2362a.size() != 0) {
                    ave ave2 = this.f2373k;
                    ave2.f2363b.flush();
                    int size = ave2.f2362a.size();
                    int i2 = ave2.f2364c << 16;
                    if (size >= 65535) {
                        i = 65535;
                    } else {
                        i = size;
                    }
                    ave2.f2365d.writeInt(i2 | i);
                    if (size >= 65535) {
                        ave2.f2365d.writeInt(size);
                    }
                    ave2.f2362a.writeTo(ave2.f2365d);
                }
                this.f2373k = null;
            } catch (IOException e) {
                throw new ava(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final avb mo2695c() {
        return new avf(this.f2371i, this.f2372j, this.f2350a, this.f2351b, this.f2352c);
    }

    /* renamed from: d */
    public final int mo2697d() {
        try {
            return this.f2371i.readInt();
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: e */
    public final long mo2698e() {
        try {
            return this.f2371i.readLong();
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: f */
    public final String mo2699f() {
        try {
            int readInt = this.f2371i.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f2371i.readFully(bArr);
            return new String(bArr, f2366f);
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: g */
    public final IBinder mo2700g() {
        return null;
    }

    /* renamed from: h */
    public final byte[] mo2701h() {
        try {
            int readInt = this.f2371i.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f2371i.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final CharSequence mo2702i() {
        return null;
    }

    /* renamed from: j */
    public final Parcelable mo2703j() {
        return null;
    }

    /* renamed from: k */
    public final boolean mo2704k() {
        try {
            return this.f2371i.readBoolean();
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: a */
    public final void mo2668a(int i) {
        try {
            this.f2372j.writeInt(i);
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: c */
    public final void mo2696c(int i) {
        mo2691b();
        ave ave = new ave(i, this.f2370h);
        this.f2373k = ave;
        this.f2372j = ave.f2363b;
    }

    /* renamed from: a */
    public final void mo2670a(long j) {
        try {
            this.f2372j.writeLong(j);
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: a */
    public final void mo2671a(IBinder iBinder) {
        if (!this.f2374l) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public final void mo2672a(Parcelable parcelable) {
        if (!this.f2374l) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2676a(CharSequence charSequence) {
        if (!this.f2374l) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    /* renamed from: b */
    public final boolean mo2692b(int i) {
        while (true) {
            try {
                int i2 = this.f2375m;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.f2367d;
                int i4 = this.f2368e;
                if (i3 < i4) {
                    this.f2369g.skip((long) (i4 - i3));
                }
                this.f2368e = -1;
                int readInt = this.f2369g.readInt();
                this.f2367d = 0;
                int i5 = (char) readInt;
                if (i5 == 65535) {
                    i5 = this.f2369g.readInt();
                }
                this.f2375m = (char) (readInt >> 16);
                this.f2368e = i5;
            } catch (IOException e) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo2678a(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f2366f);
                this.f2372j.writeInt(bytes.length);
                this.f2372j.write(bytes);
            } catch (IOException e) {
                throw new ava(e);
            }
        } else {
            this.f2372j.writeInt(-1);
        }
    }

    /* renamed from: a */
    public final void mo2680a(boolean z) {
        try {
            this.f2372j.writeBoolean(z);
        } catch (IOException e) {
            throw new ava(e);
        }
    }

    /* renamed from: a */
    public final void mo2682a(boolean z, boolean z2) {
        if (z) {
            this.f2374l = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    /* renamed from: a */
    public final void mo2683a(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f2372j.writeInt(bArr.length);
                this.f2372j.write(bArr);
            } catch (IOException e) {
                throw new ava(e);
            }
        } else {
            this.f2372j.writeInt(-1);
        }
    }
}
