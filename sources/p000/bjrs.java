package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: bjrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrs {

    /* renamed from: a */
    private static final SparseIntArray f123191a;

    /* renamed from: b */
    private static bxqw f123192b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f123191a = sparseIntArray;
        sparseIntArray.put(5, C0126R.C0127drawable.quantum_ic_arrow_back_vd_black_24);
        f123191a.put(4, C0126R.C0127drawable.quantum_ic_close_vd_black_24);
        f123191a.put(11, C0126R.C0127drawable.quantum_ic_radio_button_checked_black_24);
        f123191a.put(12, C0126R.C0127drawable.quantum_ic_radio_button_unchecked_black_24);
    }

    /* renamed from: a */
    public static int m104477a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            int i3 = f123191a.get(i2);
            bmxy.m108589a(i3 != 0, String.format(Locale.US, "EmbeddedReferenceId %d not found.", Integer.valueOf(i2)));
            return i3;
        }
        throw null;
    }

    /* renamed from: b */
    private static int m104483b(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: a */
    public static Bitmap m104478a(bwtd bwtd) {
        String str;
        if (bwtd.f160940a == 4) {
            str = (String) bwtd.f160941b;
        } else {
            str = "";
        }
        byte[] decode = Base64.decode(str, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        bmxy.m108582a(decodeByteArray, "Image should provide valid imageUri");
        return decodeByteArray;
    }

    /* renamed from: a */
    public static Drawable m104479a(Resources resources, bwtd bwtd) {
        return new BitmapDrawable(resources, m104478a(bwtd));
    }

    /* renamed from: a */
    private static synchronized bxqw m104480a() {
        bxqw bxqw;
        synchronized (bjrs.class) {
            if (f123192b == null) {
                f123192b = new bxqw();
            }
            bxqw = f123192b;
        }
        return bxqw;
    }

    /* renamed from: a */
    public static String m104481a(String str, bwtg bwtg) {
        Uri uri;
        try {
            Uri parse = Uri.parse(str);
            bxqw a = m104480a();
            bxra bxra = new bxra();
            if ((bwtg.f160956a & 2) != 0) {
                int b = m104483b(bwtg.f160958c);
                bxra.f164539a.mo73612a(bxqy.HEIGHT, Integer.valueOf(b));
                bxra.f164539a.mo73611a(bxqy.HEIGHT);
            }
            if ((bwtg.f160956a & 1) != 0) {
                int b2 = m104483b(bwtg.f160957b);
                bxra.f164539a.mo73612a(bxqy.WIDTH, Integer.valueOf(b2));
                bxra.f164539a.mo73611a(bxqy.WIDTH);
            }
            if ((bwtg.f160956a & 4) != 0) {
                boolean z = bwtg.f160959d;
                bxra.f164539a.mo73612a(bxqy.CIRCLE_CROP, Boolean.valueOf(z));
                bxra.f164539a.mo73611a(bxqy.CIRCLE_CROP);
            }
            uri = a.mo73609a(bxra, parse);
        } catch (ayul e) {
            uri = Uri.EMPTY;
        }
        return uri.toString();
    }

    /* renamed from: a */
    public static void m104482a(ImageView imageView, bwtd bwtd, ImageLoader imageLoader, bwtg bwtg) {
        boae boae;
        String str;
        int a;
        int b = bwtc.m122283b(bwtd.f160940a);
        int i = b - 1;
        if (b != 0) {
            if (i == 0) {
                if (bwtd.f160940a == 2) {
                    boae = (boae) bwtd.f160941b;
                } else {
                    boae = boae.f132446b;
                }
                ((NetworkImageView) imageView).setImageUrl(boaf.m110964a(boae).f132445a, imageLoader);
            } else if (i == 2) {
                imageView.setImageBitmap(m104478a(bwtd));
            } else if (i != 3) {
                int i2 = 1;
                if (i == 4) {
                    if (bwtd.f160940a == 6 && (a = bwtb.m122281a(((Integer) bwtd.f160941b).intValue())) != 0) {
                        i2 = a;
                    }
                    imageView.setImageResource(m104477a(i2));
                } else {
                    throw new IllegalStateException(String.format("Unsupported source type %s", bwtc.m122282a(bwtc.m122283b(bwtd.f160940a))));
                }
            } else {
                if (bwtd.f160940a == 5) {
                    str = (String) bwtd.f160941b;
                } else {
                    str = "";
                }
                ((NetworkImageView) imageView).setImageUrl(m104481a(str, bwtg), imageLoader);
            }
            imageView.setContentDescription(bwtd.f160942c);
            return;
        }
        throw null;
    }
}
