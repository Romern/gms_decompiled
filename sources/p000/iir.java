package p000;

import android.content.Context;
import android.os.Binder;
import java.util.Random;

/* renamed from: iir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iir {

    /* renamed from: a */
    protected final Context f21066a;

    /* renamed from: b */
    public boolean f21067b;

    /* renamed from: c */
    public long f21068c;

    /* renamed from: d */
    public int f21069d = 1;

    /* renamed from: e */
    public int f21070e = 1;

    /* renamed from: f */
    public int f21071f;

    /* renamed from: g */
    private Long f21072g;

    /* renamed from: h */
    private final int f21073h = 1;

    /* renamed from: a */
    public final void mo13046a() {
        if (((Boolean) igt.f20973w.mo58455c()).booleanValue()) {
            Random random = new Random();
            long a = spn.getAndroidId(this.f21066a);
            if (a == 0) {
                Long l = this.f21072g;
                if (l != null) {
                    random.setSeed(l.longValue());
                }
            } else {
                random.setSeed(a);
            }
            if (random.nextDouble() < ((Double) igt.f20972v.mo58455c()).doubleValue()) {
                bxvd da = bodd.f132660m.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bodd bodd = (bodd) da.f164949b;
                bodd.f132663b = 0;
                int i = bodd.f132662a | 1;
                bodd.f132662a = i;
                int i2 = this.f21069d;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    bodd.f132664c = i3;
                    int i4 = i | 2;
                    bodd.f132662a = i4;
                    boolean z = this.f21067b;
                    int i5 = i4 | 4;
                    bodd.f132662a = i5;
                    bodd.f132665d = z;
                    int i6 = i5 | 8;
                    bodd.f132662a = i6;
                    bodd.f132666e = 0;
                    int i7 = i6 | 16;
                    bodd.f132662a = i7;
                    bodd.f132667f = false;
                    int i8 = i7 | 32;
                    bodd.f132662a = i8;
                    bodd.f132668g = false;
                    int i9 = i8 | 64;
                    bodd.f132662a = i9;
                    bodd.f132669h = false;
                    long j = this.f21068c;
                    bodd.f132662a = i9 | 128;
                    bodd.f132670i = j;
                    Long l2 = this.f21072g;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bodd bodd2 = (bodd) da.f164949b;
                        bodd2.f132662a |= 512;
                        bodd2.f132671j = longValue;
                    }
                    int i10 = this.f21070e;
                    bodd bodd3 = (bodd) da.f164949b;
                    int i11 = i10 - 1;
                    if (i10 != 0) {
                        bodd3.f132672k = i11;
                        int i12 = bodd3.f132662a | 1024;
                        bodd3.f132662a = i12;
                        int i13 = this.f21071f;
                        if (i13 != 0) {
                            bodd3.f132673l = i13 - 1;
                            bodd3.f132662a = i12 | 2048;
                        }
                        bxvd da2 = boct.f132600I.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        boct boct = (boct) da2.f164949b;
                        boct.f132612c = 3;
                        boct.f132610a |= 1;
                        bodd bodd4 = (bodd) da.mo74062i();
                        bodd4.getClass();
                        boct.f132615f = bodd4;
                        boct.f132610a |= 8;
                        boct boct2 = (boct) da2.mo74062i();
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            new qws(this.f21066a, "ANDROID_AUTH", null).mo24333a(boct2).mo24327b();
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public iir(Context context) {
        this.f21066a = context;
    }

    /* renamed from: a */
    public final void mo13047a(byte[] bArr) {
        long j;
        if (bArr.length != 0) {
            j = (long) (bArr[0] & 255);
            for (int i = 1; i < Math.min(bArr.length, 8); i++) {
                j |= (((long) bArr[i]) & 255) << (i * 8);
            }
        } else {
            j = 0;
        }
        this.f21072g = Long.valueOf(j);
    }
}
