package android.support.p001v4.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.felicanetworks.mfc.C0126R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final PorterDuff.Mode f1029h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1030a = -1;

    /* renamed from: b */
    public Object f1031b;

    /* renamed from: c */
    public byte[] f1032c = null;

    /* renamed from: d */
    public Parcelable f1033d = null;

    /* renamed from: e */
    public int f1034e = 0;

    /* renamed from: f */
    public int f1035f = 0;

    /* renamed from: g */
    public ColorStateList f1036g = null;

    /* renamed from: i */
    public PorterDuff.Mode f1037i = f1029h;

    /* renamed from: j */
    public String f1038j = null;

    public IconCompat() {
    }

    /* renamed from: a */
    private static int m1172a(Icon icon) {
        int i = Build.VERSION.SDK_INT;
        return icon.getType();
    }

    /* renamed from: b */
    public static IconCompat m1178b(Context context) {
        if (context != null) {
            return m1175a(context.getResources(), context.getPackageName(), C0126R.C0127drawable.quantum_ic_link_grey600_24);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: c */
    private static int m1180c(Icon icon) {
        int i = Build.VERSION.SDK_INT;
        return icon.getResId();
    }

    /* renamed from: d */
    private static Uri m1181d(Icon icon) {
        int i = Build.VERSION.SDK_INT;
        return icon.getUri();
    }

    @Deprecated
    /* renamed from: e */
    public final Icon mo1113e() {
        return mo1108a((Context) null);
    }

    public final String toString() {
        String str;
        if (this.f1030a == -1) {
            return String.valueOf(this.f1031b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1030a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1030a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1031b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1031b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(mo1110b());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(mo1111c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1034e);
                if (this.f1035f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1035f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1031b);
                break;
        }
        if (this.f1036g != null) {
            sb.append(" tint=");
            sb.append(this.f1036g);
        }
        if (this.f1037i != f1029h) {
            sb.append(" mode=");
            sb.append(this.f1037i);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i) {
        this.f1030a = i;
    }

    /* renamed from: a */
    public static Resources m1173a(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* renamed from: c */
    public final int mo1111c() {
        int i = this.f1030a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            return m1180c((Icon) this.f1031b);
        } else if (i == 2) {
            return this.f1034e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    /* renamed from: d */
    public final Uri mo1112d() {
        int i = this.f1030a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            return m1181d((Icon) this.f1031b);
        } else if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1031b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    /* renamed from: b */
    private static String m1179b(Icon icon) {
        int i = Build.VERSION.SDK_INT;
        return icon.getResPackage();
    }

    /* renamed from: b */
    public final String mo1110b() {
        int i = this.f1030a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            return m1179b((Icon) this.f1031b);
        } else if (i == 2) {
            return ((String) this.f1031b).split(":", -1)[0];
        } else {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
    }

    /* renamed from: a */
    public static IconCompat m1174a(Context context, Icon icon) {
        C1244oj.m19766a(icon);
        int a = m1172a(icon);
        if (a == 2) {
            String b = m1179b(icon);
            try {
                return m1175a(m1173a(context, b), b, m1180c(icon));
            } catch (Resources.NotFoundException e) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (a == 4) {
            Uri d = m1181d(icon);
            if (d != null) {
                String uri = d.toString();
                if (uri != null) {
                    IconCompat iconCompat = new IconCompat(4);
                    iconCompat.f1031b = uri;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Uri must not be null.");
            }
            throw new IllegalArgumentException("Uri must not be null.");
        } else if (a != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f1031b = icon;
            return iconCompat2;
        } else {
            Uri d2 = m1181d(icon);
            if (d2 != null) {
                String uri2 = d2.toString();
                if (uri2 != null) {
                    IconCompat iconCompat3 = new IconCompat(6);
                    iconCompat3.f1031b = uri2;
                    return iconCompat3;
                }
                throw new IllegalArgumentException("Uri must not be null.");
            }
            throw new IllegalArgumentException("Uri must not be null.");
        }
    }

    /* renamed from: a */
    public static IconCompat m1175a(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1034e = i;
            if (resources != null) {
                try {
                    iconCompat.f1031b = resources.getResourceName(i);
                } catch (Resources.NotFoundException e) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1031b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: a */
    public static IconCompat m1176a(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f1031b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    /* renamed from: a */
    public static IconCompat m1177a(byte[] bArr, int i) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.f1031b = bArr;
            iconCompat.f1034e = 0;
            iconCompat.f1035f = i;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    /* renamed from: a */
    public final int mo1107a() {
        int i = this.f1030a;
        if (i != -1) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        return m1172a((Icon) this.f1031b);
    }

    /* renamed from: a */
    public final Icon mo1108a(Context context) {
        Icon icon;
        switch (this.f1030a) {
            case -1:
                return (Icon) this.f1031b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f1031b);
                break;
            case 2:
                icon = Icon.createWithResource(mo1110b(), this.f1034e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f1031b, this.f1034e, this.f1035f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f1031b);
                break;
            case 5:
                int i = Build.VERSION.SDK_INT;
                icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f1031b);
                break;
            case 6:
                if (context != null) {
                    Uri d = mo1112d();
                    String scheme = d.getScheme();
                    InputStream inputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStream = context.getContentResolver().openInputStream(d);
                        } catch (Exception e) {
                            Log.w("IconCompat", "Unable to load image from URI: " + d, e);
                        }
                    } else {
                        try {
                            inputStream = new FileInputStream(new File((String) this.f1031b));
                        } catch (FileNotFoundException e2) {
                            Log.w("IconCompat", "Unable to load image from path: " + d, e2);
                        }
                    }
                    if (inputStream != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStream));
                        break;
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + mo1112d());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + mo1112d());
                }
                break;
        }
        ColorStateList colorStateList = this.f1036g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1037i;
        if (mode != f1029h) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    /* renamed from: a */
    public final void mo1109a(int i) {
        this.f1036g = ColorStateList.valueOf(i);
    }
}
