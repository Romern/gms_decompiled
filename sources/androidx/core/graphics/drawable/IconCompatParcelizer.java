package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.support.p001v4.graphics.drawable.IconCompat;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IconCompatParcelizer {
    public static IconCompat read(avb avb) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1030a = avb.mo2686b(iconCompat.f1030a, 1);
        byte[] bArr = iconCompat.f1032c;
        if (avb.mo2692b(2)) {
            bArr = avb.mo2701h();
        }
        iconCompat.f1032c = bArr;
        iconCompat.f1033d = avb.mo2687b(iconCompat.f1033d, 3);
        iconCompat.f1034e = avb.mo2686b(iconCompat.f1034e, 4);
        iconCompat.f1035f = avb.mo2686b(iconCompat.f1035f, 5);
        iconCompat.f1036g = (ColorStateList) avb.mo2687b(iconCompat.f1036g, 6);
        iconCompat.f1038j = avb.mo2690b(iconCompat.f1038j, 7);
        iconCompat.f1037i = PorterDuff.Mode.valueOf(iconCompat.f1038j);
        switch (iconCompat.f1030a) {
            case -1:
                Parcelable parcelable = iconCompat.f1033d;
                if (parcelable != null) {
                    iconCompat.f1031b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1033d;
                if (parcelable2 != null) {
                    iconCompat.f1031b = parcelable2;
                    break;
                } else {
                    byte[] bArr2 = iconCompat.f1032c;
                    iconCompat.f1031b = bArr2;
                    iconCompat.f1030a = 3;
                    iconCompat.f1034e = 0;
                    iconCompat.f1035f = bArr2.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                iconCompat.f1031b = new String(iconCompat.f1032c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1031b = iconCompat.f1032c;
                break;
        }
        return iconCompat;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      avb.a(int, int):void
      avb.a(android.os.Parcelable, int):void
      avb.a(avg, int):void
      avb.a(java.lang.CharSequence, int):void
      avb.a(java.lang.String, int):void
      avb.a(boolean, int):void
      avb.a(java.lang.Object[], int):void
      avb.a(boolean, boolean):void */
    public static void write(IconCompat iconCompat, avb avb) {
        avb.mo2682a(true, true);
        boolean a = avb.mo2685a();
        iconCompat.f1038j = iconCompat.f1037i.name();
        switch (iconCompat.f1030a) {
            case -1:
                if (!a) {
                    iconCompat.f1033d = (Parcelable) iconCompat.f1031b;
                    break;
                } else {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
            case 1:
            case 5:
                if (!a) {
                    iconCompat.f1033d = (Parcelable) iconCompat.f1031b;
                    break;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) iconCompat.f1031b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.f1032c = byteArrayOutputStream.toByteArray();
                    break;
                }
            case 2:
                iconCompat.f1032c = ((String) iconCompat.f1031b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1032c = (byte[]) iconCompat.f1031b;
                break;
            case 4:
            case 6:
                iconCompat.f1032c = iconCompat.f1031b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1030a;
        if (i != -1) {
            avb.mo2669a(i, 1);
        }
        byte[] bArr = iconCompat.f1032c;
        if (bArr != null) {
            avb.mo2696c(2);
            avb.mo2683a(bArr);
        }
        Parcelable parcelable = iconCompat.f1033d;
        if (parcelable != null) {
            avb.mo2673a(parcelable, 3);
        }
        int i2 = iconCompat.f1034e;
        if (i2 != 0) {
            avb.mo2669a(i2, 4);
        }
        int i3 = iconCompat.f1035f;
        if (i3 != 0) {
            avb.mo2669a(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1036g;
        if (colorStateList != null) {
            avb.mo2673a(colorStateList, 6);
        }
        String str = iconCompat.f1038j;
        if (str != null) {
            avb.mo2679a(str, 7);
        }
    }
}
