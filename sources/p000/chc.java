package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: chc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chc implements cgt {

    /* renamed from: a */
    private static final Bitmap.Config f6844a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final chd f6845b;

    /* renamed from: c */
    private final Set f6846c;

    /* renamed from: d */
    private final long f6847d;

    /* renamed from: e */
    private long f6848e;

    /* renamed from: f */
    private int f6849f;

    /* renamed from: g */
    private int f6850g;

    /* renamed from: h */
    private int f6851h;

    /* renamed from: i */
    private int f6852i;

    /* renamed from: a */
    private final synchronized void m4259a(long j) {
        while (true) {
            if (this.f6848e <= j) {
                break;
            }
            chd chd = this.f6845b;
            Bitmap bitmap = (Bitmap) ((chi) chd).f6863g.mo3885a();
            if (bitmap != null) {
                ((chi) chd).mo3900a(Integer.valueOf(crd.m7389a(bitmap)), bitmap);
            }
            if (bitmap != null) {
                this.f6848e -= (long) crd.m7389a(bitmap);
                this.f6852i++;
                bitmap.recycle();
            } else {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    int i = this.f6849f;
                    int i2 = this.f6850g;
                    int i3 = this.f6851h;
                    int i4 = this.f6852i;
                    long j2 = this.f6848e;
                    long j3 = this.f6847d;
                    String valueOf = String.valueOf(this.f6845b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + MfiClientException.TYPE_MFICLIENT_NOT_FOUND);
                    sb.append("Hits=");
                    sb.append(i);
                    sb.append(", misses=");
                    sb.append(i2);
                    sb.append(", puts=");
                    sb.append(i3);
                    sb.append(", evictions=");
                    sb.append(i4);
                    sb.append(", currentSize=");
                    sb.append(j2);
                    sb.append(", maxSize=");
                    sb.append(j3);
                    sb.append("\nStrategy=");
                    sb.append(valueOf);
                    sb.toString();
                }
                this.f6848e = 0;
            }
        }
    }

    /* renamed from: c */
    private static Bitmap m4260c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f6844a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: d */
    private final synchronized Bitmap m4261d(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        int i3 = Build.VERSION.SDK_INT;
        if (config != Bitmap.Config.HARDWARE) {
            chd chd = this.f6845b;
            if (config == null) {
                config = f6844a;
            }
            int a = crd.m7388a(i, i2, config);
            chg a2 = ((chi) chd).f6862f.mo3898a(a, config);
            int i4 = Build.VERSION.SDK_INT;
            int i5 = 0;
            if (!Bitmap.Config.RGBA_F16.equals(config)) {
                int i6 = chf.f6853a[config.ordinal()];
                if (i6 == 1) {
                    configArr = chi.f6857a;
                } else if (i6 == 2) {
                    configArr = chi.f6859c;
                } else if (i6 != 3) {
                    configArr = i6 != 4 ? new Bitmap.Config[]{config} : chi.f6861e;
                } else {
                    configArr = chi.f6860d;
                }
            } else {
                configArr = chi.f6858b;
            }
            int length = configArr.length;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                Bitmap.Config config2 = configArr[i5];
                Integer num = (Integer) ((chi) chd).mo3899a(config2).ceilingKey(Integer.valueOf(a));
                if (num != null) {
                    if (num.intValue() <= a * 8) {
                        if (num.intValue() == a) {
                            if (config2 != null) {
                                if (config2.equals(config)) {
                                }
                            } else if (config == null) {
                            }
                        }
                        ((chi) chd).f6862f.mo3876a(a2);
                        a2 = ((chi) chd).f6862f.mo3898a(num.intValue(), config2);
                    }
                }
                i5++;
            }
            bitmap = (Bitmap) ((chi) chd).f6863g.mo3886a(a2);
            if (bitmap != null) {
                ((chi) chd).mo3900a(Integer.valueOf(a2.f6854a), bitmap);
                bitmap.reconfigure(i, i2, config);
            }
            if (bitmap != null) {
                this.f6849f++;
                this.f6848e -= (long) crd.m7389a(bitmap);
                bitmap.setHasAlpha(true);
                int i7 = Build.VERSION.SDK_INT;
                bitmap.setPremultiplied(true);
            } else {
                this.f6850g++;
            }
        } else {
            String valueOf = String.valueOf(config);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER);
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(valueOf);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        return bitmap;
    }

    /* renamed from: b */
    public final Bitmap mo3882b(int i, int i2, Bitmap.Config config) {
        Bitmap d = m4261d(i, i2, config);
        return d == null ? m4260c(i, i2, config) : d;
    }

    public chc(long j) {
        int i = Build.VERSION.SDK_INT;
        chi chi = new chi();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        int i3 = Build.VERSION.SDK_INT;
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f6847d = j;
        this.f6845b = chi;
        this.f6846c = unmodifiableSet;
    }

    /* renamed from: a */
    public final Bitmap mo3878a(int i, int i2, Bitmap.Config config) {
        Bitmap d = m4261d(i, i2, config);
        if (d == null) {
            return m4260c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: a */
    public final void mo3879a() {
        m4259a(0L);
    }

    /* renamed from: a */
    public final void mo3880a(int i) {
        if (i < 40) {
            int i2 = Build.VERSION.SDK_INT;
            if (i < 20) {
                if (i == 15) {
                    m4259a(this.f6847d >> 1);
                    return;
                }
                return;
            }
        }
        mo3879a();
    }

    /* renamed from: a */
    public final synchronized void mo3881a(Bitmap bitmap) {
        int i;
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) crd.m7389a(bitmap)) <= this.f6847d) {
                        if (this.f6846c.contains(bitmap.getConfig())) {
                            int a = crd.m7389a(bitmap);
                            chd chd = this.f6845b;
                            chg a2 = ((chi) chd).f6862f.mo3898a(crd.m7389a(bitmap), bitmap.getConfig());
                            ((chi) chd).f6863g.mo3887a(a2, bitmap);
                            NavigableMap a3 = ((chi) chd).mo3899a(bitmap.getConfig());
                            Integer num = (Integer) a3.get(Integer.valueOf(a2.f6854a));
                            Integer valueOf = Integer.valueOf(a2.f6854a);
                            if (num != null) {
                                i = num.intValue() + 1;
                            } else {
                                i = 1;
                            }
                            a3.put(valueOf, Integer.valueOf(i));
                            this.f6851h++;
                            this.f6848e += (long) a;
                            m4259a(this.f6847d);
                            return;
                        }
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }
}
